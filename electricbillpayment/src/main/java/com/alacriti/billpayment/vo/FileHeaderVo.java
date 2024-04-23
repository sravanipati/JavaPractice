package com.alacriti.billpayment.vo;

public class FileHeaderVo {
	private String companyKey;
	private String companyName;
	private String Fileid;
	private String timeStamp;

	public FileHeaderVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFileid() {
		return Fileid;
	}

	public void setFileid(String fileid) {
		Fileid = fileid;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "FileHeaderVo [companyKey=" + companyKey + ", companyName=" + companyName + ", Fileid=" + Fileid
				+ ", timeStamp=" + timeStamp + "]";
	}

	
}
