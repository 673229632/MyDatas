package com.ustcsoft.pdqc.web.workstation.form;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class IntegrityResultForm extends BaseEntity {
    private String orgNo;
    // 透析中心名称
    private String txCenterName;

    // 患者保有量
    private String patientRetention;
    // 原发病诊断
    private String primaryDisease;
    // 血管通路
    private String vascularAccess;
    // 透析处方
    private String dialysisPrescription;
    // 血压测量
    private String bloodMeasure;
    // 透析充分性
    private String dialysisAdequacy;
    // 抗凝剂
    private String anticoagulant;
    // 干体重
    private String dryWeight;
    // 治疗信息
    private String treatmentInformation;
    // 实验室检查
    private String laboratoryExamination;
    /**
     * @return the orgNo
     */
    public String getOrgNo() {
        return orgNo;
    }
    /**
     * @param orgNo the orgNo to set
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }
    /**
     * @return the txCenterName
     */
    public String getTxCenterName() {
        return txCenterName;
    }
    /**
     * @param txCenterName the txCenterName to set
     */
    public void setTxCenterName(String txCenterName) {
        this.txCenterName = txCenterName;
    }
    /**
     * @return the patientRetention
     */
    public String getPatientRetention() {
        return patientRetention;
    }
    /**
     * @param patientRetention the patientRetention to set
     */
    public void setPatientRetention(String patientRetention) {
        this.patientRetention = patientRetention;
    }
    /**
     * @return the primaryDisease
     */
    public String getPrimaryDisease() {
        return primaryDisease;
    }
    /**
     * @param primaryDisease the primaryDisease to set
     */
    public void setPrimaryDisease(String primaryDisease) {
        this.primaryDisease = primaryDisease;
    }
    /**
     * @return the vascularAccess
     */
    public String getVascularAccess() {
        return vascularAccess;
    }
    /**
     * @param vascularAccess the vascularAccess to set
     */
    public void setVascularAccess(String vascularAccess) {
        this.vascularAccess = vascularAccess;
    }
    /**
     * @return the dialysisPrescription
     */
    public String getDialysisPrescription() {
        return dialysisPrescription;
    }
    /**
     * @param dialysisPrescription the dialysisPrescription to set
     */
    public void setDialysisPrescription(String dialysisPrescription) {
        this.dialysisPrescription = dialysisPrescription;
    }
    /**
     * @return the bloodMeasure
     */
    public String getBloodMeasure() {
        return bloodMeasure;
    }
    /**
     * @param bloodMeasure the bloodMeasure to set
     */
    public void setBloodMeasure(String bloodMeasure) {
        this.bloodMeasure = bloodMeasure;
    }
    /**
     * @return the dialysisAdequacy
     */
    public String getDialysisAdequacy() {
        return dialysisAdequacy;
    }
    /**
     * @param dialysisAdequacy the dialysisAdequacy to set
     */
    public void setDialysisAdequacy(String dialysisAdequacy) {
        this.dialysisAdequacy = dialysisAdequacy;
    }
    /**
     * @return the anticoagulant
     */
    public String getAnticoagulant() {
        return anticoagulant;
    }
    /**
     * @param anticoagulant the anticoagulant to set
     */
    public void setAnticoagulant(String anticoagulant) {
        this.anticoagulant = anticoagulant;
    }
    /**
     * @return the dryWeight
     */
    public String getDryWeight() {
        return dryWeight;
    }
    /**
     * @param dryWeight the dryWeight to set
     */
    public void setDryWeight(String dryWeight) {
        this.dryWeight = dryWeight;
    }
    /**
     * @return the treatmentInformation
     */
    public String getTreatmentInformation() {
        return treatmentInformation;
    }
    /**
     * @param treatmentInformation the treatmentInformation to set
     */
    public void setTreatmentInformation(String treatmentInformation) {
        this.treatmentInformation = treatmentInformation;
    }
    /**
     * @return the laboratoryExamination
     */
    public String getLaboratoryExamination() {
        return laboratoryExamination;
    }
    /**
     * @param laboratoryExamination the laboratoryExamination to set
     */
    public void setLaboratoryExamination(String laboratoryExamination) {
        this.laboratoryExamination = laboratoryExamination;
    }
    
}
