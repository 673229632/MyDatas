package com.ustcsoft.pdqc.web.systemmanagement.form;

import java.io.Serializable;

public class ZTreeTestProject implements Serializable{
    // ID属性
    private String id;

    // 父ID
    private String pid;

    // 名字(显示的文字)
    private String name;
    
    //机构类型
    private String orgType;
    
    /**
     * 构造方法.
     */
    public ZTreeTestProject() {
    }

    /**
     * 构造方法.
     * 
     * @param id ID
     * @param name 名字
     * @param pid 父ID
     */
    public ZTreeTestProject(String id, String name, String pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    /**
     * id的GET方法.
     *
     * @return id
     */
    public final String getId() {
        return id;
    }

    /**
     * id的SET方法.
     *
     * @param id id
     */
    public final void setId(String id) {
        this.id = id;
    }

    /**
     * pid的GET方法.
     *
     * @return pid
     */
    public final String getPid() {
        return pid;
    }

    /**
     * pid的SET方法.
     *
     * @param pid pid
     */
    public final void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * name的GET方法.
     *
     * @return name
     */
    public final String getName() {
        return name;
    }

    /**
     * name的SET方法.
     *
     * @param name name
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * @return the orgType
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * @param orgType the orgType to set
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 5313633172977544057L;
}
