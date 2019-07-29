//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMTitleEmployeeKey extends BaseEntity {
    /**
     * 职称编号 (pd_m_title_employee.title_no)
     */
    private String titleNo;

    /**
     * 职员编号 (pd_m_title_employee.employee_no)
     */
    private String employeeNo;

    /**
     * 取得：职称编号 (pd_m_title_employee.title_no)
     *
     * @return titleNo String
     */
    public String getTitleNo() {
        return titleNo;
    }

    /**
     * 设定：职称编号 (pd_m_title_employee.title_no)
     *
     * @param titleNo String
     */
    public void setTitleNo(String titleNo) {
        this.titleNo = titleNo;
    }

    /**
     * 取得：职员编号 (pd_m_title_employee.employee_no)
     *
     * @return employeeNo String
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 设定：职员编号 (pd_m_title_employee.employee_no)
     *
     * @param employeeNo String
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
}