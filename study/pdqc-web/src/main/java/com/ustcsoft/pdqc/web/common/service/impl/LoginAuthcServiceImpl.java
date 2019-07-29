//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.shiro.core.authc.exception.ShiroAuthcException;
import com.ustcsoft.marsfw.shiro.core.authc.exception.ShiroAuthcI18nException;
import com.ustcsoft.marsfw.shiro.core.authz.SimpleAuthzInfo;
import com.ustcsoft.marsfw.shiro.web.authc.FormAuthPrincipal;
import com.ustcsoft.marsfw.shiro.web.authc.FormAuthcInfo;
import com.ustcsoft.marsfw.shiro.web.authc.FormAuthcToken;
import com.ustcsoft.marsfw.shiro.web.service.FormAuthService;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMRoleFuncMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMRoleMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMSysFuncMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMUserMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMUserRoleMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRole;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleFunc;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleFuncExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMSysFunc;
import com.ustcsoft.pdqc.core.autogen.entity.PdMSysFuncExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserRole;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserRoleExample;
import com.ustcsoft.pdqc.web.common.constants.Constants;
import com.ustcsoft.pdqc.web.common.security.LoginPrincipal;
import com.ustcsoft.pdqc.web.common.security.LoginUser;
import com.ustcsoft.pdqc.web.common.security.UIMenu;
import com.ustcsoft.pdqc.web.common.security.UIMenuItem;
import com.ustcsoft.pdqc.web.common.util.Tools;

import eu.bitwalker.useragentutils.UserAgent;

/**
 * 
 * 用户验证Service.
 * 
 * @author kxiong
 *
 */
@Service
public class LoginAuthcServiceImpl extends WebBaseServiceImpl implements FormAuthService, Constants {

    // 用户表Mapper
    @Autowired
    private PdMUserMapper  pdMUserMapper;
    
    @Autowired
    private PdMUserRoleMapper pdMUserRoleMapper;
    
    @Autowired
    private PdMRoleMapper pdMRoleMapper;
    
    // 角色分配资源对应关系表Mapper
    /*@Autowired
    private SPermissionsInfoMapper sPermissionsInfoMapper;*/
    
    @Autowired
    private PdMRoleFuncMapper pdMRoleFuncMapper;
    
    @Autowired
    private PdDQcCenterMapper pdDQcCenterMapper;
    
    @Autowired
    private PdDCenterMapper pdDCenterMapper;
    
   /* @Autowired
    private SResourcesInfoMapper sResourcesInfoMapper;*/
    //菜单信息
    @Autowired
    private PdMSysFuncMapper pdMSysFuncMapper;
    
    /*@Autowired
    private HpInfoMapper hpInfoMapper;*/

    @Override
    public FormAuthcInfo<FormAuthPrincipal> doGetAuthcInfo(FormAuthcToken authcToken) throws ShiroAuthcException {

        // 如果用户名未输入
        if (StringUtils.isBlank(authcToken.getUsername())) {
            // 抛出异常
            throw new ShiroAuthcI18nException(MSG_E_USERNAME_EMPTY);
        }

        if (StringUtils.isEmpty(authcToken.getPassword())) {
            // 如果密码未输入
            throw new ShiroAuthcI18nException(MSG_E_PASSWORD_EMPTY);
        }

        // 判断用户是否存在
        /*MStaff user = getUser(authcToken.getUsername());*/
        PdMUser user = getUser(authcToken.getUsername());
        // 如果不存在
        if (user == null) {
            throw new ShiroAuthcI18nException(MSG_E_USERNAME_NOT_EXIST, authcToken.getUsername());
        }
        //获取用户角色列表
        //List<SRoleInfo> list = getRoleIds(user.getId());
        List<PdMRole> list = getRoleIds(user.getUserNo());
        String roleNo = null;
        String roleName = null;
        String qcCenterNo = null;
        String centerNo = null;
        //String roletype = null;
        //设置当前用户当前选择角色
        if(!Tools.isblank(list)){
            if(!Tools.isblank(getLoginUser())){
                /*if(!Tools.isblank(getLoginUser().getRoleId())){
                    for(SRoleInfo sroleinfo:list){
                        if(sroleinfo.getId().equals(getLoginUser().getRoleId())){
                            roleid = sroleinfo.getId();
                            rolename = sroleinfo.getName();
                            roletype = sroleinfo.getRoletype();
                        }
                    }
                }*/
            	if(!Tools.isblank(getLoginUser().getRoleNo())){
            		for(PdMRole mRole:list){
            			if(mRole.getRoleNo().equals(getLoginUser().getRoleNo())){
            				roleNo = mRole.getRoleNo();
            				roleName = mRole.getRoleName();
            			}
            		}
            	}
            }else{
                if(list.size()>0){
                    /*roleid = list.get(0).getId();
                    rolename = list.get(0).getName();
                    roletype = list.get(0).getRoletype();*/
                	roleNo = list.get(0).getRoleNo();
    				roleName = list.get(0).getRoleName();
                }
            }
        }
        //登录用户的质控中心
        List<PdDQcCenter> qcCenters = getQcCenters(user.getOrgNo());
        if(!Tools.listisblank(qcCenters)){
        	qcCenterNo = qcCenters.get(0).getQcCenterNo();
        }
        //登录用户的透析中心
        List<PdDCenter> dCenters = getCenters(user.getOrgNo());
        if(!Tools.listisblank(dCenters)){
        	centerNo = dCenters.get(0).getPdCenterNo();
        }
        //用户是否有角色
        /*if(Tools.isblank(roleid)){
            throw new ShiroAuthcI18nException(MSG_E_USER_ROLE_NOTEXIST, authcToken.getUsername());
        }else{
            user.setRoleid(roleid);
        }*/
        if(Tools.isblank(roleNo)){
        	throw new ShiroAuthcI18nException(MSG_E_USER_ROLE_NOTEXIST, authcToken.getUsername());
        }
        // 如果存在，判断密码是否正确
        if (!checkPassword(user, authcToken.getPassword())) {
            // 登录失败（密码不正确）
            throw new ShiroAuthcI18nException(MSG_E_PASSWORD_INVALID, authcToken.getUsername());
        }
        logger.debug("客户端信息:{}", "IP:【" + authcToken.getHost() + "】 用户名：【" + authcToken.getUsername() + "】 密码：【"
                + authcToken.getPassword() + "】");
        // 创建验证信息
        FormAuthcInfo<FormAuthPrincipal> info = new FormAuthcInfo<FormAuthPrincipal>();
        // 创建主体对象
        LoginPrincipal principal = new LoginPrincipal();
        // 客户端信息
        UserAgent userAgent = UserAgent.parseUserAgentString(authcToken.getUserAgent());
        // 设定IP
        principal.setHost(authcToken.getHost());
        // 设定浏览器
        principal.setBrowser(userAgent.getBrowser().getName());
        // 设定操作系统
        principal.setOs(userAgent.getOperatingSystem().getName());

        /*principal.setUserId(user.getNickname());
        principal.setUserDisplayName(user.getName());*/
        principal.setUserId(user.getLoginName());
        principal.setUserDisplayName(user.getUserName());
        
        LoginUser loginUser = new LoginUser();
        // 用户id
        /*loginUser.setId(user.getId());
        loginUser.setLoginPwd(authcToken.getPassword());
        loginUser.setUserName(user.getName());*/
        loginUser.setUserNo(user.getUserNo());
        loginUser.setUserPass(authcToken.getPassword());
        loginUser.setUserName(user.getUserName());
        loginUser.setOrgNo(user.getOrgNo());
        // 登录账户
        //loginUser.setNickname(authcToken.getUsername());
        //当前角色
        //loginUser.setRoleId(user.getRoleid());
        loginUser.setRoleNo(roleNo);
        //质控中心编号
        loginUser.setQcCenterNo(qcCenterNo);
        //透析中心编号
        loginUser.setDialysisCenterNo(centerNo);
        //当前角色类型
        //loginUser.setRoletype(roletype);
        //当前角色名称
        //loginUser.setRoleName(rolename);
        loginUser.setRoleName(roleName);
        //用户角色列表
        loginUser.setRoleList(list);
        
        loginUser.setSkincss(Tools.isblank(user.getSkincss()) ? "default" : user.getSkincss());
        // 查询医院名称
        /*HpInfoExample example = new HpInfoExample();
        List<HpInfo> hpInfos = hpInfoMapper.selectByExample(example);
        if (!Tools.listisblank(hpInfos)) {
            loginUser.setHospitalName(hpInfos.get(0).getName().trim());
        } else {
            loginUser.setHospitalName("科大国创软件股份有限公司");
        }*/
        principal.setLoginUser(loginUser);
        principal.setMenu(getMenuInfo(user));
        info.setPrincipal(principal);
        info.setCredentials(authcToken.getCredentials());
        // 获取授权信息
        fillAuthorizationInfo(principal, user);
        return info;
    }
    
    /**
     * 获取用户角色
     * 
     * @param String userid
    */
    /*private List<SRoleInfo> getRoleIds(String userid){
        List<SRoleInfo> list = new ArrayList<SRoleInfo>();
        SUserRoleExample example = new SUserRoleExample();
        SUserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteflagEqualTo(DELETE_FLAG_0);
        criteria.andUseridEqualTo(userid);
        List<SUserRole> userRolelist = sUserRoleMapper.selectByExample(example);
        if(!Tools.listisblank(userRolelist)){
            for(SUserRole sUserRole:userRolelist){
                List<SRoleInfo> infolist = new ArrayList<SRoleInfo>();
                SRoleInfoExample infoexample = new SRoleInfoExample();
                SRoleInfoExample.Criteria infoCriteria = infoexample.createCriteria();
                infoCriteria.andDeleteflagEqualTo(DELETE_FLAG_0);
                infoCriteria.andIdEqualTo(sUserRole.getRoleid());
                infolist= sRoleInfoMapper.selectByExample(infoexample);
                if(!Tools.listisblank(infolist) && infolist.size()>0){
                    list.add(infolist.get(0));
                }
            }
        }
        return list;
    }*/
    //获取用户角色
    private List<PdMRole> getRoleIds(String userNo){
    	List<PdMRole> list = new ArrayList<>();
    	PdMUserRoleExample example = new PdMUserRoleExample();
    	PdMUserRoleExample.Criteria criteria = example.createCriteria();
    	criteria.andDelFlagEqualTo(DELETE_FLAG_0);
    	criteria.andUserNoEqualTo(userNo);
    	List<PdMUserRole> mUserRoles=this.pdMUserRoleMapper.selectByExample(example);
    	if(!Tools.listisblank(mUserRoles)){
    		for(PdMUserRole mUserRole : mUserRoles){
    			PdMRoleExample roleExample = new PdMRoleExample();
    			PdMRoleExample.Criteria pdMRoleCriteria = roleExample.createCriteria();
    			pdMRoleCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
    			pdMRoleCriteria.andRoleNoEqualTo(mUserRole.getRoleNo());
    			List<PdMRole> userRoles = this.pdMRoleMapper.selectByExample(roleExample);
    			if(!Tools.listisblank(userRoles)&&userRoles.size()>0){
    				list.add(userRoles.get(0));
    			}
    		}
    	}
    	return list;
    }
    //获取用户的质控中心编号
    private List<PdDQcCenter> getQcCenters(String orgNo){
    	PdDQcCenterExample example = new PdDQcCenterExample();
    	PdDQcCenterExample.Criteria criteria = example.createCriteria();
    	criteria.andDelFlagEqualTo(DELETE_FLAG_0);
    	criteria.andOrgNoEqualTo(orgNo);
    	List<PdDQcCenter> qcCenters = this.pdDQcCenterMapper.selectByExample(example);
    	return qcCenters;
    }
    //获取用户的透析中心编号
    private List<PdDCenter> getCenters(String orgNo){
    	PdDCenterExample example = new PdDCenterExample();
    	PdDCenterExample.Criteria criteria = example.createCriteria();
    	criteria.andDelFlagEqualTo(DELETE_FLAG_0);
    	criteria.andOrgNoEqualTo(orgNo);
    	List<PdDCenter> centers = this.pdDCenterMapper.selectByExample(example);
    	return centers;
    }
    /**
     * 权限.
     * 
     * @param principal principal
     */
    /*private void fillAuthorizationInfo(LoginPrincipal principal, MStaff user) {
        String rolecode = user.getRoleid();
        SPermissionsInfoExample example = new SPermissionsInfoExample();
        SPermissionsInfoExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidEqualTo(rolecode);
        criteria.andDeleteflagEqualTo("0");
        // 画面 权限
        List<SPermissionsInfo> sInfos = sPermissionsInfoMapper.selectByExample(example);

        Set<String> set = new HashSet<String>();
        if (sInfos != null && sInfos.size() > 0) {
            for (SPermissionsInfo s : sInfos) {
                set.add(s.getResourcesid());
            }
        }

        SimpleAuthzInfo simpleAuthzInfo = new SimpleAuthzInfo();
        simpleAuthzInfo.addStringPermissions(set);
        principal.setAuthzInfo(simpleAuthzInfo);
    }*/
    //权限
    private void fillAuthorizationInfo(LoginPrincipal principal, PdMUser user){
    	String userNo=user.getUserNo();
    	PdMUserRoleExample roleExample = new PdMUserRoleExample();
    	PdMUserRoleExample.Criteria criteria = roleExample.createCriteria();
    	criteria.andDelFlagEqualTo(DELETE_FLAG_0);
    	criteria.andUserNoEqualTo(userNo);
    	List<PdMUserRole> userRoles = this.pdMUserRoleMapper.selectByExample(roleExample);
    	if(!Tools.listisblank(userRoles)){
    		PdMUserRole mUserRole = userRoles.get(0);
    		String roleNo = mUserRole.getRoleNo();
    		PdMRoleFuncExample funcExample = new PdMRoleFuncExample();
    		PdMRoleFuncExample.Criteria pdMRoleFuncCriteria = funcExample.createCriteria();
    		pdMRoleFuncCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
    		pdMRoleFuncCriteria.andRoleNoEqualTo(roleNo);
    		List<PdMRoleFunc> roleFuncs = this.pdMRoleFuncMapper.selectByExample(funcExample);
    		Set<String> set = new HashSet<String>();
    		if(roleFuncs !=null && roleFuncs.size() > 0){
    			for(PdMRoleFunc roleFunc : roleFuncs){
    				set.add(roleFunc.getFuncId()+"");
    			}
    		}
    		SimpleAuthzInfo simpleAuthzInfo = new SimpleAuthzInfo();
            simpleAuthzInfo.addStringPermissions(set);
            principal.setAuthzInfo(simpleAuthzInfo);
    	}
    }
    
    /*private MStaff getUser(String userName) {
        // 创建检索样例
        MStaffExample ex = new MStaffExample();
        // 创建检索条件
        MStaffExample.Criteria criteria = ex.createCriteria();

        // 用户名相等
        criteria.andNicknameEqualTo(userName);

        // 删除标记=正常用户
        criteria.andDeleteflagEqualTo(DELETE_FLAG_0);

        // 检索
        List<MStaff> lstUser = mStaffMapper.selectByExample(ex);
        // 如果存在
        if (lstUser != null && !lstUser.isEmpty()) {
            return lstUser.get(0);
        }
        // 没有找到
        return null;
    }*/
    
    //根据登录用户名获得用户信息
    private PdMUser getUser(String userName){
    	PdMUserExample ex=new PdMUserExample();
    	PdMUserExample.Criteria criteria = ex.createCriteria();
    	criteria.andDelFlagEqualTo(DELETE_FLAG_0);
    	criteria.andLoginNameEqualTo(userName);
    	List<PdMUser> users = this.pdMUserMapper.selectByExample(ex);
    	//如果存在
    	if(!Tools.listisblank(users)){
    		return users.get(0);
    	}
    	//没有找到
    	return null;
    }

    /**
     * 检查密码.
     *
     * @param user 用户信息
     * @param password 密码信息
     * @return true/false
     */
    /*private boolean checkPassword(MStaff user, String password) {
        if (user.getPassword() == null || !user.getPassword().trim().equals(password)) {
            // 密码不正确
            return false;
        }
        return true;
    }*/
    private boolean checkPassword(PdMUser user,String password){
    	if (user.getUserPass() == null || !user.getUserPass().trim().equals(password)){
    		//密码不正确
    		return false;
    	}
    	return true;
    }
    
    /**
     * 获取用户菜单.
     * 
     * @param sUserInfo 用户
     * @return 菜单对象
     */
    /*private UIMenu getMenuInfo(MStaff mStaff) {
        UIMenu menu = new UIMenu();
        // 通过找到这个人的角色找出他所拥有权限的画面ID
        SPermissionsInfoExample example = new SPermissionsInfoExample();
        SPermissionsInfoExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidEqualTo(mStaff.getRoleid());
        criteria.andDeleteflagEqualTo(DELETE_FLAG_0);
        List<SPermissionsInfo> sInfos = sPermissionsInfoMapper.selectByExample(example);
        if (sInfos != null && sInfos.size() > 0) {
            List<String> list = new ArrayList<>();
            for (SPermissionsInfo s : sInfos) {
                list.add(s.getResourcesid());
            }

            // 找出这个人所拥有菜单中是一级菜单的
            SResourcesInfoExample example2 = new SResourcesInfoExample();
            SResourcesInfoExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andIdIn(list);
            criteria2.andIsshowEqualTo("1");
            criteria2.andDeleteflagEqualTo(DELETE_FLAG_0);
            criteria2.andParentidIsNull();
            // criteria2.andMenulevelEqualTo(DELETE_FLAG_0);
            example2.setOrderByClause(SResourcesInfoColumnEnum.DISPORDER.getOrderByString(false));
            // 该用户所有一级菜单
            List<SResourcesInfo> sResourcesInfos = sResourcesInfoMapper.selectByExample(example2);

            // 找出每个一级菜单下的子菜单
            for (SResourcesInfo sresource : sResourcesInfos) {

                UIMenuItem form = new UIMenuItem();
                form.setMenuId(sresource.getId());
                form.setMenuName(sresource.getName());
                form.setMenuIcon(sresource.getMemo());
                form.setMenuUrl(sresource.getUri());
                form.resetLevel(0);

                SResourcesInfoExample example3 = new SResourcesInfoExample();
                SResourcesInfoExample.Criteria criteria3 = example3.createCriteria();
                criteria3.andParentidEqualTo(sresource.getId());
                criteria3.andIdIn(list);
                criteria3.andIsshowEqualTo("1");
                criteria3.andDeleteflagEqualTo(DELETE_FLAG_0);
                // criteria3.andMenulevelEqualTo(FLAG_1);
                example3.setOrderByClause(SResourcesInfoColumnEnum.DISPORDER.getOrderByString(false));
                // 该用户所有二级菜单
                List<SResourcesInfo> sResourcesInfos3 = sResourcesInfoMapper.selectByExample(example3);
                for (SResourcesInfo sInfo2 : sResourcesInfos3) {
                    UIMenuItem form2 = new UIMenuItem();
                    form2.setMenuId(sInfo2.getId());
                    form2.setMenuName(sInfo2.getName());
                    form2.setMenuIcon(sInfo2.getMemo());
                    form2.setMenuUrl(sInfo2.getUri());
                    form2.resetLevel(1);
                    form.getSubMenu().add(form2);
                }
                menu.getMenuItems().add(form);
            }
        }
        return menu;
    }*/
    /**
     * 获取用户菜单.
     * 
     * @param sUserInfo 用户
     * @return 菜单对象
     */
    private UIMenu getMenuInfo(PdMUser mUser){
    	 UIMenu menu = new UIMenu();
         // 通过找到这个人的角色找出他所拥有权限的画面ID
    	 String userNo = mUser.getUserNo();
    	 PdMUserRoleExample roleExample = new PdMUserRoleExample();
    	 PdMUserRoleExample.Criteria criteria = roleExample.createCriteria();
    	 criteria.andDelFlagEqualTo(DELETE_FLAG_0);
    	 criteria.andUserNoEqualTo(userNo);
    	 List<PdMUserRole> userRoles = this.pdMUserRoleMapper.selectByExample(roleExample);
    	 if(!Tools.listisblank(userRoles)){
     		PdMUserRole mUserRole = userRoles.get(0);
     		String roleNo = mUserRole.getRoleNo();
     		PdMRoleFuncExample funcExample = new PdMRoleFuncExample();
     		PdMRoleFuncExample.Criteria funcCriteria = funcExample.createCriteria();
     		funcCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
     		funcCriteria.andRoleNoEqualTo(roleNo);
     		List<PdMRoleFunc> mRoleFuncs = this.pdMRoleFuncMapper.selectByExample(funcExample);
     		if(!Tools.listisblank(mRoleFuncs)){
     			List<Integer> firstRoleFunc = new ArrayList<>();
     			for(PdMRoleFunc func : mRoleFuncs){
     				firstRoleFunc.add(func.getFuncId());
     			}
     			//找出这个人所拥有菜单中是一级菜单的
     			PdMSysFuncExample sysFuncExample = new PdMSysFuncExample();
     			PdMSysFuncExample.Criteria sysFuncCriteria = sysFuncExample.createCriteria();
     			sysFuncExample.setOrderByClause(" order_index desc ");
     			sysFuncCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
     			sysFuncCriteria.andFuncIdIn(firstRoleFunc);
     			sysFuncCriteria.andIsShowEqualTo("1");
     			sysFuncCriteria.andPFuncIdIsNull();
     			List<PdMSysFunc> sysFuncs = this.pdMSysFuncMapper.selectByExample(sysFuncExample);
     			//找出每个一级菜单下的子菜单
     			for(PdMSysFunc sysFunc : sysFuncs){
     				UIMenuItem form = new UIMenuItem();
     				form.setMenuId(sysFunc.getFuncId()+"");
     				form.setMenuName(sysFunc.getFuncName());
     				form.setMenuIcon(sysFunc.getMemo());
     				form.setMenuUrl(sysFunc.getUrl());
     				form.resetLevel(0);
     				
     				//找出二级菜单
     				PdMSysFuncExample mSysFuncExample = new PdMSysFuncExample();
     				mSysFuncExample.setOrderByClause(" order_index desc ");
     				PdMSysFuncExample.Criteria pdMSysFuncCriteria = mSysFuncExample.createCriteria();
     				pdMSysFuncCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
     				pdMSysFuncCriteria.andPFuncIdEqualTo(sysFunc.getFuncId());
     				pdMSysFuncCriteria.andFuncIdIn(firstRoleFunc);
     				pdMSysFuncCriteria.andIsShowEqualTo("1");
     				List<PdMSysFunc> mSysFuncs = this.pdMSysFuncMapper.selectByExample(mSysFuncExample);
     				for(PdMSysFunc func : mSysFuncs){
     					UIMenuItem form2 = new UIMenuItem();
     					form2.setMenuId(func.getFuncId()+"");
     					form2.setMenuName(func.getFuncName());
     					form2.setMenuIcon(func.getMemo());
     					form2.setMenuUrl(func.getUrl());
     					form2.resetLevel(1);
     					form.getSubMenu().add(form2);
     				}
     				
     				 menu.getMenuItems().add(form);
     			}
     		}
     	}
    	return menu;
    }
}
