//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.dialysismodestatistics.service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsDetailForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsListForm;

/**
 * 
 * @author liujian
 */
public interface DialysisModeStatisticsService {

	/**
	 * 透析模式统计
	 * 
	 * @return
	 */
	JacksonListReturn<DialysisModeStatisticsForm> initDialysisModeStatisticsChart();

	/**
	 * 腹透模式列表
	 * 
	 * @return
	 */
	JacksonPagginListReturn<DialysisModeStatisticsListForm> dialysisModeStatisticsList();

	/**
	 * 弹出框列表
	 * 
	 * @param dialysis
	 * @param hospitalName
	 * @return
	 */
	JacksonPagginListReturn<DialysisModeStatisticsDetailForm> dialysisModeStatisticsDetail(String dialysis,String hospitalName);

}
