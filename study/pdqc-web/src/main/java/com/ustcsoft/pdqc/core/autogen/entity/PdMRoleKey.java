//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMRoleKey extends BaseEntity {
    /**
     * 角色编号 (PD_M_ROLE.role_no)
     */
    private String roleNo;

    /**
     * 取得：角色编号 (PD_M_ROLE.role_no)
     *
     * @return roleNo String
     */
    public String getRoleNo() {
        return roleNo;
    }

    /**
     * 设定：角色编号 (PD_M_ROLE.role_no)
     *
     * @param roleNo String
     */
    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }
}