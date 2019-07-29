//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientOutcome extends PdDPatientOutcomeKey implements AutoGenEntity {
    /**
     *  (PD_D_PATIENT_OUTCOME.hp_id)
     */
    private String hpId;

    /**
     *  (PD_D_PATIENT_OUTCOME.pt_id)
     */
    private String ptId;

    /**
     *  (PD_D_PATIENT_OUTCOME.tdate)
     */
    private Date tdate;

    /**
     *  (PD_D_PATIENT_OUTCOME.outcome_type)
     */
    private String outcomeType;

    /**
     *  (PD_D_PATIENT_OUTCOME.reason)
     */
    private String reason;

    /**
     * 删除标志 (PD_D_PATIENT_OUTCOME.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_D_PATIENT_OUTCOME.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_D_PATIENT_OUTCOME.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_D_PATIENT_OUTCOME.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_D_PATIENT_OUTCOME.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_D_PATIENT_OUTCOME.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (PD_D_PATIENT_OUTCOME.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (PD_D_PATIENT_OUTCOME.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTCOME.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTCOME.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTCOME.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTCOME.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTCOME.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTCOME.outcome_type)
     *
     * @return outcomeType String
     */
    public String getOutcomeType() {
        return outcomeType;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTCOME.outcome_type)
     *
     * @param outcomeType String
     */
    public void setOutcomeType(String outcomeType) {
        this.outcomeType = outcomeType;
        this._selectiveMark.put("outcomeType", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTCOME.reason)
     *
     * @return reason String
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTCOME.reason)
     *
     * @param reason String
     */
    public void setReason(String reason) {
        this.reason = reason;
        this._selectiveMark.put("reason", true);
    }

    /**
     * 取得：删除标志 (PD_D_PATIENT_OUTCOME.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_D_PATIENT_OUTCOME.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_D_PATIENT_OUTCOME.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_D_PATIENT_OUTCOME.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_D_PATIENT_OUTCOME.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_D_PATIENT_OUTCOME.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_D_PATIENT_OUTCOME.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_D_PATIENT_OUTCOME.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_D_PATIENT_OUTCOME.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_D_PATIENT_OUTCOME.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_D_PATIENT_OUTCOME.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_D_PATIENT_OUTCOME.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (PD_D_PATIENT_OUTCOME.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (PD_D_PATIENT_OUTCOME.screen_id)
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