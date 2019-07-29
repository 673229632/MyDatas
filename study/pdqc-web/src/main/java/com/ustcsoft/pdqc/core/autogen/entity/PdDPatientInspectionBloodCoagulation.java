//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientInspectionBloodCoagulation extends PdDPatientInspectionBloodCoagulationKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_inspection_blood_coagulation.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.fib)
     */
    private String fib;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.aptt)
     */
    private String aptt;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.pta)
     */
    private String pta;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.pt)
     */
    private String pt;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.tt)
     */
    private String tt;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.inr)
     */
    private String inr;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.fdp)
     */
    private String fdp;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.ddimer)
     */
    private String ddimer;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.at3)
     */
    private String at3;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.plasminogen_inhibitor_a2)
     */
    private String plasminogenInhibitorA2;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.plga)
     */
    private String plga;

    /**
     *  (pd_d_patient_inspection_blood_coagulation.others)
     */
    private String others;

    /**
     * 删除标志 (pd_d_patient_inspection_blood_coagulation.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_inspection_blood_coagulation.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_inspection_blood_coagulation.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_inspection_blood_coagulation.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_inspection_blood_coagulation.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_inspection_blood_coagulation.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_inspection_blood_coagulation.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.fib)
     *
     * @return fib String
     */
    public String getFib() {
        return fib;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.fib)
     *
     * @param fib String
     */
    public void setFib(String fib) {
        this.fib = fib;
        this._selectiveMark.put("fib", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.aptt)
     *
     * @return aptt String
     */
    public String getAptt() {
        return aptt;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.aptt)
     *
     * @param aptt String
     */
    public void setAptt(String aptt) {
        this.aptt = aptt;
        this._selectiveMark.put("aptt", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.pta)
     *
     * @return pta String
     */
    public String getPta() {
        return pta;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.pta)
     *
     * @param pta String
     */
    public void setPta(String pta) {
        this.pta = pta;
        this._selectiveMark.put("pta", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.pt)
     *
     * @return pt String
     */
    public String getPt() {
        return pt;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.pt)
     *
     * @param pt String
     */
    public void setPt(String pt) {
        this.pt = pt;
        this._selectiveMark.put("pt", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.tt)
     *
     * @return tt String
     */
    public String getTt() {
        return tt;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.tt)
     *
     * @param tt String
     */
    public void setTt(String tt) {
        this.tt = tt;
        this._selectiveMark.put("tt", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.inr)
     *
     * @return inr String
     */
    public String getInr() {
        return inr;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.inr)
     *
     * @param inr String
     */
    public void setInr(String inr) {
        this.inr = inr;
        this._selectiveMark.put("inr", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.fdp)
     *
     * @return fdp String
     */
    public String getFdp() {
        return fdp;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.fdp)
     *
     * @param fdp String
     */
    public void setFdp(String fdp) {
        this.fdp = fdp;
        this._selectiveMark.put("fdp", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.ddimer)
     *
     * @return ddimer String
     */
    public String getDdimer() {
        return ddimer;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.ddimer)
     *
     * @param ddimer String
     */
    public void setDdimer(String ddimer) {
        this.ddimer = ddimer;
        this._selectiveMark.put("ddimer", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.at3)
     *
     * @return at3 String
     */
    public String getAt3() {
        return at3;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.at3)
     *
     * @param at3 String
     */
    public void setAt3(String at3) {
        this.at3 = at3;
        this._selectiveMark.put("at3", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.plasminogen_inhibitor_a2)
     *
     * @return plasminogenInhibitorA2 String
     */
    public String getPlasminogenInhibitorA2() {
        return plasminogenInhibitorA2;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.plasminogen_inhibitor_a2)
     *
     * @param plasminogenInhibitorA2 String
     */
    public void setPlasminogenInhibitorA2(String plasminogenInhibitorA2) {
        this.plasminogenInhibitorA2 = plasminogenInhibitorA2;
        this._selectiveMark.put("plasminogenInhibitorA2", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.plga)
     *
     * @return plga String
     */
    public String getPlga() {
        return plga;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.plga)
     *
     * @param plga String
     */
    public void setPlga(String plga) {
        this.plga = plga;
        this._selectiveMark.put("plga", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_blood_coagulation.others)
     *
     * @return others String
     */
    public String getOthers() {
        return others;
    }

    /**
     * 设定： (pd_d_patient_inspection_blood_coagulation.others)
     *
     * @param others String
     */
    public void setOthers(String others) {
        this.others = others;
        this._selectiveMark.put("others", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_inspection_blood_coagulation.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_inspection_blood_coagulation.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_inspection_blood_coagulation.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_inspection_blood_coagulation.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_inspection_blood_coagulation.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_inspection_blood_coagulation.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_inspection_blood_coagulation.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_inspection_blood_coagulation.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_inspection_blood_coagulation.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_inspection_blood_coagulation.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_inspection_blood_coagulation.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_inspection_blood_coagulation.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_inspection_blood_coagulation.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_inspection_blood_coagulation.screen_id)
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