//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdDCenterKey extends BaseEntity {
    /**
     * 透析中心编号 (PD_D_CENTER.pd_center_no)
     */
    private String pdCenterNo;

    /**
     * 取得：透析中心编号 (PD_D_CENTER.pd_center_no)
     *
     * @return pdCenterNo String
     */
    public String getPdCenterNo() {
        return pdCenterNo;
    }

    /**
     * 设定：透析中心编号 (PD_D_CENTER.pd_center_no)
     *
     * @param pdCenterNo String
     */
    public void setPdCenterNo(String pdCenterNo) {
        this.pdCenterNo = pdCenterNo;
    }
}