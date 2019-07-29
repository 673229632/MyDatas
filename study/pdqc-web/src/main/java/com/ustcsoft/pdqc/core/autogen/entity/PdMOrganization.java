//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMOrganization extends PdMOrganizationKey implements AutoGenEntity {
    /**
     * 组织机构类别（1：qc 2:透析中心） (pd_m_organization.org_type)
     */
    private String orgType;

    /**
     * 上级组织机构编码 (pd_m_organization.parent_no)
     */
    private String parentNo;

    /**
     * 机构等级(1.省级别2.市级别.3.市级别透析中心) (pd_m_organization.org_lvl)
     */
    private String orgLvl;

    /**
     * 表示顺序 (pd_m_organization.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (pd_m_organization.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_m_organization.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_m_organization.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_m_organization.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_m_organization.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_m_organization.row_version)
     */
    private Long rowVersion;

    /**
     * 画面ID (pd_m_organization.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：组织机构类别（1：qc 2:透析中心） (pd_m_organization.org_type)
     *
     * @return orgType String
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 设定：组织机构类别（1：qc 2:透析中心） (pd_m_organization.org_type)
     *
     * @param orgType String
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
        this._selectiveMark.put("orgType", true);
    }

    /**
     * 取得：上级组织机构编码 (pd_m_organization.parent_no)
     *
     * @return parentNo String
     */
    public String getParentNo() {
        return parentNo;
    }

    /**
     * 设定：上级组织机构编码 (pd_m_organization.parent_no)
     *
     * @param parentNo String
     */
    public void setParentNo(String parentNo) {
        this.parentNo = parentNo;
        this._selectiveMark.put("parentNo", true);
    }

    /**
     * 取得：机构等级(1.省级别2.市级别.3.市级别透析中心) (pd_m_organization.org_lvl)
     *
     * @return orgLvl String
     */
    public String getOrgLvl() {
        return orgLvl;
    }

    /**
     * 设定：机构等级(1.省级别2.市级别.3.市级别透析中心) (pd_m_organization.org_lvl)
     *
     * @param orgLvl String
     */
    public void setOrgLvl(String orgLvl) {
        this.orgLvl = orgLvl;
        this._selectiveMark.put("orgLvl", true);
    }

    /**
     * 取得：表示顺序 (pd_m_organization.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (pd_m_organization.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (pd_m_organization.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_m_organization.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_m_organization.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_m_organization.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_m_organization.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_m_organization.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_m_organization.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_m_organization.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_m_organization.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_m_organization.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_m_organization.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_m_organization.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_m_organization.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_m_organization.screen_id)
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