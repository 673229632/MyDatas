package com.ustcsoft.pdqc.web.scoremanagement.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

public class CheckResultTimeListForm extends WebBaseCondForm {
	
	// 评分编号
	private String checkNo;
	// 质控中心编号
	private String qcCenterNo;
	// 评分名
	private String checkName;
	// 标准版本编号
	private String standardNo;
	// 标准版本
	private String standardName;
	// 评分开始时间
	private String checkStartDate;
	// 评分截止时间
	private String checkEndDate;
	// 发布开始时间
	private String publishStartDate;
	// 发布截止时间
	private String publishEndDate;
	// 发布标志
	private String publishStatus;
	// 是否使用用上次评分
	private String useSign;
	// 发布标志
	private String kpiPart;
	
	/**
     * @return the checkNo
     */
	public String getCheckNo() {
		return checkNo;
	}
	/**
     * @param checkNo the checkNo to set
     */
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	/**
     * @return the qcCenterNo
     */
	public String getQcCenterNo() {
		return qcCenterNo;
	}
	/**
     * @param qcCenterNo the qcCenterNo to set
     */
	public void setQcCenterNo(String qcCenterNo) {
		this.qcCenterNo = qcCenterNo;
	}
	/**
     * @return the standardNo
     */
	public String getStandardNo() {
		return standardNo;
	}
	/**
     * @param standardNo the standardNo to set
     */
	public void setStandardNo(String standardNo) {
		this.standardNo = standardNo;
	}
	/**
     * @return the checkName
     */
	public String getCheckName() {
		return checkName;
	}
	/**
     * @param checkName the checkName to set
     */
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}
	/**
     * @return the standardName
     */
	public String getStandardName() {
		return standardName;
	}
	/**
     * @param standardName the standardName to set
     */
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	/**
     * @return the checkStartDate
     */
	public String getCheckStartDate() {
		return checkStartDate;
	}
	/**
     * @param checkStartDate the checkStartDate to set
     */
	public void setCheckStartDate(String checkStartDate) {
		this.checkStartDate = checkStartDate;
	}
	/**
     * @return the chackEndDate
     */
	public String getCheckEndDate() {
		return checkEndDate;
	}
	/**
     * @param chackEndDate the chackEndDate to set
     */
	public void setCheckEndDate(String checkEndDate) {
		this.checkEndDate = checkEndDate;
	}
	/**
     * @return the publishStartDate
     */
	public String getPublishStartDate() {
		return publishStartDate;
	}
	/**
     * @param publishStartDate the publishStartDate to set
     */
	public void setPublishStartDate(String publishStartDate) {
		this.publishStartDate = publishStartDate;
	}
	/**
     * @return the publishEndDate
     */
	public String getPublishEndDate() {
		return publishEndDate;
	}
	/**
     * @param publishEndDate the publishEndDate to set
     */
	public void setPublishEndDate(String publishEndDate) {
		this.publishEndDate = publishEndDate;
	}
	/**
     * @return the publishStatus
     */
	public String getPublishStatus() {
		return publishStatus;
	}
	/**
     * @param publishStatus the publishStatus to set
     */
	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}
	/**
     * @return the useSign
     */
	public String getUseSign() {
		return useSign;
	}
	/**
     * @param useSign the useSign to set
     */
	public void setUseSign(String useSign) {
		this.useSign = useSign;
	}
	/**
     * @return the kpiPart
     */
	public String getKpiPart() {
		return kpiPart;
	}
	/**
     * @param kpiPart the kpiPart to set
     */
	public void setKpiPart(String kpiPart) {
		this.kpiPart = kpiPart;
	}

	
	
}
