//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.constants;

/**
 * 共通消息定义.
 * 
 * @author kxiong
 *
 */
public interface MessageConstants {
    /**
     * 用户名没有输入.
     */
    final String MSG_E_USERNAME_EMPTY = "message.error.username.empty";

    /**
     * 用户密码没有输入.
     */
    final String MSG_E_PASSWORD_EMPTY = "message.error.password.empty";

    /**
     * 用户名不存在.
     */
    final String MSG_E_USERNAME_NOT_EXIST = "message.error.username.notexist";

    /**
     * 密码不正确.
     */
    final String MSG_E_PASSWORD_INVALID = "message.error.password.invalid";

    /**
     * 登录名重复.
     */
    final String MSG_E_LOGINID_EXIST = "message.error.loginid.exist";

    /**
     * 用户不存在.
     */
    final String MSG_E_USER_NOTEXIST = "message.error.user.notexist";
    
    /**
     * 用户没有角色.
     */
    final String MSG_E_USER_ROLE_NOTEXIST = "message.error.user.role.notexist";

    /**
     * 用户不存在或以改变.
     */
    final String MSG_E_USER_CHANGE = "message.error.user.change";

    /**
     * 用户保存成功.
     */
    final String MSG_S_USER_SAVE = "message.success.user.save";

    /**
     * 角色名重复.
     */
    final String MSG_E_ROLENAME_EXIST = "message.errror.rolename.exist";

    /**
     * 角色不存在.
     */
    final String MSG_E_ROLE_NOTEXIST = "message.error.role.notexist";

    /**
     * 角色人数不为空.
     */
    final String MSG_E_ROLE_ROLENUM_NOTEMPTY = "message.error.role.rolenum.notempty";

    /**
     * 角色保存成功.
     */
    final String MSG_S_ROLE_SAVE = "message.success.role.save";

    /**
     * 保存成功返回的信息.
     * 
     */
    final String MSG_COMM_SAVE_SUCCESS = "保存成功！";

    /**
     * 保存失败返回的信息.
     * 
     */
    final String MSG_COMM_SAVE_FAILED = "保存失败！";

    /**
     * 更新成功返回的信息.
     * 
     */
    final String MSG_COMM_UPDATE_SUCCESS = "更新成功！";

    /**
     * 更新失败返回的信息.
     * 
     */
    final String MSG_COMM_UPDATE_FAILED = "更新失败！";

    /**
     * 删除成功返回的信息.
     * 
     */
    final String MSG_COMM_DELETE_SUCCESS = "删除成功！";

    /**
     * 删除失败返回的信息.
     * 
     */
    final String MSG_COMM_DELETE_FAILED = "删除失败！";

    /**
     * 排他失败返回的信息.
     * 
     */
    final String MSG_COMM_EXCLUSIVE_FAILED = "该条信息已被其它用户修改，请刷新画面后重试！";
    
    //大伙加msg的时候，命名规则请遵循：MSG_"功能名"_"操作名"_"操作结果"，如：MSG_COMM_DELETE_FAILED

}
