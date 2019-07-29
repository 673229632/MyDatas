package com.ustcsoft.pdqc.web.systemmanagement.form;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class UserManagementForm extends BaseEntity{

    private String userNo;
    
    private String loginName;
    
    private String userRealName;
    
    private String phoneNum;
    
    private String userType;
    
    private String userTypeName;
    
    private String orgNo;
    
    private String employeeNo;
    
    private String employeeName;
    //质控中心名称
    private String qcCenterName;
    //血透中心名称
    private String pdCenterName;
    //质控/血透中心名称
    private String orgName;

    /**
     * @return the phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @return the qcCenterName
     */
    public String getQcCenterName() {
        return qcCenterName;
    }

    /**
     * @param qcCenterName the qcCenterName to set
     */
    public void setQcCenterName(String qcCenterName) {
        this.qcCenterName = qcCenterName;
    }

    /**
     * @return the pdCenterName
     */
    public String getPdCenterName() {
        return pdCenterName;
    }

    /**
     * @param pdCenterName the pdCenterName to set
     */
    public void setPdCenterName(String pdCenterName) {
        this.pdCenterName = pdCenterName;
    }

    /**
     * @return the orgName
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName the orgName to set
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return the userTypeName
     */
    public String getUserTypeName() {
        return userTypeName;
    }

    /**
     * @param userTypeName the userTypeName to set
     */
    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    /**
     * @return the userNo
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo the userNo to set
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * @return the loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * @param loginName the loginName to set
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * @return the userRealName
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * @param userRealName the userRealName to set
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

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
     * @return the employeeNo
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * @param employeeNo the employeeNo to set
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
