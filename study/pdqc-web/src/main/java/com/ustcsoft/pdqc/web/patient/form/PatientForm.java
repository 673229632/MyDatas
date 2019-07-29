
package com.ustcsoft.pdqc.web.patient.form;

import java.util.List;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

/**
 * @author lijun 患者基本信息
 */
public class PatientForm extends WebBaseCondForm {

    /**
     * 
     */
    private static final long serialVersionUID = 8891171384987104955L;

    // 患者id
    private String patientId;

    // 所属医院
    private String hospitalNo;
    
    // 所属医院名称
    private String hospitalName;

    // 患者姓名
    private String patientName;

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

    // 患者类型
    private String outComeType;
    
    private List<String> outComeTypes;

    private String rowVersion;

    /**
     * @return the hospitalName
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName the hospitalName to set
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    public List<String> getOutComeTypes() {
		return outComeTypes;
	}

	public void setOutComeTypes(List<String> outComeTypes) {
		this.outComeTypes = outComeTypes;
	}

	public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPdNo() {
        return pdNo;
    }

    public void setPdNo(String pdNo) {
        this.pdNo = pdNo;
    }

    public String getFirstDialsysDate() {
        return firstDialsysDate;
    }

    public void setFirstDialsysDate(String firstDialsysDate) {
        this.firstDialsysDate = firstDialsysDate;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getInfectionDiseases() {
        return infectionDiseases;
    }

    public void setInfectionDiseases(String infectionDiseases) {
        this.infectionDiseases = infectionDiseases;
    }

    public String getPrimaryDisease() {
        return primaryDisease;
    }

    public void setPrimaryDisease(String primaryDisease) {
        this.primaryDisease = primaryDisease;
    }

    public String getPrimaryDiseaseDate() {
        return primaryDiseaseDate;
    }

    public void setPrimaryDiseaseDate(String primaryDiseaseDate) {
        this.primaryDiseaseDate = primaryDiseaseDate;
    }

    public String getPathologic() {
        return pathologic;
    }

    public void setPathologic(String pathologic) {
        this.pathologic = pathologic;
    }

    public String getMedicalHistory1() {
        return medicalHistory1;
    }

    public void setMedicalHistory1(String medicalHistory1) {
        this.medicalHistory1 = medicalHistory1;
    }

    public String getMedicalHistory2() {
        return medicalHistory2;
    }

    public void setMedicalHistory2(String medicalHistory2) {
        this.medicalHistory2 = medicalHistory2;
    }

    public String getMedicalHistory3() {
        return medicalHistory3;
    }

    public void setMedicalHistory3(String medicalHistory3) {
        this.medicalHistory3 = medicalHistory3;
    }

    public String getMedicalHistory4() {
        return medicalHistory4;
    }

    public void setMedicalHistory4(String medicalHistory4) {
        this.medicalHistory4 = medicalHistory4;
    }

    public String getOutComeType() {
        return outComeType;
    }

    public void setOutComeType(String outComeType) {
        this.outComeType = outComeType;
    }

    /**
     * rowVersion的GET方法.
     *
     * @return rowVersion
     */
    public String getRowVersion() {
        return rowVersion;
    }

    /**
     * rowVersion的SET方法.
     *
     * @param rowVersion rowVersion
     */
    public void setRowVersion(String rowVersion) {
        this.rowVersion = rowVersion;
    }

}
