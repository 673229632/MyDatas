//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsurvivalmonth.service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.form.PatientSurvivalMonthForm;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.form.SurvivalMonthDetailForm;

/**
 * 
 * @author liujian
 */
public interface PatientSurvivalMonthService {

	/**
	 * 病人生存月统计
	 * 
	 * @return
	 */
	JacksonListReturn<PatientSurvivalMonthForm> initPatientSurvivalMonthChart();

	/**
	 * 弹出框列表
	 * 
	 * @return
	 */
	JacksonPagginListReturn<SurvivalMonthDetailForm> PatientSurvivalMonthDetail(String hospitalName);

}
