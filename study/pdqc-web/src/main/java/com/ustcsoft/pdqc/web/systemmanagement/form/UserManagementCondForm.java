package com.ustcsoft.pdqc.web.systemmanagement.form;

import java.util.List;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

public class UserManagementCondForm extends WebBaseCondForm {

    
    // 用户编号
    private String userNo;
    // 角色编号
    private String roleNo;
    // 登录名
    private String loginName;
    // 真实姓名
    private String userRealName;
    // 用户类型
    private String userType;
    // 手机号码
    private String phoneNum;
    // 当前机构编号
    private String currentNode;
    // 机构编号列表
    private List<String> orgNoList;
    // 用户列表
    private List<String> userNoList;
    
    /**
     * @return the userNoList
     */
    public List<String> getUserNoList() {
        return userNoList;
    }
    /**
     * @param userNoList the userNoList to set
     */
    public void setUserNoList(List<String> userNoList) {
        this.userNoList = userNoList;
    }
    /**
     * @return the roleNo
     */
    public String getRoleNo() {
        return roleNo;
    }
    /**
     * @param roleNo the roleNo to set
     */
    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
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
     * @return the orgNoList
     */
    public List<String> getOrgNoList() {
        return orgNoList;
    }
    /**
     * @param orgNoList the orgNoList to set
     */
    public void setOrgNoList(List<String> orgNoList) {
        this.orgNoList = orgNoList;
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
     * @return the currentNode
     */
    public String getCurrentNode() {
        return currentNode;
    }
    /**
     * @param currentNode the currentNode to set
     */
    public void setCurrentNode(String currentNode) {
        this.currentNode = currentNode;
    }
}
