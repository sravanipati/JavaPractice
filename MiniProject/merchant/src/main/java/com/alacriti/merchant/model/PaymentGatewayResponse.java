package com.alacriti.merchant.model;

public class PaymentGatewayResponse {
	private String paymentId;
	private String paymentStatus;

	public PaymentGatewayResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentGatewayResponse(String paymentId, String paymentStatus) {
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
