package com.ustcsoft.pdqc.web.systemmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.systemmanager.form.LoginUserInfoCondForm;
import com.ustcsoft.pdqc.web.systemmanager.service.LoginUserInfoService;


/**
 * @author lijun
 * 登录用户主页.
 */
@Controller
@RequestMapping("/systemManage/LoginUserInfo")
public class LoginUserInfoController extends WebBaseController{
	
	@Autowired
	private LoginUserInfoService loginUserInfoService;
	
	/**
     * 修改皮肤
     * 
     * @param condition condition
     * @return JacksonReturn
     */
    @RequestMapping("/changgeSkinCss")
    public JacksonReturn changgeSkinCss(LoginUserInfoCondForm condition) {
        return loginUserInfoService.changgeSkinCss(condition);
    }
}	
