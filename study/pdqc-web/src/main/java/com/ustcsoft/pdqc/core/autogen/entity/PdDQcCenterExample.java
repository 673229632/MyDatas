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

public class PdDQcCenterExample implements AutoGenExample, ModelColumnSupport {
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

    public PdDQcCenterExample() {
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
        return PdDQcCenterColumnEnum.values();
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

        public Criteria andQcCenterNoIsNull() {
            addCriterion("qc_center_no is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoIsNotNull() {
            addCriterion("qc_center_no is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoEqualTo(String value) {
            addCriterion("qc_center_no =", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotEqualTo(String value) {
            addCriterion("qc_center_no <>", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoGreaterThan(String value) {
            addCriterion("qc_center_no >", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_no >=", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoLessThan(String value) {
            addCriterion("qc_center_no <", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoLessThanOrEqualTo(String value) {
            addCriterion("qc_center_no <=", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoLike(String value) {
            addCriterion("qc_center_no like", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotLike(String value) {
            addCriterion("qc_center_no not like", value, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoIn(List<String> values) {
            addCriterion("qc_center_no in", values, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotIn(List<String> values) {
            addCriterion("qc_center_no not in", values, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoBetween(String value1, String value2) {
            addCriterion("qc_center_no between", value1, value2, "qcCenterNo");
            return (Criteria) this;
        }

        public Criteria andQcCenterNoNotBetween(String value1, String value2) {
            addCriterion("qc_center_no not between", value1, value2, "qcCenterNo");
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

        public Criteria andQcCenterNameIsNull() {
            addCriterion("qc_center_name is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameIsNotNull() {
            addCriterion("qc_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameEqualTo(String value) {
            addCriterion("qc_center_name =", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameNotEqualTo(String value) {
            addCriterion("qc_center_name <>", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameGreaterThan(String value) {
            addCriterion("qc_center_name >", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_name >=", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameLessThan(String value) {
            addCriterion("qc_center_name <", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameLessThanOrEqualTo(String value) {
            addCriterion("qc_center_name <=", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameLike(String value) {
            addCriterion("qc_center_name like", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameNotLike(String value) {
            addCriterion("qc_center_name not like", value, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameIn(List<String> values) {
            addCriterion("qc_center_name in", values, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameNotIn(List<String> values) {
            addCriterion("qc_center_name not in", values, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameBetween(String value1, String value2) {
            addCriterion("qc_center_name between", value1, value2, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterNameNotBetween(String value1, String value2) {
            addCriterion("qc_center_name not between", value1, value2, "qcCenterName");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressIsNull() {
            addCriterion("qc_center_address is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressIsNotNull() {
            addCriterion("qc_center_address is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressEqualTo(String value) {
            addCriterion("qc_center_address =", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressNotEqualTo(String value) {
            addCriterion("qc_center_address <>", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressGreaterThan(String value) {
            addCriterion("qc_center_address >", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_address >=", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressLessThan(String value) {
            addCriterion("qc_center_address <", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressLessThanOrEqualTo(String value) {
            addCriterion("qc_center_address <=", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressLike(String value) {
            addCriterion("qc_center_address like", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressNotLike(String value) {
            addCriterion("qc_center_address not like", value, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressIn(List<String> values) {
            addCriterion("qc_center_address in", values, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressNotIn(List<String> values) {
            addCriterion("qc_center_address not in", values, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressBetween(String value1, String value2) {
            addCriterion("qc_center_address between", value1, value2, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterAddressNotBetween(String value1, String value2) {
            addCriterion("qc_center_address not between", value1, value2, "qcCenterAddress");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelIsNull() {
            addCriterion("qc_center_tel is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelIsNotNull() {
            addCriterion("qc_center_tel is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelEqualTo(String value) {
            addCriterion("qc_center_tel =", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelNotEqualTo(String value) {
            addCriterion("qc_center_tel <>", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelGreaterThan(String value) {
            addCriterion("qc_center_tel >", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_tel >=", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelLessThan(String value) {
            addCriterion("qc_center_tel <", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelLessThanOrEqualTo(String value) {
            addCriterion("qc_center_tel <=", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelLike(String value) {
            addCriterion("qc_center_tel like", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelNotLike(String value) {
            addCriterion("qc_center_tel not like", value, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelIn(List<String> values) {
            addCriterion("qc_center_tel in", values, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelNotIn(List<String> values) {
            addCriterion("qc_center_tel not in", values, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelBetween(String value1, String value2) {
            addCriterion("qc_center_tel between", value1, value2, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterTelNotBetween(String value1, String value2) {
            addCriterion("qc_center_tel not between", value1, value2, "qcCenterTel");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeIsNull() {
            addCriterion("qc_center_postcode is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeIsNotNull() {
            addCriterion("qc_center_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeEqualTo(String value) {
            addCriterion("qc_center_postcode =", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeNotEqualTo(String value) {
            addCriterion("qc_center_postcode <>", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeGreaterThan(String value) {
            addCriterion("qc_center_postcode >", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_postcode >=", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeLessThan(String value) {
            addCriterion("qc_center_postcode <", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeLessThanOrEqualTo(String value) {
            addCriterion("qc_center_postcode <=", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeLike(String value) {
            addCriterion("qc_center_postcode like", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeNotLike(String value) {
            addCriterion("qc_center_postcode not like", value, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeIn(List<String> values) {
            addCriterion("qc_center_postcode in", values, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeNotIn(List<String> values) {
            addCriterion("qc_center_postcode not in", values, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeBetween(String value1, String value2) {
            addCriterion("qc_center_postcode between", value1, value2, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterPostcodeNotBetween(String value1, String value2) {
            addCriterion("qc_center_postcode not between", value1, value2, "qcCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailIsNull() {
            addCriterion("qc_center_email is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailIsNotNull() {
            addCriterion("qc_center_email is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailEqualTo(String value) {
            addCriterion("qc_center_email =", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailNotEqualTo(String value) {
            addCriterion("qc_center_email <>", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailGreaterThan(String value) {
            addCriterion("qc_center_email >", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_email >=", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailLessThan(String value) {
            addCriterion("qc_center_email <", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailLessThanOrEqualTo(String value) {
            addCriterion("qc_center_email <=", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailLike(String value) {
            addCriterion("qc_center_email like", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailNotLike(String value) {
            addCriterion("qc_center_email not like", value, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailIn(List<String> values) {
            addCriterion("qc_center_email in", values, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailNotIn(List<String> values) {
            addCriterion("qc_center_email not in", values, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailBetween(String value1, String value2) {
            addCriterion("qc_center_email between", value1, value2, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterEmailNotBetween(String value1, String value2) {
            addCriterion("qc_center_email not between", value1, value2, "qcCenterEmail");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxIsNull() {
            addCriterion("qc_center_fax is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxIsNotNull() {
            addCriterion("qc_center_fax is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxEqualTo(String value) {
            addCriterion("qc_center_fax =", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxNotEqualTo(String value) {
            addCriterion("qc_center_fax <>", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxGreaterThan(String value) {
            addCriterion("qc_center_fax >", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_fax >=", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxLessThan(String value) {
            addCriterion("qc_center_fax <", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxLessThanOrEqualTo(String value) {
            addCriterion("qc_center_fax <=", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxLike(String value) {
            addCriterion("qc_center_fax like", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxNotLike(String value) {
            addCriterion("qc_center_fax not like", value, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxIn(List<String> values) {
            addCriterion("qc_center_fax in", values, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxNotIn(List<String> values) {
            addCriterion("qc_center_fax not in", values, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxBetween(String value1, String value2) {
            addCriterion("qc_center_fax between", value1, value2, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterFaxNotBetween(String value1, String value2) {
            addCriterion("qc_center_fax not between", value1, value2, "qcCenterFax");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoIsNull() {
            addCriterion("qc_center_meno is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoIsNotNull() {
            addCriterion("qc_center_meno is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoEqualTo(String value) {
            addCriterion("qc_center_meno =", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoNotEqualTo(String value) {
            addCriterion("qc_center_meno <>", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoGreaterThan(String value) {
            addCriterion("qc_center_meno >", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_meno >=", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoLessThan(String value) {
            addCriterion("qc_center_meno <", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoLessThanOrEqualTo(String value) {
            addCriterion("qc_center_meno <=", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoLike(String value) {
            addCriterion("qc_center_meno like", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoNotLike(String value) {
            addCriterion("qc_center_meno not like", value, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoIn(List<String> values) {
            addCriterion("qc_center_meno in", values, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoNotIn(List<String> values) {
            addCriterion("qc_center_meno not in", values, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoBetween(String value1, String value2) {
            addCriterion("qc_center_meno between", value1, value2, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterMenoNotBetween(String value1, String value2) {
            addCriterion("qc_center_meno not between", value1, value2, "qcCenterMeno");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerIsNull() {
            addCriterion("qc_center_manager is null");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerIsNotNull() {
            addCriterion("qc_center_manager is not null");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerEqualTo(String value) {
            addCriterion("qc_center_manager =", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerNotEqualTo(String value) {
            addCriterion("qc_center_manager <>", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerGreaterThan(String value) {
            addCriterion("qc_center_manager >", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerGreaterThanOrEqualTo(String value) {
            addCriterion("qc_center_manager >=", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerLessThan(String value) {
            addCriterion("qc_center_manager <", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerLessThanOrEqualTo(String value) {
            addCriterion("qc_center_manager <=", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerLike(String value) {
            addCriterion("qc_center_manager like", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerNotLike(String value) {
            addCriterion("qc_center_manager not like", value, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerIn(List<String> values) {
            addCriterion("qc_center_manager in", values, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerNotIn(List<String> values) {
            addCriterion("qc_center_manager not in", values, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerBetween(String value1, String value2) {
            addCriterion("qc_center_manager between", value1, value2, "qcCenterManager");
            return (Criteria) this;
        }

        public Criteria andQcCenterManagerNotBetween(String value1, String value2) {
            addCriterion("qc_center_manager not between", value1, value2, "qcCenterManager");
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