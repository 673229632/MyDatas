package com.ustcsoft.pdqc.web.scoremanagement.form;

public class InspectionArrangementForm {
	//序号
	private String treeNo;
	// 节点id
	private String id;
	// 检查名称
	private String name;
	// 父节点id
	private String pid;
	// 质控中心编号
	private String qcCenterNo;
	//计划时间
	private String executeTime;
	
	public String getTreeNo() {
		return treeNo;
	}
	public void setTreeNo(String treeNo) {
		this.treeNo = treeNo;
	}
	/**
     * @return the id
     */
	public String getId() {
		return id;
	}
	/**
     * @param id the id to set
     */
	public void setId(String id) {
		this.id = id;
	}
	/**
     * @return the name
     */
	public String getName() {
		return name;
	}
	/**
     * @param name the name to set
     */
	public void setName(String name) {
		this.name = name;
	}
	/**
     * @return the pid
     */
	public String getPid() {
		return pid;
	}
	/**
     * @param pid the pid to set
     */
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getQcCenterNo() {
		return qcCenterNo;
	}
	public void setQcCenterNo(String qcCenterNo) {
		this.qcCenterNo = qcCenterNo;
	}
	public String getExecuteTime() {
		return executeTime;
	}
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}
	
}
