package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_d_patient_inspection_routine_blood]`s Columns.
 */
public enum PdDPatientInspectionRoutineBloodColumnEnum implements ModelColumn {
    ID("id", "VARCHAR", "id", java.lang.String.class, true, false, false),
    HPID("hp_id", "VARCHAR", "hpId", java.lang.String.class, false, false, false),
    PTID("pt_id", "VARCHAR", "ptId", java.lang.String.class, false, false, false),
    TDATE("tdate", "TIMESTAMP", "tdate", java.util.Date.class, false, true, false),
    WBC("wbc", "VARCHAR", "wbc", java.lang.String.class, false, true, false),
    RBC("rbc", "VARCHAR", "rbc", java.lang.String.class, false, true, false),
    HB("hb", "VARCHAR", "hb", java.lang.String.class, false, true, false),
    HCT("hct", "VARCHAR", "hct", java.lang.String.class, false, true, false),
    MCV("mcv", "VARCHAR", "mcv", java.lang.String.class, false, true, false),
    MCH("mch", "VARCHAR", "mch", java.lang.String.class, false, true, false),
    MCHC("mchc", "VARCHAR", "mchc", java.lang.String.class, false, true, false),
    RDW("rdw", "VARCHAR", "rdw", java.lang.String.class, false, true, false),
    RDWSD("rdwsd", "VARCHAR", "rdwsd", java.lang.String.class, false, true, false),
    PLT("plt", "VARCHAR", "plt", java.lang.String.class, false, true, false),
    MPV("mpv", "VARCHAR", "mpv", java.lang.String.class, false, true, false),
    PDW("pdw", "VARCHAR", "pdw", java.lang.String.class, false, true, false),
    PCT("pct", "VARCHAR", "pct", java.lang.String.class, false, true, false),
    PLCR("plcr", "VARCHAR", "plcr", java.lang.String.class, false, true, false),
    NEUTROPHILPERCENTAGE("neutrophil_percentage", "VARCHAR", "neutrophilPercentage", java.lang.String.class, false, true, false),
    LYMPHOCYTEPERCENTAGE("lymphocyte_percentage", "VARCHAR", "lymphocytePercentage", java.lang.String.class, false, true, false),
    MONOCYTEPERCENTAGE("monocyte_percentage", "VARCHAR", "monocytePercentage", java.lang.String.class, false, true, false),
    EOSINOPHILPERCENTAGE("eosinophil_percentage", "VARCHAR", "eosinophilPercentage", java.lang.String.class, false, true, false),
    BASOPHILPERCENTAGE("basophil_percentage", "VARCHAR", "basophilPercentage", java.lang.String.class, false, true, false),
    NEUTROPHILABSOLUTEVALUE("neutrophil_absolute_value", "VARCHAR", "neutrophilAbsoluteValue", java.lang.String.class, false, true, false),
    LYMPHOCYTEABSOLUTEVALUE("lymphocyte_absolute_value", "VARCHAR", "lymphocyteAbsoluteValue", java.lang.String.class, false, true, false),
    MONOCYTEABSOLUTEVALUE("monocyte_absolute_value", "VARCHAR", "monocyteAbsoluteValue", java.lang.String.class, false, true, false),
    EOSINOPHILABSOLUTEVALUE("eosinophil_absolute_value", "VARCHAR", "eosinophilAbsoluteValue", java.lang.String.class, false, true, false),
    BASOPHILABSOLUTEVALUE("basophil_absolute_value", "VARCHAR", "basophilAbsoluteValue", java.lang.String.class, false, true, false),
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

    PdDPatientInspectionRoutineBloodColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}