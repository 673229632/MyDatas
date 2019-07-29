//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMExamineSchedulezj extends PdMExamineSchedulezjKey implements AutoGenEntity {
    /**
     * 专家编号 (pd_m_examine_schedulezj.specialist_no)
     */
    private String specialistNo;

    /**
     *  (pd_m_examine_schedulezj.execute_time_no)
     */
    private String executeTimeNo;

    /**
     * 删除标志 (pd_m_examine_schedulezj.del_flag)
     */
    private String delFlag;

    /**
     * 表示顺序 (pd_m_examine_schedulezj.order_index)
     */
    private Long orderIndex;

    /**
     * 登录人 (pd_m_examine_schedulezj.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_m_examine_schedulezj.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_m_examine_schedulezj.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_m_examine_schedulezj.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_m_examine_schedulezj.row_version)
     */
    private Long rowVersion;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：专家编号 (pd_m_examine_schedulezj.specialist_no)
     *
     * @return specialistNo String
     */
    public String getSpecialistNo() {
        return specialistNo;
    }

    /**
     * 设定：专家编号 (pd_m_examine_schedulezj.specialist_no)
     *
     * @param specialistNo String
     */
    public void setSpecialistNo(String specialistNo) {
        this.specialistNo = specialistNo;
        this._selectiveMark.put("specialistNo", true);
    }

    /**
     * 取得： (pd_m_examine_schedulezj.execute_time_no)
     *
     * @return executeTimeNo String
     */
    public String getExecuteTimeNo() {
        return executeTimeNo;
    }

    /**
     * 设定： (pd_m_examine_schedulezj.execute_time_no)
     *
     * @param executeTimeNo String
     */
    public void setExecuteTimeNo(String executeTimeNo) {
        this.executeTimeNo = executeTimeNo;
        this._selectiveMark.put("executeTimeNo", true);
    }

    /**
     * 取得：删除标志 (pd_m_examine_schedulezj.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_m_examine_schedulezj.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：表示顺序 (pd_m_examine_schedulezj.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (pd_m_examine_schedulezj.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：登录人 (pd_m_examine_schedulezj.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_m_examine_schedulezj.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_m_examine_schedulezj.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_m_examine_schedulezj.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_m_examine_schedulezj.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_m_examine_schedulezj.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_m_examine_schedulezj.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_m_examine_schedulezj.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_m_examine_schedulezj.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_m_examine_schedulezj.row_version)
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