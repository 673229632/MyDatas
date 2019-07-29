//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsbehindprobability.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.patientsbehindprobability.Form.PatientsBehindProbabilityForm;
import com.ustcsoft.pdqc.web.patientsbehindprobability.Form.ShowRateDetailListForm;
import com.ustcsoft.pdqc.web.patientsbehindprobability.Service.PatientsBehindProbabilityService;
import com.ustcsoft.pdqc.web.patientsbehindprobability.constants.PatientsBehindProbabilityConstants;
import com.ustcsoft.pdqc.web.patientsbehindprobability.constants.ShowRateDetailConstants;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
@Controller
@RequestMapping("/PatientsBehindProbability")
public class PatientsBehindProbabilityController extends WebBaseController{
	
	@Autowired
	private PatientsBehindProbabilityService patientsBehindProbabilityService;
	
	@RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        return PatientsBehindProbabilityConstants.PATIENTSBEHIND_PROBABILITY;
    }
	/**
	 * 腹透中心规模
	 * 
	 * @param condition
	 * @return result
	 */
	@RequestMapping("/initPatientsBehindProbabilityChart")
	public JacksonListReturn<PatientsBehindProbabilityForm> initPatientsBehindProbabilityChart() {
		return patientsBehindProbabilityService.initPatientsBehindProbabilityChart();
	}
	
	/**
	 * 将数据传入弹出框画面
	 * 
	 * @param hospitalName
	 * @param model
	 * @return
	 */
	@RequestMapping("/showRateDetail")
	public String showRateDetail(String hospitalName, ModelMap model) {
		model.addAttribute("hospitalName", hospitalName);
		return ShowRateDetailConstants.SHOW_RATEDETAIL;
	}
	
	/**
	 * 弹出框列表
	 * 
	 * @param hospitalName
	 * @return
	 */
	@RequestMapping("/showRateDetailList")
	@ResponseBody
	public JacksonPagginListReturn<ShowRateDetailListForm> showRateDetailList(ShowRateDetailListForm detailListForm){
		return patientsBehindProbabilityService.showRateDetailList(detailListForm);
	}
}
