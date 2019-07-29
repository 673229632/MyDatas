package com.ustcsoft.pdqc.web.ventralcenterscale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.ventralcenterscale.constants.VentraCenterScaleConstants;
import com.ustcsoft.pdqc.web.ventralcenterscale.constants.VentraCenterScaleDetailConstants;
import com.ustcsoft.pdqc.web.ventralcenterscale.form.VentralCenterScaleForm;
import com.ustcsoft.pdqc.web.ventralcenterscale.form.ventralCenterScaleDetailForm;
import com.ustcsoft.pdqc.web.ventralcenterscale.service.VentralCenterScaleService;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 首页controller.
 * 
 * @author liujian
 *
 */
@Controller
@RequestMapping("/VentralCenterScale")
public class VentralCenterScaleController extends WebBaseController {

	@Autowired
	private VentralCenterScaleService ventralCenterScaleService;
	
	@RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        return VentraCenterScaleConstants.VENTRACENTER_SCALE;
    }
	
	/**
	 * 查询医院名称及规模
	 * 
	 * @return
	 */
	@RequestMapping("/initVentralCenterScaleChart")
	public JacksonListReturn<VentralCenterScaleForm> initVentralCenterScaleChart() {
	    return ventralCenterScaleService.initVentralCenterScaleChart();
	    }
	
	/**
	 * 传值到患者列表弹出框
	 * 
	 * @param hospitalName
	 * @param model
	 * @return
	 */
	@RequestMapping("/transmissParameter")
	public String transmissParameter(String hospitalName,ModelMap model){
		model.addAttribute("hospitalName", hospitalName);
		return VentraCenterScaleDetailConstants.VENTRA_CENTERSCALEDETAIL;
	}
	
	/**
	 * 弹出框列表
	 * 
	 * @param hospitalName
	 * @return
	 */
	@RequestMapping("/ventralCenterScaleDetailList")
	public JacksonPagginListReturn<ventralCenterScaleDetailForm> ventralCenterScaleDetailList(String hospitalName){
		return ventralCenterScaleService.ventralCenterScaleDetailList(hospitalName);
	}
}
