//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsurvivalmonth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.constants.PatientSurvivalMonthConstants;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.constants.SurvivalMonthDetailConstants;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.form.PatientSurvivalMonthForm;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.form.SurvivalMonthDetailForm;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.service.PatientSurvivalMonthService;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
@Controller
@RequestMapping("/PatientSurvivalMonth")
public class PatientSurvivalMonthController extends WebBaseController{
	
	@Autowired
	private PatientSurvivalMonthService patientSurvivalMonthService;
	
	@RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        return PatientSurvivalMonthConstants.PATIENTSURVIVAL_MONTH;
    }
	
	/**
	 * 病人生存月
	 * 
	 * @param condition
	 * @return result
	 */
	@RequestMapping("/initPatientSurvivalMonthChart")
	public JacksonListReturn<PatientSurvivalMonthForm> initPatientSurvivalMonthChart() {
		return patientSurvivalMonthService.initPatientSurvivalMonthChart();
	}
	
	/**
	 * 传参到弹出框
	 * 
	 * @param hospitalName
	 * @param model
	 * @return
	 */
	@RequestMapping("transmissParameter")
	public String transmissParameter(String hospitalName,ModelMap model){
		model.addAttribute("hospitalName", hospitalName);
		return SurvivalMonthDetailConstants.SURVIVAL_MONTHDETAIL;
	}
	
	/**
	 * 弹出框列表
	 */
	@RequestMapping("PatientSurvivalMonthDetail")
	public JacksonPagginListReturn<SurvivalMonthDetailForm> PatientSurvivalMonthDetail(String hospitalName){
		return patientSurvivalMonthService.PatientSurvivalMonthDetail(hospitalName);
	}
}
