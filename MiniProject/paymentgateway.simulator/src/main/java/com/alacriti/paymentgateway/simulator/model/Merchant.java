package com.alacriti.paymentgateway.simulator.model;

public class Merchant {
	private String merchantId;
	private String name;
	private String email;
	private String bussinessType;
	private String address;
	private String phone;

	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Merchant(String merchantId, String name, String email, String bussinessType, String address, String phone) {
		super();
		this.merchantId = merchantId;
		this.name = name;
		this.email = email;
		this.bussinessType = bussinessType;
		this.address = address;
		this.phone = phone;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBussinessType() {
		return bussinessType;
	}

	public void setBussinessType(String bussinessType) {
		this.bussinessType = bussinessType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
