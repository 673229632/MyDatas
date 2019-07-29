//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientInspectionElectrocardiogram extends PdDPatientInspectionElectrocardiogramKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_inspection_electrocardiogram.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_inspection_electrocardiogram.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_inspection_electrocardiogram.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_inspection_electrocardiogram.diagnosis)
     */
    private String diagnosis;

    /**
     *  (pd_d_patient_inspection_electrocardiogram.others)
     */
    private String others;

    /**
     * 删除标志 (pd_d_patient_inspection_electrocardiogram.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_inspection_electrocardiogram.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_inspection_electrocardiogram.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_inspection_electrocardiogram.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_inspection_electrocardiogram.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_inspection_electrocardiogram.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_inspection_electrocardiogram.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_inspection_electrocardiogram.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_inspection_electrocardiogram.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_electrocardiogram.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_inspection_electrocardiogram.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_electrocardiogram.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_inspection_electrocardiogram.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_electrocardiogram.diagnosis)
     *
     * @return diagnosis String
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * 设定： (pd_d_patient_inspection_electrocardiogram.diagnosis)
     *
     * @param diagnosis String
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        this._selectiveMark.put("diagnosis", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_electrocardiogram.others)
     *
     * @return others String
     */
    public String getOthers() {
        return others;
    }

    /**
     * 设定： (pd_d_patient_inspection_electrocardiogram.others)
     *
     * @param others String
     */
    public void setOthers(String others) {
        this.others = others;
        this._selectiveMark.put("others", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_inspection_electrocardiogram.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_inspection_electrocardiogram.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_inspection_electrocardiogram.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_inspection_electrocardiogram.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_inspection_electrocardiogram.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_inspection_electrocardiogram.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_inspection_electrocardiogram.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_inspection_electrocardiogram.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_inspection_electrocardiogram.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_inspection_electrocardiogram.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_inspection_electrocardiogram.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_inspection_electrocardiogram.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_inspection_electrocardiogram.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_inspection_electrocardiogram.screen_id)
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