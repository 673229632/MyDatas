package com.ustcsoft.pdqc.web.systemmanagement.form;

import java.util.List;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;

public class RoleManagementCondForm extends WebBaseCondForm{
    // 角色名称
    private String roleName;
    // 所属组织
    private String orgNo;
    // 所属组织List
    private List<String> orgNoList;
    // 角色编号
    private String roleNo;
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
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }
    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
}
