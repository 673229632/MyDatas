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

public class PdMUserExample implements ModelColumnSupport, AutoGenExample {
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

    public PdMUserExample() {
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
        return PdMUserColumnEnum.values();
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

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNull() {
            addCriterion("user_pass is null");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNotNull() {
            addCriterion("user_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUserPassEqualTo(String value) {
            addCriterion("user_pass =", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotEqualTo(String value) {
            addCriterion("user_pass <>", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThan(String value) {
            addCriterion("user_pass >", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThanOrEqualTo(String value) {
            addCriterion("user_pass >=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThan(String value) {
            addCriterion("user_pass <", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThanOrEqualTo(String value) {
            addCriterion("user_pass <=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLike(String value) {
            addCriterion("user_pass like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotLike(String value) {
            addCriterion("user_pass not like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassIn(List<String> values) {
            addCriterion("user_pass in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotIn(List<String> values) {
            addCriterion("user_pass not in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassBetween(String value1, String value2) {
            addCriterion("user_pass between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotBetween(String value1, String value2) {
            addCriterion("user_pass not between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSkincssIsNull() {
            addCriterion("skinCss is null");
            return (Criteria) this;
        }

        public Criteria andSkincssIsNotNull() {
            addCriterion("skinCss is not null");
            return (Criteria) this;
        }

        public Criteria andSkincssEqualTo(String value) {
            addCriterion("skinCss =", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssNotEqualTo(String value) {
            addCriterion("skinCss <>", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssGreaterThan(String value) {
            addCriterion("skinCss >", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssGreaterThanOrEqualTo(String value) {
            addCriterion("skinCss >=", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssLessThan(String value) {
            addCriterion("skinCss <", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssLessThanOrEqualTo(String value) {
            addCriterion("skinCss <=", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssLike(String value) {
            addCriterion("skinCss like", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssNotLike(String value) {
            addCriterion("skinCss not like", value, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssIn(List<String> values) {
            addCriterion("skinCss in", values, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssNotIn(List<String> values) {
            addCriterion("skinCss not in", values, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssBetween(String value1, String value2) {
            addCriterion("skinCss between", value1, value2, "skincss");
            return (Criteria) this;
        }

        public Criteria andSkincssNotBetween(String value1, String value2) {
            addCriterion("skinCss not between", value1, value2, "skincss");
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