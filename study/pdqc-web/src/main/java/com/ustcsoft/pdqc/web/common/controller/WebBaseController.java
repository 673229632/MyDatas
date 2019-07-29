//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.context.support.WebApplicationObjectSupport;

import com.ustcsoft.marsfw.core.i18n.I18nMsg;
import com.ustcsoft.pdqc.web.common.constants.WebCommonConstants;
import com.ustcsoft.pdqc.web.common.security.LoginPrincipal;
import com.ustcsoft.pdqc.web.common.security.LoginUser;
import com.ustcsoft.pdqc.web.common.util.SecurityUtil;


/**
 * 共通WEB Controller基类.
 * 
 * @author kxiong
 *
 */
public class WebBaseController extends WebApplicationObjectSupport implements WebCommonConstants {
    // 日志
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MessageSource messageSource;

    // 默认的区域
    private Locale defaultLocale = Locale.SIMPLIFIED_CHINESE;

    /**
     * 客户端跳转.
     * 
     * @param url 跳转地址
     * @return 跳转视图
     */
    protected String redirect(String url) {
        return "redirect:" + url;
    }

    /**
     * 获得用户的Principal.
     * 
     * @return Principal
     */
    public LoginPrincipal getPrincipal() {
        return SecurityUtil.getPrincipal();
    }

    /**
     * 获得当前登录用户的信息.
     * 
     * @return 用户的信息
     */
    public LoginUser getLoginUser() {
        return SecurityUtil.getLoginUser();
    }

    /**
     * 获得多国语言消息.
     * 
     * @param code 消息Code
     * @return I18n消息
     */
    protected String getMessage(String code) {
        if (messageSource == null) {
            return code;
        }
        return messageSource.getMessage(code, null, defaultLocale);
    }

    /**
     * 获得多国语言消息.
     * 
     * @param code 消息Code
     * @param parm 消息参数
     * @return I18n消息
     */
    protected String getMessage(String code, Object... parm) {
        if (messageSource == null) {
            return code;
        }
        return messageSource.getMessage(code, parm, defaultLocale);
    }

    /**
     * 获得多国语言消息.
     * 
     * @param msg 消息Code
     * @return I18n消息
     */
    protected String getMessage(I18nMsg msg) {
        if (messageSource == null) {
            return msg.getCode();
        }
        return messageSource.getMessage(msg.getCode(), msg.getParam(), defaultLocale);
    }
}
