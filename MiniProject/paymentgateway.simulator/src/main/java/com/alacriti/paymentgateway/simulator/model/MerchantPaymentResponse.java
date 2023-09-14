package com.alacriti.paymentgateway.simulator.model;

public class MerchantPaymentResponse {
	private String paymentId;
	private String paymentStatus;

	public MerchantPaymentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MerchantPaymentResponse(String paymentId, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
