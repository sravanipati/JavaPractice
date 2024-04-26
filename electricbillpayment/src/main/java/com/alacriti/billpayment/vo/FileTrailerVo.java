package com.alacriti.billpayment.vo;

public class FileTrailerVo {
	private Long totalDetailedRecords;
	private Long totalBillAmount;

	private Long batchCount;

	public FileTrailerVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getTotalDetailedRecords() {
		return totalDetailedRecords;
	}

	public void setTotalDetailedRecords(Long totalDetailedRecords) {
		this.totalDetailedRecords = totalDetailedRecords;
	}

	public Long getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(Long totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public Long getBatchCount() {
		return batchCount;
	}

	public void setBatchCount(Long batchCount) {
		this.batchCount = batchCount;
	}

	@Override
	public String toString() {
		return "FileTrailerVo [totalDetailedRecords=" + totalDetailedRecords + ", totalBillAmount=" + totalBillAmount
				+ ", batchCount=" + batchCount + "]";
	}

}
