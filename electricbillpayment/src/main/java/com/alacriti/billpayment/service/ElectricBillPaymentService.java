package com.alacriti.billpayment.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alacriti.billpayment.dao.ElectricBillPaymentDao;
import com.alacriti.billpayment.vo.BatchHeaderVo;
import com.alacriti.billpayment.vo.BatchTrailerVO;
import com.alacriti.billpayment.vo.BillPaymentsVo;
import com.alacriti.billpayment.vo.FileGenerationVo;
import com.alacriti.billpayment.vo.FileHeaderVo;
import com.alacriti.billpayment.vo.FileTrailerVo;

@Service
public class ElectricBillPaymentService {
	private static final Logger log = Logger.getLogger(ElectricBillPaymentService.class.getName());

	private static final String FILE_HEDER_RECORD_TYPE = "00";
	private static final String BATCH_HEDER_RECORD_TYPE = "10";
	private static final String DETAILED_RECORD_TYPE = "20";
	private static final String BATCH_TRAILER_RECORD_TYPE = "80";
	private static final String FILE_TRAILER_RECORD_TYPE = "90";

	protected File file;
	private String fileName;
	public BufferedWriter writer;
	private String formatedData;

	@Autowired
	private ElectricBillPaymentDao electricBillPaymentDao;

	@Autowired
	private DataSource dataSource;

	Connection connection;

	private List<FileGenerationVo> fileNameList;
	private List<FileHeaderVo> fileHeaderList;
	private List<BatchHeaderVo> batchHeaderList;
	private List<BillPaymentsVo> billPaymentsList;
	private BatchTrailerVO batchTrailerVO;
	private FileTrailerVo fileTrailerVo;

	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	String timestamp = dateFormat.format(now);

	public void createFixedLengthFile() throws SQLException, IOException {

		log.info("Method: createFixedLengthFile()");

		// Initializing the dao
		initDAO();

		// create file
		createFile();

		// get fileheaderData
		getFileHeaderData();

		// get batchHedeData
		getBatchHeaderData();

		// inItialize writter
		initWriter();

		// write data into file
		writeDataIntoFile(fileHeaderList, batchHeaderList, fileName);

	}

	private void initDAO() throws SQLException {
		log.info("Method: initDAO()");

		connection = dataSource.getConnection();
	}

	private void createFile() {

		try {
			log.info("Method: createFile()");

			fileNameList = electricBillPaymentDao.getFileName(connection);

			for (FileGenerationVo fileGen : fileNameList) {
				fileName = fileGen.getFilePrefix() + fileGen.getFileFormat() + timestamp + fileGen.getFileSuffix();
				file = new File(fileGen.getFilePath(), fileName);
			}
			log.info("file name -> " + fileName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getFileHeaderData() {
		log.info("Method: getFileHeaderData()");
		fileHeaderList = electricBillPaymentDao.getFileHeadderDetails(connection);

	}

	private void getBatchHeaderData() {
		log.info("Method: getBatchHeaderData()");
		batchHeaderList = electricBillPaymentDao.getBatchHeadderDetails(connection);

	}

	private void initWriter() {
		log.info("Method: initWriter()");
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void writeDataIntoFile(List<FileHeaderVo> fileHeaderList, List<BatchHeaderVo> batchHeaderList,
			String fileName) throws IOException, SQLException {
		log.info("Method: writeDataIntoFile()");
		writeFileHeader();
		writeBatchHeader();

	}

	private void writeFileHeader() throws IOException {
		log.info("Method: writeFileHeader()");
		try {
			for (FileHeaderVo fileHeader : fileHeaderList) {
				writer.write(formateFileHeader(fileHeader));
				writer.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void writeBatchHeader() throws IOException, SQLException {
		log.info("Method: writeBatchHeader()");
		try {
			for (BatchHeaderVo batchHeader : batchHeaderList) {

				writer.write(formateBatchHeader(batchHeader));
				writer.newLine();
				writeDetailRecord(batchHeader);
			}
			writeFileTrailer();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}

	}

	private void writeDetailRecord(BatchHeaderVo batchHeader) throws IOException {
		log.info("Method: writeDetailRecord()");
		try {
			billPaymentsList = electricBillPaymentDao.getBillPaymentDetails(batchHeader.getStateCode(), connection);
			for (BillPaymentsVo billPayment : billPaymentsList) {
				writer.write(formateDetaileRecord(billPayment));
				writer.newLine();
			}
			writeBatchTrailer(batchHeader);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void writeBatchTrailer(BatchHeaderVo batchHeader) throws IOException {
		log.info("Method: writeBatchTrailer()");
		try {

			batchTrailerVO = electricBillPaymentDao.getBatchTrailerDetails(batchHeader.getStateCode(), connection);
			writer.write(formateBatchTrailer(batchTrailerVO));
			writer.newLine();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void writeFileTrailer() throws SQLException, IOException {
		log.info("Method: writeFileTrailer()");
		fileTrailerVo = electricBillPaymentDao.getFileTrailerDetails(connection);
		writer.write(formateFileTrailer(fileTrailerVo));
		writer.newLine();

	}

	private String formateFileHeader(FileHeaderVo fileHeaderVo) {
		log.info("Method: formateFileHeader()");
		formatedData = FILE_HEDER_RECORD_TYPE + padRight(fileHeaderVo.getCompanyKey(), 16)
				+ padRight(fileHeaderVo.getCompanyName(), 32) + padRight(fileHeaderVo.getFileid(), 32)
				+ padRight(fileHeaderVo.getTimeStamp(), 16);
		return formatedData;
	}

	private String formateBatchHeader(BatchHeaderVo batchHeader) {
		log.info("Method: formateBatchHeader()");
		formatedData = BATCH_HEDER_RECORD_TYPE + padRight(batchHeader.getStateCode(), 2);
		return formatedData;
	}

	private String formateDetaileRecord(BillPaymentsVo billPayment) {
		log.info("Method: formateDetaileRecord()");
		formatedData = DETAILED_RECORD_TYPE + padRight(billPayment.getServiceID(), 16)
				+ ConvertLongToString(billPayment.getConsumptionUnit(), 8)
				+ ConvertLongToString(billPayment.getUnitPrice(), 4)
				+ ConvertLongToString(billPayment.getPastDueAmount(), 16)
				+ ConvertLongToString(billPayment.getPaidAmount(), 16)
				+ padRight(LocaleDateFormater(billPayment.getDueDate()), 16)
				+ padRight(LocalDateTime(billPayment.getBillPaymentDate()), 16)
				+ ConvertLongToString(billPayment.getTotalBillAmount(), 16) + padRight(billPayment.getStateCode(), 2)
				+ padRight(billPayment.getPaymentMethod(), 8) + ConvertLongToString(billPayment.getCardNumber(), 16)
				+ ConvertLongToString(billPayment.getAccountNumber(), 16)
				+ ConvertLongToString(billPayment.getRoutingNumber(), 16)
				+ ConvertLongToString(billPayment.getTransactionID(), 16);

		return formatedData;
	}

	private String formateBatchTrailer(BatchTrailerVO batchTrailerVO) {
		log.info("Method: formateBatchTrailer()");
		formatedData = BATCH_TRAILER_RECORD_TYPE + ConvertLongToString(batchTrailerVO.getTotalNoOfDetailRecords(), 8)
				+ ConvertLongToString(batchTrailerVO.getTotalValueOfPaidAmount(), 24);
		return formatedData;
	}

	private String formateFileTrailer(FileTrailerVo fileTrailerVo) {
		log.info("Method: formateFileTrailer()");
		formatedData = FILE_TRAILER_RECORD_TYPE + ConvertLongToString(fileTrailerVo.getBatchCount(), 8)
				+ ConvertLongToString(fileTrailerVo.getTotalDetailedRecords(), 8)
				+ ConvertLongToString(fileTrailerVo.getTotalBillAmount(), 24);
		return formatedData;
	}

	public static String padRight(String s, int length) {
		log.info("Method: padRight()");
		return String.format("%-" + length + "s", s);
	}

	public static String ConvertLongToString(long longValue, int length) {
		log.info("Method: ConvertLongToString()");
		String stringValue = String.valueOf(longValue);
		return String.format("%0" + length + "d", Long.parseLong(stringValue));
	}

	public static String LocaleDateFormater(String inputDateStr) {
		log.info("Method: LocaleDateFormater()");
		LocalDate date = LocalDate.parse(inputDateStr);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formattedDate = date.format(formatter);

		return formattedDate;

	}

	public static String LocalDateTime(String inputDateTimeStr) {
		log.info("Method: LocalDateTime()");
		LocalDateTime dateTime = LocalDateTime.parse(inputDateTimeStr,
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String formattedDateTime = dateTime.format(formatter);
		return formattedDateTime;
	}

}