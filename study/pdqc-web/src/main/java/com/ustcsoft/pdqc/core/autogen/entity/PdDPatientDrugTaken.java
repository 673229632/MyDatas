//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientDrugTaken extends PdDPatientDrugTakenKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_drug_taken.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_drug_taken.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_drug_taken.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_drug_taken.type)
     */
    private String type;

    /**
     *  (pd_d_patient_drug_taken.type2)
     */
    private String type2;

    /**
     *  (pd_d_patient_drug_taken.type3)
     */
    private String type3;

    /**
     *  (pd_d_patient_drug_taken.drug_name)
     */
    private String drugName;

    /**
     *  (pd_d_patient_drug_taken.frequency)
     */
    private String frequency;

    /**
     *  (pd_d_patient_drug_taken.method)
     */
    private String method;

    /**
     *  (pd_d_patient_drug_taken.single_dose)
     */
    private String singleDose;

    /**
     *  (pd_d_patient_drug_taken.unit_name)
     */
    private String unitName;

    /**
     * 删除标志 (pd_d_patient_drug_taken.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_drug_taken.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_drug_taken.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_drug_taken.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_drug_taken.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_drug_taken.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_drug_taken.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_drug_taken.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.type)
     *
     * @return type String
     */
    public String getType() {
        return type;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.type)
     *
     * @param type String
     */
    public void setType(String type) {
        this.type = type;
        this._selectiveMark.put("type", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.type2)
     *
     * @return type2 String
     */
    public String getType2() {
        return type2;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.type2)
     *
     * @param type2 String
     */
    public void setType2(String type2) {
        this.type2 = type2;
        this._selectiveMark.put("type2", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.type3)
     *
     * @return type3 String
     */
    public String getType3() {
        return type3;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.type3)
     *
     * @param type3 String
     */
    public void setType3(String type3) {
        this.type3 = type3;
        this._selectiveMark.put("type3", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.drug_name)
     *
     * @return drugName String
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.drug_name)
     *
     * @param drugName String
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
        this._selectiveMark.put("drugName", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.frequency)
     *
     * @return frequency String
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.frequency)
     *
     * @param frequency String
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
        this._selectiveMark.put("frequency", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.method)
     *
     * @return method String
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.method)
     *
     * @param method String
     */
    public void setMethod(String method) {
        this.method = method;
        this._selectiveMark.put("method", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.single_dose)
     *
     * @return singleDose String
     */
    public String getSingleDose() {
        return singleDose;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.single_dose)
     *
     * @param singleDose String
     */
    public void setSingleDose(String singleDose) {
        this.singleDose = singleDose;
        this._selectiveMark.put("singleDose", true);
    }

    /**
     * 取得： (pd_d_patient_drug_taken.unit_name)
     *
     * @return unitName String
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设定： (pd_d_patient_drug_taken.unit_name)
     *
     * @param unitName String
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
        this._selectiveMark.put("unitName", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_drug_taken.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_drug_taken.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_drug_taken.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_drug_taken.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_drug_taken.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_drug_taken.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_drug_taken.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_drug_taken.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_drug_taken.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_drug_taken.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_drug_taken.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_drug_taken.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_drug_taken.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_drug_taken.screen_id)
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