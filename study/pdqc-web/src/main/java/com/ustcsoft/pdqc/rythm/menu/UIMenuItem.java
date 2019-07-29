//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.rythm.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 菜单项目.
 * 
 * @author kxiong
 *
 */
public class UIMenuItem implements Serializable {
    private static final long serialVersionUID = -6805522796640178676L;

    // 菜单ID
    private String menuId;

    // 菜单名
    private String menuName;

    // 菜单描述
    private String menuDesc;

    // 菜单图标
    private String menuIcon;

    // 菜单URL
    private String menuUrl;

    // 菜单层次
    private int menuLevel;

    // 菜单状态
    private UIMenuState state = UIMenuState.NORMAL;

    // 子菜单
    private final List<UIMenuItem> subMenu = new ArrayList<UIMenuItem>();

    /**
     * 判断当前菜单或子菜单是否包含指定的ＩＤ.
     * <p>
     * </p>
     * 
     * @param menuID 菜单ID
     * @return 结果
     */
    public boolean containsMenuID(String menuID) {
        // 如果传入的菜单为空
        if (StringUtils.isEmpty(menuID)) {
            return false;
        }
        // 如果当前访问的画面ID和本菜单ID一致
        if (StringUtils.equals(menuId, menuID)) {
            // 展开的
            return true;
        }
        for (UIMenuItem item : subMenu) {
            // 只要有一个子菜单匹配也可以
            if (item.containsMenuID(menuID)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断当前菜单或子菜单是否包含指定的ＩＤ.
     * <p>
     * </p>
     * 
     * @param menuUrl 菜单URL
     * 
     * @return 结果
     */
    public boolean containsMenuUrl(String menuUrl) {
        // 如果传入的菜单为空
        if (StringUtils.isEmpty(menuUrl)) {
            return false;
        }
        // 如果当前访问的画面URL和本菜单URL一致
        // TODO 这里要考虑斜杠的情况
        if (StringUtils.equals(this.menuUrl, menuUrl)) {
            // 展开的
            return true;
        }
        for (UIMenuItem item : subMenu) {
            // 只要有一个子菜单匹配也可以
            if (item.containsMenuUrl(menuUrl)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断是否为叶子节点.
     * 
     * @return 结果
     */
    public boolean isLeaf() {
        return subMenu == null || subMenu.isEmpty();
    }

    /**
     * 重设菜单层次.
     * 
     * @param level 当前项目层次
     */
    public void resetLevel(int level) {
        // 保存本级层次
        this.menuLevel = level;
        // 重设子菜单层次
        for (UIMenuItem sub : subMenu) {
            sub.resetLevel(level + 1);
        }
    }

    /**
     * 构造函数.
     */
    public UIMenuItem() {

    }

    /**
     * 构造函数.
     * 
     * @param menuId 菜单ID
     * @param menuName 菜单名
     */
    public UIMenuItem(String menuId, String menuName) {
        this.menuId = menuId;
        this.menuName = menuName;
    }

    /**
     * 构造函数.
     * 
     * @param menuId 菜单ID
     * @param menuName 菜单名
     * @param menuIcon 菜单图标
     * 
     */
    public UIMenuItem(String menuId, String menuName, String menuIcon) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuIcon = menuIcon;
    }

    /**
     * 构造函数.
     * 
     * @param menuId 菜单ID
     * @param menuName 菜单名
     * @param menuIcon 菜单图标
     * @param menuUrl 菜单URL
     */
    public UIMenuItem(String menuId, String menuName, String menuIcon, String menuUrl) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuIcon = menuIcon;
        this.menuUrl = menuUrl;
    }

    /**
     * menuId的GET方法.
     *
     * @return menuId
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * menuId的SET方法.
     *
     * @param menuId menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * menuName的GET方法.
     *
     * @return menuName
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * menuName的SET方法.
     *
     * @param menuName menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * menuDesc的GET方法.
     *
     * @return menuDesc
     */
    public String getMenuDesc() {
        return menuDesc;
    }

    /**
     * menuDesc的SET方法.
     *
     * @param menuDesc menuDesc
     */
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    /**
     * subMenu的GET方法.
     *
     * @return subMenu
     */
    public List<UIMenuItem> getSubMenu() {
        return subMenu;
    }

    /**
     * state的GET方法.
     *
     * @return state
     */
    public UIMenuState getState() {
        return state;
    }

    /**
     * state的SET方法.
     *
     * @param state state
     */
    public void setState(UIMenuState state) {
        this.state = state;
    }

    /**
     * menuIcon的GET方法.
     *
     * @return menuIcon
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * menuIcon的SET方法.
     *
     * @param menuIcon menuIcon
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * menuLevel的GET方法.
     *
     * @return menuLevel
     */
    public int getMenuLevel() {
        return menuLevel;
    }

    /**
     * menuLevel的SET方法.
     *
     * @param menuLevel menuLevel
     */
    public void setMenuLevel(int menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * menuUrl的GET方法.
     *
     * @return menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * menuUrl的SET方法.
     *
     * @param menuUrl menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

}
