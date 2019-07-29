package com.ustcsoft.pdqc.web.systemmanagement.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

public enum RoleManagementConstants implements RythmPage {

    // 角色管理
    ROLE_MANAGEMENT("views/systemmanagement/RoleManagement"),
    // 编辑角色
    EDIT_ROLE("views/systemmanagement/EditRole"),
    // 配置权限页面
    PERMISSION_CONFIGURATION("views/systemmanagement/PermissionConfiguration"),
    // 添加用户页面
    ADD_ROLE_USER("views/systemmanagement/AddRoleUser");

    private final String url;

    RoleManagementConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
