package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_d_patient_inspection_infection_diseases]`s Columns.
 */
public enum PdDPatientInspectionInfectionDiseasesColumnEnum implements ModelColumn {
    ID("id", "VARCHAR", "id", java.lang.String.class, true, false, false),
    HPID("hp_id", "VARCHAR", "hpId", java.lang.String.class, false, false, false),
    PTID("pt_id", "VARCHAR", "ptId", java.lang.String.class, false, false, false),
    TDATE("tdate", "TIMESTAMP", "tdate", java.util.Date.class, false, true, false),
    HBSAG("hbsag", "VARCHAR", "hbsag", java.lang.String.class, false, true, false),
    HBSAB("hbsab", "VARCHAR", "hbsab", java.lang.String.class, false, true, false),
    HBEAG("hbeag", "VARCHAR", "hbeag", java.lang.String.class, false, true, false),
    HBEAB("hbeab", "VARCHAR", "hbeab", java.lang.String.class, false, true, false),
    HBCAB("hbcab", "VARCHAR", "hbcab", java.lang.String.class, false, true, false),
    HBVDNASE("hbvdnase", "VARCHAR", "hbvdnase", java.lang.String.class, false, true, false),
    HAV("hav", "VARCHAR", "hav", java.lang.String.class, false, true, false),
    HBCABIGM("hbcabigm", "VARCHAR", "hbcabigm", java.lang.String.class, false, true, false),
    HCVIGG("hcvigg", "VARCHAR", "hcvigg", java.lang.String.class, false, true, false),
    HCVIGM("hcvigm", "VARCHAR", "hcvigm", java.lang.String.class, false, true, false),
    HDV("hdv", "VARCHAR", "hdv", java.lang.String.class, false, true, false),
    HEV("hev", "VARCHAR", "hev", java.lang.String.class, false, true, false),
    HGV("hgv", "VARCHAR", "hgv", java.lang.String.class, false, true, false),
    HIV("hiv", "VARCHAR", "hiv", java.lang.String.class, false, true, false),
    TPAB("tpab", "VARCHAR", "tpab", java.lang.String.class, false, true, false),
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

    PdDPatientInspectionInfectionDiseasesColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}