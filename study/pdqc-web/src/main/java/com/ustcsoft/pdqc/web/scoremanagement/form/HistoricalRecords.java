package com.ustcsoft.pdqc.web.scoremanagement.form;

public class HistoricalRecords {

	// id
	private String id;
	// 透析机构id
	private String diaylsisId;
	// 评分名
	private String scoreName;
	// 得分
	private String score;
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
     * @return the diaylsisId
     */
	public String getDiaylsisId() {
		return diaylsisId;
	}
	/**
     * @param diaylsisId the diaylsisId to set
     */
	public void setDiaylsisId(String diaylsisId) {
		this.diaylsisId = diaylsisId;
	}
	/**
     * @return the scoreName
     */
	public String getScoreName() {
		return scoreName;
	}
	/**
     * @param gradingname the gradingname to set
     */
	public void setScoreName(String scoreName) {
		this.scoreName = scoreName;
	}
	/**
     * @return the score
     */
	public String getScore() {
		return score;
	}
	/**
     * @param score the score to set
     */
	public void setScore(String score) {
		this.score = score;
	}
	
}
