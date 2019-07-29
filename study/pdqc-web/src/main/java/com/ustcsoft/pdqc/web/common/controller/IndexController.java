//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ustcsoft.marsfw.core.i18n.I18nMsg;
import com.ustcsoft.marsfw.shiro.web.authc.FormAuthcToken;
import com.ustcsoft.marsfw.shiro.web.filter.authc.FormAuthcFilter;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.pdqc.web.common.security.LoginUser;

/**
 * 首页.
 * 
 * @author kxiong
 *
 */
@Controller
@RequestMapping("/")
public class IndexController extends WebBaseController {
    
    @RequestMapping("")
    public String index(ModelMap model) {
        if("1".equals(getLoginUser().getRoleNo())){
            return WEB_COMMON_PAGE_INDEX1;
        }else{
            return WEB_COMMON_PAGE_INDEX;
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout();
        }
        // 初期访问Login画面
        return WEB_COMMON_PAGE_LOGIN;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String failLogin(Model model, HttpServletRequest request, String userName) {
        I18nMsg msg = (I18nMsg) request.getAttribute(FormAuthcFilter.DEFAULT_AUTHC_ERROR_I18N_MSG);
        if (msg != null) {
            model.addAttribute("errorMessage", getMessage(msg));
            model.addAttribute("username", userName);
        }
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout();
        }
        // 登录失败，返回Login画面
        return WEB_COMMON_PAGE_LOGIN;
    }
    
    @RequestMapping(value = "/switchRole",method = RequestMethod.GET)
    public JacksonDataReturn<LoginUser> switchRole(String roleid) {
        JacksonDataReturn<LoginUser> jackson = new JacksonDataReturn<LoginUser>();
        Subject subject = SecurityUtils.getSubject();
        FormAuthcToken token = new FormAuthcToken(getLoginUser().getLoginName(),getLoginUser().getUserPass());
        getLoginUser().setRoleNo(roleid);
        subject.login(token);
        jackson.setData(getLoginUser());
        return jackson;
    }
}
