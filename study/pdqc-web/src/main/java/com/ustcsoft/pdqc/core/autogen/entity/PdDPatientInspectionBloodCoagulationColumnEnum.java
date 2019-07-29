package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_d_patient_inspection_blood_coagulation]`s Columns.
 */
public enum PdDPatientInspectionBloodCoagulationColumnEnum implements ModelColumn {
    ID("id", "VARCHAR", "id", java.lang.String.class, true, false, false),
    HPID("hp_id", "VARCHAR", "hpId", java.lang.String.class, false, false, false),
    PTID("pt_id", "VARCHAR", "ptId", java.lang.String.class, false, false, false),
    TDATE("tdate", "TIMESTAMP", "tdate", java.util.Date.class, false, true, false),
    FIB("fib", "VARCHAR", "fib", java.lang.String.class, false, true, false),
    APTT("aptt", "VARCHAR", "aptt", java.lang.String.class, false, true, false),
    PTA("pta", "VARCHAR", "pta", java.lang.String.class, false, true, false),
    PT("pt", "VARCHAR", "pt", java.lang.String.class, false, true, false),
    TT("tt", "VARCHAR", "tt", java.lang.String.class, false, true, false),
    INR("inr", "VARCHAR", "inr", java.lang.String.class, false, true, false),
    FDP("fdp", "VARCHAR", "fdp", java.lang.String.class, false, true, false),
    DDIMER("ddimer", "VARCHAR", "ddimer", java.lang.String.class, false, true, false),
    AT3("at3", "VARCHAR", "at3", java.lang.String.class, false, true, false),
    PLASMINOGENINHIBITORA2("plasminogen_inhibitor_a2", "VARCHAR", "plasminogenInhibitorA2", java.lang.String.class, false, true, false),
    PLGA("plga", "VARCHAR", "plga", java.lang.String.class, false, true, false),
    OTHERS("others", "VARCHAR", "others", java.lang.String.class, false, true, false),
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

    PdDPatientInspectionBloodCoagulationColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}