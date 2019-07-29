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

public class PdMKpisegExample implements AutoGenExample, ModelColumnSupport {
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

    public PdMKpisegExample() {
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
        return PdMKpisegColumnEnum.values();
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

        public Criteria andKpiIdIsNull() {
            addCriterion("kpi_id is null");
            return (Criteria) this;
        }

        public Criteria andKpiIdIsNotNull() {
            addCriterion("kpi_id is not null");
            return (Criteria) this;
        }

        public Criteria andKpiIdEqualTo(String value) {
            addCriterion("kpi_id =", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotEqualTo(String value) {
            addCriterion("kpi_id <>", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdGreaterThan(String value) {
            addCriterion("kpi_id >", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdGreaterThanOrEqualTo(String value) {
            addCriterion("kpi_id >=", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdLessThan(String value) {
            addCriterion("kpi_id <", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdLessThanOrEqualTo(String value) {
            addCriterion("kpi_id <=", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdLike(String value) {
            addCriterion("kpi_id like", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotLike(String value) {
            addCriterion("kpi_id not like", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdIn(List<String> values) {
            addCriterion("kpi_id in", values, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotIn(List<String> values) {
            addCriterion("kpi_id not in", values, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdBetween(String value1, String value2) {
            addCriterion("kpi_id between", value1, value2, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotBetween(String value1, String value2) {
            addCriterion("kpi_id not between", value1, value2, "kpiId");
            return (Criteria) this;
        }

        public Criteria andSubCodeIsNull() {
            addCriterion("sub_code is null");
            return (Criteria) this;
        }

        public Criteria andSubCodeIsNotNull() {
            addCriterion("sub_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubCodeEqualTo(String value) {
            addCriterion("sub_code =", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotEqualTo(String value) {
            addCriterion("sub_code <>", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThan(String value) {
            addCriterion("sub_code >", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_code >=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThan(String value) {
            addCriterion("sub_code <", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_code <=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLike(String value) {
            addCriterion("sub_code like", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotLike(String value) {
            addCriterion("sub_code not like", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeIn(List<String> values) {
            addCriterion("sub_code in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotIn(List<String> values) {
            addCriterion("sub_code not in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeBetween(String value1, String value2) {
            addCriterion("sub_code between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotBetween(String value1, String value2) {
            addCriterion("sub_code not between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNull() {
            addCriterion("sub_name is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("sub_name =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("sub_name <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("sub_name >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_name >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("sub_name <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("sub_name <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("sub_name like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("sub_name not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("sub_name in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("sub_name not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("sub_name between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("sub_name not between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeIsNull() {
            addCriterion("segment_code is null");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeIsNotNull() {
            addCriterion("segment_code is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeEqualTo(String value) {
            addCriterion("segment_code =", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeNotEqualTo(String value) {
            addCriterion("segment_code <>", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeGreaterThan(String value) {
            addCriterion("segment_code >", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("segment_code >=", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeLessThan(String value) {
            addCriterion("segment_code <", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeLessThanOrEqualTo(String value) {
            addCriterion("segment_code <=", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeLike(String value) {
            addCriterion("segment_code like", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeNotLike(String value) {
            addCriterion("segment_code not like", value, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeIn(List<String> values) {
            addCriterion("segment_code in", values, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeNotIn(List<String> values) {
            addCriterion("segment_code not in", values, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeBetween(String value1, String value2) {
            addCriterion("segment_code between", value1, value2, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentCodeNotBetween(String value1, String value2) {
            addCriterion("segment_code not between", value1, value2, "segmentCode");
            return (Criteria) this;
        }

        public Criteria andSegmentNameIsNull() {
            addCriterion("segment_name is null");
            return (Criteria) this;
        }

        public Criteria andSegmentNameIsNotNull() {
            addCriterion("segment_name is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentNameEqualTo(String value) {
            addCriterion("segment_name =", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotEqualTo(String value) {
            addCriterion("segment_name <>", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameGreaterThan(String value) {
            addCriterion("segment_name >", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("segment_name >=", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameLessThan(String value) {
            addCriterion("segment_name <", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameLessThanOrEqualTo(String value) {
            addCriterion("segment_name <=", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameLike(String value) {
            addCriterion("segment_name like", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotLike(String value) {
            addCriterion("segment_name not like", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameIn(List<String> values) {
            addCriterion("segment_name in", values, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotIn(List<String> values) {
            addCriterion("segment_name not in", values, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameBetween(String value1, String value2) {
            addCriterion("segment_name between", value1, value2, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotBetween(String value1, String value2) {
            addCriterion("segment_name not between", value1, value2, "segmentName");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNull() {
            addCriterion("unit_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIsNotNull() {
            addCriterion("unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCodeEqualTo(String value) {
            addCriterion("unit_code =", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotEqualTo(String value) {
            addCriterion("unit_code <>", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThan(String value) {
            addCriterion("unit_code >", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_code >=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThan(String value) {
            addCriterion("unit_code <", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("unit_code <=", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeLike(String value) {
            addCriterion("unit_code like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotLike(String value) {
            addCriterion("unit_code not like", value, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeIn(List<String> values) {
            addCriterion("unit_code in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotIn(List<String> values) {
            addCriterion("unit_code not in", values, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeBetween(String value1, String value2) {
            addCriterion("unit_code between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitCodeNotBetween(String value1, String value2) {
            addCriterion("unit_code not between", value1, value2, "unitCode");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNull() {
            addCriterion("min_value is null");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNotNull() {
            addCriterion("min_value is not null");
            return (Criteria) this;
        }

        public Criteria andMinValueEqualTo(String value) {
            addCriterion("min_value =", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotEqualTo(String value) {
            addCriterion("min_value <>", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThan(String value) {
            addCriterion("min_value >", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThanOrEqualTo(String value) {
            addCriterion("min_value >=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThan(String value) {
            addCriterion("min_value <", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThanOrEqualTo(String value) {
            addCriterion("min_value <=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLike(String value) {
            addCriterion("min_value like", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotLike(String value) {
            addCriterion("min_value not like", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueIn(List<String> values) {
            addCriterion("min_value in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotIn(List<String> values) {
            addCriterion("min_value not in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueBetween(String value1, String value2) {
            addCriterion("min_value between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotBetween(String value1, String value2) {
            addCriterion("min_value not between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("max_value is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("max_value is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(String value) {
            addCriterion("max_value =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(String value) {
            addCriterion("max_value <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(String value) {
            addCriterion("max_value >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(String value) {
            addCriterion("max_value >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(String value) {
            addCriterion("max_value <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(String value) {
            addCriterion("max_value <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLike(String value) {
            addCriterion("max_value like", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotLike(String value) {
            addCriterion("max_value not like", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<String> values) {
            addCriterion("max_value in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<String> values) {
            addCriterion("max_value not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(String value1, String value2) {
            addCriterion("max_value between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(String value1, String value2) {
            addCriterion("max_value not between", value1, value2, "maxValue");
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