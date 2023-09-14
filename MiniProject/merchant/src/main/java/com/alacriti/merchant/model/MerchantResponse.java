package com.alacriti.merchant.model;

public class MerchantResponse {
	private boolean success;
	private String message;
	public MerchantResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MerchantResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MerchantResponse [success=" + success + ", message=" + message + "]";
	}
	
	

}
