//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.diseasesstatistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.diseasesstatistics.constants.DiseasesStatisticsConstants;
import com.ustcsoft.pdqc.web.diseasesstatistics.constants.PatientDetailDiseasesConstants;
import com.ustcsoft.pdqc.web.diseasesstatistics.form.DiseasesStatisticsForm;
import com.ustcsoft.pdqc.web.diseasesstatistics.form.PatientDetailForm;
import com.ustcsoft.pdqc.web.diseasesstatistics.service.DiseasesStatisticsService;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
@Controller
@RequestMapping("/DiseasesStatistics")
public class DiseasesStatisticsController extends WebBaseController {
	
	@Autowired
	private DiseasesStatisticsService diseasesStatisticsService;
	
	@RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        return DiseasesStatisticsConstants.DISEASESSTATISTICS;
    }
	
	/**
	 * 传染病统计
	 * 
	 * @param condition
	 * @return result
	 */
	@RequestMapping("/initDiseasesStatisticsChart")
	public JacksonListReturn<DiseasesStatisticsForm> initDiseasesStatisticsChart() {
		return diseasesStatisticsService.initDiseasesStatisticsChart();
	}
	
	/**
	 *  传染病列表
	 * 
	 * @return
	 */
	@RequestMapping("/diseasesStatisticsList")
	public JacksonListReturn<DiseasesStatisticsForm> diseasesStatisticsList() {
		return diseasesStatisticsService.diseasesStatisticsList();
	}
	
	/**
	 * 传染病列表点击事件
	 * 
	 * @return
	 */
	@RequestMapping("/showPatientDetail")
	public String showPatientDetail(String diseases,String hospitalName, ModelMap model) {
		model.addAttribute("diseases", diseases);
		model.addAttribute("hospitalName", hospitalName);
		return PatientDetailDiseasesConstants.PATIENT_DETAILDISEASES;
	}
	
	/**
	 * 弹出框
	 * 
	 * @return
	 */ 
	@RequestMapping("/showPatientDetailList")
	public JacksonPagginListReturn<PatientDetailForm> showPatientDetailList(PatientDetailForm form) {
		return diseasesStatisticsService.showPatientDetailList(form);
	}
}