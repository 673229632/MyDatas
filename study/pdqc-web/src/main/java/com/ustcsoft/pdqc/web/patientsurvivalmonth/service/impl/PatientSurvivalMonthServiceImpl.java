//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsurvivalmonth.service.impl;

import java.math.BigDecimal;
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
import com.ustcsoft.pdqc.web.patientsurvivalmonth.form.PatientSurvivalMonthForm;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.form.SurvivalMonthDetailForm;
import com.ustcsoft.pdqc.web.patientsurvivalmonth.service.PatientSurvivalMonthService;

/**
 * 
 * @author liujian
 */
@Service
public class PatientSurvivalMonthServiceImpl extends WebBaseServiceImpl implements PatientSurvivalMonthService {

	@Autowired
	private PdDCenterMapper pdDCenterMapper;
	
	/**
	 * 病人生存月统计
	 */
	@Override
	public JacksonListReturn<PatientSurvivalMonthForm> initPatientSurvivalMonthChart() {
		JacksonListReturn<PatientSurvivalMonthForm> result = new JacksonListReturn<PatientSurvivalMonthForm>();
		PatientSurvivalMonthForm form = new PatientSurvivalMonthForm();
        ListResult<PatientSurvivalMonthForm> resultList = getWebCommonDao().selectList("PatientSurvivalMonthMapper.selectPatientSurvivalMonth", form);
        List<PatientSurvivalMonthForm> patientInfoList = resultList.getResultData();
        
        PdDCenterKey centerKey = new PdDCenterKey();
        for (int i = 0; i < patientInfoList.size(); i++) {
        	//获取医院名称
            centerKey.setPdCenterNo(patientInfoList.get(i).getHp_id());
            PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
            if(dCenter != null){
                String hospitalName = dCenter.getPdCenterName();
                patientInfoList.get(i).setHospitalName(hospitalName);
            }else {
            	patientInfoList.get(i).setHospitalName(patientInfoList.get(i).getHp_id());
            }
            //获取各医院生存月
            BigDecimal countMonth = patientInfoList.get(i).getCountMonth();  
            BigDecimal countNumber = patientInfoList.get(i).getCountNumber();
            BigDecimal survivalMonth = countMonth.divide(countNumber,2,BigDecimal.ROUND_HALF_UP);
            patientInfoList.get(i).setCountMonth(survivalMonth);
            
		}
        
        result.setData(patientInfoList);
		return result;
	}

	/**
	 * 弹出框列表
	 */
	@Override
	public JacksonPagginListReturn<SurvivalMonthDetailForm> PatientSurvivalMonthDetail(String hospitalName) {
		JacksonPagginListReturn<SurvivalMonthDetailForm> listReturn = new JacksonPagginListReturn<SurvivalMonthDetailForm>();
		SurvivalMonthDetailForm form = new SurvivalMonthDetailForm();
		form.setHp_id(hospitalName);
		ListResult<SurvivalMonthDetailForm> listResult1 = getWebCommonDao().selectList("PatientSurvivalMonthMapper.PatientSurvivalMonthDetail", form);
		listReturn.setData(listResult1.getResultData());
		return listReturn;
	}

}
