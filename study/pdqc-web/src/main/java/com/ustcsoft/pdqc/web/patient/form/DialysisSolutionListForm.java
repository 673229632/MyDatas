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
public class DialysisSolutionListForm extends WebBaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String hpId;
	private String patientName;
	private String patientId;
	private Date tdate;
	private String type;
	private String amount1;
	private String amount2;
	private String amount3;
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
	 * amount1的GET方法.
	 *
	 * @return amount1
	 */
	public String getAmount1() {
		return amount1;
	}
	/**
	 * amount1的SET方法.
	 *
	 * @param amount1 amount1
	 */
	public void setAmount1(String amount1) {
		this.amount1 = amount1;
	}
	/**
	 * amount2的GET方法.
	 *
	 * @return amount2
	 */
	public String getAmount2() {
		return amount2;
	}
	/**
	 * amount2的SET方法.
	 *
	 * @param amount2 amount2
	 */
	public void setAmount2(String amount2) {
		this.amount2 = amount2;
	}
	/**
	 * amount3的GET方法.
	 *
	 * @return amount3
	 */
	public String getAmount3() {
		return amount3;
	}
	/**
	 * amount3的SET方法.
	 *
	 * @param amount3 amount3
	 */
	public void setAmount3(String amount3) {
		this.amount3 = amount3;
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
	
}
