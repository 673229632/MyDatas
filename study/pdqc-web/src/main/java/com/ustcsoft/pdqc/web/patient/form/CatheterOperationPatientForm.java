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
public class CatheterOperationPatientForm extends WebBaseForm{
	
		private static final long serialVersionUID = 4008290327791774582L;

		//患者id
		private String patientId;
		
		//患者姓名
		private String patientName;
		
		//日期
		private  Date outComeDate;

		public String getPatientId() {
			return patientId;
		}

		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}

		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public Date getOutComeDate() {
			return outComeDate;
		}

		public void setOutComeDate(Date outComeDate) {
			this.outComeDate = outComeDate;
		}
		
}
