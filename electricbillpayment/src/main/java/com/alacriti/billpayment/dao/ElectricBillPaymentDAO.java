
package com.alacriti.billpayment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.alacriti.billpayment.vo.BatchHeaderVo;
import com.alacriti.billpayment.vo.BatchTrailerVO;
import com.alacriti.billpayment.vo.BillPaymentsVo;
import com.alacriti.billpayment.vo.FileGenerationVo;
import com.alacriti.billpayment.vo.FileHeaderVo;
import com.alacriti.billpayment.vo.FileTrailerVo;

@Component
public class ElectricBillPaymentDAO {
	private static final Logger log = Logger.getLogger(ElectricBillPaymentDAO.class.getName());

	Connection connection;
	PreparedStatement pstmt;
	FileHeaderVo fileHeader;
	BatchHeaderVo batchHeader;
	BillPaymentsVo billPaymentsVo;
	FileGenerationVo fileName;

	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	String timestamp = dateFormat.format(now);

		public List<FileGenerationVo> getFileName(Connection connection,String fileType) throws SQLException {
		log.info("Method: getFileName()");
		List<FileGenerationVo> fileNameList = new ArrayList<>();
		String query = "select file_prefix,format,file_suffix,file_path from file_tbl where filetype_id = ?;";
		try (PreparedStatement pstmt = connection.prepareStatement(query)) {
			pstmt.setString(1, fileType);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					fileName = new FileGenerationVo();
					fileName.setFilePrefix(rs.getString(1));
					fileName.setFileFormat(rs.getString(2));
					fileName.setFileSuffix(rs.getString(3));
					fileName.setFilePath(rs.getString(4));
					fileNameList.add(fileName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fileNameList;
	}

	public List<FileHeaderVo> getFileHeadderDetails(Connection connection,String fileTypeid) throws SQLException {
		log.info("Method: getFileHeadderDetails()");
		List<FileHeaderVo> fileheaderList = new ArrayList<>();
		String query = "select e.company_key,e.company_name,f.file_id from electricity_company_details_tbl e,file_tbl f where f.filetype_id=?;";
		log.info("sql cmd:"+query);
		
		try (PreparedStatement pstmt = connection.prepareStatement(query)) {
			pstmt.setString(1, fileTypeid);
			try(ResultSet rs = pstmt.executeQuery()){
			
			while (rs.next()) {
				fileHeader = new FileHeaderVo();
				fileHeader.setCompanyKey(rs.getString(1));
				fileHeader.setCompanyName(rs.getString(2));
				fileHeader.setFileid(rs.getString(3));
				fileHeader.setTimeStamp(timestamp);
				fileheaderList.add(fileHeader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fileheaderList;
		}
	}

	public List<BatchHeaderVo> getBatchHeadderDetails(Connection connection) {
		log.info("Method: getBatchHeadderDetails()");
		List<BatchHeaderVo> batchHeaderList = new ArrayList<>();
		String query = "select state_code from state_tbl";
		try (PreparedStatement pstmt = connection.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				batchHeader = new BatchHeaderVo();
				batchHeader.setStateCode(rs.getString(1));
				batchHeaderList.add(batchHeader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return batchHeaderList;
	}

	public List<BillPaymentsVo> getBillPaymentDetails(String stateCode, Connection connection) throws SQLException {
		log.info("Method: getBillPaymentDetails()");
		List<BillPaymentsVo> billPaymentsList = new ArrayList<>();
		String query = "select bp.service_id,bp.electricity_consumption_unit,st.unit_price,bp.past_due_amount,\n"
				+ "bp.paid_amount,bp.due_date,bp.bill_payment_date,total_bill_amount,bp.state_code,bp.payment_method,\n"
				+ "bp.card_number,bp.account_number,bp.routing_number,bp.transaction_id\n"
				+ " from bill_payments_tbl bp,state_tbl st where bp.state_code=st.state_code and bp.state_code=?;";
		try (PreparedStatement pstmt = connection.prepareStatement(query)) {
			pstmt.setString(1, stateCode);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					billPaymentsVo = new BillPaymentsVo();
					billPaymentsVo.setServiceID(rs.getString(1));
					billPaymentsVo.setConsumptionUnit(rs.getLong(2));
					billPaymentsVo.setUnitPrice(rs.getLong(3));
					billPaymentsVo.setPastDueAmount(rs.getLong(4));
					billPaymentsVo.setPaidAmount(rs.getLong(5));
					billPaymentsVo.setDueDate(rs.getString(6));
					billPaymentsVo.setBillPaymentDate(rs.getString(7));
					billPaymentsVo.setTotalBillAmount(rs.getLong(8));
					billPaymentsVo.setStateCode(rs.getString(9));
					billPaymentsVo.setPaymentMethod(rs.getString(10));
					billPaymentsVo.setCardNumber(rs.getLong(11));
					billPaymentsVo.setAccountNumber(rs.getLong(12));
					billPaymentsVo.setRoutingNumber(rs.getLong(13));
					billPaymentsVo.setTransactionID(rs.getLong(14));
					billPaymentsList.add(billPaymentsVo);
				}
				if (billPaymentsList.isEmpty()) {
					System.out.println("No Student data found");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return billPaymentsList;
		}
	}

	public BatchTrailerVO getBatchTrailerDetails(String stateCode, Connection connection) throws SQLException {
		log.info("Method: getBatchTrailerDetails()");
		BatchTrailerVO batch = null;
		String query = "select count(*),sum(paid_amount) from bill_payments_tbl where state_code=?;";
		try (PreparedStatement pstmt = connection.prepareStatement(query)) {
			pstmt.setString(1, stateCode);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					batch = new BatchTrailerVO();
					batch.setTotalNoOfDetailRecords(rs.getLong(1));
					batch.setTotalValueOfPaidAmount(rs.getLong(2));
					System.out.println("asdadaedwedewdfwefwef" + batch);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return batch;
	}

	public FileTrailerVo getFileTrailerDetails(Connection connection) throws SQLException {
		log.info("Method: getFileTrailerDetails()");
		FileTrailerVo fileTrailer = null;
		String query = "select count(distinct(state_code)),count(*),sum(total_bill_amount) from bill_payments_tbl;";
		try (PreparedStatement pstmt = connection.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				fileTrailer = new FileTrailerVo();
				fileTrailer.setBatchCount(rs.getLong(1));
				fileTrailer.setTotalDetailedRecords(rs.getLong(2));
				fileTrailer.setTotalBillAmount(rs.getLong(3));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileTrailer;

	}

}