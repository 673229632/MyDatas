//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMCheckResultTime extends PdMCheckResultTimeKey implements AutoGenEntity {
    /**
     * 评分名 (pd_m_check_result_time.check_name)
     */
    private String checkName;

    /**
     * 质控标准版本 (pd_m_check_result_time.standard_no)
     */
    private String standardNo;

    /**
     * 质控中心编号 (pd_m_check_result_time.qc_center_no)
     */
    private String qcCenterNo;

    /**
     * 评分开始时间 (pd_m_check_result_time.check_start_date)
     */
    private Date checkStartDate;

    /**
     * 评分截止时间 (pd_m_check_result_time.check_end_date)
     */
    private Date checkEndDate;

    /**
     * 发布开始时间 (pd_m_check_result_time.publish_start_date)
     */
    private Date publishStartDate;

    /**
     * 发布截止时间 (pd_m_check_result_time.publish_end_date)
     */
    private Date publishEndDate;

    /**
     * 发布标志（0已发布、1未发布） (pd_m_check_result_time.publish_status)
     */
    private String publishStatus;

    /**
     * 是否使用用上次评分（0：是，1:：否） (pd_m_check_result_time.use_sign)
     */
    private String useSign;

    /**
     * kpi项目 (pd_m_check_result_time.kpi_part)
     */
    private String kpiPart;

    /**
     * 删除标志 (pd_m_check_result_time.del_flag)
     */
    private String delFlag;

    /**
     * 表示顺序 (pd_m_check_result_time.order_index)
     */
    private Long orderIndex;

    /**
     * 登录人 (pd_m_check_result_time.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_m_check_result_time.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_m_check_result_time.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_m_check_result_time.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_m_check_result_time.row_version)
     */
    private Long rowVersion;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：评分名 (pd_m_check_result_time.check_name)
     *
     * @return checkName String
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * 设定：评分名 (pd_m_check_result_time.check_name)
     *
     * @param checkName String
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
        this._selectiveMark.put("checkName", true);
    }

    /**
     * 取得：质控标准版本 (pd_m_check_result_time.standard_no)
     *
     * @return standardNo String
     */
    public String getStandardNo() {
        return standardNo;
    }

    /**
     * 设定：质控标准版本 (pd_m_check_result_time.standard_no)
     *
     * @param standardNo String
     */
    public void setStandardNo(String standardNo) {
        this.standardNo = standardNo;
        this._selectiveMark.put("standardNo", true);
    }

    /**
     * 取得：质控中心编号 (pd_m_check_result_time.qc_center_no)
     *
     * @return qcCenterNo String
     */
    public String getQcCenterNo() {
        return qcCenterNo;
    }

    /**
     * 设定：质控中心编号 (pd_m_check_result_time.qc_center_no)
     *
     * @param qcCenterNo String
     */
    public void setQcCenterNo(String qcCenterNo) {
        this.qcCenterNo = qcCenterNo;
        this._selectiveMark.put("qcCenterNo", true);
    }

    /**
     * 取得：评分开始时间 (pd_m_check_result_time.check_start_date)
     *
     * @return checkStartDate Date
     */
    public Date getCheckStartDate() {
        return checkStartDate;
    }

    /**
     * 设定：评分开始时间 (pd_m_check_result_time.check_start_date)
     *
     * @param checkStartDate Date
     */
    public void setCheckStartDate(Date checkStartDate) {
        this.checkStartDate = checkStartDate;
        this._selectiveMark.put("checkStartDate", true);
    }

    /**
     * 取得：评分截止时间 (pd_m_check_result_time.check_end_date)
     *
     * @return checkEndDate Date
     */
    public Date getCheckEndDate() {
        return checkEndDate;
    }

    /**
     * 设定：评分截止时间 (pd_m_check_result_time.check_end_date)
     *
     * @param checkEndDate Date
     */
    public void setCheckEndDate(Date checkEndDate) {
        this.checkEndDate = checkEndDate;
        this._selectiveMark.put("checkEndDate", true);
    }

    /**
     * 取得：发布开始时间 (pd_m_check_result_time.publish_start_date)
     *
     * @return publishStartDate Date
     */
    public Date getPublishStartDate() {
        return publishStartDate;
    }

    /**
     * 设定：发布开始时间 (pd_m_check_result_time.publish_start_date)
     *
     * @param publishStartDate Date
     */
    public void setPublishStartDate(Date publishStartDate) {
        this.publishStartDate = publishStartDate;
        this._selectiveMark.put("publishStartDate", true);
    }

    /**
     * 取得：发布截止时间 (pd_m_check_result_time.publish_end_date)
     *
     * @return publishEndDate Date
     */
    public Date getPublishEndDate() {
        return publishEndDate;
    }

    /**
     * 设定：发布截止时间 (pd_m_check_result_time.publish_end_date)
     *
     * @param publishEndDate Date
     */
    public void setPublishEndDate(Date publishEndDate) {
        this.publishEndDate = publishEndDate;
        this._selectiveMark.put("publishEndDate", true);
    }

    /**
     * 取得：发布标志（0已发布、1未发布） (pd_m_check_result_time.publish_status)
     *
     * @return publishStatus String
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * 设定：发布标志（0已发布、1未发布） (pd_m_check_result_time.publish_status)
     *
     * @param publishStatus String
     */
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        this._selectiveMark.put("publishStatus", true);
    }

    /**
     * 取得：是否使用用上次评分（0：是，1:：否） (pd_m_check_result_time.use_sign)
     *
     * @return useSign String
     */
    public String getUseSign() {
        return useSign;
    }

    /**
     * 设定：是否使用用上次评分（0：是，1:：否） (pd_m_check_result_time.use_sign)
     *
     * @param useSign String
     */
    public void setUseSign(String useSign) {
        this.useSign = useSign;
        this._selectiveMark.put("useSign", true);
    }

    /**
     * 取得：kpi项目 (pd_m_check_result_time.kpi_part)
     *
     * @return kpiPart String
     */
    public String getKpiPart() {
        return kpiPart;
    }

    /**
     * 设定：kpi项目 (pd_m_check_result_time.kpi_part)
     *
     * @param kpiPart String
     */
    public void setKpiPart(String kpiPart) {
        this.kpiPart = kpiPart;
        this._selectiveMark.put("kpiPart", true);
    }

    /**
     * 取得：删除标志 (pd_m_check_result_time.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_m_check_result_time.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：表示顺序 (pd_m_check_result_time.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (pd_m_check_result_time.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：登录人 (pd_m_check_result_time.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_m_check_result_time.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_m_check_result_time.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_m_check_result_time.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_m_check_result_time.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_m_check_result_time.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_m_check_result_time.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_m_check_result_time.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_m_check_result_time.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_m_check_result_time.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}