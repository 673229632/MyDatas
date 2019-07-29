//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.dialysismodestatistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.dialysismodestatistics.constants.DialysisModeStatisticsConstants;
import com.ustcsoft.pdqc.web.dialysismodestatistics.constants.DialysisModeStatisticsDetailConstants;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsDetailForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsListForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.service.DialysisModeStatisticsService;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
@Controller
@RequestMapping("/dialysisModeStatistics")
public class DialysisModeStatisticsController extends WebBaseController{
	
	@Autowired
	private DialysisModeStatisticsService dialysisModeStatisticsService;
	
	@RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        return DialysisModeStatisticsConstants.DIALYSISMODE_STATISTICS;
    }
	
	/**
	 * 透析模式统计
	 * 
	 * @return
	 */
	 
	@RequestMapping("/initDialysisModeStatisticsChart")
	public JacksonListReturn<DialysisModeStatisticsForm> initDialysisModeStatisticsChart() {
		return dialysisModeStatisticsService.initDialysisModeStatisticsChart();
	}
	
	/**
	 * 腹透模式列表
	 * 
	 * @return
	 */
	@RequestMapping("/dialysisModeStatisticsList")
	public JacksonPagginListReturn<DialysisModeStatisticsListForm> dialysisModeStatisticsList(){
		return dialysisModeStatisticsService.dialysisModeStatisticsList();
	}
	
	/**
	 * 传值到弹出框
	 * 
	 * @param dialysis
	 * @param hospitalName
	 * @param model
	 * @return
	 */
	@RequestMapping("/transmissParameter")
	public String transmissParameter(String dialysis, String hospitalName,ModelMap model){
		model.addAttribute("dialysis", dialysis);
		model.addAttribute("hospitalName", hospitalName);
		return DialysisModeStatisticsDetailConstants.DIALYSIS_MODESTATISTICSDETAIL;
	}
	
	/**
	 * 弹出框列表
	 * 
	 * @param dialysis
	 * @param hospitalName
	 * @return
	 */
	@RequestMapping("/dialysisModeStatisticsDetail")
	public JacksonPagginListReturn<DialysisModeStatisticsDetailForm> dialysisModeStatisticsDetail(String dialysis, String hospitalName){
		return dialysisModeStatisticsService.dialysisModeStatisticsDetail(dialysis,hospitalName);
	}
}