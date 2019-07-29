package com.ustcsoft.pdqc.web.scoremanagement.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulejhsj;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.scoremanagement.form.InspectionArrangementForm;

/**
 * 
 * @author zhouqichao
 *
 */
public interface InspectionArrangementService {
	//获取检查安排树数据
	List<InspectionArrangementForm> getInspectionTree(InspectionArrangementForm form);
	//添加时间
	JacksonCountReturn addTime(InspectionArrangementForm form);
	//获取时间
	PdMExamineSchedulejhsj getTime(String id);
	//删除时间
	JacksonCountReturn deleteTime(String id);
	//获取医院数据
	List<PdDCenter> getHospitalDetailsPage(InspectionArrangementForm form);
	//保存医院
	JacksonCountReturn addHospital(String ids, String pid);
	//删除医院
	JacksonCountReturn deleteHospital(String id);
	//获取专家列表
	JacksonReturn getEmployee(String arrangeType);
	//保存专家
	JacksonCountReturn addExpert(String id, String pid);
	//删除专家
	JacksonCountReturn deleteExpert(String id);
	//默认获取所有专家
	List<Code> getEmployeeList();

}
