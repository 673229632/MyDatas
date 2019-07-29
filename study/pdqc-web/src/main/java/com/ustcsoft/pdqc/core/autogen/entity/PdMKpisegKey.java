//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMKpisegKey extends BaseEntity {
    /**
     * KPI指标分段编号 (pd_m_kpiseg.kpi_id)
     */
    private String kpiId;

    /**
     * 取得：KPI指标分段编号 (pd_m_kpiseg.kpi_id)
     *
     * @return kpiId String
     */
    public String getKpiId() {
        return kpiId;
    }

    /**
     * 设定：KPI指标分段编号 (pd_m_kpiseg.kpi_id)
     *
     * @param kpiId String
     */
    public void setKpiId(String kpiId) {
        this.kpiId = kpiId;
    }
}