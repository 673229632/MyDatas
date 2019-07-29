//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.diseasesstatistics.service.impl;

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
import com.ustcsoft.pdqc.web.diseasesstatistics.form.DiseasesStatisticsForm;
import com.ustcsoft.pdqc.web.diseasesstatistics.form.PatientDetailForm;
import com.ustcsoft.pdqc.web.diseasesstatistics.service.DiseasesStatisticsService;

/**
 * 
 * @author liujian
 */
@Service
public class DiseasesStatisticsServiceImpl extends WebBaseServiceImpl implements DiseasesStatisticsService {

	@Autowired
	private PdDCenterMapper pdDCenterMapper;

	/**
	 * 传染病统计
	 */
	@Override
	public JacksonListReturn<DiseasesStatisticsForm> initDiseasesStatisticsChart() {
		JacksonListReturn<DiseasesStatisticsForm> result = new JacksonListReturn<DiseasesStatisticsForm>();
		DiseasesStatisticsForm form = new DiseasesStatisticsForm();
		ListResult<DiseasesStatisticsForm> resultList = getWebCommonDao()
				.selectList("DiseasesStatisticsMapper.selectInfectionDiseases", form);
		List<DiseasesStatisticsForm> patientInfoList = resultList.getResultData();
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
	 * 传染病列表
	 */
	@Override
	public JacksonListReturn<DiseasesStatisticsForm> diseasesStatisticsList() {
		JacksonListReturn<DiseasesStatisticsForm> result = new JacksonListReturn<DiseasesStatisticsForm>();
		DiseasesStatisticsForm form = new DiseasesStatisticsForm();
		ListResult<DiseasesStatisticsForm> resultList = getWebCommonDao()
				.selectList("DiseasesStatisticsMapper.diseasesStatisticsList", form);
		List<DiseasesStatisticsForm> patientInfoList = resultList.getResultData();
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
	 * 传染病列表点击事件
	 * 
	 * @return
	 */
	@Override
	public JacksonPagginListReturn<PatientDetailForm> showPatientDetailList(PatientDetailForm form) {
		JacksonPagginListReturn<PatientDetailForm> result = new JacksonPagginListReturn<PatientDetailForm>();
			// 获取点击事件得到的患者列表
			PatientDetailForm form2 = new PatientDetailForm();
			form2.setHp_id(form.getHospitalName());
			form2.setInfection_diseases(form.getDiseases());
			ListResult<PatientDetailForm> resultList1 = getWebCommonDao()
					.selectList("DiseasesStatisticsMapper.selectPatientDetail", form2);
			List<PatientDetailForm> result1 = resultList1.getResultData();
			result.setData(result1);
		return result;
	}

}
