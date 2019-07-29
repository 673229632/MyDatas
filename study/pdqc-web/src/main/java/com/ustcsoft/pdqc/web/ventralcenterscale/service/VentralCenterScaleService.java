//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.ventralcenterscale.service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.ventralcenterscale.form.VentralCenterScaleForm;
import com.ustcsoft.pdqc.web.ventralcenterscale.form.ventralCenterScaleDetailForm;

/**
 * 
 * @author liujian
 */
public interface VentralCenterScaleService {

	/**
	 * 查询医院名称及规模
	 * 
	 * @return
	 */
	JacksonListReturn<VentralCenterScaleForm> initVentralCenterScaleChart();

	/**
	 * 弹出框列表
	 * 
	 * @param hospitalName
	 * @return
	 */
	JacksonPagginListReturn<ventralCenterScaleDetailForm> ventralCenterScaleDetailList(String hospitalName);

}
