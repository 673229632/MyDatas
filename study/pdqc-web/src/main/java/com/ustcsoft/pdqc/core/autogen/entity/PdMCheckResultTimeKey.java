//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMCheckResultTimeKey extends BaseEntity {
    /**
     * 评分编号 (pd_m_check_result_time.check_no)
     */
    private String checkNo;

    /**
     * 取得：评分编号 (pd_m_check_result_time.check_no)
     *
     * @return checkNo String
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * 设定：评分编号 (pd_m_check_result_time.check_no)
     *
     * @param checkNo String
     */
    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }
}