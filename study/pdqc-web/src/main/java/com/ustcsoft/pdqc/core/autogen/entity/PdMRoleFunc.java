//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMRoleFunc extends PdMRoleFuncKey implements AutoGenEntity {
    /**
     * 表示顺序 (PD_M_ROLE_FUNC.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (PD_M_ROLE_FUNC.del_flag)
     */
    private String delFlag;

    /**
     * 记录创建时间 (PD_M_ROLE_FUNC.date_created)
     */
    private Date dateCreated;

    /**
     * 记录修改时间 (PD_M_ROLE_FUNC.date_modified)
     */
    private Date dateModified;

    /**
     * 记录创建人 (PD_M_ROLE_FUNC.created_by)
     */
    private String createdBy;

    /**
     * 记录修改人 (PD_M_ROLE_FUNC.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：表示顺序 (PD_M_ROLE_FUNC.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (PD_M_ROLE_FUNC.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (PD_M_ROLE_FUNC.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_M_ROLE_FUNC.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：记录创建时间 (PD_M_ROLE_FUNC.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：记录创建时间 (PD_M_ROLE_FUNC.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：记录修改时间 (PD_M_ROLE_FUNC.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：记录修改时间 (PD_M_ROLE_FUNC.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：记录创建人 (PD_M_ROLE_FUNC.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：记录创建人 (PD_M_ROLE_FUNC.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：记录修改人 (PD_M_ROLE_FUNC.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：记录修改人 (PD_M_ROLE_FUNC.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}