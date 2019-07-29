//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientOutpatientEvaluation extends PdDPatientOutpatientEvaluationKey implements AutoGenEntity {
    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.hp_id)
     */
    private String hpId;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.pt_id)
     */
    private String ptId;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.tdate)
     */
    private Date tdate;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.weight)
     */
    private String weight;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.bmi)
     */
    private String bmi;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.blood_pressure)
     */
    private String bloodPressure;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.ultrafiltration)
     */
    private String ultrafiltration;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.urunary_production)
     */
    private String urunaryProduction;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.cardiac_function_level)
     */
    private String cardiacFunctionLevel;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.edema_grade)
     */
    private String edemaGrade;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.alimentary_symptoms)
     */
    private String alimentarySymptoms;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.other_symptoms)
     */
    private String otherSymptoms;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.cather_out_assessment)
     */
    private String catherOutAssessment;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.cather_out_score)
     */
    private String catherOutScore;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.weight_change)
     */
    private String weightChange;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.diet_change)
     */
    private String dietChange;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.gastrointestinal_symptoms)
     */
    private String gastrointestinalSymptoms;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.activity_ability)
     */
    private String activityAbility;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.complication)
     */
    private String complication;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.subcutaneous_fat)
     */
    private String subcutaneousFat;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.muscle_consumption)
     */
    private String muscleConsumption;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.sga_score)
     */
    private String sgaScore;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.sga_assessment)
     */
    private String sgaAssessment;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.hemoglobin_analysis)
     */
    private String hemoglobinAnalysis;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.ferritin_analysis)
     */
    private String ferritinAnalysis;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.ca)
     */
    private String ca;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.p)
     */
    private String p;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.pth)
     */
    private String pth;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.nutriture)
     */
    private String nutriture;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.dialysis_adequacy)
     */
    private String dialysisAdequacy;

    /**
     *  (PD_D_PATIENT_OUTPATIENT_EVALUATION.k)
     */
    private String k;

    /**
     * 删除标志 (PD_D_PATIENT_OUTPATIENT_EVALUATION.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_D_PATIENT_OUTPATIENT_EVALUATION.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_D_PATIENT_OUTPATIENT_EVALUATION.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_D_PATIENT_OUTPATIENT_EVALUATION.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_D_PATIENT_OUTPATIENT_EVALUATION.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_D_PATIENT_OUTPATIENT_EVALUATION.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (PD_D_PATIENT_OUTPATIENT_EVALUATION.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.weight)
     *
     * @return weight String
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.weight)
     *
     * @param weight String
     */
    public void setWeight(String weight) {
        this.weight = weight;
        this._selectiveMark.put("weight", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.bmi)
     *
     * @return bmi String
     */
    public String getBmi() {
        return bmi;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.bmi)
     *
     * @param bmi String
     */
    public void setBmi(String bmi) {
        this.bmi = bmi;
        this._selectiveMark.put("bmi", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.blood_pressure)
     *
     * @return bloodPressure String
     */
    public String getBloodPressure() {
        return bloodPressure;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.blood_pressure)
     *
     * @param bloodPressure String
     */
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
        this._selectiveMark.put("bloodPressure", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.ultrafiltration)
     *
     * @return ultrafiltration String
     */
    public String getUltrafiltration() {
        return ultrafiltration;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.ultrafiltration)
     *
     * @param ultrafiltration String
     */
    public void setUltrafiltration(String ultrafiltration) {
        this.ultrafiltration = ultrafiltration;
        this._selectiveMark.put("ultrafiltration", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.urunary_production)
     *
     * @return urunaryProduction String
     */
    public String getUrunaryProduction() {
        return urunaryProduction;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.urunary_production)
     *
     * @param urunaryProduction String
     */
    public void setUrunaryProduction(String urunaryProduction) {
        this.urunaryProduction = urunaryProduction;
        this._selectiveMark.put("urunaryProduction", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.cardiac_function_level)
     *
     * @return cardiacFunctionLevel String
     */
    public String getCardiacFunctionLevel() {
        return cardiacFunctionLevel;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.cardiac_function_level)
     *
     * @param cardiacFunctionLevel String
     */
    public void setCardiacFunctionLevel(String cardiacFunctionLevel) {
        this.cardiacFunctionLevel = cardiacFunctionLevel;
        this._selectiveMark.put("cardiacFunctionLevel", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.edema_grade)
     *
     * @return edemaGrade String
     */
    public String getEdemaGrade() {
        return edemaGrade;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.edema_grade)
     *
     * @param edemaGrade String
     */
    public void setEdemaGrade(String edemaGrade) {
        this.edemaGrade = edemaGrade;
        this._selectiveMark.put("edemaGrade", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.alimentary_symptoms)
     *
     * @return alimentarySymptoms String
     */
    public String getAlimentarySymptoms() {
        return alimentarySymptoms;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.alimentary_symptoms)
     *
     * @param alimentarySymptoms String
     */
    public void setAlimentarySymptoms(String alimentarySymptoms) {
        this.alimentarySymptoms = alimentarySymptoms;
        this._selectiveMark.put("alimentarySymptoms", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.other_symptoms)
     *
     * @return otherSymptoms String
     */
    public String getOtherSymptoms() {
        return otherSymptoms;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.other_symptoms)
     *
     * @param otherSymptoms String
     */
    public void setOtherSymptoms(String otherSymptoms) {
        this.otherSymptoms = otherSymptoms;
        this._selectiveMark.put("otherSymptoms", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.cather_out_assessment)
     *
     * @return catherOutAssessment String
     */
    public String getCatherOutAssessment() {
        return catherOutAssessment;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.cather_out_assessment)
     *
     * @param catherOutAssessment String
     */
    public void setCatherOutAssessment(String catherOutAssessment) {
        this.catherOutAssessment = catherOutAssessment;
        this._selectiveMark.put("catherOutAssessment", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.cather_out_score)
     *
     * @return catherOutScore String
     */
    public String getCatherOutScore() {
        return catherOutScore;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.cather_out_score)
     *
     * @param catherOutScore String
     */
    public void setCatherOutScore(String catherOutScore) {
        this.catherOutScore = catherOutScore;
        this._selectiveMark.put("catherOutScore", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.weight_change)
     *
     * @return weightChange String
     */
    public String getWeightChange() {
        return weightChange;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.weight_change)
     *
     * @param weightChange String
     */
    public void setWeightChange(String weightChange) {
        this.weightChange = weightChange;
        this._selectiveMark.put("weightChange", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.diet_change)
     *
     * @return dietChange String
     */
    public String getDietChange() {
        return dietChange;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.diet_change)
     *
     * @param dietChange String
     */
    public void setDietChange(String dietChange) {
        this.dietChange = dietChange;
        this._selectiveMark.put("dietChange", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.gastrointestinal_symptoms)
     *
     * @return gastrointestinalSymptoms String
     */
    public String getGastrointestinalSymptoms() {
        return gastrointestinalSymptoms;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.gastrointestinal_symptoms)
     *
     * @param gastrointestinalSymptoms String
     */
    public void setGastrointestinalSymptoms(String gastrointestinalSymptoms) {
        this.gastrointestinalSymptoms = gastrointestinalSymptoms;
        this._selectiveMark.put("gastrointestinalSymptoms", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.activity_ability)
     *
     * @return activityAbility String
     */
    public String getActivityAbility() {
        return activityAbility;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.activity_ability)
     *
     * @param activityAbility String
     */
    public void setActivityAbility(String activityAbility) {
        this.activityAbility = activityAbility;
        this._selectiveMark.put("activityAbility", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.complication)
     *
     * @return complication String
     */
    public String getComplication() {
        return complication;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.complication)
     *
     * @param complication String
     */
    public void setComplication(String complication) {
        this.complication = complication;
        this._selectiveMark.put("complication", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.subcutaneous_fat)
     *
     * @return subcutaneousFat String
     */
    public String getSubcutaneousFat() {
        return subcutaneousFat;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.subcutaneous_fat)
     *
     * @param subcutaneousFat String
     */
    public void setSubcutaneousFat(String subcutaneousFat) {
        this.subcutaneousFat = subcutaneousFat;
        this._selectiveMark.put("subcutaneousFat", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.muscle_consumption)
     *
     * @return muscleConsumption String
     */
    public String getMuscleConsumption() {
        return muscleConsumption;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.muscle_consumption)
     *
     * @param muscleConsumption String
     */
    public void setMuscleConsumption(String muscleConsumption) {
        this.muscleConsumption = muscleConsumption;
        this._selectiveMark.put("muscleConsumption", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.sga_score)
     *
     * @return sgaScore String
     */
    public String getSgaScore() {
        return sgaScore;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.sga_score)
     *
     * @param sgaScore String
     */
    public void setSgaScore(String sgaScore) {
        this.sgaScore = sgaScore;
        this._selectiveMark.put("sgaScore", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.sga_assessment)
     *
     * @return sgaAssessment String
     */
    public String getSgaAssessment() {
        return sgaAssessment;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.sga_assessment)
     *
     * @param sgaAssessment String
     */
    public void setSgaAssessment(String sgaAssessment) {
        this.sgaAssessment = sgaAssessment;
        this._selectiveMark.put("sgaAssessment", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.hemoglobin_analysis)
     *
     * @return hemoglobinAnalysis String
     */
    public String getHemoglobinAnalysis() {
        return hemoglobinAnalysis;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.hemoglobin_analysis)
     *
     * @param hemoglobinAnalysis String
     */
    public void setHemoglobinAnalysis(String hemoglobinAnalysis) {
        this.hemoglobinAnalysis = hemoglobinAnalysis;
        this._selectiveMark.put("hemoglobinAnalysis", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.ferritin_analysis)
     *
     * @return ferritinAnalysis String
     */
    public String getFerritinAnalysis() {
        return ferritinAnalysis;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.ferritin_analysis)
     *
     * @param ferritinAnalysis String
     */
    public void setFerritinAnalysis(String ferritinAnalysis) {
        this.ferritinAnalysis = ferritinAnalysis;
        this._selectiveMark.put("ferritinAnalysis", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.ca)
     *
     * @return ca String
     */
    public String getCa() {
        return ca;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.ca)
     *
     * @param ca String
     */
    public void setCa(String ca) {
        this.ca = ca;
        this._selectiveMark.put("ca", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.p)
     *
     * @return p String
     */
    public String getP() {
        return p;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.p)
     *
     * @param p String
     */
    public void setP(String p) {
        this.p = p;
        this._selectiveMark.put("p", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.pth)
     *
     * @return pth String
     */
    public String getPth() {
        return pth;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.pth)
     *
     * @param pth String
     */
    public void setPth(String pth) {
        this.pth = pth;
        this._selectiveMark.put("pth", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.nutriture)
     *
     * @return nutriture String
     */
    public String getNutriture() {
        return nutriture;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.nutriture)
     *
     * @param nutriture String
     */
    public void setNutriture(String nutriture) {
        this.nutriture = nutriture;
        this._selectiveMark.put("nutriture", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.dialysis_adequacy)
     *
     * @return dialysisAdequacy String
     */
    public String getDialysisAdequacy() {
        return dialysisAdequacy;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.dialysis_adequacy)
     *
     * @param dialysisAdequacy String
     */
    public void setDialysisAdequacy(String dialysisAdequacy) {
        this.dialysisAdequacy = dialysisAdequacy;
        this._selectiveMark.put("dialysisAdequacy", true);
    }

    /**
     * 取得： (PD_D_PATIENT_OUTPATIENT_EVALUATION.k)
     *
     * @return k String
     */
    public String getK() {
        return k;
    }

    /**
     * 设定： (PD_D_PATIENT_OUTPATIENT_EVALUATION.k)
     *
     * @param k String
     */
    public void setK(String k) {
        this.k = k;
        this._selectiveMark.put("k", true);
    }

    /**
     * 取得：删除标志 (PD_D_PATIENT_OUTPATIENT_EVALUATION.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_D_PATIENT_OUTPATIENT_EVALUATION.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_D_PATIENT_OUTPATIENT_EVALUATION.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_D_PATIENT_OUTPATIENT_EVALUATION.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_D_PATIENT_OUTPATIENT_EVALUATION.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_D_PATIENT_OUTPATIENT_EVALUATION.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_D_PATIENT_OUTPATIENT_EVALUATION.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_D_PATIENT_OUTPATIENT_EVALUATION.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_D_PATIENT_OUTPATIENT_EVALUATION.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_D_PATIENT_OUTPATIENT_EVALUATION.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_D_PATIENT_OUTPATIENT_EVALUATION.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_D_PATIENT_OUTPATIENT_EVALUATION.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (PD_D_PATIENT_OUTPATIENT_EVALUATION.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (PD_D_PATIENT_OUTPATIENT_EVALUATION.screen_id)
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