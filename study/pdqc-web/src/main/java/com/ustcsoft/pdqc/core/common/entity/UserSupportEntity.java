//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.common.entity;

/**
 * 创建者、更新者字段支持Entity接口.
 * 
 * @author kxiong
 *
 */
public interface UserSupportEntity {
    /**
     * 设定创建者.
     * 
     * @param createUser 创建者
     */
    void setCreateUser(String createUser);

    /**
     * 设定更新者.
     * 
     * @param updateUser 更新者
     */
    void setUpdateUser(String updateUser);
}
