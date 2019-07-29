//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MTitle extends MTitleKey implements AutoGenEntity {
    /**
     * 职称名称 (m_title.title_name)
     */
    private String titleName;

    /**
     * 职称说明 (m_title.title_desp)
     */
    private String titleDesp;

    /**
     * 表示顺序 (m_title.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (m_title.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (m_title.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (m_title.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (m_title.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (m_title.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (m_title.row_version)
     */
    private Long rowVersion;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：职称名称 (m_title.title_name)
     *
     * @return titleName String
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * 设定：职称名称 (m_title.title_name)
     *
     * @param titleName String
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
        this._selectiveMark.put("titleName", true);
    }

    /**
     * 取得：职称说明 (m_title.title_desp)
     *
     * @return titleDesp String
     */
    public String getTitleDesp() {
        return titleDesp;
    }

    /**
     * 设定：职称说明 (m_title.title_desp)
     *
     * @param titleDesp String
     */
    public void setTitleDesp(String titleDesp) {
        this.titleDesp = titleDesp;
        this._selectiveMark.put("titleDesp", true);
    }

    /**
     * 取得：表示顺序 (m_title.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (m_title.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (m_title.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (m_title.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (m_title.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (m_title.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (m_title.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (m_title.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (m_title.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (m_title.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (m_title.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (m_title.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (m_title.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (m_title.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}