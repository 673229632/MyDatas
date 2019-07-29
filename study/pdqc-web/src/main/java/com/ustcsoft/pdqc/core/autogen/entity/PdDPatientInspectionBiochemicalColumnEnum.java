package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.ModelColumn;

/**
 * Table [pd_d_patient_inspection_biochemical]`s Columns.
 */
public enum PdDPatientInspectionBiochemicalColumnEnum implements ModelColumn {
    ID("id", "VARCHAR", "id", java.lang.String.class, true, false, false),
    HPID("hp_id", "VARCHAR", "hpId", java.lang.String.class, false, false, false),
    PTID("pt_id", "VARCHAR", "ptId", java.lang.String.class, false, false, false),
    TDATE("tdate", "TIMESTAMP", "tdate", java.util.Date.class, false, true, false),
    ALT("alt", "VARCHAR", "alt", java.lang.String.class, false, true, false),
    AST("ast", "VARCHAR", "ast", java.lang.String.class, false, true, false),
    TP("tp", "VARCHAR", "tp", java.lang.String.class, false, true, false),
    ALB("alb", "VARCHAR", "alb", java.lang.String.class, false, true, false),
    SEROGLOBULIN("seroglobulin", "VARCHAR", "seroglobulin", java.lang.String.class, false, true, false),
    AG("ag", "VARCHAR", "ag", java.lang.String.class, false, true, false),
    TBIL("tbil", "VARCHAR", "tbil", java.lang.String.class, false, true, false),
    DBIL("dbil", "VARCHAR", "dbil", java.lang.String.class, false, true, false),
    IBIL("ibil", "VARCHAR", "ibil", java.lang.String.class, false, true, false),
    TBA("tba", "VARCHAR", "tba", java.lang.String.class, false, true, false),
    GLU("glu", "VARCHAR", "glu", java.lang.String.class, false, true, false),
    BUN("bun", "VARCHAR", "bun", java.lang.String.class, false, true, false),
    CRE("cre", "VARCHAR", "cre", java.lang.String.class, false, true, false),
    UA("ua", "VARCHAR", "ua", java.lang.String.class, false, true, false),
    CO2("co2", "VARCHAR", "co2", java.lang.String.class, false, true, false),
    ALP("alp", "VARCHAR", "alp", java.lang.String.class, false, true, false),
    GGT("ggt", "VARCHAR", "ggt", java.lang.String.class, false, true, false),
    K("k", "VARCHAR", "k", java.lang.String.class, false, true, false),
    NA("na", "VARCHAR", "na", java.lang.String.class, false, true, false),
    CL("cl", "VARCHAR", "cl", java.lang.String.class, false, true, false),
    CA("ca", "VARCHAR", "ca", java.lang.String.class, false, true, false),
    P("p", "VARCHAR", "p", java.lang.String.class, false, true, false),
    MG("mg", "VARCHAR", "mg", java.lang.String.class, false, true, false),
    CK("ck", "VARCHAR", "ck", java.lang.String.class, false, true, false),
    LDH("ldh", "VARCHAR", "ldh", java.lang.String.class, false, true, false),
    AHBDH("ahbdh", "VARCHAR", "ahbdh", java.lang.String.class, false, true, false),
    CREATINEKINASEISOENZYME("creatine_kinase_isoenzyme", "VARCHAR", "creatineKinaseIsoenzyme", java.lang.String.class, false, true, false),
    TC("tc", "VARCHAR", "tc", java.lang.String.class, false, true, false),
    TG("tg", "VARCHAR", "tg", java.lang.String.class, false, true, false),
    HDLC("hdlc", "VARCHAR", "hdlc", java.lang.String.class, false, true, false),
    LDLC("ldlc", "VARCHAR", "ldlc", java.lang.String.class, false, true, false),
    APOLIPOPROTEINA1("apolipoprotein_a1", "VARCHAR", "apolipoproteinA1", java.lang.String.class, false, true, false),
    APOLIPOPROTEINB("apolipoprotein_b", "VARCHAR", "apolipoproteinB", java.lang.String.class, false, true, false),
    LPA("lpa", "VARCHAR", "lpa", java.lang.String.class, false, true, false),
    APOLIPOPROTEINE("apolipoprotein_e", "VARCHAR", "apolipoproteinE", java.lang.String.class, false, true, false),
    PA("pa", "VARCHAR", "pa", java.lang.String.class, false, true, false),
    ADA("ada", "VARCHAR", "ada", java.lang.String.class, false, true, false),
    MICROGLOBULINB2("microglobulin_b2", "VARCHAR", "microglobulinB2", java.lang.String.class, false, true, false),
    AFU("afu", "VARCHAR", "afu", java.lang.String.class, false, true, false),
    CYSTATIN("cystatin", "VARCHAR", "cystatin", java.lang.String.class, false, true, false),
    NT5("nt5", "VARCHAR", "nt5", java.lang.String.class, false, true, false),
    HSCRP("hscrp", "VARCHAR", "hscrp", java.lang.String.class, false, true, false),
    BHB("bhb", "VARCHAR", "bhb", java.lang.String.class, false, true, false),
    MAO("mao", "VARCHAR", "mao", java.lang.String.class, false, true, false),
    SIALICACID("sialic_acid", "VARCHAR", "sialicAcid", java.lang.String.class, false, true, false),
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

    PdDPatientInspectionBiochemicalColumnEnum(String name, String type, String javaName, Class<?> javaType, boolean primaryKey, boolean nullable, boolean blobColumn) {
        this.name = name;
        this.type = type;
        this.javaName = javaName;
        this.javaType = javaType;
        this.primaryKey = primaryKey;
        this.nullable = nullable;
        this.blobColumn = blobColumn;
    }
}