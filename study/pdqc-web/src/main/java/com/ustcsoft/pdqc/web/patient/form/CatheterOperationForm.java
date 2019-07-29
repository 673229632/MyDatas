//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class CatheterOperationForm extends WebBaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2063187826976090370L;
	
	private String id;
	private String patientName;
	private String patientId;
	private Date catheterdate;
	private String catheterhospital;
	private String catheterdoctor;
	private String operationtype;
	private String catheterway;
	private String reason;
	private String anesthesiamethod;
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
	public Date getCatheterdate() {
		return catheterdate;
	}
	/**
	 * catheterdate的SET方法.
	 *
	 * @param catheterdate catheterdate
	 */
	public void setCatheterdate(Date catheterdate) {
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
