//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMUser extends PdMUserKey implements AutoGenEntity {
    /**
     * 组织机构编号 (pd_m_user.org_no)
     */
    private String orgNo;

    /**
     * 用户名 (pd_m_user.user_name)
     */
    private String userName;

    /**
     * 登录名 (pd_m_user.login_name)
     */
    private String loginName;

    /**
     * 登录密码 (pd_m_user.user_pass)
     */
    private String userPass;

    /**
     * 用户姓名 (pd_m_user.user_real_name)
     */
    private String userRealName;

    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师） (pd_m_user.user_type)
     */
    private String userType;

    /**
     * 联系电话 (pd_m_user.phone_num)
     */
    private String phoneNum;

    /**
     * email (pd_m_user.email)
     */
    private String email;

    /**
     * 皮肤字段 (pd_m_user.skinCss)
     */
    private String skincss;

    /**
     * 表示顺序 (pd_m_user.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (pd_m_user.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_m_user.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_m_user.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_m_user.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_m_user.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_m_user.row_version)
     */
    private Long rowVersion;

    /**
     * 画面ID (pd_m_user.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：组织机构编号 (pd_m_user.org_no)
     *
     * @return orgNo String
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设定：组织机构编号 (pd_m_user.org_no)
     *
     * @param orgNo String
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        this._selectiveMark.put("orgNo", true);
    }

    /**
     * 取得：用户名 (pd_m_user.user_name)
     *
     * @return userName String
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设定：用户名 (pd_m_user.user_name)
     *
     * @param userName String
     */
    public void setUserName(String userName) {
        this.userName = userName;
        this._selectiveMark.put("userName", true);
    }

    /**
     * 取得：登录名 (pd_m_user.login_name)
     *
     * @return loginName String
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设定：登录名 (pd_m_user.login_name)
     *
     * @param loginName String
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
        this._selectiveMark.put("loginName", true);
    }

    /**
     * 取得：登录密码 (pd_m_user.user_pass)
     *
     * @return userPass String
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * 设定：登录密码 (pd_m_user.user_pass)
     *
     * @param userPass String
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
        this._selectiveMark.put("userPass", true);
    }

    /**
     * 取得：用户姓名 (pd_m_user.user_real_name)
     *
     * @return userRealName String
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * 设定：用户姓名 (pd_m_user.user_real_name)
     *
     * @param userRealName String
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
        this._selectiveMark.put("userRealName", true);
    }

    /**
     * 取得：用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师） (pd_m_user.user_type)
     *
     * @return userType String
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设定：用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师） (pd_m_user.user_type)
     *
     * @param userType String
     */
    public void setUserType(String userType) {
        this.userType = userType;
        this._selectiveMark.put("userType", true);
    }

    /**
     * 取得：联系电话 (pd_m_user.phone_num)
     *
     * @return phoneNum String
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设定：联系电话 (pd_m_user.phone_num)
     *
     * @param phoneNum String
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        this._selectiveMark.put("phoneNum", true);
    }

    /**
     * 取得：email (pd_m_user.email)
     *
     * @return email String
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设定：email (pd_m_user.email)
     *
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
        this._selectiveMark.put("email", true);
    }

    /**
     * 取得：皮肤字段 (pd_m_user.skinCss)
     *
     * @return skincss String
     */
    public String getSkincss() {
        return skincss;
    }

    /**
     * 设定：皮肤字段 (pd_m_user.skinCss)
     *
     * @param skincss String
     */
    public void setSkincss(String skincss) {
        this.skincss = skincss;
        this._selectiveMark.put("skincss", true);
    }

    /**
     * 取得：表示顺序 (pd_m_user.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (pd_m_user.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (pd_m_user.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_m_user.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_m_user.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_m_user.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_m_user.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_m_user.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_m_user.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_m_user.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_m_user.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_m_user.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_m_user.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_m_user.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_m_user.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_m_user.screen_id)
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