package com.alacriti.billpayment.vo;

public class BatchHeaderVo {
	private String stateCode;

	public BatchHeaderVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "BatchHeaderVo [stateCode=" + stateCode + "]";
	}

}
