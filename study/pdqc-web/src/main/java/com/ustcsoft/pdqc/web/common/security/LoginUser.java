//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.security;

import java.io.Serializable;
import java.util.List;

import com.ustcsoft.pdqc.core.autogen.entity.PdMRole;



/**
 * @author kxiong
 *
 */
public class LoginUser implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 3293553803619469716L;

    private int sid;

    /*
     * 用户id
     */
    /*private String id;*/
    private String userNo;
    
    //组织编号
    private String orgNo;
    
    //透析中心编号
    private String dialysisCenterNo;
    
    //质控中心编号
    private String qcCenterNo;
    /*
     * 登录名称
     */
    //private String nickname;
    private String loginName;
    
    /*
     * 登录密码
     */
    //private String loginPwd;
    private String userPass;
    
    /*
     * 用户姓名
     */
    private String userName;

    private String email;
    
    //用户电话
    //private String mobile;
    private String phoneNum;

    //private String sex;

    //private String employeeNo;
    
    //用户当前角色
    //private String roleId;
    private String roleNo;
    //用户当前角色名称
    private String roleName;
    //角色类型
    //private String roletype;
    
    //用户角色列表
    private List<PdMRole> roleList;

    /*
     * 用户皮肤
     */
    private String skincss;

    /*
     * 医院名称
     */
    //private String hospitalName;
    
    
    public String getOrgNo() {
		return orgNo;
	}

	public String getDialysisCenterNo() {
		return dialysisCenterNo;
	}

	public void setDialysisCenterNo(String dialysisCenterNo) {
		this.dialysisCenterNo = dialysisCenterNo;
	}

	public String getQcCenterNo() {
		return qcCenterNo;
	}

	public void setQcCenterNo(String qcCenterNo) {
		this.qcCenterNo = qcCenterNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
    /**
     * 获取skincss.
     * 
     * @return the skincss
     */
    public String getSkincss() {
        return skincss;
    }
	/**
     * 设置skincss.
     * 
     * @param skincss the skincss to set
     */
    public void setSkincss(String skincss) {
        this.skincss = skincss;
    }

    
    /**
     * 是否为初始密码.
     * <p>
     * true--是; false--否;
     * </p>
     */
    private boolean initpasswordflag;

    

    /**
     * @return 初始密码. initpasswordflag
     */
    public boolean isInitpasswordflag() {
        return initpasswordflag;
    }

    /**
     * @param initpasswordflag the initpasswordflag to set
     */
    public void setInitpasswordflag(boolean initpasswordflag) {
        this.initpasswordflag = initpasswordflag;
    }

    /**
     * sid的GET方法.
     *
     * @return sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * sid的SET方法.
     *
     * @param sid sid
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    
    
   

    public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}

	/**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

	public List<PdMRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<PdMRole> roleList) {
		this.roleList = roleList;
	}

    

}
