//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMUserKey extends BaseEntity {
    /**
     * 用户编号 (pd_m_user.user_no)
     */
    private String userNo;

    /**
     * 取得：用户编号 (pd_m_user.user_no)
     *
     * @return userNo String
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设定：用户编号 (pd_m_user.user_no)
     *
     * @param userNo String
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}