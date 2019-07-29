//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMOrganizationKey extends BaseEntity {
    /**
     * 组织机构编号 (pd_m_organization.org_no)
     */
    private String orgNo;

    /**
     * 取得：组织机构编号 (pd_m_organization.org_no)
     *
     * @return orgNo String
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设定：组织机构编号 (pd_m_organization.org_no)
     *
     * @param orgNo String
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }
}