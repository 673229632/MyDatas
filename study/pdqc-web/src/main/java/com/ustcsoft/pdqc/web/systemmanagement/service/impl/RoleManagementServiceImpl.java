package com.ustcsoft.pdqc.web.systemmanagement.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.mybatis.paging.Paging;
import com.ustcsoft.pdqc.core.autogen.dao.PdMRoleFuncMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMRoleMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMSysFuncMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMUserRoleMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRole;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleFunc;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleFuncExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMSysFunc;
import com.ustcsoft.pdqc.core.autogen.entity.PdMSysFuncExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserRole;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserRoleExample;
import com.ustcsoft.pdqc.rythm.widget.ztree.ZTreeCheckData;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.systemmanagement.form.RoleManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.RoleManagementResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.StatForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.TreeForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementCondForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.UserManagementForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.ZTreeTestProjectForm;
import com.ustcsoft.pdqc.web.systemmanagement.service.RoleManagementService;

/**
 * 
 * @author xujie
 *
 */
@Service
public class RoleManagementServiceImpl extends WebBaseServiceImpl implements RoleManagementService {

    @Autowired
    WebCommonDao webCommonDao;
    
    @Autowired
    CommonService commonService;
    
    @Autowired
    PdMRoleMapper pdMRoleMapper;
    
    @Autowired
    PdMUserRoleMapper pdMUserRoleMapper;
    
    @Autowired
    PdMSysFuncMapper pdMSysFuncMapper;
    
    @Autowired
    PdMRoleFuncMapper pdMRoleFuncMapper;
    
    /**
     * 获取角色信息列表
     */
    @Override
    public JacksonPagginListReturn<RoleManagementResultForm> getRoleData(RoleManagementCondForm condForm) {
        JacksonPagginListReturn<RoleManagementResultForm> result = new JacksonPagginListReturn<RoleManagementResultForm>();
        // 只能查询子节点机构的角色信息
        List<Code> orgCodeList = commonService.getOrgSelectOptions(getLoginUser().getOrgNo());
        // 存放子节点机构的orgNo
        List<String> orgStrList = new ArrayList<String>();
        for (Code code : orgCodeList) {
            orgStrList.add(code.getValue());
        }
        condForm.setOrgNoList(orgStrList);
        ListResult<RoleManagementResultForm> roleCountList = webCommonDao.selectList("RoleManagementMapper.getRoleList", condForm);
        // 获取分页
        int pagecount = 0;
        if (!Tools.listisblank(roleCountList.getResultData())) {
            pagecount = roleCountList.getResultData().size();
        }
        double maxpage = (double) pagecount / (double) condForm.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condForm.getPageNumber() > maxpageSize) {
            condForm.setPageNumber(maxpageSize);
        }
        // 获得角色列表
        ListResult<RoleManagementResultForm> roleList = webCommonDao.selectPaging("RoleManagementMapper.getRoleList",
                condForm,new Paging(condForm.getPageNumber(), condForm.getPageSize()));
        List<RoleManagementResultForm> resultList = new ArrayList<RoleManagementResultForm>();
        resultList.addAll(roleList.getResultData());
        // 循环赋予所属机构名称
        for (RoleManagementResultForm roleManagementResultForm : resultList) {
            
            // 质控中心名称和透析中心名称中 有一个为空另一个不为空  取不为空的作为所属机构名称
            if (!Tools.isblank(roleManagementResultForm.getPdCenterName())) {
                roleManagementResultForm.setOrgName(roleManagementResultForm.getPdCenterName());
            } 
            if (!Tools.isblank(roleManagementResultForm.getQcCenterName())) {
                roleManagementResultForm.setOrgName(roleManagementResultForm.getQcCenterName());
            }
        }
        result.setData(resultList);
        result.setPageNumber(condForm.getPageNumber());
        result.setPageCount(pagecount);
        result.setTotalCount(pagecount);
        return result;
    }

    /**
     * 保存角色
     */
    @Override
    public JacksonCountReturn saveRole(RoleManagementResultForm roleManagementResultForm) {
        JacksonCountReturn result = new JacksonCountReturn();
        int successCount = 0;
        Date nowDate = new Date();
        PdMRole pdMRole = new PdMRole();
        BeanUtils.copyProperties(roleManagementResultForm, pdMRole);
        pdMRole.setModifiedBy(getLoginUser().getUserNo());
        pdMRole.setDateModified(nowDate);
        // roleNo为空时新增记录 否则更新
        if (!Tools.isblank(pdMRole.getRoleNo())) {
            // 更新时查询出对应记录 
            PdMRoleExample pdMRoleExample = new PdMRoleExample();
            PdMRoleExample.Criteria pdMRoleCriteria = pdMRoleExample.createCriteria();
            pdMRoleCriteria.andDelFlagEqualTo(FLAG_0);
            pdMRoleCriteria.andRoleNoEqualTo(pdMRole.getRoleNo());
            List<PdMRole> pdMRoleList = pdMRoleMapper.selectByExample(pdMRoleExample);
            // 保留部分信息
            if (!Tools.listisblank(pdMRoleList)) {
                PdMRole oldPdMRole = new PdMRole();
                oldPdMRole = pdMRoleList.get(0);
                oldPdMRole.setDateModified(nowDate);
                oldPdMRole.setModifiedBy(getLoginUser().getUserNo());
                oldPdMRole.setRoleName(pdMRole.getRoleName());
                oldPdMRole.setOrgNo(pdMRole.getOrgNo());
                oldPdMRole.setRoleDesp(pdMRole.getRoleDesp());
                successCount = pdMRoleMapper.updateByExample(oldPdMRole, pdMRoleExample);
            }
        } else {
            // 新增角色信息
            pdMRole.setRoleNo(Tools.getFifteenUUID());
            pdMRole.setDelFlag(FLAG_0);
            pdMRole.setDateCreated(nowDate);
            pdMRole.setCreatedBy(getLoginUser().getUserNo());
            successCount = pdMRoleMapper.insert(pdMRole);
        }
        result.setSuccessCount(successCount);
        if (successCount > 0) {
            result.setRetMsg(SAVESUCCESS);
        } else {
            result.setRetMsg(SAVEFAILED);
        }
        return result;
    }

    @Override
    public JacksonCountReturn delRole(String roleNo) {
        JacksonCountReturn result = new JacksonCountReturn();
        int successCount = 0;
        PdMRole pdMRole = new PdMRole();
        pdMRole.setDelFlag(DELETE_FLAG_1);
        PdMRoleExample pdMRoleExample = new PdMRoleExample();
        PdMRoleExample.Criteria pdMRoleCriteria = pdMRoleExample.createCriteria();
        pdMRoleCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        pdMRoleCriteria.andRoleNoEqualTo(roleNo);
        successCount = pdMRoleMapper.updateByExampleSelective(pdMRole, pdMRoleExample);
        if (successCount > 0) {
            result.setRetMsg(DELETESUCCESS);
        } else {
            result.setRetMsg(DELETEFAILED);
        }
        result.setSuccessCount(successCount);
        return result;
    }

    /**
     * 判断当前角色有无用户信息
     */
    @Override
    public JacksonCountReturn delCheckRole(String roleNo) {
        JacksonCountReturn result = new JacksonCountReturn();
        PdMUserRoleExample pdMUserRoleExample = new PdMUserRoleExample();
        PdMUserRoleExample.Criteria pdMUserRoleCriteria = pdMUserRoleExample.createCriteria();
        pdMUserRoleCriteria.andRoleNoEqualTo(roleNo);
        pdMUserRoleCriteria.andDelFlagEqualTo(FLAG_0);
        List<PdMUserRole> resultList = pdMUserRoleMapper.selectByExample(pdMUserRoleExample);
        if (!Tools.listisblank(resultList)) {
            result.setSuccessCount(1);
        } else {
            result.setSuccessCount(0);
        }
        return result;
    }

    /**
     * 获取权限树
     */
    @Override
    public JacksonReturn getPermissionConfigurationTree(String roleNo) {
        JacksonListReturn<ZTreeCheckData<PdMSysFunc>> result = new JacksonListReturn<>();
        // 根据roleNo获取自身权限
        PdMRoleFuncExample pdMRoleFuncExample = new PdMRoleFuncExample();
        PdMRoleFuncExample.Criteria pdMRoleFuncCriteria = pdMRoleFuncExample.createCriteria();
        pdMRoleFuncCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        pdMRoleFuncCriteria.andRoleNoEqualTo(roleNo);
        List<PdMRoleFunc> selfFuncList = pdMRoleFuncMapper.selectByExample(pdMRoleFuncExample);
        // 将FuncId放入列表中
        List<String> roleAuthList = new ArrayList<String>();
        for (PdMRoleFunc pdMRoleFunc : selfFuncList) {
            roleAuthList.add(pdMRoleFunc.getFuncId()+"");
        }
        // 获取全部权限列表
        PdMSysFuncExample pdMSysFuncExample = new PdMSysFuncExample();
        PdMSysFuncExample.Criteria pdMSysFuncCriteria = pdMSysFuncExample.createCriteria();
        pdMSysFuncCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        List<PdMSysFunc> funcList = pdMSysFuncMapper.selectByExample(pdMSysFuncExample);
        // 将查询结果放到树中
        List<ZTreeCheckData<PdMSysFunc>> resultlist = new ArrayList<ZTreeCheckData<PdMSysFunc>>();
        if (!Tools.listisblank(funcList)) {
            for (PdMSysFunc pdMSysFunc : funcList) {
                ZTreeCheckData<PdMSysFunc> resultform = new ZTreeCheckData<PdMSysFunc>();
                resultform.setId(pdMSysFunc.getFuncId()+"");
                resultform.setName(pdMSysFunc.getFuncName());
                resultform.setPid(pdMSysFunc.getpFuncId()+"");
                for (String funId : roleAuthList) {
                    if (resultform.getId().equals(funId)) {
                        resultform.setChecked(true);
                    }
                }
                resultlist.add(resultform);
            }
        }
        result.setData(resultlist);
        return result;
    }
    
    /**
     * 保存权限
     */
    @Override
    public JacksonCountReturn savePermissionConfiguration(String funcIds, String roleNo) {
        JacksonCountReturn result = new JacksonCountReturn();
        // 先删除所有记录 再添加记录
        PdMRoleFunc delRoleFunc = new PdMRoleFunc();
        delRoleFunc.setDelFlag(DELETE_FLAG_1);
        PdMRoleFuncExample delRoleFuncExample = new PdMRoleFuncExample();
        PdMRoleFuncExample.Criteria delRoleFuncCriteria = delRoleFuncExample.createCriteria();
        delRoleFuncCriteria.andRoleNoEqualTo(roleNo);
        pdMRoleFuncMapper.updateByExampleSelective(delRoleFunc, delRoleFuncExample);
        // 当前时间
        Date nowDate = new Date();
        // 成功条数
        int successCount = 0;
        // 应该成功条数
        int shoudSuccessCount = 0;
        if (!Tools.isblank(funcIds)) {
            List<String> splitStrList = Arrays.asList(funcIds.split(","));
            // Arrays.asList获得的列表在执行remove时可能出错 放到新建的表中
            List<String> funcIdStrList = new ArrayList<String>();
            for (String spiltStr : splitStrList) {
                funcIdStrList.add(spiltStr);
            }
            List<Integer> initFuncIdList = new ArrayList<Integer>();
            for (String funcId : funcIdStrList) {
                initFuncIdList.add(Integer.parseInt(funcId));
            }
            if (!Tools.listisblank(initFuncIdList)) {
                // 备份初始funcId列表
                List<Integer> allFuncIdList = new ArrayList<Integer>();
                for (Integer funcId : initFuncIdList) {
                    allFuncIdList.add(funcId);
                }
                // 先查询出数据库中是否存在(包括del_flag=1)
                PdMRoleFuncExample pdMRoleFuncExample = new PdMRoleFuncExample();
                PdMRoleFuncExample.Criteria pdMRoleFuncCriteria = pdMRoleFuncExample.createCriteria();
                pdMRoleFuncCriteria.andFuncIdIn(allFuncIdList);
                pdMRoleFuncCriteria.andRoleNoEqualTo(roleNo);
                List<PdMRoleFunc> selFuncList = pdMRoleFuncMapper.selectByExample(pdMRoleFuncExample);
                // 如果存在 放入funcIdList列表中
                List<Integer> funcIdList = new ArrayList<Integer>();
                for (PdMRoleFunc pdMRoleFunc : selFuncList) {
                    funcIdList.add(pdMRoleFunc.getFuncId());
                }
                // 删除需要更新的 剩下需要新增的funcId
                initFuncIdList.removeAll(funcIdList);
                shoudSuccessCount += initFuncIdList.size();
                // 获取需要修改的记录（del_flag为1的记录）
                pdMRoleFuncCriteria.andDelFlagEqualTo(DELETE_FLAG_1);
                List<PdMRoleFunc> selUpdateFuncList = pdMRoleFuncMapper.selectByExample(pdMRoleFuncExample);
                if (!Tools.listisblank(selUpdateFuncList)) {
                    shoudSuccessCount += selUpdateFuncList.size();
                    // 将userNo里的del_flag更新为0
                    PdMRoleFunc pdMRoleFunc = new PdMRoleFunc();
                    pdMRoleFunc.setDelFlag(DELETE_FLAG_0);
                    pdMRoleFunc.setDateModified(nowDate);
                    pdMRoleFunc.setModifiedBy(getLoginUser().getUserNo());
                    successCount += pdMRoleFuncMapper.updateByExampleSelective(pdMRoleFunc, pdMRoleFuncExample);
                }
                // 新增记录
                for (Integer funcId : initFuncIdList) {
                    PdMRoleFunc addRoleFunc = new PdMRoleFunc();
                    addRoleFunc.setDelFlag(DELETE_FLAG_0);
                    addRoleFunc.setDateModified(nowDate);
                    addRoleFunc.setModifiedBy(getLoginUser().getUserNo());
                    addRoleFunc.setDateCreated(nowDate);
                    addRoleFunc.setCreatedBy(getLoginUser().getUserNo());
                    addRoleFunc.setFuncId(funcId);
                    addRoleFunc.setRoleNo(roleNo);
                    successCount += pdMRoleFuncMapper.insert(addRoleFunc);
                }
            }
        }
        if (successCount < shoudSuccessCount) {
            result.setRetMsg(SAVEFAILED);
            result.setSuccessCount(0);
        } else {
            result.setRetMsg(SAVESUCCESS);
            result.setSuccessCount(1);
        }
        return result;
    }

    /**
     * 获取已添加用户列表
     */
    @Override
    public JacksonPagginListReturn<UserManagementForm> getRoleUserData(UserManagementCondForm condForm) {
        JacksonPagginListReturn<UserManagementForm> result = new JacksonPagginListReturn<UserManagementForm>();
        ListResult<UserManagementForm> numListResult = webCommonDao.selectList("RoleManagementMapper.getRoleUserData", condForm);
        // 获取分页
        int pagecount = 0;
        if (!Tools.listisblank(numListResult.getResultData())) {
            pagecount = numListResult.getResultData().size();
        }
        double maxpage = (double) pagecount / (double) condForm.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condForm.getPageNumber() > maxpageSize) {
            condForm.setPageNumber(maxpageSize);
        }
        // 获得用户列表
        ListResult<UserManagementForm> userPagingList = webCommonDao.selectPaging("RoleManagementMapper.getRoleUserData",
                condForm,new Paging(condForm.getPageNumber(), condForm.getPageSize()));
        List<UserManagementForm> resultList = userPagingList.getResultData();
        // 循环赋予所属机构名称
        for (UserManagementForm userManagementForm : resultList) {
            
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
     * 获取未添加用户列表
     */
    @Override
    public JacksonPagginListReturn<UserManagementForm> getRoleNotAddUserData(UserManagementCondForm condForm) {
        JacksonPagginListReturn<UserManagementForm> result = new JacksonPagginListReturn<UserManagementForm>();
        String orgNo = getLoginUser().getOrgNo();
        // 获取子节点组织机构
        List<Code> orgCodeList = commonService.getOrgSelectOptions(orgNo);
        // 子节点组织机构orgNo
        List<String> orgNoList = new ArrayList<String>();
        for (Code code : orgCodeList) {
            orgNoList.add(code.getValue());
        }
        // 获取已被分配的用户
        PdMUserRoleExample pdMUserRoleExample = new PdMUserRoleExample();
        PdMUserRoleExample.Criteria pdMUserRoleCriteria = pdMUserRoleExample.createCriteria();
        pdMUserRoleCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        List<PdMUserRole> pdMUserRoleList = pdMUserRoleMapper.selectByExample(pdMUserRoleExample);
        // 已被分配的用户userNo
        List<String> userNoList = new ArrayList<String>();
        for (PdMUserRole pdMUserRole : pdMUserRoleList) {
            userNoList.add(pdMUserRole.getUserNo());
        }
        // 自身的userNo也要排除
        String loginUserNo = getLoginUser().getUserNo();
        userNoList.add(loginUserNo);
        condForm.setOrgNoList(orgNoList);
        condForm.setUserNoList(userNoList);
        // 设置模糊查询
        if (!Tools.isblank(condForm.getUserRealName())) {
            condForm.setUserRealName("%"+condForm.getUserRealName()+"%");
            
        }
        if (!Tools.isblank(condForm.getPhoneNum())) {
            condForm.setPhoneNum("%"+condForm.getPhoneNum()+"%");
        }
        if (!Tools.listisblank(orgNoList)) {
            ListResult<UserManagementForm> numListResult = webCommonDao.selectList("RoleManagementMapper.getRoleNotAddUserData", condForm);
            // 获取分页
            int pagecount = 0;
            if (!Tools.listisblank(numListResult.getResultData())) {
                pagecount = numListResult.getResultData().size();
            }
            double maxpage = (double) pagecount / (double) condForm.getPageSize();
            int maxpageSize = (int) Math.ceil(maxpage);
            if (condForm.getPageNumber() > maxpageSize) {
                condForm.setPageNumber(maxpageSize);
            }
            // 获得用户列表
            ListResult<UserManagementForm> userPagingList = webCommonDao.selectPaging("RoleManagementMapper.getRoleNotAddUserData",
                    condForm,new Paging(condForm.getPageNumber(), condForm.getPageSize()));
            List<UserManagementForm> resultList = userPagingList.getResultData();
            // 循环赋予所属机构名称
            for (UserManagementForm userManagementForm : resultList) {
                
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
        }
        return result;
    }

    /**
     * 批量删除用户
     */
    @Override
    public JacksonCountReturn delBatchUser(String userNos) {
        JacksonCountReturn result = new JacksonCountReturn();
        int successCount = 0;
        if (!Tools.isblank(userNos)) {
            List<String> roleNoList = Arrays.asList(userNos.split(","));
            if (!Tools.listisblank(roleNoList)) {
                // 根据userNo列表删除记录
                PdMUserRoleExample pdMUserRoleExample = new PdMUserRoleExample();
                PdMUserRoleExample.Criteria pdMUserRoleCriteria = pdMUserRoleExample.createCriteria();
                pdMUserRoleCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
                pdMUserRoleCriteria.andUserNoIn(roleNoList);
                
                PdMUserRole pdMUserRole = new PdMUserRole();
                pdMUserRole.setDelFlag(DELETE_FLAG_1);
                successCount = pdMUserRoleMapper.updateByExampleSelective(pdMUserRole, pdMUserRoleExample);
            }
        }
        if (successCount > 0) {
            result.setRetMsg(DELETESUCCESS);
        } else {
            result.setRetMsg(DELETEFAILED);
        }
        result.setSuccessCount(successCount);
        return result;
    }
    
    /**
     * 批量添加用户
     */
    @Override
    public JacksonCountReturn addRoleUserData(String userNos, String roleNo) {
        Date nowDate = new Date();
        JacksonCountReturn result = new JacksonCountReturn();
        int successCount = 0;
        int shoudSuccessCount = 0;
        if (!Tools.isblank(userNos)) {
            // Arrays.asList获得的列表在执行remove时可能出错 放到新建的表中
            List<String> spiltUserNoList = Arrays.asList(userNos.split(","));
            List<String> initUserNoList = new ArrayList<String>();
            for (String spiltUserNo : spiltUserNoList) {
                initUserNoList.add(spiltUserNo);
            }
            if (!Tools.listisblank(initUserNoList)) {
                // 备份初始userNo列表
                List<String> allUserNoList = new ArrayList<String>();
                for (String userNo : initUserNoList) {
                    allUserNoList.add(userNo);
                }
                // 先查询出数据库中是否存在(包括del_flag=1)
                PdMUserRoleExample pdMUserRoleExample = new PdMUserRoleExample();
                PdMUserRoleExample.Criteria pdMUserRoleCriteria = pdMUserRoleExample.createCriteria();
                pdMUserRoleCriteria.andUserNoIn(allUserNoList);
                pdMUserRoleCriteria.andRoleNoEqualTo(roleNo);
                List<PdMUserRole> selUserRoleList = pdMUserRoleMapper.selectByExample(pdMUserRoleExample);
                // 如果存在 放入userNo列表中
                List<String> userNoList = new ArrayList<String>();
                for (PdMUserRole pdMUserRole : selUserRoleList) {
                    userNoList.add(pdMUserRole.getUserNo());
                }
                // 删除需要更新的 剩下需要新增的userNo
                initUserNoList.removeAll(userNoList);
                shoudSuccessCount += initUserNoList.size();
                // 获取需要修改的记录（del_flag为1的记录）
                pdMUserRoleCriteria.andDelFlagEqualTo(DELETE_FLAG_1);
                List<PdMUserRole> selUpdateUserRoleList = pdMUserRoleMapper.selectByExample(pdMUserRoleExample);
                if (!Tools.listisblank(selUpdateUserRoleList)) {
                    shoudSuccessCount += selUpdateUserRoleList.size();
                    // 将userNo里的del_flag更新为0
                    PdMUserRole pdMUserRole = new PdMUserRole();
                    pdMUserRole.setDelFlag(DELETE_FLAG_0);
                    pdMUserRole.setDateModified(nowDate);
                    pdMUserRole.setModifiedBy(getLoginUser().getUserNo());
                    successCount += pdMUserRoleMapper.updateByExampleSelective(pdMUserRole, pdMUserRoleExample);
                }
                // 新增记录
                for (String userNo : initUserNoList) {
                    PdMUserRole addUserRole = new PdMUserRole();
                    addUserRole.setDelFlag(DELETE_FLAG_0);
                    addUserRole.setDateModified(nowDate);
                    addUserRole.setModifiedBy(getLoginUser().getUserNo());
                    addUserRole.setDateCreated(nowDate);
                    addUserRole.setCreatedBy(getLoginUser().getUserNo());
                    addUserRole.setUserNo(userNo);
                    addUserRole.setRoleNo(roleNo);
                    successCount += pdMUserRoleMapper.insert(addUserRole);
                }
            }
            
        }
        if (successCount < shoudSuccessCount) {
            result.setRetMsg(SAVEFAILED);
            result.setSuccessCount(0);
        } else {
            result.setRetMsg(SAVESUCCESS);
            result.setSuccessCount(1);
        }
        return result;
    }
    
}
