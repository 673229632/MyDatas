//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.diseasesstatistics.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class PatientDetailForm extends WebBaseForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hp_id;
	private String name;
	private String card_no;
	private String first_dialsys_date;
	private String infection_diseases;
	private String hospitalName;
	private String diseases;
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
	 * name的GET方法.
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * name的SET方法.
	 *
	 * @param name name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * first_dialsys_date的GET方法.
	 *
	 * @return first_dialsys_date
	 */
	public String getFirst_dialsys_date() {
		return first_dialsys_date;
	}
	/**
	 * first_dialsys_date的SET方法.
	 *
	 * @param first_dialsys_date first_dialsys_date
	 */
	public void setFirst_dialsys_date(String first_dialsys_date) {
		this.first_dialsys_date = first_dialsys_date;
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
	 * card_no的GET方法.
	 *
	 * @return card_no
	 */
	public String getCard_no() {
		return card_no;
	}
	/**
	 * card_no的SET方法.
	 *
	 * @param card_no card_no
	 */
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	/**
	 * infection_diseases的GET方法.
	 *
	 * @return infection_diseases
	 */
	public String getInfection_diseases() {
		return infection_diseases;
	}
	/**
	 * infection_diseases的SET方法.
	 *
	 * @param infection_diseases infection_diseases
	 */
	public void setInfection_diseases(String infection_diseases) {
		this.infection_diseases = infection_diseases;
	}
	/**
	 * diseases的GET方法.
	 *
	 * @return diseases
	 */
	public String getDiseases() {
		return diseases;
	}
	/**
	 * diseases的SET方法.
	 *
	 * @param diseases diseases
	 */
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	
}
