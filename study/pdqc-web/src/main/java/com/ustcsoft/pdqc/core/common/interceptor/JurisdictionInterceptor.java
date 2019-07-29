//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ustcsoft.marsfw.shiro.core.authz.exception.ShiroAuthzI18nException;
import com.ustcsoft.marsfw.shiro.core.filter.authc.AnonFilter;
import com.ustcsoft.pdqc.web.common.constants.ControllerID;

/**
 * 画面ID的获取以及权限的控制
 * 
 *
 */
public class JurisdictionInterceptor extends HandlerInterceptorAdapter implements Ordered {
    /**
     * 日志对象.
     */
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static final String DEFAULT_CONTROLLER_ID_ATTRIBUTE = "controllerID";

    private String controllerIDAttribute = DEFAULT_CONTROLLER_ID_ATTRIBUTE;

    /**
     * 获取画面ID
     * 
     * @param handler HandlerMethod
     * @param request HttpServletRequest
     * @return 画面ID
     */
    private String getPermission(HandlerMethod handler, HttpServletRequest request) {
        // 获得入口的类
        Object controller = ((HandlerMethod) handler).getBean();
        // 取得本Action的画面ID Annotation
        ControllerID annoControllerID = controller.getClass().getAnnotation(ControllerID.class);
        // 取得本方法的画面ID
        ControllerID annoFunctionID = ((HandlerMethod) handler).getMethodAnnotation(ControllerID.class);

        String controllerId = StringUtils.trimToEmpty((annoControllerID == null) ? null : annoControllerID.value());
        // 获得操作ID
        String functionID = StringUtils.trimToEmpty((annoFunctionID == null) ? null : annoFunctionID.value());

        // 如果操作ID为空
        if (StringUtils.isEmpty(functionID)) {
            if (StringUtils.isEmpty(controllerId)) {
                request.setAttribute(controllerIDAttribute, null);
                return null;
            } else {
                request.setAttribute(controllerIDAttribute, controllerId);
                return controllerId;
            }
        } else {
            request.setAttribute(controllerIDAttribute, functionID);
            return functionID;
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        // 如果handler为空或者不是HandlerMethod
        if (handler == null || !(handler instanceof HandlerMethod)) {
            return true;
        }

        // 获得本方法的权限
        String permission = getPermission((HandlerMethod) handler, request);

        // 如果不需要权限控制
        if (permission == null) {
            return true;
        }
        // 判断是否为匿名访问
        if (request.getAttribute(AnonFilter.DEFAULT_ANONYMOUS_ATTRIBUTE) != null) {
            return true;
        }

        Subject subject = SecurityUtils.getSubject();
        if (!subject.isPermitted(permission)) {
            // 输出日志
            logger.debug("用户没有权限[{}]", permission);
            response.setStatus(403);
            throw new ShiroAuthzI18nException();
        }
        return true;
    }

    @Override
    public int getOrder() {
        // TODO Auto-generated method stub
        return 0;
    }

}
