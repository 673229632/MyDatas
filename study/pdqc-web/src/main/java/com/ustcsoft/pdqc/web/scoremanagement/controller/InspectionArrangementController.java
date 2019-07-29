package com.ustcsoft.pdqc.web.scoremanagement.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulejhsj;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.scoremanagement.constants.InspectionArrangementConstants;
import com.ustcsoft.pdqc.web.scoremanagement.form.InspectionArrangementForm;
import com.ustcsoft.pdqc.web.scoremanagement.service.InspectionArrangementService;
import com.ustcsoft.pdqc.web.systemmanagement.form.ZTreeTestProjectForm;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author zhouqichao
 *
 */

@Controller
@RequestMapping("/inspectionArrangement")
public class InspectionArrangementController extends WebBaseController {
	
	@Autowired
	private InspectionArrangementService inspectionArrangementService;

	@RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        return InspectionArrangementConstants.INSPECTION_ARRANGEMENT;
    }
	
	
    /**
     * 获取树
     * @param model
     * @return
     */
    @RequestMapping("/getTree")
    public JacksonReturn getTree(InspectionArrangementForm form) {
        return getInspectionTree(form);
    }
    public JacksonReturn getInspectionTree(InspectionArrangementForm form) {
        JacksonListReturn<ZTreeTestProjectForm<InspectionArrangementForm>> result = new JacksonListReturn<>();
        // 获取全部权限列表
        List<InspectionArrangementForm> funcList = this.inspectionArrangementService.getInspectionTree(form);
        // 将查询结果放到树中
        List<ZTreeTestProjectForm<InspectionArrangementForm>> resultlist = new ArrayList<ZTreeTestProjectForm<InspectionArrangementForm>>();
        if (!Tools.listisblank(funcList)) {
            for (InspectionArrangementForm inspectionArrangementForm : funcList) {
                ZTreeTestProjectForm<InspectionArrangementForm> resultform = new ZTreeTestProjectForm<InspectionArrangementForm>();
                resultform.setId(inspectionArrangementForm.getId()+"");
                resultform.setName(inspectionArrangementForm.getName());
                resultform.setPid(inspectionArrangementForm.getPid()+"");
                resultform.setOrgType(inspectionArrangementForm.getTreeNo());
                resultlist.add(resultform);
            }
        }
        result.setData(resultlist);
        return result;
    }
	/**
     * 跳转编辑时间画面
     * @return
     */
    @RequestMapping("/addTimePage")
    public RythmPage addTimePage(ModelMap model,String id,String pid,String editflag,String treeNo) {
    	PdMExamineSchedulejhsj pdMExamineSchedulejhsj = new PdMExamineSchedulejhsj();
    	Date executeTime = null; 
		model.addAttribute("id", id);
		model.addAttribute("pid", pid);
		model.addAttribute("treeNo", treeNo);
    	if("1".equals(editflag)){
    		pdMExamineSchedulejhsj = inspectionArrangementService.getTime(id);
    		executeTime = pdMExamineSchedulejhsj.getExecuteTime();
    	}
    	model.addAttribute("executeTime", executeTime);
        return InspectionArrangementConstants.ADD_TIME;
    }
    
     /**
     * 保存时间
     * @return
     */
    @RequestMapping("/addTime")
    public JacksonCountReturn addTime(InspectionArrangementForm form) {
        return this.inspectionArrangementService.addTime(form);
    }
    
    /**
    * 删除时间
    * @return
    */
   @RequestMapping("/deleteTime")
   public JacksonCountReturn deleteTime(String id) {
       return this.inspectionArrangementService.deleteTime(id);
   }
    
	/**
     * 跳转添加医院画面
     * @return
     */
    @RequestMapping("/addHospitalPage")
    public RythmPage addHospitalPage(ModelMap model,String id,String pid,String treeNo) {
		model.addAttribute("id", id);
		model.addAttribute("pid", pid);
		model.addAttribute("treeNo", treeNo);
        return InspectionArrangementConstants.ADD_HOSPITAL;
    }
	/**
     * 获取医院数据
     * @return
     */
    @RequestMapping(value = "/getHospitalDetailsPage")
    public JacksonPagginListReturn<PdDCenter> getHospitalDetailsPage(InspectionArrangementForm form) {
    	JacksonPagginListReturn<PdDCenter> result = new JacksonPagginListReturn<PdDCenter>();
    	List<PdDCenter> resultList = inspectionArrangementService.getHospitalDetailsPage(form);
    	result.setTotalCount(resultList.size());
        result.setPageCount(resultList.size());
    	result.setData(resultList);
    	return result;
    }
    /**
    * 保存医院
    * @return
    */
   @RequestMapping("/addHospital")
   public JacksonCountReturn addHospital(String ids,String pid) {
       return this.inspectionArrangementService.addHospital(ids,pid);
   }
   /**
   * 删除医院
   * @return
   */
  @RequestMapping("/deleteHospital")
  public JacksonCountReturn deleteHospital(String id) {
      return this.inspectionArrangementService.deleteHospital(id);
  }
	/**
     * 跳转添加专家画面
     * @return
     */
    @RequestMapping("/addExpertPage")
    public RythmPage addExpertPage(ModelMap model,String id,String pid,String treeNo) {
		model.addAttribute("id", id);
		model.addAttribute("pid", pid);
		model.addAttribute("treeNo", treeNo);
		List<Code> options = inspectionArrangementService.getEmployeeList();
		model.addAttribute("options", options);
        return InspectionArrangementConstants.ADD_EXPERT;
    }
    
	/**
     * 跳获取专家下拉框
     * @return
     */
    @RequestMapping("/getExpert")
    public JacksonReturn getEmployee(String arrangeType){
    	return inspectionArrangementService.getEmployee(arrangeType);
    }
    /**
    * 保存专家
    * @return
    */
   @RequestMapping("/addExpert")
   public JacksonCountReturn addExpert(String id,String pid) {
       return this.inspectionArrangementService.addExpert(id,pid);
   }
   /**
   * 删除专家
   * @return
   */
  @RequestMapping("/deleteExpert")
  public JacksonCountReturn deleteExpert(String id) {
      return this.inspectionArrangementService.deleteExpert(id);
  }
	/**
     * 跳转添加项目画面
     * @return
     */
    @RequestMapping("/addProjectPage")
    public RythmPage addProjectPage(ModelMap model) {
        return InspectionArrangementConstants.ADD_PROJECT;
    }
    
    

}
