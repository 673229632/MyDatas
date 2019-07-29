//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.dao.impl;


import com.ustcsoft.mybatis.paging.dao.impl.SqlSessionPagingCrudDaoImpl;
import com.ustcsoft.pdqc.core.common.entity.UserSupportEntity;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.security.LoginUser;
import com.ustcsoft.pdqc.web.common.util.SecurityUtil;

/**
 * WEB共通DAO实现.
 * 
 * @author kxiong
 *
 */
public class WebCommonDaoImpl extends SqlSessionPagingCrudDaoImpl implements WebCommonDao {
    /**
     * 获得用户的ID.
     * 
     * @return ID
     */
    public String getNickname() {
        LoginUser loginUser = SecurityUtil.getLoginUser();
        return (loginUser == null ? "" : loginUser.getLoginName());
    }

    @Override
    public int insert(String statement, Object param) {
        if (param != null && param instanceof UserSupportEntity) {
            // 获得当前登录的用户
            String loginUserId = getNickname();
            ((UserSupportEntity) param).setCreateUser(loginUserId);
            ((UserSupportEntity) param).setUpdateUser(loginUserId);
        }
        // 执行插入操作
        return super.insert(statement, param);
    }

    @Override
    public int update(String statement, Object param) {
        if (param != null && param instanceof UserSupportEntity) {
            // 获得当前登录的用户
            String loginUserId = getNickname();
            ((UserSupportEntity) param).setUpdateUser(loginUserId);
        }
        // 执行更新操作
        return super.update(statement, param);
    }

}
