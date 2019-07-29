//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsurvivalmonth.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class SurvivalMonthDetailForm extends WebBaseForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7097603414866448932L;
		private String hp_id;
		private String hospitalName;
		private String name;
		private String phone_no;
		private String first_dialsys_date;
		private String survivalMonth;
		private String infection_diseases;
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
		 * phone_no的GET方法.
		 *
		 * @return phone_no
		 */
		public String getPhone_no() {
			return phone_no;
		}
		/**
		 * phone_no的SET方法.
		 *
		 * @param phone_no phone_no
		 */
		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
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
		 * survivalMonth的GET方法.
		 *
		 * @return survivalMonth
		 */
		public String getSurvivalMonth() {
			return survivalMonth;
		}
		/**
		 * survivalMonth的SET方法.
		 *
		 * @param survivalMonth survivalMonth
		 */
		public void setSurvivalMonth(String survivalMonth) {
			this.survivalMonth = survivalMonth;
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
		
}
