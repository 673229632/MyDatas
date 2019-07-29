package com.ustcsoft.pdqc.web.systemmanagement.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.web.systemmanagement.form.RoleManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.RoleManagementResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.TreeForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementForm;


/**
 * 
 * @author xujie
 *
 */
public interface RoleManagementService {

    JacksonPagginListReturn<RoleManagementResultForm> getRoleData(RoleManagementCondForm condForm);
    
    JacksonCountReturn saveRole(RoleManagementResultForm roleManagementResultForm);
    
    JacksonCountReturn delRole(String roleNo);
    
    JacksonCountReturn delCheckRole(String roleNo);
    
    JacksonReturn getPermissionConfigurationTree(String roleNo);
    
    JacksonCountReturn savePermissionConfiguration(String funcIds, String roleNo);
    
    JacksonPagginListReturn<UserManagementForm> getRoleUserData(UserManagementCondForm condForm);
    
    JacksonPagginListReturn<UserManagementForm> getRoleNotAddUserData(UserManagementCondForm condForm);
    
    JacksonCountReturn delBatchUser(String userNos);
    
    JacksonCountReturn addRoleUserData(String userNos, String roleNo);
}

