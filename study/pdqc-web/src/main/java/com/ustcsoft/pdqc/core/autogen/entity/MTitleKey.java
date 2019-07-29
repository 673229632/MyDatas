//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class MTitleKey extends BaseEntity {
    /**
     * 职称编号 (m_title.title_no)
     */
    private String titleNo;

    /**
     * 取得：职称编号 (m_title.title_no)
     *
     * @return titleNo String
     */
    public String getTitleNo() {
        return titleNo;
    }

    /**
     * 设定：职称编号 (m_title.title_no)
     *
     * @param titleNo String
     */
    public void setTitleNo(String titleNo) {
        this.titleNo = titleNo;
    }
}