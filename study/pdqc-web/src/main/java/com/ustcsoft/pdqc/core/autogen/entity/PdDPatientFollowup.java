//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientFollowup extends PdDPatientFollowupKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_followup.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_followup.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_followup.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_followup.emergency)
     */
    private String emergency;

    /**
     *  (pd_d_patient_followup.emergency_detail)
     */
    private String emergencyDetail;

    /**
     *  (pd_d_patient_followup.illness_change)
     */
    private String illnessChange;

    /**
     *  (pd_d_patient_followup.illness_change_detail)
     */
    private String illnessChangeDetail;

    /**
     *  (pd_d_patient_followup.appelity)
     */
    private String appelity;

    /**
     *  (pd_d_patient_followup.sleep_quality)
     */
    private String sleepQuality;

    /**
     *  (pd_d_patient_followup.activity_amount)
     */
    private String activityAmount;

    /**
     *  (pd_d_patient_followup.emotion)
     */
    private String emotion;

    /**
     *  (pd_d_patient_followup.blood_pressure)
     */
    private String bloodPressure;

    /**
     *  (pd_d_patient_followup.blood_glucose)
     */
    private String bloodGlucose;

    /**
     *  (pd_d_patient_followup.weight)
     */
    private String weight;

    /**
     *  (pd_d_patient_followup.ultrafiltration)
     */
    private String ultrafiltration;

    /**
     *  (pd_d_patient_followup.urinary_production)
     */
    private String urinaryProduction;

    /**
     *  (pd_d_patient_followup.unwell_chief_complaint)
     */
    private String unwellChiefComplaint;

    /**
     *  (pd_d_patient_followup.followup_problem)
     */
    private String followupProblem;

    /**
     * 删除标志 (pd_d_patient_followup.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_followup.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_followup.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_followup.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_followup.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_followup.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_followup.screen_id)
     */
    private String screenId;

    /**
     *  (pd_d_patient_followup.publicity_education_focus)
     */
    private String publicityEducationFocus;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_followup.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_followup.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_followup.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_followup.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_followup.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_followup.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_followup.emergency)
     *
     * @return emergency String
     */
    public String getEmergency() {
        return emergency;
    }

    /**
     * 设定： (pd_d_patient_followup.emergency)
     *
     * @param emergency String
     */
    public void setEmergency(String emergency) {
        this.emergency = emergency;
        this._selectiveMark.put("emergency", true);
    }

    /**
     * 取得： (pd_d_patient_followup.emergency_detail)
     *
     * @return emergencyDetail String
     */
    public String getEmergencyDetail() {
        return emergencyDetail;
    }

    /**
     * 设定： (pd_d_patient_followup.emergency_detail)
     *
     * @param emergencyDetail String
     */
    public void setEmergencyDetail(String emergencyDetail) {
        this.emergencyDetail = emergencyDetail;
        this._selectiveMark.put("emergencyDetail", true);
    }

    /**
     * 取得： (pd_d_patient_followup.illness_change)
     *
     * @return illnessChange String
     */
    public String getIllnessChange() {
        return illnessChange;
    }

    /**
     * 设定： (pd_d_patient_followup.illness_change)
     *
     * @param illnessChange String
     */
    public void setIllnessChange(String illnessChange) {
        this.illnessChange = illnessChange;
        this._selectiveMark.put("illnessChange", true);
    }

    /**
     * 取得： (pd_d_patient_followup.illness_change_detail)
     *
     * @return illnessChangeDetail String
     */
    public String getIllnessChangeDetail() {
        return illnessChangeDetail;
    }

    /**
     * 设定： (pd_d_patient_followup.illness_change_detail)
     *
     * @param illnessChangeDetail String
     */
    public void setIllnessChangeDetail(String illnessChangeDetail) {
        this.illnessChangeDetail = illnessChangeDetail;
        this._selectiveMark.put("illnessChangeDetail", true);
    }

    /**
     * 取得： (pd_d_patient_followup.appelity)
     *
     * @return appelity String
     */
    public String getAppelity() {
        return appelity;
    }

    /**
     * 设定： (pd_d_patient_followup.appelity)
     *
     * @param appelity String
     */
    public void setAppelity(String appelity) {
        this.appelity = appelity;
        this._selectiveMark.put("appelity", true);
    }

    /**
     * 取得： (pd_d_patient_followup.sleep_quality)
     *
     * @return sleepQuality String
     */
    public String getSleepQuality() {
        return sleepQuality;
    }

    /**
     * 设定： (pd_d_patient_followup.sleep_quality)
     *
     * @param sleepQuality String
     */
    public void setSleepQuality(String sleepQuality) {
        this.sleepQuality = sleepQuality;
        this._selectiveMark.put("sleepQuality", true);
    }

    /**
     * 取得： (pd_d_patient_followup.activity_amount)
     *
     * @return activityAmount String
     */
    public String getActivityAmount() {
        return activityAmount;
    }

    /**
     * 设定： (pd_d_patient_followup.activity_amount)
     *
     * @param activityAmount String
     */
    public void setActivityAmount(String activityAmount) {
        this.activityAmount = activityAmount;
        this._selectiveMark.put("activityAmount", true);
    }

    /**
     * 取得： (pd_d_patient_followup.emotion)
     *
     * @return emotion String
     */
    public String getEmotion() {
        return emotion;
    }

    /**
     * 设定： (pd_d_patient_followup.emotion)
     *
     * @param emotion String
     */
    public void setEmotion(String emotion) {
        this.emotion = emotion;
        this._selectiveMark.put("emotion", true);
    }

    /**
     * 取得： (pd_d_patient_followup.blood_pressure)
     *
     * @return bloodPressure String
     */
    public String getBloodPressure() {
        return bloodPressure;
    }

    /**
     * 设定： (pd_d_patient_followup.blood_pressure)
     *
     * @param bloodPressure String
     */
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
        this._selectiveMark.put("bloodPressure", true);
    }

    /**
     * 取得： (pd_d_patient_followup.blood_glucose)
     *
     * @return bloodGlucose String
     */
    public String getBloodGlucose() {
        return bloodGlucose;
    }

    /**
     * 设定： (pd_d_patient_followup.blood_glucose)
     *
     * @param bloodGlucose String
     */
    public void setBloodGlucose(String bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
        this._selectiveMark.put("bloodGlucose", true);
    }

    /**
     * 取得： (pd_d_patient_followup.weight)
     *
     * @return weight String
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设定： (pd_d_patient_followup.weight)
     *
     * @param weight String
     */
    public void setWeight(String weight) {
        this.weight = weight;
        this._selectiveMark.put("weight", true);
    }

    /**
     * 取得： (pd_d_patient_followup.ultrafiltration)
     *
     * @return ultrafiltration String
     */
    public String getUltrafiltration() {
        return ultrafiltration;
    }

    /**
     * 设定： (pd_d_patient_followup.ultrafiltration)
     *
     * @param ultrafiltration String
     */
    public void setUltrafiltration(String ultrafiltration) {
        this.ultrafiltration = ultrafiltration;
        this._selectiveMark.put("ultrafiltration", true);
    }

    /**
     * 取得： (pd_d_patient_followup.urinary_production)
     *
     * @return urinaryProduction String
     */
    public String getUrinaryProduction() {
        return urinaryProduction;
    }

    /**
     * 设定： (pd_d_patient_followup.urinary_production)
     *
     * @param urinaryProduction String
     */
    public void setUrinaryProduction(String urinaryProduction) {
        this.urinaryProduction = urinaryProduction;
        this._selectiveMark.put("urinaryProduction", true);
    }

    /**
     * 取得： (pd_d_patient_followup.unwell_chief_complaint)
     *
     * @return unwellChiefComplaint String
     */
    public String getUnwellChiefComplaint() {
        return unwellChiefComplaint;
    }

    /**
     * 设定： (pd_d_patient_followup.unwell_chief_complaint)
     *
     * @param unwellChiefComplaint String
     */
    public void setUnwellChiefComplaint(String unwellChiefComplaint) {
        this.unwellChiefComplaint = unwellChiefComplaint;
        this._selectiveMark.put("unwellChiefComplaint", true);
    }

    /**
     * 取得： (pd_d_patient_followup.followup_problem)
     *
     * @return followupProblem String
     */
    public String getFollowupProblem() {
        return followupProblem;
    }

    /**
     * 设定： (pd_d_patient_followup.followup_problem)
     *
     * @param followupProblem String
     */
    public void setFollowupProblem(String followupProblem) {
        this.followupProblem = followupProblem;
        this._selectiveMark.put("followupProblem", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_followup.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_followup.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_followup.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_followup.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_followup.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_followup.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_followup.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_followup.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_followup.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_followup.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_followup.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_followup.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_followup.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_followup.screen_id)
     *
     * @param screenId String
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
        this._selectiveMark.put("screenId", true);
    }

    /**
     * 取得： (pd_d_patient_followup.publicity_education_focus)
     *
     * @return publicityEducationFocus String
     */
    public String getPublicityEducationFocus() {
        return publicityEducationFocus;
    }

    /**
     * 设定： (pd_d_patient_followup.publicity_education_focus)
     *
     * @param publicityEducationFocus String
     */
    public void setPublicityEducationFocus(String publicityEducationFocus) {
        this.publicityEducationFocus = publicityEducationFocus;
        this._selectiveMark.put("publicityEducationFocus", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}