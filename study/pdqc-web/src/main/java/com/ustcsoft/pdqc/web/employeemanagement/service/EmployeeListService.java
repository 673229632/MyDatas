package com.ustcsoft.pdqc.web.employeemanagement.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeFileForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeFileRstForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeInformationForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeListForm;

/**
 * 
 * @author zhouqichao
 *
 */
public interface EmployeeListService {
	//获取职员列表信息
	JacksonPagginListReturn<EmployeeListForm> getEmployeeData(EmployeeListForm form);
	//获得文件结果列表
	public JacksonPagginListReturn<EmployeeFileRstForm> getFiles(EmployeeListForm form);
	//	获取职员类型下拉框
	List<Code> getSelectEmployeeTypeOptions();
	//	获取职员职称下拉框
	List<Code> getSelectEmployeeTitleOptions();
	//	获取职员职务下拉框
	List<Code> getSelectEmployeePortOptions();
	//	获取职员学历下拉框
	List<Code> getSelectEmployeeEducationOptions();
	//获取职员基础信息
	EmployeeInformationForm getEmployeeInformation(EmployeeInformationForm form);
	//添加或修改职员信息
	JacksonCountReturn addOrEdit(EmployeeInformationForm condition);
	//删除职员
	JacksonCountReturn deleteEmployee(EmployeeInformationForm condition);
	//获取组织机构类别
	String getOrgType(String orgNo);
	//上传员工资料
	public JacksonCountReturn addOrEditFile(EmployeeFileForm condition);
	//根据职员类型获得需要上传的文件类型
	public List<Code> getCodesByFileTypes(String employeeType);
}
