//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMRole extends PdMRoleKey implements AutoGenEntity {
    /**
     * 角色名称 (PD_M_ROLE.role_name)
     */
    private String roleName;

    /**
     * 组织机构编号 (PD_M_ROLE.org_no)
     */
    private String orgNo;

    /**
     * 角色标志 (PD_M_ROLE.role_flag)
     */
    private String roleFlag;

    /**
     * 角色说明 (PD_M_ROLE.role_desp)
     */
    private String roleDesp;

    /**
     * 表示顺序 (PD_M_ROLE.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (PD_M_ROLE.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_M_ROLE.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_M_ROLE.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_M_ROLE.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_M_ROLE.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_M_ROLE.row_version)
     */
    private Long rowVersion;

    /**
     * 画面ID (PD_M_ROLE.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：角色名称 (PD_M_ROLE.role_name)
     *
     * @return roleName String
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设定：角色名称 (PD_M_ROLE.role_name)
     *
     * @param roleName String
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
        this._selectiveMark.put("roleName", true);
    }

    /**
     * 取得：组织机构编号 (PD_M_ROLE.org_no)
     *
     * @return orgNo String
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设定：组织机构编号 (PD_M_ROLE.org_no)
     *
     * @param orgNo String
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        this._selectiveMark.put("orgNo", true);
    }

    /**
     * 取得：角色标志 (PD_M_ROLE.role_flag)
     *
     * @return roleFlag String
     */
    public String getRoleFlag() {
        return roleFlag;
    }

    /**
     * 设定：角色标志 (PD_M_ROLE.role_flag)
     *
     * @param roleFlag String
     */
    public void setRoleFlag(String roleFlag) {
        this.roleFlag = roleFlag;
        this._selectiveMark.put("roleFlag", true);
    }

    /**
     * 取得：角色说明 (PD_M_ROLE.role_desp)
     *
     * @return roleDesp String
     */
    public String getRoleDesp() {
        return roleDesp;
    }

    /**
     * 设定：角色说明 (PD_M_ROLE.role_desp)
     *
     * @param roleDesp String
     */
    public void setRoleDesp(String roleDesp) {
        this.roleDesp = roleDesp;
        this._selectiveMark.put("roleDesp", true);
    }

    /**
     * 取得：表示顺序 (PD_M_ROLE.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (PD_M_ROLE.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (PD_M_ROLE.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_M_ROLE.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_M_ROLE.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_M_ROLE.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_M_ROLE.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_M_ROLE.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_M_ROLE.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_M_ROLE.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_M_ROLE.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_M_ROLE.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_M_ROLE.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_M_ROLE.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (PD_M_ROLE.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (PD_M_ROLE.screen_id)
     *
     * @param screenId String
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
        this._selectiveMark.put("screenId", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}