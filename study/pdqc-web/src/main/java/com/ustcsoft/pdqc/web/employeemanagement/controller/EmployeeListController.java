//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************


package com.ustcsoft.pdqc.web.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeKey;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.employeemanagement.constants.EmployeeListConstants;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeFileForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeFileRstForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeInformationForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeListForm;
import com.ustcsoft.pdqc.web.employeemanagement.service.EmployeeListService;


/**
 * 
 * @author zhouqichao
 */
@Controller
@RequestMapping("/employeeList")
public class EmployeeListController extends WebBaseController {
	
	@Autowired
	private EmployeeListService employeeListService;
	
	@Autowired
	private PdMEmployeeMapper pdMEmployeeMapper;
	/**
     * 职员列表页面.
     * 
     * @param model ModelMap
     * @return String
     */
	@RequestMapping(value = "")
    public String init(ModelMap model) {
		//获取职员类别下拉框值
		List<Code> employeeTypeOptions = this.employeeListService.getSelectEmployeeTypeOptions();
    	String orgNo = getLoginUser().getOrgNo();
    	String orgType = this.employeeListService.getOrgType(orgNo);
    	Boolean bVisible = true;
    	if("1".equals(orgType)){
    		bVisible=false;
    	}
    	model.addAttribute("employeeTypeOptions", employeeTypeOptions);
    	model.addAttribute("bVisible", bVisible);
        return EmployeeListConstants.EMPLOYEE_LIST;
    }

    /**
     * 获得职员
     * @param form
     * @return
     */
    @RequestMapping("/getEmployeeData")
    public JacksonPagginListReturn<EmployeeListForm> getEmployeeData(EmployeeListForm form){
    	return this.employeeListService.getEmployeeData(form);
    }
    
    
    /**
     * 获得文件列表
     * @param form
     * @return
     */
    @RequestMapping("/getFiles")
    public JacksonPagginListReturn<EmployeeFileRstForm> getFiles(EmployeeListForm form){
    	return this.employeeListService.getFiles(form);
    }
    /**
     * 新增/修改/查看职员页面初始化.
     * 
     * @param model
     * @param editflag
     * @param patientId
     * @param hospitalNo
     * @return
     */
    @RequestMapping("/operateEmployee")
    public String operateEmployee(ModelMap model, String employeeNo, String editflag) {
    	EmployeeInformationForm form = new EmployeeInformationForm();
    	form.setEmployeeNo(employeeNo);
    	//获取职员基础信息
    	EmployeeInformationForm employeeInformationForm = this.employeeListService.getEmployeeInformation(form);
    	//获取职员类别下拉框值
    	List<Code> employeeTypeOptions = this.employeeListService.getSelectEmployeeTypeOptions();
    	//获取职称下拉框值
    	List<Code> employeeTitleOptions = this.employeeListService.getSelectEmployeeTitleOptions();
    	//获取职务下拉框值
    	List<Code> employeePortOptions = this.employeeListService.getSelectEmployeePortOptions();
    	//获取学历下拉框值
    	List<Code> employeeEducationOptions = this.employeeListService.getSelectEmployeeEducationOptions();
        model.addAttribute("employeeTypeOptions", employeeTypeOptions);
    	model.addAttribute("employeeInformationForm", employeeInformationForm);
    	model.addAttribute("employeeTitleOptions", employeeTitleOptions);
    	model.addAttribute("employeePortOptions", employeePortOptions);
    	model.addAttribute("employeeEducationOptions", employeeEducationOptions);
    	model.addAttribute("editflag", editflag);
        return EmployeeListConstants.EMPLOYEE_EDIT;
    }
    
    
    /**
     * 保存或者编辑职员信息.
     * 
     * @param condition
     * @return
     */
    @RequestMapping("/addOrEditEmployee")
    public JacksonCountReturn addOrEditEmployee(EmployeeInformationForm condition) {
    	return this.employeeListService.addOrEdit(condition);
    }
    
    /**
     * 删除职员信息.
     * 
     * @param condition
     * @return
     */
    @RequestMapping("/deleteEmployee")
    public JacksonCountReturn deleteEmployee(EmployeeInformationForm condition) {
        return this.employeeListService.deleteEmployee(condition);
    }
	/**
     * 职员资料
     * 
     * @param model ModelMap
     * @return String
     */
	@RequestMapping(value = "/employeeMaterial")
    public String employeeMaterial(ModelMap model,String employeeNo) {
		model.addAttribute("employeeNo", employeeNo);
        return EmployeeListConstants.EMPLOYEE_MATERIAL;
    }
	
	/**
     * 上传文件弹窗
     * 
     * @param model ModelMap
     * @return String
     */
	@RequestMapping(value = "/uploadMaretial")
    public String uploadMaretial(ModelMap model,String employeeNo) {
		PdMEmployeeKey employeeKey = new PdMEmployeeKey();
		employeeKey.setEmployeeNo(employeeNo);
		PdMEmployee employee = this.pdMEmployeeMapper.selectByPrimaryKey(employeeKey);
		if(employee !=null){
			String employeeType=employee.getEmployeeType();
			List<Code> fileTypeOptions = this.employeeListService.getCodesByFileTypes(employeeType);
			model.addAttribute("fileTypeOptions", fileTypeOptions);
			model.addAttribute("employeeNo", employeeNo);
		}
        return EmployeeListConstants.UPLOAD_MATERIAL;
    }
	
	/**
	 * 上传员工资料
	 * @return
	 */
	@RequestMapping(value = "/addOrEditFile")
	public JacksonCountReturn addOrEditFile(EmployeeFileForm condition){
		return this.employeeListService.addOrEditFile(condition);
	}
    
}
