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

public class PdDPatientOutpatientEvaluationExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDPatientOutpatientEvaluationExample() {
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
        return PdDPatientOutpatientEvaluationColumnEnum.values();
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

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBmiIsNull() {
            addCriterion("bmi is null");
            return (Criteria) this;
        }

        public Criteria andBmiIsNotNull() {
            addCriterion("bmi is not null");
            return (Criteria) this;
        }

        public Criteria andBmiEqualTo(String value) {
            addCriterion("bmi =", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotEqualTo(String value) {
            addCriterion("bmi <>", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThan(String value) {
            addCriterion("bmi >", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThanOrEqualTo(String value) {
            addCriterion("bmi >=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThan(String value) {
            addCriterion("bmi <", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThanOrEqualTo(String value) {
            addCriterion("bmi <=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLike(String value) {
            addCriterion("bmi like", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotLike(String value) {
            addCriterion("bmi not like", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiIn(List<String> values) {
            addCriterion("bmi in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotIn(List<String> values) {
            addCriterion("bmi not in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiBetween(String value1, String value2) {
            addCriterion("bmi between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotBetween(String value1, String value2) {
            addCriterion("bmi not between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNull() {
            addCriterion("blood_pressure is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNotNull() {
            addCriterion("blood_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureEqualTo(String value) {
            addCriterion("blood_pressure =", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotEqualTo(String value) {
            addCriterion("blood_pressure <>", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThan(String value) {
            addCriterion("blood_pressure >", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThanOrEqualTo(String value) {
            addCriterion("blood_pressure >=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThan(String value) {
            addCriterion("blood_pressure <", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThanOrEqualTo(String value) {
            addCriterion("blood_pressure <=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLike(String value) {
            addCriterion("blood_pressure like", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotLike(String value) {
            addCriterion("blood_pressure not like", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIn(List<String> values) {
            addCriterion("blood_pressure in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotIn(List<String> values) {
            addCriterion("blood_pressure not in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureBetween(String value1, String value2) {
            addCriterion("blood_pressure between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotBetween(String value1, String value2) {
            addCriterion("blood_pressure not between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationIsNull() {
            addCriterion("ultrafiltration is null");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationIsNotNull() {
            addCriterion("ultrafiltration is not null");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationEqualTo(String value) {
            addCriterion("ultrafiltration =", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationNotEqualTo(String value) {
            addCriterion("ultrafiltration <>", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationGreaterThan(String value) {
            addCriterion("ultrafiltration >", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationGreaterThanOrEqualTo(String value) {
            addCriterion("ultrafiltration >=", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationLessThan(String value) {
            addCriterion("ultrafiltration <", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationLessThanOrEqualTo(String value) {
            addCriterion("ultrafiltration <=", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationLike(String value) {
            addCriterion("ultrafiltration like", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationNotLike(String value) {
            addCriterion("ultrafiltration not like", value, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationIn(List<String> values) {
            addCriterion("ultrafiltration in", values, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationNotIn(List<String> values) {
            addCriterion("ultrafiltration not in", values, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationBetween(String value1, String value2) {
            addCriterion("ultrafiltration between", value1, value2, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUltrafiltrationNotBetween(String value1, String value2) {
            addCriterion("ultrafiltration not between", value1, value2, "ultrafiltration");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionIsNull() {
            addCriterion("urunary_production is null");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionIsNotNull() {
            addCriterion("urunary_production is not null");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionEqualTo(String value) {
            addCriterion("urunary_production =", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionNotEqualTo(String value) {
            addCriterion("urunary_production <>", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionGreaterThan(String value) {
            addCriterion("urunary_production >", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionGreaterThanOrEqualTo(String value) {
            addCriterion("urunary_production >=", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionLessThan(String value) {
            addCriterion("urunary_production <", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionLessThanOrEqualTo(String value) {
            addCriterion("urunary_production <=", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionLike(String value) {
            addCriterion("urunary_production like", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionNotLike(String value) {
            addCriterion("urunary_production not like", value, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionIn(List<String> values) {
            addCriterion("urunary_production in", values, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionNotIn(List<String> values) {
            addCriterion("urunary_production not in", values, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionBetween(String value1, String value2) {
            addCriterion("urunary_production between", value1, value2, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrunaryProductionNotBetween(String value1, String value2) {
            addCriterion("urunary_production not between", value1, value2, "urunaryProduction");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelIsNull() {
            addCriterion("cardiac_function_level is null");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelIsNotNull() {
            addCriterion("cardiac_function_level is not null");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelEqualTo(String value) {
            addCriterion("cardiac_function_level =", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelNotEqualTo(String value) {
            addCriterion("cardiac_function_level <>", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelGreaterThan(String value) {
            addCriterion("cardiac_function_level >", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cardiac_function_level >=", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelLessThan(String value) {
            addCriterion("cardiac_function_level <", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelLessThanOrEqualTo(String value) {
            addCriterion("cardiac_function_level <=", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelLike(String value) {
            addCriterion("cardiac_function_level like", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelNotLike(String value) {
            addCriterion("cardiac_function_level not like", value, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelIn(List<String> values) {
            addCriterion("cardiac_function_level in", values, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelNotIn(List<String> values) {
            addCriterion("cardiac_function_level not in", values, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelBetween(String value1, String value2) {
            addCriterion("cardiac_function_level between", value1, value2, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andCardiacFunctionLevelNotBetween(String value1, String value2) {
            addCriterion("cardiac_function_level not between", value1, value2, "cardiacFunctionLevel");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeIsNull() {
            addCriterion("edema_grade is null");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeIsNotNull() {
            addCriterion("edema_grade is not null");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeEqualTo(String value) {
            addCriterion("edema_grade =", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeNotEqualTo(String value) {
            addCriterion("edema_grade <>", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeGreaterThan(String value) {
            addCriterion("edema_grade >", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeGreaterThanOrEqualTo(String value) {
            addCriterion("edema_grade >=", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeLessThan(String value) {
            addCriterion("edema_grade <", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeLessThanOrEqualTo(String value) {
            addCriterion("edema_grade <=", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeLike(String value) {
            addCriterion("edema_grade like", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeNotLike(String value) {
            addCriterion("edema_grade not like", value, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeIn(List<String> values) {
            addCriterion("edema_grade in", values, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeNotIn(List<String> values) {
            addCriterion("edema_grade not in", values, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeBetween(String value1, String value2) {
            addCriterion("edema_grade between", value1, value2, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andEdemaGradeNotBetween(String value1, String value2) {
            addCriterion("edema_grade not between", value1, value2, "edemaGrade");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsIsNull() {
            addCriterion("alimentary_symptoms is null");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsIsNotNull() {
            addCriterion("alimentary_symptoms is not null");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsEqualTo(String value) {
            addCriterion("alimentary_symptoms =", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsNotEqualTo(String value) {
            addCriterion("alimentary_symptoms <>", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsGreaterThan(String value) {
            addCriterion("alimentary_symptoms >", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsGreaterThanOrEqualTo(String value) {
            addCriterion("alimentary_symptoms >=", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsLessThan(String value) {
            addCriterion("alimentary_symptoms <", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsLessThanOrEqualTo(String value) {
            addCriterion("alimentary_symptoms <=", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsLike(String value) {
            addCriterion("alimentary_symptoms like", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsNotLike(String value) {
            addCriterion("alimentary_symptoms not like", value, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsIn(List<String> values) {
            addCriterion("alimentary_symptoms in", values, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsNotIn(List<String> values) {
            addCriterion("alimentary_symptoms not in", values, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsBetween(String value1, String value2) {
            addCriterion("alimentary_symptoms between", value1, value2, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andAlimentarySymptomsNotBetween(String value1, String value2) {
            addCriterion("alimentary_symptoms not between", value1, value2, "alimentarySymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsIsNull() {
            addCriterion("other_symptoms is null");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsIsNotNull() {
            addCriterion("other_symptoms is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsEqualTo(String value) {
            addCriterion("other_symptoms =", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsNotEqualTo(String value) {
            addCriterion("other_symptoms <>", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsGreaterThan(String value) {
            addCriterion("other_symptoms >", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsGreaterThanOrEqualTo(String value) {
            addCriterion("other_symptoms >=", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsLessThan(String value) {
            addCriterion("other_symptoms <", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsLessThanOrEqualTo(String value) {
            addCriterion("other_symptoms <=", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsLike(String value) {
            addCriterion("other_symptoms like", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsNotLike(String value) {
            addCriterion("other_symptoms not like", value, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsIn(List<String> values) {
            addCriterion("other_symptoms in", values, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsNotIn(List<String> values) {
            addCriterion("other_symptoms not in", values, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsBetween(String value1, String value2) {
            addCriterion("other_symptoms between", value1, value2, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andOtherSymptomsNotBetween(String value1, String value2) {
            addCriterion("other_symptoms not between", value1, value2, "otherSymptoms");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentIsNull() {
            addCriterion("cather_out_assessment is null");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentIsNotNull() {
            addCriterion("cather_out_assessment is not null");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentEqualTo(String value) {
            addCriterion("cather_out_assessment =", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentNotEqualTo(String value) {
            addCriterion("cather_out_assessment <>", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentGreaterThan(String value) {
            addCriterion("cather_out_assessment >", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentGreaterThanOrEqualTo(String value) {
            addCriterion("cather_out_assessment >=", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentLessThan(String value) {
            addCriterion("cather_out_assessment <", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentLessThanOrEqualTo(String value) {
            addCriterion("cather_out_assessment <=", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentLike(String value) {
            addCriterion("cather_out_assessment like", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentNotLike(String value) {
            addCriterion("cather_out_assessment not like", value, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentIn(List<String> values) {
            addCriterion("cather_out_assessment in", values, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentNotIn(List<String> values) {
            addCriterion("cather_out_assessment not in", values, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentBetween(String value1, String value2) {
            addCriterion("cather_out_assessment between", value1, value2, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutAssessmentNotBetween(String value1, String value2) {
            addCriterion("cather_out_assessment not between", value1, value2, "catherOutAssessment");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreIsNull() {
            addCriterion("cather_out_score is null");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreIsNotNull() {
            addCriterion("cather_out_score is not null");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreEqualTo(String value) {
            addCriterion("cather_out_score =", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreNotEqualTo(String value) {
            addCriterion("cather_out_score <>", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreGreaterThan(String value) {
            addCriterion("cather_out_score >", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreGreaterThanOrEqualTo(String value) {
            addCriterion("cather_out_score >=", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreLessThan(String value) {
            addCriterion("cather_out_score <", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreLessThanOrEqualTo(String value) {
            addCriterion("cather_out_score <=", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreLike(String value) {
            addCriterion("cather_out_score like", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreNotLike(String value) {
            addCriterion("cather_out_score not like", value, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreIn(List<String> values) {
            addCriterion("cather_out_score in", values, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreNotIn(List<String> values) {
            addCriterion("cather_out_score not in", values, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreBetween(String value1, String value2) {
            addCriterion("cather_out_score between", value1, value2, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andCatherOutScoreNotBetween(String value1, String value2) {
            addCriterion("cather_out_score not between", value1, value2, "catherOutScore");
            return (Criteria) this;
        }

        public Criteria andWeightChangeIsNull() {
            addCriterion("weight_change is null");
            return (Criteria) this;
        }

        public Criteria andWeightChangeIsNotNull() {
            addCriterion("weight_change is not null");
            return (Criteria) this;
        }

        public Criteria andWeightChangeEqualTo(String value) {
            addCriterion("weight_change =", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeNotEqualTo(String value) {
            addCriterion("weight_change <>", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeGreaterThan(String value) {
            addCriterion("weight_change >", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeGreaterThanOrEqualTo(String value) {
            addCriterion("weight_change >=", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeLessThan(String value) {
            addCriterion("weight_change <", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeLessThanOrEqualTo(String value) {
            addCriterion("weight_change <=", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeLike(String value) {
            addCriterion("weight_change like", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeNotLike(String value) {
            addCriterion("weight_change not like", value, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeIn(List<String> values) {
            addCriterion("weight_change in", values, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeNotIn(List<String> values) {
            addCriterion("weight_change not in", values, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeBetween(String value1, String value2) {
            addCriterion("weight_change between", value1, value2, "weightChange");
            return (Criteria) this;
        }

        public Criteria andWeightChangeNotBetween(String value1, String value2) {
            addCriterion("weight_change not between", value1, value2, "weightChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeIsNull() {
            addCriterion("diet_change is null");
            return (Criteria) this;
        }

        public Criteria andDietChangeIsNotNull() {
            addCriterion("diet_change is not null");
            return (Criteria) this;
        }

        public Criteria andDietChangeEqualTo(String value) {
            addCriterion("diet_change =", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeNotEqualTo(String value) {
            addCriterion("diet_change <>", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeGreaterThan(String value) {
            addCriterion("diet_change >", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeGreaterThanOrEqualTo(String value) {
            addCriterion("diet_change >=", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeLessThan(String value) {
            addCriterion("diet_change <", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeLessThanOrEqualTo(String value) {
            addCriterion("diet_change <=", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeLike(String value) {
            addCriterion("diet_change like", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeNotLike(String value) {
            addCriterion("diet_change not like", value, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeIn(List<String> values) {
            addCriterion("diet_change in", values, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeNotIn(List<String> values) {
            addCriterion("diet_change not in", values, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeBetween(String value1, String value2) {
            addCriterion("diet_change between", value1, value2, "dietChange");
            return (Criteria) this;
        }

        public Criteria andDietChangeNotBetween(String value1, String value2) {
            addCriterion("diet_change not between", value1, value2, "dietChange");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsIsNull() {
            addCriterion("gastrointestinal_symptoms is null");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsIsNotNull() {
            addCriterion("gastrointestinal_symptoms is not null");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsEqualTo(String value) {
            addCriterion("gastrointestinal_symptoms =", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsNotEqualTo(String value) {
            addCriterion("gastrointestinal_symptoms <>", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsGreaterThan(String value) {
            addCriterion("gastrointestinal_symptoms >", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsGreaterThanOrEqualTo(String value) {
            addCriterion("gastrointestinal_symptoms >=", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsLessThan(String value) {
            addCriterion("gastrointestinal_symptoms <", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsLessThanOrEqualTo(String value) {
            addCriterion("gastrointestinal_symptoms <=", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsLike(String value) {
            addCriterion("gastrointestinal_symptoms like", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsNotLike(String value) {
            addCriterion("gastrointestinal_symptoms not like", value, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsIn(List<String> values) {
            addCriterion("gastrointestinal_symptoms in", values, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsNotIn(List<String> values) {
            addCriterion("gastrointestinal_symptoms not in", values, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsBetween(String value1, String value2) {
            addCriterion("gastrointestinal_symptoms between", value1, value2, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andGastrointestinalSymptomsNotBetween(String value1, String value2) {
            addCriterion("gastrointestinal_symptoms not between", value1, value2, "gastrointestinalSymptoms");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityIsNull() {
            addCriterion("activity_ability is null");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityIsNotNull() {
            addCriterion("activity_ability is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityEqualTo(String value) {
            addCriterion("activity_ability =", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityNotEqualTo(String value) {
            addCriterion("activity_ability <>", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityGreaterThan(String value) {
            addCriterion("activity_ability >", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("activity_ability >=", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityLessThan(String value) {
            addCriterion("activity_ability <", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityLessThanOrEqualTo(String value) {
            addCriterion("activity_ability <=", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityLike(String value) {
            addCriterion("activity_ability like", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityNotLike(String value) {
            addCriterion("activity_ability not like", value, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityIn(List<String> values) {
            addCriterion("activity_ability in", values, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityNotIn(List<String> values) {
            addCriterion("activity_ability not in", values, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityBetween(String value1, String value2) {
            addCriterion("activity_ability between", value1, value2, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andActivityAbilityNotBetween(String value1, String value2) {
            addCriterion("activity_ability not between", value1, value2, "activityAbility");
            return (Criteria) this;
        }

        public Criteria andComplicationIsNull() {
            addCriterion("complication is null");
            return (Criteria) this;
        }

        public Criteria andComplicationIsNotNull() {
            addCriterion("complication is not null");
            return (Criteria) this;
        }

        public Criteria andComplicationEqualTo(String value) {
            addCriterion("complication =", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationNotEqualTo(String value) {
            addCriterion("complication <>", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationGreaterThan(String value) {
            addCriterion("complication >", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationGreaterThanOrEqualTo(String value) {
            addCriterion("complication >=", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationLessThan(String value) {
            addCriterion("complication <", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationLessThanOrEqualTo(String value) {
            addCriterion("complication <=", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationLike(String value) {
            addCriterion("complication like", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationNotLike(String value) {
            addCriterion("complication not like", value, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationIn(List<String> values) {
            addCriterion("complication in", values, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationNotIn(List<String> values) {
            addCriterion("complication not in", values, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationBetween(String value1, String value2) {
            addCriterion("complication between", value1, value2, "complication");
            return (Criteria) this;
        }

        public Criteria andComplicationNotBetween(String value1, String value2) {
            addCriterion("complication not between", value1, value2, "complication");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatIsNull() {
            addCriterion("subcutaneous_fat is null");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatIsNotNull() {
            addCriterion("subcutaneous_fat is not null");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatEqualTo(String value) {
            addCriterion("subcutaneous_fat =", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatNotEqualTo(String value) {
            addCriterion("subcutaneous_fat <>", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatGreaterThan(String value) {
            addCriterion("subcutaneous_fat >", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatGreaterThanOrEqualTo(String value) {
            addCriterion("subcutaneous_fat >=", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatLessThan(String value) {
            addCriterion("subcutaneous_fat <", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatLessThanOrEqualTo(String value) {
            addCriterion("subcutaneous_fat <=", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatLike(String value) {
            addCriterion("subcutaneous_fat like", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatNotLike(String value) {
            addCriterion("subcutaneous_fat not like", value, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatIn(List<String> values) {
            addCriterion("subcutaneous_fat in", values, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatNotIn(List<String> values) {
            addCriterion("subcutaneous_fat not in", values, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatBetween(String value1, String value2) {
            addCriterion("subcutaneous_fat between", value1, value2, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andSubcutaneousFatNotBetween(String value1, String value2) {
            addCriterion("subcutaneous_fat not between", value1, value2, "subcutaneousFat");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionIsNull() {
            addCriterion("muscle_consumption is null");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionIsNotNull() {
            addCriterion("muscle_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionEqualTo(String value) {
            addCriterion("muscle_consumption =", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionNotEqualTo(String value) {
            addCriterion("muscle_consumption <>", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionGreaterThan(String value) {
            addCriterion("muscle_consumption >", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionGreaterThanOrEqualTo(String value) {
            addCriterion("muscle_consumption >=", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionLessThan(String value) {
            addCriterion("muscle_consumption <", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionLessThanOrEqualTo(String value) {
            addCriterion("muscle_consumption <=", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionLike(String value) {
            addCriterion("muscle_consumption like", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionNotLike(String value) {
            addCriterion("muscle_consumption not like", value, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionIn(List<String> values) {
            addCriterion("muscle_consumption in", values, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionNotIn(List<String> values) {
            addCriterion("muscle_consumption not in", values, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionBetween(String value1, String value2) {
            addCriterion("muscle_consumption between", value1, value2, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andMuscleConsumptionNotBetween(String value1, String value2) {
            addCriterion("muscle_consumption not between", value1, value2, "muscleConsumption");
            return (Criteria) this;
        }

        public Criteria andSgaScoreIsNull() {
            addCriterion("sga_score is null");
            return (Criteria) this;
        }

        public Criteria andSgaScoreIsNotNull() {
            addCriterion("sga_score is not null");
            return (Criteria) this;
        }

        public Criteria andSgaScoreEqualTo(String value) {
            addCriterion("sga_score =", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreNotEqualTo(String value) {
            addCriterion("sga_score <>", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreGreaterThan(String value) {
            addCriterion("sga_score >", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreGreaterThanOrEqualTo(String value) {
            addCriterion("sga_score >=", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreLessThan(String value) {
            addCriterion("sga_score <", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreLessThanOrEqualTo(String value) {
            addCriterion("sga_score <=", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreLike(String value) {
            addCriterion("sga_score like", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreNotLike(String value) {
            addCriterion("sga_score not like", value, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreIn(List<String> values) {
            addCriterion("sga_score in", values, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreNotIn(List<String> values) {
            addCriterion("sga_score not in", values, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreBetween(String value1, String value2) {
            addCriterion("sga_score between", value1, value2, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaScoreNotBetween(String value1, String value2) {
            addCriterion("sga_score not between", value1, value2, "sgaScore");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentIsNull() {
            addCriterion("sga_assessment is null");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentIsNotNull() {
            addCriterion("sga_assessment is not null");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentEqualTo(String value) {
            addCriterion("sga_assessment =", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentNotEqualTo(String value) {
            addCriterion("sga_assessment <>", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentGreaterThan(String value) {
            addCriterion("sga_assessment >", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentGreaterThanOrEqualTo(String value) {
            addCriterion("sga_assessment >=", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentLessThan(String value) {
            addCriterion("sga_assessment <", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentLessThanOrEqualTo(String value) {
            addCriterion("sga_assessment <=", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentLike(String value) {
            addCriterion("sga_assessment like", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentNotLike(String value) {
            addCriterion("sga_assessment not like", value, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentIn(List<String> values) {
            addCriterion("sga_assessment in", values, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentNotIn(List<String> values) {
            addCriterion("sga_assessment not in", values, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentBetween(String value1, String value2) {
            addCriterion("sga_assessment between", value1, value2, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andSgaAssessmentNotBetween(String value1, String value2) {
            addCriterion("sga_assessment not between", value1, value2, "sgaAssessment");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisIsNull() {
            addCriterion("hemoglobin_analysis is null");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisIsNotNull() {
            addCriterion("hemoglobin_analysis is not null");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisEqualTo(String value) {
            addCriterion("hemoglobin_analysis =", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisNotEqualTo(String value) {
            addCriterion("hemoglobin_analysis <>", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisGreaterThan(String value) {
            addCriterion("hemoglobin_analysis >", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("hemoglobin_analysis >=", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisLessThan(String value) {
            addCriterion("hemoglobin_analysis <", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisLessThanOrEqualTo(String value) {
            addCriterion("hemoglobin_analysis <=", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisLike(String value) {
            addCriterion("hemoglobin_analysis like", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisNotLike(String value) {
            addCriterion("hemoglobin_analysis not like", value, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisIn(List<String> values) {
            addCriterion("hemoglobin_analysis in", values, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisNotIn(List<String> values) {
            addCriterion("hemoglobin_analysis not in", values, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisBetween(String value1, String value2) {
            addCriterion("hemoglobin_analysis between", value1, value2, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andHemoglobinAnalysisNotBetween(String value1, String value2) {
            addCriterion("hemoglobin_analysis not between", value1, value2, "hemoglobinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisIsNull() {
            addCriterion("ferritin_analysis is null");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisIsNotNull() {
            addCriterion("ferritin_analysis is not null");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisEqualTo(String value) {
            addCriterion("ferritin_analysis =", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisNotEqualTo(String value) {
            addCriterion("ferritin_analysis <>", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisGreaterThan(String value) {
            addCriterion("ferritin_analysis >", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("ferritin_analysis >=", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisLessThan(String value) {
            addCriterion("ferritin_analysis <", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisLessThanOrEqualTo(String value) {
            addCriterion("ferritin_analysis <=", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisLike(String value) {
            addCriterion("ferritin_analysis like", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisNotLike(String value) {
            addCriterion("ferritin_analysis not like", value, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisIn(List<String> values) {
            addCriterion("ferritin_analysis in", values, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisNotIn(List<String> values) {
            addCriterion("ferritin_analysis not in", values, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisBetween(String value1, String value2) {
            addCriterion("ferritin_analysis between", value1, value2, "ferritinAnalysis");
            return (Criteria) this;
        }

        public Criteria andFerritinAnalysisNotBetween(String value1, String value2) {
            addCriterion("ferritin_analysis not between", value1, value2, "ferritinAnalysis");
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

        public Criteria andPthIsNull() {
            addCriterion("pth is null");
            return (Criteria) this;
        }

        public Criteria andPthIsNotNull() {
            addCriterion("pth is not null");
            return (Criteria) this;
        }

        public Criteria andPthEqualTo(String value) {
            addCriterion("pth =", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthNotEqualTo(String value) {
            addCriterion("pth <>", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthGreaterThan(String value) {
            addCriterion("pth >", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthGreaterThanOrEqualTo(String value) {
            addCriterion("pth >=", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthLessThan(String value) {
            addCriterion("pth <", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthLessThanOrEqualTo(String value) {
            addCriterion("pth <=", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthLike(String value) {
            addCriterion("pth like", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthNotLike(String value) {
            addCriterion("pth not like", value, "pth");
            return (Criteria) this;
        }

        public Criteria andPthIn(List<String> values) {
            addCriterion("pth in", values, "pth");
            return (Criteria) this;
        }

        public Criteria andPthNotIn(List<String> values) {
            addCriterion("pth not in", values, "pth");
            return (Criteria) this;
        }

        public Criteria andPthBetween(String value1, String value2) {
            addCriterion("pth between", value1, value2, "pth");
            return (Criteria) this;
        }

        public Criteria andPthNotBetween(String value1, String value2) {
            addCriterion("pth not between", value1, value2, "pth");
            return (Criteria) this;
        }

        public Criteria andNutritureIsNull() {
            addCriterion("nutriture is null");
            return (Criteria) this;
        }

        public Criteria andNutritureIsNotNull() {
            addCriterion("nutriture is not null");
            return (Criteria) this;
        }

        public Criteria andNutritureEqualTo(String value) {
            addCriterion("nutriture =", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureNotEqualTo(String value) {
            addCriterion("nutriture <>", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureGreaterThan(String value) {
            addCriterion("nutriture >", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureGreaterThanOrEqualTo(String value) {
            addCriterion("nutriture >=", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureLessThan(String value) {
            addCriterion("nutriture <", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureLessThanOrEqualTo(String value) {
            addCriterion("nutriture <=", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureLike(String value) {
            addCriterion("nutriture like", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureNotLike(String value) {
            addCriterion("nutriture not like", value, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureIn(List<String> values) {
            addCriterion("nutriture in", values, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureNotIn(List<String> values) {
            addCriterion("nutriture not in", values, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureBetween(String value1, String value2) {
            addCriterion("nutriture between", value1, value2, "nutriture");
            return (Criteria) this;
        }

        public Criteria andNutritureNotBetween(String value1, String value2) {
            addCriterion("nutriture not between", value1, value2, "nutriture");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyIsNull() {
            addCriterion("dialysis_adequacy is null");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyIsNotNull() {
            addCriterion("dialysis_adequacy is not null");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyEqualTo(String value) {
            addCriterion("dialysis_adequacy =", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyNotEqualTo(String value) {
            addCriterion("dialysis_adequacy <>", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyGreaterThan(String value) {
            addCriterion("dialysis_adequacy >", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyGreaterThanOrEqualTo(String value) {
            addCriterion("dialysis_adequacy >=", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyLessThan(String value) {
            addCriterion("dialysis_adequacy <", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyLessThanOrEqualTo(String value) {
            addCriterion("dialysis_adequacy <=", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyLike(String value) {
            addCriterion("dialysis_adequacy like", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyNotLike(String value) {
            addCriterion("dialysis_adequacy not like", value, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyIn(List<String> values) {
            addCriterion("dialysis_adequacy in", values, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyNotIn(List<String> values) {
            addCriterion("dialysis_adequacy not in", values, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyBetween(String value1, String value2) {
            addCriterion("dialysis_adequacy between", value1, value2, "dialysisAdequacy");
            return (Criteria) this;
        }

        public Criteria andDialysisAdequacyNotBetween(String value1, String value2) {
            addCriterion("dialysis_adequacy not between", value1, value2, "dialysisAdequacy");
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