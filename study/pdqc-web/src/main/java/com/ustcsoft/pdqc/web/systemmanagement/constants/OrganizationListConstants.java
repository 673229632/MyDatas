package com.ustcsoft.pdqc.web.systemmanagement.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * @author xujie
 */

public enum OrganizationListConstants implements RythmPage {

    ORGANIZATION_LIST("views/systemmanagement/OrganizationList");
    
    private final String url;

    OrganizationListConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
