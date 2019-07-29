//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMEmployeeKey extends BaseEntity {
    /**
     * 职员编号 (PD_M_EMPLOYEE.employee_no)
     */
    private String employeeNo;

    /**
     * 取得：职员编号 (PD_M_EMPLOYEE.employee_no)
     *
     * @return employeeNo String
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 设定：职员编号 (PD_M_EMPLOYEE.employee_no)
     *
     * @param employeeNo String
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
}