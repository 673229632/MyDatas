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

public class PdDPatientInspectionInfectionDiseasesExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDPatientInspectionInfectionDiseasesExample() {
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
        return PdDPatientInspectionInfectionDiseasesColumnEnum.values();
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

        public Criteria andHbsagIsNull() {
            addCriterion("hbsag is null");
            return (Criteria) this;
        }

        public Criteria andHbsagIsNotNull() {
            addCriterion("hbsag is not null");
            return (Criteria) this;
        }

        public Criteria andHbsagEqualTo(String value) {
            addCriterion("hbsag =", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagNotEqualTo(String value) {
            addCriterion("hbsag <>", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagGreaterThan(String value) {
            addCriterion("hbsag >", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagGreaterThanOrEqualTo(String value) {
            addCriterion("hbsag >=", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagLessThan(String value) {
            addCriterion("hbsag <", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagLessThanOrEqualTo(String value) {
            addCriterion("hbsag <=", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagLike(String value) {
            addCriterion("hbsag like", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagNotLike(String value) {
            addCriterion("hbsag not like", value, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagIn(List<String> values) {
            addCriterion("hbsag in", values, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagNotIn(List<String> values) {
            addCriterion("hbsag not in", values, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagBetween(String value1, String value2) {
            addCriterion("hbsag between", value1, value2, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsagNotBetween(String value1, String value2) {
            addCriterion("hbsag not between", value1, value2, "hbsag");
            return (Criteria) this;
        }

        public Criteria andHbsabIsNull() {
            addCriterion("hbsab is null");
            return (Criteria) this;
        }

        public Criteria andHbsabIsNotNull() {
            addCriterion("hbsab is not null");
            return (Criteria) this;
        }

        public Criteria andHbsabEqualTo(String value) {
            addCriterion("hbsab =", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabNotEqualTo(String value) {
            addCriterion("hbsab <>", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabGreaterThan(String value) {
            addCriterion("hbsab >", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabGreaterThanOrEqualTo(String value) {
            addCriterion("hbsab >=", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabLessThan(String value) {
            addCriterion("hbsab <", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabLessThanOrEqualTo(String value) {
            addCriterion("hbsab <=", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabLike(String value) {
            addCriterion("hbsab like", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabNotLike(String value) {
            addCriterion("hbsab not like", value, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabIn(List<String> values) {
            addCriterion("hbsab in", values, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabNotIn(List<String> values) {
            addCriterion("hbsab not in", values, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabBetween(String value1, String value2) {
            addCriterion("hbsab between", value1, value2, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbsabNotBetween(String value1, String value2) {
            addCriterion("hbsab not between", value1, value2, "hbsab");
            return (Criteria) this;
        }

        public Criteria andHbeagIsNull() {
            addCriterion("hbeag is null");
            return (Criteria) this;
        }

        public Criteria andHbeagIsNotNull() {
            addCriterion("hbeag is not null");
            return (Criteria) this;
        }

        public Criteria andHbeagEqualTo(String value) {
            addCriterion("hbeag =", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagNotEqualTo(String value) {
            addCriterion("hbeag <>", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagGreaterThan(String value) {
            addCriterion("hbeag >", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagGreaterThanOrEqualTo(String value) {
            addCriterion("hbeag >=", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagLessThan(String value) {
            addCriterion("hbeag <", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagLessThanOrEqualTo(String value) {
            addCriterion("hbeag <=", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagLike(String value) {
            addCriterion("hbeag like", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagNotLike(String value) {
            addCriterion("hbeag not like", value, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagIn(List<String> values) {
            addCriterion("hbeag in", values, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagNotIn(List<String> values) {
            addCriterion("hbeag not in", values, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagBetween(String value1, String value2) {
            addCriterion("hbeag between", value1, value2, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeagNotBetween(String value1, String value2) {
            addCriterion("hbeag not between", value1, value2, "hbeag");
            return (Criteria) this;
        }

        public Criteria andHbeabIsNull() {
            addCriterion("hbeab is null");
            return (Criteria) this;
        }

        public Criteria andHbeabIsNotNull() {
            addCriterion("hbeab is not null");
            return (Criteria) this;
        }

        public Criteria andHbeabEqualTo(String value) {
            addCriterion("hbeab =", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabNotEqualTo(String value) {
            addCriterion("hbeab <>", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabGreaterThan(String value) {
            addCriterion("hbeab >", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabGreaterThanOrEqualTo(String value) {
            addCriterion("hbeab >=", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabLessThan(String value) {
            addCriterion("hbeab <", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabLessThanOrEqualTo(String value) {
            addCriterion("hbeab <=", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabLike(String value) {
            addCriterion("hbeab like", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabNotLike(String value) {
            addCriterion("hbeab not like", value, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabIn(List<String> values) {
            addCriterion("hbeab in", values, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabNotIn(List<String> values) {
            addCriterion("hbeab not in", values, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabBetween(String value1, String value2) {
            addCriterion("hbeab between", value1, value2, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbeabNotBetween(String value1, String value2) {
            addCriterion("hbeab not between", value1, value2, "hbeab");
            return (Criteria) this;
        }

        public Criteria andHbcabIsNull() {
            addCriterion("hbcab is null");
            return (Criteria) this;
        }

        public Criteria andHbcabIsNotNull() {
            addCriterion("hbcab is not null");
            return (Criteria) this;
        }

        public Criteria andHbcabEqualTo(String value) {
            addCriterion("hbcab =", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabNotEqualTo(String value) {
            addCriterion("hbcab <>", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabGreaterThan(String value) {
            addCriterion("hbcab >", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabGreaterThanOrEqualTo(String value) {
            addCriterion("hbcab >=", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabLessThan(String value) {
            addCriterion("hbcab <", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabLessThanOrEqualTo(String value) {
            addCriterion("hbcab <=", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabLike(String value) {
            addCriterion("hbcab like", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabNotLike(String value) {
            addCriterion("hbcab not like", value, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabIn(List<String> values) {
            addCriterion("hbcab in", values, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabNotIn(List<String> values) {
            addCriterion("hbcab not in", values, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabBetween(String value1, String value2) {
            addCriterion("hbcab between", value1, value2, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbcabNotBetween(String value1, String value2) {
            addCriterion("hbcab not between", value1, value2, "hbcab");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseIsNull() {
            addCriterion("hbvdnase is null");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseIsNotNull() {
            addCriterion("hbvdnase is not null");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseEqualTo(String value) {
            addCriterion("hbvdnase =", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseNotEqualTo(String value) {
            addCriterion("hbvdnase <>", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseGreaterThan(String value) {
            addCriterion("hbvdnase >", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseGreaterThanOrEqualTo(String value) {
            addCriterion("hbvdnase >=", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseLessThan(String value) {
            addCriterion("hbvdnase <", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseLessThanOrEqualTo(String value) {
            addCriterion("hbvdnase <=", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseLike(String value) {
            addCriterion("hbvdnase like", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseNotLike(String value) {
            addCriterion("hbvdnase not like", value, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseIn(List<String> values) {
            addCriterion("hbvdnase in", values, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseNotIn(List<String> values) {
            addCriterion("hbvdnase not in", values, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseBetween(String value1, String value2) {
            addCriterion("hbvdnase between", value1, value2, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHbvdnaseNotBetween(String value1, String value2) {
            addCriterion("hbvdnase not between", value1, value2, "hbvdnase");
            return (Criteria) this;
        }

        public Criteria andHavIsNull() {
            addCriterion("hav is null");
            return (Criteria) this;
        }

        public Criteria andHavIsNotNull() {
            addCriterion("hav is not null");
            return (Criteria) this;
        }

        public Criteria andHavEqualTo(String value) {
            addCriterion("hav =", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavNotEqualTo(String value) {
            addCriterion("hav <>", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavGreaterThan(String value) {
            addCriterion("hav >", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavGreaterThanOrEqualTo(String value) {
            addCriterion("hav >=", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavLessThan(String value) {
            addCriterion("hav <", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavLessThanOrEqualTo(String value) {
            addCriterion("hav <=", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavLike(String value) {
            addCriterion("hav like", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavNotLike(String value) {
            addCriterion("hav not like", value, "hav");
            return (Criteria) this;
        }

        public Criteria andHavIn(List<String> values) {
            addCriterion("hav in", values, "hav");
            return (Criteria) this;
        }

        public Criteria andHavNotIn(List<String> values) {
            addCriterion("hav not in", values, "hav");
            return (Criteria) this;
        }

        public Criteria andHavBetween(String value1, String value2) {
            addCriterion("hav between", value1, value2, "hav");
            return (Criteria) this;
        }

        public Criteria andHavNotBetween(String value1, String value2) {
            addCriterion("hav not between", value1, value2, "hav");
            return (Criteria) this;
        }

        public Criteria andHbcabigmIsNull() {
            addCriterion("hbcabigm is null");
            return (Criteria) this;
        }

        public Criteria andHbcabigmIsNotNull() {
            addCriterion("hbcabigm is not null");
            return (Criteria) this;
        }

        public Criteria andHbcabigmEqualTo(String value) {
            addCriterion("hbcabigm =", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmNotEqualTo(String value) {
            addCriterion("hbcabigm <>", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmGreaterThan(String value) {
            addCriterion("hbcabigm >", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmGreaterThanOrEqualTo(String value) {
            addCriterion("hbcabigm >=", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmLessThan(String value) {
            addCriterion("hbcabigm <", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmLessThanOrEqualTo(String value) {
            addCriterion("hbcabigm <=", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmLike(String value) {
            addCriterion("hbcabigm like", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmNotLike(String value) {
            addCriterion("hbcabigm not like", value, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmIn(List<String> values) {
            addCriterion("hbcabigm in", values, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmNotIn(List<String> values) {
            addCriterion("hbcabigm not in", values, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmBetween(String value1, String value2) {
            addCriterion("hbcabigm between", value1, value2, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHbcabigmNotBetween(String value1, String value2) {
            addCriterion("hbcabigm not between", value1, value2, "hbcabigm");
            return (Criteria) this;
        }

        public Criteria andHcviggIsNull() {
            addCriterion("hcvigg is null");
            return (Criteria) this;
        }

        public Criteria andHcviggIsNotNull() {
            addCriterion("hcvigg is not null");
            return (Criteria) this;
        }

        public Criteria andHcviggEqualTo(String value) {
            addCriterion("hcvigg =", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggNotEqualTo(String value) {
            addCriterion("hcvigg <>", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggGreaterThan(String value) {
            addCriterion("hcvigg >", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggGreaterThanOrEqualTo(String value) {
            addCriterion("hcvigg >=", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggLessThan(String value) {
            addCriterion("hcvigg <", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggLessThanOrEqualTo(String value) {
            addCriterion("hcvigg <=", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggLike(String value) {
            addCriterion("hcvigg like", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggNotLike(String value) {
            addCriterion("hcvigg not like", value, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggIn(List<String> values) {
            addCriterion("hcvigg in", values, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggNotIn(List<String> values) {
            addCriterion("hcvigg not in", values, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggBetween(String value1, String value2) {
            addCriterion("hcvigg between", value1, value2, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcviggNotBetween(String value1, String value2) {
            addCriterion("hcvigg not between", value1, value2, "hcvigg");
            return (Criteria) this;
        }

        public Criteria andHcvigmIsNull() {
            addCriterion("hcvigm is null");
            return (Criteria) this;
        }

        public Criteria andHcvigmIsNotNull() {
            addCriterion("hcvigm is not null");
            return (Criteria) this;
        }

        public Criteria andHcvigmEqualTo(String value) {
            addCriterion("hcvigm =", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmNotEqualTo(String value) {
            addCriterion("hcvigm <>", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmGreaterThan(String value) {
            addCriterion("hcvigm >", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmGreaterThanOrEqualTo(String value) {
            addCriterion("hcvigm >=", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmLessThan(String value) {
            addCriterion("hcvigm <", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmLessThanOrEqualTo(String value) {
            addCriterion("hcvigm <=", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmLike(String value) {
            addCriterion("hcvigm like", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmNotLike(String value) {
            addCriterion("hcvigm not like", value, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmIn(List<String> values) {
            addCriterion("hcvigm in", values, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmNotIn(List<String> values) {
            addCriterion("hcvigm not in", values, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmBetween(String value1, String value2) {
            addCriterion("hcvigm between", value1, value2, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHcvigmNotBetween(String value1, String value2) {
            addCriterion("hcvigm not between", value1, value2, "hcvigm");
            return (Criteria) this;
        }

        public Criteria andHdvIsNull() {
            addCriterion("hdv is null");
            return (Criteria) this;
        }

        public Criteria andHdvIsNotNull() {
            addCriterion("hdv is not null");
            return (Criteria) this;
        }

        public Criteria andHdvEqualTo(String value) {
            addCriterion("hdv =", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvNotEqualTo(String value) {
            addCriterion("hdv <>", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvGreaterThan(String value) {
            addCriterion("hdv >", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvGreaterThanOrEqualTo(String value) {
            addCriterion("hdv >=", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvLessThan(String value) {
            addCriterion("hdv <", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvLessThanOrEqualTo(String value) {
            addCriterion("hdv <=", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvLike(String value) {
            addCriterion("hdv like", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvNotLike(String value) {
            addCriterion("hdv not like", value, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvIn(List<String> values) {
            addCriterion("hdv in", values, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvNotIn(List<String> values) {
            addCriterion("hdv not in", values, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvBetween(String value1, String value2) {
            addCriterion("hdv between", value1, value2, "hdv");
            return (Criteria) this;
        }

        public Criteria andHdvNotBetween(String value1, String value2) {
            addCriterion("hdv not between", value1, value2, "hdv");
            return (Criteria) this;
        }

        public Criteria andHevIsNull() {
            addCriterion("hev is null");
            return (Criteria) this;
        }

        public Criteria andHevIsNotNull() {
            addCriterion("hev is not null");
            return (Criteria) this;
        }

        public Criteria andHevEqualTo(String value) {
            addCriterion("hev =", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevNotEqualTo(String value) {
            addCriterion("hev <>", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevGreaterThan(String value) {
            addCriterion("hev >", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevGreaterThanOrEqualTo(String value) {
            addCriterion("hev >=", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevLessThan(String value) {
            addCriterion("hev <", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevLessThanOrEqualTo(String value) {
            addCriterion("hev <=", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevLike(String value) {
            addCriterion("hev like", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevNotLike(String value) {
            addCriterion("hev not like", value, "hev");
            return (Criteria) this;
        }

        public Criteria andHevIn(List<String> values) {
            addCriterion("hev in", values, "hev");
            return (Criteria) this;
        }

        public Criteria andHevNotIn(List<String> values) {
            addCriterion("hev not in", values, "hev");
            return (Criteria) this;
        }

        public Criteria andHevBetween(String value1, String value2) {
            addCriterion("hev between", value1, value2, "hev");
            return (Criteria) this;
        }

        public Criteria andHevNotBetween(String value1, String value2) {
            addCriterion("hev not between", value1, value2, "hev");
            return (Criteria) this;
        }

        public Criteria andHgvIsNull() {
            addCriterion("hgv is null");
            return (Criteria) this;
        }

        public Criteria andHgvIsNotNull() {
            addCriterion("hgv is not null");
            return (Criteria) this;
        }

        public Criteria andHgvEqualTo(String value) {
            addCriterion("hgv =", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvNotEqualTo(String value) {
            addCriterion("hgv <>", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvGreaterThan(String value) {
            addCriterion("hgv >", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvGreaterThanOrEqualTo(String value) {
            addCriterion("hgv >=", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvLessThan(String value) {
            addCriterion("hgv <", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvLessThanOrEqualTo(String value) {
            addCriterion("hgv <=", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvLike(String value) {
            addCriterion("hgv like", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvNotLike(String value) {
            addCriterion("hgv not like", value, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvIn(List<String> values) {
            addCriterion("hgv in", values, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvNotIn(List<String> values) {
            addCriterion("hgv not in", values, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvBetween(String value1, String value2) {
            addCriterion("hgv between", value1, value2, "hgv");
            return (Criteria) this;
        }

        public Criteria andHgvNotBetween(String value1, String value2) {
            addCriterion("hgv not between", value1, value2, "hgv");
            return (Criteria) this;
        }

        public Criteria andHivIsNull() {
            addCriterion("hiv is null");
            return (Criteria) this;
        }

        public Criteria andHivIsNotNull() {
            addCriterion("hiv is not null");
            return (Criteria) this;
        }

        public Criteria andHivEqualTo(String value) {
            addCriterion("hiv =", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivNotEqualTo(String value) {
            addCriterion("hiv <>", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivGreaterThan(String value) {
            addCriterion("hiv >", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivGreaterThanOrEqualTo(String value) {
            addCriterion("hiv >=", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivLessThan(String value) {
            addCriterion("hiv <", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivLessThanOrEqualTo(String value) {
            addCriterion("hiv <=", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivLike(String value) {
            addCriterion("hiv like", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivNotLike(String value) {
            addCriterion("hiv not like", value, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivIn(List<String> values) {
            addCriterion("hiv in", values, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivNotIn(List<String> values) {
            addCriterion("hiv not in", values, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivBetween(String value1, String value2) {
            addCriterion("hiv between", value1, value2, "hiv");
            return (Criteria) this;
        }

        public Criteria andHivNotBetween(String value1, String value2) {
            addCriterion("hiv not between", value1, value2, "hiv");
            return (Criteria) this;
        }

        public Criteria andTpabIsNull() {
            addCriterion("tpab is null");
            return (Criteria) this;
        }

        public Criteria andTpabIsNotNull() {
            addCriterion("tpab is not null");
            return (Criteria) this;
        }

        public Criteria andTpabEqualTo(String value) {
            addCriterion("tpab =", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabNotEqualTo(String value) {
            addCriterion("tpab <>", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabGreaterThan(String value) {
            addCriterion("tpab >", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabGreaterThanOrEqualTo(String value) {
            addCriterion("tpab >=", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabLessThan(String value) {
            addCriterion("tpab <", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabLessThanOrEqualTo(String value) {
            addCriterion("tpab <=", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabLike(String value) {
            addCriterion("tpab like", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabNotLike(String value) {
            addCriterion("tpab not like", value, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabIn(List<String> values) {
            addCriterion("tpab in", values, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabNotIn(List<String> values) {
            addCriterion("tpab not in", values, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabBetween(String value1, String value2) {
            addCriterion("tpab between", value1, value2, "tpab");
            return (Criteria) this;
        }

        public Criteria andTpabNotBetween(String value1, String value2) {
            addCriterion("tpab not between", value1, value2, "tpab");
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