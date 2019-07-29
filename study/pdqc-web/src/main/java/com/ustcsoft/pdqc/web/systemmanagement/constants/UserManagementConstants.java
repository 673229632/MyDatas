package com.ustcsoft.pdqc.web.systemmanagement.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

public enum UserManagementConstants implements RythmPage {

    USER_MANAGEMENT("views/systemmanagement/UserManagement"),
    
    USER_MANAGEMENT_EDITUSER("views/systemmanagement/EditUser");
    
    private final String url;

    UserManagementConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
