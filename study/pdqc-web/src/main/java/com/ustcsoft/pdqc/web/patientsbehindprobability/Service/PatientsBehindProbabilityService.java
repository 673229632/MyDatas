//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsbehindprobability.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.patientsbehindprobability.Form.PatientsBehindProbabilityForm;
import com.ustcsoft.pdqc.web.patientsbehindprobability.Form.ShowRateDetailListForm;

/**
 * 
 * @author liujian
 */
public interface PatientsBehindProbabilityService {

	/**
	 * 患者掉队率
	 * 
	 * @return
	 */
	JacksonListReturn<PatientsBehindProbabilityForm> initPatientsBehindProbabilityChart();

	/**
	 * 弹出框列表
	 * 
	 * @param hospitalName
	 * @return
	 */
	JacksonPagginListReturn<ShowRateDetailListForm> showRateDetailList(ShowRateDetailListForm detailListForm);

}
