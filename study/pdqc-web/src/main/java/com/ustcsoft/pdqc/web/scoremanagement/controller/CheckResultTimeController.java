package com.ustcsoft.pdqc.web.scoremanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeInformationForm;
import com.ustcsoft.pdqc.web.scoremanagement.constants.CheckResultTimeConstants;
import com.ustcsoft.pdqc.web.scoremanagement.form.CheckResultTimeListForm;
import com.ustcsoft.pdqc.web.scoremanagement.service.CheckResultTimeService;


/**
 * 
 * @author zhouqichao
 *
 */

@Controller
@RequestMapping("/checkResultTimeManagement")
public class CheckResultTimeController extends WebBaseController {
	
	@Autowired
	private CheckResultTimeService checkResultTimeService;
	@Autowired
	private CommonService commonService;
	/**
     * 评分时间管理画面页面.
     * 
     * @param model ModelMap
     * @return String
     */
		@RequestMapping(value = "")
	    public String init(ModelMap model) {
	        return CheckResultTimeConstants.CHECKRESULTTIMR_LIST;
	    }
		
	    /**
	     * 获得评分时间数据
	     * @param form
	     * @return
	     */
	    @RequestMapping("/getCheckResultTimeData")
	    public JacksonPagginListReturn<CheckResultTimeListForm> getCheckResultTimeData(CheckResultTimeListForm form){
	    	return this.checkResultTimeService.getCheckResultTimeData(form);
	    }
	    
	    /**
	     * 新增/编辑/查看评分时间页面初始化.
	     * 
	     * @param model
	     * @param editflag
	     * @param patientId
	     * @param hospitalNo
	     * @return
	     */
	    @RequestMapping("/operateCheckResultTime")
	    public String operateCheckResultTime(ModelMap model, String checkNo, String editflag) {
	    	//获取评分时间基础信息
	    	CheckResultTimeListForm form = new CheckResultTimeListForm();
	    	form.setCheckNo(checkNo);
	    	CheckResultTimeListForm checkResultTimeListForm = checkResultTimeService.getCheckResultTimeInformation(form);
	    	//获取kpi下拉框值
	    	String parentCode = "KPI_ITEM";
	    	List<Code> kpiList = commonService.getOptionsByParentCode(parentCode);
	    	//获取标准版本下拉框值
	    	List<Code> standardList = checkResultTimeService.getStandardList();
	    	model.addAttribute("checkResultTimeListForm", checkResultTimeListForm);
	    	model.addAttribute("kpiList", kpiList);
	    	model.addAttribute("standardList", standardList);
	    	model.addAttribute("editflag", editflag);
	        return CheckResultTimeConstants.CHECKRESULTTIMR_EDIT;
	    }
	    /**
	     * 保存评分时间信息
	     * 
	     * @param condition
	     * @return
	     */
	    @RequestMapping("/addCheckResultTime")
	    public JacksonCountReturn addCheckResultTime(CheckResultTimeListForm condition) {
	    	return this.checkResultTimeService.addCheckResultTime(condition);
	    }
	    /**
	     * 删除评分时间信息
	     * 
	     * @param condition
	     * @return
	     */
	    @RequestMapping("/delCheckResultTime")
	    public JacksonCountReturn delCheckResultTime(CheckResultTimeListForm condition) {
	        return this.checkResultTimeService.delCheckResultTime(condition);
	    }
	    
	    /**
	     * 获取未发布的评分时间数据
	     * 
	     * @param condition
	     * @return
	     */
	    @RequestMapping("/selectUnpublishedData")
	    public JacksonCountReturn selectUnpublishedData() {
	    	return this.checkResultTimeService.selectUnpublishedData();
	    }
}
