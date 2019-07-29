package com.ustcsoft.pdqc.web.employeemanagement.form;

import org.springframework.web.multipart.MultipartFile;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

public class EmployeeFileForm extends WebBaseCondForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7720256906450731604L;
	
	/**
     * 上传的文件对象
     */
    private MultipartFile file1;
    
    private String fileTitle1;
    //文件编号
    private String fileNo;
    //文件类型
    private String fileTypeNo;
    
    private String employeeNo;
    
	public MultipartFile getFile1() {
		return file1;
	}

	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}

	public String getFileTitle1() {
		return fileTitle1;
	}

	public void setFileTitle1(String fileTitle1) {
		this.fileTitle1 = fileTitle1;
	}

	public String getFileNo() {
		return fileNo;
	}

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getFileTypeNo() {
		return fileTypeNo;
	}

	public void setFileTypeNo(String fileTypeNo) {
		this.fileTypeNo = fileTypeNo;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
    
	
    

}
