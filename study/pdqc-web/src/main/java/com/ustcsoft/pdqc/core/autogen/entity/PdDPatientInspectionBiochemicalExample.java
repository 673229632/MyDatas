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

public class PdDPatientInspectionBiochemicalExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDPatientInspectionBiochemicalExample() {
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
        return PdDPatientInspectionBiochemicalColumnEnum.values();
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

        public Criteria andAltIsNull() {
            addCriterion("alt is null");
            return (Criteria) this;
        }

        public Criteria andAltIsNotNull() {
            addCriterion("alt is not null");
            return (Criteria) this;
        }

        public Criteria andAltEqualTo(String value) {
            addCriterion("alt =", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltNotEqualTo(String value) {
            addCriterion("alt <>", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltGreaterThan(String value) {
            addCriterion("alt >", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltGreaterThanOrEqualTo(String value) {
            addCriterion("alt >=", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltLessThan(String value) {
            addCriterion("alt <", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltLessThanOrEqualTo(String value) {
            addCriterion("alt <=", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltLike(String value) {
            addCriterion("alt like", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltNotLike(String value) {
            addCriterion("alt not like", value, "alt");
            return (Criteria) this;
        }

        public Criteria andAltIn(List<String> values) {
            addCriterion("alt in", values, "alt");
            return (Criteria) this;
        }

        public Criteria andAltNotIn(List<String> values) {
            addCriterion("alt not in", values, "alt");
            return (Criteria) this;
        }

        public Criteria andAltBetween(String value1, String value2) {
            addCriterion("alt between", value1, value2, "alt");
            return (Criteria) this;
        }

        public Criteria andAltNotBetween(String value1, String value2) {
            addCriterion("alt not between", value1, value2, "alt");
            return (Criteria) this;
        }

        public Criteria andAstIsNull() {
            addCriterion("ast is null");
            return (Criteria) this;
        }

        public Criteria andAstIsNotNull() {
            addCriterion("ast is not null");
            return (Criteria) this;
        }

        public Criteria andAstEqualTo(String value) {
            addCriterion("ast =", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotEqualTo(String value) {
            addCriterion("ast <>", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstGreaterThan(String value) {
            addCriterion("ast >", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstGreaterThanOrEqualTo(String value) {
            addCriterion("ast >=", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstLessThan(String value) {
            addCriterion("ast <", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstLessThanOrEqualTo(String value) {
            addCriterion("ast <=", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstLike(String value) {
            addCriterion("ast like", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotLike(String value) {
            addCriterion("ast not like", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstIn(List<String> values) {
            addCriterion("ast in", values, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotIn(List<String> values) {
            addCriterion("ast not in", values, "ast");
            return (Criteria) this;
        }

        public Criteria andAstBetween(String value1, String value2) {
            addCriterion("ast between", value1, value2, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotBetween(String value1, String value2) {
            addCriterion("ast not between", value1, value2, "ast");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("tp is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("tp is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(String value) {
            addCriterion("tp =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(String value) {
            addCriterion("tp <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(String value) {
            addCriterion("tp >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(String value) {
            addCriterion("tp >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(String value) {
            addCriterion("tp <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(String value) {
            addCriterion("tp <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLike(String value) {
            addCriterion("tp like", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotLike(String value) {
            addCriterion("tp not like", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<String> values) {
            addCriterion("tp in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<String> values) {
            addCriterion("tp not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(String value1, String value2) {
            addCriterion("tp between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(String value1, String value2) {
            addCriterion("tp not between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andAlbIsNull() {
            addCriterion("alb is null");
            return (Criteria) this;
        }

        public Criteria andAlbIsNotNull() {
            addCriterion("alb is not null");
            return (Criteria) this;
        }

        public Criteria andAlbEqualTo(String value) {
            addCriterion("alb =", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbNotEqualTo(String value) {
            addCriterion("alb <>", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbGreaterThan(String value) {
            addCriterion("alb >", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbGreaterThanOrEqualTo(String value) {
            addCriterion("alb >=", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbLessThan(String value) {
            addCriterion("alb <", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbLessThanOrEqualTo(String value) {
            addCriterion("alb <=", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbLike(String value) {
            addCriterion("alb like", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbNotLike(String value) {
            addCriterion("alb not like", value, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbIn(List<String> values) {
            addCriterion("alb in", values, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbNotIn(List<String> values) {
            addCriterion("alb not in", values, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbBetween(String value1, String value2) {
            addCriterion("alb between", value1, value2, "alb");
            return (Criteria) this;
        }

        public Criteria andAlbNotBetween(String value1, String value2) {
            addCriterion("alb not between", value1, value2, "alb");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinIsNull() {
            addCriterion("seroglobulin is null");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinIsNotNull() {
            addCriterion("seroglobulin is not null");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinEqualTo(String value) {
            addCriterion("seroglobulin =", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinNotEqualTo(String value) {
            addCriterion("seroglobulin <>", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinGreaterThan(String value) {
            addCriterion("seroglobulin >", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinGreaterThanOrEqualTo(String value) {
            addCriterion("seroglobulin >=", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinLessThan(String value) {
            addCriterion("seroglobulin <", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinLessThanOrEqualTo(String value) {
            addCriterion("seroglobulin <=", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinLike(String value) {
            addCriterion("seroglobulin like", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinNotLike(String value) {
            addCriterion("seroglobulin not like", value, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinIn(List<String> values) {
            addCriterion("seroglobulin in", values, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinNotIn(List<String> values) {
            addCriterion("seroglobulin not in", values, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinBetween(String value1, String value2) {
            addCriterion("seroglobulin between", value1, value2, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andSeroglobulinNotBetween(String value1, String value2) {
            addCriterion("seroglobulin not between", value1, value2, "seroglobulin");
            return (Criteria) this;
        }

        public Criteria andAgIsNull() {
            addCriterion("ag is null");
            return (Criteria) this;
        }

        public Criteria andAgIsNotNull() {
            addCriterion("ag is not null");
            return (Criteria) this;
        }

        public Criteria andAgEqualTo(String value) {
            addCriterion("ag =", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgNotEqualTo(String value) {
            addCriterion("ag <>", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgGreaterThan(String value) {
            addCriterion("ag >", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgGreaterThanOrEqualTo(String value) {
            addCriterion("ag >=", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgLessThan(String value) {
            addCriterion("ag <", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgLessThanOrEqualTo(String value) {
            addCriterion("ag <=", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgLike(String value) {
            addCriterion("ag like", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgNotLike(String value) {
            addCriterion("ag not like", value, "ag");
            return (Criteria) this;
        }

        public Criteria andAgIn(List<String> values) {
            addCriterion("ag in", values, "ag");
            return (Criteria) this;
        }

        public Criteria andAgNotIn(List<String> values) {
            addCriterion("ag not in", values, "ag");
            return (Criteria) this;
        }

        public Criteria andAgBetween(String value1, String value2) {
            addCriterion("ag between", value1, value2, "ag");
            return (Criteria) this;
        }

        public Criteria andAgNotBetween(String value1, String value2) {
            addCriterion("ag not between", value1, value2, "ag");
            return (Criteria) this;
        }

        public Criteria andTbilIsNull() {
            addCriterion("tbil is null");
            return (Criteria) this;
        }

        public Criteria andTbilIsNotNull() {
            addCriterion("tbil is not null");
            return (Criteria) this;
        }

        public Criteria andTbilEqualTo(String value) {
            addCriterion("tbil =", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilNotEqualTo(String value) {
            addCriterion("tbil <>", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilGreaterThan(String value) {
            addCriterion("tbil >", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilGreaterThanOrEqualTo(String value) {
            addCriterion("tbil >=", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilLessThan(String value) {
            addCriterion("tbil <", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilLessThanOrEqualTo(String value) {
            addCriterion("tbil <=", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilLike(String value) {
            addCriterion("tbil like", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilNotLike(String value) {
            addCriterion("tbil not like", value, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilIn(List<String> values) {
            addCriterion("tbil in", values, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilNotIn(List<String> values) {
            addCriterion("tbil not in", values, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilBetween(String value1, String value2) {
            addCriterion("tbil between", value1, value2, "tbil");
            return (Criteria) this;
        }

        public Criteria andTbilNotBetween(String value1, String value2) {
            addCriterion("tbil not between", value1, value2, "tbil");
            return (Criteria) this;
        }

        public Criteria andDbilIsNull() {
            addCriterion("dbil is null");
            return (Criteria) this;
        }

        public Criteria andDbilIsNotNull() {
            addCriterion("dbil is not null");
            return (Criteria) this;
        }

        public Criteria andDbilEqualTo(String value) {
            addCriterion("dbil =", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilNotEqualTo(String value) {
            addCriterion("dbil <>", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilGreaterThan(String value) {
            addCriterion("dbil >", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilGreaterThanOrEqualTo(String value) {
            addCriterion("dbil >=", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilLessThan(String value) {
            addCriterion("dbil <", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilLessThanOrEqualTo(String value) {
            addCriterion("dbil <=", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilLike(String value) {
            addCriterion("dbil like", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilNotLike(String value) {
            addCriterion("dbil not like", value, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilIn(List<String> values) {
            addCriterion("dbil in", values, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilNotIn(List<String> values) {
            addCriterion("dbil not in", values, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilBetween(String value1, String value2) {
            addCriterion("dbil between", value1, value2, "dbil");
            return (Criteria) this;
        }

        public Criteria andDbilNotBetween(String value1, String value2) {
            addCriterion("dbil not between", value1, value2, "dbil");
            return (Criteria) this;
        }

        public Criteria andIbilIsNull() {
            addCriterion("ibil is null");
            return (Criteria) this;
        }

        public Criteria andIbilIsNotNull() {
            addCriterion("ibil is not null");
            return (Criteria) this;
        }

        public Criteria andIbilEqualTo(String value) {
            addCriterion("ibil =", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilNotEqualTo(String value) {
            addCriterion("ibil <>", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilGreaterThan(String value) {
            addCriterion("ibil >", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilGreaterThanOrEqualTo(String value) {
            addCriterion("ibil >=", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilLessThan(String value) {
            addCriterion("ibil <", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilLessThanOrEqualTo(String value) {
            addCriterion("ibil <=", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilLike(String value) {
            addCriterion("ibil like", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilNotLike(String value) {
            addCriterion("ibil not like", value, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilIn(List<String> values) {
            addCriterion("ibil in", values, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilNotIn(List<String> values) {
            addCriterion("ibil not in", values, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilBetween(String value1, String value2) {
            addCriterion("ibil between", value1, value2, "ibil");
            return (Criteria) this;
        }

        public Criteria andIbilNotBetween(String value1, String value2) {
            addCriterion("ibil not between", value1, value2, "ibil");
            return (Criteria) this;
        }

        public Criteria andTbaIsNull() {
            addCriterion("tba is null");
            return (Criteria) this;
        }

        public Criteria andTbaIsNotNull() {
            addCriterion("tba is not null");
            return (Criteria) this;
        }

        public Criteria andTbaEqualTo(String value) {
            addCriterion("tba =", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaNotEqualTo(String value) {
            addCriterion("tba <>", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaGreaterThan(String value) {
            addCriterion("tba >", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaGreaterThanOrEqualTo(String value) {
            addCriterion("tba >=", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaLessThan(String value) {
            addCriterion("tba <", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaLessThanOrEqualTo(String value) {
            addCriterion("tba <=", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaLike(String value) {
            addCriterion("tba like", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaNotLike(String value) {
            addCriterion("tba not like", value, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaIn(List<String> values) {
            addCriterion("tba in", values, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaNotIn(List<String> values) {
            addCriterion("tba not in", values, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaBetween(String value1, String value2) {
            addCriterion("tba between", value1, value2, "tba");
            return (Criteria) this;
        }

        public Criteria andTbaNotBetween(String value1, String value2) {
            addCriterion("tba not between", value1, value2, "tba");
            return (Criteria) this;
        }

        public Criteria andGluIsNull() {
            addCriterion("glu is null");
            return (Criteria) this;
        }

        public Criteria andGluIsNotNull() {
            addCriterion("glu is not null");
            return (Criteria) this;
        }

        public Criteria andGluEqualTo(String value) {
            addCriterion("glu =", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluNotEqualTo(String value) {
            addCriterion("glu <>", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluGreaterThan(String value) {
            addCriterion("glu >", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluGreaterThanOrEqualTo(String value) {
            addCriterion("glu >=", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluLessThan(String value) {
            addCriterion("glu <", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluLessThanOrEqualTo(String value) {
            addCriterion("glu <=", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluLike(String value) {
            addCriterion("glu like", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluNotLike(String value) {
            addCriterion("glu not like", value, "glu");
            return (Criteria) this;
        }

        public Criteria andGluIn(List<String> values) {
            addCriterion("glu in", values, "glu");
            return (Criteria) this;
        }

        public Criteria andGluNotIn(List<String> values) {
            addCriterion("glu not in", values, "glu");
            return (Criteria) this;
        }

        public Criteria andGluBetween(String value1, String value2) {
            addCriterion("glu between", value1, value2, "glu");
            return (Criteria) this;
        }

        public Criteria andGluNotBetween(String value1, String value2) {
            addCriterion("glu not between", value1, value2, "glu");
            return (Criteria) this;
        }

        public Criteria andBunIsNull() {
            addCriterion("bun is null");
            return (Criteria) this;
        }

        public Criteria andBunIsNotNull() {
            addCriterion("bun is not null");
            return (Criteria) this;
        }

        public Criteria andBunEqualTo(String value) {
            addCriterion("bun =", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunNotEqualTo(String value) {
            addCriterion("bun <>", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunGreaterThan(String value) {
            addCriterion("bun >", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunGreaterThanOrEqualTo(String value) {
            addCriterion("bun >=", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunLessThan(String value) {
            addCriterion("bun <", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunLessThanOrEqualTo(String value) {
            addCriterion("bun <=", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunLike(String value) {
            addCriterion("bun like", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunNotLike(String value) {
            addCriterion("bun not like", value, "bun");
            return (Criteria) this;
        }

        public Criteria andBunIn(List<String> values) {
            addCriterion("bun in", values, "bun");
            return (Criteria) this;
        }

        public Criteria andBunNotIn(List<String> values) {
            addCriterion("bun not in", values, "bun");
            return (Criteria) this;
        }

        public Criteria andBunBetween(String value1, String value2) {
            addCriterion("bun between", value1, value2, "bun");
            return (Criteria) this;
        }

        public Criteria andBunNotBetween(String value1, String value2) {
            addCriterion("bun not between", value1, value2, "bun");
            return (Criteria) this;
        }

        public Criteria andCreIsNull() {
            addCriterion("cre is null");
            return (Criteria) this;
        }

        public Criteria andCreIsNotNull() {
            addCriterion("cre is not null");
            return (Criteria) this;
        }

        public Criteria andCreEqualTo(String value) {
            addCriterion("cre =", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreNotEqualTo(String value) {
            addCriterion("cre <>", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreGreaterThan(String value) {
            addCriterion("cre >", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreGreaterThanOrEqualTo(String value) {
            addCriterion("cre >=", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreLessThan(String value) {
            addCriterion("cre <", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreLessThanOrEqualTo(String value) {
            addCriterion("cre <=", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreLike(String value) {
            addCriterion("cre like", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreNotLike(String value) {
            addCriterion("cre not like", value, "cre");
            return (Criteria) this;
        }

        public Criteria andCreIn(List<String> values) {
            addCriterion("cre in", values, "cre");
            return (Criteria) this;
        }

        public Criteria andCreNotIn(List<String> values) {
            addCriterion("cre not in", values, "cre");
            return (Criteria) this;
        }

        public Criteria andCreBetween(String value1, String value2) {
            addCriterion("cre between", value1, value2, "cre");
            return (Criteria) this;
        }

        public Criteria andCreNotBetween(String value1, String value2) {
            addCriterion("cre not between", value1, value2, "cre");
            return (Criteria) this;
        }

        public Criteria andUaIsNull() {
            addCriterion("ua is null");
            return (Criteria) this;
        }

        public Criteria andUaIsNotNull() {
            addCriterion("ua is not null");
            return (Criteria) this;
        }

        public Criteria andUaEqualTo(String value) {
            addCriterion("ua =", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotEqualTo(String value) {
            addCriterion("ua <>", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaGreaterThan(String value) {
            addCriterion("ua >", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaGreaterThanOrEqualTo(String value) {
            addCriterion("ua >=", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLessThan(String value) {
            addCriterion("ua <", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLessThanOrEqualTo(String value) {
            addCriterion("ua <=", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLike(String value) {
            addCriterion("ua like", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotLike(String value) {
            addCriterion("ua not like", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaIn(List<String> values) {
            addCriterion("ua in", values, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotIn(List<String> values) {
            addCriterion("ua not in", values, "ua");
            return (Criteria) this;
        }

        public Criteria andUaBetween(String value1, String value2) {
            addCriterion("ua between", value1, value2, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotBetween(String value1, String value2) {
            addCriterion("ua not between", value1, value2, "ua");
            return (Criteria) this;
        }

        public Criteria andCo2IsNull() {
            addCriterion("co2 is null");
            return (Criteria) this;
        }

        public Criteria andCo2IsNotNull() {
            addCriterion("co2 is not null");
            return (Criteria) this;
        }

        public Criteria andCo2EqualTo(String value) {
            addCriterion("co2 =", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotEqualTo(String value) {
            addCriterion("co2 <>", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThan(String value) {
            addCriterion("co2 >", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThanOrEqualTo(String value) {
            addCriterion("co2 >=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThan(String value) {
            addCriterion("co2 <", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThanOrEqualTo(String value) {
            addCriterion("co2 <=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Like(String value) {
            addCriterion("co2 like", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotLike(String value) {
            addCriterion("co2 not like", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2In(List<String> values) {
            addCriterion("co2 in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotIn(List<String> values) {
            addCriterion("co2 not in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Between(String value1, String value2) {
            addCriterion("co2 between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotBetween(String value1, String value2) {
            addCriterion("co2 not between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andAlpIsNull() {
            addCriterion("alp is null");
            return (Criteria) this;
        }

        public Criteria andAlpIsNotNull() {
            addCriterion("alp is not null");
            return (Criteria) this;
        }

        public Criteria andAlpEqualTo(String value) {
            addCriterion("alp =", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpNotEqualTo(String value) {
            addCriterion("alp <>", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpGreaterThan(String value) {
            addCriterion("alp >", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpGreaterThanOrEqualTo(String value) {
            addCriterion("alp >=", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpLessThan(String value) {
            addCriterion("alp <", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpLessThanOrEqualTo(String value) {
            addCriterion("alp <=", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpLike(String value) {
            addCriterion("alp like", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpNotLike(String value) {
            addCriterion("alp not like", value, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpIn(List<String> values) {
            addCriterion("alp in", values, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpNotIn(List<String> values) {
            addCriterion("alp not in", values, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpBetween(String value1, String value2) {
            addCriterion("alp between", value1, value2, "alp");
            return (Criteria) this;
        }

        public Criteria andAlpNotBetween(String value1, String value2) {
            addCriterion("alp not between", value1, value2, "alp");
            return (Criteria) this;
        }

        public Criteria andGgtIsNull() {
            addCriterion("ggt is null");
            return (Criteria) this;
        }

        public Criteria andGgtIsNotNull() {
            addCriterion("ggt is not null");
            return (Criteria) this;
        }

        public Criteria andGgtEqualTo(String value) {
            addCriterion("ggt =", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtNotEqualTo(String value) {
            addCriterion("ggt <>", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtGreaterThan(String value) {
            addCriterion("ggt >", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtGreaterThanOrEqualTo(String value) {
            addCriterion("ggt >=", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtLessThan(String value) {
            addCriterion("ggt <", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtLessThanOrEqualTo(String value) {
            addCriterion("ggt <=", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtLike(String value) {
            addCriterion("ggt like", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtNotLike(String value) {
            addCriterion("ggt not like", value, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtIn(List<String> values) {
            addCriterion("ggt in", values, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtNotIn(List<String> values) {
            addCriterion("ggt not in", values, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtBetween(String value1, String value2) {
            addCriterion("ggt between", value1, value2, "ggt");
            return (Criteria) this;
        }

        public Criteria andGgtNotBetween(String value1, String value2) {
            addCriterion("ggt not between", value1, value2, "ggt");
            return (Criteria) this;
        }

        public Criteria andKIsNull() {
            addCriterion("k is null");
            return (Criteria) this;
        }

        public Criteria andKIsNotNull() {
            addCriterion("k is not null");
            return (Criteria) this;
        }

        public Criteria andKEqualTo(String value) {
            addCriterion("k =", value, "k");
            return (Criteria) this;
        }

        public Criteria andKNotEqualTo(String value) {
            addCriterion("k <>", value, "k");
            return (Criteria) this;
        }

        public Criteria andKGreaterThan(String value) {
            addCriterion("k >", value, "k");
            return (Criteria) this;
        }

        public Criteria andKGreaterThanOrEqualTo(String value) {
            addCriterion("k >=", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLessThan(String value) {
            addCriterion("k <", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLessThanOrEqualTo(String value) {
            addCriterion("k <=", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLike(String value) {
            addCriterion("k like", value, "k");
            return (Criteria) this;
        }

        public Criteria andKNotLike(String value) {
            addCriterion("k not like", value, "k");
            return (Criteria) this;
        }

        public Criteria andKIn(List<String> values) {
            addCriterion("k in", values, "k");
            return (Criteria) this;
        }

        public Criteria andKNotIn(List<String> values) {
            addCriterion("k not in", values, "k");
            return (Criteria) this;
        }

        public Criteria andKBetween(String value1, String value2) {
            addCriterion("k between", value1, value2, "k");
            return (Criteria) this;
        }

        public Criteria andKNotBetween(String value1, String value2) {
            addCriterion("k not between", value1, value2, "k");
            return (Criteria) this;
        }

        public Criteria andNaIsNull() {
            addCriterion("na is null");
            return (Criteria) this;
        }

        public Criteria andNaIsNotNull() {
            addCriterion("na is not null");
            return (Criteria) this;
        }

        public Criteria andNaEqualTo(String value) {
            addCriterion("na =", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaNotEqualTo(String value) {
            addCriterion("na <>", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaGreaterThan(String value) {
            addCriterion("na >", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaGreaterThanOrEqualTo(String value) {
            addCriterion("na >=", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaLessThan(String value) {
            addCriterion("na <", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaLessThanOrEqualTo(String value) {
            addCriterion("na <=", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaLike(String value) {
            addCriterion("na like", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaNotLike(String value) {
            addCriterion("na not like", value, "na");
            return (Criteria) this;
        }

        public Criteria andNaIn(List<String> values) {
            addCriterion("na in", values, "na");
            return (Criteria) this;
        }

        public Criteria andNaNotIn(List<String> values) {
            addCriterion("na not in", values, "na");
            return (Criteria) this;
        }

        public Criteria andNaBetween(String value1, String value2) {
            addCriterion("na between", value1, value2, "na");
            return (Criteria) this;
        }

        public Criteria andNaNotBetween(String value1, String value2) {
            addCriterion("na not between", value1, value2, "na");
            return (Criteria) this;
        }

        public Criteria andClIsNull() {
            addCriterion("cl is null");
            return (Criteria) this;
        }

        public Criteria andClIsNotNull() {
            addCriterion("cl is not null");
            return (Criteria) this;
        }

        public Criteria andClEqualTo(String value) {
            addCriterion("cl =", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotEqualTo(String value) {
            addCriterion("cl <>", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClGreaterThan(String value) {
            addCriterion("cl >", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClGreaterThanOrEqualTo(String value) {
            addCriterion("cl >=", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClLessThan(String value) {
            addCriterion("cl <", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClLessThanOrEqualTo(String value) {
            addCriterion("cl <=", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClLike(String value) {
            addCriterion("cl like", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotLike(String value) {
            addCriterion("cl not like", value, "cl");
            return (Criteria) this;
        }

        public Criteria andClIn(List<String> values) {
            addCriterion("cl in", values, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotIn(List<String> values) {
            addCriterion("cl not in", values, "cl");
            return (Criteria) this;
        }

        public Criteria andClBetween(String value1, String value2) {
            addCriterion("cl between", value1, value2, "cl");
            return (Criteria) this;
        }

        public Criteria andClNotBetween(String value1, String value2) {
            addCriterion("cl not between", value1, value2, "cl");
            return (Criteria) this;
        }

        public Criteria andCaIsNull() {
            addCriterion("ca is null");
            return (Criteria) this;
        }

        public Criteria andCaIsNotNull() {
            addCriterion("ca is not null");
            return (Criteria) this;
        }

        public Criteria andCaEqualTo(String value) {
            addCriterion("ca =", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaNotEqualTo(String value) {
            addCriterion("ca <>", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaGreaterThan(String value) {
            addCriterion("ca >", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaGreaterThanOrEqualTo(String value) {
            addCriterion("ca >=", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaLessThan(String value) {
            addCriterion("ca <", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaLessThanOrEqualTo(String value) {
            addCriterion("ca <=", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaLike(String value) {
            addCriterion("ca like", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaNotLike(String value) {
            addCriterion("ca not like", value, "ca");
            return (Criteria) this;
        }

        public Criteria andCaIn(List<String> values) {
            addCriterion("ca in", values, "ca");
            return (Criteria) this;
        }

        public Criteria andCaNotIn(List<String> values) {
            addCriterion("ca not in", values, "ca");
            return (Criteria) this;
        }

        public Criteria andCaBetween(String value1, String value2) {
            addCriterion("ca between", value1, value2, "ca");
            return (Criteria) this;
        }

        public Criteria andCaNotBetween(String value1, String value2) {
            addCriterion("ca not between", value1, value2, "ca");
            return (Criteria) this;
        }

        public Criteria andPIsNull() {
            addCriterion("p is null");
            return (Criteria) this;
        }

        public Criteria andPIsNotNull() {
            addCriterion("p is not null");
            return (Criteria) this;
        }

        public Criteria andPEqualTo(String value) {
            addCriterion("p =", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotEqualTo(String value) {
            addCriterion("p <>", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThan(String value) {
            addCriterion("p >", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThanOrEqualTo(String value) {
            addCriterion("p >=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThan(String value) {
            addCriterion("p <", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThanOrEqualTo(String value) {
            addCriterion("p <=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLike(String value) {
            addCriterion("p like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotLike(String value) {
            addCriterion("p not like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPIn(List<String> values) {
            addCriterion("p in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPNotIn(List<String> values) {
            addCriterion("p not in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPBetween(String value1, String value2) {
            addCriterion("p between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andPNotBetween(String value1, String value2) {
            addCriterion("p not between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andMgIsNull() {
            addCriterion("mg is null");
            return (Criteria) this;
        }

        public Criteria andMgIsNotNull() {
            addCriterion("mg is not null");
            return (Criteria) this;
        }

        public Criteria andMgEqualTo(String value) {
            addCriterion("mg =", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgNotEqualTo(String value) {
            addCriterion("mg <>", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgGreaterThan(String value) {
            addCriterion("mg >", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgGreaterThanOrEqualTo(String value) {
            addCriterion("mg >=", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgLessThan(String value) {
            addCriterion("mg <", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgLessThanOrEqualTo(String value) {
            addCriterion("mg <=", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgLike(String value) {
            addCriterion("mg like", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgNotLike(String value) {
            addCriterion("mg not like", value, "mg");
            return (Criteria) this;
        }

        public Criteria andMgIn(List<String> values) {
            addCriterion("mg in", values, "mg");
            return (Criteria) this;
        }

        public Criteria andMgNotIn(List<String> values) {
            addCriterion("mg not in", values, "mg");
            return (Criteria) this;
        }

        public Criteria andMgBetween(String value1, String value2) {
            addCriterion("mg between", value1, value2, "mg");
            return (Criteria) this;
        }

        public Criteria andMgNotBetween(String value1, String value2) {
            addCriterion("mg not between", value1, value2, "mg");
            return (Criteria) this;
        }

        public Criteria andCkIsNull() {
            addCriterion("ck is null");
            return (Criteria) this;
        }

        public Criteria andCkIsNotNull() {
            addCriterion("ck is not null");
            return (Criteria) this;
        }

        public Criteria andCkEqualTo(String value) {
            addCriterion("ck =", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkNotEqualTo(String value) {
            addCriterion("ck <>", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkGreaterThan(String value) {
            addCriterion("ck >", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkGreaterThanOrEqualTo(String value) {
            addCriterion("ck >=", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkLessThan(String value) {
            addCriterion("ck <", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkLessThanOrEqualTo(String value) {
            addCriterion("ck <=", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkLike(String value) {
            addCriterion("ck like", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkNotLike(String value) {
            addCriterion("ck not like", value, "ck");
            return (Criteria) this;
        }

        public Criteria andCkIn(List<String> values) {
            addCriterion("ck in", values, "ck");
            return (Criteria) this;
        }

        public Criteria andCkNotIn(List<String> values) {
            addCriterion("ck not in", values, "ck");
            return (Criteria) this;
        }

        public Criteria andCkBetween(String value1, String value2) {
            addCriterion("ck between", value1, value2, "ck");
            return (Criteria) this;
        }

        public Criteria andCkNotBetween(String value1, String value2) {
            addCriterion("ck not between", value1, value2, "ck");
            return (Criteria) this;
        }

        public Criteria andLdhIsNull() {
            addCriterion("ldh is null");
            return (Criteria) this;
        }

        public Criteria andLdhIsNotNull() {
            addCriterion("ldh is not null");
            return (Criteria) this;
        }

        public Criteria andLdhEqualTo(String value) {
            addCriterion("ldh =", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhNotEqualTo(String value) {
            addCriterion("ldh <>", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhGreaterThan(String value) {
            addCriterion("ldh >", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhGreaterThanOrEqualTo(String value) {
            addCriterion("ldh >=", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhLessThan(String value) {
            addCriterion("ldh <", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhLessThanOrEqualTo(String value) {
            addCriterion("ldh <=", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhLike(String value) {
            addCriterion("ldh like", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhNotLike(String value) {
            addCriterion("ldh not like", value, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhIn(List<String> values) {
            addCriterion("ldh in", values, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhNotIn(List<String> values) {
            addCriterion("ldh not in", values, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhBetween(String value1, String value2) {
            addCriterion("ldh between", value1, value2, "ldh");
            return (Criteria) this;
        }

        public Criteria andLdhNotBetween(String value1, String value2) {
            addCriterion("ldh not between", value1, value2, "ldh");
            return (Criteria) this;
        }

        public Criteria andAhbdhIsNull() {
            addCriterion("ahbdh is null");
            return (Criteria) this;
        }

        public Criteria andAhbdhIsNotNull() {
            addCriterion("ahbdh is not null");
            return (Criteria) this;
        }

        public Criteria andAhbdhEqualTo(String value) {
            addCriterion("ahbdh =", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhNotEqualTo(String value) {
            addCriterion("ahbdh <>", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhGreaterThan(String value) {
            addCriterion("ahbdh >", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhGreaterThanOrEqualTo(String value) {
            addCriterion("ahbdh >=", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhLessThan(String value) {
            addCriterion("ahbdh <", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhLessThanOrEqualTo(String value) {
            addCriterion("ahbdh <=", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhLike(String value) {
            addCriterion("ahbdh like", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhNotLike(String value) {
            addCriterion("ahbdh not like", value, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhIn(List<String> values) {
            addCriterion("ahbdh in", values, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhNotIn(List<String> values) {
            addCriterion("ahbdh not in", values, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhBetween(String value1, String value2) {
            addCriterion("ahbdh between", value1, value2, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andAhbdhNotBetween(String value1, String value2) {
            addCriterion("ahbdh not between", value1, value2, "ahbdh");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeIsNull() {
            addCriterion("creatine_kinase_isoenzyme is null");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeIsNotNull() {
            addCriterion("creatine_kinase_isoenzyme is not null");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeEqualTo(String value) {
            addCriterion("creatine_kinase_isoenzyme =", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeNotEqualTo(String value) {
            addCriterion("creatine_kinase_isoenzyme <>", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeGreaterThan(String value) {
            addCriterion("creatine_kinase_isoenzyme >", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeGreaterThanOrEqualTo(String value) {
            addCriterion("creatine_kinase_isoenzyme >=", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeLessThan(String value) {
            addCriterion("creatine_kinase_isoenzyme <", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeLessThanOrEqualTo(String value) {
            addCriterion("creatine_kinase_isoenzyme <=", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeLike(String value) {
            addCriterion("creatine_kinase_isoenzyme like", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeNotLike(String value) {
            addCriterion("creatine_kinase_isoenzyme not like", value, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeIn(List<String> values) {
            addCriterion("creatine_kinase_isoenzyme in", values, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeNotIn(List<String> values) {
            addCriterion("creatine_kinase_isoenzyme not in", values, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeBetween(String value1, String value2) {
            addCriterion("creatine_kinase_isoenzyme between", value1, value2, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andCreatineKinaseIsoenzymeNotBetween(String value1, String value2) {
            addCriterion("creatine_kinase_isoenzyme not between", value1, value2, "creatineKinaseIsoenzyme");
            return (Criteria) this;
        }

        public Criteria andTcIsNull() {
            addCriterion("tc is null");
            return (Criteria) this;
        }

        public Criteria andTcIsNotNull() {
            addCriterion("tc is not null");
            return (Criteria) this;
        }

        public Criteria andTcEqualTo(String value) {
            addCriterion("tc =", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotEqualTo(String value) {
            addCriterion("tc <>", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThan(String value) {
            addCriterion("tc >", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThanOrEqualTo(String value) {
            addCriterion("tc >=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThan(String value) {
            addCriterion("tc <", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThanOrEqualTo(String value) {
            addCriterion("tc <=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLike(String value) {
            addCriterion("tc like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotLike(String value) {
            addCriterion("tc not like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcIn(List<String> values) {
            addCriterion("tc in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotIn(List<String> values) {
            addCriterion("tc not in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcBetween(String value1, String value2) {
            addCriterion("tc between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotBetween(String value1, String value2) {
            addCriterion("tc not between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andTgIsNull() {
            addCriterion("tg is null");
            return (Criteria) this;
        }

        public Criteria andTgIsNotNull() {
            addCriterion("tg is not null");
            return (Criteria) this;
        }

        public Criteria andTgEqualTo(String value) {
            addCriterion("tg =", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotEqualTo(String value) {
            addCriterion("tg <>", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgGreaterThan(String value) {
            addCriterion("tg >", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgGreaterThanOrEqualTo(String value) {
            addCriterion("tg >=", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgLessThan(String value) {
            addCriterion("tg <", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgLessThanOrEqualTo(String value) {
            addCriterion("tg <=", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgLike(String value) {
            addCriterion("tg like", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotLike(String value) {
            addCriterion("tg not like", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgIn(List<String> values) {
            addCriterion("tg in", values, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotIn(List<String> values) {
            addCriterion("tg not in", values, "tg");
            return (Criteria) this;
        }

        public Criteria andTgBetween(String value1, String value2) {
            addCriterion("tg between", value1, value2, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotBetween(String value1, String value2) {
            addCriterion("tg not between", value1, value2, "tg");
            return (Criteria) this;
        }

        public Criteria andHdlcIsNull() {
            addCriterion("hdlc is null");
            return (Criteria) this;
        }

        public Criteria andHdlcIsNotNull() {
            addCriterion("hdlc is not null");
            return (Criteria) this;
        }

        public Criteria andHdlcEqualTo(String value) {
            addCriterion("hdlc =", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcNotEqualTo(String value) {
            addCriterion("hdlc <>", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcGreaterThan(String value) {
            addCriterion("hdlc >", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcGreaterThanOrEqualTo(String value) {
            addCriterion("hdlc >=", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcLessThan(String value) {
            addCriterion("hdlc <", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcLessThanOrEqualTo(String value) {
            addCriterion("hdlc <=", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcLike(String value) {
            addCriterion("hdlc like", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcNotLike(String value) {
            addCriterion("hdlc not like", value, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcIn(List<String> values) {
            addCriterion("hdlc in", values, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcNotIn(List<String> values) {
            addCriterion("hdlc not in", values, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcBetween(String value1, String value2) {
            addCriterion("hdlc between", value1, value2, "hdlc");
            return (Criteria) this;
        }

        public Criteria andHdlcNotBetween(String value1, String value2) {
            addCriterion("hdlc not between", value1, value2, "hdlc");
            return (Criteria) this;
        }

        public Criteria andLdlcIsNull() {
            addCriterion("ldlc is null");
            return (Criteria) this;
        }

        public Criteria andLdlcIsNotNull() {
            addCriterion("ldlc is not null");
            return (Criteria) this;
        }

        public Criteria andLdlcEqualTo(String value) {
            addCriterion("ldlc =", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcNotEqualTo(String value) {
            addCriterion("ldlc <>", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcGreaterThan(String value) {
            addCriterion("ldlc >", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcGreaterThanOrEqualTo(String value) {
            addCriterion("ldlc >=", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcLessThan(String value) {
            addCriterion("ldlc <", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcLessThanOrEqualTo(String value) {
            addCriterion("ldlc <=", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcLike(String value) {
            addCriterion("ldlc like", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcNotLike(String value) {
            addCriterion("ldlc not like", value, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcIn(List<String> values) {
            addCriterion("ldlc in", values, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcNotIn(List<String> values) {
            addCriterion("ldlc not in", values, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcBetween(String value1, String value2) {
            addCriterion("ldlc between", value1, value2, "ldlc");
            return (Criteria) this;
        }

        public Criteria andLdlcNotBetween(String value1, String value2) {
            addCriterion("ldlc not between", value1, value2, "ldlc");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1IsNull() {
            addCriterion("apolipoprotein_a1 is null");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1IsNotNull() {
            addCriterion("apolipoprotein_a1 is not null");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1EqualTo(String value) {
            addCriterion("apolipoprotein_a1 =", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1NotEqualTo(String value) {
            addCriterion("apolipoprotein_a1 <>", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1GreaterThan(String value) {
            addCriterion("apolipoprotein_a1 >", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1GreaterThanOrEqualTo(String value) {
            addCriterion("apolipoprotein_a1 >=", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1LessThan(String value) {
            addCriterion("apolipoprotein_a1 <", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1LessThanOrEqualTo(String value) {
            addCriterion("apolipoprotein_a1 <=", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1Like(String value) {
            addCriterion("apolipoprotein_a1 like", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1NotLike(String value) {
            addCriterion("apolipoprotein_a1 not like", value, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1In(List<String> values) {
            addCriterion("apolipoprotein_a1 in", values, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1NotIn(List<String> values) {
            addCriterion("apolipoprotein_a1 not in", values, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1Between(String value1, String value2) {
            addCriterion("apolipoprotein_a1 between", value1, value2, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinA1NotBetween(String value1, String value2) {
            addCriterion("apolipoprotein_a1 not between", value1, value2, "apolipoproteinA1");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBIsNull() {
            addCriterion("apolipoprotein_b is null");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBIsNotNull() {
            addCriterion("apolipoprotein_b is not null");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBEqualTo(String value) {
            addCriterion("apolipoprotein_b =", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBNotEqualTo(String value) {
            addCriterion("apolipoprotein_b <>", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBGreaterThan(String value) {
            addCriterion("apolipoprotein_b >", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBGreaterThanOrEqualTo(String value) {
            addCriterion("apolipoprotein_b >=", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBLessThan(String value) {
            addCriterion("apolipoprotein_b <", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBLessThanOrEqualTo(String value) {
            addCriterion("apolipoprotein_b <=", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBLike(String value) {
            addCriterion("apolipoprotein_b like", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBNotLike(String value) {
            addCriterion("apolipoprotein_b not like", value, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBIn(List<String> values) {
            addCriterion("apolipoprotein_b in", values, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBNotIn(List<String> values) {
            addCriterion("apolipoprotein_b not in", values, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBBetween(String value1, String value2) {
            addCriterion("apolipoprotein_b between", value1, value2, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinBNotBetween(String value1, String value2) {
            addCriterion("apolipoprotein_b not between", value1, value2, "apolipoproteinB");
            return (Criteria) this;
        }

        public Criteria andLpaIsNull() {
            addCriterion("lpa is null");
            return (Criteria) this;
        }

        public Criteria andLpaIsNotNull() {
            addCriterion("lpa is not null");
            return (Criteria) this;
        }

        public Criteria andLpaEqualTo(String value) {
            addCriterion("lpa =", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaNotEqualTo(String value) {
            addCriterion("lpa <>", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaGreaterThan(String value) {
            addCriterion("lpa >", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaGreaterThanOrEqualTo(String value) {
            addCriterion("lpa >=", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaLessThan(String value) {
            addCriterion("lpa <", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaLessThanOrEqualTo(String value) {
            addCriterion("lpa <=", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaLike(String value) {
            addCriterion("lpa like", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaNotLike(String value) {
            addCriterion("lpa not like", value, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaIn(List<String> values) {
            addCriterion("lpa in", values, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaNotIn(List<String> values) {
            addCriterion("lpa not in", values, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaBetween(String value1, String value2) {
            addCriterion("lpa between", value1, value2, "lpa");
            return (Criteria) this;
        }

        public Criteria andLpaNotBetween(String value1, String value2) {
            addCriterion("lpa not between", value1, value2, "lpa");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinEIsNull() {
            addCriterion("apolipoprotein_e is null");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinEIsNotNull() {
            addCriterion("apolipoprotein_e is not null");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinEEqualTo(String value) {
            addCriterion("apolipoprotein_e =", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinENotEqualTo(String value) {
            addCriterion("apolipoprotein_e <>", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinEGreaterThan(String value) {
            addCriterion("apolipoprotein_e >", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinEGreaterThanOrEqualTo(String value) {
            addCriterion("apolipoprotein_e >=", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinELessThan(String value) {
            addCriterion("apolipoprotein_e <", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinELessThanOrEqualTo(String value) {
            addCriterion("apolipoprotein_e <=", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinELike(String value) {
            addCriterion("apolipoprotein_e like", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinENotLike(String value) {
            addCriterion("apolipoprotein_e not like", value, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinEIn(List<String> values) {
            addCriterion("apolipoprotein_e in", values, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinENotIn(List<String> values) {
            addCriterion("apolipoprotein_e not in", values, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinEBetween(String value1, String value2) {
            addCriterion("apolipoprotein_e between", value1, value2, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andApolipoproteinENotBetween(String value1, String value2) {
            addCriterion("apolipoprotein_e not between", value1, value2, "apolipoproteinE");
            return (Criteria) this;
        }

        public Criteria andPaIsNull() {
            addCriterion("pa is null");
            return (Criteria) this;
        }

        public Criteria andPaIsNotNull() {
            addCriterion("pa is not null");
            return (Criteria) this;
        }

        public Criteria andPaEqualTo(String value) {
            addCriterion("pa =", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotEqualTo(String value) {
            addCriterion("pa <>", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaGreaterThan(String value) {
            addCriterion("pa >", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaGreaterThanOrEqualTo(String value) {
            addCriterion("pa >=", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaLessThan(String value) {
            addCriterion("pa <", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaLessThanOrEqualTo(String value) {
            addCriterion("pa <=", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaLike(String value) {
            addCriterion("pa like", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotLike(String value) {
            addCriterion("pa not like", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaIn(List<String> values) {
            addCriterion("pa in", values, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotIn(List<String> values) {
            addCriterion("pa not in", values, "pa");
            return (Criteria) this;
        }

        public Criteria andPaBetween(String value1, String value2) {
            addCriterion("pa between", value1, value2, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotBetween(String value1, String value2) {
            addCriterion("pa not between", value1, value2, "pa");
            return (Criteria) this;
        }

        public Criteria andAdaIsNull() {
            addCriterion("ada is null");
            return (Criteria) this;
        }

        public Criteria andAdaIsNotNull() {
            addCriterion("ada is not null");
            return (Criteria) this;
        }

        public Criteria andAdaEqualTo(String value) {
            addCriterion("ada =", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaNotEqualTo(String value) {
            addCriterion("ada <>", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaGreaterThan(String value) {
            addCriterion("ada >", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaGreaterThanOrEqualTo(String value) {
            addCriterion("ada >=", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaLessThan(String value) {
            addCriterion("ada <", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaLessThanOrEqualTo(String value) {
            addCriterion("ada <=", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaLike(String value) {
            addCriterion("ada like", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaNotLike(String value) {
            addCriterion("ada not like", value, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaIn(List<String> values) {
            addCriterion("ada in", values, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaNotIn(List<String> values) {
            addCriterion("ada not in", values, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaBetween(String value1, String value2) {
            addCriterion("ada between", value1, value2, "ada");
            return (Criteria) this;
        }

        public Criteria andAdaNotBetween(String value1, String value2) {
            addCriterion("ada not between", value1, value2, "ada");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2IsNull() {
            addCriterion("microglobulin_b2 is null");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2IsNotNull() {
            addCriterion("microglobulin_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2EqualTo(String value) {
            addCriterion("microglobulin_b2 =", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2NotEqualTo(String value) {
            addCriterion("microglobulin_b2 <>", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2GreaterThan(String value) {
            addCriterion("microglobulin_b2 >", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2GreaterThanOrEqualTo(String value) {
            addCriterion("microglobulin_b2 >=", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2LessThan(String value) {
            addCriterion("microglobulin_b2 <", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2LessThanOrEqualTo(String value) {
            addCriterion("microglobulin_b2 <=", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2Like(String value) {
            addCriterion("microglobulin_b2 like", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2NotLike(String value) {
            addCriterion("microglobulin_b2 not like", value, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2In(List<String> values) {
            addCriterion("microglobulin_b2 in", values, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2NotIn(List<String> values) {
            addCriterion("microglobulin_b2 not in", values, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2Between(String value1, String value2) {
            addCriterion("microglobulin_b2 between", value1, value2, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andMicroglobulinB2NotBetween(String value1, String value2) {
            addCriterion("microglobulin_b2 not between", value1, value2, "microglobulinB2");
            return (Criteria) this;
        }

        public Criteria andAfuIsNull() {
            addCriterion("afu is null");
            return (Criteria) this;
        }

        public Criteria andAfuIsNotNull() {
            addCriterion("afu is not null");
            return (Criteria) this;
        }

        public Criteria andAfuEqualTo(String value) {
            addCriterion("afu =", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuNotEqualTo(String value) {
            addCriterion("afu <>", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuGreaterThan(String value) {
            addCriterion("afu >", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuGreaterThanOrEqualTo(String value) {
            addCriterion("afu >=", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuLessThan(String value) {
            addCriterion("afu <", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuLessThanOrEqualTo(String value) {
            addCriterion("afu <=", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuLike(String value) {
            addCriterion("afu like", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuNotLike(String value) {
            addCriterion("afu not like", value, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuIn(List<String> values) {
            addCriterion("afu in", values, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuNotIn(List<String> values) {
            addCriterion("afu not in", values, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuBetween(String value1, String value2) {
            addCriterion("afu between", value1, value2, "afu");
            return (Criteria) this;
        }

        public Criteria andAfuNotBetween(String value1, String value2) {
            addCriterion("afu not between", value1, value2, "afu");
            return (Criteria) this;
        }

        public Criteria andCystatinIsNull() {
            addCriterion("cystatin is null");
            return (Criteria) this;
        }

        public Criteria andCystatinIsNotNull() {
            addCriterion("cystatin is not null");
            return (Criteria) this;
        }

        public Criteria andCystatinEqualTo(String value) {
            addCriterion("cystatin =", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinNotEqualTo(String value) {
            addCriterion("cystatin <>", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinGreaterThan(String value) {
            addCriterion("cystatin >", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinGreaterThanOrEqualTo(String value) {
            addCriterion("cystatin >=", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinLessThan(String value) {
            addCriterion("cystatin <", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinLessThanOrEqualTo(String value) {
            addCriterion("cystatin <=", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinLike(String value) {
            addCriterion("cystatin like", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinNotLike(String value) {
            addCriterion("cystatin not like", value, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinIn(List<String> values) {
            addCriterion("cystatin in", values, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinNotIn(List<String> values) {
            addCriterion("cystatin not in", values, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinBetween(String value1, String value2) {
            addCriterion("cystatin between", value1, value2, "cystatin");
            return (Criteria) this;
        }

        public Criteria andCystatinNotBetween(String value1, String value2) {
            addCriterion("cystatin not between", value1, value2, "cystatin");
            return (Criteria) this;
        }

        public Criteria andNt5IsNull() {
            addCriterion("nt5 is null");
            return (Criteria) this;
        }

        public Criteria andNt5IsNotNull() {
            addCriterion("nt5 is not null");
            return (Criteria) this;
        }

        public Criteria andNt5EqualTo(String value) {
            addCriterion("nt5 =", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5NotEqualTo(String value) {
            addCriterion("nt5 <>", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5GreaterThan(String value) {
            addCriterion("nt5 >", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5GreaterThanOrEqualTo(String value) {
            addCriterion("nt5 >=", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5LessThan(String value) {
            addCriterion("nt5 <", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5LessThanOrEqualTo(String value) {
            addCriterion("nt5 <=", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5Like(String value) {
            addCriterion("nt5 like", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5NotLike(String value) {
            addCriterion("nt5 not like", value, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5In(List<String> values) {
            addCriterion("nt5 in", values, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5NotIn(List<String> values) {
            addCriterion("nt5 not in", values, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5Between(String value1, String value2) {
            addCriterion("nt5 between", value1, value2, "nt5");
            return (Criteria) this;
        }

        public Criteria andNt5NotBetween(String value1, String value2) {
            addCriterion("nt5 not between", value1, value2, "nt5");
            return (Criteria) this;
        }

        public Criteria andHscrpIsNull() {
            addCriterion("hscrp is null");
            return (Criteria) this;
        }

        public Criteria andHscrpIsNotNull() {
            addCriterion("hscrp is not null");
            return (Criteria) this;
        }

        public Criteria andHscrpEqualTo(String value) {
            addCriterion("hscrp =", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpNotEqualTo(String value) {
            addCriterion("hscrp <>", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpGreaterThan(String value) {
            addCriterion("hscrp >", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpGreaterThanOrEqualTo(String value) {
            addCriterion("hscrp >=", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpLessThan(String value) {
            addCriterion("hscrp <", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpLessThanOrEqualTo(String value) {
            addCriterion("hscrp <=", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpLike(String value) {
            addCriterion("hscrp like", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpNotLike(String value) {
            addCriterion("hscrp not like", value, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpIn(List<String> values) {
            addCriterion("hscrp in", values, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpNotIn(List<String> values) {
            addCriterion("hscrp not in", values, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpBetween(String value1, String value2) {
            addCriterion("hscrp between", value1, value2, "hscrp");
            return (Criteria) this;
        }

        public Criteria andHscrpNotBetween(String value1, String value2) {
            addCriterion("hscrp not between", value1, value2, "hscrp");
            return (Criteria) this;
        }

        public Criteria andBhbIsNull() {
            addCriterion("bhb is null");
            return (Criteria) this;
        }

        public Criteria andBhbIsNotNull() {
            addCriterion("bhb is not null");
            return (Criteria) this;
        }

        public Criteria andBhbEqualTo(String value) {
            addCriterion("bhb =", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbNotEqualTo(String value) {
            addCriterion("bhb <>", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbGreaterThan(String value) {
            addCriterion("bhb >", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbGreaterThanOrEqualTo(String value) {
            addCriterion("bhb >=", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbLessThan(String value) {
            addCriterion("bhb <", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbLessThanOrEqualTo(String value) {
            addCriterion("bhb <=", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbLike(String value) {
            addCriterion("bhb like", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbNotLike(String value) {
            addCriterion("bhb not like", value, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbIn(List<String> values) {
            addCriterion("bhb in", values, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbNotIn(List<String> values) {
            addCriterion("bhb not in", values, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbBetween(String value1, String value2) {
            addCriterion("bhb between", value1, value2, "bhb");
            return (Criteria) this;
        }

        public Criteria andBhbNotBetween(String value1, String value2) {
            addCriterion("bhb not between", value1, value2, "bhb");
            return (Criteria) this;
        }

        public Criteria andMaoIsNull() {
            addCriterion("mao is null");
            return (Criteria) this;
        }

        public Criteria andMaoIsNotNull() {
            addCriterion("mao is not null");
            return (Criteria) this;
        }

        public Criteria andMaoEqualTo(String value) {
            addCriterion("mao =", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoNotEqualTo(String value) {
            addCriterion("mao <>", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoGreaterThan(String value) {
            addCriterion("mao >", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoGreaterThanOrEqualTo(String value) {
            addCriterion("mao >=", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoLessThan(String value) {
            addCriterion("mao <", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoLessThanOrEqualTo(String value) {
            addCriterion("mao <=", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoLike(String value) {
            addCriterion("mao like", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoNotLike(String value) {
            addCriterion("mao not like", value, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoIn(List<String> values) {
            addCriterion("mao in", values, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoNotIn(List<String> values) {
            addCriterion("mao not in", values, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoBetween(String value1, String value2) {
            addCriterion("mao between", value1, value2, "mao");
            return (Criteria) this;
        }

        public Criteria andMaoNotBetween(String value1, String value2) {
            addCriterion("mao not between", value1, value2, "mao");
            return (Criteria) this;
        }

        public Criteria andSialicAcidIsNull() {
            addCriterion("sialic_acid is null");
            return (Criteria) this;
        }

        public Criteria andSialicAcidIsNotNull() {
            addCriterion("sialic_acid is not null");
            return (Criteria) this;
        }

        public Criteria andSialicAcidEqualTo(String value) {
            addCriterion("sialic_acid =", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidNotEqualTo(String value) {
            addCriterion("sialic_acid <>", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidGreaterThan(String value) {
            addCriterion("sialic_acid >", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidGreaterThanOrEqualTo(String value) {
            addCriterion("sialic_acid >=", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidLessThan(String value) {
            addCriterion("sialic_acid <", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidLessThanOrEqualTo(String value) {
            addCriterion("sialic_acid <=", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidLike(String value) {
            addCriterion("sialic_acid like", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidNotLike(String value) {
            addCriterion("sialic_acid not like", value, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidIn(List<String> values) {
            addCriterion("sialic_acid in", values, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidNotIn(List<String> values) {
            addCriterion("sialic_acid not in", values, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidBetween(String value1, String value2) {
            addCriterion("sialic_acid between", value1, value2, "sialicAcid");
            return (Criteria) this;
        }

        public Criteria andSialicAcidNotBetween(String value1, String value2) {
            addCriterion("sialic_acid not between", value1, value2, "sialicAcid");
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