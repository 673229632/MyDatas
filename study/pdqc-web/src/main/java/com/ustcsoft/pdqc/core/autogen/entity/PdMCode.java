//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMCode extends PdMCodeKey implements AutoGenEntity {
    /**
     * 0:所有组织机构适用，组织机构id:适用于特定组织机构 (PD_M_CODE.org_id)
     */
    private String orgId;

    /**
     *  (PD_M_CODE.value)
     */
    private String value;

    /**
     *  (PD_M_CODE.description)
     */
    private String description;

    /**
     *  (PD_M_CODE.others)
     */
    private String others;

    /**
     * 删除标志 (PD_M_CODE.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_M_CODE.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_M_CODE.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_M_CODE.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_M_CODE.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_M_CODE.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (PD_M_CODE.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：0:所有组织机构适用，组织机构id:适用于特定组织机构 (PD_M_CODE.org_id)
     *
     * @return orgId String
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设定：0:所有组织机构适用，组织机构id:适用于特定组织机构 (PD_M_CODE.org_id)
     *
     * @param orgId String
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
        this._selectiveMark.put("orgId", true);
    }

    /**
     * 取得： (PD_M_CODE.value)
     *
     * @return value String
     */
    public String getValue() {
        return value;
    }

    /**
     * 设定： (PD_M_CODE.value)
     *
     * @param value String
     */
    public void setValue(String value) {
        this.value = value;
        this._selectiveMark.put("value", true);
    }

    /**
     * 取得： (PD_M_CODE.description)
     *
     * @return description String
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设定： (PD_M_CODE.description)
     *
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
        this._selectiveMark.put("description", true);
    }

    /**
     * 取得： (PD_M_CODE.others)
     *
     * @return others String
     */
    public String getOthers() {
        return others;
    }

    /**
     * 设定： (PD_M_CODE.others)
     *
     * @param others String
     */
    public void setOthers(String others) {
        this.others = others;
        this._selectiveMark.put("others", true);
    }

    /**
     * 取得：删除标志 (PD_M_CODE.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_M_CODE.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_M_CODE.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_M_CODE.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_M_CODE.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_M_CODE.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_M_CODE.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_M_CODE.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_M_CODE.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_M_CODE.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_M_CODE.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_M_CODE.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (PD_M_CODE.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (PD_M_CODE.screen_id)
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