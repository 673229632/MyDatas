//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDQcCenter extends PdDQcCenterKey implements AutoGenEntity {
    /**
     * 组织机构编号 (pd_d_qc_center.org_no)
     */
    private String orgNo;

    /**
     * 质控中心名称 (pd_d_qc_center.qc_center_name)
     */
    private String qcCenterName;

    /**
     * 地址 (pd_d_qc_center.qc_center_address)
     */
    private String qcCenterAddress;

    /**
     * 电话 (pd_d_qc_center.qc_center_tel)
     */
    private String qcCenterTel;

    /**
     * 邮编 (pd_d_qc_center.qc_center_postcode)
     */
    private String qcCenterPostcode;

    /**
     * email (pd_d_qc_center.qc_center_email)
     */
    private String qcCenterEmail;

    /**
     * 传真 (pd_d_qc_center.qc_center_fax)
     */
    private String qcCenterFax;

    /**
     * 备注 (pd_d_qc_center.qc_center_meno)
     */
    private String qcCenterMeno;

    /**
     * 负责人 (pd_d_qc_center.qc_center_manager)
     */
    private String qcCenterManager;

    /**
     * 表示顺序 (pd_d_qc_center.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (pd_d_qc_center.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_qc_center.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_qc_center.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_qc_center.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_qc_center.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_qc_center.row_version)
     */
    private Long rowVersion;

    /**
     * 画面ID (pd_d_qc_center.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：组织机构编号 (pd_d_qc_center.org_no)
     *
     * @return orgNo String
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设定：组织机构编号 (pd_d_qc_center.org_no)
     *
     * @param orgNo String
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        this._selectiveMark.put("orgNo", true);
    }

    /**
     * 取得：质控中心名称 (pd_d_qc_center.qc_center_name)
     *
     * @return qcCenterName String
     */
    public String getQcCenterName() {
        return qcCenterName;
    }

    /**
     * 设定：质控中心名称 (pd_d_qc_center.qc_center_name)
     *
     * @param qcCenterName String
     */
    public void setQcCenterName(String qcCenterName) {
        this.qcCenterName = qcCenterName;
        this._selectiveMark.put("qcCenterName", true);
    }

    /**
     * 取得：地址 (pd_d_qc_center.qc_center_address)
     *
     * @return qcCenterAddress String
     */
    public String getQcCenterAddress() {
        return qcCenterAddress;
    }

    /**
     * 设定：地址 (pd_d_qc_center.qc_center_address)
     *
     * @param qcCenterAddress String
     */
    public void setQcCenterAddress(String qcCenterAddress) {
        this.qcCenterAddress = qcCenterAddress;
        this._selectiveMark.put("qcCenterAddress", true);
    }

    /**
     * 取得：电话 (pd_d_qc_center.qc_center_tel)
     *
     * @return qcCenterTel String
     */
    public String getQcCenterTel() {
        return qcCenterTel;
    }

    /**
     * 设定：电话 (pd_d_qc_center.qc_center_tel)
     *
     * @param qcCenterTel String
     */
    public void setQcCenterTel(String qcCenterTel) {
        this.qcCenterTel = qcCenterTel;
        this._selectiveMark.put("qcCenterTel", true);
    }

    /**
     * 取得：邮编 (pd_d_qc_center.qc_center_postcode)
     *
     * @return qcCenterPostcode String
     */
    public String getQcCenterPostcode() {
        return qcCenterPostcode;
    }

    /**
     * 设定：邮编 (pd_d_qc_center.qc_center_postcode)
     *
     * @param qcCenterPostcode String
     */
    public void setQcCenterPostcode(String qcCenterPostcode) {
        this.qcCenterPostcode = qcCenterPostcode;
        this._selectiveMark.put("qcCenterPostcode", true);
    }

    /**
     * 取得：email (pd_d_qc_center.qc_center_email)
     *
     * @return qcCenterEmail String
     */
    public String getQcCenterEmail() {
        return qcCenterEmail;
    }

    /**
     * 设定：email (pd_d_qc_center.qc_center_email)
     *
     * @param qcCenterEmail String
     */
    public void setQcCenterEmail(String qcCenterEmail) {
        this.qcCenterEmail = qcCenterEmail;
        this._selectiveMark.put("qcCenterEmail", true);
    }

    /**
     * 取得：传真 (pd_d_qc_center.qc_center_fax)
     *
     * @return qcCenterFax String
     */
    public String getQcCenterFax() {
        return qcCenterFax;
    }

    /**
     * 设定：传真 (pd_d_qc_center.qc_center_fax)
     *
     * @param qcCenterFax String
     */
    public void setQcCenterFax(String qcCenterFax) {
        this.qcCenterFax = qcCenterFax;
        this._selectiveMark.put("qcCenterFax", true);
    }

    /**
     * 取得：备注 (pd_d_qc_center.qc_center_meno)
     *
     * @return qcCenterMeno String
     */
    public String getQcCenterMeno() {
        return qcCenterMeno;
    }

    /**
     * 设定：备注 (pd_d_qc_center.qc_center_meno)
     *
     * @param qcCenterMeno String
     */
    public void setQcCenterMeno(String qcCenterMeno) {
        this.qcCenterMeno = qcCenterMeno;
        this._selectiveMark.put("qcCenterMeno", true);
    }

    /**
     * 取得：负责人 (pd_d_qc_center.qc_center_manager)
     *
     * @return qcCenterManager String
     */
    public String getQcCenterManager() {
        return qcCenterManager;
    }

    /**
     * 设定：负责人 (pd_d_qc_center.qc_center_manager)
     *
     * @param qcCenterManager String
     */
    public void setQcCenterManager(String qcCenterManager) {
        this.qcCenterManager = qcCenterManager;
        this._selectiveMark.put("qcCenterManager", true);
    }

    /**
     * 取得：表示顺序 (pd_d_qc_center.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (pd_d_qc_center.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (pd_d_qc_center.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_qc_center.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_qc_center.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_qc_center.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_qc_center.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_qc_center.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_qc_center.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_qc_center.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_qc_center.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_qc_center.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_qc_center.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_qc_center.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_qc_center.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_qc_center.screen_id)
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