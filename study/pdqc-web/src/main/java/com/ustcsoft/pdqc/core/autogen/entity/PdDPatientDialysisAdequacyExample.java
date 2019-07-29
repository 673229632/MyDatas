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

public class PdDPatientDialysisAdequacyExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDPatientDialysisAdequacyExample() {
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
        return PdDPatientDialysisAdequacyColumnEnum.values();
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

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
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

        public Criteria andUrineVolumeIsNull() {
            addCriterion("urine_volume is null");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeIsNotNull() {
            addCriterion("urine_volume is not null");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeEqualTo(String value) {
            addCriterion("urine_volume =", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeNotEqualTo(String value) {
            addCriterion("urine_volume <>", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeGreaterThan(String value) {
            addCriterion("urine_volume >", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("urine_volume >=", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeLessThan(String value) {
            addCriterion("urine_volume <", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeLessThanOrEqualTo(String value) {
            addCriterion("urine_volume <=", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeLike(String value) {
            addCriterion("urine_volume like", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeNotLike(String value) {
            addCriterion("urine_volume not like", value, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeIn(List<String> values) {
            addCriterion("urine_volume in", values, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeNotIn(List<String> values) {
            addCriterion("urine_volume not in", values, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeBetween(String value1, String value2) {
            addCriterion("urine_volume between", value1, value2, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineVolumeNotBetween(String value1, String value2) {
            addCriterion("urine_volume not between", value1, value2, "urineVolume");
            return (Criteria) this;
        }

        public Criteria andUrineBunIsNull() {
            addCriterion("urine_bun is null");
            return (Criteria) this;
        }

        public Criteria andUrineBunIsNotNull() {
            addCriterion("urine_bun is not null");
            return (Criteria) this;
        }

        public Criteria andUrineBunEqualTo(String value) {
            addCriterion("urine_bun =", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunNotEqualTo(String value) {
            addCriterion("urine_bun <>", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunGreaterThan(String value) {
            addCriterion("urine_bun >", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunGreaterThanOrEqualTo(String value) {
            addCriterion("urine_bun >=", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunLessThan(String value) {
            addCriterion("urine_bun <", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunLessThanOrEqualTo(String value) {
            addCriterion("urine_bun <=", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunLike(String value) {
            addCriterion("urine_bun like", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunNotLike(String value) {
            addCriterion("urine_bun not like", value, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunIn(List<String> values) {
            addCriterion("urine_bun in", values, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunNotIn(List<String> values) {
            addCriterion("urine_bun not in", values, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunBetween(String value1, String value2) {
            addCriterion("urine_bun between", value1, value2, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineBunNotBetween(String value1, String value2) {
            addCriterion("urine_bun not between", value1, value2, "urineBun");
            return (Criteria) this;
        }

        public Criteria andUrineCrIsNull() {
            addCriterion("urine_cr is null");
            return (Criteria) this;
        }

        public Criteria andUrineCrIsNotNull() {
            addCriterion("urine_cr is not null");
            return (Criteria) this;
        }

        public Criteria andUrineCrEqualTo(String value) {
            addCriterion("urine_cr =", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrNotEqualTo(String value) {
            addCriterion("urine_cr <>", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrGreaterThan(String value) {
            addCriterion("urine_cr >", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrGreaterThanOrEqualTo(String value) {
            addCriterion("urine_cr >=", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrLessThan(String value) {
            addCriterion("urine_cr <", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrLessThanOrEqualTo(String value) {
            addCriterion("urine_cr <=", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrLike(String value) {
            addCriterion("urine_cr like", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrNotLike(String value) {
            addCriterion("urine_cr not like", value, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrIn(List<String> values) {
            addCriterion("urine_cr in", values, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrNotIn(List<String> values) {
            addCriterion("urine_cr not in", values, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrBetween(String value1, String value2) {
            addCriterion("urine_cr between", value1, value2, "urineCr");
            return (Criteria) this;
        }

        public Criteria andUrineCrNotBetween(String value1, String value2) {
            addCriterion("urine_cr not between", value1, value2, "urineCr");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountIsNull() {
            addCriterion("drainage_amount is null");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountIsNotNull() {
            addCriterion("drainage_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountEqualTo(String value) {
            addCriterion("drainage_amount =", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountNotEqualTo(String value) {
            addCriterion("drainage_amount <>", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountGreaterThan(String value) {
            addCriterion("drainage_amount >", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountGreaterThanOrEqualTo(String value) {
            addCriterion("drainage_amount >=", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountLessThan(String value) {
            addCriterion("drainage_amount <", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountLessThanOrEqualTo(String value) {
            addCriterion("drainage_amount <=", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountLike(String value) {
            addCriterion("drainage_amount like", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountNotLike(String value) {
            addCriterion("drainage_amount not like", value, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountIn(List<String> values) {
            addCriterion("drainage_amount in", values, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountNotIn(List<String> values) {
            addCriterion("drainage_amount not in", values, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountBetween(String value1, String value2) {
            addCriterion("drainage_amount between", value1, value2, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageAmountNotBetween(String value1, String value2) {
            addCriterion("drainage_amount not between", value1, value2, "drainageAmount");
            return (Criteria) this;
        }

        public Criteria andDrainageBunIsNull() {
            addCriterion("drainage_bun is null");
            return (Criteria) this;
        }

        public Criteria andDrainageBunIsNotNull() {
            addCriterion("drainage_bun is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageBunEqualTo(String value) {
            addCriterion("drainage_bun =", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunNotEqualTo(String value) {
            addCriterion("drainage_bun <>", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunGreaterThan(String value) {
            addCriterion("drainage_bun >", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunGreaterThanOrEqualTo(String value) {
            addCriterion("drainage_bun >=", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunLessThan(String value) {
            addCriterion("drainage_bun <", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunLessThanOrEqualTo(String value) {
            addCriterion("drainage_bun <=", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunLike(String value) {
            addCriterion("drainage_bun like", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunNotLike(String value) {
            addCriterion("drainage_bun not like", value, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunIn(List<String> values) {
            addCriterion("drainage_bun in", values, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunNotIn(List<String> values) {
            addCriterion("drainage_bun not in", values, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunBetween(String value1, String value2) {
            addCriterion("drainage_bun between", value1, value2, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageBunNotBetween(String value1, String value2) {
            addCriterion("drainage_bun not between", value1, value2, "drainageBun");
            return (Criteria) this;
        }

        public Criteria andDrainageCrIsNull() {
            addCriterion("drainage_cr is null");
            return (Criteria) this;
        }

        public Criteria andDrainageCrIsNotNull() {
            addCriterion("drainage_cr is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageCrEqualTo(String value) {
            addCriterion("drainage_cr =", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrNotEqualTo(String value) {
            addCriterion("drainage_cr <>", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrGreaterThan(String value) {
            addCriterion("drainage_cr >", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrGreaterThanOrEqualTo(String value) {
            addCriterion("drainage_cr >=", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrLessThan(String value) {
            addCriterion("drainage_cr <", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrLessThanOrEqualTo(String value) {
            addCriterion("drainage_cr <=", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrLike(String value) {
            addCriterion("drainage_cr like", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrNotLike(String value) {
            addCriterion("drainage_cr not like", value, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrIn(List<String> values) {
            addCriterion("drainage_cr in", values, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrNotIn(List<String> values) {
            addCriterion("drainage_cr not in", values, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrBetween(String value1, String value2) {
            addCriterion("drainage_cr between", value1, value2, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andDrainageCrNotBetween(String value1, String value2) {
            addCriterion("drainage_cr not between", value1, value2, "drainageCr");
            return (Criteria) this;
        }

        public Criteria andSerumBunIsNull() {
            addCriterion("serum_bun is null");
            return (Criteria) this;
        }

        public Criteria andSerumBunIsNotNull() {
            addCriterion("serum_bun is not null");
            return (Criteria) this;
        }

        public Criteria andSerumBunEqualTo(String value) {
            addCriterion("serum_bun =", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunNotEqualTo(String value) {
            addCriterion("serum_bun <>", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunGreaterThan(String value) {
            addCriterion("serum_bun >", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunGreaterThanOrEqualTo(String value) {
            addCriterion("serum_bun >=", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunLessThan(String value) {
            addCriterion("serum_bun <", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunLessThanOrEqualTo(String value) {
            addCriterion("serum_bun <=", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunLike(String value) {
            addCriterion("serum_bun like", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunNotLike(String value) {
            addCriterion("serum_bun not like", value, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunIn(List<String> values) {
            addCriterion("serum_bun in", values, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunNotIn(List<String> values) {
            addCriterion("serum_bun not in", values, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunBetween(String value1, String value2) {
            addCriterion("serum_bun between", value1, value2, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumBunNotBetween(String value1, String value2) {
            addCriterion("serum_bun not between", value1, value2, "serumBun");
            return (Criteria) this;
        }

        public Criteria andSerumCrIsNull() {
            addCriterion("serum_cr is null");
            return (Criteria) this;
        }

        public Criteria andSerumCrIsNotNull() {
            addCriterion("serum_cr is not null");
            return (Criteria) this;
        }

        public Criteria andSerumCrEqualTo(String value) {
            addCriterion("serum_cr =", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrNotEqualTo(String value) {
            addCriterion("serum_cr <>", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrGreaterThan(String value) {
            addCriterion("serum_cr >", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrGreaterThanOrEqualTo(String value) {
            addCriterion("serum_cr >=", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrLessThan(String value) {
            addCriterion("serum_cr <", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrLessThanOrEqualTo(String value) {
            addCriterion("serum_cr <=", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrLike(String value) {
            addCriterion("serum_cr like", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrNotLike(String value) {
            addCriterion("serum_cr not like", value, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrIn(List<String> values) {
            addCriterion("serum_cr in", values, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrNotIn(List<String> values) {
            addCriterion("serum_cr not in", values, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrBetween(String value1, String value2) {
            addCriterion("serum_cr between", value1, value2, "serumCr");
            return (Criteria) this;
        }

        public Criteria andSerumCrNotBetween(String value1, String value2) {
            addCriterion("serum_cr not between", value1, value2, "serumCr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrIsNull() {
            addCriterion("residual_renal_ccr is null");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrIsNotNull() {
            addCriterion("residual_renal_ccr is not null");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrEqualTo(String value) {
            addCriterion("residual_renal_ccr =", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrNotEqualTo(String value) {
            addCriterion("residual_renal_ccr <>", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrGreaterThan(String value) {
            addCriterion("residual_renal_ccr >", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrGreaterThanOrEqualTo(String value) {
            addCriterion("residual_renal_ccr >=", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrLessThan(String value) {
            addCriterion("residual_renal_ccr <", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrLessThanOrEqualTo(String value) {
            addCriterion("residual_renal_ccr <=", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrLike(String value) {
            addCriterion("residual_renal_ccr like", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrNotLike(String value) {
            addCriterion("residual_renal_ccr not like", value, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrIn(List<String> values) {
            addCriterion("residual_renal_ccr in", values, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrNotIn(List<String> values) {
            addCriterion("residual_renal_ccr not in", values, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrBetween(String value1, String value2) {
            addCriterion("residual_renal_ccr between", value1, value2, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalCcrNotBetween(String value1, String value2) {
            addCriterion("residual_renal_ccr not between", value1, value2, "residualRenalCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrIsNull() {
            addCriterion("peritoneal_dialysis_ccr is null");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrIsNotNull() {
            addCriterion("peritoneal_dialysis_ccr is not null");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrEqualTo(String value) {
            addCriterion("peritoneal_dialysis_ccr =", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrNotEqualTo(String value) {
            addCriterion("peritoneal_dialysis_ccr <>", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrGreaterThan(String value) {
            addCriterion("peritoneal_dialysis_ccr >", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrGreaterThanOrEqualTo(String value) {
            addCriterion("peritoneal_dialysis_ccr >=", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrLessThan(String value) {
            addCriterion("peritoneal_dialysis_ccr <", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrLessThanOrEqualTo(String value) {
            addCriterion("peritoneal_dialysis_ccr <=", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrLike(String value) {
            addCriterion("peritoneal_dialysis_ccr like", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrNotLike(String value) {
            addCriterion("peritoneal_dialysis_ccr not like", value, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrIn(List<String> values) {
            addCriterion("peritoneal_dialysis_ccr in", values, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrNotIn(List<String> values) {
            addCriterion("peritoneal_dialysis_ccr not in", values, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrBetween(String value1, String value2) {
            addCriterion("peritoneal_dialysis_ccr between", value1, value2, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisCcrNotBetween(String value1, String value2) {
            addCriterion("peritoneal_dialysis_ccr not between", value1, value2, "peritonealDialysisCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrIsNull() {
            addCriterion("total_ccr is null");
            return (Criteria) this;
        }

        public Criteria andTotalCcrIsNotNull() {
            addCriterion("total_ccr is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCcrEqualTo(String value) {
            addCriterion("total_ccr =", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrNotEqualTo(String value) {
            addCriterion("total_ccr <>", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrGreaterThan(String value) {
            addCriterion("total_ccr >", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrGreaterThanOrEqualTo(String value) {
            addCriterion("total_ccr >=", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrLessThan(String value) {
            addCriterion("total_ccr <", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrLessThanOrEqualTo(String value) {
            addCriterion("total_ccr <=", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrLike(String value) {
            addCriterion("total_ccr like", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrNotLike(String value) {
            addCriterion("total_ccr not like", value, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrIn(List<String> values) {
            addCriterion("total_ccr in", values, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrNotIn(List<String> values) {
            addCriterion("total_ccr not in", values, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrBetween(String value1, String value2) {
            addCriterion("total_ccr between", value1, value2, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andTotalCcrNotBetween(String value1, String value2) {
            addCriterion("total_ccr not between", value1, value2, "totalCcr");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtIsNull() {
            addCriterion("residual_renal_kt is null");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtIsNotNull() {
            addCriterion("residual_renal_kt is not null");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtEqualTo(String value) {
            addCriterion("residual_renal_kt =", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtNotEqualTo(String value) {
            addCriterion("residual_renal_kt <>", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtGreaterThan(String value) {
            addCriterion("residual_renal_kt >", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtGreaterThanOrEqualTo(String value) {
            addCriterion("residual_renal_kt >=", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtLessThan(String value) {
            addCriterion("residual_renal_kt <", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtLessThanOrEqualTo(String value) {
            addCriterion("residual_renal_kt <=", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtLike(String value) {
            addCriterion("residual_renal_kt like", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtNotLike(String value) {
            addCriterion("residual_renal_kt not like", value, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtIn(List<String> values) {
            addCriterion("residual_renal_kt in", values, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtNotIn(List<String> values) {
            addCriterion("residual_renal_kt not in", values, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtBetween(String value1, String value2) {
            addCriterion("residual_renal_kt between", value1, value2, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andResidualRenalKtNotBetween(String value1, String value2) {
            addCriterion("residual_renal_kt not between", value1, value2, "residualRenalKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtIsNull() {
            addCriterion("peritoneal_dialysis_kt is null");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtIsNotNull() {
            addCriterion("peritoneal_dialysis_kt is not null");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtEqualTo(String value) {
            addCriterion("peritoneal_dialysis_kt =", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtNotEqualTo(String value) {
            addCriterion("peritoneal_dialysis_kt <>", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtGreaterThan(String value) {
            addCriterion("peritoneal_dialysis_kt >", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtGreaterThanOrEqualTo(String value) {
            addCriterion("peritoneal_dialysis_kt >=", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtLessThan(String value) {
            addCriterion("peritoneal_dialysis_kt <", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtLessThanOrEqualTo(String value) {
            addCriterion("peritoneal_dialysis_kt <=", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtLike(String value) {
            addCriterion("peritoneal_dialysis_kt like", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtNotLike(String value) {
            addCriterion("peritoneal_dialysis_kt not like", value, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtIn(List<String> values) {
            addCriterion("peritoneal_dialysis_kt in", values, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtNotIn(List<String> values) {
            addCriterion("peritoneal_dialysis_kt not in", values, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtBetween(String value1, String value2) {
            addCriterion("peritoneal_dialysis_kt between", value1, value2, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andPeritonealDialysisKtNotBetween(String value1, String value2) {
            addCriterion("peritoneal_dialysis_kt not between", value1, value2, "peritonealDialysisKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtIsNull() {
            addCriterion("total_kt is null");
            return (Criteria) this;
        }

        public Criteria andTotalKtIsNotNull() {
            addCriterion("total_kt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalKtEqualTo(String value) {
            addCriterion("total_kt =", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtNotEqualTo(String value) {
            addCriterion("total_kt <>", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtGreaterThan(String value) {
            addCriterion("total_kt >", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtGreaterThanOrEqualTo(String value) {
            addCriterion("total_kt >=", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtLessThan(String value) {
            addCriterion("total_kt <", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtLessThanOrEqualTo(String value) {
            addCriterion("total_kt <=", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtLike(String value) {
            addCriterion("total_kt like", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtNotLike(String value) {
            addCriterion("total_kt not like", value, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtIn(List<String> values) {
            addCriterion("total_kt in", values, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtNotIn(List<String> values) {
            addCriterion("total_kt not in", values, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtBetween(String value1, String value2) {
            addCriterion("total_kt between", value1, value2, "totalKt");
            return (Criteria) this;
        }

        public Criteria andTotalKtNotBetween(String value1, String value2) {
            addCriterion("total_kt not between", value1, value2, "totalKt");
            return (Criteria) this;
        }

        public Criteria andEgfrIsNull() {
            addCriterion("egfr is null");
            return (Criteria) this;
        }

        public Criteria andEgfrIsNotNull() {
            addCriterion("egfr is not null");
            return (Criteria) this;
        }

        public Criteria andEgfrEqualTo(String value) {
            addCriterion("egfr =", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrNotEqualTo(String value) {
            addCriterion("egfr <>", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrGreaterThan(String value) {
            addCriterion("egfr >", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrGreaterThanOrEqualTo(String value) {
            addCriterion("egfr >=", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrLessThan(String value) {
            addCriterion("egfr <", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrLessThanOrEqualTo(String value) {
            addCriterion("egfr <=", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrLike(String value) {
            addCriterion("egfr like", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrNotLike(String value) {
            addCriterion("egfr not like", value, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrIn(List<String> values) {
            addCriterion("egfr in", values, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrNotIn(List<String> values) {
            addCriterion("egfr not in", values, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrBetween(String value1, String value2) {
            addCriterion("egfr between", value1, value2, "egfr");
            return (Criteria) this;
        }

        public Criteria andEgfrNotBetween(String value1, String value2) {
            addCriterion("egfr not between", value1, value2, "egfr");
            return (Criteria) this;
        }

        public Criteria andNpcrIsNull() {
            addCriterion("npcr is null");
            return (Criteria) this;
        }

        public Criteria andNpcrIsNotNull() {
            addCriterion("npcr is not null");
            return (Criteria) this;
        }

        public Criteria andNpcrEqualTo(String value) {
            addCriterion("npcr =", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrNotEqualTo(String value) {
            addCriterion("npcr <>", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrGreaterThan(String value) {
            addCriterion("npcr >", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrGreaterThanOrEqualTo(String value) {
            addCriterion("npcr >=", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrLessThan(String value) {
            addCriterion("npcr <", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrLessThanOrEqualTo(String value) {
            addCriterion("npcr <=", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrLike(String value) {
            addCriterion("npcr like", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrNotLike(String value) {
            addCriterion("npcr not like", value, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrIn(List<String> values) {
            addCriterion("npcr in", values, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrNotIn(List<String> values) {
            addCriterion("npcr not in", values, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrBetween(String value1, String value2) {
            addCriterion("npcr between", value1, value2, "npcr");
            return (Criteria) this;
        }

        public Criteria andNpcrNotBetween(String value1, String value2) {
            addCriterion("npcr not between", value1, value2, "npcr");
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