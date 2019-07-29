//******************************************************************************
// 版权所有(c) 2017，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.lotus.web.common.util;

import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;

/**
 * 文件上传服务器.
 * 
 * @author zhangrui.i
 * @since 2017年12月19日 下午6:11:08
 */
public class FileUtil {

    /**
     * 文件名编码.
     * 
     * @param filename String
     * @return String
     */
    public static String encodingFilename(String filename) {
        filename = filename.replace("_", " ");
        filename = System.nanoTime() + filename;
        return filename;
    }

    /**
     * 获得服务器根路径.
     * 
     * @param request HttpServletRequest
     * @return String
     */
    public static String getRootPath(HttpServletRequest request) {
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        if (Tools.isblank(rootPath)) {
            try {
                rootPath = request.getSession().getServletContext().getResource("/").getPath();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return rootPath;
    }

}
