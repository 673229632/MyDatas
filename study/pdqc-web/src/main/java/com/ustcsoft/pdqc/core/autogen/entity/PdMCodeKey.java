//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMCodeKey extends BaseEntity {
    /**
     *  (PD_M_CODE.parent_code)
     */
    private String parentCode;

    /**
     *  (PD_M_CODE.code)
     */
    private String code;

    /**
     * 取得： (PD_M_CODE.parent_code)
     *
     * @return parentCode String
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设定： (PD_M_CODE.parent_code)
     *
     * @param parentCode String
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 取得： (PD_M_CODE.code)
     *
     * @return code String
     */
    public String getCode() {
        return code;
    }

    /**
     * 设定： (PD_M_CODE.code)
     *
     * @param code String
     */
    public void setCode(String code) {
        this.code = code;
    }
}