package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * @author lijun
 * 门诊评估结果form
 */
public class PatientEvalRstForm extends WebBaseForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1274126490934297892L;
	
	private String id;
	//患者姓名
	private String patientName;
	//患者id
	private String patientId;
	//医院编号
	private String hpId;
	//门诊日期
	private String patientEvalDate;
	//门诊日期(日期)
	private Date patientTDate;
	//体重
	private String weight;
	//BMI
	private String bmi;
	//血压
	private String bloodPressure;
	
	private String prebphigh;
	
	private String prebplow;
	//超滤量
	private String ultrafiltration;
	//尿量
	private String urinaryProduction;
	//心功能分级
	private String cardiacFunctionLevel;
	//水肿等级
	private String edemaGrade;
	//消化道症状
	private String alimentarySymptoms;
	//其他症状
	private String otherSymptoms;
	//出口处评估
	private String catheterOutAssessment;
	//隧道口评分
	private String catheterOutScore;
	//体重改变
	private String weightChange;
	//饮食改变
	private String dietChange;
	//胃肠道症状
	private String gastrointestinalSymptoms;
	//活动能力
	private String activityAbility;
	//并发症
	private String complication;
	//脂肪储备减少与皮下脂肪消耗
	private String subcutaneousFat;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getPatientTDate() {
		return patientTDate;
	}
	public void setPatientTDate(Date patientTDate) {
		this.patientTDate = patientTDate;
	}
	public String getActivityAbility() {
		return activityAbility;
	}
	public void setActivityAbility(String activityAbility) {
		this.activityAbility = activityAbility;
	}
	public String getComplication() {
		return complication;
	}
	public void setComplication(String complication) {
		this.complication = complication;
	}
	public String getSubcutaneousFat() {
		return subcutaneousFat;
	}
	public void setSubcutaneousFat(String subcutaneousFat) {
		this.subcutaneousFat = subcutaneousFat;
	}
	public String getPrebphigh() {
		return prebphigh;
	}
	public void setPrebphigh(String prebphigh) {
		this.prebphigh = prebphigh;
	}
	public String getPrebplow() {
		return prebplow;
	}
	public void setPrebplow(String prebplow) {
		this.prebplow = prebplow;
	}
	public String getHpId() {
		return hpId;
	}
	public void setHpId(String hpId) {
		this.hpId = hpId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	
	public String getPatientEvalDate() {
		return patientEvalDate;
	}
	public void setPatientEvalDate(String patientEvalDate) {
		this.patientEvalDate = patientEvalDate;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBmi() {
		return bmi;
	}
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public String getUltrafiltration() {
		return ultrafiltration;
	}
	public void setUltrafiltration(String ultrafiltration) {
		this.ultrafiltration = ultrafiltration;
	}
	public String getUrinaryProduction() {
		return urinaryProduction;
	}
	public void setUrinaryProduction(String urinaryProduction) {
		this.urinaryProduction = urinaryProduction;
	}
	public String getCardiacFunctionLevel() {
		return cardiacFunctionLevel;
	}
	public void setCardiacFunctionLevel(String cardiacFunctionLevel) {
		this.cardiacFunctionLevel = cardiacFunctionLevel;
	}
	public String getEdemaGrade() {
		return edemaGrade;
	}
	public void setEdemaGrade(String edemaGrade) {
		this.edemaGrade = edemaGrade;
	}
	public String getAlimentarySymptoms() {
		return alimentarySymptoms;
	}
	public void setAlimentarySymptoms(String alimentarySymptoms) {
		this.alimentarySymptoms = alimentarySymptoms;
	}
	public String getOtherSymptoms() {
		return otherSymptoms;
	}
	public void setOtherSymptoms(String otherSymptoms) {
		this.otherSymptoms = otherSymptoms;
	}
	public String getCatheterOutAssessment() {
		return catheterOutAssessment;
	}
	public void setCatheterOutAssessment(String catheterOutAssessment) {
		this.catheterOutAssessment = catheterOutAssessment;
	}
	public String getCatheterOutScore() {
		return catheterOutScore;
	}
	public void setCatheterOutScore(String catheterOutScore) {
		this.catheterOutScore = catheterOutScore;
	}
	public String getWeightChange() {
		return weightChange;
	}
	public void setWeightChange(String weightChange) {
		this.weightChange = weightChange;
	}
	public String getDietChange() {
		return dietChange;
	}
	public void setDietChange(String dietChange) {
		this.dietChange = dietChange;
	}
	public String getGastrointestinalSymptoms() {
		return gastrointestinalSymptoms;
	}
	public void setGastrointestinalSymptoms(String gastrointestinalSymptoms) {
		this.gastrointestinalSymptoms = gastrointestinalSymptoms;
	}
	
	
	
}
