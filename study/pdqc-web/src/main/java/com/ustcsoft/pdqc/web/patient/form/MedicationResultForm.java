package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

public class MedicationResultForm extends WebBaseForm{
    
    // 用药处方
    private String id;
    // 患者姓名
    private String patientName;
    // 所属医院
    private String hospitalName;
    // 所属医院No
    private String hpId;
    // 患者id
    private String ptId;
    // 患者类型
    private String patientOutcome;
    // 患者类型名称
    private String patientOutcomeName;
    // 日期
    private Date tdate;
    // 日期string
    private String tdateStr;
    // 类型
    private String type;
    // 类型2
    private String type2;
    // 类型3
    private String type3;
    // 医嘱名称
    private String drugName;
    // 频次
    private String frequency;
    // 用法
    private String method;
    // 用量
    private String singleDose;
    // 用量单位
    private String unitName;
    
   
    /**
     * @return the tdateStr
     */
    public String getTdateStr() {
        return tdateStr;
    }
    /**
     * @param tdateStr the tdateStr to set
     */
    public void setTdateStr(String tdateStr) {
        this.tdateStr = tdateStr;
    }
    /**
     * @return the ptId
     */
    public String getPtId() {
        return ptId;
    }
    /**
     * @param ptId the ptId to set
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
    }
    /**
     * @return the hpId
     */
    public String getHpId() {
        return hpId;
    }
    /**
     * @param hpId the hpId to set
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the patientOutcomeName
     */
    public String getPatientOutcomeName() {
        return patientOutcomeName;
    }
    /**
     * @param patientOutcomeName the patientOutcomeName to set
     */
    public void setPatientOutcomeName(String patientOutcomeName) {
        this.patientOutcomeName = patientOutcomeName;
    }
    /** 
     * @return the hospitalName
     */
    public String getHospitalName() {
        return hospitalName;
    }
    /**
     * @return the type2
     */
    public String getType2() {
        return type2;
    }
    /**
     * @param type2 the type2 to set
     */
    public void setType2(String type2) {
        this.type2 = type2;
    }
    /**
     * @return the type3
     */
    public String getType3() {
        return type3;
    }
    /**
     * @param type3 the type3 to set
     */
    public void setType3(String type3) {
        this.type3 = type3;
    }
    /**
     * @param hospitalName the hospitalName to set
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    /**
     * @return the patientOutcome
     */
    public String getPatientOutcome() {
        return patientOutcome;
    }
    /**
     * @param patientOutcome the patientOutcome to set
     */
    public void setPatientOutcome(String patientOutcome) {
        this.patientOutcome = patientOutcome;
    }
    /**
     * @return the unitName
     */
    public String getUnitName() {
        return unitName;
    }
    /**
     * @param unitName the unitName to set
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    /**
     * @return the patientName
     */
    public String getPatientName() {
        return patientName;
    }
    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    /**
     * @return the tdate
     */
    public Date getTdate() {
        return tdate;
    }
    /**
     * @param tdate the tdate to set
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return the drugName
     */
    public String getDrugName() {
        return drugName;
    }
    /**
     * @param drugName the drugName to set
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    /**
     * @return the frequency
     */
    public String getFrequency() {
        return frequency;
    }
    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    /**
     * @return the method
     */
    public String getMethod() {
        return method;
    }
    /**
     * @param method the method to set
     */
    public void setMethod(String method) {
        this.method = method;
    }
    /**
     * @return the singleDose
     */
    public String getSingleDose() {
        return singleDose;
    }
    /**
     * @param singleDose the singleDose to set
     */
    public void setSingleDose(String singleDose) {
        this.singleDose = singleDose;
    }

}
