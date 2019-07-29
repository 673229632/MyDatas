package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_d_approve_file]`s Columns.
 */
public enum PdDApproveFileColumnEnum implements ModelColumn {
    FILENO("file_no", "VARCHAR", "fileNo", java.lang.String.class, true, false, false),
    FILENAME("file_name", "VARCHAR", "fileName", java.lang.String.class, false, false, false),
    NFILENAME("n_file_name", "VARCHAR", "nFileName", java.lang.String.class, false, true, false),
    FILEPATH("file_path", "VARCHAR", "filePath", java.lang.String.class, false, true, false),
    ORGNO("org_no", "VARCHAR", "orgNo", java.lang.String.class, false, true, false),
    PNTID("pnt_id", "VARCHAR", "pntId", java.lang.String.class, false, true, false),
    EMPLOYEENO("employee_no", "VARCHAR", "employeeNo", java.lang.String.class, false, true, false),
    FILETYPENO("file_type_no", "VARCHAR", "fileTypeNo", java.lang.String.class, false, true, false),
    FORMATTYPE("format_type", "VARCHAR", "formatType", java.lang.String.class, false, true, false),
    FILEORDER("file_order", "INTEGER", "fileOrder", java.lang.Integer.class, false, true, false),
    ORDERINDEX("order_index", "BIGINT", "orderIndex", java.lang.Long.class, false, true, false),
    DELFLAG("del_flag", "VARCHAR", "delFlag", java.lang.String.class, false, false, false),
    CREATEDBY("created_by", "VARCHAR", "createdBy", java.lang.String.class, false, false, false),
    DATECREATED("date_created", "TIMESTAMP", "dateCreated", java.util.Date.class, false, false, false),
    MODIFIEDBY("modified_by", "VARCHAR", "modifiedBy", java.lang.String.class, false, false, false),
    DATEMODIFIED("date_modified", "TIMESTAMP", "dateModified", java.util.Date.class, false, false, false),
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

    PdDApproveFileColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}