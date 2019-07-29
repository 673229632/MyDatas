package com.ustcsoft.pdqc.web.scoremanagement.form;

public class DialysisForm {

	// id
	private String id;
	// 医院名称
	private String hospitalName;
	// 透析中心名称
	private String dialysateCenterName;
	// 透析中心负责人
	private String haedOfDialysisCenter;
	// 当前得分
	private String currentScore;
	// 发布时间
	private String releaseTime;
	
	/**
     * @return the id
     */
	public String getId() {
		return id;
	}
	/**
     * @param id the id to set
     */
	public void setId(String id) {
		this.id = id;
	}
	/**
     * @return the hospitalName
     */
	public String getHospitalName() {
		return hospitalName;
	}
	/**
     * @param hospitalName the hospitalName to set
     */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	/**
     * @return the dialysateCenterName
     */
	public String getDialysateCenterName() {
		return dialysateCenterName;
	}
	/**
     * @param dialysateCenterName the dialysateCenterName to set
     */
	public void setDialysateCenterName(String dialysateCenterName) {
		this.dialysateCenterName = dialysateCenterName;
	}
	/**
     * @return the haedOfDialysisCenter
     */
	public String getHaedOfDialysisCenter() {
		return haedOfDialysisCenter;
	}
	/**
     * @param haedOfDialysisCenter the haedOfDialysisCenter to set
     */
	public void setHaedOfDialysisCenter(String haedOfDialysisCenter) {
		this.haedOfDialysisCenter = haedOfDialysisCenter;
	}
	/**
     * @return the currentScore
     */
	public String getCurrentScore() {
		return currentScore;
	}
	/**
     * @param currentScore the currentScore to set
     */
	public void setCurrentScore(String currentScore) {
		this.currentScore = currentScore;
	}
	/**
     * @return the releaseTime
     */
	public String getReleaseTime() {
		return releaseTime;
	}
	/**
     * @param releaseTime the releaseTime to set
     */
	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}
	
}
