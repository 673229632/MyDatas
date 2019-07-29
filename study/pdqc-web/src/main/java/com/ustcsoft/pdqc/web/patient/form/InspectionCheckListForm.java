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
public class InspectionCheckListForm extends WebBaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String hpId;
	private String patientName;
	private String patientId;
	private Date tdate;
	private String inspectionCheck;
	private String detail;
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
	public Date getTdate() {
		return tdate;
	}
	/**
	 * tdate的SET方法.
	 *
	 * @param tdate tdate
	 */
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	/**
	 * inspectionCheck的GET方法.
	 *
	 * @return inspectionCheck
	 */
	public String getInspectionCheck() {
		return inspectionCheck;
	}
	/**
	 * inspectionCheck的SET方法.
	 *
	 * @param inspectionCheck inspectionCheck
	 */
	public void setInspectionCheck(String inspectionCheck) {
		this.inspectionCheck = inspectionCheck;
	}
	/**
	 * detail的GET方法.
	 *
	 * @return detail
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * detail的SET方法.
	 *
	 * @param detail detail
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
