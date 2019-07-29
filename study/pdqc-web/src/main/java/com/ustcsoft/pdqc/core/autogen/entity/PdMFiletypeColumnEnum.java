package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_m_filetype]`s Columns.
 */
public enum PdMFiletypeColumnEnum implements ModelColumn {
    FILETYPENO("file_type_no", "VARCHAR", "fileTypeNo", java.lang.String.class, true, false, false),
    FILETYPENAME("file_type_name", "VARCHAR", "fileTypeName", java.lang.String.class, false, false, false),
    ORDERINDEX("order_index", "BIGINT", "orderIndex", java.lang.Long.class, false, true, false),
    DELFLAG("del_flag", "CHAR", "delFlag", java.lang.String.class, false, true, false),
    CREATEDBY("created_by", "VARCHAR", "createdBy", java.lang.String.class, false, true, false),
    DATECREATED("date_created", "TIMESTAMP", "dateCreated", java.util.Date.class, false, true, false),
    MODIFIEDBY("modified_by", "VARCHAR", "modifiedBy", java.lang.String.class, false, true, false),
    DATEMODIFIED("date_modified", "TIMESTAMP", "dateModified", java.util.Date.class, false, true, false),
    ROWVERSION("row_version", "BIGINT", "rowVersion", java.lang.Long.class, false, true, false),
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

    PdMFiletypeColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}