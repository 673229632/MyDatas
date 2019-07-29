
package com.ustcsoft.pdqc.web.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfo;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.patient.constants.PatientListPageConstants;
import com.ustcsoft.pdqc.web.patient.form.PatientForm;
import com.ustcsoft.pdqc.web.patient.form.PatientRstForm;
import com.ustcsoft.pdqc.web.patient.service.PatientListService;

/**
 * 患者一览.
 * 
 * @author zhangrui.i
 * @since 2018年3月5日 下午8:20:30
 */
@Controller
@RequestMapping("/patientlist")
public class PatientListController extends WebBaseController {

    @Autowired
    private PatientListService patientListService;
    
    @Autowired
    private CommonService commonService;

    /**
     * 患者列表页面初始化.
     * 
     * @param model ModelMap
     * @return String
     */
    @RequestMapping(value = "")
    public String init(ModelMap model) {
        List<Code> hospitalOptions = this.patientListService.getSelectHospitalOptions();
        List<Code> patientTypes = this.commonService.getOptionsByParentCode("PT-TYPE");
        model.addAttribute("patientTypes", patientTypes);
        model.addAttribute("hospitalOptions", hospitalOptions);
        return PatientListPageConstants.STATION_PATIENTSLIST;
    }

    /**
     * 新增/修改/查看患者页面初始化.
     * 
     * @param model
     * @param editflag
     * @param patientId
     * @param hospitalNo
     * @return
     */
    @RequestMapping("/operatePatient")
    public String operatePatient(ModelMap model, String patientId, String hospitalNo, String editflag) {
        PatientForm form = new PatientForm();
        form.setPatientId(patientId);
        form.setHospitalNo(hospitalNo);
        PdDPatientInfo pdDPatientInfo = patientListService.getPatientData(form);
        if (Tools.isblank(pdDPatientInfo)) {
            pdDPatientInfo = new PdDPatientInfo();
        }
        List<Code> hospitalOptions = this.patientListService.getSelectHospitalOptions();
        model.addAttribute("hospitalOptions", hospitalOptions);
        if (!Tools.isblank(hospitalNo)) {
            form.setHospitalNo(hospitalNo);
        }
        model.addAttribute("editflag", editflag);
        model.addAttribute("resultForm", pdDPatientInfo);
        return PatientListPageConstants.STATION_PATIENT_EDIT;
    }

    /**
     * 获得患者列表.
     * 
     * @param form PatientForm
     * @return JacksonPagginListReturn
     */
    @RequestMapping("/getPatientData")
    public JacksonPagginListReturn<PatientRstForm> getPatientDataLists(PatientForm form) {
        return this.patientListService.getPatientDataLists(form);
    }

    
    /**
     * 查看患者
     * @return
     */
    @RequestMapping("/view")
    public String view(String patientId,ModelMap model){
    	
    	
    	return PatientListPageConstants.STATION_PATIENT_VIEW;
    }
    
    /**
     * 保存或者编辑
     * 
     * @param condition
     * @return
     */
    @RequestMapping("/addOrEditPatient")
    public JacksonCountReturn addOrEdit(PatientForm condition,String updateDate) {
        condition.setUpdateDate(updateDate);
        return this.patientListService.addOrEdit(condition);
    }

    /**
     * 删除患者.
     * 
     * @param condition
     * @return
     */
    @RequestMapping("/deletePatient")
    public JacksonCountReturn deletePatient(PatientForm condition) {
        return this.patientListService.deletePatient(condition);
    }
}
