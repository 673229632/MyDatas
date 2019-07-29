//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.security;

import com.ustcsoft.marsfw.shiro.web.authc.FormAuthPrincipal;

/**
 * 登录用户Principal信息.
 * 
 * @author kxiong
 *
 */
public class LoginPrincipal extends FormAuthPrincipal {
    /**
     * 
     */
    private static final long serialVersionUID = -5765925462043891734L;

    /**
     * 客户端的浏览器.
     */
    private String browser;

    /**
     * 客户端的操作系统.
     */
    private String os;

    /**
     * 用户信息.
     */
    private LoginUser loginUser;

    /**
     * 用户菜单信息.
     */
    private UIMenu menu;

    /**
     * browser的GET方法.
     *
     * @return browser
     */
    public final String getBrowser() {
        return browser;
    }

    /**
     * browser的SET方法.
     *
     * @param browser browser
     */
    public final void setBrowser(String browser) {
        this.browser = browser;
    }

    /**
     * os的GET方法.
     *
     * @return os
     */
    public final String getOs() {
        return os;
    }

    /**
     * os的SET方法.
     *
     * @param os os
     */
    public final void setOs(String os) {
        this.os = os;
    }

    /**
     * menu的GET方法.
     *
     * @return menu
     */
    public final UIMenu getMenu() {
        return menu;
    }

    /**
     * menu的SET方法.
     *
     * @param menu menu
     */
    public final void setMenu(UIMenu menu) {
        this.menu = menu;
    }

    /**
     * loginUser的GET方法.
     *
     * @return loginUser
     */
    public final LoginUser getLoginUser() {
        return loginUser;
    }

    /**
     * loginUser的SET方法.
     *
     * @param loginUser loginUser
     */
    public final void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

}
