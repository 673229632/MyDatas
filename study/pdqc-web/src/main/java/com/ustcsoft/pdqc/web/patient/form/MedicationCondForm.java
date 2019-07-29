package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

public class MedicationCondForm extends WebBaseCondForm{// 患者id
    private String patientId;

    // 所属医院
    private String hospitalNo;

    // 患者姓名
    private String patientName;
    
    // 用药处方Id
    private String medicationId;

    // 身份证号码
    private String idCard;

    // 腹透号
    private String pdNo;

    // 首次腹透日
    private String firstDialsysDate;

    // 生日
    private String birthDay;

    // 身高
    private String height;

    // 联系方式
    private String phoneNo;

    // 家庭住址
    private String address;

    // 过敏症
    private String allergy;

    // 传染病
    private String infectionDiseases;

    // 肾原发病
    private String primaryDisease;

    // 确诊时间
    private String primaryDiseaseDate;

    // 病理型
    private String pathologic;

    // 心血管
    private String medicalHistory1;

    // 神经系统
    private String medicalHistory2;

    // 内分泌及代谢
    private String medicalHistory3;

    // 其他
    private String medicalHistory4;

    // 转归类型
    private String outComeType;

    private String rowVersion;

    /**
     * @return the patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the hospitalNo
     */
    public String getHospitalNo() {
        return hospitalNo;
    }

    /**
     * @param hospitalNo the hospitalNo to set
     */
    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
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
     * @return the medicationId
     */
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * @param medicationId the medicationId to set
     */
    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    /**
     * @return the idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard the idCard to set
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * @return the pdNo
     */
    public String getPdNo() {
        return pdNo;
    }

    /**
     * @param pdNo the pdNo to set
     */
    public void setPdNo(String pdNo) {
        this.pdNo = pdNo;
    }

    /**
     * @return the firstDialsysDate
     */
    public String getFirstDialsysDate() {
        return firstDialsysDate;
    }

    /**
     * @param firstDialsysDate the firstDialsysDate to set
     */
    public void setFirstDialsysDate(String firstDialsysDate) {
        this.firstDialsysDate = firstDialsysDate;
    }

    /**
     * @return the birthDay
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the allergy
     */
    public String getAllergy() {
        return allergy;
    }

    /**
     * @param allergy the allergy to set
     */
    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    /**
     * @return the infectionDiseases
     */
    public String getInfectionDiseases() {
        return infectionDiseases;
    }

    /**
     * @param infectionDiseases the infectionDiseases to set
     */
    public void setInfectionDiseases(String infectionDiseases) {
        this.infectionDiseases = infectionDiseases;
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
     * @return the primaryDiseaseDate
     */
    public String getPrimaryDiseaseDate() {
        return primaryDiseaseDate;
    }

    /**
     * @param primaryDiseaseDate the primaryDiseaseDate to set
     */
    public void setPrimaryDiseaseDate(String primaryDiseaseDate) {
        this.primaryDiseaseDate = primaryDiseaseDate;
    }

    /**
     * @return the pathologic
     */
    public String getPathologic() {
        return pathologic;
    }

    /**
     * @param pathologic the pathologic to set
     */
    public void setPathologic(String pathologic) {
        this.pathologic = pathologic;
    }

    /**
     * @return the medicalHistory1
     */
    public String getMedicalHistory1() {
        return medicalHistory1;
    }

    /**
     * @param medicalHistory1 the medicalHistory1 to set
     */
    public void setMedicalHistory1(String medicalHistory1) {
        this.medicalHistory1 = medicalHistory1;
    }

    /**
     * @return the medicalHistory2
     */
    public String getMedicalHistory2() {
        return medicalHistory2;
    }

    /**
     * @param medicalHistory2 the medicalHistory2 to set
     */
    public void setMedicalHistory2(String medicalHistory2) {
        this.medicalHistory2 = medicalHistory2;
    }

    /**
     * @return the medicalHistory3
     */
    public String getMedicalHistory3() {
        return medicalHistory3;
    }

    /**
     * @param medicalHistory3 the medicalHistory3 to set
     */
    public void setMedicalHistory3(String medicalHistory3) {
        this.medicalHistory3 = medicalHistory3;
    }

    /**
     * @return the medicalHistory4
     */
    public String getMedicalHistory4() {
        return medicalHistory4;
    }

    /**
     * @param medicalHistory4 the medicalHistory4 to set
     */
    public void setMedicalHistory4(String medicalHistory4) {
        this.medicalHistory4 = medicalHistory4;
    }

    /**
     * @return the outComeType
     */
    public String getOutComeType() {
        return outComeType;
    }

    /**
     * @param outComeType the outComeType to set
     */
    public void setOutComeType(String outComeType) {
        this.outComeType = outComeType;
    }

    /**
     * @return the rowVersion
     */
    public String getRowVersion() {
        return rowVersion;
    }

    /**
     * @param rowVersion the rowVersion to set
     */
    public void setRowVersion(String rowVersion) {
        this.rowVersion = rowVersion;
    }
    }
