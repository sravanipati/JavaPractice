package com.alacriti.paymentgateway.simulator.model;

public class MerchantPaymentRequest {
	private String paymentId;
	private Payment payment;

	public MerchantPaymentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MerchantPaymentRequest(String paymentId, Payment payment) {
		super();
		this.paymentId = paymentId;
		this.payment = payment;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "PaymentRequest [paymentId=" + paymentId + ", payment=" + payment + "]";
	}

}
