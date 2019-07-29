package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_m_kpiseg]`s Columns.
 */
public enum PdMKpisegColumnEnum implements ModelColumn {
    KPIID("kpi_id", "VARCHAR", "kpiId", java.lang.String.class, true, false, false),
    SUBCODE("sub_code", "CHAR", "subCode", java.lang.String.class, false, true, false),
    SUBNAME("sub_name", "VARCHAR", "subName", java.lang.String.class, false, true, false),
    SEGMENTCODE("segment_code", "VARCHAR", "segmentCode", java.lang.String.class, false, false, false),
    SEGMENTNAME("segment_name", "VARCHAR", "segmentName", java.lang.String.class, false, false, false),
    UNITCODE("unit_code", "CHAR", "unitCode", java.lang.String.class, false, true, false),
    UNITNAME("unit_name", "VARCHAR", "unitName", java.lang.String.class, false, true, false),
    MINVALUE("min_value", "VARCHAR", "minValue", java.lang.String.class, false, true, false),
    MAXVALUE("max_value", "VARCHAR", "maxValue", java.lang.String.class, false, true, false),
    ORDERINDEX("order_index", "BIGINT", "orderIndex", java.lang.Long.class, false, true, false),
    DELFLAG("del_flag", "CHAR", "delFlag", java.lang.String.class, false, true, false),
    CREATEDBY("created_by", "VARCHAR", "createdBy", java.lang.String.class, false, true, false),
    DATECREATED("date_created", "TIMESTAMP", "dateCreated", java.util.Date.class, false, true, false),
    MODIFIEDBY("modified_by", "VARCHAR", "modifiedBy", java.lang.String.class, false, true, false),
    DATEMODIFIED("date_modified", "TIMESTAMP", "dateModified", java.util.Date.class, false, true, false),
    ROWVERSION("row_version", "BIGINT", "rowVersion", java.lang.Long.class, false, true, false);

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

    PdMKpisegColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}