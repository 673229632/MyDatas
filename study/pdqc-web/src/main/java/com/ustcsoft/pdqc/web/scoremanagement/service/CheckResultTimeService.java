package com.ustcsoft.pdqc.web.scoremanagement.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.scoremanagement.form.CheckResultTimeListForm;

/**
 * 
 * @author zhouqichao
 *
 */
public interface CheckResultTimeService {
	//获取评分时间列表
	JacksonPagginListReturn<CheckResultTimeListForm> getCheckResultTimeData(CheckResultTimeListForm form);
	//获取评分时间详细信息
	CheckResultTimeListForm getCheckResultTimeInformation(CheckResultTimeListForm form);
	//获取标准版本下拉框值
	List<Code> getStandardList();
	//添加评分时间信息
	JacksonCountReturn addCheckResultTime(CheckResultTimeListForm condition);
	//删除评分时间信息
	JacksonCountReturn delCheckResultTime(CheckResultTimeListForm condition);
	//获取未发布时间数据
	JacksonCountReturn selectUnpublishedData();

}
