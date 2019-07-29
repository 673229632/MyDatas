//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMKpiseg extends PdMKpisegKey implements AutoGenEntity {
    /**
     * 子项目编码 (pd_m_kpiseg.sub_code)
     */
    private String subCode;

    /**
     * 子项目名称 (pd_m_kpiseg.sub_name)
     */
    private String subName;

    /**
     * 分段编码(1.偏低 2 正常 3偏高) (pd_m_kpiseg.segment_code)
     */
    private String segmentCode;

    /**
     * 分段名称 (pd_m_kpiseg.segment_name)
     */
    private String segmentName;

    /**
     * 单位编码 (pd_m_kpiseg.unit_code)
     */
    private String unitCode;

    /**
     * 单位名称 (pd_m_kpiseg.unit_name)
     */
    private String unitName;

    /**
     * 最小值 (pd_m_kpiseg.min_value)
     */
    private String minValue;

    /**
     * 最大值 (pd_m_kpiseg.max_value)
     */
    private String maxValue;

    /**
     * 表示顺序 (pd_m_kpiseg.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (pd_m_kpiseg.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_m_kpiseg.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_m_kpiseg.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_m_kpiseg.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_m_kpiseg.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_m_kpiseg.row_version)
     */
    private Long rowVersion;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：子项目编码 (pd_m_kpiseg.sub_code)
     *
     * @return subCode String
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * 设定：子项目编码 (pd_m_kpiseg.sub_code)
     *
     * @param subCode String
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
        this._selectiveMark.put("subCode", true);
    }

    /**
     * 取得：子项目名称 (pd_m_kpiseg.sub_name)
     *
     * @return subName String
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 设定：子项目名称 (pd_m_kpiseg.sub_name)
     *
     * @param subName String
     */
    public void setSubName(String subName) {
        this.subName = subName;
        this._selectiveMark.put("subName", true);
    }

    /**
     * 取得：分段编码(1.偏低 2 正常 3偏高) (pd_m_kpiseg.segment_code)
     *
     * @return segmentCode String
     */
    public String getSegmentCode() {
        return segmentCode;
    }

    /**
     * 设定：分段编码(1.偏低 2 正常 3偏高) (pd_m_kpiseg.segment_code)
     *
     * @param segmentCode String
     */
    public void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
        this._selectiveMark.put("segmentCode", true);
    }

    /**
     * 取得：分段名称 (pd_m_kpiseg.segment_name)
     *
     * @return segmentName String
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * 设定：分段名称 (pd_m_kpiseg.segment_name)
     *
     * @param segmentName String
     */
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
        this._selectiveMark.put("segmentName", true);
    }

    /**
     * 取得：单位编码 (pd_m_kpiseg.unit_code)
     *
     * @return unitCode String
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * 设定：单位编码 (pd_m_kpiseg.unit_code)
     *
     * @param unitCode String
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
        this._selectiveMark.put("unitCode", true);
    }

    /**
     * 取得：单位名称 (pd_m_kpiseg.unit_name)
     *
     * @return unitName String
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设定：单位名称 (pd_m_kpiseg.unit_name)
     *
     * @param unitName String
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
        this._selectiveMark.put("unitName", true);
    }

    /**
     * 取得：最小值 (pd_m_kpiseg.min_value)
     *
     * @return minValue String
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * 设定：最小值 (pd_m_kpiseg.min_value)
     *
     * @param minValue String
     */
    public void setMinValue(String minValue) {
        this.minValue = minValue;
        this._selectiveMark.put("minValue", true);
    }

    /**
     * 取得：最大值 (pd_m_kpiseg.max_value)
     *
     * @return maxValue String
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * 设定：最大值 (pd_m_kpiseg.max_value)
     *
     * @param maxValue String
     */
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
        this._selectiveMark.put("maxValue", true);
    }

    /**
     * 取得：表示顺序 (pd_m_kpiseg.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (pd_m_kpiseg.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (pd_m_kpiseg.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_m_kpiseg.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_m_kpiseg.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_m_kpiseg.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_m_kpiseg.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_m_kpiseg.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_m_kpiseg.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_m_kpiseg.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_m_kpiseg.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_m_kpiseg.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_m_kpiseg.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_m_kpiseg.row_version)
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