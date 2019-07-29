package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_d_center]`s Columns.
 */
public enum PdDCenterColumnEnum implements ModelColumn {
    PDCENTERNO("pd_center_no", "VARCHAR", "pdCenterNo", java.lang.String.class, true, false, false),
    PDCENTERNAME("pd_center_name", "VARCHAR", "pdCenterName", java.lang.String.class, false, false, false),
    ORGNO("org_no", "VARCHAR", "orgNo", java.lang.String.class, false, false, false),
    ADJUSTORG("adjust_org", "VARCHAR", "adjustOrg", java.lang.String.class, false, false, false),
    PDCENTERADDRESS("pd_center__address", "VARCHAR", "pdCenterAddress", java.lang.String.class, false, true, false),
    PDCENTERTEL("pd_center__tel", "VARCHAR", "pdCenterTel", java.lang.String.class, false, true, false),
    PDCENTERPOSTCODE("pd_center__postcode", "VARCHAR", "pdCenterPostcode", java.lang.String.class, false, true, false),
    PDCENTEREMAIL("pd_center_email", "VARCHAR", "pdCenterEmail", java.lang.String.class, false, true, false),
    PDCENTERFAX("pd_center__fax", "VARCHAR", "pdCenterFax", java.lang.String.class, false, true, false),
    PDCENTERMENO("pd_center__meno", "VARCHAR", "pdCenterMeno", java.lang.String.class, false, true, false),
    PDCENTERAREA("pd_center__area", "VARCHAR", "pdCenterArea", java.lang.String.class, false, true, false),
    PDCENTERMANAGER("pd_center__manager", "VARCHAR", "pdCenterManager", java.lang.String.class, false, true, false),
    SCOREWEIGHT("score_weight", "DECIMAL", "scoreWeight", java.math.BigDecimal.class, false, false, false),
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

    PdDCenterColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}