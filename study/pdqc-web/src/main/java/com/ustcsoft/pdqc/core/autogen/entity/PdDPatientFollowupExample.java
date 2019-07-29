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

public class PdDPatientFollowupExample implements AutoGenExample, ModelColumnSupport {
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

    public PdDPatientFollowupExample() {
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
        return PdDPatientFollowupColumnEnum.values();
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

        public Criteria andEmergencyIsNull() {
            addCriterion("emergency is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyIsNotNull() {
            addCriterion("emergency is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyEqualTo(String value) {
            addCriterion("emergency =", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotEqualTo(String value) {
            addCriterion("emergency <>", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyGreaterThan(String value) {
            addCriterion("emergency >", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyGreaterThanOrEqualTo(String value) {
            addCriterion("emergency >=", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyLessThan(String value) {
            addCriterion("emergency <", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyLessThanOrEqualTo(String value) {
            addCriterion("emergency <=", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyLike(String value) {
            addCriterion("emergency like", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotLike(String value) {
            addCriterion("emergency not like", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyIn(List<String> values) {
            addCriterion("emergency in", values, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotIn(List<String> values) {
            addCriterion("emergency not in", values, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyBetween(String value1, String value2) {
            addCriterion("emergency between", value1, value2, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotBetween(String value1, String value2) {
            addCriterion("emergency not between", value1, value2, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailIsNull() {
            addCriterion("emergency_detail is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailIsNotNull() {
            addCriterion("emergency_detail is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailEqualTo(String value) {
            addCriterion("emergency_detail =", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailNotEqualTo(String value) {
            addCriterion("emergency_detail <>", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailGreaterThan(String value) {
            addCriterion("emergency_detail >", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_detail >=", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailLessThan(String value) {
            addCriterion("emergency_detail <", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailLessThanOrEqualTo(String value) {
            addCriterion("emergency_detail <=", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailLike(String value) {
            addCriterion("emergency_detail like", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailNotLike(String value) {
            addCriterion("emergency_detail not like", value, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailIn(List<String> values) {
            addCriterion("emergency_detail in", values, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailNotIn(List<String> values) {
            addCriterion("emergency_detail not in", values, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailBetween(String value1, String value2) {
            addCriterion("emergency_detail between", value1, value2, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andEmergencyDetailNotBetween(String value1, String value2) {
            addCriterion("emergency_detail not between", value1, value2, "emergencyDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeIsNull() {
            addCriterion("illness_change is null");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeIsNotNull() {
            addCriterion("illness_change is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeEqualTo(String value) {
            addCriterion("illness_change =", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeNotEqualTo(String value) {
            addCriterion("illness_change <>", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeGreaterThan(String value) {
            addCriterion("illness_change >", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeGreaterThanOrEqualTo(String value) {
            addCriterion("illness_change >=", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeLessThan(String value) {
            addCriterion("illness_change <", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeLessThanOrEqualTo(String value) {
            addCriterion("illness_change <=", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeLike(String value) {
            addCriterion("illness_change like", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeNotLike(String value) {
            addCriterion("illness_change not like", value, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeIn(List<String> values) {
            addCriterion("illness_change in", values, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeNotIn(List<String> values) {
            addCriterion("illness_change not in", values, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeBetween(String value1, String value2) {
            addCriterion("illness_change between", value1, value2, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeNotBetween(String value1, String value2) {
            addCriterion("illness_change not between", value1, value2, "illnessChange");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailIsNull() {
            addCriterion("illness_change_detail is null");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailIsNotNull() {
            addCriterion("illness_change_detail is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailEqualTo(String value) {
            addCriterion("illness_change_detail =", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailNotEqualTo(String value) {
            addCriterion("illness_change_detail <>", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailGreaterThan(String value) {
            addCriterion("illness_change_detail >", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("illness_change_detail >=", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailLessThan(String value) {
            addCriterion("illness_change_detail <", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailLessThanOrEqualTo(String value) {
            addCriterion("illness_change_detail <=", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailLike(String value) {
            addCriterion("illness_change_detail like", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailNotLike(String value) {
            addCriterion("illness_change_detail not like", value, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailIn(List<String> values) {
            addCriterion("illness_change_detail in", values, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailNotIn(List<String> values) {
            addCriterion("illness_change_detail not in", values, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailBetween(String value1, String value2) {
            addCriterion("illness_change_detail between", value1, value2, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andIllnessChangeDetailNotBetween(String value1, String value2) {
            addCriterion("illness_change_detail not between", value1, value2, "illnessChangeDetail");
            return (Criteria) this;
        }

        public Criteria andAppelityIsNull() {
            addCriterion("appelity is null");
            return (Criteria) this;
        }

        public Criteria andAppelityIsNotNull() {
            addCriterion("appelity is not null");
            return (Criteria) this;
        }

        public Criteria andAppelityEqualTo(String value) {
            addCriterion("appelity =", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityNotEqualTo(String value) {
            addCriterion("appelity <>", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityGreaterThan(String value) {
            addCriterion("appelity >", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityGreaterThanOrEqualTo(String value) {
            addCriterion("appelity >=", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityLessThan(String value) {
            addCriterion("appelity <", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityLessThanOrEqualTo(String value) {
            addCriterion("appelity <=", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityLike(String value) {
            addCriterion("appelity like", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityNotLike(String value) {
            addCriterion("appelity not like", value, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityIn(List<String> values) {
            addCriterion("appelity in", values, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityNotIn(List<String> values) {
            addCriterion("appelity not in", values, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityBetween(String value1, String value2) {
            addCriterion("appelity between", value1, value2, "appelity");
            return (Criteria) this;
        }

        public Criteria andAppelityNotBetween(String value1, String value2) {
            addCriterion("appelity not between", value1, value2, "appelity");
            return (Criteria) this;
        }

        public Criteria andSleepQualityIsNull() {
            addCriterion("sleep_quality is null");
            return (Criteria) this;
        }

        public Criteria andSleepQualityIsNotNull() {
            addCriterion("sleep_quality is not null");
            return (Criteria) this;
        }

        public Criteria andSleepQualityEqualTo(String value) {
            addCriterion("sleep_quality =", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityNotEqualTo(String value) {
            addCriterion("sleep_quality <>", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityGreaterThan(String value) {
            addCriterion("sleep_quality >", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityGreaterThanOrEqualTo(String value) {
            addCriterion("sleep_quality >=", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityLessThan(String value) {
            addCriterion("sleep_quality <", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityLessThanOrEqualTo(String value) {
            addCriterion("sleep_quality <=", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityLike(String value) {
            addCriterion("sleep_quality like", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityNotLike(String value) {
            addCriterion("sleep_quality not like", value, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityIn(List<String> values) {
            addCriterion("sleep_quality in", values, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityNotIn(List<String> values) {
            addCriterion("sleep_quality not in", values, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityBetween(String value1, String value2) {
            addCriterion("sleep_quality between", value1, value2, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andSleepQualityNotBetween(String value1, String value2) {
            addCriterion("sleep_quality not between", value1, value2, "sleepQuality");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIsNull() {
            addCriterion("activity_amount is null");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIsNotNull() {
            addCriterion("activity_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAmountEqualTo(String value) {
            addCriterion("activity_amount =", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotEqualTo(String value) {
            addCriterion("activity_amount <>", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountGreaterThan(String value) {
            addCriterion("activity_amount >", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountGreaterThanOrEqualTo(String value) {
            addCriterion("activity_amount >=", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountLessThan(String value) {
            addCriterion("activity_amount <", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountLessThanOrEqualTo(String value) {
            addCriterion("activity_amount <=", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountLike(String value) {
            addCriterion("activity_amount like", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotLike(String value) {
            addCriterion("activity_amount not like", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIn(List<String> values) {
            addCriterion("activity_amount in", values, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotIn(List<String> values) {
            addCriterion("activity_amount not in", values, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountBetween(String value1, String value2) {
            addCriterion("activity_amount between", value1, value2, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotBetween(String value1, String value2) {
            addCriterion("activity_amount not between", value1, value2, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andEmotionIsNull() {
            addCriterion("emotion is null");
            return (Criteria) this;
        }

        public Criteria andEmotionIsNotNull() {
            addCriterion("emotion is not null");
            return (Criteria) this;
        }

        public Criteria andEmotionEqualTo(String value) {
            addCriterion("emotion =", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotEqualTo(String value) {
            addCriterion("emotion <>", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionGreaterThan(String value) {
            addCriterion("emotion >", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionGreaterThanOrEqualTo(String value) {
            addCriterion("emotion >=", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLessThan(String value) {
            addCriterion("emotion <", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLessThanOrEqualTo(String value) {
            addCriterion("emotion <=", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLike(String value) {
            addCriterion("emotion like", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotLike(String value) {
            addCriterion("emotion not like", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionIn(List<String> values) {
            addCriterion("emotion in", values, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotIn(List<String> values) {
            addCriterion("emotion not in", values, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionBetween(String value1, String value2) {
            addCriterion("emotion between", value1, value2, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotBetween(String value1, String value2) {
            addCriterion("emotion not between", value1, value2, "emotion");
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

        public Criteria andBloodGlucoseIsNull() {
            addCriterion("blood_glucose is null");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseIsNotNull() {
            addCriterion("blood_glucose is not null");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseEqualTo(String value) {
            addCriterion("blood_glucose =", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseNotEqualTo(String value) {
            addCriterion("blood_glucose <>", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseGreaterThan(String value) {
            addCriterion("blood_glucose >", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseGreaterThanOrEqualTo(String value) {
            addCriterion("blood_glucose >=", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseLessThan(String value) {
            addCriterion("blood_glucose <", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseLessThanOrEqualTo(String value) {
            addCriterion("blood_glucose <=", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseLike(String value) {
            addCriterion("blood_glucose like", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseNotLike(String value) {
            addCriterion("blood_glucose not like", value, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseIn(List<String> values) {
            addCriterion("blood_glucose in", values, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseNotIn(List<String> values) {
            addCriterion("blood_glucose not in", values, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseBetween(String value1, String value2) {
            addCriterion("blood_glucose between", value1, value2, "bloodGlucose");
            return (Criteria) this;
        }

        public Criteria andBloodGlucoseNotBetween(String value1, String value2) {
            addCriterion("blood_glucose not between", value1, value2, "bloodGlucose");
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

        public Criteria andUrinaryProductionIsNull() {
            addCriterion("urinary_production is null");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionIsNotNull() {
            addCriterion("urinary_production is not null");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionEqualTo(String value) {
            addCriterion("urinary_production =", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionNotEqualTo(String value) {
            addCriterion("urinary_production <>", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionGreaterThan(String value) {
            addCriterion("urinary_production >", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionGreaterThanOrEqualTo(String value) {
            addCriterion("urinary_production >=", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionLessThan(String value) {
            addCriterion("urinary_production <", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionLessThanOrEqualTo(String value) {
            addCriterion("urinary_production <=", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionLike(String value) {
            addCriterion("urinary_production like", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionNotLike(String value) {
            addCriterion("urinary_production not like", value, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionIn(List<String> values) {
            addCriterion("urinary_production in", values, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionNotIn(List<String> values) {
            addCriterion("urinary_production not in", values, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionBetween(String value1, String value2) {
            addCriterion("urinary_production between", value1, value2, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUrinaryProductionNotBetween(String value1, String value2) {
            addCriterion("urinary_production not between", value1, value2, "urinaryProduction");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintIsNull() {
            addCriterion("unwell_chief_complaint is null");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintIsNotNull() {
            addCriterion("unwell_chief_complaint is not null");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintEqualTo(String value) {
            addCriterion("unwell_chief_complaint =", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintNotEqualTo(String value) {
            addCriterion("unwell_chief_complaint <>", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintGreaterThan(String value) {
            addCriterion("unwell_chief_complaint >", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintGreaterThanOrEqualTo(String value) {
            addCriterion("unwell_chief_complaint >=", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintLessThan(String value) {
            addCriterion("unwell_chief_complaint <", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintLessThanOrEqualTo(String value) {
            addCriterion("unwell_chief_complaint <=", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintLike(String value) {
            addCriterion("unwell_chief_complaint like", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintNotLike(String value) {
            addCriterion("unwell_chief_complaint not like", value, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintIn(List<String> values) {
            addCriterion("unwell_chief_complaint in", values, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintNotIn(List<String> values) {
            addCriterion("unwell_chief_complaint not in", values, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintBetween(String value1, String value2) {
            addCriterion("unwell_chief_complaint between", value1, value2, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andUnwellChiefComplaintNotBetween(String value1, String value2) {
            addCriterion("unwell_chief_complaint not between", value1, value2, "unwellChiefComplaint");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemIsNull() {
            addCriterion("followup_problem is null");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemIsNotNull() {
            addCriterion("followup_problem is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemEqualTo(String value) {
            addCriterion("followup_problem =", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemNotEqualTo(String value) {
            addCriterion("followup_problem <>", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemGreaterThan(String value) {
            addCriterion("followup_problem >", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemGreaterThanOrEqualTo(String value) {
            addCriterion("followup_problem >=", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemLessThan(String value) {
            addCriterion("followup_problem <", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemLessThanOrEqualTo(String value) {
            addCriterion("followup_problem <=", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemLike(String value) {
            addCriterion("followup_problem like", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemNotLike(String value) {
            addCriterion("followup_problem not like", value, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemIn(List<String> values) {
            addCriterion("followup_problem in", values, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemNotIn(List<String> values) {
            addCriterion("followup_problem not in", values, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemBetween(String value1, String value2) {
            addCriterion("followup_problem between", value1, value2, "followupProblem");
            return (Criteria) this;
        }

        public Criteria andFollowupProblemNotBetween(String value1, String value2) {
            addCriterion("followup_problem not between", value1, value2, "followupProblem");
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

        public Criteria andPublicityEducationFocusIsNull() {
            addCriterion("publicity_education_focus is null");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusIsNotNull() {
            addCriterion("publicity_education_focus is not null");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusEqualTo(String value) {
            addCriterion("publicity_education_focus =", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusNotEqualTo(String value) {
            addCriterion("publicity_education_focus <>", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusGreaterThan(String value) {
            addCriterion("publicity_education_focus >", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusGreaterThanOrEqualTo(String value) {
            addCriterion("publicity_education_focus >=", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusLessThan(String value) {
            addCriterion("publicity_education_focus <", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusLessThanOrEqualTo(String value) {
            addCriterion("publicity_education_focus <=", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusLike(String value) {
            addCriterion("publicity_education_focus like", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusNotLike(String value) {
            addCriterion("publicity_education_focus not like", value, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusIn(List<String> values) {
            addCriterion("publicity_education_focus in", values, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusNotIn(List<String> values) {
            addCriterion("publicity_education_focus not in", values, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusBetween(String value1, String value2) {
            addCriterion("publicity_education_focus between", value1, value2, "publicityEducationFocus");
            return (Criteria) this;
        }

        public Criteria andPublicityEducationFocusNotBetween(String value1, String value2) {
            addCriterion("publicity_education_focus not between", value1, value2, "publicityEducationFocus");
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