//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdMSysFunc extends PdMSysFuncKey implements AutoGenEntity {
    /**
     * 模块名称 (PD_M_SYS_FUNC.func_name)
     */
    private String funcName;

    /**
     * 是否网页 (PD_M_SYS_FUNC.is_page)
     */
    private String isPage;

    /**
     * 连接地址 (PD_M_SYS_FUNC.url)
     */
    private String url;

    /**
     * 备注 (PD_M_SYS_FUNC.memo)
     */
    private String memo;

    /**
     * 是否显示 (PD_M_SYS_FUNC.is_show)
     */
    private String isShow;

    /**
     * 排序 (PD_M_SYS_FUNC.order_index)
     */
    private Integer orderIndex;

    /**
     * 父模块id (PD_M_SYS_FUNC.p_func_id)
     */
    private Integer pFuncId;

    /**
     * 删除标志 (PD_M_SYS_FUNC.del_flag)
     */
    private String delFlag;

    /**
     * 记录创建时间 (PD_M_SYS_FUNC.date_created)
     */
    private Date dateCreated;

    /**
     * 记录修改时间 (PD_M_SYS_FUNC.date_modified)
     */
    private Date dateModified;

    /**
     * 记录创建人 (PD_M_SYS_FUNC.created_by)
     */
    private String createdBy;

    /**
     * 记录修改人 (PD_M_SYS_FUNC.modified_by)
     */
    private String modifiedBy;

    /**
     * 画面id (PD_M_SYS_FUNC.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：模块名称 (PD_M_SYS_FUNC.func_name)
     *
     * @return funcName String
     */
    public String getFuncName() {
        return funcName;
    }

    /**
     * 设定：模块名称 (PD_M_SYS_FUNC.func_name)
     *
     * @param funcName String
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName;
        this._selectiveMark.put("funcName", true);
    }

    /**
     * 取得：是否网页 (PD_M_SYS_FUNC.is_page)
     *
     * @return isPage String
     */
    public String getIsPage() {
        return isPage;
    }

    /**
     * 设定：是否网页 (PD_M_SYS_FUNC.is_page)
     *
     * @param isPage String
     */
    public void setIsPage(String isPage) {
        this.isPage = isPage;
        this._selectiveMark.put("isPage", true);
    }

    /**
     * 取得：连接地址 (PD_M_SYS_FUNC.url)
     *
     * @return url String
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设定：连接地址 (PD_M_SYS_FUNC.url)
     *
     * @param url String
     */
    public void setUrl(String url) {
        this.url = url;
        this._selectiveMark.put("url", true);
    }

    /**
     * 取得：备注 (PD_M_SYS_FUNC.memo)
     *
     * @return memo String
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设定：备注 (PD_M_SYS_FUNC.memo)
     *
     * @param memo String
     */
    public void setMemo(String memo) {
        this.memo = memo;
        this._selectiveMark.put("memo", true);
    }

    /**
     * 取得：是否显示 (PD_M_SYS_FUNC.is_show)
     *
     * @return isShow String
     */
    public String getIsShow() {
        return isShow;
    }

    /**
     * 设定：是否显示 (PD_M_SYS_FUNC.is_show)
     *
     * @param isShow String
     */
    public void setIsShow(String isShow) {
        this.isShow = isShow;
        this._selectiveMark.put("isShow", true);
    }

    /**
     * 取得：排序 (PD_M_SYS_FUNC.order_index)
     *
     * @return orderIndex Integer
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设定：排序 (PD_M_SYS_FUNC.order_index)
     *
     * @param orderIndex Integer
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
        this._selectiveMark.put("orderIndex", true);
    }

    /**
     * 取得：父模块id (PD_M_SYS_FUNC.p_func_id)
     *
     * @return pFuncId Integer
     */
    public Integer getpFuncId() {
        return pFuncId;
    }

    /**
     * 设定：父模块id (PD_M_SYS_FUNC.p_func_id)
     *
     * @param pFuncId Integer
     */
    public void setpFuncId(Integer pFuncId) {
        this.pFuncId = pFuncId;
        this._selectiveMark.put("pFuncId", true);
    }

    /**
     * 取得：删除标志 (PD_M_SYS_FUNC.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_M_SYS_FUNC.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：记录创建时间 (PD_M_SYS_FUNC.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：记录创建时间 (PD_M_SYS_FUNC.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：记录修改时间 (PD_M_SYS_FUNC.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：记录修改时间 (PD_M_SYS_FUNC.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：记录创建人 (PD_M_SYS_FUNC.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：记录创建人 (PD_M_SYS_FUNC.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：记录修改人 (PD_M_SYS_FUNC.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：记录修改人 (PD_M_SYS_FUNC.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：画面id (PD_M_SYS_FUNC.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面id (PD_M_SYS_FUNC.screen_id)
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