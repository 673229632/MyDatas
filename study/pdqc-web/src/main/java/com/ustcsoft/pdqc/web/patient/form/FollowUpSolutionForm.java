package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

/**
 * @author zhouqichao
 *	患者随访form
 */
public class FollowUpSolutionForm extends WebBaseCondForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String patientId;
	
	private String hpId;
	
	private String outComeType;
	
	private String patientName;
	
	private String tDate;
	
	private Date followUpDate;
	
	private String emergency;
	
	private String emergencyDetail;
	
	private String illnessChange;
	
	private String illnessChangeDetail;
	
	private String appelity;
	
	private String sleepQuality;
	
	private String activityAmount;
	
	private String emotion;
	
	private String bloodPressure;
	
	private String bloodGlucose;
	
	private String weight;
	
	private String ultrafiltration;
	
	private String urinaryProduction;
	
	private String unwellChiefComplaint;
	
	private String followupProblem;
	
	private String publicityEducationFocus;

	private String prebphigh;
	
	private String prebplow;
	
	private String fasting;
	
	private String afterBreakfast;
	
	private String beforeLunch;
	
	private String afterLunch;
	
	private String beforeDinner;
	
	private String afterDinner;
	
	private String beforeSlepp;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getHpId() {
		return hpId;
	}

	public void setHpId(String hpId) {
		this.hpId = hpId;
	}

	public String getOutComeType() {
		return outComeType;
	}

	public void setOutComeType(String outComeType) {
		this.outComeType = outComeType;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String gettDate() {
		return tDate;
	}

	public void settDate(String tDate) {
		this.tDate = tDate;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	public String getEmergency() {
		return emergency;
	}

	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}

	public String getEmergencyDetail() {
		return emergencyDetail;
	}

	public void setEmergencyDetail(String emergencyDetail) {
		this.emergencyDetail = emergencyDetail;
	}

	public String getIllnessChange() {
		return illnessChange;
	}

	public void setIllnessChange(String illnessChange) {
		this.illnessChange = illnessChange;
	}

	public String getIllnessChangeDetail() {
		return illnessChangeDetail;
	}

	public void setIllnessChangeDetail(String illnessChangeDetail) {
		this.illnessChangeDetail = illnessChangeDetail;
	}

	public String getAppelity() {
		return appelity;
	}

	public void setAppelity(String appelity) {
		this.appelity = appelity;
	}

	public String getSleepQuality() {
		return sleepQuality;
	}

	public void setSleepQuality(String sleepQuality) {
		this.sleepQuality = sleepQuality;
	}

	public String getActivityAmount() {
		return activityAmount;
	}

	public void setActivityAmount(String activityAmount) {
		this.activityAmount = activityAmount;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	
	public String getBloodGlucose() {
		return bloodGlucose;
	}

	public void setBloodGlucose(String bloodGlucose) {
		this.bloodGlucose = bloodGlucose;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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

	public String getUnwellChiefComplaint() {
		return unwellChiefComplaint;
	}

	public void setUnwellChiefComplaint(String unwellChiefComplaint) {
		this.unwellChiefComplaint = unwellChiefComplaint;
	}

	public String getFollowupProblem() {
		return followupProblem;
	}

	public void setFollowupProblem(String followupProblem) {
		this.followupProblem = followupProblem;
	}

	public String getPublicityEducationFocus() {
		return publicityEducationFocus;
	}

	public void setPublicityEducationFocus(String publicityEducationFocus) {
		this.publicityEducationFocus = publicityEducationFocus;
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

	public String getFasting() {
		return fasting;
	}

	public void setFasting(String fasting) {
		this.fasting = fasting;
	}

	public String getAfterBreakfast() {
		return afterBreakfast;
	}

	public void setAfterBreakfast(String afterBreakfast) {
		this.afterBreakfast = afterBreakfast;
	}

	public String getBeforeLunch() {
		return beforeLunch;
	}

	public void setBeforeLunch(String beforeLunch) {
		this.beforeLunch = beforeLunch;
	}

	public String getAfterLunch() {
		return afterLunch;
	}

	public void setAfterLunch(String afterLunch) {
		this.afterLunch = afterLunch;
	}

	public String getBeforeDinner() {
		return beforeDinner;
	}

	public void setBeforeDinner(String beforeDinner) {
		this.beforeDinner = beforeDinner;
	}

	public String getAfterDinner() {
		return afterDinner;
	}

	public void setAfterDinner(String afterDinner) {
		this.afterDinner = afterDinner;
	}

	public String getBeforeSlepp() {
		return beforeSlepp;
	}

	public void setBeforeSlepp(String beforeSlepp) {
		this.beforeSlepp = beforeSlepp;
	}
	
	
}
