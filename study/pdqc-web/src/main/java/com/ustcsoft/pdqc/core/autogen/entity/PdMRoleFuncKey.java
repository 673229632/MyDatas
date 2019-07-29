//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMRoleFuncKey extends BaseEntity {
    /**
     * 角色no (PD_M_ROLE_FUNC.role_no)
     */
    private String roleNo;

    /**
     * 模块id (PD_M_ROLE_FUNC.func_id)
     */
    private Integer funcId;

    /**
     * 取得：角色no (PD_M_ROLE_FUNC.role_no)
     *
     * @return roleNo String
     */
    public String getRoleNo() {
        return roleNo;
    }

    /**
     * 设定：角色no (PD_M_ROLE_FUNC.role_no)
     *
     * @param roleNo String
     */
    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    /**
     * 取得：模块id (PD_M_ROLE_FUNC.func_id)
     *
     * @return funcId Integer
     */
    public Integer getFuncId() {
        return funcId;
    }

    /**
     * 设定：模块id (PD_M_ROLE_FUNC.func_id)
     *
     * @param funcId Integer
     */
    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }
}