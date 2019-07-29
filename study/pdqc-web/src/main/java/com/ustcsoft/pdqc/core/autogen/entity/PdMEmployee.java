//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMEmployee extends PdMEmployeeKey implements AutoGenEntity {
    /**
     * 组织机构编号 (PD_M_EMPLOYEE.org_no)
     */
    private String orgNo;

    /**
     * 姓名 (PD_M_EMPLOYEE.employee_name)
     */
    private String employeeName;

    /**
     * 性别 (PD_M_EMPLOYEE.employee_sex)
     */
    private String employeeSex;

    /**
     * 0.专家 1.普通科员 2.主任 (PD_M_EMPLOYEE.employee_type)
     */
    private String employeeType;

    /**
     * 证件类型 (PD_M_EMPLOYEE.certificate_type)
     */
    private String certificateType;

    /**
     * 证件编号 (PD_M_EMPLOYEE.certificate_no)
     */
    private String certificateNo;

    /**
     * 身份证编号 (PD_M_EMPLOYEE.id_card_no)
     */
    private String idCardNo;

    /**
     * 出生日期 (PD_M_EMPLOYEE.birthday)
     */
    private Date birthday;

    /**
     * 电话 (PD_M_EMPLOYEE.employee_tel)
     */
    private String employeeTel;

    /**
     * 医疗行业从业年限 (PD_M_EMPLOYEE.medi_year)
     */
    private String mediYear;

    /**
     * 血液净化工作从业年限 (PD_M_EMPLOYEE.dial_year)
     */
    private String dialYear;

    /**
     * 手机 (PD_M_EMPLOYEE.employee_mobile)
     */
    private String employeeMobile;

    /**
     * 住址 (PD_M_EMPLOYEE.employee_address)
     */
    private String employeeAddress;

    /**
     * 表示顺序 (PD_M_EMPLOYEE.order_index)
     */
    private Long orderIndex;

    /**
     *  (PD_M_EMPLOYEE.work_start)
     */
    private Date workStart;

    /**
     *  (PD_M_EMPLOYEE.education)
     */
    private String education;

    /**
     *  (PD_M_EMPLOYEE.employee_email)
     */
    private String employeeEmail;

    /**
     * 职务 (PD_M_EMPLOYEE.employee_post)
     */
    private String employeePost;

    /**
     * 是否兼职 0：是 1：否 (PD_M_EMPLOYEE.is_parttime)
     */
    private String isParttime;

    /**
     * 是否参与评分 0：是 1：否 (PD_M_EMPLOYEE.is_check)
     */
    private String isCheck;

    /**
     * 删除标志 (PD_M_EMPLOYEE.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_M_EMPLOYEE.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_M_EMPLOYEE.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_M_EMPLOYEE.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_M_EMPLOYEE.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_M_EMPLOYEE.row_version)
     */
    private Long rowVersion;

    /**
     * 画面ID (PD_M_EMPLOYEE.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：组织机构编号 (PD_M_EMPLOYEE.org_no)
     *
     * @return orgNo String
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设定：组织机构编号 (PD_M_EMPLOYEE.org_no)
     *
     * @param orgNo String
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        this._selectiveMark.put("orgNo", true);
    }

    /**
     * 取得：姓名 (PD_M_EMPLOYEE.employee_name)
     *
     * @return employeeName String
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设定：姓名 (PD_M_EMPLOYEE.employee_name)
     *
     * @param employeeName String
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        this._selectiveMark.put("employeeName", true);
    }

    /**
     * 取得：性别 (PD_M_EMPLOYEE.employee_sex)
     *
     * @return employeeSex String
     */
    public String getEmployeeSex() {
        return employeeSex;
    }

    /**
     * 设定：性别 (PD_M_EMPLOYEE.employee_sex)
     *
     * @param employeeSex String
     */
    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
        this._selectiveMark.put("employeeSex", true);
    }

    /**
     * 取得：0.专家 1.普通科员 2.主任 (PD_M_EMPLOYEE.employee_type)
     *
     * @return employeeType String
     */
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * 设定：0.专家 1.普通科员 2.主任 (PD_M_EMPLOYEE.employee_type)
     *
     * @param employeeType String
     */
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
        this._selectiveMark.put("employeeType", true);
    }

    /**
     * 取得：证件类型 (PD_M_EMPLOYEE.certificate_type)
     *
     * @return certificateType String
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * 设定：证件类型 (PD_M_EMPLOYEE.certificate_type)
     *
     * @param certificateType String
     */
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        this._selectiveMark.put("certificateType", true);
    }

    /**
     * 取得：证件编号 (PD_M_EMPLOYEE.certificate_no)
     *
     * @return certificateNo String
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 设定：证件编号 (PD_M_EMPLOYEE.certificate_no)
     *
     * @param certificateNo String
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        this._selectiveMark.put("certificateNo", true);
    }

    /**
     * 取得：身份证编号 (PD_M_EMPLOYEE.id_card_no)
     *
     * @return idCardNo String
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * 设定：身份证编号 (PD_M_EMPLOYEE.id_card_no)
     *
     * @param idCardNo String
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
        this._selectiveMark.put("idCardNo", true);
    }

    /**
     * 取得：出生日期 (PD_M_EMPLOYEE.birthday)
     *
     * @return birthday Date
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设定：出生日期 (PD_M_EMPLOYEE.birthday)
     *
     * @param birthday Date
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
        this._selectiveMark.put("birthday", true);
    }

    /**
     * 取得：电话 (PD_M_EMPLOYEE.employee_tel)
     *
     * @return employeeTel String
     */
    public String getEmployeeTel() {
        return employeeTel;
    }

    /**
     * 设定：电话 (PD_M_EMPLOYEE.employee_tel)
     *
     * @param employeeTel String
     */
    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel;
        this._selectiveMark.put("employeeTel", true);
    }

    /**
     * 取得：医疗行业从业年限 (PD_M_EMPLOYEE.medi_year)
     *
     * @return mediYear String
     */
    public String getMediYear() {
        return mediYear;
    }

    /**
     * 设定：医疗行业从业年限 (PD_M_EMPLOYEE.medi_year)
     *
     * @param mediYear String
     */
    public void setMediYear(String mediYear) {
        this.mediYear = mediYear;
        this._selectiveMark.put("mediYear", true);
    }

    /**
     * 取得：血液净化工作从业年限 (PD_M_EMPLOYEE.dial_year)
     *
     * @return dialYear String
     */
    public String getDialYear() {
        return dialYear;
    }

    /**
     * 设定：血液净化工作从业年限 (PD_M_EMPLOYEE.dial_year)
     *
     * @param dialYear String
     */
    public void setDialYear(String dialYear) {
        this.dialYear = dialYear;
        this._selectiveMark.put("dialYear", true);
    }

    /**
     * 取得：手机 (PD_M_EMPLOYEE.employee_mobile)
     *
     * @return employeeMobile String
     */
    public String getEmployeeMobile() {
        return employeeMobile;
    }

    /**
     * 设定：手机 (PD_M_EMPLOYEE.employee_mobile)
     *
     * @param employeeMobile String
     */
    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
        this._selectiveMark.put("employeeMobile", true);
    }

    /**
     * 取得：住址 (PD_M_EMPLOYEE.employee_address)
     *
     * @return employeeAddress String
     */
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    /**
     * 设定：住址 (PD_M_EMPLOYEE.employee_address)
     *
     * @param employeeAddress String
     */
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
        this._selectiveMark.put("employeeAddress", true);
    }

    /**
     * 取得：表示顺序 (PD_M_EMPLOYEE.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (PD_M_EMPLOYEE.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得： (PD_M_EMPLOYEE.work_start)
     *
     * @return workStart Date
     */
    public Date getWorkStart() {
        return workStart;
    }

    /**
     * 设定： (PD_M_EMPLOYEE.work_start)
     *
     * @param workStart Date
     */
    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
        this._selectiveMark.put("workStart", true);
    }

    /**
     * 取得： (PD_M_EMPLOYEE.education)
     *
     * @return education String
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设定： (PD_M_EMPLOYEE.education)
     *
     * @param education String
     */
    public void setEducation(String education) {
        this.education = education;
        this._selectiveMark.put("education", true);
    }

    /**
     * 取得： (PD_M_EMPLOYEE.employee_email)
     *
     * @return employeeEmail String
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * 设定： (PD_M_EMPLOYEE.employee_email)
     *
     * @param employeeEmail String
     */
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
        this._selectiveMark.put("employeeEmail", true);
    }

    /**
     * 取得：职务 (PD_M_EMPLOYEE.employee_post)
     *
     * @return employeePost String
     */
    public String getEmployeePost() {
        return employeePost;
    }

    /**
     * 设定：职务 (PD_M_EMPLOYEE.employee_post)
     *
     * @param employeePost String
     */
    public void setEmployeePost(String employeePost) {
        this.employeePost = employeePost;
        this._selectiveMark.put("employeePost", true);
    }

    /**
     * 取得：是否兼职 0：是 1：否 (PD_M_EMPLOYEE.is_parttime)
     *
     * @return isParttime String
     */
    public String getIsParttime() {
        return isParttime;
    }

    /**
     * 设定：是否兼职 0：是 1：否 (PD_M_EMPLOYEE.is_parttime)
     *
     * @param isParttime String
     */
    public void setIsParttime(String isParttime) {
        this.isParttime = isParttime;
        this._selectiveMark.put("isParttime", true);
    }

    /**
     * 取得：是否参与评分 0：是 1：否 (PD_M_EMPLOYEE.is_check)
     *
     * @return isCheck String
     */
    public String getIsCheck() {
        return isCheck;
    }

    /**
     * 设定：是否参与评分 0：是 1：否 (PD_M_EMPLOYEE.is_check)
     *
     * @param isCheck String
     */
    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
        this._selectiveMark.put("isCheck", true);
    }

    /**
     * 取得：删除标志 (PD_M_EMPLOYEE.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_M_EMPLOYEE.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_M_EMPLOYEE.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_M_EMPLOYEE.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_M_EMPLOYEE.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_M_EMPLOYEE.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_M_EMPLOYEE.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_M_EMPLOYEE.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_M_EMPLOYEE.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_M_EMPLOYEE.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_M_EMPLOYEE.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_M_EMPLOYEE.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (PD_M_EMPLOYEE.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (PD_M_EMPLOYEE.screen_id)
     *
     * @param screenId String
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
        this._selectiveMark.put("screenId", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}