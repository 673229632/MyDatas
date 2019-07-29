//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patient.form;


import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class CatheterOperationReportForm  extends WebBaseForm{

	private static final long serialVersionUID = -4437738704509643214L;
	
	private String id;
	private String hospitalName;
	private String patientName;
	private String patientType;
	private String hpId;
	private String patientId;
	private String catheterdate;
	private String catheterhospital;
	private String catheterdoctor;
	private String operationtype;
	private String anesthesiamethod;
	private String catheterway;
	private String reason;
	private String dialysissystems;
	private String dialysisstage;
	/**
	 * id的GET方法.
	 *
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * id的SET方法.
	 *
	 * @param id id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * hospitalName的GET方法.
	 *
	 * @return hospitalName
	 */
	public String getHospitalName() {
		return hospitalName;
	}
	/**
	 * hospitalName的SET方法.
	 *
	 * @param hospitalName hospitalName
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	/**
	 * patientName的GET方法.
	 *
	 * @return patientName
	 */
	public String getPatientName() {
		return patientName;
	}
	/**
	 * patientName的SET方法.
	 *
	 * @param patientName patientName
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	/**
	 * patientType的GET方法.
	 *
	 * @return patientType
	 */
	public String getPatientType() {
		return patientType;
	}
	/**
	 * patientType的SET方法.
	 *
	 * @param patientType patientType
	 */
	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}
	/**
	 * hpId的GET方法.
	 *
	 * @return hpId
	 */
	public String getHpId() {
		return hpId;
	}
	/**
	 * hpId的SET方法.
	 *
	 * @param hpId hpId
	 */
	public void setHpId(String hpId) {
		this.hpId = hpId;
	}
	/**
	 * patientId的GET方法.
	 *
	 * @return patientId
	 */
	public String getPatientId() {
		return patientId;
	}
	/**
	 * patientId的SET方法.
	 *
	 * @param patientId patientId
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	
	/**
	 * catheterdate的GET方法.
	 *
	 * @return catheterdate
	 */
	public String getCatheterdate() {
		return catheterdate;
	}
	/**
	 * catheterdate的SET方法.
	 *
	 * @param catheterdate catheterdate
	 */
	public void setCatheterdate(String catheterdate) {
		this.catheterdate = catheterdate;
	}
	/**
	 * catheterhospital的GET方法.
	 *
	 * @return catheterhospital
	 */
	public String getCatheterhospital() {
		return catheterhospital;
	}
	/**
	 * catheterhospital的SET方法.
	 *
	 * @param catheterhospital catheterhospital
	 */
	public void setCatheterhospital(String catheterhospital) {
		this.catheterhospital = catheterhospital;
	}
	/**
	 * catheterdoctor的GET方法.
	 *
	 * @return catheterdoctor
	 */
	public String getCatheterdoctor() {
		return catheterdoctor;
	}
	/**
	 * catheterdoctor的SET方法.
	 *
	 * @param catheterdoctor catheterdoctor
	 */
	public void setCatheterdoctor(String catheterdoctor) {
		this.catheterdoctor = catheterdoctor;
	}
	/**
	 * operationtype的GET方法.
	 *
	 * @return operationtype
	 */
	public String getOperationtype() {
		return operationtype;
	}
	/**
	 * operationtype的SET方法.
	 *
	 * @param operationtype operationtype
	 */
	public void setOperationtype(String operationtype) {
		this.operationtype = operationtype;
	}
	/**
	 * anesthesiamethod的GET方法.
	 *
	 * @return anesthesiamethod
	 */
	public String getAnesthesiamethod() {
		return anesthesiamethod;
	}
	/**
	 * anesthesiamethod的SET方法.
	 *
	 * @param anesthesiamethod anesthesiamethod
	 */
	public void setAnesthesiamethod(String anesthesiamethod) {
		this.anesthesiamethod = anesthesiamethod;
	}
	/**
	 * catheterway的GET方法.
	 *
	 * @return catheterway
	 */
	public String getCatheterway() {
		return catheterway;
	}
	/**
	 * catheterway的SET方法.
	 *
	 * @param catheterway catheterway
	 */
	public void setCatheterway(String catheterway) {
		this.catheterway = catheterway;
	}
	/**
	 * reason的GET方法.
	 *
	 * @return reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * reason的SET方法.
	 *
	 * @param reason reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * dialysissystems的GET方法.
	 *
	 * @return dialysissystems
	 */
	public String getDialysissystems() {
		return dialysissystems;
	}
	/**
	 * dialysissystems的SET方法.
	 *
	 * @param dialysissystems dialysissystems
	 */
	public void setDialysissystems(String dialysissystems) {
		this.dialysissystems = dialysissystems;
	}
	/**
	 * dialysisstage的GET方法.
	 *
	 * @return dialysisstage
	 */
	public String getDialysisstage() {
		return dialysisstage;
	}
	/**
	 * dialysisstage的SET方法.
	 *
	 * @param dialysisstage dialysisstage
	 */
	public void setDialysisstage(String dialysisstage) {
		this.dialysisstage = dialysisstage;
	}
	
	
	
}
