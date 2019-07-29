package com.ustcsoft.pdqc.web.systemmanagement.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.dao.PSysCodeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeUserMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMUserMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCode;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeUserExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserKey;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.systemmanagement.constants.UserManagementConstants;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.ZTreeTestProjectForm;
import com.ustcsoft.pdqc.web.systemmanagement.service.OrganizationListService;
import com.ustcsoft.pdqc.web.systemmanagement.service.UserManagementService;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;
import com.ustcsoft.rythmui.widget.bootstrapselect.SelectOptionUnit;

/**
 * 
 * @author xujie
 *
 */
@Controller
@RequestMapping("/userManagement")
public class UserManagementController extends WebBaseController{
    
    @Autowired
    PdMOrganizationMapper pdMOrganizationMapper;
    
    @Autowired
    PdDQcCenterMapper pdDQcCenterMapper;
    
    @Autowired
    PdMEmployeeMapper pdMEmployeeMapper;
    
    @Autowired
    PdDCenterMapper pdDCenterMapper;
    
    @Autowired
    PdMEmployeeUserMapper pdMEmployeeUserMapper;
    
    @Autowired
    PSysCodeMapper pSysCodeMapper;
    
    @Autowired
    PdMUserMapper pdMUserMapper;
    
    @Autowired
    UserManagementService userManagementService;
    
    @Autowired
    OrganizationListService organizationListService;
    
    @Autowired
    CommonService commonService;
    
    UserManagementForm userForm = new UserManagementForm();
    
    List<SelectOptionUnit> conList = new ArrayList<SelectOptionUnit>();
    
    List<SelectOptionUnit> notconList = new ArrayList<SelectOptionUnit>();
    
    
    List<PdMOrganization> childMenu = new ArrayList<PdMOrganization>();  

    @RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        // 重新加载时清空选项列表
        conList = new ArrayList<SelectOptionUnit>();
        notconList = new ArrayList<SelectOptionUnit>();
        // 查询用户类型选项
        List<Code> userTypeList = new ArrayList<Code>();
        List<String> condList = Arrays.asList("1", "2", "3", "4", "5", "6");
        PSysCodeExample pSysCodeExample = new PSysCodeExample();
        PSysCodeExample.Criteria pSysCodeCriteria = pSysCodeExample.createCriteria();
        pSysCodeCriteria.andCodeTypeIdEqualTo(1021);
        pSysCodeCriteria.andCodeValueIn(condList);
        List<PSysCode> pscList = pSysCodeMapper.selectByExample(pSysCodeExample);
        for(PSysCode pSysCode : pscList){
            Code code = new Code();
            code.setText(pSysCode.getCodeName());
            code.setValue(pSysCode.getCodeValue());
            userTypeList.add(code);
        }
        model.addAttribute("userTypeList", userTypeList);
        String orgNo = getLoginUser().getOrgNo();
        model.addAttribute("topOrgNo", orgNo);
        return UserManagementConstants.USER_MANAGEMENT;
    }
    
    /**
     * 获取树
     * @param model
     * @return
     */
    @RequestMapping("/getTree")
    public JacksonReturn getTree() {
        String orgNo = getLoginUser().getOrgNo();
        return commonService.getOrganizationTree(orgNo);
    }
    
    /**
     * 获取所属机构下拉树
     * @param model
     * @return
     */
    @RequestMapping(value = "/getParentOrganizationTree")
    public JacksonReturn getTree(ModelMap model) {
        String orgNo = getLoginUser().getOrgNo();
        return commonService.getOrgSelectOptionsTree(orgNo);
    }
    
    /**
     * 跳转添加用户页面
     * @param model
     * @return
     */
    @RequestMapping("/addUser")
    public RythmPage addUser(ModelMap model) {
        String orgNo = getLoginUser().getOrgNo();
        // 获取子节点组织机构
        model.addAttribute("organizationList", commonService.getOrgSelectOptions(orgNo));
        model.addAttribute("userNo", "");
        UserManagementForm userManagementForm = new UserManagementForm();
        model.addAttribute("userManagementForm",userManagementForm);
        return UserManagementConstants.USER_MANAGEMENT_EDITUSER;
    }
    
    
    /**
     * 跳转编辑用户页面
     * @param model
     * @return
     */
    @RequestMapping("/editUser")
    public RythmPage editUser(ModelMap model, String userNo) {
        String orgNo = getLoginUser().getOrgNo();
        // 获取子节点组织机构
        model.addAttribute("organizationList", commonService.getOrgSelectOptions(orgNo));
        model.addAttribute("userNo", userNo);

        UserManagementForm userManagementForm = new UserManagementForm();
        // 根据userNo获取用户信息
        PdMUserKey PdMUserKey = new PdMUserKey();
        PdMUserKey.setUserNo(userNo);
        PdMUser pdMUser = pdMUserMapper.selectByPrimaryKey(PdMUserKey);
        BeanUtils.copyProperties(pdMUser, userManagementForm);
        // 获取关联职员编号
        PdMEmployeeUserExample pdMEmployeeUserExample = new PdMEmployeeUserExample();
        PdMEmployeeUserExample.Criteria pdMEmployeeUserCriteria = pdMEmployeeUserExample.createCriteria();
        pdMEmployeeUserCriteria.andUserNoEqualTo(userNo);
        pdMEmployeeUserCriteria.andDelFlagEqualTo("0");
        List<PdMEmployeeUser> employeeList = new ArrayList<PdMEmployeeUser>();
        employeeList = pdMEmployeeUserMapper.selectByExample(pdMEmployeeUserExample);
        if (employeeList.size() > 0) {
            userManagementForm.setEmployeeNo(employeeList.get(0).getEmployeeNo());
        }
        userForm = userManagementForm;
        // 职员如果为null 设为空选项
        if (Tools.isblank(userManagementForm.getEmployeeNo())) {
            userManagementForm.setEmployeeNo("");
        }
        model.addAttribute("userManagementForm",userManagementForm);
        // 根据所选用户的所属组织获取职员列表
        String selOrgNo = userManagementForm.getOrgNo();
        PdMEmployeeExample pdMEmployeeExample = new PdMEmployeeExample();
        PdMEmployeeExample.Criteria pdMEmployeeCriteria = pdMEmployeeExample.createCriteria();
        pdMEmployeeCriteria.andDelFlagEqualTo("0");
        pdMEmployeeCriteria.andOrgNoEqualTo(selOrgNo);
        List<PdMEmployee> pdMEmployeeList = new ArrayList<PdMEmployee>();
        pdMEmployeeList = pdMEmployeeMapper.selectByExample(pdMEmployeeExample);
        // 职员列表下拉框
        List<Code> empList = new ArrayList<Code>();
        Code kongCode = new Code();
        kongCode.setText("");
        kongCode.setValue("");
        //empList.add(kongCode);
        for (PdMEmployee pdMEmployee : pdMEmployeeList) {
            Code code = new Code();
            code.setText(pdMEmployee.getEmployeeName());
            code.setValue(pdMEmployee.getEmployeeNo());
            empList.add(code);
        }
        model.addAttribute("empList", empList);
        String orgType = "";
        //获取选中的机构信息
        PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
        PdMOrganizationExample.Criteria pdMOrganizationCriteria = pdMOrganizationExample.createCriteria();
        pdMOrganizationCriteria.andOrgNoEqualTo(selOrgNo);
        pdMOrganizationCriteria.andDelFlagEqualTo("0");
        List<PdMOrganization> pdMOrganizationList = pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
        if (!Tools.listisblank(pdMOrganizationList)) {
            orgType = pdMOrganizationList.get(0).getOrgType();
        }
        // 根据所选用户的所属组织类型获取用户类型列表
        List<Code> userEditTypeList = new ArrayList<Code>();
        if (!Tools.isblank(orgType)) {
            List<String> qccondList = Arrays.asList("1", "2", "3", "4", "5", "6");
            List<String> txcondList = Arrays.asList("4", "5", "6");
            PSysCodeExample pSysCodeExample = new PSysCodeExample();
            PSysCodeExample.Criteria pSysCodeCriteria = pSysCodeExample.createCriteria();
            if("1".equals(orgType)){
                pSysCodeCriteria.andCodeValueIn(qccondList);
            } else if ("2".equals(orgType)){
                pSysCodeCriteria.andCodeValueIn(txcondList);
            }
            pSysCodeCriteria.andCodeTypeIdEqualTo(1021);
            List<PSysCode> pscList = pSysCodeMapper.selectByExample(pSysCodeExample);
            for(PSysCode pSysCode : pscList){
                Code code = new Code();
                code.setText(pSysCode.getCodeName());
                code.setValue(pSysCode.getCodeValue());
                userEditTypeList.add(code);
            }
        }
        model.addAttribute("userEditTypeList", userEditTypeList);
        return UserManagementConstants.USER_MANAGEMENT_EDITUSER;
    }
    
    /**
     * 加载用户信息
     * @param orgNo 
     * @return
     */
    @RequestMapping("/loadUser")
    public JacksonDataReturn<UserManagementForm> loadUser(String userNo) {
        JacksonDataReturn<UserManagementForm> result = new JacksonDataReturn<UserManagementForm>();
        result.setData(userForm);
        return result;
    }
    
    /**
     * 获取职员下拉框
     * @param orgNo
     * @return
     */
    @RequestMapping(value = "/changeEmployeeNoSelect")
    public JacksonReturn changeEmployeeNoSelect(String orgNo) {
        return userManagementService.changeEmployeeNoSelect(orgNo);
    }
    
    /**
     * 获取职员下拉框
     * @param orgNo
     * @return
     */
    @RequestMapping(value = "/changeUserTypeSelect")
    public JacksonReturn changeUserTypeSelect(String orgNo) {
        return userManagementService.changeUserTypeSelect(orgNo);
    }
    
    /**
     * 保存用户
     * @param orgNo 
     * @return
     */
    @RequestMapping("/saveUser")
    public JacksonCountReturn saveUser(UserManagementForm userManagementForm) {
        return userManagementService.saveUser(userManagementForm);
    }
    
    /**
     * 删除用户
     * @param orgNo 
     * @return
     */
    @RequestMapping("/delUser")
    public JacksonCountReturn delUser(String userNo) {
        return userManagementService.delUser(userNo);
    }
    
    /**
     * 批量删除用户
     * @param orgNo 
     * @return
     */
    @RequestMapping("/batchDelete")
    public JacksonCountReturn batchDelete(String userNos) {
        return userManagementService.batchDelete(userNos);
    }
    
    /**
     * 重置密码
     * @param orgNo 
     * @return
     */
    @RequestMapping("/remakePsd")
    public JacksonCountReturn remakePsd(String userNo) {
        return userManagementService.remakePsd(userNo);
    }
       /**
     * 获取用户列表
     * @param condform
     * @return
     */
    @RequestMapping(value = "/getUserData")
    public JacksonPagginListReturn<UserManagementForm> getUserData(UserManagementCondForm condform) {
        return userManagementService.searchUser(condform);
    }
    
    /**
     * 获取子节点
     * @param menuList
     * @param pid
     * @return
     */
    public List<PdMOrganization> treeMenuList(List<PdMOrganization> menuList, String pid){
        for (PdMOrganization mu : menuList) {
            //遍历出父id等于参数的id，add进子节点集合
            if ((pid).equals(mu.getParentNo())) {
                //递归遍历下一级
                childMenu.add(mu);
                treeMenuList(menuList,mu.getOrgNo());
            }
        }
        return childMenu;
    }
    
}
