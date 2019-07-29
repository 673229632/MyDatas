package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_d_patient_outpatient_evaluation]`s Columns.
 */
public enum PdDPatientOutpatientEvaluationColumnEnum implements ModelColumn {
    ID("id", "VARCHAR", "id", java.lang.String.class, true, false, false),
    HPID("hp_id", "VARCHAR", "hpId", java.lang.String.class, false, false, false),
    PTID("pt_id", "VARCHAR", "ptId", java.lang.String.class, false, false, false),
    TDATE("tdate", "TIMESTAMP", "tdate", java.util.Date.class, false, true, false),
    WEIGHT("weight", "VARCHAR", "weight", java.lang.String.class, false, true, false),
    BMI("bmi", "VARCHAR", "bmi", java.lang.String.class, false, true, false),
    BLOODPRESSURE("blood_pressure", "VARCHAR", "bloodPressure", java.lang.String.class, false, true, false),
    ULTRAFILTRATION("ultrafiltration", "VARCHAR", "ultrafiltration", java.lang.String.class, false, true, false),
    URUNARYPRODUCTION("urunary_production", "VARCHAR", "urunaryProduction", java.lang.String.class, false, true, false),
    CARDIACFUNCTIONLEVEL("cardiac_function_level", "VARCHAR", "cardiacFunctionLevel", java.lang.String.class, false, true, false),
    EDEMAGRADE("edema_grade", "VARCHAR", "edemaGrade", java.lang.String.class, false, true, false),
    ALIMENTARYSYMPTOMS("alimentary_symptoms", "VARCHAR", "alimentarySymptoms", java.lang.String.class, false, true, false),
    OTHERSYMPTOMS("other_symptoms", "VARCHAR", "otherSymptoms", java.lang.String.class, false, true, false),
    CATHEROUTASSESSMENT("cather_out_assessment", "VARCHAR", "catherOutAssessment", java.lang.String.class, false, true, false),
    CATHEROUTSCORE("cather_out_score", "VARCHAR", "catherOutScore", java.lang.String.class, false, true, false),
    WEIGHTCHANGE("weight_change", "VARCHAR", "weightChange", java.lang.String.class, false, true, false),
    DIETCHANGE("diet_change", "VARCHAR", "dietChange", java.lang.String.class, false, true, false),
    GASTROINTESTINALSYMPTOMS("gastrointestinal_symptoms", "VARCHAR", "gastrointestinalSymptoms", java.lang.String.class, false, true, false),
    ACTIVITYABILITY("activity_ability", "VARCHAR", "activityAbility", java.lang.String.class, false, true, false),
    COMPLICATION("complication", "VARCHAR", "complication", java.lang.String.class, false, true, false),
    SUBCUTANEOUSFAT("subcutaneous_fat", "VARCHAR", "subcutaneousFat", java.lang.String.class, false, true, false),
    MUSCLECONSUMPTION("muscle_consumption", "VARCHAR", "muscleConsumption", java.lang.String.class, false, true, false),
    SGASCORE("sga_score", "VARCHAR", "sgaScore", java.lang.String.class, false, true, false),
    SGAASSESSMENT("sga_assessment", "VARCHAR", "sgaAssessment", java.lang.String.class, false, true, false),
    HEMOGLOBINANALYSIS("hemoglobin_analysis", "VARCHAR", "hemoglobinAnalysis", java.lang.String.class, false, true, false),
    FERRITINANALYSIS("ferritin_analysis", "VARCHAR", "ferritinAnalysis", java.lang.String.class, false, true, false),
    CA("ca", "VARCHAR", "ca", java.lang.String.class, false, true, false),
    P("p", "VARCHAR", "p", java.lang.String.class, false, true, false),
    PTH("pth", "VARCHAR", "pth", java.lang.String.class, false, true, false),
    NUTRITURE("nutriture", "VARCHAR", "nutriture", java.lang.String.class, false, true, false),
    DIALYSISADEQUACY("dialysis_adequacy", "VARCHAR", "dialysisAdequacy", java.lang.String.class, false, true, false),
    K("k", "VARCHAR", "k", java.lang.String.class, false, true, false),
    DELFLAG("del_flag", "VARCHAR", "delFlag", java.lang.String.class, false, false, false),
    CREATEDBY("created_by", "VARCHAR", "createdBy", java.lang.String.class, false, false, false),
    DATECREATED("date_created", "TIMESTAMP", "dateCreated", java.util.Date.class, false, false, false),
    MODIFIEDBY("modified_by", "VARCHAR", "modifiedBy", java.lang.String.class, false, false, false),
    DATEMODIFIED("date_modified", "TIMESTAMP", "dateModified", java.util.Date.class, false, false, false),
    ROWVERSION("row_version", "INTEGER", "rowVersion", java.lang.Integer.class, false, false, false),
    SCREENID("screen_id", "VARCHAR", "screenId", java.lang.String.class, false, true, false);

    final String name;

    final String type;

    final String javaName;

    final Class<?> javaType;

    final boolean primaryKey;

    final boolean nullable;

    final boolean blobColumn;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getJavaName() {
        return this.javaName;
    }

    @Override
    public Class<?> getJavaType() {
        return this.javaType;
    }

    @Override
    public boolean isPrimaryKey() {
        return this.primaryKey;
    }

    @Override
    public boolean isNullable() {
        return this.nullable;
    }

    @Override
    public boolean isBlobColumn() {
        return this.blobColumn;
    }

    @Override
    public String getOrderByString(boolean isDesc) {
        return this.getName() + (isDesc ? " desc" : " asc");
    }

    PdDPatientOutpatientEvaluationColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}