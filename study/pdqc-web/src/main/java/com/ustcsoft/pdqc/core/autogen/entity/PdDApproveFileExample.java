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

public class PdDApproveFileExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDApproveFileExample() {
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
        return PdDApproveFileColumnEnum.values();
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

        public Criteria andFileNoIsNull() {
            addCriterion("file_no is null");
            return (Criteria) this;
        }

        public Criteria andFileNoIsNotNull() {
            addCriterion("file_no is not null");
            return (Criteria) this;
        }

        public Criteria andFileNoEqualTo(String value) {
            addCriterion("file_no =", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotEqualTo(String value) {
            addCriterion("file_no <>", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoGreaterThan(String value) {
            addCriterion("file_no >", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoGreaterThanOrEqualTo(String value) {
            addCriterion("file_no >=", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLessThan(String value) {
            addCriterion("file_no <", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLessThanOrEqualTo(String value) {
            addCriterion("file_no <=", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoLike(String value) {
            addCriterion("file_no like", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotLike(String value) {
            addCriterion("file_no not like", value, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoIn(List<String> values) {
            addCriterion("file_no in", values, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotIn(List<String> values) {
            addCriterion("file_no not in", values, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoBetween(String value1, String value2) {
            addCriterion("file_no between", value1, value2, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNoNotBetween(String value1, String value2) {
            addCriterion("file_no not between", value1, value2, "fileNo");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameIsNull() {
            addCriterion("n_file_name is null");
            return (Criteria) this;
        }

        public Criteria andNFileNameIsNotNull() {
            addCriterion("n_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andNFileNameEqualTo(String value) {
            addCriterion("n_file_name =", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameNotEqualTo(String value) {
            addCriterion("n_file_name <>", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameGreaterThan(String value) {
            addCriterion("n_file_name >", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("n_file_name >=", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameLessThan(String value) {
            addCriterion("n_file_name <", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameLessThanOrEqualTo(String value) {
            addCriterion("n_file_name <=", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameLike(String value) {
            addCriterion("n_file_name like", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameNotLike(String value) {
            addCriterion("n_file_name not like", value, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameIn(List<String> values) {
            addCriterion("n_file_name in", values, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameNotIn(List<String> values) {
            addCriterion("n_file_name not in", values, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameBetween(String value1, String value2) {
            addCriterion("n_file_name between", value1, value2, "nFileName");
            return (Criteria) this;
        }

        public Criteria andNFileNameNotBetween(String value1, String value2) {
            addCriterion("n_file_name not between", value1, value2, "nFileName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
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

        public Criteria andPntIdIsNull() {
            addCriterion("pnt_id is null");
            return (Criteria) this;
        }

        public Criteria andPntIdIsNotNull() {
            addCriterion("pnt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPntIdEqualTo(String value) {
            addCriterion("pnt_id =", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdNotEqualTo(String value) {
            addCriterion("pnt_id <>", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdGreaterThan(String value) {
            addCriterion("pnt_id >", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdGreaterThanOrEqualTo(String value) {
            addCriterion("pnt_id >=", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdLessThan(String value) {
            addCriterion("pnt_id <", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdLessThanOrEqualTo(String value) {
            addCriterion("pnt_id <=", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdLike(String value) {
            addCriterion("pnt_id like", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdNotLike(String value) {
            addCriterion("pnt_id not like", value, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdIn(List<String> values) {
            addCriterion("pnt_id in", values, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdNotIn(List<String> values) {
            addCriterion("pnt_id not in", values, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdBetween(String value1, String value2) {
            addCriterion("pnt_id between", value1, value2, "pntId");
            return (Criteria) this;
        }

        public Criteria andPntIdNotBetween(String value1, String value2) {
            addCriterion("pnt_id not between", value1, value2, "pntId");
            return (Criteria) this;
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

        public Criteria andFileTypeNoIsNull() {
            addCriterion("file_type_no is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoIsNotNull() {
            addCriterion("file_type_no is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoEqualTo(String value) {
            addCriterion("file_type_no =", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoNotEqualTo(String value) {
            addCriterion("file_type_no <>", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoGreaterThan(String value) {
            addCriterion("file_type_no >", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("file_type_no >=", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoLessThan(String value) {
            addCriterion("file_type_no <", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoLessThanOrEqualTo(String value) {
            addCriterion("file_type_no <=", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoLike(String value) {
            addCriterion("file_type_no like", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoNotLike(String value) {
            addCriterion("file_type_no not like", value, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoIn(List<String> values) {
            addCriterion("file_type_no in", values, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoNotIn(List<String> values) {
            addCriterion("file_type_no not in", values, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoBetween(String value1, String value2) {
            addCriterion("file_type_no between", value1, value2, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFileTypeNoNotBetween(String value1, String value2) {
            addCriterion("file_type_no not between", value1, value2, "fileTypeNo");
            return (Criteria) this;
        }

        public Criteria andFormatTypeIsNull() {
            addCriterion("format_type is null");
            return (Criteria) this;
        }

        public Criteria andFormatTypeIsNotNull() {
            addCriterion("format_type is not null");
            return (Criteria) this;
        }

        public Criteria andFormatTypeEqualTo(String value) {
            addCriterion("format_type =", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotEqualTo(String value) {
            addCriterion("format_type <>", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeGreaterThan(String value) {
            addCriterion("format_type >", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("format_type >=", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeLessThan(String value) {
            addCriterion("format_type <", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeLessThanOrEqualTo(String value) {
            addCriterion("format_type <=", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeLike(String value) {
            addCriterion("format_type like", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotLike(String value) {
            addCriterion("format_type not like", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeIn(List<String> values) {
            addCriterion("format_type in", values, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotIn(List<String> values) {
            addCriterion("format_type not in", values, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeBetween(String value1, String value2) {
            addCriterion("format_type between", value1, value2, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotBetween(String value1, String value2) {
            addCriterion("format_type not between", value1, value2, "formatType");
            return (Criteria) this;
        }

        public Criteria andFileOrderIsNull() {
            addCriterion("file_order is null");
            return (Criteria) this;
        }

        public Criteria andFileOrderIsNotNull() {
            addCriterion("file_order is not null");
            return (Criteria) this;
        }

        public Criteria andFileOrderEqualTo(Integer value) {
            addCriterion("file_order =", value, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderNotEqualTo(Integer value) {
            addCriterion("file_order <>", value, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderGreaterThan(Integer value) {
            addCriterion("file_order >", value, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_order >=", value, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderLessThan(Integer value) {
            addCriterion("file_order <", value, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderLessThanOrEqualTo(Integer value) {
            addCriterion("file_order <=", value, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderIn(List<Integer> values) {
            addCriterion("file_order in", values, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderNotIn(List<Integer> values) {
            addCriterion("file_order not in", values, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderBetween(Integer value1, Integer value2) {
            addCriterion("file_order between", value1, value2, "fileOrder");
            return (Criteria) this;
        }

        public Criteria andFileOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("file_order not between", value1, value2, "fileOrder");
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