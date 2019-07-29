package com.ustcsoft.pdqc.web.systemmanagement.form;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class RoleManagementResultForm extends BaseEntity {

    // 角色编号
    private String roleNo;
    // 角色名称
    private String roleName;
    // 透析中心名称
    private String pdCenterName;
    // 质控中心名称
    private String qcCenterName;
    // 所属组织
    private String orgName;
    // 所属组织编号
    private String orgNo;
    // 备注
    private String roleDesp;
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
     * @return the roleDesp
     */
    public String getRoleDesp() {
        return roleDesp;
    }
    /**
     * @param roleDesp the roleDesp to set
     */
    public void setRoleDesp(String roleDesp) {
        this.roleDesp = roleDesp;
    }
}
