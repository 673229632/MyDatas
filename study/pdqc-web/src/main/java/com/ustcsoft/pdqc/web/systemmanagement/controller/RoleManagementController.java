package com.ustcsoft.pdqc.web.systemmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.systemmanagement.constants.RoleManagementConstants;
import com.ustcsoft.pdqc.web.systemmanagement.form.RoleManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.RoleManagementResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.TreeForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.ZTreeTestProjectForm;
import com.ustcsoft.pdqc.web.systemmanagement.service.OrganizationListService;
import com.ustcsoft.pdqc.web.systemmanagement.service.RoleManagementService;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;
/**
 * 
 * @author xujie
 *
 */
@Controller
@RequestMapping("/roleManagement")
public class RoleManagementController extends WebBaseController {
    
    @Autowired
    OrganizationListService organizationListService;
    
    @Autowired
    CommonService commonService;
    
    @Autowired
    RoleManagementService roleManagementService;
    // 当前roleNo(由于权限树无法传参，用于当做查询权限树的参数)
    private String currentRoleNo;

    @RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        String orgNo = getLoginUser().getOrgNo();
        // 获取所属组织机构下拉框
        model.addAttribute("orgNoList", commonService.getOrgSelectOptions(orgNo));
        return RoleManagementConstants.ROLE_MANAGEMENT;
    }
    
    @RequestMapping(value = "/getTree")
    public JacksonReturn getTree(ModelMap model) {
        String orgNo = getLoginUser().getOrgNo();
        return commonService.getOrgSelectOptionsTree(orgNo);
    }
    
    /**
     * 获取角色列表
     * @param condForm
     * @return
     */
    @RequestMapping("/getRoleData")
    public JacksonPagginListReturn<RoleManagementResultForm> getRoleData(RoleManagementCondForm condForm) {
        return roleManagementService.getRoleData(condForm);
    }
    
    /**
     * 跳转 添加/编辑角色页面
     * @param model
     * @return
     */
    @RequestMapping("/editRole")
    public RythmPage addUser(ModelMap model, String roleNo) {
        String orgNo = getLoginUser().getOrgNo();
        // 获取子节点组织机构
        model.addAttribute("orgList", commonService.getOrgSelectOptions(orgNo));
        if (!Tools.isblank(roleNo)) {
            model.addAttribute("roleNo", roleNo);
        } else {
            model.addAttribute("roleNo", "");
        }
        // 获取所选角色信息
        RoleManagementResultForm roleManagementResultForm = new RoleManagementResultForm();
        if (!Tools.isblank(roleNo)) {
            RoleManagementCondForm condForm = new RoleManagementCondForm();
            condForm.setRoleNo(roleNo);
            JacksonPagginListReturn<RoleManagementResultForm> rolePagingList = roleManagementService.getRoleData(condForm);
            List<RoleManagementResultForm> roleList = new ArrayList<RoleManagementResultForm>();
            roleList = rolePagingList.getData();
            if (!Tools.listisblank(roleList)) {
                roleManagementResultForm = roleList.get(0);
            }
        }
        model.addAttribute("roleManagementResultForm", roleManagementResultForm);
        return RoleManagementConstants.EDIT_ROLE;
    }
    
    /**
     * 保存角色
     * @param roleManagementResultForm
     * @return
     */
    @RequestMapping("/saveRole")
    public JacksonCountReturn saveRole(RoleManagementResultForm roleManagementResultForm) {
        return roleManagementService.saveRole(roleManagementResultForm);
    }
    
    /**
     * 删除角色
     * @param roleNo
     * @return
     */
    @RequestMapping("/delRole")
    public JacksonCountReturn delRole(String roleNo) {
        return roleManagementService.delRole(roleNo);
    }
    
    /**
     * 判断当前角色有无用户信息
     * @param roleNo
     * @return
     */
    @RequestMapping("/delCheckRole")
    public JacksonCountReturn delCheckRole(String roleNo) {
        return roleManagementService.delCheckRole(roleNo);
    }
    
    /**
     * 配置权限
     * @param model
     * @param roleNo
     * @return
     */
    @RequestMapping("/permissionConfiguration")
    public RythmPage permissionConfiguration(ModelMap model, String roleNo) {
        model.addAttribute("roleNo", roleNo);
        currentRoleNo = roleNo;
        return RoleManagementConstants.PERMISSION_CONFIGURATION;
    }
    
    /**
     * 获取权限树
     * @return
     */
    @RequestMapping("/getPermissionConfigurationTree")
    public JacksonReturn getPermissionConfigurationTree() {
        return roleManagementService.getPermissionConfigurationTree(currentRoleNo);
    }
    
    /**
     * 保存权限
     */
    @RequestMapping("/savePermissionConfiguration")
    public JacksonCountReturn savePermissionConfiguration(String funcIds, String roleNo) {
        return roleManagementService.savePermissionConfiguration(funcIds, roleNo);
    }
    
    /**
     * 添加用户页面
     * @param model
     * @param roleNo
     * @return
     */
    @RequestMapping("/addRoleUser")
    public RythmPage addRoleUser(ModelMap model, String roleNo) {
        model.addAttribute("roleNo", roleNo);
        return RoleManagementConstants.ADD_ROLE_USER;
    }
    
    /**
     * 获取已添加用户列表
     * @param condForm
     * @return
     */
    @RequestMapping("/getRoleUserData")
    public JacksonPagginListReturn<UserManagementForm> getRoleUserData(UserManagementCondForm condForm) {
        return roleManagementService.getRoleUserData(condForm);
    }
    
    /**
     * 获取未添加用户列表
     * @param condForm
     * @return
     */
    @RequestMapping("/getRoleNotAddUserData")
    public JacksonPagginListReturn<UserManagementForm> getRoleNotAddUserData(UserManagementCondForm condForm) {
        return roleManagementService.getRoleNotAddUserData(condForm);
    }
    
    /**
     * 批量删除用户
     * @param roleNo
     * @return
     */
    @RequestMapping("/delBatchUser")
    public JacksonCountReturn delBatchUser(String userNos) {
        return roleManagementService.delBatchUser(userNos);
    }
    
    
    /**
     * 批量添加用户
     * @param roleNo
     * @return
     */
    @RequestMapping("/addRoleUserData")
    public JacksonCountReturn addRoleUserData(String userNos,String roleNo) {
        return roleManagementService.addRoleUserData(userNos,roleNo);
    }
    
}
