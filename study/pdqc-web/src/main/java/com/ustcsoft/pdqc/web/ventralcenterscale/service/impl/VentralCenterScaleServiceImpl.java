//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.ventralcenterscale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterKey;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.ventralcenterscale.form.VentralCenterScaleForm;
import com.ustcsoft.pdqc.web.ventralcenterscale.form.ventralCenterScaleDetailForm;
import com.ustcsoft.pdqc.web.ventralcenterscale.service.VentralCenterScaleService;

/**
 * 
 * @author liujian
 */
@Service
public class VentralCenterScaleServiceImpl extends WebBaseServiceImpl implements VentralCenterScaleService {
	@Autowired
	private PdDCenterMapper pdDCenterMapper;
	
	/**
	 * 查询医院名称及规模
	 * 
	 */
	@Override
	public JacksonListReturn<VentralCenterScaleForm> initVentralCenterScaleChart() {
		JacksonListReturn<VentralCenterScaleForm> result = new JacksonListReturn<VentralCenterScaleForm>();
		VentralCenterScaleForm form = new VentralCenterScaleForm();
        ListResult<VentralCenterScaleForm> resultList = getWebCommonDao().selectList("VentralCenterScaleMapper.selectPatientInfo", form);
        List<VentralCenterScaleForm> patientInfoList = resultList.getResultData();
        //获取医院名称
        PdDCenterKey centerKey = new PdDCenterKey();
        for (int i = 0; i < patientInfoList.size(); i++) {
            centerKey.setPdCenterNo(patientInfoList.get(i).getHp_id());
            PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
            if(dCenter != null){
                String hospitalName = dCenter.getPdCenterName();
                patientInfoList.get(i).setHospitalName(hospitalName);
            }else {
            	patientInfoList.get(i).setHospitalName(patientInfoList.get(i).getHp_id());
            }
		}
        result.setData(patientInfoList);
		return result;
	}

	/**
	 * 弹出框列表
	 */
	@Override
	public JacksonPagginListReturn<ventralCenterScaleDetailForm> ventralCenterScaleDetailList(String hospitalName) {
		JacksonPagginListReturn<ventralCenterScaleDetailForm> listReturn = new JacksonPagginListReturn<ventralCenterScaleDetailForm>();
		ventralCenterScaleDetailForm form = new ventralCenterScaleDetailForm();
		form.setHp_id(hospitalName);
		ListResult<ventralCenterScaleDetailForm> listResult1 = getWebCommonDao().selectList("VentralCenterScaleMapper.ventralCenterScaleDetailList", form);
		listReturn.setData(listResult1.getResultData());
		return listReturn;
	}


}
