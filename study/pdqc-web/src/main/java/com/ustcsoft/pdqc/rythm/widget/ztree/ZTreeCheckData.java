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
public class ZTreeCheckData<T> implements Serializable {
    // ID属性
    private String id;

    // 父ID
    private String pid;

    // 名字
    private String name;

    // 节点的图标
    private String iconSkin;

    // checked
    private boolean checked;

    // 用户数据
    private T userData;

    /**
     * 构造方法.
     */
    public ZTreeCheckData() {
    }

    /**
     * 构造方法.
     * 
     * @param id ID
     * @param name 名字
     * @param pid 父ID
     */
    public ZTreeCheckData(String id, String name, String pid) {
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
     * iconSkin的GET方法.
     *
     * @return iconSkin
     */
    public final String getIconSkin() {
        return iconSkin;
    }

    /**
     * iconSkin的SET方法.
     *
     * @param iconSkin iconSkin
     */
    public final void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    /**
     * checked的GET方法.
     *
     * @return checked
     */
    public final boolean isChecked() {
        return checked;
    }

    /**
     * checked的SET方法.
     *
     * @param checked checked
     */
    public final void setChecked(boolean checked) {
        this.checked = checked;
    }

    /**
     * userData的GET方法.
     *
     * @return userData
     */
    public final T getUserData() {
        return userData;
    }

    /**
     * userData的SET方法.
     *
     * @param userData userData
     */
    public final void setUserData(T userData) {
        this.userData = userData;
    }

    
}
