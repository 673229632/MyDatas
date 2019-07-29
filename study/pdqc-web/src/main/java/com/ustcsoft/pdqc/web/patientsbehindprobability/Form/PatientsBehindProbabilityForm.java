//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsbehindprobability.Form;

import java.math.BigDecimal;
import java.util.List;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class PatientsBehindProbabilityForm extends WebBaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hp_id;
	private BigDecimal patientNum;
	private BigDecimal dropPatientNum;
	private List<String> outcome_type;
	private BigDecimal rate;
	private String hospitalName;
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
	 * patientNum的GET方法.
	 *
	 * @return patientNum
	 */
	public BigDecimal getPatientNum() {
		return patientNum;
	}
	/**
	 * patientNum的SET方法.
	 *
	 * @param patientNum patientNum
	 */
	public void setPatientNum(BigDecimal patientNum) {
		this.patientNum = patientNum;
	}
	/**
	 * dropPatientNum的GET方法.
	 *
	 * @return dropPatientNum
	 */
	public BigDecimal getDropPatientNum() {
		return dropPatientNum;
	}
	/**
	 * dropPatientNum的SET方法.
	 *
	 * @param dropPatientNum dropPatientNum
	 */
	public void setDropPatientNum(BigDecimal dropPatientNum) {
		this.dropPatientNum = dropPatientNum;
	}
	
	/**
	 * outcome_type的GET方法.
	 *
	 * @return outcome_type
	 */
	public List<String> getOutcome_type() {
		return outcome_type;
	}
	/**
	 * outcome_type的SET方法.
	 *
	 * @param outcome_type outcome_type
	 */
	public void setOutcome_type(List<String> outcome_type) {
		this.outcome_type = outcome_type;
	}
	/**
	 * rate的GET方法.
	 *
	 * @return rate
	 */
	public BigDecimal getRate() {
		return rate;
	}
	/**
	 * rate的SET方法.
	 *
	 * @param rate rate
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
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
