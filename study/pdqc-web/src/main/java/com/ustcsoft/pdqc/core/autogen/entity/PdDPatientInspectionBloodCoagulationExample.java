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

public class PdDPatientInspectionBloodCoagulationExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDPatientInspectionBloodCoagulationExample() {
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
        return PdDPatientInspectionBloodCoagulationColumnEnum.values();
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

        public Criteria andFibIsNull() {
            addCriterion("fib is null");
            return (Criteria) this;
        }

        public Criteria andFibIsNotNull() {
            addCriterion("fib is not null");
            return (Criteria) this;
        }

        public Criteria andFibEqualTo(String value) {
            addCriterion("fib =", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibNotEqualTo(String value) {
            addCriterion("fib <>", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibGreaterThan(String value) {
            addCriterion("fib >", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibGreaterThanOrEqualTo(String value) {
            addCriterion("fib >=", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibLessThan(String value) {
            addCriterion("fib <", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibLessThanOrEqualTo(String value) {
            addCriterion("fib <=", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibLike(String value) {
            addCriterion("fib like", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibNotLike(String value) {
            addCriterion("fib not like", value, "fib");
            return (Criteria) this;
        }

        public Criteria andFibIn(List<String> values) {
            addCriterion("fib in", values, "fib");
            return (Criteria) this;
        }

        public Criteria andFibNotIn(List<String> values) {
            addCriterion("fib not in", values, "fib");
            return (Criteria) this;
        }

        public Criteria andFibBetween(String value1, String value2) {
            addCriterion("fib between", value1, value2, "fib");
            return (Criteria) this;
        }

        public Criteria andFibNotBetween(String value1, String value2) {
            addCriterion("fib not between", value1, value2, "fib");
            return (Criteria) this;
        }

        public Criteria andApttIsNull() {
            addCriterion("aptt is null");
            return (Criteria) this;
        }

        public Criteria andApttIsNotNull() {
            addCriterion("aptt is not null");
            return (Criteria) this;
        }

        public Criteria andApttEqualTo(String value) {
            addCriterion("aptt =", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttNotEqualTo(String value) {
            addCriterion("aptt <>", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttGreaterThan(String value) {
            addCriterion("aptt >", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttGreaterThanOrEqualTo(String value) {
            addCriterion("aptt >=", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttLessThan(String value) {
            addCriterion("aptt <", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttLessThanOrEqualTo(String value) {
            addCriterion("aptt <=", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttLike(String value) {
            addCriterion("aptt like", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttNotLike(String value) {
            addCriterion("aptt not like", value, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttIn(List<String> values) {
            addCriterion("aptt in", values, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttNotIn(List<String> values) {
            addCriterion("aptt not in", values, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttBetween(String value1, String value2) {
            addCriterion("aptt between", value1, value2, "aptt");
            return (Criteria) this;
        }

        public Criteria andApttNotBetween(String value1, String value2) {
            addCriterion("aptt not between", value1, value2, "aptt");
            return (Criteria) this;
        }

        public Criteria andPtaIsNull() {
            addCriterion("pta is null");
            return (Criteria) this;
        }

        public Criteria andPtaIsNotNull() {
            addCriterion("pta is not null");
            return (Criteria) this;
        }

        public Criteria andPtaEqualTo(String value) {
            addCriterion("pta =", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaNotEqualTo(String value) {
            addCriterion("pta <>", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaGreaterThan(String value) {
            addCriterion("pta >", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaGreaterThanOrEqualTo(String value) {
            addCriterion("pta >=", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaLessThan(String value) {
            addCriterion("pta <", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaLessThanOrEqualTo(String value) {
            addCriterion("pta <=", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaLike(String value) {
            addCriterion("pta like", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaNotLike(String value) {
            addCriterion("pta not like", value, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaIn(List<String> values) {
            addCriterion("pta in", values, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaNotIn(List<String> values) {
            addCriterion("pta not in", values, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaBetween(String value1, String value2) {
            addCriterion("pta between", value1, value2, "pta");
            return (Criteria) this;
        }

        public Criteria andPtaNotBetween(String value1, String value2) {
            addCriterion("pta not between", value1, value2, "pta");
            return (Criteria) this;
        }

        public Criteria andPtIsNull() {
            addCriterion("pt is null");
            return (Criteria) this;
        }

        public Criteria andPtIsNotNull() {
            addCriterion("pt is not null");
            return (Criteria) this;
        }

        public Criteria andPtEqualTo(String value) {
            addCriterion("pt =", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtNotEqualTo(String value) {
            addCriterion("pt <>", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtGreaterThan(String value) {
            addCriterion("pt >", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtGreaterThanOrEqualTo(String value) {
            addCriterion("pt >=", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtLessThan(String value) {
            addCriterion("pt <", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtLessThanOrEqualTo(String value) {
            addCriterion("pt <=", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtLike(String value) {
            addCriterion("pt like", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtNotLike(String value) {
            addCriterion("pt not like", value, "pt");
            return (Criteria) this;
        }

        public Criteria andPtIn(List<String> values) {
            addCriterion("pt in", values, "pt");
            return (Criteria) this;
        }

        public Criteria andPtNotIn(List<String> values) {
            addCriterion("pt not in", values, "pt");
            return (Criteria) this;
        }

        public Criteria andPtBetween(String value1, String value2) {
            addCriterion("pt between", value1, value2, "pt");
            return (Criteria) this;
        }

        public Criteria andPtNotBetween(String value1, String value2) {
            addCriterion("pt not between", value1, value2, "pt");
            return (Criteria) this;
        }

        public Criteria andTtIsNull() {
            addCriterion("tt is null");
            return (Criteria) this;
        }

        public Criteria andTtIsNotNull() {
            addCriterion("tt is not null");
            return (Criteria) this;
        }

        public Criteria andTtEqualTo(String value) {
            addCriterion("tt =", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtNotEqualTo(String value) {
            addCriterion("tt <>", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtGreaterThan(String value) {
            addCriterion("tt >", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtGreaterThanOrEqualTo(String value) {
            addCriterion("tt >=", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtLessThan(String value) {
            addCriterion("tt <", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtLessThanOrEqualTo(String value) {
            addCriterion("tt <=", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtLike(String value) {
            addCriterion("tt like", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtNotLike(String value) {
            addCriterion("tt not like", value, "tt");
            return (Criteria) this;
        }

        public Criteria andTtIn(List<String> values) {
            addCriterion("tt in", values, "tt");
            return (Criteria) this;
        }

        public Criteria andTtNotIn(List<String> values) {
            addCriterion("tt not in", values, "tt");
            return (Criteria) this;
        }

        public Criteria andTtBetween(String value1, String value2) {
            addCriterion("tt between", value1, value2, "tt");
            return (Criteria) this;
        }

        public Criteria andTtNotBetween(String value1, String value2) {
            addCriterion("tt not between", value1, value2, "tt");
            return (Criteria) this;
        }

        public Criteria andInrIsNull() {
            addCriterion("inr is null");
            return (Criteria) this;
        }

        public Criteria andInrIsNotNull() {
            addCriterion("inr is not null");
            return (Criteria) this;
        }

        public Criteria andInrEqualTo(String value) {
            addCriterion("inr =", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrNotEqualTo(String value) {
            addCriterion("inr <>", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrGreaterThan(String value) {
            addCriterion("inr >", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrGreaterThanOrEqualTo(String value) {
            addCriterion("inr >=", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrLessThan(String value) {
            addCriterion("inr <", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrLessThanOrEqualTo(String value) {
            addCriterion("inr <=", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrLike(String value) {
            addCriterion("inr like", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrNotLike(String value) {
            addCriterion("inr not like", value, "inr");
            return (Criteria) this;
        }

        public Criteria andInrIn(List<String> values) {
            addCriterion("inr in", values, "inr");
            return (Criteria) this;
        }

        public Criteria andInrNotIn(List<String> values) {
            addCriterion("inr not in", values, "inr");
            return (Criteria) this;
        }

        public Criteria andInrBetween(String value1, String value2) {
            addCriterion("inr between", value1, value2, "inr");
            return (Criteria) this;
        }

        public Criteria andInrNotBetween(String value1, String value2) {
            addCriterion("inr not between", value1, value2, "inr");
            return (Criteria) this;
        }

        public Criteria andFdpIsNull() {
            addCriterion("fdp is null");
            return (Criteria) this;
        }

        public Criteria andFdpIsNotNull() {
            addCriterion("fdp is not null");
            return (Criteria) this;
        }

        public Criteria andFdpEqualTo(String value) {
            addCriterion("fdp =", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpNotEqualTo(String value) {
            addCriterion("fdp <>", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpGreaterThan(String value) {
            addCriterion("fdp >", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpGreaterThanOrEqualTo(String value) {
            addCriterion("fdp >=", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpLessThan(String value) {
            addCriterion("fdp <", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpLessThanOrEqualTo(String value) {
            addCriterion("fdp <=", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpLike(String value) {
            addCriterion("fdp like", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpNotLike(String value) {
            addCriterion("fdp not like", value, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpIn(List<String> values) {
            addCriterion("fdp in", values, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpNotIn(List<String> values) {
            addCriterion("fdp not in", values, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpBetween(String value1, String value2) {
            addCriterion("fdp between", value1, value2, "fdp");
            return (Criteria) this;
        }

        public Criteria andFdpNotBetween(String value1, String value2) {
            addCriterion("fdp not between", value1, value2, "fdp");
            return (Criteria) this;
        }

        public Criteria andDdimerIsNull() {
            addCriterion("ddimer is null");
            return (Criteria) this;
        }

        public Criteria andDdimerIsNotNull() {
            addCriterion("ddimer is not null");
            return (Criteria) this;
        }

        public Criteria andDdimerEqualTo(String value) {
            addCriterion("ddimer =", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerNotEqualTo(String value) {
            addCriterion("ddimer <>", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerGreaterThan(String value) {
            addCriterion("ddimer >", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerGreaterThanOrEqualTo(String value) {
            addCriterion("ddimer >=", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerLessThan(String value) {
            addCriterion("ddimer <", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerLessThanOrEqualTo(String value) {
            addCriterion("ddimer <=", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerLike(String value) {
            addCriterion("ddimer like", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerNotLike(String value) {
            addCriterion("ddimer not like", value, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerIn(List<String> values) {
            addCriterion("ddimer in", values, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerNotIn(List<String> values) {
            addCriterion("ddimer not in", values, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerBetween(String value1, String value2) {
            addCriterion("ddimer between", value1, value2, "ddimer");
            return (Criteria) this;
        }

        public Criteria andDdimerNotBetween(String value1, String value2) {
            addCriterion("ddimer not between", value1, value2, "ddimer");
            return (Criteria) this;
        }

        public Criteria andAt3IsNull() {
            addCriterion("at3 is null");
            return (Criteria) this;
        }

        public Criteria andAt3IsNotNull() {
            addCriterion("at3 is not null");
            return (Criteria) this;
        }

        public Criteria andAt3EqualTo(String value) {
            addCriterion("at3 =", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3NotEqualTo(String value) {
            addCriterion("at3 <>", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3GreaterThan(String value) {
            addCriterion("at3 >", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3GreaterThanOrEqualTo(String value) {
            addCriterion("at3 >=", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3LessThan(String value) {
            addCriterion("at3 <", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3LessThanOrEqualTo(String value) {
            addCriterion("at3 <=", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3Like(String value) {
            addCriterion("at3 like", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3NotLike(String value) {
            addCriterion("at3 not like", value, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3In(List<String> values) {
            addCriterion("at3 in", values, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3NotIn(List<String> values) {
            addCriterion("at3 not in", values, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3Between(String value1, String value2) {
            addCriterion("at3 between", value1, value2, "at3");
            return (Criteria) this;
        }

        public Criteria andAt3NotBetween(String value1, String value2) {
            addCriterion("at3 not between", value1, value2, "at3");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2IsNull() {
            addCriterion("plasminogen_inhibitor_a2 is null");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2IsNotNull() {
            addCriterion("plasminogen_inhibitor_a2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2EqualTo(String value) {
            addCriterion("plasminogen_inhibitor_a2 =", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2NotEqualTo(String value) {
            addCriterion("plasminogen_inhibitor_a2 <>", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2GreaterThan(String value) {
            addCriterion("plasminogen_inhibitor_a2 >", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2GreaterThanOrEqualTo(String value) {
            addCriterion("plasminogen_inhibitor_a2 >=", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2LessThan(String value) {
            addCriterion("plasminogen_inhibitor_a2 <", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2LessThanOrEqualTo(String value) {
            addCriterion("plasminogen_inhibitor_a2 <=", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2Like(String value) {
            addCriterion("plasminogen_inhibitor_a2 like", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2NotLike(String value) {
            addCriterion("plasminogen_inhibitor_a2 not like", value, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2In(List<String> values) {
            addCriterion("plasminogen_inhibitor_a2 in", values, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2NotIn(List<String> values) {
            addCriterion("plasminogen_inhibitor_a2 not in", values, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2Between(String value1, String value2) {
            addCriterion("plasminogen_inhibitor_a2 between", value1, value2, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlasminogenInhibitorA2NotBetween(String value1, String value2) {
            addCriterion("plasminogen_inhibitor_a2 not between", value1, value2, "plasminogenInhibitorA2");
            return (Criteria) this;
        }

        public Criteria andPlgaIsNull() {
            addCriterion("plga is null");
            return (Criteria) this;
        }

        public Criteria andPlgaIsNotNull() {
            addCriterion("plga is not null");
            return (Criteria) this;
        }

        public Criteria andPlgaEqualTo(String value) {
            addCriterion("plga =", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaNotEqualTo(String value) {
            addCriterion("plga <>", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaGreaterThan(String value) {
            addCriterion("plga >", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaGreaterThanOrEqualTo(String value) {
            addCriterion("plga >=", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaLessThan(String value) {
            addCriterion("plga <", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaLessThanOrEqualTo(String value) {
            addCriterion("plga <=", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaLike(String value) {
            addCriterion("plga like", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaNotLike(String value) {
            addCriterion("plga not like", value, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaIn(List<String> values) {
            addCriterion("plga in", values, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaNotIn(List<String> values) {
            addCriterion("plga not in", values, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaBetween(String value1, String value2) {
            addCriterion("plga between", value1, value2, "plga");
            return (Criteria) this;
        }

        public Criteria andPlgaNotBetween(String value1, String value2) {
            addCriterion("plga not between", value1, value2, "plga");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
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