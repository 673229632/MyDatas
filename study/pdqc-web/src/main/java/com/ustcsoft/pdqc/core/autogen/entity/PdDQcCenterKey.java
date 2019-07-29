//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdDQcCenterKey extends BaseEntity {
    /**
     * 质控中心编号 (pd_d_qc_center.qc_center_no)
     */
    private String qcCenterNo;

    /**
     * 取得：质控中心编号 (pd_d_qc_center.qc_center_no)
     *
     * @return qcCenterNo String
     */
    public String getQcCenterNo() {
        return qcCenterNo;
    }

    /**
     * 设定：质控中心编号 (pd_d_qc_center.qc_center_no)
     *
     * @param qcCenterNo String
     */
    public void setQcCenterNo(String qcCenterNo) {
        this.qcCenterNo = qcCenterNo;
    }
}