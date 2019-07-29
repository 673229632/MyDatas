//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.dialysismodestatistics.form;

import java.math.BigDecimal;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class DialysisModeStatisticsForm extends WebBaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hp_id;
	private String hospitalName;
	private BigDecimal countPatient;
	private String type;
	/**
	 * hp_id的GET方法.
	 *
	 * @return hp_id
	 */
	public String getHp_id() {
		return hp_id;
	}
	/**
	 * hp_id的SET方法.
	 *
	 * @param hp_id hp_id
	 */
	public void setHp_id(String hp_id) {
		this.hp_id = hp_id;
	}
	/**
	 * countPatient的GET方法.
	 *
	 * @return countPatient
	 */
	public BigDecimal getCountPatient() {
		return countPatient;
	}
	/**
	 * countPatient的SET方法.
	 *
	 * @param countPatient countPatient
	 */
	public void setCountPatient(BigDecimal countPatient) {
		this.countPatient = countPatient;
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
	
}
