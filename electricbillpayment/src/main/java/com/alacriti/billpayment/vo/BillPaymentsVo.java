package com.alacriti.billpayment.vo;

public class BillPaymentsVo {
	private String serviceID;
	private Long consumptionUnit;
	private Long unitPrice;
	private Long pastDueAmount;
	private Long paidAmount;
	private String dueDate;
	private String billPaymentDate;
	private Long totalBillAmount;
	private String stateCode;
	private String paymentMethod;
	private Long cardNumber;
	private Long accountNumber;
	private Long routingNumber;
	private Long transactionID;
	
	public BillPaymentsVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public Long getConsumptionUnit() {
		return consumptionUnit;
	}

	public void setConsumptionUnit(Long consumptionUnit) {
		this.consumptionUnit = consumptionUnit;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Long getPastDueAmount() {
		return pastDueAmount;
	}

	public void setPastDueAmount(Long pastDueAmount) {
		this.pastDueAmount = pastDueAmount;
	}

	public Long getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Long paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getBillPaymentDate() {
		return billPaymentDate;
	}

	public void setBillPaymentDate(String billPaymentDate) {
		this.billPaymentDate = billPaymentDate;
	}

	public Long getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(Long totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(Long routingNumber) {
		this.routingNumber = routingNumber;
	}

	public Long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Long transactionID) {
		this.transactionID = transactionID;
	}

	@Override
	public String toString() {
		return "BillPaymentsVo [serviceID=" + serviceID + ", consumptionUnit=" + consumptionUnit + ", unitPrice="
				+ unitPrice + ", pastDueAmount=" + pastDueAmount + ", paidAmount=" + paidAmount + ", dueDate=" + dueDate
				+ ", billPaymentDate=" + billPaymentDate + ", stateCode=" + stateCode + ", paymentMethod="
				+ paymentMethod + ", routingNumber=" + routingNumber + ", transactionID=" + transactionID + "]";
	}
	
	
	
	
	
	
}