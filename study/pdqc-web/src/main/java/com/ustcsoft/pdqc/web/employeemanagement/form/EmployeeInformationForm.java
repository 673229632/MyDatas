package com.ustcsoft.pdqc.web.employeemanagement.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

/**
 * 
 * @author zhouqichao
 *
 */

public class EmployeeInformationForm extends WebBaseCondForm {
	//组织机构编号
	private String orgNo;
	//职员编号
	private String employeeNo;
	//职员姓名
	private String employeeName;
	//职员性别
	private String employeeSex;
	//证件类型
	private String certificateType;
	//职员类别
	private String employeeType;
	//证件编号
	private String certificateNo;
	//身份证编号
	private String idCardNo;
	//出生日期
	private String birthday;
	//电话
	private String employeeTel;
	//医疗行业从业年限
	private String mediYear;
	//血液净化工作从业年限
	private String dialYear;
	//手机
	private String employeeMobile;
	//住址
	private String employeeAddress;
	//职员工作开始日期
	private String workStart;
	//学历
	private String education;
	//email
	private String employeeEmail;
	//职务
	private String employeePost;
	//是否兼职
	private String isParttime;
	//是否参与评分
	private String isCheck;
	//删除标志
	private String delFlag;
	//登录人
	private String createdBy;
	//登录时间
	private String dataCreated;
	//更新人
	private String modifiedBy;
	//更新时间
	private String dateModified;
	//职称编号
	private String titleNo;
	
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
     * @return the certificateType
     */
	public String getCertificateType() {
		return certificateType;
	}
	/**
     * @param certificateType the certificateType to set
     */
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
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
     * @return the certificateNo
     */
	public String getCertificateNo() {
		return certificateNo;
	}
	/**
     * @param certificateNo the certificateNo to set
     */
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
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
     * @return the birthday
     */
	public String getBirthday() {
		return birthday;
	}
	/**
     * @param birthday the birthday to set
     */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
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
     * @return the mediYear
     */
	public String getMediYear() {
		return mediYear;
	}
	/**
     * @param mediYear the mediYear to set
     */
	public void setMediYear(String mediYear) {
		this.mediYear = mediYear;
	}
	/**
     * @return the dialYear
     */
	public String getDialYear() {
		return dialYear;
	}
	/**
     * @param dialYear the dialYear to set
     */
	public void setDialYear(String dialYear) {
		this.dialYear = dialYear;
	}
	/**
     * @return the employeeMobile
     */
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	/**
     * @param employeeMobile the employeeMobile to set
     */
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	/**
     * @return the employeeAddress
     */
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	/**
     * @param employeeAddress the employeeAddress to set
     */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
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
     * @return the education
     */
	public String getEducation() {
		return education;
	}
	/**
     * @param education the education to set
     */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
     * @return the employeeEmail
     */
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	/**
     * @param employeeEmail the employeeEmail to set
     */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	/**
     * @return the employeePost
     */
	public String getEmployeePost() {
		return employeePost;
	}
	/**
     * @param employeePost the employeePost to set
     */
	public void setEmployeePost(String employeePost) {
		this.employeePost = employeePost;
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
     * @return the delFlag
     */
	public String getDelFlag() {
		return delFlag;
	}
	/**
     * @param delFlag the delFlag to set
     */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
     * @return the createdBy
     */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
     * @param createdBy the createdBy to set
     */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
     * @return the dataCreated
     */
	public String getDataCreated() {
		return dataCreated;
	}
	/**
     * @param dataCreated the dataCreated to set
     */
	public void setDataCreated(String dataCreated) {
		this.dataCreated = dataCreated;
	}
	/**
     * @return the modifiedBy
     */
	public String getModifiedBy() {
		return modifiedBy;
	}
	/**
     * @param modifiedBy the modifiedBy to set
     */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/**
     * @return the dateModified
     */
	public String getDateModified() {
		return dateModified;
	}
	/**
     * @param dateModified the dateModified to set
     */
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
	/**
     * @return the titleNo
     */
	public String getTitleNo() {
		return titleNo;
	}
	/**
     * @param titleNo the titleNo to set
     */
	public void setTitleNo(String titleNo) {
		this.titleNo = titleNo;
	}
	
	
}
