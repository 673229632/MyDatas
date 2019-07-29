//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenExample;
import com.ustcsoft.mybatis.autogen.entity.ModelColumn;
import com.ustcsoft.mybatis.autogen.entity.ModelColumnSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PdMEmployeeExample implements ModelColumnSupport, AutoGenExample {
    /**
     * 排序.
     */
    protected String orderByClause;

    /**
     * 是否去重.
     */
    protected boolean distinct;

    /**
     * 条件列表.
     */
    protected List<Criteria> oredCriteria;

    public PdMEmployeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    @Override
    public ModelColumn[] getColumnList() {
        return PdMEmployeeColumnEnum.values();
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEmployeeNoIsNull() {
            addCriterion("employee_no is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNotNull() {
            addCriterion("employee_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoEqualTo(String value) {
            addCriterion("employee_no =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotEqualTo(String value) {
            addCriterion("employee_no <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThan(String value) {
            addCriterion("employee_no >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_no >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThan(String value) {
            addCriterion("employee_no <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThanOrEqualTo(String value) {
            addCriterion("employee_no <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLike(String value) {
            addCriterion("employee_no like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotLike(String value) {
            addCriterion("employee_no not like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIn(List<String> values) {
            addCriterion("employee_no in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotIn(List<String> values) {
            addCriterion("employee_no not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoBetween(String value1, String value2) {
            addCriterion("employee_no between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotBetween(String value1, String value2) {
            addCriterion("employee_no not between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("org_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("org_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("org_no =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("org_no <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("org_no >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_no >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("org_no <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("org_no <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("org_no like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("org_no not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("org_no in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("org_no not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("org_no between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("org_no not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIsNull() {
            addCriterion("employee_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIsNotNull() {
            addCriterion("employee_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexEqualTo(String value) {
            addCriterion("employee_sex =", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotEqualTo(String value) {
            addCriterion("employee_sex <>", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexGreaterThan(String value) {
            addCriterion("employee_sex >", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexGreaterThanOrEqualTo(String value) {
            addCriterion("employee_sex >=", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLessThan(String value) {
            addCriterion("employee_sex <", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLessThanOrEqualTo(String value) {
            addCriterion("employee_sex <=", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLike(String value) {
            addCriterion("employee_sex like", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotLike(String value) {
            addCriterion("employee_sex not like", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIn(List<String> values) {
            addCriterion("employee_sex in", values, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotIn(List<String> values) {
            addCriterion("employee_sex not in", values, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexBetween(String value1, String value2) {
            addCriterion("employee_sex between", value1, value2, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotBetween(String value1, String value2) {
            addCriterion("employee_sex not between", value1, value2, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIsNull() {
            addCriterion("employee_type is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIsNotNull() {
            addCriterion("employee_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeEqualTo(String value) {
            addCriterion("employee_type =", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotEqualTo(String value) {
            addCriterion("employee_type <>", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeGreaterThan(String value) {
            addCriterion("employee_type >", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("employee_type >=", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLessThan(String value) {
            addCriterion("employee_type <", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLessThanOrEqualTo(String value) {
            addCriterion("employee_type <=", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLike(String value) {
            addCriterion("employee_type like", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotLike(String value) {
            addCriterion("employee_type not like", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIn(List<String> values) {
            addCriterion("employee_type in", values, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotIn(List<String> values) {
            addCriterion("employee_type not in", values, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeBetween(String value1, String value2) {
            addCriterion("employee_type between", value1, value2, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotBetween(String value1, String value2) {
            addCriterion("employee_type not between", value1, value2, "employeeType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("certificate_no is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("certificate_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("certificate_no =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("certificate_no <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("certificate_no >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_no >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("certificate_no <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("certificate_no <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("certificate_no like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("certificate_no not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("certificate_no in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("certificate_no not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("certificate_no between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("certificate_no not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIsNull() {
            addCriterion("employee_tel is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIsNotNull() {
            addCriterion("employee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelEqualTo(String value) {
            addCriterion("employee_tel =", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotEqualTo(String value) {
            addCriterion("employee_tel <>", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelGreaterThan(String value) {
            addCriterion("employee_tel >", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelGreaterThanOrEqualTo(String value) {
            addCriterion("employee_tel >=", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLessThan(String value) {
            addCriterion("employee_tel <", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLessThanOrEqualTo(String value) {
            addCriterion("employee_tel <=", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLike(String value) {
            addCriterion("employee_tel like", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotLike(String value) {
            addCriterion("employee_tel not like", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIn(List<String> values) {
            addCriterion("employee_tel in", values, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotIn(List<String> values) {
            addCriterion("employee_tel not in", values, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelBetween(String value1, String value2) {
            addCriterion("employee_tel between", value1, value2, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotBetween(String value1, String value2) {
            addCriterion("employee_tel not between", value1, value2, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andMediYearIsNull() {
            addCriterion("medi_year is null");
            return (Criteria) this;
        }

        public Criteria andMediYearIsNotNull() {
            addCriterion("medi_year is not null");
            return (Criteria) this;
        }

        public Criteria andMediYearEqualTo(String value) {
            addCriterion("medi_year =", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearNotEqualTo(String value) {
            addCriterion("medi_year <>", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearGreaterThan(String value) {
            addCriterion("medi_year >", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearGreaterThanOrEqualTo(String value) {
            addCriterion("medi_year >=", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearLessThan(String value) {
            addCriterion("medi_year <", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearLessThanOrEqualTo(String value) {
            addCriterion("medi_year <=", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearLike(String value) {
            addCriterion("medi_year like", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearNotLike(String value) {
            addCriterion("medi_year not like", value, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearIn(List<String> values) {
            addCriterion("medi_year in", values, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearNotIn(List<String> values) {
            addCriterion("medi_year not in", values, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearBetween(String value1, String value2) {
            addCriterion("medi_year between", value1, value2, "mediYear");
            return (Criteria) this;
        }

        public Criteria andMediYearNotBetween(String value1, String value2) {
            addCriterion("medi_year not between", value1, value2, "mediYear");
            return (Criteria) this;
        }

        public Criteria andDialYearIsNull() {
            addCriterion("dial_year is null");
            return (Criteria) this;
        }

        public Criteria andDialYearIsNotNull() {
            addCriterion("dial_year is not null");
            return (Criteria) this;
        }

        public Criteria andDialYearEqualTo(String value) {
            addCriterion("dial_year =", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearNotEqualTo(String value) {
            addCriterion("dial_year <>", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearGreaterThan(String value) {
            addCriterion("dial_year >", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearGreaterThanOrEqualTo(String value) {
            addCriterion("dial_year >=", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearLessThan(String value) {
            addCriterion("dial_year <", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearLessThanOrEqualTo(String value) {
            addCriterion("dial_year <=", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearLike(String value) {
            addCriterion("dial_year like", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearNotLike(String value) {
            addCriterion("dial_year not like", value, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearIn(List<String> values) {
            addCriterion("dial_year in", values, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearNotIn(List<String> values) {
            addCriterion("dial_year not in", values, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearBetween(String value1, String value2) {
            addCriterion("dial_year between", value1, value2, "dialYear");
            return (Criteria) this;
        }

        public Criteria andDialYearNotBetween(String value1, String value2) {
            addCriterion("dial_year not between", value1, value2, "dialYear");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileIsNull() {
            addCriterion("employee_mobile is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileIsNotNull() {
            addCriterion("employee_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileEqualTo(String value) {
            addCriterion("employee_mobile =", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileNotEqualTo(String value) {
            addCriterion("employee_mobile <>", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileGreaterThan(String value) {
            addCriterion("employee_mobile >", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileGreaterThanOrEqualTo(String value) {
            addCriterion("employee_mobile >=", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileLessThan(String value) {
            addCriterion("employee_mobile <", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileLessThanOrEqualTo(String value) {
            addCriterion("employee_mobile <=", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileLike(String value) {
            addCriterion("employee_mobile like", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileNotLike(String value) {
            addCriterion("employee_mobile not like", value, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileIn(List<String> values) {
            addCriterion("employee_mobile in", values, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileNotIn(List<String> values) {
            addCriterion("employee_mobile not in", values, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileBetween(String value1, String value2) {
            addCriterion("employee_mobile between", value1, value2, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobileNotBetween(String value1, String value2) {
            addCriterion("employee_mobile not between", value1, value2, "employeeMobile");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIsNull() {
            addCriterion("employee_address is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIsNotNull() {
            addCriterion("employee_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressEqualTo(String value) {
            addCriterion("employee_address =", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotEqualTo(String value) {
            addCriterion("employee_address <>", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressGreaterThan(String value) {
            addCriterion("employee_address >", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("employee_address >=", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLessThan(String value) {
            addCriterion("employee_address <", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLessThanOrEqualTo(String value) {
            addCriterion("employee_address <=", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLike(String value) {
            addCriterion("employee_address like", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotLike(String value) {
            addCriterion("employee_address not like", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIn(List<String> values) {
            addCriterion("employee_address in", values, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotIn(List<String> values) {
            addCriterion("employee_address not in", values, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressBetween(String value1, String value2) {
            addCriterion("employee_address between", value1, value2, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotBetween(String value1, String value2) {
            addCriterion("employee_address not between", value1, value2, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNull() {
            addCriterion("order_index is null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNotNull() {
            addCriterion("order_index is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexEqualTo(Long value) {
            addCriterion("order_index =", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotEqualTo(Long value) {
            addCriterion("order_index <>", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThan(Long value) {
            addCriterion("order_index >", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("order_index >=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThan(Long value) {
            addCriterion("order_index <", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThanOrEqualTo(Long value) {
            addCriterion("order_index <=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIn(List<Long> values) {
            addCriterion("order_index in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotIn(List<Long> values) {
            addCriterion("order_index not in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexBetween(Long value1, Long value2) {
            addCriterion("order_index between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotBetween(Long value1, Long value2) {
            addCriterion("order_index not between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andWorkStartIsNull() {
            addCriterion("work_start is null");
            return (Criteria) this;
        }

        public Criteria andWorkStartIsNotNull() {
            addCriterion("work_start is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStartEqualTo(Date value) {
            addCriterionForJDBCDate("work_start =", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("work_start <>", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartGreaterThan(Date value) {
            addCriterionForJDBCDate("work_start >", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_start >=", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartLessThan(Date value) {
            addCriterionForJDBCDate("work_start <", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_start <=", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartIn(List<Date> values) {
            addCriterionForJDBCDate("work_start in", values, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("work_start not in", values, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_start between", value1, value2, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_start not between", value1, value2, "workStart");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNull() {
            addCriterion("employee_email is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNotNull() {
            addCriterion("employee_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailEqualTo(String value) {
            addCriterion("employee_email =", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotEqualTo(String value) {
            addCriterion("employee_email <>", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThan(String value) {
            addCriterion("employee_email >", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("employee_email >=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThan(String value) {
            addCriterion("employee_email <", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThanOrEqualTo(String value) {
            addCriterion("employee_email <=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLike(String value) {
            addCriterion("employee_email like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotLike(String value) {
            addCriterion("employee_email not like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIn(List<String> values) {
            addCriterion("employee_email in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotIn(List<String> values) {
            addCriterion("employee_email not in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailBetween(String value1, String value2) {
            addCriterion("employee_email between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotBetween(String value1, String value2) {
            addCriterion("employee_email not between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeePostIsNull() {
            addCriterion("employee_post is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePostIsNotNull() {
            addCriterion("employee_post is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePostEqualTo(String value) {
            addCriterion("employee_post =", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotEqualTo(String value) {
            addCriterion("employee_post <>", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostGreaterThan(String value) {
            addCriterion("employee_post >", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostGreaterThanOrEqualTo(String value) {
            addCriterion("employee_post >=", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostLessThan(String value) {
            addCriterion("employee_post <", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostLessThanOrEqualTo(String value) {
            addCriterion("employee_post <=", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostLike(String value) {
            addCriterion("employee_post like", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotLike(String value) {
            addCriterion("employee_post not like", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostIn(List<String> values) {
            addCriterion("employee_post in", values, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotIn(List<String> values) {
            addCriterion("employee_post not in", values, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostBetween(String value1, String value2) {
            addCriterion("employee_post between", value1, value2, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotBetween(String value1, String value2) {
            addCriterion("employee_post not between", value1, value2, "employeePost");
            return (Criteria) this;
        }

        public Criteria andIsParttimeIsNull() {
            addCriterion("is_parttime is null");
            return (Criteria) this;
        }

        public Criteria andIsParttimeIsNotNull() {
            addCriterion("is_parttime is not null");
            return (Criteria) this;
        }

        public Criteria andIsParttimeEqualTo(String value) {
            addCriterion("is_parttime =", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeNotEqualTo(String value) {
            addCriterion("is_parttime <>", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeGreaterThan(String value) {
            addCriterion("is_parttime >", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeGreaterThanOrEqualTo(String value) {
            addCriterion("is_parttime >=", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeLessThan(String value) {
            addCriterion("is_parttime <", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeLessThanOrEqualTo(String value) {
            addCriterion("is_parttime <=", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeLike(String value) {
            addCriterion("is_parttime like", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeNotLike(String value) {
            addCriterion("is_parttime not like", value, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeIn(List<String> values) {
            addCriterion("is_parttime in", values, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeNotIn(List<String> values) {
            addCriterion("is_parttime not in", values, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeBetween(String value1, String value2) {
            addCriterion("is_parttime between", value1, value2, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsParttimeNotBetween(String value1, String value2) {
            addCriterion("is_parttime not between", value1, value2, "isParttime");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("is_check like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("is_check not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("date_created is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("date_created is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("date_created =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("date_created <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("date_created >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("date_created >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("date_created <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("date_created <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("date_created in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("date_created not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("date_created between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("date_created not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("modified_by is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(String value) {
            addCriterion("modified_by =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(String value) {
            addCriterion("modified_by <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(String value) {
            addCriterion("modified_by >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("modified_by >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(String value) {
            addCriterion("modified_by <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(String value) {
            addCriterion("modified_by <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLike(String value) {
            addCriterion("modified_by like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotLike(String value) {
            addCriterion("modified_by not like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<String> values) {
            addCriterion("modified_by in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<String> values) {
            addCriterion("modified_by not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(String value1, String value2) {
            addCriterion("modified_by between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(String value1, String value2) {
            addCriterion("modified_by not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andDateModifiedIsNull() {
            addCriterion("date_modified is null");
            return (Criteria) this;
        }

        public Criteria andDateModifiedIsNotNull() {
            addCriterion("date_modified is not null");
            return (Criteria) this;
        }

        public Criteria andDateModifiedEqualTo(Date value) {
            addCriterion("date_modified =", value, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedNotEqualTo(Date value) {
            addCriterion("date_modified <>", value, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedGreaterThan(Date value) {
            addCriterion("date_modified >", value, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("date_modified >=", value, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedLessThan(Date value) {
            addCriterion("date_modified <", value, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedLessThanOrEqualTo(Date value) {
            addCriterion("date_modified <=", value, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedIn(List<Date> values) {
            addCriterion("date_modified in", values, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedNotIn(List<Date> values) {
            addCriterion("date_modified not in", values, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedBetween(Date value1, Date value2) {
            addCriterion("date_modified between", value1, value2, "dateModified");
            return (Criteria) this;
        }

        public Criteria andDateModifiedNotBetween(Date value1, Date value2) {
            addCriterion("date_modified not between", value1, value2, "dateModified");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNull() {
            addCriterion("row_version is null");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNotNull() {
            addCriterion("row_version is not null");
            return (Criteria) this;
        }

        public Criteria andRowVersionEqualTo(Long value) {
            addCriterion("row_version =", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotEqualTo(Long value) {
            addCriterion("row_version <>", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThan(Long value) {
            addCriterion("row_version >", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("row_version >=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThan(Long value) {
            addCriterion("row_version <", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThanOrEqualTo(Long value) {
            addCriterion("row_version <=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionIn(List<Long> values) {
            addCriterion("row_version in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotIn(List<Long> values) {
            addCriterion("row_version not in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionBetween(Long value1, Long value2) {
            addCriterion("row_version between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotBetween(Long value1, Long value2) {
            addCriterion("row_version not between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andScreenIdIsNull() {
            addCriterion("screen_id is null");
            return (Criteria) this;
        }

        public Criteria andScreenIdIsNotNull() {
            addCriterion("screen_id is not null");
            return (Criteria) this;
        }

        public Criteria andScreenIdEqualTo(String value) {
            addCriterion("screen_id =", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdNotEqualTo(String value) {
            addCriterion("screen_id <>", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdGreaterThan(String value) {
            addCriterion("screen_id >", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdGreaterThanOrEqualTo(String value) {
            addCriterion("screen_id >=", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdLessThan(String value) {
            addCriterion("screen_id <", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdLessThanOrEqualTo(String value) {
            addCriterion("screen_id <=", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdLike(String value) {
            addCriterion("screen_id like", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdNotLike(String value) {
            addCriterion("screen_id not like", value, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdIn(List<String> values) {
            addCriterion("screen_id in", values, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdNotIn(List<String> values) {
            addCriterion("screen_id not in", values, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdBetween(String value1, String value2) {
            addCriterion("screen_id between", value1, value2, "screenId");
            return (Criteria) this;
        }

        public Criteria andScreenIdNotBetween(String value1, String value2) {
            addCriterion("screen_id not between", value1, value2, "screenId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}