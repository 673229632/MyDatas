//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//*

package com.ustcsoft.pdqc.web.systemmanager.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseCondForm;


public class LoginUserInfoCondForm extends WebBaseCondForm {

    private static final long serialVersionUID = -8299766267417178317L;

    // (PD_M_USER.UserNo)
    private String userNo;

    // (PD_M_USER.UserName)
    private String userName;

   
    /*private String category;

    
    private String categoryName;*/

   /* // (M_STAFF.DepartCode)
    private String departcode;*/

    /*// 科室名称
    private String departName;*/

    /*// (M_STAFF.Sex)
    private String sex;*/

    // (PD_M_USER.userPass)
    private String userPass;

    /*// 画面上的旧密码
    private String oldPassword;*/

    /*// 画面上的新密码
    private String newPassword;*/

   /* // 画面上的旧密码
    private String centainPassword;*/

    // 皮肤
    private String skincss;

    

    // (PD_M_USER.phoneNum)
    private String phoneNum;
  

    // 登录用户名(PD_M_USER.loginName)
    private String loginName;

    // 登录用户名(PD_M_USER.roleNo)
    private String roleNo;

   

    private String updatedate;



	public String getUserNo() {
		return userNo;
	}



	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPass() {
		return userPass;
	}



	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}



	public String getSkincss() {
		return skincss;
	}



	public void setSkincss(String skincss) {
		this.skincss = skincss;
	}



	public String getPhoneNum() {
		return phoneNum;
	}



	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}



	public String getLoginName() {
		return loginName;
	}



	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}



	public String getRoleNo() {
		return roleNo;
	}



	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}



	public String getUpdatedate() {
		return updatedate;
	}



	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

    
    
    

}
