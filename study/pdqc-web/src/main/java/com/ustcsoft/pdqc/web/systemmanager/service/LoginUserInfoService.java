
package com.ustcsoft.pdqc.web.systemmanager.service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.web.systemmanager.form.LoginUserInfoCondForm;


/**
 * 登录用户信息服务.
 * 
 * @author jiangzongyue
 *
 */
public interface LoginUserInfoService  {

	
    public JacksonReturn changgeSkinCss(LoginUserInfoCondForm condition);

}
