package com.ustcsoft.pdqc.web.workstation.form;

import java.util.ArrayList;
import java.util.List;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 上报完整性返回页面数据
* Description: 
* Title: CompletenessListReturnDataForm.java
* @author：zhouqichao

* 
 */
public class CompletenessListReturnDataForm extends WebBaseForm{
    private static final long serialVersionUID = 709142194757625483L;

    //表头标题
    List<CompletenessTitleResultForm> titleList = new ArrayList<CompletenessTitleResultForm>();
    //列表数据
    CompletenessDataResultForm dataList = new CompletenessDataResultForm();
	public List<CompletenessTitleResultForm> getTitleList() {
		return titleList;
	}
	public void setTitleList(List<CompletenessTitleResultForm> titleList) {
		this.titleList = titleList;
	}
	public CompletenessDataResultForm getDataList() {
		return dataList;
	}
	public void setDataList(CompletenessDataResultForm dataList) {
		this.dataList = dataList;
	}
    
    
}
	