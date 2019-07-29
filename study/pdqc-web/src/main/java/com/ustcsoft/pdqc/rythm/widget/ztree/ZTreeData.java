//******************************************************************************
// 版权所有(c) 2015，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.rythm.widget.ztree;

import java.io.Serializable;

/**
 * 树数据对象.
 * 
 * @author kxiong
 */
public class ZTreeData implements Serializable {
    // ID属性
    private int id;

    // 父ID
    private int pid;

    // 名字(显示的文字)
    private String name;

    /**
     * 构造方法.
     */
    public ZTreeData() {
    }

    /**
     * 构造方法.
     * 
     * @param id ID
     * @param name 名字
     * @param pid 父ID
     */
    public ZTreeData(int id, String name, int pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    /**
     * id的GET方法.
     *
     * @return id
     */
    public final int getId() {
        return id;
    }

    /**
     * id的SET方法.
     *
     * @param id id
     */
    public final void setId(int id) {
        this.id = id;
    }

    /**
     * pid的GET方法.
     *
     * @return pid
     */
    public final int getPid() {
        return pid;
    }

    /**
     * pid的SET方法.
     *
     * @param pid pid
     */
    public final void setPid(int pid) {
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
     * serialVersionUID.
     */
    private static final long serialVersionUID = 5313633172977544057L;
}
