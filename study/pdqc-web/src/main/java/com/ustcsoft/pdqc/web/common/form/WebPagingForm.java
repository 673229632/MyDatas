//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.form;

/**
 * WEB共通分页支持Form接口.
 * 
 * @author kxiong
 *
 */
public interface WebPagingForm extends WebForm {
    /**
     * 是否后端分页.
     * 
     * @return 值
     */
    boolean isBackPage();

    /**
     * 分页大小.
     * 
     * @return 值
     */
    int getPageSize();

    /**
     * 页码.
     * 
     * @return 值
     */
    int getPageNumber();

    /**
     * 返回排序的数据库字段名字.
     * 
     * @return 字段名
     */
    String getSortName();

    /**
     * 返回排序的顺序（asc, desc）.
     * 
     * @return 顺序
     */
    String getSortOrder();
}
