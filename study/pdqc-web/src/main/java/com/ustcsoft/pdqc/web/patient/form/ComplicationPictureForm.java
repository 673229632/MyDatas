//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patient.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class ComplicationPictureForm extends WebBaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String hpId;
	private String patientName;
	private String patientId;
	private String tdate;
	private String type;
	private String reason;
	private String isHospitalization;
	private String antibioticTreatment;
	private String treatment;
	private String outcomeType;
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
	 * tdate的GET方法.
	 *
	 * @return tdate
	 */
	public String getTdate() {
		return tdate;
	}
	/**
	 * tdate的SET方法.
	 *
	 * @param tdate tdate
	 */
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	/**
	 * type的GET方法.
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * type的SET方法.
	 *
	 * @param type type
	 */
	public void setType(String type) {
		this.type = type;
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
	 * isHospitalization的GET方法.
	 *
	 * @return isHospitalization
	 */
	public String getIsHospitalization() {
		return isHospitalization;
	}
	/**
	 * isHospitalization的SET方法.
	 *
	 * @param isHospitalization isHospitalization
	 */
	public void setIsHospitalization(String isHospitalization) {
		this.isHospitalization = isHospitalization;
	}
	/**
	 * antibioticTreatment的GET方法.
	 *
	 * @return antibioticTreatment
	 */
	public String getAntibioticTreatment() {
		return antibioticTreatment;
	}
	/**
	 * antibioticTreatment的SET方法.
	 *
	 * @param antibioticTreatment antibioticTreatment
	 */
	public void setAntibioticTreatment(String antibioticTreatment) {
		this.antibioticTreatment = antibioticTreatment;
	}
	/**
	 * treatment的GET方法.
	 *
	 * @return treatment
	 */
	public String getTreatment() {
		return treatment;
	}
	/**
	 * treatment的SET方法.
	 *
	 * @param treatment treatment
	 */
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	/**
	 * outcomeType的GET方法.
	 *
	 * @return outcomeType
	 */
	public String getOutcomeType() {
		return outcomeType;
	}
	/**
	 * outcomeType的SET方法.
	 *
	 * @param outcomeType outcomeType
	 */
	public void setOutcomeType(String outcomeType) {
		this.outcomeType = outcomeType;
	}
	
}
