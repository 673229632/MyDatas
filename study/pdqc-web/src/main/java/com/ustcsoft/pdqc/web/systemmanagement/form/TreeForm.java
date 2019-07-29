package com.ustcsoft.pdqc.web.systemmanagement.form;

import java.util.List;


public class TreeForm {

    // 节点ID
    private Integer id;
    // 节点内容
    private String text;
    // 子节点列表
    private List<TreeForm> children;
    // 附加选项
    private StatForm State;
    
    private boolean icon;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the children
     */
    public List<TreeForm> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List<TreeForm> children) {
        this.children = children;
    }

    /**
     * @return the state
     */
    public StatForm getState() {
        return State;
    }

    /**
     * @param state the state to set
     */
    public void setState(StatForm state) {
        State = state;
    }

    /**
     * @return the icon
     */
    public boolean isIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(boolean icon) {
        this.icon = icon;
    }
}
