package com.ustcsoft.pdqc.web.employeemanagement.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

/**
 * @author lijun
 * 文件结果form
 */
public class EmployeeFileRstForm extends WebBaseCondForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 919052900390754218L;
	
	private String employeeNo;
	//文件类型
	private String fileType;
	//上传时间
	private Date uploadTime; 
	//文件名称
	private String fileName;
	
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
