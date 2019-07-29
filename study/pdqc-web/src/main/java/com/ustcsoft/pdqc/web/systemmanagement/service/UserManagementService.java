package com.ustcsoft.pdqc.web.systemmanagement.service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementForm;

/**
 * 
 * @author xujie
 *
 */

public interface UserManagementService {
    
    JacksonCountReturn saveUser(UserManagementForm userManagementForm);
    
    JacksonCountReturn delUser(String userNo);
    
    JacksonCountReturn batchDelete(String userNos);
    
    JacksonCountReturn remakePsd(String userNo);
    
    JacksonPagginListReturn<UserManagementForm> searchUser(UserManagementCondForm condForm);
    
    JacksonReturn changeEmployeeNoSelect(String orgNo);
    
    JacksonReturn changeUserTypeSelect(String orgNo);
    
}
