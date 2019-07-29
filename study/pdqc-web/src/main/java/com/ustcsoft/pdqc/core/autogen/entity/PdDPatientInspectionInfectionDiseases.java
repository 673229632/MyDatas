//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientInspectionInfectionDiseases extends PdDPatientInspectionInfectionDiseasesKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_inspection_infection_diseases.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_inspection_infection_diseases.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_inspection_infection_diseases.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hbsag)
     */
    private String hbsag;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hbsab)
     */
    private String hbsab;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hbeag)
     */
    private String hbeag;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hbeab)
     */
    private String hbeab;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hbcab)
     */
    private String hbcab;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hbvdnase)
     */
    private String hbvdnase;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hav)
     */
    private String hav;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hbcabigm)
     */
    private String hbcabigm;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hcvigg)
     */
    private String hcvigg;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hcvigm)
     */
    private String hcvigm;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hdv)
     */
    private String hdv;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hev)
     */
    private String hev;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hgv)
     */
    private String hgv;

    /**
     *  (pd_d_patient_inspection_infection_diseases.hiv)
     */
    private String hiv;

    /**
     *  (pd_d_patient_inspection_infection_diseases.tpab)
     */
    private String tpab;

    /**
     * 删除标志 (pd_d_patient_inspection_infection_diseases.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_inspection_infection_diseases.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_inspection_infection_diseases.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_inspection_infection_diseases.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_inspection_infection_diseases.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_inspection_infection_diseases.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_inspection_infection_diseases.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hbsag)
     *
     * @return hbsag String
     */
    public String getHbsag() {
        return hbsag;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hbsag)
     *
     * @param hbsag String
     */
    public void setHbsag(String hbsag) {
        this.hbsag = hbsag;
        this._selectiveMark.put("hbsag", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hbsab)
     *
     * @return hbsab String
     */
    public String getHbsab() {
        return hbsab;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hbsab)
     *
     * @param hbsab String
     */
    public void setHbsab(String hbsab) {
        this.hbsab = hbsab;
        this._selectiveMark.put("hbsab", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hbeag)
     *
     * @return hbeag String
     */
    public String getHbeag() {
        return hbeag;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hbeag)
     *
     * @param hbeag String
     */
    public void setHbeag(String hbeag) {
        this.hbeag = hbeag;
        this._selectiveMark.put("hbeag", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hbeab)
     *
     * @return hbeab String
     */
    public String getHbeab() {
        return hbeab;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hbeab)
     *
     * @param hbeab String
     */
    public void setHbeab(String hbeab) {
        this.hbeab = hbeab;
        this._selectiveMark.put("hbeab", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hbcab)
     *
     * @return hbcab String
     */
    public String getHbcab() {
        return hbcab;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hbcab)
     *
     * @param hbcab String
     */
    public void setHbcab(String hbcab) {
        this.hbcab = hbcab;
        this._selectiveMark.put("hbcab", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hbvdnase)
     *
     * @return hbvdnase String
     */
    public String getHbvdnase() {
        return hbvdnase;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hbvdnase)
     *
     * @param hbvdnase String
     */
    public void setHbvdnase(String hbvdnase) {
        this.hbvdnase = hbvdnase;
        this._selectiveMark.put("hbvdnase", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hav)
     *
     * @return hav String
     */
    public String getHav() {
        return hav;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hav)
     *
     * @param hav String
     */
    public void setHav(String hav) {
        this.hav = hav;
        this._selectiveMark.put("hav", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hbcabigm)
     *
     * @return hbcabigm String
     */
    public String getHbcabigm() {
        return hbcabigm;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hbcabigm)
     *
     * @param hbcabigm String
     */
    public void setHbcabigm(String hbcabigm) {
        this.hbcabigm = hbcabigm;
        this._selectiveMark.put("hbcabigm", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hcvigg)
     *
     * @return hcvigg String
     */
    public String getHcvigg() {
        return hcvigg;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hcvigg)
     *
     * @param hcvigg String
     */
    public void setHcvigg(String hcvigg) {
        this.hcvigg = hcvigg;
        this._selectiveMark.put("hcvigg", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hcvigm)
     *
     * @return hcvigm String
     */
    public String getHcvigm() {
        return hcvigm;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hcvigm)
     *
     * @param hcvigm String
     */
    public void setHcvigm(String hcvigm) {
        this.hcvigm = hcvigm;
        this._selectiveMark.put("hcvigm", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hdv)
     *
     * @return hdv String
     */
    public String getHdv() {
        return hdv;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hdv)
     *
     * @param hdv String
     */
    public void setHdv(String hdv) {
        this.hdv = hdv;
        this._selectiveMark.put("hdv", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hev)
     *
     * @return hev String
     */
    public String getHev() {
        return hev;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hev)
     *
     * @param hev String
     */
    public void setHev(String hev) {
        this.hev = hev;
        this._selectiveMark.put("hev", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hgv)
     *
     * @return hgv String
     */
    public String getHgv() {
        return hgv;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hgv)
     *
     * @param hgv String
     */
    public void setHgv(String hgv) {
        this.hgv = hgv;
        this._selectiveMark.put("hgv", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.hiv)
     *
     * @return hiv String
     */
    public String getHiv() {
        return hiv;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.hiv)
     *
     * @param hiv String
     */
    public void setHiv(String hiv) {
        this.hiv = hiv;
        this._selectiveMark.put("hiv", true);
    }

    /**
     * 取得： (pd_d_patient_inspection_infection_diseases.tpab)
     *
     * @return tpab String
     */
    public String getTpab() {
        return tpab;
    }

    /**
     * 设定： (pd_d_patient_inspection_infection_diseases.tpab)
     *
     * @param tpab String
     */
    public void setTpab(String tpab) {
        this.tpab = tpab;
        this._selectiveMark.put("tpab", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_inspection_infection_diseases.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_inspection_infection_diseases.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_inspection_infection_diseases.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_inspection_infection_diseases.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_inspection_infection_diseases.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_inspection_infection_diseases.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_inspection_infection_diseases.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_inspection_infection_diseases.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_inspection_infection_diseases.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_inspection_infection_diseases.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_inspection_infection_diseases.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_inspection_infection_diseases.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_inspection_infection_diseases.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_inspection_infection_diseases.screen_id)
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