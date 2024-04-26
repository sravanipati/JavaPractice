package com.alacriti.billpayment.vo;

public class FileGenerationVo {
	private String fileId;
	private String filePrefix;
	private String fileSuffix;
	private String fileFormat;
	private String filePath;
	private String fileType;

	public FileGenerationVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFilePrefix() {
		return filePrefix;
	}

	public void setFilePrefix(String filePrefix) {
		this.filePrefix = filePrefix;
	}

	public String getFileSuffix() {
		return fileSuffix;
	}

	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@Override
	public String toString() {
		return "FileGenerationVo [fileId=" + fileId + ", filePrefix=" + filePrefix + ", fileSuffix=" + fileSuffix
				+ ", fileFormat=" + fileFormat + ", filePath=" + filePath + "]";
	}

}
