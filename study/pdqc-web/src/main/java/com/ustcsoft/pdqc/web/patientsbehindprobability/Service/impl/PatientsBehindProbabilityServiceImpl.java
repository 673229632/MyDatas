//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsbehindprobability.Service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
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
import com.ustcsoft.pdqc.web.patientsbehindprobability.Form.PatientsBehindProbabilityForm;
import com.ustcsoft.pdqc.web.patientsbehindprobability.Form.ShowRateDetailListForm;
import com.ustcsoft.pdqc.web.patientsbehindprobability.Service.PatientsBehindProbabilityService;

/**
 * 
 * @author liujian
 */
@Service
public class PatientsBehindProbabilityServiceImpl extends WebBaseServiceImpl implements PatientsBehindProbabilityService {

	@Autowired
	private PdDCenterMapper pdDCenterMapper;
	
	/**
	 */
	@Override
	public JacksonListReturn<PatientsBehindProbabilityForm> initPatientsBehindProbabilityChart() {
		JacksonListReturn<PatientsBehindProbabilityForm> result = new JacksonListReturn<PatientsBehindProbabilityForm>();
		// 各医院掉队人数
		PatientsBehindProbabilityForm form = new PatientsBehindProbabilityForm();
		List<String> outcome_type = new ArrayList<>();
		outcome_type.add("PD_OUT_2");
		outcome_type.add("PD_OUT_3");
		outcome_type.add("PD_OUT_4");
		form.setOutcome_type(outcome_type);
		ListResult<PatientsBehindProbabilityForm> resultList = getWebCommonDao().selectList("PatientsBehindProbabilityMapper.selectDropPatientNumber", form);
		List<PatientsBehindProbabilityForm> patientInfoList = resultList.getResultData();
		// 各医院规模
		PatientsBehindProbabilityForm form1 = new PatientsBehindProbabilityForm();
		ListResult<PatientsBehindProbabilityForm> resultList1 = getWebCommonDao().selectList("PatientsBehindProbabilityMapper.selectPatientNumber", form1);
		List<PatientsBehindProbabilityForm> patientInfoList1 = resultList1.getResultData();
		// 计算各医院掉队率
		for (int i = 0; i < patientInfoList.size(); i++) {
			BigDecimal num = new BigDecimal("100");
			BigDecimal DropPatientNum = patientInfoList.get(i).getDropPatientNum().multiply(num);
			if (patientInfoList.get(i).getHp_id().equals(patientInfoList1.get(i).getHp_id())) {
				BigDecimal rate = DropPatientNum.divide(patientInfoList1.get(i).getPatientNum(),2,BigDecimal.ROUND_HALF_UP);
				patientInfoList.get(i).setRate(rate);
			}
		}
		// 获取医院名称
		PdDCenterKey centerKey = new PdDCenterKey();
		for (int i = 0; i < patientInfoList.size(); i++) {
			centerKey.setPdCenterNo(patientInfoList.get(i).getHp_id());
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			if (dCenter != null) {
				String hospitalName = dCenter.getPdCenterName();
				patientInfoList.get(i).setHospitalName(hospitalName);
			} else {
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
	public JacksonPagginListReturn<ShowRateDetailListForm> showRateDetailList(ShowRateDetailListForm detailListForm) {
		JacksonPagginListReturn<ShowRateDetailListForm> listReturn = new JacksonPagginListReturn<ShowRateDetailListForm>();
		//查询医院ID
		//患者列表
		ShowRateDetailListForm listForm1 = new ShowRateDetailListForm();
		listForm1.setHp_id(detailListForm.getHospitalName());
		List<String> outcome_type = new ArrayList<>();
		outcome_type.add("PD_OUT_2");
		outcome_type.add("PD_OUT_3");
		outcome_type.add("PD_OUT_4");
		listForm1.setOutcome_type(outcome_type);
		ListResult<ShowRateDetailListForm> listResult1 = getWebCommonDao().selectList("PatientsBehindProbabilityMapper.showRateDetailList", listForm1);
		List<ShowRateDetailListForm> list = listResult1.getResultData();
		listReturn.setData(list);
		return listReturn;
	}

}
