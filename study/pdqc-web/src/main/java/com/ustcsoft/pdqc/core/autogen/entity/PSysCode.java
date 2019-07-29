//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PSysCode extends PSysCodeKey implements AutoGenEntity {
    /**
     * 码表类型id (p_sys_code.code_type_id)
     */
    private Integer codeTypeId;

    /**
     * 码值内部序号 (p_sys_code.code_in_value)
     */
    private String codeInValue;

    /**
     * 码值 (p_sys_code.code_value)
     */
    private String codeValue;

    /**
     * 码值说明 (p_sys_code.code_name)
     */
    private String codeName;

    /**
     * 记录创建时间 (p_sys_code.date_created)
     */
    private Date dateCreated;

    /**
     * 记录修改时间 (p_sys_code.date_modified)
     */
    private Date dateModified;

    /**
     * 记录创建人 (p_sys_code.created_by)
     */
    private String createdBy;

    /**
     * 记录修改人 (p_sys_code.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：码表类型id (p_sys_code.code_type_id)
     *
     * @return codeTypeId Integer
     */
    public Integer getCodeTypeId() {
        return codeTypeId;
    }

    /**
     * 设定：码表类型id (p_sys_code.code_type_id)
     *
     * @param codeTypeId Integer
     */
    public void setCodeTypeId(Integer codeTypeId) {
        this.codeTypeId = codeTypeId;
        this._selectiveMark.put("codeTypeId", true);
    }

    /**
     * 取得：码值内部序号 (p_sys_code.code_in_value)
     *
     * @return codeInValue String
     */
    public String getCodeInValue() {
        return codeInValue;
    }

    /**
     * 设定：码值内部序号 (p_sys_code.code_in_value)
     *
     * @param codeInValue String
     */
    public void setCodeInValue(String codeInValue) {
        this.codeInValue = codeInValue;
        this._selectiveMark.put("codeInValue", true);
    }

    /**
     * 取得：码值 (p_sys_code.code_value)
     *
     * @return codeValue String
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * 设定：码值 (p_sys_code.code_value)
     *
     * @param codeValue String
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
        this._selectiveMark.put("codeValue", true);
    }

    /**
     * 取得：码值说明 (p_sys_code.code_name)
     *
     * @return codeName String
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 设定：码值说明 (p_sys_code.code_name)
     *
     * @param codeName String
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
        this._selectiveMark.put("codeName", true);
    }

    /**
     * 取得：记录创建时间 (p_sys_code.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：记录创建时间 (p_sys_code.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：记录修改时间 (p_sys_code.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：记录修改时间 (p_sys_code.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：记录创建人 (p_sys_code.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：记录创建人 (p_sys_code.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：记录修改人 (p_sys_code.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：记录修改人 (p_sys_code.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}