package com.ustcsoft.pdqc.web.workstation.form;

import java.util.Date;
import java.util.List;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

public class OrgCondForm extends WebBaseCondForm {

    // 机构信息列表
    private List<String> orgList;
    // 医生code
    private String doctorCode;
    // 护士code
    private String nurseCode;
    // 工程师code
    private String engineerCode;
    // 转归code
    private String outcomeCode;
    // 首次透析日大于90天
    private Date threeMonthAgoDate; 
    // 机构类型
    private String orgType;

    /**
     * @return the doctorCode
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * @param doctorCode the doctorCode to set
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    /**
     * @return the nurseCode
     */
    public String getNurseCode() {
        return nurseCode;
    }

    /**
     * @param nurseCode the nurseCode to set
     */
    public void setNurseCode(String nurseCode) {
        this.nurseCode = nurseCode;
    }

    /**
     * @return the engineerCode
     */
    public String getEngineerCode() {
        return engineerCode;
    }

    /**
     * @param engineerCode the engineerCode to set
     */
    public void setEngineerCode(String engineerCode) {
        this.engineerCode = engineerCode;
    }

    /**
     * @return the outcomeCode
     */
    public String getOutcomeCode() {
        return outcomeCode;
    }

    /**
     * @param outcomeCode the outcomeCode to set
     */
    public void setOutcomeCode(String outcomeCode) {
        this.outcomeCode = outcomeCode;
    }

    /**
     * @return the threeMonthAgoDate
     */
    public Date getThreeMonthAgoDate() {
        return threeMonthAgoDate;
    }

    /**
     * @param threeMonthAgoDate the threeMonthAgoDate to set
     */
    public void setThreeMonthAgoDate(Date threeMonthAgoDate) {
        this.threeMonthAgoDate = threeMonthAgoDate;
    }

    /**
     * @return the orgType
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * @param orgType the orgType to set
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * @return the orgList
     */
    public List<String> getOrgList() {
        return orgList;
    }

    /**
     * @param orgList the orgList to set
     */
    public void setOrgList(List<String> orgList) {
        this.orgList = orgList;
    }
    
}
