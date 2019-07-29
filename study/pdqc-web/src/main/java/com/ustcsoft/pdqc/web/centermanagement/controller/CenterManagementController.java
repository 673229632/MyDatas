package com.ustcsoft.pdqc.web.centermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.web.centermanagement.constants.CenterManagementConstants;
import com.ustcsoft.pdqc.web.centermanagement.service.CenterManagementService;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;

/**
 * 
 * @author zhouqichao
 *
 */
@Controller
@RequestMapping("/centerManagement")
public class CenterManagementController extends WebBaseController {
	
    @Autowired
	private CenterManagementService centerManagementService;
	
    /**
     * 透析中心管理页面初始化.
     * 
     * @param model ModelMap
     * @return String
     */
	@RequestMapping(value = "")
    public String init(ModelMap model) {
		PdDCenter pdDCenter = this.centerManagementService.getPdDCenter();
		model.addAttribute("pdDCenter", pdDCenter);
        return CenterManagementConstants.CENT_MANAGER;
    }
	
    /**
     * 编辑透析中心信息.
     * 
     * @param condition
     * @return
     */
    @RequestMapping("/addOrEditCenter")
    public JacksonCountReturn addOrEditCenter(PdDCenter condition) {
    	return this.centerManagementService.addOrEdit(condition);
    }
}
