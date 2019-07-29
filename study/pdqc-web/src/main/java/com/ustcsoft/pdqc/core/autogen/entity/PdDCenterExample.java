//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenExample;
import com.ustcsoft.mybatis.autogen.entity.ModelColumn;
import com.ustcsoft.mybatis.autogen.entity.ModelColumnSupport;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdDCenterExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDCenterExample() {
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
        return PdDCenterColumnEnum.values();
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

        public Criteria andPdCenterNoIsNull() {
            addCriterion("pd_center_no is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoIsNotNull() {
            addCriterion("pd_center_no is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoEqualTo(String value) {
            addCriterion("pd_center_no =", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoNotEqualTo(String value) {
            addCriterion("pd_center_no <>", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoGreaterThan(String value) {
            addCriterion("pd_center_no >", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center_no >=", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoLessThan(String value) {
            addCriterion("pd_center_no <", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoLessThanOrEqualTo(String value) {
            addCriterion("pd_center_no <=", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoLike(String value) {
            addCriterion("pd_center_no like", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoNotLike(String value) {
            addCriterion("pd_center_no not like", value, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoIn(List<String> values) {
            addCriterion("pd_center_no in", values, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoNotIn(List<String> values) {
            addCriterion("pd_center_no not in", values, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoBetween(String value1, String value2) {
            addCriterion("pd_center_no between", value1, value2, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNoNotBetween(String value1, String value2) {
            addCriterion("pd_center_no not between", value1, value2, "pdCenterNo");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameIsNull() {
            addCriterion("pd_center_name is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameIsNotNull() {
            addCriterion("pd_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameEqualTo(String value) {
            addCriterion("pd_center_name =", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameNotEqualTo(String value) {
            addCriterion("pd_center_name <>", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameGreaterThan(String value) {
            addCriterion("pd_center_name >", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center_name >=", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameLessThan(String value) {
            addCriterion("pd_center_name <", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameLessThanOrEqualTo(String value) {
            addCriterion("pd_center_name <=", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameLike(String value) {
            addCriterion("pd_center_name like", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameNotLike(String value) {
            addCriterion("pd_center_name not like", value, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameIn(List<String> values) {
            addCriterion("pd_center_name in", values, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameNotIn(List<String> values) {
            addCriterion("pd_center_name not in", values, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameBetween(String value1, String value2) {
            addCriterion("pd_center_name between", value1, value2, "pdCenterName");
            return (Criteria) this;
        }

        public Criteria andPdCenterNameNotBetween(String value1, String value2) {
            addCriterion("pd_center_name not between", value1, value2, "pdCenterName");
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

        public Criteria andAdjustOrgIsNull() {
            addCriterion("adjust_org is null");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgIsNotNull() {
            addCriterion("adjust_org is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgEqualTo(String value) {
            addCriterion("adjust_org =", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgNotEqualTo(String value) {
            addCriterion("adjust_org <>", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgGreaterThan(String value) {
            addCriterion("adjust_org >", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_org >=", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgLessThan(String value) {
            addCriterion("adjust_org <", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgLessThanOrEqualTo(String value) {
            addCriterion("adjust_org <=", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgLike(String value) {
            addCriterion("adjust_org like", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgNotLike(String value) {
            addCriterion("adjust_org not like", value, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgIn(List<String> values) {
            addCriterion("adjust_org in", values, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgNotIn(List<String> values) {
            addCriterion("adjust_org not in", values, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgBetween(String value1, String value2) {
            addCriterion("adjust_org between", value1, value2, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andAdjustOrgNotBetween(String value1, String value2) {
            addCriterion("adjust_org not between", value1, value2, "adjustOrg");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressIsNull() {
            addCriterion("pd_center__address is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressIsNotNull() {
            addCriterion("pd_center__address is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressEqualTo(String value) {
            addCriterion("pd_center__address =", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressNotEqualTo(String value) {
            addCriterion("pd_center__address <>", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressGreaterThan(String value) {
            addCriterion("pd_center__address >", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center__address >=", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressLessThan(String value) {
            addCriterion("pd_center__address <", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressLessThanOrEqualTo(String value) {
            addCriterion("pd_center__address <=", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressLike(String value) {
            addCriterion("pd_center__address like", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressNotLike(String value) {
            addCriterion("pd_center__address not like", value, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressIn(List<String> values) {
            addCriterion("pd_center__address in", values, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressNotIn(List<String> values) {
            addCriterion("pd_center__address not in", values, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressBetween(String value1, String value2) {
            addCriterion("pd_center__address between", value1, value2, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterAddressNotBetween(String value1, String value2) {
            addCriterion("pd_center__address not between", value1, value2, "pdCenterAddress");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelIsNull() {
            addCriterion("pd_center__tel is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelIsNotNull() {
            addCriterion("pd_center__tel is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelEqualTo(String value) {
            addCriterion("pd_center__tel =", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelNotEqualTo(String value) {
            addCriterion("pd_center__tel <>", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelGreaterThan(String value) {
            addCriterion("pd_center__tel >", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center__tel >=", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelLessThan(String value) {
            addCriterion("pd_center__tel <", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelLessThanOrEqualTo(String value) {
            addCriterion("pd_center__tel <=", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelLike(String value) {
            addCriterion("pd_center__tel like", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelNotLike(String value) {
            addCriterion("pd_center__tel not like", value, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelIn(List<String> values) {
            addCriterion("pd_center__tel in", values, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelNotIn(List<String> values) {
            addCriterion("pd_center__tel not in", values, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelBetween(String value1, String value2) {
            addCriterion("pd_center__tel between", value1, value2, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterTelNotBetween(String value1, String value2) {
            addCriterion("pd_center__tel not between", value1, value2, "pdCenterTel");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeIsNull() {
            addCriterion("pd_center__postcode is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeIsNotNull() {
            addCriterion("pd_center__postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeEqualTo(String value) {
            addCriterion("pd_center__postcode =", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeNotEqualTo(String value) {
            addCriterion("pd_center__postcode <>", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeGreaterThan(String value) {
            addCriterion("pd_center__postcode >", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center__postcode >=", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeLessThan(String value) {
            addCriterion("pd_center__postcode <", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeLessThanOrEqualTo(String value) {
            addCriterion("pd_center__postcode <=", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeLike(String value) {
            addCriterion("pd_center__postcode like", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeNotLike(String value) {
            addCriterion("pd_center__postcode not like", value, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeIn(List<String> values) {
            addCriterion("pd_center__postcode in", values, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeNotIn(List<String> values) {
            addCriterion("pd_center__postcode not in", values, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeBetween(String value1, String value2) {
            addCriterion("pd_center__postcode between", value1, value2, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterPostcodeNotBetween(String value1, String value2) {
            addCriterion("pd_center__postcode not between", value1, value2, "pdCenterPostcode");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailIsNull() {
            addCriterion("pd_center_email is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailIsNotNull() {
            addCriterion("pd_center_email is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailEqualTo(String value) {
            addCriterion("pd_center_email =", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailNotEqualTo(String value) {
            addCriterion("pd_center_email <>", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailGreaterThan(String value) {
            addCriterion("pd_center_email >", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center_email >=", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailLessThan(String value) {
            addCriterion("pd_center_email <", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailLessThanOrEqualTo(String value) {
            addCriterion("pd_center_email <=", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailLike(String value) {
            addCriterion("pd_center_email like", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailNotLike(String value) {
            addCriterion("pd_center_email not like", value, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailIn(List<String> values) {
            addCriterion("pd_center_email in", values, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailNotIn(List<String> values) {
            addCriterion("pd_center_email not in", values, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailBetween(String value1, String value2) {
            addCriterion("pd_center_email between", value1, value2, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterEmailNotBetween(String value1, String value2) {
            addCriterion("pd_center_email not between", value1, value2, "pdCenterEmail");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxIsNull() {
            addCriterion("pd_center__fax is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxIsNotNull() {
            addCriterion("pd_center__fax is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxEqualTo(String value) {
            addCriterion("pd_center__fax =", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxNotEqualTo(String value) {
            addCriterion("pd_center__fax <>", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxGreaterThan(String value) {
            addCriterion("pd_center__fax >", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center__fax >=", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxLessThan(String value) {
            addCriterion("pd_center__fax <", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxLessThanOrEqualTo(String value) {
            addCriterion("pd_center__fax <=", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxLike(String value) {
            addCriterion("pd_center__fax like", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxNotLike(String value) {
            addCriterion("pd_center__fax not like", value, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxIn(List<String> values) {
            addCriterion("pd_center__fax in", values, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxNotIn(List<String> values) {
            addCriterion("pd_center__fax not in", values, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxBetween(String value1, String value2) {
            addCriterion("pd_center__fax between", value1, value2, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterFaxNotBetween(String value1, String value2) {
            addCriterion("pd_center__fax not between", value1, value2, "pdCenterFax");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoIsNull() {
            addCriterion("pd_center__meno is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoIsNotNull() {
            addCriterion("pd_center__meno is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoEqualTo(String value) {
            addCriterion("pd_center__meno =", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoNotEqualTo(String value) {
            addCriterion("pd_center__meno <>", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoGreaterThan(String value) {
            addCriterion("pd_center__meno >", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center__meno >=", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoLessThan(String value) {
            addCriterion("pd_center__meno <", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoLessThanOrEqualTo(String value) {
            addCriterion("pd_center__meno <=", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoLike(String value) {
            addCriterion("pd_center__meno like", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoNotLike(String value) {
            addCriterion("pd_center__meno not like", value, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoIn(List<String> values) {
            addCriterion("pd_center__meno in", values, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoNotIn(List<String> values) {
            addCriterion("pd_center__meno not in", values, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoBetween(String value1, String value2) {
            addCriterion("pd_center__meno between", value1, value2, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterMenoNotBetween(String value1, String value2) {
            addCriterion("pd_center__meno not between", value1, value2, "pdCenterMeno");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaIsNull() {
            addCriterion("pd_center__area is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaIsNotNull() {
            addCriterion("pd_center__area is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaEqualTo(String value) {
            addCriterion("pd_center__area =", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaNotEqualTo(String value) {
            addCriterion("pd_center__area <>", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaGreaterThan(String value) {
            addCriterion("pd_center__area >", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center__area >=", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaLessThan(String value) {
            addCriterion("pd_center__area <", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaLessThanOrEqualTo(String value) {
            addCriterion("pd_center__area <=", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaLike(String value) {
            addCriterion("pd_center__area like", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaNotLike(String value) {
            addCriterion("pd_center__area not like", value, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaIn(List<String> values) {
            addCriterion("pd_center__area in", values, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaNotIn(List<String> values) {
            addCriterion("pd_center__area not in", values, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaBetween(String value1, String value2) {
            addCriterion("pd_center__area between", value1, value2, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterAreaNotBetween(String value1, String value2) {
            addCriterion("pd_center__area not between", value1, value2, "pdCenterArea");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerIsNull() {
            addCriterion("pd_center__manager is null");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerIsNotNull() {
            addCriterion("pd_center__manager is not null");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerEqualTo(String value) {
            addCriterion("pd_center__manager =", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerNotEqualTo(String value) {
            addCriterion("pd_center__manager <>", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerGreaterThan(String value) {
            addCriterion("pd_center__manager >", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerGreaterThanOrEqualTo(String value) {
            addCriterion("pd_center__manager >=", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerLessThan(String value) {
            addCriterion("pd_center__manager <", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerLessThanOrEqualTo(String value) {
            addCriterion("pd_center__manager <=", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerLike(String value) {
            addCriterion("pd_center__manager like", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerNotLike(String value) {
            addCriterion("pd_center__manager not like", value, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerIn(List<String> values) {
            addCriterion("pd_center__manager in", values, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerNotIn(List<String> values) {
            addCriterion("pd_center__manager not in", values, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerBetween(String value1, String value2) {
            addCriterion("pd_center__manager between", value1, value2, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andPdCenterManagerNotBetween(String value1, String value2) {
            addCriterion("pd_center__manager not between", value1, value2, "pdCenterManager");
            return (Criteria) this;
        }

        public Criteria andScoreWeightIsNull() {
            addCriterion("score_weight is null");
            return (Criteria) this;
        }

        public Criteria andScoreWeightIsNotNull() {
            addCriterion("score_weight is not null");
            return (Criteria) this;
        }

        public Criteria andScoreWeightEqualTo(BigDecimal value) {
            addCriterion("score_weight =", value, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightNotEqualTo(BigDecimal value) {
            addCriterion("score_weight <>", value, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightGreaterThan(BigDecimal value) {
            addCriterion("score_weight >", value, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score_weight >=", value, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightLessThan(BigDecimal value) {
            addCriterion("score_weight <", value, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score_weight <=", value, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightIn(List<BigDecimal> values) {
            addCriterion("score_weight in", values, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightNotIn(List<BigDecimal> values) {
            addCriterion("score_weight not in", values, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_weight between", value1, value2, "scoreWeight");
            return (Criteria) this;
        }

        public Criteria andScoreWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_weight not between", value1, value2, "scoreWeight");
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