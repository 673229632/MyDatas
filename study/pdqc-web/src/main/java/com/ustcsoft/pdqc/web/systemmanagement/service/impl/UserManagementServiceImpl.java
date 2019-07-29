package com.ustcsoft.pdqc.web.systemmanagement.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.mybatis.paging.Paging;
import com.ustcsoft.pdqc.core.autogen.dao.PSysCodeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeUserMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMUserMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCode;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeUserExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserExample;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementForm;
import com.ustcsoft.pdqc.web.systemmanagement.service.UserManagementService;

/**
 * 
 * @author xujie
 *
 */
@Service
public class UserManagementServiceImpl extends WebBaseServiceImpl implements UserManagementService {

    @Autowired
    PdMUserMapper pdMUserMapper;
    
    @Autowired
    WebCommonDao webCommonDao;
    
    @Autowired
    PdMEmployeeUserMapper pdMEmployeeUserMapper;
    
    @Autowired
    PdMEmployeeMapper pdMEmployeeMapper;
    
    @Autowired
    PSysCodeMapper pSysCodeMapper;
    
    @Autowired
    PdMOrganizationMapper pdMOrganizationMapper;
    
    @Autowired
    CommonService commonService;
    
    /**
     * 删除用户信息
     */
    @Override
    public JacksonCountReturn delUser(String userNo) {
        int successCount = 0;
        // 删除PdMUser的记录
        JacksonCountReturn result = new JacksonCountReturn();
        PdMUser pdMUser = new PdMUser();
        pdMUser.setDelFlag(DELETE_FLAG_1);
        PdMUserExample pdMUserExample = new PdMUserExample();
        PdMUserExample.Criteria pdMUserCriteria = pdMUserExample.createCriteria();
        pdMUserCriteria.andUserNoEqualTo(userNo);
        pdMUserCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        successCount = pdMUserMapper.updateByExampleSelective(pdMUser, pdMUserExample);
        // 删除PdMEmployeeUser的记录
        PdMEmployeeUser pdMEmployeeUser = new PdMEmployeeUser();
        pdMEmployeeUser.setDelFlag(DELETE_FLAG_1);
        PdMEmployeeUserExample pdMEmployeeUserExample = new PdMEmployeeUserExample();
        PdMEmployeeUserExample.Criteria pdMEmployeeUserCriteria = pdMEmployeeUserExample.createCriteria();
        pdMEmployeeUserCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        pdMEmployeeUserCriteria.andUserNoEqualTo(userNo);
        successCount += pdMEmployeeUserMapper.updateByExampleSelective(pdMEmployeeUser, pdMEmployeeUserExample);
        result.setSuccessCount(successCount);
        if(successCount > 0) {
            result.setRetMsg(DELETESUCCESS);
        } else {
            result.setRetMsg(DELETEFAILED);
        }
        return result;
    }
    
    /**
     * 批量删除用户信息
     */
    @Override
    public JacksonCountReturn batchDelete(String userNos) {
        int successCount = 0;
        // 删除PdMUser的记录
        JacksonCountReturn result = new JacksonCountReturn();
        // 获取需要修改用户信息的userNo
        List<String> userNoList = new ArrayList<String>();
        // 需要修改的数目
        int modifyCount = 0;
        if(!Tools.isblank(userNos)){
            userNoList = Arrays.asList(userNos.split(","));
            modifyCount = userNoList.size();
        }
        if (!Tools.listisblank(userNoList)) {
            PdMUser pdMUser = new PdMUser();
            pdMUser.setDelFlag(DELETE_FLAG_1);
            PdMUserExample pdMUserExample = new PdMUserExample();
            PdMUserExample.Criteria pdMUserCriteria = pdMUserExample.createCriteria();
            pdMUserCriteria.andUserNoIn(userNoList);
            pdMUserCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
            successCount = pdMUserMapper.updateByExampleSelective(pdMUser, pdMUserExample);
            // 删除PdMEmployeeUser的记录
            PdMEmployeeUser pdMEmployeeUser = new PdMEmployeeUser();
            pdMEmployeeUser.setDelFlag(DELETE_FLAG_1);
            PdMEmployeeUserExample pdMEmployeeUserExample = new PdMEmployeeUserExample();
            PdMEmployeeUserExample.Criteria pdMEmployeeUserCriteria = pdMEmployeeUserExample.createCriteria();
            pdMEmployeeUserCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
            pdMEmployeeUserCriteria.andUserNoIn(userNoList);
            pdMEmployeeUserMapper.updateByExampleSelective(pdMEmployeeUser, pdMEmployeeUserExample);
        }
        if(successCount >= modifyCount) {
            result.setRetMsg(DELETESUCCESS);
            result.setSuccessCount(1);
        } else {
            result.setRetMsg(DELETEFAILED);
            result.setSuccessCount(0);
        }
        return result;
    }
    
    /**
     * 重置密码
     */
    @Override
    public JacksonCountReturn remakePsd(String userNo) {
        JacksonCountReturn result = new JacksonCountReturn();
        int successCount = 0;
        if (!Tools.isblank(userNo)){
            PdMUser pdMUser = new PdMUser();
            // 设置默认密码
            pdMUser.setUserPass(Tools.string2MD5(INITPASSWORD));
            PdMUserExample pdMUserExample = new PdMUserExample();
            PdMUserExample.Criteria pdMUserCriteria = pdMUserExample.createCriteria();
            pdMUserCriteria.andUserNoEqualTo(userNo);
            pdMUserCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
            successCount = pdMUserMapper.updateByExampleSelective(pdMUser, pdMUserExample);
        }
        if (successCount > 0) {
            result.setRetMsg("重置密码成功");
        } else {
            result.setRetMsg("重置密码失败");
        }
        result.setSuccessCount(successCount);
        return result;
    }

    /**
     * 保存用户
     */
    @Override
    public JacksonCountReturn saveUser(UserManagementForm userManagementForm) {
        JacksonCountReturn jacksonCountReturn = new JacksonCountReturn();
        int successCount = 0;
        // userNo为空时新增 否则编辑
        PdMUser pdMUser = new PdMUser();
        PdMEmployeeUser pdMEmployeeUser = new PdMEmployeeUser();
        // 当前时间
        Date nowDate = new Date();
        // 新增时自动生成的userNo
        String zdUserNo = Tools.getFifteenUUID();
        String userNo = userManagementForm.getUserNo();
        if(userNo != null && !"".equals(userNo)) {
            // 先从数据库中找到这条数据
            PdMUserExample pdMUserExample = new PdMUserExample();
            PdMUserExample.Criteria pdMUserCriteria = pdMUserExample.createCriteria();
            pdMUserCriteria.andUserNoEqualTo(userNo);
            pdMUserCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
            List<PdMUser> pdMUserList = new ArrayList<PdMUser>();
            pdMUserList = pdMUserMapper.selectByExample(pdMUserExample);
            if(pdMUserList.size() > 0) {
                // 设置编辑的属性
                pdMUser = pdMUserList.get(0);
                // 用户名
                pdMUser.setLoginName(userManagementForm.getLoginName());
                // 用户姓名
                pdMUser.setUserRealName(userManagementForm.getUserRealName());
                // 用户类型
                pdMUser.setUserType(userManagementForm.getUserType());
                // 所属类型
                pdMUser.setOrgNo(userManagementForm.getOrgNo());
                // 修改时间
                pdMUser.setDateModified(nowDate);
                // 修改人
                pdMUser.setModifiedBy(getLoginUser().getUserNo());
                successCount = pdMUserMapper.updateByExample(pdMUser, pdMUserExample);
            } else {
                // 未找到该名用户
                jacksonCountReturn.setRetMsg("未找到该名用户");
                jacksonCountReturn.setSuccessCount(successCount);
                return jacksonCountReturn;
            }
        } else {
            // 新增user
            pdMUser.setUserNo(zdUserNo);
            pdMUser.setDateCreated(nowDate);
            pdMUser.setCreatedBy(getLoginUser().getUserNo());
            pdMUser.setDateModified(nowDate);
            pdMUser.setModifiedBy(getLoginUser().getUserNo());
            pdMUser.setDelFlag(DELETE_FLAG_0);
            pdMUser.setLoginName(userManagementForm.getLoginName());
            pdMUser.setUserRealName(userManagementForm.getUserRealName());
            pdMUser.setUserType(userManagementForm.getUserType());
            pdMUser.setOrgNo(userManagementForm.getOrgNo());
            pdMUser.setUserPass(Tools.string2MD5(INITPASSWORD));
            successCount = pdMUserMapper.insert(pdMUser);
        }
        
        // 从数据库中找到对应的职员信息
        List<PdMEmployeeUser> pdMEmployeeUserList = new ArrayList<PdMEmployeeUser>();
        if(userNo != null && !"".equals(userNo)){
            PdMEmployeeUserExample pdMEmployeeUserExample = new PdMEmployeeUserExample();
            PdMEmployeeUserExample.Criteria pdMEmployeeUserCriteria = pdMEmployeeUserExample.createCriteria();
            pdMEmployeeUserCriteria.andUserNoEqualTo(userNo);
            pdMEmployeeUserList = pdMEmployeeUserMapper.selectByExample(pdMEmployeeUserExample);
            // 当PdMEmployeeUser表无对应数据时新增 否则编辑
            if(pdMEmployeeUserList.size() > 0) {
                // 设置编辑的属性
                pdMEmployeeUser = pdMEmployeeUserList.get(0);
                // 修改时间
                pdMEmployeeUser.setDateModified(nowDate);
                // 修改者
                pdMEmployeeUser.setModifiedBy(getLoginUser().getUserNo());
                // 如果编辑画面的关联职员为空则删除该条记录 
                if(userManagementForm.getEmployeeNo() != null && !"".equals(userManagementForm.getEmployeeNo())) {
                    // 关联职员
                    pdMEmployeeUser.setEmployeeNo(userManagementForm.getEmployeeNo());
                    // 删除标记
                    pdMEmployeeUser.setDelFlag(DELETE_FLAG_0);
                    successCount += pdMEmployeeUserMapper.updateByExample(pdMEmployeeUser, pdMEmployeeUserExample);
                } else { 
                    // 删除标记
                    pdMEmployeeUser.setDelFlag(DELETE_FLAG_1);
                    successCount += pdMEmployeeUserMapper.updateByExample(pdMEmployeeUser, pdMEmployeeUserExample);
                }
            } else {
                // 当编辑页面关联职员为空时 新增PdMEmployeeUser记录
                if(userManagementForm.getEmployeeNo() != null && !"".equals(userManagementForm.getEmployeeNo())){
                    pdMEmployeeUser.setUserNo(userNo);
                    pdMEmployeeUser.setDateCreated(nowDate);
                    pdMEmployeeUser.setCreatedBy(getLoginUser().getUserNo());
                    pdMEmployeeUser.setDateModified(nowDate);
                    pdMEmployeeUser.setModifiedBy(getLoginUser().getUserNo());
                    pdMEmployeeUser.setDelFlag(DELETE_FLAG_0);
                    pdMEmployeeUser.setEmployeeNo(userManagementForm.getEmployeeNo());
                    successCount += pdMEmployeeUserMapper.insert(pdMEmployeeUser);
                }
            }
        } else {
            // 新增pdMEmployeeUser数据
            pdMEmployeeUser.setUserNo(zdUserNo);
            pdMEmployeeUser.setDateCreated(nowDate);
            pdMEmployeeUser.setCreatedBy(getLoginUser().getUserNo());
            pdMEmployeeUser.setDateModified(nowDate);
            pdMEmployeeUser.setModifiedBy(getLoginUser().getUserNo());
            pdMEmployeeUser.setDelFlag(DELETE_FLAG_0);
            pdMEmployeeUser.setEmployeeNo(userManagementForm.getEmployeeNo());
            successCount += pdMEmployeeUserMapper.insert(pdMEmployeeUser);
        }
        if(successCount > 1) {
            jacksonCountReturn.setRetMsg(SAVESUCCESS);
        } else {
            jacksonCountReturn.setRetMsg(SAVEFAILED);
        }
        jacksonCountReturn.setSuccessCount(successCount);
        return jacksonCountReturn;
    }

    /**
     * 查询用户列表
     * @param condForm
     * @return
     */
    @Override
    public JacksonPagginListReturn<UserManagementForm> searchUser(UserManagementCondForm condForm) {
        JacksonPagginListReturn<UserManagementForm> result = new JacksonPagginListReturn<UserManagementForm>();
        // 只能查询子节点机构的角色信息
        List<Code> orgCodeList = commonService.getOrgSelectOptions(getLoginUser().getOrgNo());
        // 存放子节点机构的orgNo
        List<String> orgStrList = new ArrayList<String>();
        for (Code code : orgCodeList) {
            orgStrList.add(code.getValue());
        }
        condForm.setOrgNoList(orgStrList);
        // 设置模糊查询
        condForm.setLoginName("%"+condForm.getLoginName()+"%");
        condForm.setUserRealName("%"+condForm.getUserRealName()+"%");
        ListResult<UserManagementForm> resultUserList = webCommonDao.selectList("UserManagementMapper.searchUserManagement", condForm);
        List<UserManagementForm> userManagementFormList = new ArrayList<UserManagementForm>();
        userManagementFormList = resultUserList.getResultData();
        // 获取分页
        int pagecount = userManagementFormList.size();
        double maxpage = (double) pagecount / (double) condForm.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condForm.getPageNumber() > maxpageSize) {
            condForm.setPageNumber(maxpageSize);
        }
        // 获得用户列表
        ListResult<UserManagementForm> resultForm = webCommonDao.selectPaging(
                "UserManagementMapper.searchUserManagement", condForm,
                new Paging(condForm.getPageNumber(), condForm.getPageSize()));
        List<UserManagementForm> resultList = new ArrayList<UserManagementForm>();
        resultList.addAll(resultForm.getResultData());
        // 设置用户类型
        PSysCodeExample pSysCodeExample = new PSysCodeExample();
        PSysCodeExample.Criteria pSysCodeCriteria = pSysCodeExample.createCriteria();
        pSysCodeCriteria.andCodeTypeIdEqualTo(1021);
        List<PSysCode> pscList = pSysCodeMapper.selectByExample(pSysCodeExample);
        // 用户类型map
        Map<String,String> pscMap = new HashMap<String,String>();
        for (PSysCode pSysCode : pscList) {
            pscMap.put(pSysCode.getCodeValue(),pSysCode.getCodeName());
        }
        // 循环赋予用户类型名称和所属机构名称
        for (UserManagementForm userManagementForm : resultList) {
            // 赋予用户类型名称
            if (!Tools.isblank(userManagementForm.getUserType())) {
                userManagementForm.setUserTypeName(pscMap.get(userManagementForm.getUserType()));
            }
            // 质控中心名称和透析中心名称中 有一个为空另一个不为空  取不为空的作为所属机构名称
            if (!Tools.isblank(userManagementForm.getPdCenterName())) {
                userManagementForm.setOrgName(userManagementForm.getPdCenterName());
            } 
            if (!Tools.isblank(userManagementForm.getQcCenterName())) {
                userManagementForm.setOrgName(userManagementForm.getQcCenterName());
            }
        }
        result.setData(resultList);
        result.setPageNumber(condForm.getPageNumber());
        result.setPageCount(pagecount);
        result.setTotalCount(pagecount);
        return result;
    }

    /**
     * 获取职员下拉框
     */
    @Override
    public JacksonReturn changeEmployeeNoSelect(String orgNo) {
        JacksonListReturn<Code> ret = new JacksonListReturn<>();
        // 根据所选用户的所属组织获取职员列表
        PdMEmployeeExample pdMEmployeeExample = new PdMEmployeeExample();
        PdMEmployeeExample.Criteria pdMEmployeeCriteria = pdMEmployeeExample.createCriteria();
        pdMEmployeeCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        pdMEmployeeCriteria.andOrgNoEqualTo(orgNo);
        List<PdMEmployee> pdMEmployeeList = new ArrayList<PdMEmployee>();
        pdMEmployeeList = pdMEmployeeMapper.selectByExample(pdMEmployeeExample);
        // 职员列表下拉框
        List<Code> empList = new ArrayList<Code>();
        Code fircode = new Code();
        fircode.setText("");
        fircode.setValue("");
        empList.add(fircode);
        for (PdMEmployee pdMEmployee : pdMEmployeeList) {
            Code code = new Code();
            code.setText(pdMEmployee.getEmployeeName());
            code.setValue(pdMEmployee.getEmployeeNo());
            empList.add(code);
        }
        ret.setData(empList);
        return ret;
    }

    /**
     * 获取用户类型下拉框
     */
    @Override
    public JacksonReturn changeUserTypeSelect(String orgNo) {
        JacksonListReturn<Code> ret = new JacksonListReturn<>();
        // 先获取机构信息的组织类型
        List<PdMOrganization> pdMOrganizationList = new ArrayList<PdMOrganization>();
        PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
        PdMOrganizationExample.Criteria pdMOrganizationCriteria = pdMOrganizationExample.createCriteria();
        pdMOrganizationCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        pdMOrganizationCriteria.andOrgNoEqualTo(orgNo);
        pdMOrganizationList = pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
        String orgType = "";
        if (!Tools.listisblank(pdMOrganizationList)) {
            orgType = pdMOrganizationList.get(0).getOrgType();
        }
        // 根据所选用户的所属组织类型获取用户类型列表
        List<Code> userEditTypeList = new ArrayList<Code>();
        if (!Tools.isblank(orgType)) {
            // 质控中心用户类型列表
            List<String> qccondList = Arrays.asList(USERTYPE_1, USERTYPE_2, USERTYPE_3,
                    USERTYPE_4, USERTYPE_5, USERTYPE_6);
            // 透析中心用户类型列表
            List<String> txcondList = Arrays.asList(USERTYPE_4, USERTYPE_5, USERTYPE_6);
            PSysCodeExample pSysCodeExample = new PSysCodeExample();
            PSysCodeExample.Criteria pSysCodeCriteria = pSysCodeExample.createCriteria();
            if(ORGTYPE_1.equals(orgType)){
                pSysCodeCriteria.andCodeValueIn(qccondList);
            } else if (ORGTYPE_2.equals(orgType)){
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
        ret.setData(userEditTypeList);
        return ret;
    }

}
