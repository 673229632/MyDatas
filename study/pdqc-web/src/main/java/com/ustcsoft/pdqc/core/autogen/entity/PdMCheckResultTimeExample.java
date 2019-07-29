//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenExample;
import com.ustcsoft.mybatis.autogen.entity.ModelColumn;
import com.ustcsoft.mybatis.autogen.entity.ModelColumnSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdMCheckResultTimeExample implements AutoGenExample, ModelColumnSupport {
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

    public PdMCheckResultTimeExample() {
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
        return PdMCheckResultTimeColumnEnum.values();
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

        public Criteria andCheckNoIsNull() {
            addCriterion("check_no is null");
            return (Criteria) this;
        }

        public Criteria andCheckNoIsNotNull() {
            addCriterion("check_no is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNoEqualTo(String value) {
            addCriterion("check_no =", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotEqualTo(String value) {
            addCriterion("check_no <>", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoGreaterThan(String value) {
            addCriterion("check_no >", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoGreaterThanOrEqualTo(String value) {
            addCriterion("check_no >=", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoLessThan(String value) {
            addCriterion("check_no <", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoLessThanOrEqualTo(String value) {
            addCriterion("check_no <=", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoLike(String value) {
            addCriterion("check_no like", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotLike(String value) {
            addCriterion("check_no not like", value, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoIn(List<String> values) {
            addCriterion("check_no in", values, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotIn(List<String> values) {
            addCriterion("check_no not in", values, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoBetween(String value1, String value2) {
            addCriterion("check_no between", value1, value2, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNoNotBetween(String value1, String value2) {
            addCriterion("check_no not between", value1, value2, "checkNo");
            return (Criteria) this;
        }

        public Criteria andCheckNameIsNull() {
            addCriterion("check_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckNameIsNotNull() {
            addCriterion("check_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNameEqualTo(String value) {
            addCriterion("check_name =", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameNotEqualTo(String value) {
            addCriterion("check_name <>", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameGreaterThan(String value) {
            addCriterion("check_name >", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_name >=", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameLessThan(String value) {
            addCriterion("check_name <", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameLessThanOrEqualTo(String value) {
            addCriterion("check_name <=", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameLike(String value) {
            addCriterion("check_name like", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameNotLike(String value) {
            addCriterion("check_name not like", value, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameIn(List<String> values) {
            addCriterion("check_name in", values, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameNotIn(List<String> values) {
            addCriterion("check_name not in", values, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameBetween(String value1, String value2) {
            addCriterion("check_name between", value1, value2, "checkName");
            return (Criteria) this;
        }

        public Criteria andCheckNameNotBetween(String value1, String value2) {
            addCriterion("check_name not between", value1, value2, "checkName");
            return (Criteria) this;
        }

        public Criteria andStandardNoIsNull() {
            addCriterion("standard_no is null");
            return (Criteria) this;
        }

        public Criteria andStandardNoIsNotNull() {
            addCriterion("standard_no is not null");
            return (Criteria) this;
        }

        public Criteria andStandardNoEqualTo(String value) {
            addCriterion("standard_no =", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotEqualTo(String value) {
            addCriterion("standard_no <>", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoGreaterThan(String value) {
            addCriterion("standard_no >", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoGreaterThanOrEqualTo(String value) {
            addCriterion("standard_no >=", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLessThan(String value) {
            addCriterion("standard_no <", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLessThanOrEqualTo(String value) {
            addCriterion("standard_no <=", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLike(String value) {
            addCriterion("standard_no like", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotLike(String value) {
            addCriterion("standard_no not like", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoIn(List<String> values) {
            addCriterion("standard_no in", values, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotIn(List<String> values) {
            addCriterion("standard_no not in", values, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoBetween(String value1, String value2) {
            addCriterion("standard_no between", value1, value2, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotBetween(String value1, String value2) {
            addCriterion("standard_no not between", value1, value2, "standardNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoIsNull() {
            addCriterion("qc_center_no is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoIsNotNull() {
            addCriterion("qc_center_no is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoEqualTo(String value) {
            addCriterion("qc_center_no =", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotEqualTo(String value) {
            addCriterion("qc_center_no <>", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoGreaterThan(String value) {
            addCriterion("qc_center_no >", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_no >=", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoLessThan(String value) {
            addCriterion("qc_center_no <", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoLessThanOrEqualTo(String value) {
            addCriterion("qc_center_no <=", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoLike(String value) {
            addCriterion("qc_center_no like", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotLike(String value) {
            addCriterion("qc_center_no not like", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoIn(List<String> values) {
            addCriterion("qc_center_no in", values, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotIn(List<String> values) {
            addCriterion("qc_center_no not in", values, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoBetween(String value1, String value2) {
            addCriterion("qc_center_no between", value1, value2, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotBetween(String value1, String value2) {
            addCriterion("qc_center_no not between", value1, value2, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateIsNull() {
            addCriterion("check_start_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateIsNotNull() {
            addCriterion("check_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateEqualTo(Date value) {
            addCriterion("check_start_date =", value, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateNotEqualTo(Date value) {
            addCriterion("check_start_date <>", value, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateGreaterThan(Date value) {
            addCriterion("check_start_date >", value, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("check_start_date >=", value, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateLessThan(Date value) {
            addCriterion("check_start_date <", value, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateLessThanOrEqualTo(Date value) {
            addCriterion("check_start_date <=", value, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateIn(List<Date> values) {
            addCriterion("check_start_date in", values, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateNotIn(List<Date> values) {
            addCriterion("check_start_date not in", values, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateBetween(Date value1, Date value2) {
            addCriterion("check_start_date between", value1, value2, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckStartDateNotBetween(Date value1, Date value2) {
            addCriterion("check_start_date not between", value1, value2, "checkStartDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateIsNull() {
            addCriterion("check_end_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateIsNotNull() {
            addCriterion("check_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateEqualTo(Date value) {
            addCriterion("check_end_date =", value, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateNotEqualTo(Date value) {
            addCriterion("check_end_date <>", value, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateGreaterThan(Date value) {
            addCriterion("check_end_date >", value, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("check_end_date >=", value, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateLessThan(Date value) {
            addCriterion("check_end_date <", value, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateLessThanOrEqualTo(Date value) {
            addCriterion("check_end_date <=", value, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateIn(List<Date> values) {
            addCriterion("check_end_date in", values, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateNotIn(List<Date> values) {
            addCriterion("check_end_date not in", values, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateBetween(Date value1, Date value2) {
            addCriterion("check_end_date between", value1, value2, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andCheckEndDateNotBetween(Date value1, Date value2) {
            addCriterion("check_end_date not between", value1, value2, "checkEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateIsNull() {
            addCriterion("publish_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateIsNotNull() {
            addCriterion("publish_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateEqualTo(Date value) {
            addCriterion("publish_start_date =", value, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateNotEqualTo(Date value) {
            addCriterion("publish_start_date <>", value, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateGreaterThan(Date value) {
            addCriterion("publish_start_date >", value, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_start_date >=", value, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateLessThan(Date value) {
            addCriterion("publish_start_date <", value, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_start_date <=", value, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateIn(List<Date> values) {
            addCriterion("publish_start_date in", values, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateNotIn(List<Date> values) {
            addCriterion("publish_start_date not in", values, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateBetween(Date value1, Date value2) {
            addCriterion("publish_start_date between", value1, value2, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishStartDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_start_date not between", value1, value2, "publishStartDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateIsNull() {
            addCriterion("publish_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateIsNotNull() {
            addCriterion("publish_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateEqualTo(Date value) {
            addCriterion("publish_end_date =", value, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateNotEqualTo(Date value) {
            addCriterion("publish_end_date <>", value, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateGreaterThan(Date value) {
            addCriterion("publish_end_date >", value, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_end_date >=", value, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateLessThan(Date value) {
            addCriterion("publish_end_date <", value, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_end_date <=", value, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateIn(List<Date> values) {
            addCriterion("publish_end_date in", values, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateNotIn(List<Date> values) {
            addCriterion("publish_end_date not in", values, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateBetween(Date value1, Date value2) {
            addCriterion("publish_end_date between", value1, value2, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishEndDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_end_date not between", value1, value2, "publishEndDate");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(String value) {
            addCriterion("publish_status =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(String value) {
            addCriterion("publish_status <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(String value) {
            addCriterion("publish_status >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(String value) {
            addCriterion("publish_status >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(String value) {
            addCriterion("publish_status <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(String value) {
            addCriterion("publish_status <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLike(String value) {
            addCriterion("publish_status like", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotLike(String value) {
            addCriterion("publish_status not like", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<String> values) {
            addCriterion("publish_status in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<String> values) {
            addCriterion("publish_status not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(String value1, String value2) {
            addCriterion("publish_status between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(String value1, String value2) {
            addCriterion("publish_status not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andUseSignIsNull() {
            addCriterion("use_sign is null");
            return (Criteria) this;
        }

        public Criteria andUseSignIsNotNull() {
            addCriterion("use_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUseSignEqualTo(String value) {
            addCriterion("use_sign =", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignNotEqualTo(String value) {
            addCriterion("use_sign <>", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignGreaterThan(String value) {
            addCriterion("use_sign >", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignGreaterThanOrEqualTo(String value) {
            addCriterion("use_sign >=", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignLessThan(String value) {
            addCriterion("use_sign <", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignLessThanOrEqualTo(String value) {
            addCriterion("use_sign <=", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignLike(String value) {
            addCriterion("use_sign like", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignNotLike(String value) {
            addCriterion("use_sign not like", value, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignIn(List<String> values) {
            addCriterion("use_sign in", values, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignNotIn(List<String> values) {
            addCriterion("use_sign not in", values, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignBetween(String value1, String value2) {
            addCriterion("use_sign between", value1, value2, "useSign");
            return (Criteria) this;
        }

        public Criteria andUseSignNotBetween(String value1, String value2) {
            addCriterion("use_sign not between", value1, value2, "useSign");
            return (Criteria) this;
        }

        public Criteria andKpiPartIsNull() {
            addCriterion("kpi_part is null");
            return (Criteria) this;
        }

        public Criteria andKpiPartIsNotNull() {
            addCriterion("kpi_part is not null");
            return (Criteria) this;
        }

        public Criteria andKpiPartEqualTo(String value) {
            addCriterion("kpi_part =", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartNotEqualTo(String value) {
            addCriterion("kpi_part <>", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartGreaterThan(String value) {
            addCriterion("kpi_part >", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartGreaterThanOrEqualTo(String value) {
            addCriterion("kpi_part >=", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartLessThan(String value) {
            addCriterion("kpi_part <", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartLessThanOrEqualTo(String value) {
            addCriterion("kpi_part <=", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartLike(String value) {
            addCriterion("kpi_part like", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartNotLike(String value) {
            addCriterion("kpi_part not like", value, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartIn(List<String> values) {
            addCriterion("kpi_part in", values, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartNotIn(List<String> values) {
            addCriterion("kpi_part not in", values, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartBetween(String value1, String value2) {
            addCriterion("kpi_part between", value1, value2, "kpiPart");
            return (Criteria) this;
        }

        public Criteria andKpiPartNotBetween(String value1, String value2) {
            addCriterion("kpi_part not between", value1, value2, "kpiPart");
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