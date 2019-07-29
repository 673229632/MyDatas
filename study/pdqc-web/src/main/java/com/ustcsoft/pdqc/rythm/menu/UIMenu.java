//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.rythm.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 菜单.
 * 
 * @author kxiong
 *
 */
public class UIMenu implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 5045282384934072187L;

    // 菜单项目
    private final List<UIMenuItem> menuItems = new ArrayList<UIMenuItem>();

    // 菜单位置
    private UIMenuPosition position = UIMenuPosition.LEFT;

    /**
     * menuItems的GET方法.
     *
     * @return menuItems
     */
    public List<UIMenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * position的GET方法.
     *
     * @return position
     */
    public UIMenuPosition getPosition() {
        return position;
    }

    /**
     * position的SET方法.
     *
     * @param position position
     */
    public void setPosition(UIMenuPosition position) {
        this.position = position;
    }

}
