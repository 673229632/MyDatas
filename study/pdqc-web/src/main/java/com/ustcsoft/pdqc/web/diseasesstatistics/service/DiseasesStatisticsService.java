//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.diseasesstatistics.service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.diseasesstatistics.form.DiseasesStatisticsForm;
import com.ustcsoft.pdqc.web.diseasesstatistics.form.PatientDetailForm;

/**
 * 
 * @author liujian
 */
public interface DiseasesStatisticsService {

	/**
	 * 传染病统计
	 * 
	 * @return
	 */
	JacksonListReturn<DiseasesStatisticsForm> initDiseasesStatisticsChart();

	/**
	 * 传染病列表
	 * 
	 * @return
	 */
	JacksonListReturn<DiseasesStatisticsForm> diseasesStatisticsList();

	/**
	 *  传染病列表点击事件
	 * @param diseases
	 * @param hp_id
	 * @return 
	 */
	JacksonPagginListReturn<PatientDetailForm> showPatientDetailList(PatientDetailForm form);

}
