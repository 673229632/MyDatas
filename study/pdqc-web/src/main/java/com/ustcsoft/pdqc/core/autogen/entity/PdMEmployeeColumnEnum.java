package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_m_employee]`s Columns.
 */
public enum PdMEmployeeColumnEnum implements ModelColumn {
    EMPLOYEENO("employee_no", "VARCHAR", "employeeNo", java.lang.String.class, true, false, false),
    ORGNO("org_no", "VARCHAR", "orgNo", java.lang.String.class, false, false, false),
    EMPLOYEENAME("employee_name", "VARCHAR", "employeeName", java.lang.String.class, false, false, false),
    EMPLOYEESEX("employee_sex", "VARCHAR", "employeeSex", java.lang.String.class, false, true, false),
    EMPLOYEETYPE("employee_type", "VARCHAR", "employeeType", java.lang.String.class, false, true, false),
    CERTIFICATETYPE("certificate_type", "VARCHAR", "certificateType", java.lang.String.class, false, true, false),
    CERTIFICATENO("certificate_no", "VARCHAR", "certificateNo", java.lang.String.class, false, true, false),
    IDCARDNO("id_card_no", "VARCHAR", "idCardNo", java.lang.String.class, false, true, false),
    BIRTHDAY("birthday", "DATE", "birthday", java.util.Date.class, false, true, false),
    EMPLOYEETEL("employee_tel", "VARCHAR", "employeeTel", java.lang.String.class, false, true, false),
    MEDIYEAR("medi_year", "VARCHAR", "mediYear", java.lang.String.class, false, true, false),
    DIALYEAR("dial_year", "VARCHAR", "dialYear", java.lang.String.class, false, true, false),
    EMPLOYEEMOBILE("employee_mobile", "VARCHAR", "employeeMobile", java.lang.String.class, false, true, false),
    EMPLOYEEADDRESS("employee_address", "VARCHAR", "employeeAddress", java.lang.String.class, false, true, false),
    ORDERINDEX("order_index", "BIGINT", "orderIndex", java.lang.Long.class, false, true, false),
    WORKSTART("work_start", "DATE", "workStart", java.util.Date.class, false, true, false),
    EDUCATION("education", "VARCHAR", "education", java.lang.String.class, false, true, false),
    EMPLOYEEEMAIL("employee_email", "VARCHAR", "employeeEmail", java.lang.String.class, false, true, false),
    EMPLOYEEPOST("employee_post", "VARCHAR", "employeePost", java.lang.String.class, false, true, false),
    ISPARTTIME("is_parttime", "CHAR", "isParttime", java.lang.String.class, false, true, false),
    ISCHECK("is_check", "CHAR", "isCheck", java.lang.String.class, false, true, false),
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

    PdMEmployeeColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}