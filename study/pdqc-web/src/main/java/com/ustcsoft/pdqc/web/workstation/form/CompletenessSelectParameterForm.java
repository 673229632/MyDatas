package com.ustcsoft.pdqc.web.workstation.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

public class CompletenessSelectParameterForm extends WebBaseForm{
	
	String orgNo;
	
	String pdCenterNo;
	
	String tableName;
	
	String inspectionType;

	Date checkStartTime;
	
	Date checkEndTime;
	
	Date patientRetentionTime;
	
	String examType;
	
	String minValue;
	
	String maxValue;
	
	String minOperator;
	
	String maxOperator;
	
	String description;
	
	String orderBy;
	
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	
	public String getPdCenterNo() {
		return pdCenterNo;
	}
	public void setPdCenterNo(String pdCenterNo) {
		this.pdCenterNo = pdCenterNo;
	}
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getInspectionType() {
		return inspectionType;
	}
	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
	}
	public Date getCheckStartTime() {
		return checkStartTime;
	}
	public void setCheckStartTime(Date checkStartTime) {
		this.checkStartTime = checkStartTime;
	}
	public Date getCheckEndTime() {
		return checkEndTime;
	}
	public void setCheckEndTime(Date checkEndTime) {
		this.checkEndTime = checkEndTime;
	}
	public Date getPatientRetentionTime() {
		return patientRetentionTime;
	}
	public void setPatientRetentionTime(Date patientRetentionTime) {
		this.patientRetentionTime = patientRetentionTime;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getMinValue() {
		return minValue;
	}
	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}
	public String getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}
	public String getMinOperator() {
		return minOperator;
	}
	public void setMinOperator(String minOperator) {
		this.minOperator = minOperator;
	}
	public String getMaxOperator() {
		return maxOperator;
	}
	public void setMaxOperator(String maxOperator) {
		this.maxOperator = maxOperator;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
}
