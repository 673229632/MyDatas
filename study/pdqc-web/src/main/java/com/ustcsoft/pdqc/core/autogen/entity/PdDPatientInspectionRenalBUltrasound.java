//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientInspectionRenalBUltrasound extends PdDPatientInspectionRenalBUltrasoundKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.rlength)
     */
    private String rlength;

    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.rwidth)
     */
    private String rwidth;

    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.llength)
     */
    private String llength;

    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.lwidth)
     */
    private String lwidth;

    /**
     *  (pd_d_patient_inspection_renal_b_ultrasound.others)
     */
    private String others;

    /**
     * 删除标志 (pd_d_patient_inspection_renal_b_ultrasound.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_inspection_renal_b_ultrasound.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_inspection_renal_b_ultrasound.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_inspection_renal_b_ultrasound.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_inspection_renal_b_ultrasound.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_inspection_renal_b_ultrasound.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_inspection_renal_b_ultrasound.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.rlength)
     *
     * @return rlength String
     */
    public String getRlength() {
        return rlength;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.rlength)
     *
     * @param rlength String
     */
    public void setRlength(String rlength) {
        this.rlength = rlength;
        this._selectiveMark.put("rlength", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.rwidth)
     *
     * @return rwidth String
     */
    public String getRwidth() {
        return rwidth;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.rwidth)
     *
     * @param rwidth String
     */
    public void setRwidth(String rwidth) {
        this.rwidth = rwidth;
        this._selectiveMark.put("rwidth", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.llength)
     *
     * @return llength String
     */
    public String getLlength() {
        return llength;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.llength)
     *
     * @param llength String
     */
    public void setLlength(String llength) {
        this.llength = llength;
        this._selectiveMark.put("llength", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.lwidth)
     *
     * @return lwidth String
     */
    public String getLwidth() {
        return lwidth;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.lwidth)
     *
     * @param lwidth String
     */
    public void setLwidth(String lwidth) {
        this.lwidth = lwidth;
        this._selectiveMark.put("lwidth", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_renal_b_ultrasound.others)
     *
     * @return others String
     */
    public String getOthers() {
        return others;
    }

    /**
     * 设定： (pd_d_patient_inspection_renal_b_ultrasound.others)
     *
     * @param others String
     */
    public void setOthers(String others) {
        this.others = others;
        this._selectiveMark.put("others", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_inspection_renal_b_ultrasound.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_inspection_renal_b_ultrasound.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_inspection_renal_b_ultrasound.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_inspection_renal_b_ultrasound.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_inspection_renal_b_ultrasound.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_inspection_renal_b_ultrasound.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_inspection_renal_b_ultrasound.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_inspection_renal_b_ultrasound.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_inspection_renal_b_ultrasound.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_inspection_renal_b_ultrasound.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_inspection_renal_b_ultrasound.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_inspection_renal_b_ultrasound.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_inspection_renal_b_ultrasound.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_inspection_renal_b_ultrasound.screen_id)
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