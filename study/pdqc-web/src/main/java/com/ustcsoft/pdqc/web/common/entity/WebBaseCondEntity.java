//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.entity;

import com.ustcsoft.mybatis.paging.Paging;

/**
 * WEB共通分页查询Entity基类.
 * 
 * @author kxiong
 *
 */
public class WebBaseCondEntity extends WebBaseEntity implements WebPagingEntity {
    /**
     * 分页对象.
     */
    private Paging paging = null;

    /**
     * 排序对象.
     */
    private String orderByString = null;

    /**
     * paging的GET方法.
     *
     * @return paging
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * paging的SET方法.
     *
     * @param paging paging
     */
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    /**
     * orderByString的GET方法.
     *
     * @return orderByString
     */
    public String getOrderByString() {
        return orderByString;
    }

    /**
     * orderByString的SET方法.
     *
     * @param orderByString orderByString
     */
    public void setOrderByString(String orderByString) {
        this.orderByString = orderByString;
    }

}
