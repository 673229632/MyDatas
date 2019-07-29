//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.ustcsoft.pdqc.web.common.security.LoginPrincipal;
import com.ustcsoft.pdqc.web.common.security.LoginUser;
import com.ustcsoft.pdqc.web.common.security.UIMenu;



/**
 * @author kxiong
 *
 */
public class SecurityUtil {

    public static LoginPrincipal getPrincipal() {
        Subject subject = SecurityUtils.getSubject();
        return (LoginPrincipal) subject.getPrincipal();
    }

    /**
     * 获得用户信息.
     * 
     * @return
     */
    public static LoginUser getLoginUser() {
        LoginPrincipal loginPrincipal = getPrincipal();
        return (loginPrincipal == null) ? null : loginPrincipal.getLoginUser();
    }

    /**
     * 获得用户菜单.
     * 
     * @param request
     * @return
     */
    public static UIMenu getMenu() {
        LoginPrincipal principal = getPrincipal();
        return (principal == null) ? null : principal.getMenu();
    }
}
