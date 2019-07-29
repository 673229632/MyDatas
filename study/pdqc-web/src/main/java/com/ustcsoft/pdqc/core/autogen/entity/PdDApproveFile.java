//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDApproveFile extends PdDApproveFileKey implements AutoGenEntity {
    /**
     * 文件名称 (PD_D_APPROVE_FILE.file_name)
     */
    private String fileName;

    /**
     *  (PD_D_APPROVE_FILE.n_file_name)
     */
    private String nFileName;

    /**
     * 保存地址 (PD_D_APPROVE_FILE.file_path)
     */
    private String filePath;

    /**
     * 组织编号 (PD_D_APPROVE_FILE.org_no)
     */
    private String orgNo;

    /**
     * 患者编号 (PD_D_APPROVE_FILE.pnt_id)
     */
    private String pntId;

    /**
     * 职员编号 (PD_D_APPROVE_FILE.employee_no)
     */
    private String employeeNo;

    /**
     * 类型编号 (PD_D_APPROVE_FILE.file_type_no)
     */
    private String fileTypeNo;

    /**
     * 文件类型（0视频，1图片，2文档） (PD_D_APPROVE_FILE.format_type)
     */
    private String formatType;

    /**
     * 文件顺序(标识同一类型的不同文件) (PD_D_APPROVE_FILE.file_order)
     */
    private Integer fileOrder;

    /**
     * 表示顺序 (PD_D_APPROVE_FILE.order_index)
     */
    private Long orderIndex;

    /**
     * 删除标志 (PD_D_APPROVE_FILE.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_D_APPROVE_FILE.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_D_APPROVE_FILE.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_D_APPROVE_FILE.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_D_APPROVE_FILE.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_D_APPROVE_FILE.row_version)
     */
    private Long rowVersion;

    /**
     * 画面id (PD_D_APPROVE_FILE.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：文件名称 (PD_D_APPROVE_FILE.file_name)
     *
     * @return fileName String
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设定：文件名称 (PD_D_APPROVE_FILE.file_name)
     *
     * @param fileName String
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
        this._selectiveMark.put("fileName", true);
    }

    /**
     * 取得： (PD_D_APPROVE_FILE.n_file_name)
     *
     * @return nFileName String
     */
    public String getnFileName() {
        return nFileName;
    }

    /**
     * 设定： (PD_D_APPROVE_FILE.n_file_name)
     *
     * @param nFileName String
     */
    public void setnFileName(String nFileName) {
        this.nFileName = nFileName;
        this._selectiveMark.put("nFileName", true);
    }

    /**
     * 取得：保存地址 (PD_D_APPROVE_FILE.file_path)
     *
     * @return filePath String
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设定：保存地址 (PD_D_APPROVE_FILE.file_path)
     *
     * @param filePath String
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
        this._selectiveMark.put("filePath", true);
    }

    /**
     * 取得：组织编号 (PD_D_APPROVE_FILE.org_no)
     *
     * @return orgNo String
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设定：组织编号 (PD_D_APPROVE_FILE.org_no)
     *
     * @param orgNo String
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
        this._selectiveMark.put("orgNo", true);
    }

    /**
     * 取得：患者编号 (PD_D_APPROVE_FILE.pnt_id)
     *
     * @return pntId String
     */
    public String getPntId() {
        return pntId;
    }

    /**
     * 设定：患者编号 (PD_D_APPROVE_FILE.pnt_id)
     *
     * @param pntId String
     */
    public void setPntId(String pntId) {
        this.pntId = pntId;
        this._selectiveMark.put("pntId", true);
    }

    /**
     * 取得：职员编号 (PD_D_APPROVE_FILE.employee_no)
     *
     * @return employeeNo String
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 设定：职员编号 (PD_D_APPROVE_FILE.employee_no)
     *
     * @param employeeNo String
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
        this._selectiveMark.put("employeeNo", true);
    }

    /**
     * 取得：类型编号 (PD_D_APPROVE_FILE.file_type_no)
     *
     * @return fileTypeNo String
     */
    public String getFileTypeNo() {
        return fileTypeNo;
    }

    /**
     * 设定：类型编号 (PD_D_APPROVE_FILE.file_type_no)
     *
     * @param fileTypeNo String
     */
    public void setFileTypeNo(String fileTypeNo) {
        this.fileTypeNo = fileTypeNo;
        this._selectiveMark.put("fileTypeNo", true);
    }

    /**
     * 取得：文件类型（0视频，1图片，2文档） (PD_D_APPROVE_FILE.format_type)
     *
     * @return formatType String
     */
    public String getFormatType() {
        return formatType;
    }

    /**
     * 设定：文件类型（0视频，1图片，2文档） (PD_D_APPROVE_FILE.format_type)
     *
     * @param formatType String
     */
    public void setFormatType(String formatType) {
        this.formatType = formatType;
        this._selectiveMark.put("formatType", true);
    }

    /**
     * 取得：文件顺序(标识同一类型的不同文件) (PD_D_APPROVE_FILE.file_order)
     *
     * @return fileOrder Integer
     */
    public Integer getFileOrder() {
        return fileOrder;
    }

    /**
     * 设定：文件顺序(标识同一类型的不同文件) (PD_D_APPROVE_FILE.file_order)
     *
     * @param fileOrder Integer
     */
    public void setFileOrder(Integer fileOrder) {
        this.fileOrder = fileOrder;
        this._selectiveMark.put("fileOrder", true);
    }

    /**
     * 取得：表示顺序 (PD_D_APPROVE_FILE.order_index)
     *
     * @return orderIndex Long
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：表示顺序 (PD_D_APPROVE_FILE.order_index)
     *
     * @param orderIndex Long
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：删除标志 (PD_D_APPROVE_FILE.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_D_APPROVE_FILE.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_D_APPROVE_FILE.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_D_APPROVE_FILE.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_D_APPROVE_FILE.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_D_APPROVE_FILE.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_D_APPROVE_FILE.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_D_APPROVE_FILE.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_D_APPROVE_FILE.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_D_APPROVE_FILE.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_D_APPROVE_FILE.row_version)
     *
     * @return rowVersion Long
     */
    public Long getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_D_APPROVE_FILE.row_version)
     *
     * @param rowVersion Long
     */
    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面id (PD_D_APPROVE_FILE.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面id (PD_D_APPROVE_FILE.screen_id)
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