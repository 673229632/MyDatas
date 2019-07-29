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

public class PdDPatientInfoExample implements ModelColumnSupport, AutoGenExample {
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

    public PdDPatientInfoExample() {
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
        return PdDPatientInfoColumnEnum.values();
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andPdNoIsNull() {
            addCriterion("pd_no is null");
            return (Criteria) this;
        }

        public Criteria andPdNoIsNotNull() {
            addCriterion("pd_no is not null");
            return (Criteria) this;
        }

        public Criteria andPdNoEqualTo(String value) {
            addCriterion("pd_no =", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoNotEqualTo(String value) {
            addCriterion("pd_no <>", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoGreaterThan(String value) {
            addCriterion("pd_no >", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoGreaterThanOrEqualTo(String value) {
            addCriterion("pd_no >=", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoLessThan(String value) {
            addCriterion("pd_no <", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoLessThanOrEqualTo(String value) {
            addCriterion("pd_no <=", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoLike(String value) {
            addCriterion("pd_no like", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoNotLike(String value) {
            addCriterion("pd_no not like", value, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoIn(List<String> values) {
            addCriterion("pd_no in", values, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoNotIn(List<String> values) {
            addCriterion("pd_no not in", values, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoBetween(String value1, String value2) {
            addCriterion("pd_no between", value1, value2, "pdNo");
            return (Criteria) this;
        }

        public Criteria andPdNoNotBetween(String value1, String value2) {
            addCriterion("pd_no not between", value1, value2, "pdNo");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateIsNull() {
            addCriterion("first_dialsys_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateIsNotNull() {
            addCriterion("first_dialsys_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateEqualTo(Date value) {
            addCriterion("first_dialsys_date =", value, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateNotEqualTo(Date value) {
            addCriterion("first_dialsys_date <>", value, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateGreaterThan(Date value) {
            addCriterion("first_dialsys_date >", value, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateGreaterThanOrEqualTo(Date value) {
            addCriterion("first_dialsys_date >=", value, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateLessThan(Date value) {
            addCriterion("first_dialsys_date <", value, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateLessThanOrEqualTo(Date value) {
            addCriterion("first_dialsys_date <=", value, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateIn(List<Date> values) {
            addCriterion("first_dialsys_date in", values, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateNotIn(List<Date> values) {
            addCriterion("first_dialsys_date not in", values, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateBetween(Date value1, Date value2) {
            addCriterion("first_dialsys_date between", value1, value2, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andFirstDialsysDateNotBetween(Date value1, Date value2) {
            addCriterion("first_dialsys_date not between", value1, value2, "firstDialsysDate");
            return (Criteria) this;
        }

        public Criteria andBirthDayIsNull() {
            addCriterion("birth_day is null");
            return (Criteria) this;
        }

        public Criteria andBirthDayIsNotNull() {
            addCriterion("birth_day is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDayEqualTo(Date value) {
            addCriterion("birth_day =", value, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayNotEqualTo(Date value) {
            addCriterion("birth_day <>", value, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayGreaterThan(Date value) {
            addCriterion("birth_day >", value, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_day >=", value, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayLessThan(Date value) {
            addCriterion("birth_day <", value, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayLessThanOrEqualTo(Date value) {
            addCriterion("birth_day <=", value, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayIn(List<Date> values) {
            addCriterion("birth_day in", values, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayNotIn(List<Date> values) {
            addCriterion("birth_day not in", values, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayBetween(Date value1, Date value2) {
            addCriterion("birth_day between", value1, value2, "birthDay");
            return (Criteria) this;
        }

        public Criteria andBirthDayNotBetween(Date value1, Date value2) {
            addCriterion("birth_day not between", value1, value2, "birthDay");
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

        public Criteria andPhoneNoIsNull() {
            addCriterion("phone_no is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("phone_no is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("phone_no =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("phone_no <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("phone_no >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("phone_no >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("phone_no <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("phone_no <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("phone_no like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("phone_no not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("phone_no in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("phone_no not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("phone_no between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("phone_no not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseIsNull() {
            addCriterion("primary_disease is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseIsNotNull() {
            addCriterion("primary_disease is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseEqualTo(String value) {
            addCriterion("primary_disease =", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseNotEqualTo(String value) {
            addCriterion("primary_disease <>", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseGreaterThan(String value) {
            addCriterion("primary_disease >", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("primary_disease >=", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseLessThan(String value) {
            addCriterion("primary_disease <", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseLessThanOrEqualTo(String value) {
            addCriterion("primary_disease <=", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseLike(String value) {
            addCriterion("primary_disease like", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseNotLike(String value) {
            addCriterion("primary_disease not like", value, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseIn(List<String> values) {
            addCriterion("primary_disease in", values, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseNotIn(List<String> values) {
            addCriterion("primary_disease not in", values, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseBetween(String value1, String value2) {
            addCriterion("primary_disease between", value1, value2, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseNotBetween(String value1, String value2) {
            addCriterion("primary_disease not between", value1, value2, "primaryDisease");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateIsNull() {
            addCriterion("primary_disease_date is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateIsNotNull() {
            addCriterion("primary_disease_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateEqualTo(Date value) {
            addCriterion("primary_disease_date =", value, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateNotEqualTo(Date value) {
            addCriterion("primary_disease_date <>", value, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateGreaterThan(Date value) {
            addCriterion("primary_disease_date >", value, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("primary_disease_date >=", value, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateLessThan(Date value) {
            addCriterion("primary_disease_date <", value, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateLessThanOrEqualTo(Date value) {
            addCriterion("primary_disease_date <=", value, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateIn(List<Date> values) {
            addCriterion("primary_disease_date in", values, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateNotIn(List<Date> values) {
            addCriterion("primary_disease_date not in", values, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateBetween(Date value1, Date value2) {
            addCriterion("primary_disease_date between", value1, value2, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiseaseDateNotBetween(Date value1, Date value2) {
            addCriterion("primary_disease_date not between", value1, value2, "primaryDiseaseDate");
            return (Criteria) this;
        }

        public Criteria andPathologicIsNull() {
            addCriterion("pathologic is null");
            return (Criteria) this;
        }

        public Criteria andPathologicIsNotNull() {
            addCriterion("pathologic is not null");
            return (Criteria) this;
        }

        public Criteria andPathologicEqualTo(String value) {
            addCriterion("pathologic =", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicNotEqualTo(String value) {
            addCriterion("pathologic <>", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicGreaterThan(String value) {
            addCriterion("pathologic >", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicGreaterThanOrEqualTo(String value) {
            addCriterion("pathologic >=", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicLessThan(String value) {
            addCriterion("pathologic <", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicLessThanOrEqualTo(String value) {
            addCriterion("pathologic <=", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicLike(String value) {
            addCriterion("pathologic like", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicNotLike(String value) {
            addCriterion("pathologic not like", value, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicIn(List<String> values) {
            addCriterion("pathologic in", values, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicNotIn(List<String> values) {
            addCriterion("pathologic not in", values, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicBetween(String value1, String value2) {
            addCriterion("pathologic between", value1, value2, "pathologic");
            return (Criteria) this;
        }

        public Criteria andPathologicNotBetween(String value1, String value2) {
            addCriterion("pathologic not between", value1, value2, "pathologic");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNull() {
            addCriterion("allergy is null");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNotNull() {
            addCriterion("allergy is not null");
            return (Criteria) this;
        }

        public Criteria andAllergyEqualTo(String value) {
            addCriterion("allergy =", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotEqualTo(String value) {
            addCriterion("allergy <>", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThan(String value) {
            addCriterion("allergy >", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThanOrEqualTo(String value) {
            addCriterion("allergy >=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThan(String value) {
            addCriterion("allergy <", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThanOrEqualTo(String value) {
            addCriterion("allergy <=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLike(String value) {
            addCriterion("allergy like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotLike(String value) {
            addCriterion("allergy not like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyIn(List<String> values) {
            addCriterion("allergy in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotIn(List<String> values) {
            addCriterion("allergy not in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyBetween(String value1, String value2) {
            addCriterion("allergy between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotBetween(String value1, String value2) {
            addCriterion("allergy not between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesIsNull() {
            addCriterion("infection_diseases is null");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesIsNotNull() {
            addCriterion("infection_diseases is not null");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesEqualTo(String value) {
            addCriterion("infection_diseases =", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesNotEqualTo(String value) {
            addCriterion("infection_diseases <>", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesGreaterThan(String value) {
            addCriterion("infection_diseases >", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesGreaterThanOrEqualTo(String value) {
            addCriterion("infection_diseases >=", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesLessThan(String value) {
            addCriterion("infection_diseases <", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesLessThanOrEqualTo(String value) {
            addCriterion("infection_diseases <=", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesLike(String value) {
            addCriterion("infection_diseases like", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesNotLike(String value) {
            addCriterion("infection_diseases not like", value, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesIn(List<String> values) {
            addCriterion("infection_diseases in", values, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesNotIn(List<String> values) {
            addCriterion("infection_diseases not in", values, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesBetween(String value1, String value2) {
            addCriterion("infection_diseases between", value1, value2, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andInfectionDiseasesNotBetween(String value1, String value2) {
            addCriterion("infection_diseases not between", value1, value2, "infectionDiseases");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1IsNull() {
            addCriterion("medical_history1 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1IsNotNull() {
            addCriterion("medical_history1 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1EqualTo(String value) {
            addCriterion("medical_history1 =", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1NotEqualTo(String value) {
            addCriterion("medical_history1 <>", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1GreaterThan(String value) {
            addCriterion("medical_history1 >", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1GreaterThanOrEqualTo(String value) {
            addCriterion("medical_history1 >=", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1LessThan(String value) {
            addCriterion("medical_history1 <", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1LessThanOrEqualTo(String value) {
            addCriterion("medical_history1 <=", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1Like(String value) {
            addCriterion("medical_history1 like", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1NotLike(String value) {
            addCriterion("medical_history1 not like", value, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1In(List<String> values) {
            addCriterion("medical_history1 in", values, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1NotIn(List<String> values) {
            addCriterion("medical_history1 not in", values, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1Between(String value1, String value2) {
            addCriterion("medical_history1 between", value1, value2, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory1NotBetween(String value1, String value2) {
            addCriterion("medical_history1 not between", value1, value2, "medicalHistory1");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2IsNull() {
            addCriterion("medical_history2 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2IsNotNull() {
            addCriterion("medical_history2 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2EqualTo(String value) {
            addCriterion("medical_history2 =", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2NotEqualTo(String value) {
            addCriterion("medical_history2 <>", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2GreaterThan(String value) {
            addCriterion("medical_history2 >", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2GreaterThanOrEqualTo(String value) {
            addCriterion("medical_history2 >=", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2LessThan(String value) {
            addCriterion("medical_history2 <", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2LessThanOrEqualTo(String value) {
            addCriterion("medical_history2 <=", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2Like(String value) {
            addCriterion("medical_history2 like", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2NotLike(String value) {
            addCriterion("medical_history2 not like", value, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2In(List<String> values) {
            addCriterion("medical_history2 in", values, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2NotIn(List<String> values) {
            addCriterion("medical_history2 not in", values, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2Between(String value1, String value2) {
            addCriterion("medical_history2 between", value1, value2, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory2NotBetween(String value1, String value2) {
            addCriterion("medical_history2 not between", value1, value2, "medicalHistory2");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3IsNull() {
            addCriterion("medical_history3 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3IsNotNull() {
            addCriterion("medical_history3 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3EqualTo(String value) {
            addCriterion("medical_history3 =", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3NotEqualTo(String value) {
            addCriterion("medical_history3 <>", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3GreaterThan(String value) {
            addCriterion("medical_history3 >", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3GreaterThanOrEqualTo(String value) {
            addCriterion("medical_history3 >=", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3LessThan(String value) {
            addCriterion("medical_history3 <", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3LessThanOrEqualTo(String value) {
            addCriterion("medical_history3 <=", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3Like(String value) {
            addCriterion("medical_history3 like", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3NotLike(String value) {
            addCriterion("medical_history3 not like", value, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3In(List<String> values) {
            addCriterion("medical_history3 in", values, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3NotIn(List<String> values) {
            addCriterion("medical_history3 not in", values, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3Between(String value1, String value2) {
            addCriterion("medical_history3 between", value1, value2, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory3NotBetween(String value1, String value2) {
            addCriterion("medical_history3 not between", value1, value2, "medicalHistory3");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4IsNull() {
            addCriterion("medical_history4 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4IsNotNull() {
            addCriterion("medical_history4 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4EqualTo(String value) {
            addCriterion("medical_history4 =", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4NotEqualTo(String value) {
            addCriterion("medical_history4 <>", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4GreaterThan(String value) {
            addCriterion("medical_history4 >", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4GreaterThanOrEqualTo(String value) {
            addCriterion("medical_history4 >=", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4LessThan(String value) {
            addCriterion("medical_history4 <", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4LessThanOrEqualTo(String value) {
            addCriterion("medical_history4 <=", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4Like(String value) {
            addCriterion("medical_history4 like", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4NotLike(String value) {
            addCriterion("medical_history4 not like", value, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4In(List<String> values) {
            addCriterion("medical_history4 in", values, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4NotIn(List<String> values) {
            addCriterion("medical_history4 not in", values, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4Between(String value1, String value2) {
            addCriterion("medical_history4 between", value1, value2, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andMedicalHistory4NotBetween(String value1, String value2) {
            addCriterion("medical_history4 not between", value1, value2, "medicalHistory4");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeIsNull() {
            addCriterion("outcome_type is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeIsNotNull() {
            addCriterion("outcome_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeEqualTo(String value) {
            addCriterion("outcome_type =", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeNotEqualTo(String value) {
            addCriterion("outcome_type <>", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeGreaterThan(String value) {
            addCriterion("outcome_type >", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("outcome_type >=", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeLessThan(String value) {
            addCriterion("outcome_type <", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeLessThanOrEqualTo(String value) {
            addCriterion("outcome_type <=", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeLike(String value) {
            addCriterion("outcome_type like", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeNotLike(String value) {
            addCriterion("outcome_type not like", value, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeIn(List<String> values) {
            addCriterion("outcome_type in", values, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeNotIn(List<String> values) {
            addCriterion("outcome_type not in", values, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeBetween(String value1, String value2) {
            addCriterion("outcome_type between", value1, value2, "outcomeType");
            return (Criteria) this;
        }

        public Criteria andOutcomeTypeNotBetween(String value1, String value2) {
            addCriterion("outcome_type not between", value1, value2, "outcomeType");
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