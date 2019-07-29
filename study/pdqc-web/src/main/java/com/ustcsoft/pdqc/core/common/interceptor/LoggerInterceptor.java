//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 用于打印日志或者分析Action执行的时间.
 * 
 * @author kxiong
 *
 */
public class LoggerInterceptor extends HandlerInterceptorAdapter implements Ordered {
    /**
     * 日志对象.
     */
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 开始时间属性.
     */
    private static final String REQ_ATTRIBUTE_START_TIME = LoggerInterceptor.class.getName() + ".startTime";

    /**
     * 结束时间属性.
     */
    private static final String REQ_ATTRIBUTE_END_TIME = LoggerInterceptor.class.getName() + ".endTime";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        request.setAttribute(REQ_ATTRIBUTE_START_TIME, System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        request.setAttribute(REQ_ATTRIBUTE_END_TIME, System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // 获得当前时间
        long now = System.currentTimeMillis();
        long startTime = (long) request.getAttribute(REQ_ATTRIBUTE_START_TIME);
        Long endTime = (Long) request.getAttribute(REQ_ATTRIBUTE_END_TIME);
        // 如果结束时间为null
        if (endTime == null) {
            logger.debug("请求路径:{}, 合计耗时:{}ms", request.getRequestURI(), now - startTime);
        } else {
            logger.debug("请求路径:{}, 合计耗时:{}ms (Action:{}ms, Render:{}ms)", request.getRequestURI(), now - startTime,
                    endTime - startTime, now - endTime);
        }
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

}
