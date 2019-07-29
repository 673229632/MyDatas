package com.ustcsoft.pdqc.web.employeemanagement.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

/**
 * 
 * @author zhouqichao
 *
 */

public class EmployeeListForm extends WebBaseCondForm {
	//组织机构编号
	private String orgNo;
	//职员编号
	private String employeeNo;
	//职员姓名
	private String employeeName;
	//职员性别
	private String employeeSex;
	//职员身份证
	private String idCardNo;
	//职员类别
	private String employeeType;
	//职员工作开始日期
	private String workStart;
	//职称
	private String titleName;
	//电话
	private String employeeTel;
	//是否兼职
	private String isCheck;
	//是否兼职
	private String isParttime;
	
	/**
     * @return the orgNo
     */
	public String getOrgNo() {
		return orgNo;
	}

	/**
     * @param orgNo the orgNo to set
     */
	
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	/**
     * @return the employeeNo
     */
	public String getEmployeeNo() {
		return employeeNo;
	}
	
    /**
     * @param employeeNo the employeeNo to set
     */
	
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	/**
     * @return the employeeName
     */
	
	public String getEmployeeName() {
		return employeeName;
	}
	
    /**
     * @param employeeName the employeeName to set
     */
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	/**
     * @return the employeeSex
     */
	
	public String getEmployeeSex() {
		return employeeSex;
	}
	
    /**
     * @param employeeSex the employeeSex to set
     */
	
	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex;
	}
	
	/**
     * @return the IdCardNo
     */
	
	public String getIdCardNo() {
		return idCardNo;
	}
	
    /**
     * @param IdCardNo the IdCardNo to set
     */
	
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	
	/**
     * @return the employeeType
     */
	
	public String getEmployeeType() {
		return employeeType;
	}
	
    /**
     * @param employeeType the employeeType to set
     */
	
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	/**
     * @return the WorkStart
     */
	
	public String getWorkStart() {
		return workStart;
	}
	
    /**
     * @param WorkStart the WorkStart to set
     */
	
	public void setWorkStart(String workStart) {
		this.workStart = workStart;
	}
	
	/**
     * @return the titleName
     */
	
	public String getTitleName() {
		return titleName;
	}
	
    /**
     * @param titleName the titleName to set
     */
	
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	/**
     * @return the employeeTel
     */
	
	public String getEmployeeTel() {
		return employeeTel;
	}
	
    /**
     * @param employeeTel the employeeTel to set
     */
	
	public void setEmployeeTel(String employeeTel) {
		this.employeeTel = employeeTel;
	}
	
	/**
     * @return the isCheck
     */
	public String getIsCheck() {
		return isCheck;
	}
    /**
     * @param isCheck the isCheck to set
     */
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

	/**
     * @return the isParttime
     */
	
	public String getIsParttime() {
		return isParttime;
	}
	
    /**
     * @param isParttime the isParttime to set
     */
	
	public void setIsParttime(String isParttime) {
		this.isParttime = isParttime;
	}
	
	
}
