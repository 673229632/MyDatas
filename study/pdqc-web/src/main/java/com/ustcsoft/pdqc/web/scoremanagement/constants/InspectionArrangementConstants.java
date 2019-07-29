package com.ustcsoft.pdqc.web.scoremanagement.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * @author zhouqichao
 */
public enum InspectionArrangementConstants implements RythmPage {

	INSPECTION_ARRANGEMENT("/views/scoremanagement/InspectionArrangement"),
	//添加时间画面
	ADD_HOSPITAL("/views/scoremanagement/AddHospital"),
	//添加专家画面
	ADD_EXPERT("/views/scoremanagement/AddExpert"),
	//添加项目画面
	ADD_PROJECT("/views/scoremanagement/AddProject"),
	//添加时间画面
	ADD_TIME("/views/scoremanagement/AddTime");
	private final String url;
	
	InspectionArrangementConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
