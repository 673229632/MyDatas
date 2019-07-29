package com.ustcsoft.pdqc.web.systemmanagement.form;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationKey;

public class OrganizationForm extends BaseEntity { 
    
    private String orgNo;
    
    /**
     * 子节点
     */
    private List<String> childList;
    
    /**
     * 组织机构类别（1：qc 2:透析中心） (pd_m_organization.org_type)
     */
    private String orgType;

    /**
     * 上级组织机构编码 (pd_m_organization.parent_no)
     */
    private String parentNo;

    /**
     * 机构等级(1.省级别2.市级别.3.市级别透析中心) (pd_m_organization.org_lvl)
     */
    private String orgLvl;

    /**
     * 表示顺序 (pd_m_organization.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (pd_m_organization.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_m_organization.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_m_organization.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_m_organization.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_m_organization.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_m_organization.row_version)
     */
    private Long rowVersion;

    /**
     * 画面ID (pd_m_organization.ScreenId)
     */
    private String screenid;

    /**
     * @return the childList
     */
    public List<String> getChildList() {
        return childList;
    }

    

    /**
     * @return the orgNo
     */
    public String getOrgNo() {
        return orgNo;
    }



    /**
     * @param orgNo the orgNo to set
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }



    /**
     * @return the orgType
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * @param orgType the orgType to set
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * @return the parentNo
     */
    public String getParentNo() {
        return parentNo;
    }

    /**
     * @param parentNo the parentNo to set
     */
    public void setParentNo(String parentNo) {
        this.parentNo = parentNo;
    }

    /**
     * @return the orgLvl
     */
    public String getOrgLvl() {
        return orgLvl;
    }

    /**
     * @param orgLvl the orgLvl to set
     */
    public void setOrgLvl(String orgLvl) {
        this.orgLvl = orgLvl;
    }

    /**
     * @return the orderIndex
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * @param orderIndex the orderIndex to set
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
    }

    /**
     * @return the delFlag
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag the delFlag to set
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy the modifiedBy to set
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return the dateModified
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * @param dateModified the dateModified to set
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * @return the rowVersion
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * @param rowVersion the rowVersion to set
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
    }

    /**
     * @return the screenid
     */
    public String getScreenid() {
        return screenid;
    }

    /**
     * @param screenid the screenid to set
     */
    public void setScreenid(String screenid) {
        this.screenid = screenid;
    }

    /**
     * @param childList the childList to set
     */
    public void setChildList(List<String> childList) {
        this.childList = childList;
    }

    
}
