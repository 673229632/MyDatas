//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMExamineScheduledialKey extends BaseEntity {
    /**
     * 检查安排（透析中心）编号 (pd_m_examine_scheduledial.scheduledial_id)
     */
    private String scheduledialId;

    /**
     * 取得：检查安排（透析中心）编号 (pd_m_examine_scheduledial.scheduledial_id)
     *
     * @return scheduledialId String
     */
    public String getScheduledialId() {
        return scheduledialId;
    }

    /**
     * 设定：检查安排（透析中心）编号 (pd_m_examine_scheduledial.scheduledial_id)
     *
     * @param scheduledialId String
     */
    public void setScheduledialId(String scheduledialId) {
        this.scheduledialId = scheduledialId;
    }
}