package com.ustcsoft.pdqc.web.workstation.form;

import com.alibaba.fastjson.JSONArray;
import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 上报完整性列表数据
* Description: 
* Title: ComfortDataResultForm.java
* @author：zhouqichao

* 
 */
public class CompletenessDataResultForm extends WebBaseForm{
	private static final long serialVersionUID = 709141584728065483L;

	//当前页码
    private int pageNumber=1;
    //总页数
    private int pageCount=1;
    //每页数据量
    private int dataCount=1;
    //总数据量
    private int totalCount=0;
    //列表数据
    private JSONArray data;
    
    //返回信息编码
    private int retCode=0;
    //返回信息内容
    private String retMsg="ok";
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getDataCount() {
		return dataCount;
	}
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public JSONArray getData() {
		return data;
	}
	public void setData(JSONArray data) {
		this.data = data;
	}
	public int getRetCode() {
		return retCode;
	}
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	public String getRetMsg() {
		return retMsg;
	}
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
    
    
}
