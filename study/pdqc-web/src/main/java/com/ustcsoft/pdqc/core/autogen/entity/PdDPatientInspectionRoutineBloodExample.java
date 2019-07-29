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

public class PdDPatientInspectionRoutineBloodExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDPatientInspectionRoutineBloodExample() {
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
        return PdDPatientInspectionRoutineBloodColumnEnum.values();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHpIdIsNull() {
            addCriterion("hp_id is null");
            return (Criteria) this;
        }

        public Criteria andHpIdIsNotNull() {
            addCriterion("hp_id is not null");
            return (Criteria) this;
        }

        public Criteria andHpIdEqualTo(String value) {
            addCriterion("hp_id =", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdNotEqualTo(String value) {
            addCriterion("hp_id <>", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdGreaterThan(String value) {
            addCriterion("hp_id >", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdGreaterThanOrEqualTo(String value) {
            addCriterion("hp_id >=", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdLessThan(String value) {
            addCriterion("hp_id <", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdLessThanOrEqualTo(String value) {
            addCriterion("hp_id <=", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdLike(String value) {
            addCriterion("hp_id like", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdNotLike(String value) {
            addCriterion("hp_id not like", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdIn(List<String> values) {
            addCriterion("hp_id in", values, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdNotIn(List<String> values) {
            addCriterion("hp_id not in", values, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdBetween(String value1, String value2) {
            addCriterion("hp_id between", value1, value2, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdNotBetween(String value1, String value2) {
            addCriterion("hp_id not between", value1, value2, "hpId");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNull() {
            addCriterion("pt_id is null");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNotNull() {
            addCriterion("pt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtIdEqualTo(String value) {
            addCriterion("pt_id =", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotEqualTo(String value) {
            addCriterion("pt_id <>", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThan(String value) {
            addCriterion("pt_id >", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThanOrEqualTo(String value) {
            addCriterion("pt_id >=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThan(String value) {
            addCriterion("pt_id <", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThanOrEqualTo(String value) {
            addCriterion("pt_id <=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLike(String value) {
            addCriterion("pt_id like", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotLike(String value) {
            addCriterion("pt_id not like", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdIn(List<String> values) {
            addCriterion("pt_id in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotIn(List<String> values) {
            addCriterion("pt_id not in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdBetween(String value1, String value2) {
            addCriterion("pt_id between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotBetween(String value1, String value2) {
            addCriterion("pt_id not between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andTdateIsNull() {
            addCriterion("tdate is null");
            return (Criteria) this;
        }

        public Criteria andTdateIsNotNull() {
            addCriterion("tdate is not null");
            return (Criteria) this;
        }

        public Criteria andTdateEqualTo(Date value) {
            addCriterion("tdate =", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotEqualTo(Date value) {
            addCriterion("tdate <>", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThan(Date value) {
            addCriterion("tdate >", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThanOrEqualTo(Date value) {
            addCriterion("tdate >=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThan(Date value) {
            addCriterion("tdate <", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThanOrEqualTo(Date value) {
            addCriterion("tdate <=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateIn(List<Date> values) {
            addCriterion("tdate in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotIn(List<Date> values) {
            addCriterion("tdate not in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateBetween(Date value1, Date value2) {
            addCriterion("tdate between", value1, value2, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotBetween(Date value1, Date value2) {
            addCriterion("tdate not between", value1, value2, "tdate");
            return (Criteria) this;
        }

        public Criteria andWbcIsNull() {
            addCriterion("wbc is null");
            return (Criteria) this;
        }

        public Criteria andWbcIsNotNull() {
            addCriterion("wbc is not null");
            return (Criteria) this;
        }

        public Criteria andWbcEqualTo(String value) {
            addCriterion("wbc =", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcNotEqualTo(String value) {
            addCriterion("wbc <>", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcGreaterThan(String value) {
            addCriterion("wbc >", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcGreaterThanOrEqualTo(String value) {
            addCriterion("wbc >=", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcLessThan(String value) {
            addCriterion("wbc <", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcLessThanOrEqualTo(String value) {
            addCriterion("wbc <=", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcLike(String value) {
            addCriterion("wbc like", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcNotLike(String value) {
            addCriterion("wbc not like", value, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcIn(List<String> values) {
            addCriterion("wbc in", values, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcNotIn(List<String> values) {
            addCriterion("wbc not in", values, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcBetween(String value1, String value2) {
            addCriterion("wbc between", value1, value2, "wbc");
            return (Criteria) this;
        }

        public Criteria andWbcNotBetween(String value1, String value2) {
            addCriterion("wbc not between", value1, value2, "wbc");
            return (Criteria) this;
        }

        public Criteria andRbcIsNull() {
            addCriterion("rbc is null");
            return (Criteria) this;
        }

        public Criteria andRbcIsNotNull() {
            addCriterion("rbc is not null");
            return (Criteria) this;
        }

        public Criteria andRbcEqualTo(String value) {
            addCriterion("rbc =", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcNotEqualTo(String value) {
            addCriterion("rbc <>", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcGreaterThan(String value) {
            addCriterion("rbc >", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcGreaterThanOrEqualTo(String value) {
            addCriterion("rbc >=", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcLessThan(String value) {
            addCriterion("rbc <", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcLessThanOrEqualTo(String value) {
            addCriterion("rbc <=", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcLike(String value) {
            addCriterion("rbc like", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcNotLike(String value) {
            addCriterion("rbc not like", value, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcIn(List<String> values) {
            addCriterion("rbc in", values, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcNotIn(List<String> values) {
            addCriterion("rbc not in", values, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcBetween(String value1, String value2) {
            addCriterion("rbc between", value1, value2, "rbc");
            return (Criteria) this;
        }

        public Criteria andRbcNotBetween(String value1, String value2) {
            addCriterion("rbc not between", value1, value2, "rbc");
            return (Criteria) this;
        }

        public Criteria andHbIsNull() {
            addCriterion("hb is null");
            return (Criteria) this;
        }

        public Criteria andHbIsNotNull() {
            addCriterion("hb is not null");
            return (Criteria) this;
        }

        public Criteria andHbEqualTo(String value) {
            addCriterion("hb =", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbNotEqualTo(String value) {
            addCriterion("hb <>", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbGreaterThan(String value) {
            addCriterion("hb >", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbGreaterThanOrEqualTo(String value) {
            addCriterion("hb >=", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbLessThan(String value) {
            addCriterion("hb <", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbLessThanOrEqualTo(String value) {
            addCriterion("hb <=", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbLike(String value) {
            addCriterion("hb like", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbNotLike(String value) {
            addCriterion("hb not like", value, "hb");
            return (Criteria) this;
        }

        public Criteria andHbIn(List<String> values) {
            addCriterion("hb in", values, "hb");
            return (Criteria) this;
        }

        public Criteria andHbNotIn(List<String> values) {
            addCriterion("hb not in", values, "hb");
            return (Criteria) this;
        }

        public Criteria andHbBetween(String value1, String value2) {
            addCriterion("hb between", value1, value2, "hb");
            return (Criteria) this;
        }

        public Criteria andHbNotBetween(String value1, String value2) {
            addCriterion("hb not between", value1, value2, "hb");
            return (Criteria) this;
        }

        public Criteria andHctIsNull() {
            addCriterion("hct is null");
            return (Criteria) this;
        }

        public Criteria andHctIsNotNull() {
            addCriterion("hct is not null");
            return (Criteria) this;
        }

        public Criteria andHctEqualTo(String value) {
            addCriterion("hct =", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctNotEqualTo(String value) {
            addCriterion("hct <>", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctGreaterThan(String value) {
            addCriterion("hct >", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctGreaterThanOrEqualTo(String value) {
            addCriterion("hct >=", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctLessThan(String value) {
            addCriterion("hct <", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctLessThanOrEqualTo(String value) {
            addCriterion("hct <=", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctLike(String value) {
            addCriterion("hct like", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctNotLike(String value) {
            addCriterion("hct not like", value, "hct");
            return (Criteria) this;
        }

        public Criteria andHctIn(List<String> values) {
            addCriterion("hct in", values, "hct");
            return (Criteria) this;
        }

        public Criteria andHctNotIn(List<String> values) {
            addCriterion("hct not in", values, "hct");
            return (Criteria) this;
        }

        public Criteria andHctBetween(String value1, String value2) {
            addCriterion("hct between", value1, value2, "hct");
            return (Criteria) this;
        }

        public Criteria andHctNotBetween(String value1, String value2) {
            addCriterion("hct not between", value1, value2, "hct");
            return (Criteria) this;
        }

        public Criteria andMcvIsNull() {
            addCriterion("mcv is null");
            return (Criteria) this;
        }

        public Criteria andMcvIsNotNull() {
            addCriterion("mcv is not null");
            return (Criteria) this;
        }

        public Criteria andMcvEqualTo(String value) {
            addCriterion("mcv =", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvNotEqualTo(String value) {
            addCriterion("mcv <>", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvGreaterThan(String value) {
            addCriterion("mcv >", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvGreaterThanOrEqualTo(String value) {
            addCriterion("mcv >=", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvLessThan(String value) {
            addCriterion("mcv <", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvLessThanOrEqualTo(String value) {
            addCriterion("mcv <=", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvLike(String value) {
            addCriterion("mcv like", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvNotLike(String value) {
            addCriterion("mcv not like", value, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvIn(List<String> values) {
            addCriterion("mcv in", values, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvNotIn(List<String> values) {
            addCriterion("mcv not in", values, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvBetween(String value1, String value2) {
            addCriterion("mcv between", value1, value2, "mcv");
            return (Criteria) this;
        }

        public Criteria andMcvNotBetween(String value1, String value2) {
            addCriterion("mcv not between", value1, value2, "mcv");
            return (Criteria) this;
        }

        public Criteria andMchIsNull() {
            addCriterion("mch is null");
            return (Criteria) this;
        }

        public Criteria andMchIsNotNull() {
            addCriterion("mch is not null");
            return (Criteria) this;
        }

        public Criteria andMchEqualTo(String value) {
            addCriterion("mch =", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchNotEqualTo(String value) {
            addCriterion("mch <>", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchGreaterThan(String value) {
            addCriterion("mch >", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchGreaterThanOrEqualTo(String value) {
            addCriterion("mch >=", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchLessThan(String value) {
            addCriterion("mch <", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchLessThanOrEqualTo(String value) {
            addCriterion("mch <=", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchLike(String value) {
            addCriterion("mch like", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchNotLike(String value) {
            addCriterion("mch not like", value, "mch");
            return (Criteria) this;
        }

        public Criteria andMchIn(List<String> values) {
            addCriterion("mch in", values, "mch");
            return (Criteria) this;
        }

        public Criteria andMchNotIn(List<String> values) {
            addCriterion("mch not in", values, "mch");
            return (Criteria) this;
        }

        public Criteria andMchBetween(String value1, String value2) {
            addCriterion("mch between", value1, value2, "mch");
            return (Criteria) this;
        }

        public Criteria andMchNotBetween(String value1, String value2) {
            addCriterion("mch not between", value1, value2, "mch");
            return (Criteria) this;
        }

        public Criteria andMchcIsNull() {
            addCriterion("mchc is null");
            return (Criteria) this;
        }

        public Criteria andMchcIsNotNull() {
            addCriterion("mchc is not null");
            return (Criteria) this;
        }

        public Criteria andMchcEqualTo(String value) {
            addCriterion("mchc =", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcNotEqualTo(String value) {
            addCriterion("mchc <>", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcGreaterThan(String value) {
            addCriterion("mchc >", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcGreaterThanOrEqualTo(String value) {
            addCriterion("mchc >=", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcLessThan(String value) {
            addCriterion("mchc <", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcLessThanOrEqualTo(String value) {
            addCriterion("mchc <=", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcLike(String value) {
            addCriterion("mchc like", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcNotLike(String value) {
            addCriterion("mchc not like", value, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcIn(List<String> values) {
            addCriterion("mchc in", values, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcNotIn(List<String> values) {
            addCriterion("mchc not in", values, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcBetween(String value1, String value2) {
            addCriterion("mchc between", value1, value2, "mchc");
            return (Criteria) this;
        }

        public Criteria andMchcNotBetween(String value1, String value2) {
            addCriterion("mchc not between", value1, value2, "mchc");
            return (Criteria) this;
        }

        public Criteria andRdwIsNull() {
            addCriterion("rdw is null");
            return (Criteria) this;
        }

        public Criteria andRdwIsNotNull() {
            addCriterion("rdw is not null");
            return (Criteria) this;
        }

        public Criteria andRdwEqualTo(String value) {
            addCriterion("rdw =", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwNotEqualTo(String value) {
            addCriterion("rdw <>", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwGreaterThan(String value) {
            addCriterion("rdw >", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwGreaterThanOrEqualTo(String value) {
            addCriterion("rdw >=", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwLessThan(String value) {
            addCriterion("rdw <", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwLessThanOrEqualTo(String value) {
            addCriterion("rdw <=", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwLike(String value) {
            addCriterion("rdw like", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwNotLike(String value) {
            addCriterion("rdw not like", value, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwIn(List<String> values) {
            addCriterion("rdw in", values, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwNotIn(List<String> values) {
            addCriterion("rdw not in", values, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwBetween(String value1, String value2) {
            addCriterion("rdw between", value1, value2, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwNotBetween(String value1, String value2) {
            addCriterion("rdw not between", value1, value2, "rdw");
            return (Criteria) this;
        }

        public Criteria andRdwsdIsNull() {
            addCriterion("rdwsd is null");
            return (Criteria) this;
        }

        public Criteria andRdwsdIsNotNull() {
            addCriterion("rdwsd is not null");
            return (Criteria) this;
        }

        public Criteria andRdwsdEqualTo(String value) {
            addCriterion("rdwsd =", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdNotEqualTo(String value) {
            addCriterion("rdwsd <>", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdGreaterThan(String value) {
            addCriterion("rdwsd >", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdGreaterThanOrEqualTo(String value) {
            addCriterion("rdwsd >=", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdLessThan(String value) {
            addCriterion("rdwsd <", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdLessThanOrEqualTo(String value) {
            addCriterion("rdwsd <=", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdLike(String value) {
            addCriterion("rdwsd like", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdNotLike(String value) {
            addCriterion("rdwsd not like", value, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdIn(List<String> values) {
            addCriterion("rdwsd in", values, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdNotIn(List<String> values) {
            addCriterion("rdwsd not in", values, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdBetween(String value1, String value2) {
            addCriterion("rdwsd between", value1, value2, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andRdwsdNotBetween(String value1, String value2) {
            addCriterion("rdwsd not between", value1, value2, "rdwsd");
            return (Criteria) this;
        }

        public Criteria andPltIsNull() {
            addCriterion("plt is null");
            return (Criteria) this;
        }

        public Criteria andPltIsNotNull() {
            addCriterion("plt is not null");
            return (Criteria) this;
        }

        public Criteria andPltEqualTo(String value) {
            addCriterion("plt =", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltNotEqualTo(String value) {
            addCriterion("plt <>", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltGreaterThan(String value) {
            addCriterion("plt >", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltGreaterThanOrEqualTo(String value) {
            addCriterion("plt >=", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltLessThan(String value) {
            addCriterion("plt <", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltLessThanOrEqualTo(String value) {
            addCriterion("plt <=", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltLike(String value) {
            addCriterion("plt like", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltNotLike(String value) {
            addCriterion("plt not like", value, "plt");
            return (Criteria) this;
        }

        public Criteria andPltIn(List<String> values) {
            addCriterion("plt in", values, "plt");
            return (Criteria) this;
        }

        public Criteria andPltNotIn(List<String> values) {
            addCriterion("plt not in", values, "plt");
            return (Criteria) this;
        }

        public Criteria andPltBetween(String value1, String value2) {
            addCriterion("plt between", value1, value2, "plt");
            return (Criteria) this;
        }

        public Criteria andPltNotBetween(String value1, String value2) {
            addCriterion("plt not between", value1, value2, "plt");
            return (Criteria) this;
        }

        public Criteria andMpvIsNull() {
            addCriterion("mpv is null");
            return (Criteria) this;
        }

        public Criteria andMpvIsNotNull() {
            addCriterion("mpv is not null");
            return (Criteria) this;
        }

        public Criteria andMpvEqualTo(String value) {
            addCriterion("mpv =", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvNotEqualTo(String value) {
            addCriterion("mpv <>", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvGreaterThan(String value) {
            addCriterion("mpv >", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvGreaterThanOrEqualTo(String value) {
            addCriterion("mpv >=", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvLessThan(String value) {
            addCriterion("mpv <", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvLessThanOrEqualTo(String value) {
            addCriterion("mpv <=", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvLike(String value) {
            addCriterion("mpv like", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvNotLike(String value) {
            addCriterion("mpv not like", value, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvIn(List<String> values) {
            addCriterion("mpv in", values, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvNotIn(List<String> values) {
            addCriterion("mpv not in", values, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvBetween(String value1, String value2) {
            addCriterion("mpv between", value1, value2, "mpv");
            return (Criteria) this;
        }

        public Criteria andMpvNotBetween(String value1, String value2) {
            addCriterion("mpv not between", value1, value2, "mpv");
            return (Criteria) this;
        }

        public Criteria andPdwIsNull() {
            addCriterion("pdw is null");
            return (Criteria) this;
        }

        public Criteria andPdwIsNotNull() {
            addCriterion("pdw is not null");
            return (Criteria) this;
        }

        public Criteria andPdwEqualTo(String value) {
            addCriterion("pdw =", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwNotEqualTo(String value) {
            addCriterion("pdw <>", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwGreaterThan(String value) {
            addCriterion("pdw >", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwGreaterThanOrEqualTo(String value) {
            addCriterion("pdw >=", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwLessThan(String value) {
            addCriterion("pdw <", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwLessThanOrEqualTo(String value) {
            addCriterion("pdw <=", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwLike(String value) {
            addCriterion("pdw like", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwNotLike(String value) {
            addCriterion("pdw not like", value, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwIn(List<String> values) {
            addCriterion("pdw in", values, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwNotIn(List<String> values) {
            addCriterion("pdw not in", values, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwBetween(String value1, String value2) {
            addCriterion("pdw between", value1, value2, "pdw");
            return (Criteria) this;
        }

        public Criteria andPdwNotBetween(String value1, String value2) {
            addCriterion("pdw not between", value1, value2, "pdw");
            return (Criteria) this;
        }

        public Criteria andPctIsNull() {
            addCriterion("pct is null");
            return (Criteria) this;
        }

        public Criteria andPctIsNotNull() {
            addCriterion("pct is not null");
            return (Criteria) this;
        }

        public Criteria andPctEqualTo(String value) {
            addCriterion("pct =", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctNotEqualTo(String value) {
            addCriterion("pct <>", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctGreaterThan(String value) {
            addCriterion("pct >", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctGreaterThanOrEqualTo(String value) {
            addCriterion("pct >=", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctLessThan(String value) {
            addCriterion("pct <", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctLessThanOrEqualTo(String value) {
            addCriterion("pct <=", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctLike(String value) {
            addCriterion("pct like", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctNotLike(String value) {
            addCriterion("pct not like", value, "pct");
            return (Criteria) this;
        }

        public Criteria andPctIn(List<String> values) {
            addCriterion("pct in", values, "pct");
            return (Criteria) this;
        }

        public Criteria andPctNotIn(List<String> values) {
            addCriterion("pct not in", values, "pct");
            return (Criteria) this;
        }

        public Criteria andPctBetween(String value1, String value2) {
            addCriterion("pct between", value1, value2, "pct");
            return (Criteria) this;
        }

        public Criteria andPctNotBetween(String value1, String value2) {
            addCriterion("pct not between", value1, value2, "pct");
            return (Criteria) this;
        }

        public Criteria andPlcrIsNull() {
            addCriterion("plcr is null");
            return (Criteria) this;
        }

        public Criteria andPlcrIsNotNull() {
            addCriterion("plcr is not null");
            return (Criteria) this;
        }

        public Criteria andPlcrEqualTo(String value) {
            addCriterion("plcr =", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrNotEqualTo(String value) {
            addCriterion("plcr <>", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrGreaterThan(String value) {
            addCriterion("plcr >", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrGreaterThanOrEqualTo(String value) {
            addCriterion("plcr >=", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrLessThan(String value) {
            addCriterion("plcr <", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrLessThanOrEqualTo(String value) {
            addCriterion("plcr <=", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrLike(String value) {
            addCriterion("plcr like", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrNotLike(String value) {
            addCriterion("plcr not like", value, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrIn(List<String> values) {
            addCriterion("plcr in", values, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrNotIn(List<String> values) {
            addCriterion("plcr not in", values, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrBetween(String value1, String value2) {
            addCriterion("plcr between", value1, value2, "plcr");
            return (Criteria) this;
        }

        public Criteria andPlcrNotBetween(String value1, String value2) {
            addCriterion("plcr not between", value1, value2, "plcr");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageIsNull() {
            addCriterion("neutrophil_percentage is null");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageIsNotNull() {
            addCriterion("neutrophil_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageEqualTo(String value) {
            addCriterion("neutrophil_percentage =", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageNotEqualTo(String value) {
            addCriterion("neutrophil_percentage <>", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageGreaterThan(String value) {
            addCriterion("neutrophil_percentage >", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageGreaterThanOrEqualTo(String value) {
            addCriterion("neutrophil_percentage >=", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageLessThan(String value) {
            addCriterion("neutrophil_percentage <", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageLessThanOrEqualTo(String value) {
            addCriterion("neutrophil_percentage <=", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageLike(String value) {
            addCriterion("neutrophil_percentage like", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageNotLike(String value) {
            addCriterion("neutrophil_percentage not like", value, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageIn(List<String> values) {
            addCriterion("neutrophil_percentage in", values, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageNotIn(List<String> values) {
            addCriterion("neutrophil_percentage not in", values, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageBetween(String value1, String value2) {
            addCriterion("neutrophil_percentage between", value1, value2, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilPercentageNotBetween(String value1, String value2) {
            addCriterion("neutrophil_percentage not between", value1, value2, "neutrophilPercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageIsNull() {
            addCriterion("lymphocyte_percentage is null");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageIsNotNull() {
            addCriterion("lymphocyte_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageEqualTo(String value) {
            addCriterion("lymphocyte_percentage =", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageNotEqualTo(String value) {
            addCriterion("lymphocyte_percentage <>", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageGreaterThan(String value) {
            addCriterion("lymphocyte_percentage >", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("lymphocyte_percentage >=", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageLessThan(String value) {
            addCriterion("lymphocyte_percentage <", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageLessThanOrEqualTo(String value) {
            addCriterion("lymphocyte_percentage <=", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageLike(String value) {
            addCriterion("lymphocyte_percentage like", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageNotLike(String value) {
            addCriterion("lymphocyte_percentage not like", value, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageIn(List<String> values) {
            addCriterion("lymphocyte_percentage in", values, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageNotIn(List<String> values) {
            addCriterion("lymphocyte_percentage not in", values, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageBetween(String value1, String value2) {
            addCriterion("lymphocyte_percentage between", value1, value2, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andLymphocytePercentageNotBetween(String value1, String value2) {
            addCriterion("lymphocyte_percentage not between", value1, value2, "lymphocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageIsNull() {
            addCriterion("monocyte_percentage is null");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageIsNotNull() {
            addCriterion("monocyte_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageEqualTo(String value) {
            addCriterion("monocyte_percentage =", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageNotEqualTo(String value) {
            addCriterion("monocyte_percentage <>", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageGreaterThan(String value) {
            addCriterion("monocyte_percentage >", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("monocyte_percentage >=", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageLessThan(String value) {
            addCriterion("monocyte_percentage <", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageLessThanOrEqualTo(String value) {
            addCriterion("monocyte_percentage <=", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageLike(String value) {
            addCriterion("monocyte_percentage like", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageNotLike(String value) {
            addCriterion("monocyte_percentage not like", value, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageIn(List<String> values) {
            addCriterion("monocyte_percentage in", values, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageNotIn(List<String> values) {
            addCriterion("monocyte_percentage not in", values, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageBetween(String value1, String value2) {
            addCriterion("monocyte_percentage between", value1, value2, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andMonocytePercentageNotBetween(String value1, String value2) {
            addCriterion("monocyte_percentage not between", value1, value2, "monocytePercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageIsNull() {
            addCriterion("eosinophil_percentage is null");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageIsNotNull() {
            addCriterion("eosinophil_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageEqualTo(String value) {
            addCriterion("eosinophil_percentage =", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageNotEqualTo(String value) {
            addCriterion("eosinophil_percentage <>", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageGreaterThan(String value) {
            addCriterion("eosinophil_percentage >", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageGreaterThanOrEqualTo(String value) {
            addCriterion("eosinophil_percentage >=", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageLessThan(String value) {
            addCriterion("eosinophil_percentage <", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageLessThanOrEqualTo(String value) {
            addCriterion("eosinophil_percentage <=", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageLike(String value) {
            addCriterion("eosinophil_percentage like", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageNotLike(String value) {
            addCriterion("eosinophil_percentage not like", value, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageIn(List<String> values) {
            addCriterion("eosinophil_percentage in", values, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageNotIn(List<String> values) {
            addCriterion("eosinophil_percentage not in", values, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageBetween(String value1, String value2) {
            addCriterion("eosinophil_percentage between", value1, value2, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andEosinophilPercentageNotBetween(String value1, String value2) {
            addCriterion("eosinophil_percentage not between", value1, value2, "eosinophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageIsNull() {
            addCriterion("basophil_percentage is null");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageIsNotNull() {
            addCriterion("basophil_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageEqualTo(String value) {
            addCriterion("basophil_percentage =", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageNotEqualTo(String value) {
            addCriterion("basophil_percentage <>", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageGreaterThan(String value) {
            addCriterion("basophil_percentage >", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageGreaterThanOrEqualTo(String value) {
            addCriterion("basophil_percentage >=", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageLessThan(String value) {
            addCriterion("basophil_percentage <", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageLessThanOrEqualTo(String value) {
            addCriterion("basophil_percentage <=", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageLike(String value) {
            addCriterion("basophil_percentage like", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageNotLike(String value) {
            addCriterion("basophil_percentage not like", value, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageIn(List<String> values) {
            addCriterion("basophil_percentage in", values, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageNotIn(List<String> values) {
            addCriterion("basophil_percentage not in", values, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageBetween(String value1, String value2) {
            addCriterion("basophil_percentage between", value1, value2, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andBasophilPercentageNotBetween(String value1, String value2) {
            addCriterion("basophil_percentage not between", value1, value2, "basophilPercentage");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueIsNull() {
            addCriterion("neutrophil_absolute_value is null");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueIsNotNull() {
            addCriterion("neutrophil_absolute_value is not null");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueEqualTo(String value) {
            addCriterion("neutrophil_absolute_value =", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueNotEqualTo(String value) {
            addCriterion("neutrophil_absolute_value <>", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueGreaterThan(String value) {
            addCriterion("neutrophil_absolute_value >", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueGreaterThanOrEqualTo(String value) {
            addCriterion("neutrophil_absolute_value >=", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueLessThan(String value) {
            addCriterion("neutrophil_absolute_value <", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueLessThanOrEqualTo(String value) {
            addCriterion("neutrophil_absolute_value <=", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueLike(String value) {
            addCriterion("neutrophil_absolute_value like", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueNotLike(String value) {
            addCriterion("neutrophil_absolute_value not like", value, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueIn(List<String> values) {
            addCriterion("neutrophil_absolute_value in", values, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueNotIn(List<String> values) {
            addCriterion("neutrophil_absolute_value not in", values, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueBetween(String value1, String value2) {
            addCriterion("neutrophil_absolute_value between", value1, value2, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andNeutrophilAbsoluteValueNotBetween(String value1, String value2) {
            addCriterion("neutrophil_absolute_value not between", value1, value2, "neutrophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueIsNull() {
            addCriterion("lymphocyte_absolute_value is null");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueIsNotNull() {
            addCriterion("lymphocyte_absolute_value is not null");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueEqualTo(String value) {
            addCriterion("lymphocyte_absolute_value =", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueNotEqualTo(String value) {
            addCriterion("lymphocyte_absolute_value <>", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueGreaterThan(String value) {
            addCriterion("lymphocyte_absolute_value >", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueGreaterThanOrEqualTo(String value) {
            addCriterion("lymphocyte_absolute_value >=", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueLessThan(String value) {
            addCriterion("lymphocyte_absolute_value <", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueLessThanOrEqualTo(String value) {
            addCriterion("lymphocyte_absolute_value <=", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueLike(String value) {
            addCriterion("lymphocyte_absolute_value like", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueNotLike(String value) {
            addCriterion("lymphocyte_absolute_value not like", value, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueIn(List<String> values) {
            addCriterion("lymphocyte_absolute_value in", values, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueNotIn(List<String> values) {
            addCriterion("lymphocyte_absolute_value not in", values, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueBetween(String value1, String value2) {
            addCriterion("lymphocyte_absolute_value between", value1, value2, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andLymphocyteAbsoluteValueNotBetween(String value1, String value2) {
            addCriterion("lymphocyte_absolute_value not between", value1, value2, "lymphocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueIsNull() {
            addCriterion("monocyte_absolute_value is null");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueIsNotNull() {
            addCriterion("monocyte_absolute_value is not null");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueEqualTo(String value) {
            addCriterion("monocyte_absolute_value =", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueNotEqualTo(String value) {
            addCriterion("monocyte_absolute_value <>", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueGreaterThan(String value) {
            addCriterion("monocyte_absolute_value >", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueGreaterThanOrEqualTo(String value) {
            addCriterion("monocyte_absolute_value >=", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueLessThan(String value) {
            addCriterion("monocyte_absolute_value <", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueLessThanOrEqualTo(String value) {
            addCriterion("monocyte_absolute_value <=", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueLike(String value) {
            addCriterion("monocyte_absolute_value like", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueNotLike(String value) {
            addCriterion("monocyte_absolute_value not like", value, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueIn(List<String> values) {
            addCriterion("monocyte_absolute_value in", values, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueNotIn(List<String> values) {
            addCriterion("monocyte_absolute_value not in", values, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueBetween(String value1, String value2) {
            addCriterion("monocyte_absolute_value between", value1, value2, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andMonocyteAbsoluteValueNotBetween(String value1, String value2) {
            addCriterion("monocyte_absolute_value not between", value1, value2, "monocyteAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueIsNull() {
            addCriterion("eosinophil_absolute_value is null");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueIsNotNull() {
            addCriterion("eosinophil_absolute_value is not null");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueEqualTo(String value) {
            addCriterion("eosinophil_absolute_value =", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueNotEqualTo(String value) {
            addCriterion("eosinophil_absolute_value <>", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueGreaterThan(String value) {
            addCriterion("eosinophil_absolute_value >", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueGreaterThanOrEqualTo(String value) {
            addCriterion("eosinophil_absolute_value >=", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueLessThan(String value) {
            addCriterion("eosinophil_absolute_value <", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueLessThanOrEqualTo(String value) {
            addCriterion("eosinophil_absolute_value <=", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueLike(String value) {
            addCriterion("eosinophil_absolute_value like", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueNotLike(String value) {
            addCriterion("eosinophil_absolute_value not like", value, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueIn(List<String> values) {
            addCriterion("eosinophil_absolute_value in", values, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueNotIn(List<String> values) {
            addCriterion("eosinophil_absolute_value not in", values, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueBetween(String value1, String value2) {
            addCriterion("eosinophil_absolute_value between", value1, value2, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andEosinophilAbsoluteValueNotBetween(String value1, String value2) {
            addCriterion("eosinophil_absolute_value not between", value1, value2, "eosinophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueIsNull() {
            addCriterion("basophil_absolute_value is null");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueIsNotNull() {
            addCriterion("basophil_absolute_value is not null");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueEqualTo(String value) {
            addCriterion("basophil_absolute_value =", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueNotEqualTo(String value) {
            addCriterion("basophil_absolute_value <>", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueGreaterThan(String value) {
            addCriterion("basophil_absolute_value >", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueGreaterThanOrEqualTo(String value) {
            addCriterion("basophil_absolute_value >=", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueLessThan(String value) {
            addCriterion("basophil_absolute_value <", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueLessThanOrEqualTo(String value) {
            addCriterion("basophil_absolute_value <=", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueLike(String value) {
            addCriterion("basophil_absolute_value like", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueNotLike(String value) {
            addCriterion("basophil_absolute_value not like", value, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueIn(List<String> values) {
            addCriterion("basophil_absolute_value in", values, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueNotIn(List<String> values) {
            addCriterion("basophil_absolute_value not in", values, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueBetween(String value1, String value2) {
            addCriterion("basophil_absolute_value between", value1, value2, "basophilAbsoluteValue");
            return (Criteria) this;
        }

        public Criteria andBasophilAbsoluteValueNotBetween(String value1, String value2) {
            addCriterion("basophil_absolute_value not between", value1, value2, "basophilAbsoluteValue");
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

        public Criteria andRowVersionEqualTo(Integer value) {
            addCriterion("row_version =", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotEqualTo(Integer value) {
            addCriterion("row_version <>", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThan(Integer value) {
            addCriterion("row_version >", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_version >=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThan(Integer value) {
            addCriterion("row_version <", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThanOrEqualTo(Integer value) {
            addCriterion("row_version <=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionIn(List<Integer> values) {
            addCriterion("row_version in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotIn(List<Integer> values) {
            addCriterion("row_version not in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionBetween(Integer value1, Integer value2) {
            addCriterion("row_version between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotBetween(Integer value1, Integer value2) {
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