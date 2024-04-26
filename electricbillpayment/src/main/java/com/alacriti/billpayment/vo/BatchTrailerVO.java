package com.alacriti.billpayment.vo;

public class BatchTrailerVO {
	
	private Long totalNoOfDetailRecords;
	private Long totalValueOfPaidAmount;
	private String stateCOde;
	
	public BatchTrailerVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Long getTotalNoOfDetailRecords() {
		return totalNoOfDetailRecords;
	}



	public void setTotalNoOfDetailRecords(Long totalNoOfDetailRecords) {
		this.totalNoOfDetailRecords = totalNoOfDetailRecords;
	}



	public Long getTotalValueOfPaidAmount() {
		return totalValueOfPaidAmount;
	}



	public void setTotalValueOfPaidAmount(Long totalValueOfPaidAmount) {
		this.totalValueOfPaidAmount = totalValueOfPaidAmount;
	}



	public String getStateCOde() {
		return stateCOde;
	}



	public void setStateCOde(String stateCOde) {
		this.stateCOde = stateCOde;
	}



	@Override
	public String toString() {
		return "BatchTrailerVO [totalNoOfDetailRecords=" + totalNoOfDetailRecords + ", totalValueOfPaidAmount="
				+ totalValueOfPaidAmount + ", stateCOde=" + stateCOde + "]";
	}

	
	
	
	
}
