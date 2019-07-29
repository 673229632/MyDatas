package com.ustcsoft.pdqc.web.workstation.form;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 上报完整性表头
* Description: 
* Title: CompletenessTitleResultForm.java
* @author：zhouqichao

* 
 */
public class CompletenessTitleResultForm extends WebBaseForm{
    private static final long serialVersionUID = 709142194728065483L;
    
    //列表标题英文名称
    private String fieldName;
    //列表标题中文名称
    private String titleName;
    
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
    
}
