//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientInspectionRoutineBlood extends PdDPatientInspectionRoutineBloodKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_inspection_routine_blood.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_inspection_routine_blood.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_inspection_routine_blood.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_inspection_routine_blood.wbc)
     */
    private String wbc;

    /**
     *  (pd_d_patient_inspection_routine_blood.rbc)
     */
    private String rbc;

    /**
     *  (pd_d_patient_inspection_routine_blood.hb)
     */
    private String hb;

    /**
     *  (pd_d_patient_inspection_routine_blood.hct)
     */
    private String hct;

    /**
     *  (pd_d_patient_inspection_routine_blood.mcv)
     */
    private String mcv;

    /**
     *  (pd_d_patient_inspection_routine_blood.mch)
     */
    private String mch;

    /**
     *  (pd_d_patient_inspection_routine_blood.mchc)
     */
    private String mchc;

    /**
     *  (pd_d_patient_inspection_routine_blood.rdw)
     */
    private String rdw;

    /**
     *  (pd_d_patient_inspection_routine_blood.rdwsd)
     */
    private String rdwsd;

    /**
     *  (pd_d_patient_inspection_routine_blood.plt)
     */
    private String plt;

    /**
     *  (pd_d_patient_inspection_routine_blood.mpv)
     */
    private String mpv;

    /**
     *  (pd_d_patient_inspection_routine_blood.pdw)
     */
    private String pdw;

    /**
     *  (pd_d_patient_inspection_routine_blood.pct)
     */
    private String pct;

    /**
     *  (pd_d_patient_inspection_routine_blood.plcr)
     */
    private String plcr;

    /**
     *  (pd_d_patient_inspection_routine_blood.neutrophil_percentage)
     */
    private String neutrophilPercentage;

    /**
     *  (pd_d_patient_inspection_routine_blood.lymphocyte_percentage)
     */
    private String lymphocytePercentage;

    /**
     *  (pd_d_patient_inspection_routine_blood.monocyte_percentage)
     */
    private String monocytePercentage;

    /**
     *  (pd_d_patient_inspection_routine_blood.eosinophil_percentage)
     */
    private String eosinophilPercentage;

    /**
     *  (pd_d_patient_inspection_routine_blood.basophil_percentage)
     */
    private String basophilPercentage;

    /**
     *  (pd_d_patient_inspection_routine_blood.neutrophil_absolute_value)
     */
    private String neutrophilAbsoluteValue;

    /**
     *  (pd_d_patient_inspection_routine_blood.lymphocyte_absolute_value)
     */
    private String lymphocyteAbsoluteValue;

    /**
     *  (pd_d_patient_inspection_routine_blood.monocyte_absolute_value)
     */
    private String monocyteAbsoluteValue;

    /**
     *  (pd_d_patient_inspection_routine_blood.eosinophil_absolute_value)
     */
    private String eosinophilAbsoluteValue;

    /**
     *  (pd_d_patient_inspection_routine_blood.basophil_absolute_value)
     */
    private String basophilAbsoluteValue;

    /**
     * 删除标志 (pd_d_patient_inspection_routine_blood.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_inspection_routine_blood.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_inspection_routine_blood.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_inspection_routine_blood.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_inspection_routine_blood.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_inspection_routine_blood.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_inspection_routine_blood.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.wbc)
     *
     * @return wbc String
     */
    public String getWbc() {
        return wbc;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.wbc)
     *
     * @param wbc String
     */
    public void setWbc(String wbc) {
        this.wbc = wbc;
        this._selectiveMark.put("wbc", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.rbc)
     *
     * @return rbc String
     */
    public String getRbc() {
        return rbc;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.rbc)
     *
     * @param rbc String
     */
    public void setRbc(String rbc) {
        this.rbc = rbc;
        this._selectiveMark.put("rbc", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.hb)
     *
     * @return hb String
     */
    public String getHb() {
        return hb;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.hb)
     *
     * @param hb String
     */
    public void setHb(String hb) {
        this.hb = hb;
        this._selectiveMark.put("hb", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.hct)
     *
     * @return hct String
     */
    public String getHct() {
        return hct;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.hct)
     *
     * @param hct String
     */
    public void setHct(String hct) {
        this.hct = hct;
        this._selectiveMark.put("hct", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.mcv)
     *
     * @return mcv String
     */
    public String getMcv() {
        return mcv;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.mcv)
     *
     * @param mcv String
     */
    public void setMcv(String mcv) {
        this.mcv = mcv;
        this._selectiveMark.put("mcv", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.mch)
     *
     * @return mch String
     */
    public String getMch() {
        return mch;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.mch)
     *
     * @param mch String
     */
    public void setMch(String mch) {
        this.mch = mch;
        this._selectiveMark.put("mch", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.mchc)
     *
     * @return mchc String
     */
    public String getMchc() {
        return mchc;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.mchc)
     *
     * @param mchc String
     */
    public void setMchc(String mchc) {
        this.mchc = mchc;
        this._selectiveMark.put("mchc", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.rdw)
     *
     * @return rdw String
     */
    public String getRdw() {
        return rdw;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.rdw)
     *
     * @param rdw String
     */
    public void setRdw(String rdw) {
        this.rdw = rdw;
        this._selectiveMark.put("rdw", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.rdwsd)
     *
     * @return rdwsd String
     */
    public String getRdwsd() {
        return rdwsd;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.rdwsd)
     *
     * @param rdwsd String
     */
    public void setRdwsd(String rdwsd) {
        this.rdwsd = rdwsd;
        this._selectiveMark.put("rdwsd", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.plt)
     *
     * @return plt String
     */
    public String getPlt() {
        return plt;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.plt)
     *
     * @param plt String
     */
    public void setPlt(String plt) {
        this.plt = plt;
        this._selectiveMark.put("plt", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.mpv)
     *
     * @return mpv String
     */
    public String getMpv() {
        return mpv;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.mpv)
     *
     * @param mpv String
     */
    public void setMpv(String mpv) {
        this.mpv = mpv;
        this._selectiveMark.put("mpv", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.pdw)
     *
     * @return pdw String
     */
    public String getPdw() {
        return pdw;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.pdw)
     *
     * @param pdw String
     */
    public void setPdw(String pdw) {
        this.pdw = pdw;
        this._selectiveMark.put("pdw", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.pct)
     *
     * @return pct String
     */
    public String getPct() {
        return pct;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.pct)
     *
     * @param pct String
     */
    public void setPct(String pct) {
        this.pct = pct;
        this._selectiveMark.put("pct", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.plcr)
     *
     * @return plcr String
     */
    public String getPlcr() {
        return plcr;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.plcr)
     *
     * @param plcr String
     */
    public void setPlcr(String plcr) {
        this.plcr = plcr;
        this._selectiveMark.put("plcr", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.neutrophil_percentage)
     *
     * @return neutrophilPercentage String
     */
    public String getNeutrophilPercentage() {
        return neutrophilPercentage;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.neutrophil_percentage)
     *
     * @param neutrophilPercentage String
     */
    public void setNeutrophilPercentage(String neutrophilPercentage) {
        this.neutrophilPercentage = neutrophilPercentage;
        this._selectiveMark.put("neutrophilPercentage", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.lymphocyte_percentage)
     *
     * @return lymphocytePercentage String
     */
    public String getLymphocytePercentage() {
        return lymphocytePercentage;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.lymphocyte_percentage)
     *
     * @param lymphocytePercentage String
     */
    public void setLymphocytePercentage(String lymphocytePercentage) {
        this.lymphocytePercentage = lymphocytePercentage;
        this._selectiveMark.put("lymphocytePercentage", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.monocyte_percentage)
     *
     * @return monocytePercentage String
     */
    public String getMonocytePercentage() {
        return monocytePercentage;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.monocyte_percentage)
     *
     * @param monocytePercentage String
     */
    public void setMonocytePercentage(String monocytePercentage) {
        this.monocytePercentage = monocytePercentage;
        this._selectiveMark.put("monocytePercentage", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.eosinophil_percentage)
     *
     * @return eosinophilPercentage String
     */
    public String getEosinophilPercentage() {
        return eosinophilPercentage;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.eosinophil_percentage)
     *
     * @param eosinophilPercentage String
     */
    public void setEosinophilPercentage(String eosinophilPercentage) {
        this.eosinophilPercentage = eosinophilPercentage;
        this._selectiveMark.put("eosinophilPercentage", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.basophil_percentage)
     *
     * @return basophilPercentage String
     */
    public String getBasophilPercentage() {
        return basophilPercentage;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.basophil_percentage)
     *
     * @param basophilPercentage String
     */
    public void setBasophilPercentage(String basophilPercentage) {
        this.basophilPercentage = basophilPercentage;
        this._selectiveMark.put("basophilPercentage", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.neutrophil_absolute_value)
     *
     * @return neutrophilAbsoluteValue String
     */
    public String getNeutrophilAbsoluteValue() {
        return neutrophilAbsoluteValue;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.neutrophil_absolute_value)
     *
     * @param neutrophilAbsoluteValue String
     */
    public void setNeutrophilAbsoluteValue(String neutrophilAbsoluteValue) {
        this.neutrophilAbsoluteValue = neutrophilAbsoluteValue;
        this._selectiveMark.put("neutrophilAbsoluteValue", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.lymphocyte_absolute_value)
     *
     * @return lymphocyteAbsoluteValue String
     */
    public String getLymphocyteAbsoluteValue() {
        return lymphocyteAbsoluteValue;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.lymphocyte_absolute_value)
     *
     * @param lymphocyteAbsoluteValue String
     */
    public void setLymphocyteAbsoluteValue(String lymphocyteAbsoluteValue) {
        this.lymphocyteAbsoluteValue = lymphocyteAbsoluteValue;
        this._selectiveMark.put("lymphocyteAbsoluteValue", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.monocyte_absolute_value)
     *
     * @return monocyteAbsoluteValue String
     */
    public String getMonocyteAbsoluteValue() {
        return monocyteAbsoluteValue;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.monocyte_absolute_value)
     *
     * @param monocyteAbsoluteValue String
     */
    public void setMonocyteAbsoluteValue(String monocyteAbsoluteValue) {
        this.monocyteAbsoluteValue = monocyteAbsoluteValue;
        this._selectiveMark.put("monocyteAbsoluteValue", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.eosinophil_absolute_value)
     *
     * @return eosinophilAbsoluteValue String
     */
    public String getEosinophilAbsoluteValue() {
        return eosinophilAbsoluteValue;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.eosinophil_absolute_value)
     *
     * @param eosinophilAbsoluteValue String
     */
    public void setEosinophilAbsoluteValue(String eosinophilAbsoluteValue) {
        this.eosinophilAbsoluteValue = eosinophilAbsoluteValue;
        this._selectiveMark.put("eosinophilAbsoluteValue", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_routine_blood.basophil_absolute_value)
     *
     * @return basophilAbsoluteValue String
     */
    public String getBasophilAbsoluteValue() {
        return basophilAbsoluteValue;
    }

    /**
     * 设定： (pd_d_patient_inspection_routine_blood.basophil_absolute_value)
     *
     * @param basophilAbsoluteValue String
     */
    public void setBasophilAbsoluteValue(String basophilAbsoluteValue) {
        this.basophilAbsoluteValue = basophilAbsoluteValue;
        this._selectiveMark.put("basophilAbsoluteValue", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_inspection_routine_blood.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_inspection_routine_blood.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_inspection_routine_blood.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_inspection_routine_blood.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_inspection_routine_blood.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_inspection_routine_blood.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_inspection_routine_blood.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_inspection_routine_blood.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_inspection_routine_blood.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_inspection_routine_blood.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_inspection_routine_blood.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_inspection_routine_blood.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_inspection_routine_blood.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_inspection_routine_blood.screen_id)
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