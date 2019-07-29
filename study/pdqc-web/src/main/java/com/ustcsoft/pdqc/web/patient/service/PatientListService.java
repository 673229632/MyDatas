
package com.ustcsoft.pdqc.web.patient.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfo;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.patient.form.PatientForm;
import com.ustcsoft.pdqc.web.patient.form.PatientRstForm;

/**
 * @author lijun 患者接口
 */
public interface PatientListService {

    /**
     * 获得所有的医院
     * 
     * @return
     */
    List<Code> getSelectHospitalOptions();
    
    

    /**
     * 添加或者编辑
     * 
     * @return
     */
    public JacksonCountReturn addOrEdit(PatientForm condition);

    /**
     * 删除患者.
     * 
     * @return
     */
    public JacksonCountReturn deletePatient(PatientForm condition);

    /**
     * 获得患者列表
     * 
     * @param form
     * @return
     */
    public JacksonPagginListReturn<PatientRstForm> getPatientDataLists(PatientForm form);

    /**
     * 获取某患者信息.
     * 
     * @param form PatientForm
     * @return
     */
    public PdDPatientInfo getPatientData(PatientForm form);
	
	
	/**
	 * 通过id获得患者
	 * @param patientId
	 * @return
	 */
	public PatientForm getPatientFormById(String patientId);
}
