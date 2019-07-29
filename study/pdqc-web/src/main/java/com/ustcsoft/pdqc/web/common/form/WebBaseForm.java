/*
 * @(#) BaseEntity.java 2010-4-26
 *
 * Copyright (c) 2010, Tsnt Inc. All Rights Reserved.
 * Tsnt Inc. CONFIDENTIAL
 */

package com.ustcsoft.pdqc.web.common.form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WEB共通Form对象.
 * 
 * @author kxiong
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebBaseForm implements WebForm {

    // 更新时间
    private String updateDate;

    /**
     * @return the updateDate
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

}
