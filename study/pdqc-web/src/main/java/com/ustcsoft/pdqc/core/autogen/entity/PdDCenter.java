//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDCenter extends PdDCenterKey implements AutoGenEntity {
    /**
     * 透析中心名称 (PD_D_CENTER.pd_center_name)
     */
    private String pdCenterName;

    /**
     * 组织机构编号 (PD_D_CENTER.org_no)
     */
    private String orgNo;

    /**
     * 调整评分机构 (PD_D_CENTER.adjust_org)
     */
    private String adjustOrg;

    /**
     * 地址 (PD_D_CENTER.pd_center__address)
     */
    private String pdCenterAddress;

    /**
     * 电话 (PD_D_CENTER.pd_center__tel)
     */
    private String pdCenterTel;

    /**
     * 邮编 (PD_D_CENTER.pd_center__postcode)
     */
    private String pdCenterPostcode;

    /**
     * email (PD_D_CENTER.pd_center_email)
     */
    private String pdCenterEmail;

    /**
     * 传真 (PD_D_CENTER.pd_center__fax)
     */
    private String pdCenterFax;

    /**
     * 备注 (PD_D_CENTER.pd_center__meno)
     */
    private String pdCenterMeno;

    /**
     * 透析中心面积 (PD_D_CENTER.pd_center__area)
     */
    private String pdCenterArea;

    /**
     * 负责人 (PD_D_CENTER.pd_center__manager)
     */
    private String pdCenterManager;

    /**
     * 评分权重 (PD_D_CENTER.score_weight)
     */
    private BigDecimal scoreWeight;

    /**
     * 表示顺序 (PD_D_CENTER.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (PD_D_CENTER.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_D_CENTER.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_D_CENTER.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_D_CENTER.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_D_CENTER.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_D_CENTER.row_version)
     */
    private Long rowVersion;

    /**
     * 画面ID (PD_D_CENTER.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：透析中心名称 (PD_D_CENTER.pd_center_name)
     *
     * @return pdCenterName String
     */
    public String getPdCenterName() {
        return pdCenterName;
    }

    /**
     * 设定：透析中心名称 (PD_D_CENTER.pd_center_name)
     *
     * @param pdCenterName String
     */
    public void setPdCenterName(String pdCenterName) {
        this.pdCenterName = pdCenterName;
        this._selectiveMark.put("pdCenterName", true);
    }

    /**
     * 取得：组织机构编号 (PD_D_CENTER.org_no)
     *
     * @return orgNo String
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设定：组织机构编号 (PD_D_CENTER.org_no)
     *
     * @param orgNo String
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        this._selectiveMark.put("orgNo", true);
    }

    /**
     * 取得：调整评分机构 (PD_D_CENTER.adjust_org)
     *
     * @return adjustOrg String
     */
    public String getAdjustOrg() {
        return adjustOrg;
    }

    /**
     * 设定：调整评分机构 (PD_D_CENTER.adjust_org)
     *
     * @param adjustOrg String
     */
    public void setAdjustOrg(String adjustOrg) {
        this.adjustOrg = adjustOrg;
        this._selectiveMark.put("adjustOrg", true);
    }

    /**
     * 取得：地址 (PD_D_CENTER.pd_center__address)
     *
     * @return pdCenterAddress String
     */
    public String getPdCenterAddress() {
        return pdCenterAddress;
    }

    /**
     * 设定：地址 (PD_D_CENTER.pd_center__address)
     *
     * @param pdCenterAddress String
     */
    public void setPdCenterAddress(String pdCenterAddress) {
        this.pdCenterAddress = pdCenterAddress;
        this._selectiveMark.put("pdCenterAddress", true);
    }

    /**
     * 取得：电话 (PD_D_CENTER.pd_center__tel)
     *
     * @return pdCenterTel String
     */
    public String getPdCenterTel() {
        return pdCenterTel;
    }

    /**
     * 设定：电话 (PD_D_CENTER.pd_center__tel)
     *
     * @param pdCenterTel String
     */
    public void setPdCenterTel(String pdCenterTel) {
        this.pdCenterTel = pdCenterTel;
        this._selectiveMark.put("pdCenterTel", true);
    }

    /**
     * 取得：邮编 (PD_D_CENTER.pd_center__postcode)
     *
     * @return pdCenterPostcode String
     */
    public String getPdCenterPostcode() {
        return pdCenterPostcode;
    }

    /**
     * 设定：邮编 (PD_D_CENTER.pd_center__postcode)
     *
     * @param pdCenterPostcode String
     */
    public void setPdCenterPostcode(String pdCenterPostcode) {
        this.pdCenterPostcode = pdCenterPostcode;
        this._selectiveMark.put("pdCenterPostcode", true);
    }

    /**
     * 取得：email (PD_D_CENTER.pd_center_email)
     *
     * @return pdCenterEmail String
     */
    public String getPdCenterEmail() {
        return pdCenterEmail;
    }

    /**
     * 设定：email (PD_D_CENTER.pd_center_email)
     *
     * @param pdCenterEmail String
     */
    public void setPdCenterEmail(String pdCenterEmail) {
        this.pdCenterEmail = pdCenterEmail;
        this._selectiveMark.put("pdCenterEmail", true);
    }

    /**
     * 取得：传真 (PD_D_CENTER.pd_center__fax)
     *
     * @return pdCenterFax String
     */
    public String getPdCenterFax() {
        return pdCenterFax;
    }

    /**
     * 设定：传真 (PD_D_CENTER.pd_center__fax)
     *
     * @param pdCenterFax String
     */
    public void setPdCenterFax(String pdCenterFax) {
        this.pdCenterFax = pdCenterFax;
        this._selectiveMark.put("pdCenterFax", true);
    }

    /**
     * 取得：备注 (PD_D_CENTER.pd_center__meno)
     *
     * @return pdCenterMeno String
     */
    public String getPdCenterMeno() {
        return pdCenterMeno;
    }

    /**
     * 设定：备注 (PD_D_CENTER.pd_center__meno)
     *
     * @param pdCenterMeno String
     */
    public void setPdCenterMeno(String pdCenterMeno) {
        this.pdCenterMeno = pdCenterMeno;
        this._selectiveMark.put("pdCenterMeno", true);
    }

    /**
     * 取得：透析中心面积 (PD_D_CENTER.pd_center__area)
     *
     * @return pdCenterArea String
     */
    public String getPdCenterArea() {
        return pdCenterArea;
    }

    /**
     * 设定：透析中心面积 (PD_D_CENTER.pd_center__area)
     *
     * @param pdCenterArea String
     */
    public void setPdCenterArea(String pdCenterArea) {
        this.pdCenterArea = pdCenterArea;
        this._selectiveMark.put("pdCenterArea", true);
    }

    /**
     * 取得：负责人 (PD_D_CENTER.pd_center__manager)
     *
     * @return pdCenterManager String
     */
    public String getPdCenterManager() {
        return pdCenterManager;
    }

    /**
     * 设定：负责人 (PD_D_CENTER.pd_center__manager)
     *
     * @param pdCenterManager String
     */
    public void setPdCenterManager(String pdCenterManager) {
        this.pdCenterManager = pdCenterManager;
        this._selectiveMark.put("pdCenterManager", true);
    }

    /**
     * 取得：评分权重 (PD_D_CENTER.score_weight)
     *
     * @return scoreWeight BigDecimal
     */
    public BigDecimal getScoreWeight() {
        return scoreWeight;
    }

    /**
     * 设定：评分权重 (PD_D_CENTER.score_weight)
     *
     * @param scoreWeight BigDecimal
     */
    public void setScoreWeight(BigDecimal scoreWeight) {
        this.scoreWeight = scoreWeight;
        this._selectiveMark.put("scoreWeight", true);
    }

    /**
     * 取得：表示顺序 (PD_D_CENTER.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (PD_D_CENTER.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (PD_D_CENTER.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_D_CENTER.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_D_CENTER.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_D_CENTER.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_D_CENTER.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_D_CENTER.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_D_CENTER.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_D_CENTER.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_D_CENTER.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_D_CENTER.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_D_CENTER.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_D_CENTER.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (PD_D_CENTER.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (PD_D_CENTER.screen_id)
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