package com.ustcsoft.pdqc.web.workstation.form;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class UnreportedPatientForm extends BaseEntity{

	private String patientName;
	
	private String cardNo;
	
	private String firstDialsysDate;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getFirstDialsysDate() {
		return firstDialsysDate;
	}

	public void setFirstDialsysDate(String firstDialsysDate) {
		this.firstDialsysDate = firstDialsysDate;
	}
	
	
}
