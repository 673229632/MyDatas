package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

public class PatientPeritonealDialysisRstForm extends WebBaseForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5889869014856896264L;
	
	private String id;
	
	private String patientName;
	
	private String patientId;
	
	private String hpId;
	
	private String tDate;
	
	private Date tDialysisDate;
	
	private String height;
	
	private String weight;
	//24h尿量
	private String urineVolume;
	//24h尿尿素氮（mmol/L）
	private String urineBUN;
	//24h尿肌酐（umol/L）
	private String urineCr;
	//24h透出液总量（L）
	private String drainageAmount;
	//24h透出液尿素氮（mmol/L）
	private String drainageBUN;
	//24h透出液肌酐（umol/L）
	private String drainageCr;
	//血清尿素氮（mmol/L）
	private String serumBUN;
	//血清肌酐（umol/L）
	private String serumCr;
	//残肾Ccr（L/周）
	private String residualRenalCcr;
	//透析Ccr（L/周）
	private String peritonealDialysisCcr;
	//每周总Ccr（L/周）
	private String totalCcr;
	//残肾Kt/V（L/周）
	private String residualRenalKt;
	//透析Kt/V（L/周）
	private String peritonealDialysisKt;
	//每周总Kt/V（L/周）
	private String totalKt;
	
	private String eGFR;
	
	private String nPCR;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getHpId() {
		return hpId;
	}
	public void setHpId(String hpId) {
		this.hpId = hpId;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	public Date gettDialysisDate() {
		return tDialysisDate;
	}
	public void settDialysisDate(Date tDialysisDate) {
		this.tDialysisDate = tDialysisDate;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getUrineVolume() {
		return urineVolume;
	}
	public void setUrineVolume(String urineVolume) {
		this.urineVolume = urineVolume;
	}
	public String getUrineBUN() {
		return urineBUN;
	}
	public void setUrineBUN(String urineBUN) {
		this.urineBUN = urineBUN;
	}
	public String getUrineCr() {
		return urineCr;
	}
	public void setUrineCr(String urineCr) {
		this.urineCr = urineCr;
	}
	public String getDrainageAmount() {
		return drainageAmount;
	}
	public void setDrainageAmount(String drainageAmount) {
		this.drainageAmount = drainageAmount;
	}
	public String getDrainageBUN() {
		return drainageBUN;
	}
	public void setDrainageBUN(String drainageBUN) {
		this.drainageBUN = drainageBUN;
	}
	public String getDrainageCr() {
		return drainageCr;
	}
	public void setDrainageCr(String drainageCr) {
		this.drainageCr = drainageCr;
	}
	public String getSerumBUN() {
		return serumBUN;
	}
	public void setSerumBUN(String serumBUN) {
		this.serumBUN = serumBUN;
	}
	public String getSerumCr() {
		return serumCr;
	}
	public void setSerumCr(String serumCr) {
		this.serumCr = serumCr;
	}
	public String getResidualRenalCcr() {
		return residualRenalCcr;
	}
	public void setResidualRenalCcr(String residualRenalCcr) {
		this.residualRenalCcr = residualRenalCcr;
	}
	public String getPeritonealDialysisCcr() {
		return peritonealDialysisCcr;
	}
	public void setPeritonealDialysisCcr(String peritonealDialysisCcr) {
		this.peritonealDialysisCcr = peritonealDialysisCcr;
	}
	public String getTotalCcr() {
		return totalCcr;
	}
	public void setTotalCcr(String totalCcr) {
		this.totalCcr = totalCcr;
	}
	public String getResidualRenalKt() {
		return residualRenalKt;
	}
	public void setResidualRenalKt(String residualRenalKt) {
		this.residualRenalKt = residualRenalKt;
	}
	public String getPeritonealDialysisKt() {
		return peritonealDialysisKt;
	}
	public void setPeritonealDialysisKt(String peritonealDialysisKt) {
		this.peritonealDialysisKt = peritonealDialysisKt;
	}
	public String getTotalKt() {
		return totalKt;
	}
	public void setTotalKt(String totalKt) {
		this.totalKt = totalKt;
	}
	public String geteGFR() {
		return eGFR;
	}
	public void seteGFR(String eGFR) {
		this.eGFR = eGFR;
	}
	public String getnPCR() {
		return nPCR;
	}
	public void setnPCR(String nPCR) {
		this.nPCR = nPCR;
	}
	
}
