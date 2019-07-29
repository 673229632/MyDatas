package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_m_check_result_time]`s Columns.
 */
public enum PdMCheckResultTimeColumnEnum implements ModelColumn {
    CHECKNO("check_no", "VARCHAR", "checkNo", java.lang.String.class, true, false, false),
    CHECKNAME("check_name", "VARCHAR", "checkName", java.lang.String.class, false, false, false),
    STANDARDNO("standard_no", "VARCHAR", "standardNo", java.lang.String.class, false, false, false),
    QCCENTERNO("qc_center_no", "VARCHAR", "qcCenterNo", java.lang.String.class, false, false, false),
    CHECKSTARTDATE("check_start_date", "TIMESTAMP", "checkStartDate", java.util.Date.class, false, false, false),
    CHECKENDDATE("check_end_date", "TIMESTAMP", "checkEndDate", java.util.Date.class, false, false, false),
    PUBLISHSTARTDATE("publish_start_date", "TIMESTAMP", "publishStartDate", java.util.Date.class, false, false, false),
    PUBLISHENDDATE("publish_end_date", "TIMESTAMP", "publishEndDate", java.util.Date.class, false, false, false),
    PUBLISHSTATUS("publish_status", "CHAR", "publishStatus", java.lang.String.class, false, true, false),
    USESIGN("use_sign", "CHAR", "useSign", java.lang.String.class, false, true, false),
    KPIPART("kpi_part", "VARCHAR", "kpiPart", java.lang.String.class, false, true, false),
    DELFLAG("del_flag", "CHAR", "delFlag", java.lang.String.class, false, false, false),
    ORDERINDEX("order_index", "BIGINT", "orderIndex", java.lang.Long.class, false, false, false),
    CREATEDBY("created_by", "VARCHAR", "createdBy", java.lang.String.class, false, false, false),
    DATECREATED("date_created", "TIMESTAMP", "dateCreated", java.util.Date.class, false, false, false),
    MODIFIEDBY("modified_by", "VARCHAR", "modifiedBy", java.lang.String.class, false, false, false),
    DATEMODIFIED("date_modified", "TIMESTAMP", "dateModified", java.util.Date.class, false, false, false),
    ROWVERSION("row_version", "BIGINT", "rowVersion", java.lang.Long.class, false, false, false);

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

    PdMCheckResultTimeColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}