//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.form;

/**
 * WEB共通查询用Form.
 * 
 * @author kxiong
 *
 */
public class WebBaseCondForm extends WebBaseForm implements WebPagingForm {
    // 每页显示行数
    private int pageSize = 20;

    // 当前页
    private int pageNumber = 1;

    // 是否后台分页
    private boolean backPage = true;

    // 排序字段
    private String sortName;

    // 排序顺序
    private String sortOrder;

    /**
     * pageSize的GET方法.
     *
     * @return pageSize
     */
    @Override
    public int getPageSize() {
        return pageSize;
    }

    /**
     * pageSize的SET方法.
     *
     * @param pageSize pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * pageNumber的GET方法.
     *
     * @return pageNumber
     */
    @Override
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * pageNumber的SET方法.
     *
     * @param pageNumber pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * backPage的GET方法.
     *
     * @return backPage
     */
    @Override
    public boolean isBackPage() {
        return backPage;
    }

    /**
     * backPage的SET方法.
     *
     * @param backPage backPage
     */
    public void setBackPage(boolean backPage) {
        this.backPage = backPage;
    }

    /**
     * sortName的GET方法.
     *
     * @return sortName
     */
    @Override
    public String getSortName() {
        return sortName;
    }

    /**
     * sortName的SET方法.
     *
     * @param sortName sortName
     */
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    /**
     * sortOrder的GET方法.
     *
     * @return sortOrder
     */
    @Override
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * sortOrder的SET方法.
     *
     * @param sortOrder sortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

}
