//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMSysFuncKey extends BaseEntity {
    /**
     * 模块id (PD_M_SYS_FUNC.func_id)
     */
    private Integer funcId;

    /**
     * 取得：模块id (PD_M_SYS_FUNC.func_id)
     *
     * @return funcId Integer
     */
    public Integer getFuncId() {
        return funcId;
    }

    /**
     * 设定：模块id (PD_M_SYS_FUNC.func_id)
     *
     * @param funcId Integer
     */
    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }
}