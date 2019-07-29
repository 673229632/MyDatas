//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientDialysisAdequacy extends PdDPatientDialysisAdequacyKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_dialysis_adequacy.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_dialysis_adequacy.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_dialysis_adequacy.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_dialysis_adequacy.height)
     */
    private String height;

    /**
     *  (pd_d_patient_dialysis_adequacy.weight)
     */
    private String weight;

    /**
     *  (pd_d_patient_dialysis_adequacy.urine_volume)
     */
    private String urineVolume;

    /**
     *  (pd_d_patient_dialysis_adequacy.urine_bun)
     */
    private String urineBun;

    /**
     *  (pd_d_patient_dialysis_adequacy.urine_cr)
     */
    private String urineCr;

    /**
     *  (pd_d_patient_dialysis_adequacy.drainage_amount)
     */
    private String drainageAmount;

    /**
     *  (pd_d_patient_dialysis_adequacy.drainage_bun)
     */
    private String drainageBun;

    /**
     *  (pd_d_patient_dialysis_adequacy.drainage_cr)
     */
    private String drainageCr;

    /**
     *  (pd_d_patient_dialysis_adequacy.serum_bun)
     */
    private String serumBun;

    /**
     *  (pd_d_patient_dialysis_adequacy.serum_cr)
     */
    private String serumCr;

    /**
     *  (pd_d_patient_dialysis_adequacy.residual_renal_ccr)
     */
    private String residualRenalCcr;

    /**
     *  (pd_d_patient_dialysis_adequacy.peritoneal_dialysis_ccr)
     */
    private String peritonealDialysisCcr;

    /**
     *  (pd_d_patient_dialysis_adequacy.total_ccr)
     */
    private String totalCcr;

    /**
     *  (pd_d_patient_dialysis_adequacy.residual_renal_kt)
     */
    private String residualRenalKt;

    /**
     *  (pd_d_patient_dialysis_adequacy.peritoneal_dialysis_kt)
     */
    private String peritonealDialysisKt;

    /**
     *  (pd_d_patient_dialysis_adequacy.total_kt)
     */
    private String totalKt;

    /**
     *  (pd_d_patient_dialysis_adequacy.egfr)
     */
    private String egfr;

    /**
     *  (pd_d_patient_dialysis_adequacy.npcr)
     */
    private String npcr;

    /**
     * 删除标志 (pd_d_patient_dialysis_adequacy.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_dialysis_adequacy.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_dialysis_adequacy.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_dialysis_adequacy.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_dialysis_adequacy.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_dialysis_adequacy.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_dialysis_adequacy.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.height)
     *
     * @return height String
     */
    public String getHeight() {
        return height;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.height)
     *
     * @param height String
     */
    public void setHeight(String height) {
        this.height = height;
        this._selectiveMark.put("height", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.weight)
     *
     * @return weight String
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.weight)
     *
     * @param weight String
     */
    public void setWeight(String weight) {
        this.weight = weight;
        this._selectiveMark.put("weight", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.urine_volume)
     *
     * @return urineVolume String
     */
    public String getUrineVolume() {
        return urineVolume;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.urine_volume)
     *
     * @param urineVolume String
     */
    public void setUrineVolume(String urineVolume) {
        this.urineVolume = urineVolume;
        this._selectiveMark.put("urineVolume", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.urine_bun)
     *
     * @return urineBun String
     */
    public String getUrineBun() {
        return urineBun;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.urine_bun)
     *
     * @param urineBun String
     */
    public void setUrineBun(String urineBun) {
        this.urineBun = urineBun;
        this._selectiveMark.put("urineBun", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.urine_cr)
     *
     * @return urineCr String
     */
    public String getUrineCr() {
        return urineCr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.urine_cr)
     *
     * @param urineCr String
     */
    public void setUrineCr(String urineCr) {
        this.urineCr = urineCr;
        this._selectiveMark.put("urineCr", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.drainage_amount)
     *
     * @return drainageAmount String
     */
    public String getDrainageAmount() {
        return drainageAmount;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.drainage_amount)
     *
     * @param drainageAmount String
     */
    public void setDrainageAmount(String drainageAmount) {
        this.drainageAmount = drainageAmount;
        this._selectiveMark.put("drainageAmount", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.drainage_bun)
     *
     * @return drainageBun String
     */
    public String getDrainageBun() {
        return drainageBun;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.drainage_bun)
     *
     * @param drainageBun String
     */
    public void setDrainageBun(String drainageBun) {
        this.drainageBun = drainageBun;
        this._selectiveMark.put("drainageBun", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.drainage_cr)
     *
     * @return drainageCr String
     */
    public String getDrainageCr() {
        return drainageCr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.drainage_cr)
     *
     * @param drainageCr String
     */
    public void setDrainageCr(String drainageCr) {
        this.drainageCr = drainageCr;
        this._selectiveMark.put("drainageCr", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.serum_bun)
     *
     * @return serumBun String
     */
    public String getSerumBun() {
        return serumBun;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.serum_bun)
     *
     * @param serumBun String
     */
    public void setSerumBun(String serumBun) {
        this.serumBun = serumBun;
        this._selectiveMark.put("serumBun", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.serum_cr)
     *
     * @return serumCr String
     */
    public String getSerumCr() {
        return serumCr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.serum_cr)
     *
     * @param serumCr String
     */
    public void setSerumCr(String serumCr) {
        this.serumCr = serumCr;
        this._selectiveMark.put("serumCr", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.residual_renal_ccr)
     *
     * @return residualRenalCcr String
     */
    public String getResidualRenalCcr() {
        return residualRenalCcr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.residual_renal_ccr)
     *
     * @param residualRenalCcr String
     */
    public void setResidualRenalCcr(String residualRenalCcr) {
        this.residualRenalCcr = residualRenalCcr;
        this._selectiveMark.put("residualRenalCcr", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.peritoneal_dialysis_ccr)
     *
     * @return peritonealDialysisCcr String
     */
    public String getPeritonealDialysisCcr() {
        return peritonealDialysisCcr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.peritoneal_dialysis_ccr)
     *
     * @param peritonealDialysisCcr String
     */
    public void setPeritonealDialysisCcr(String peritonealDialysisCcr) {
        this.peritonealDialysisCcr = peritonealDialysisCcr;
        this._selectiveMark.put("peritonealDialysisCcr", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.total_ccr)
     *
     * @return totalCcr String
     */
    public String getTotalCcr() {
        return totalCcr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.total_ccr)
     *
     * @param totalCcr String
     */
    public void setTotalCcr(String totalCcr) {
        this.totalCcr = totalCcr;
        this._selectiveMark.put("totalCcr", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.residual_renal_kt)
     *
     * @return residualRenalKt String
     */
    public String getResidualRenalKt() {
        return residualRenalKt;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.residual_renal_kt)
     *
     * @param residualRenalKt String
     */
    public void setResidualRenalKt(String residualRenalKt) {
        this.residualRenalKt = residualRenalKt;
        this._selectiveMark.put("residualRenalKt", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.peritoneal_dialysis_kt)
     *
     * @return peritonealDialysisKt String
     */
    public String getPeritonealDialysisKt() {
        return peritonealDialysisKt;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.peritoneal_dialysis_kt)
     *
     * @param peritonealDialysisKt String
     */
    public void setPeritonealDialysisKt(String peritonealDialysisKt) {
        this.peritonealDialysisKt = peritonealDialysisKt;
        this._selectiveMark.put("peritonealDialysisKt", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.total_kt)
     *
     * @return totalKt String
     */
    public String getTotalKt() {
        return totalKt;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.total_kt)
     *
     * @param totalKt String
     */
    public void setTotalKt(String totalKt) {
        this.totalKt = totalKt;
        this._selectiveMark.put("totalKt", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.egfr)
     *
     * @return egfr String
     */
    public String getEgfr() {
        return egfr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.egfr)
     *
     * @param egfr String
     */
    public void setEgfr(String egfr) {
        this.egfr = egfr;
        this._selectiveMark.put("egfr", true);
    }

    /**
     * 取得： (pd_d_patient_dialysis_adequacy.npcr)
     *
     * @return npcr String
     */
    public String getNpcr() {
        return npcr;
    }

    /**
     * 设定： (pd_d_patient_dialysis_adequacy.npcr)
     *
     * @param npcr String
     */
    public void setNpcr(String npcr) {
        this.npcr = npcr;
        this._selectiveMark.put("npcr", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_dialysis_adequacy.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_dialysis_adequacy.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_dialysis_adequacy.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_dialysis_adequacy.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_dialysis_adequacy.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_dialysis_adequacy.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_dialysis_adequacy.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_dialysis_adequacy.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_dialysis_adequacy.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_dialysis_adequacy.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_dialysis_adequacy.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_dialysis_adequacy.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_dialysis_adequacy.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_dialysis_adequacy.screen_id)
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