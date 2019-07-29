package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * @author lijun
 * 转归信息结果form
 */
public class PatientOutComeRstForm extends WebBaseForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2131922812711826374L;
	
	private String id;
	
	//患者id
	private String patientId;
	
	//患者姓名
	private String patientName;
	
	//转归日期
	private Date tdate;
	
	//转归类型
	private String outComeType;
	
	//转归原因
	private String reason;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
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

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public String getOutComeType() {
		return outComeType;
	}

	public void setOutComeType(String outComeType) {
		this.outComeType = outComeType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
}
