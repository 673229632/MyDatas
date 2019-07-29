package com.ustcsoft.pdqc.web.workstation.form;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class OrgResultForm extends BaseEntity {

    // 机构中心编号
    private String orgNo;
    // 机构编号
    private String orgIndex;
    // 透析中心名称
    private String txCenterName;
    // 医生人数
    private int doctorNum;
    // 护士人数
    private int nurseNum;
    // 工程师人数
    private int engineerNum;
    // 所有患者
    private int allPatient;
    // 患者保有量
    private int patientRetention;
    
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
     * @return the orgIndex
     */
    public String getOrgIndex() {
        return orgIndex;
    }
    /**
     * @param orgIndex the orgIndex to set
     */
    public void setOrgIndex(String orgIndex) {
        this.orgIndex = orgIndex;
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
     * @return the doctorNum
     */
    public int getDoctorNum() {
        return doctorNum;
    }
    /**
     * @param doctorNum the doctorNum to set
     */
    public void setDoctorNum(int doctorNum) {
        this.doctorNum = doctorNum;
    }
    /**
     * @return the nurseNum
     */
    public int getNurseNum() {
        return nurseNum;
    }
    /**
     * @param nurseNum the nurseNum to set
     */
    public void setNurseNum(int nurseNum) {
        this.nurseNum = nurseNum;
    }
    /**
     * @return the engineerNum
     */
    public int getEngineerNum() {
        return engineerNum;
    }
    /**
     * @param engineerNum the engineerNum to set
     */
    public void setEngineerNum(int engineerNum) {
        this.engineerNum = engineerNum;
    }
    /**
     * @return the allPatient
     */
    public int getAllPatient() {
        return allPatient;
    }
    /**
     * @param allPatient the allPatient to set
     */
    public void setAllPatient(int allPatient) {
        this.allPatient = allPatient;
    }
    /**
     * @return the patientRetention
     */
    public int getPatientRetention() {
        return patientRetention;
    }
    /**
     * @param patientRetention the patientRetention to set
     */
    public void setPatientRetention(int patientRetention) {
        this.patientRetention = patientRetention;
    }
    
    
    
}
