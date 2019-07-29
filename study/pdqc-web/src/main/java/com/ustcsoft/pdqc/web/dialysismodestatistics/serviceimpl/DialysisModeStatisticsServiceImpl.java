//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.dialysismodestatistics.serviceimpl;

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
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsDetailForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.form.DialysisModeStatisticsListForm;
import com.ustcsoft.pdqc.web.dialysismodestatistics.service.DialysisModeStatisticsService;

/**
 * 
 * @author liujian
 */
@Service
public class DialysisModeStatisticsServiceImpl extends WebBaseServiceImpl implements DialysisModeStatisticsService {

	@Autowired
	private PdDCenterMapper pdDCenterMapper;
	
	/**
	 * 透析模式统计
	 */
	@Override
	public JacksonListReturn<DialysisModeStatisticsForm> initDialysisModeStatisticsChart() {
		JacksonListReturn<DialysisModeStatisticsForm> result = new JacksonListReturn<DialysisModeStatisticsForm>();
		DialysisModeStatisticsForm form = new DialysisModeStatisticsForm();
        ListResult<DialysisModeStatisticsForm> resultList = getWebCommonDao().selectList("DialysisModeStatisticsMapper.selectDialysisModeStatistics", form);
        List<DialysisModeStatisticsForm> patientInfoList = resultList.getResultData();
        //各医院人数
        ListResult<DialysisModeStatisticsForm> resultList1 = getWebCommonDao().selectList("DialysisModeStatisticsMapper.countNumber", form);
        List<DialysisModeStatisticsForm> patientInfoList1 = resultList1.getResultData();
		for (int i = 0; i < patientInfoList.size(); i++) {
			BigDecimal num = new BigDecimal("100");
			BigDecimal capdNumber = patientInfoList.get(i).getCountPatient().multiply(num);
			// 计算透析模式所占比例
			for (int j = 0; j < patientInfoList1.size(); j++) {
				BigDecimal allNumber = patientInfoList1.get(j).getCountPatient();
				if (patientInfoList.get(i).getHp_id().equals(patientInfoList1.get(j).getHp_id())) {
					if (("CAPD").equals(patientInfoList.get(i).getType())) {
						BigDecimal rate1 = capdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
						patientInfoList.get(i).setCountPatient(rate1);
					} else if (("APD").equals(patientInfoList.get(i).getType())) {
						BigDecimal rate2 = capdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
						patientInfoList.get(i).setCountPatient(rate2);
					} else if (("IPD").equals(patientInfoList.get(i).getType())) {
						BigDecimal rate3 = capdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
						patientInfoList.get(i).setCountPatient(rate3);
					} else if (("APD-TPD").equals(patientInfoList.get(i).getType())) {
						BigDecimal rate4 = capdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
						patientInfoList.get(i).setCountPatient(rate4);
					}
				}
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
	 * 腹透模式列表
	 */
	@Override
	public JacksonPagginListReturn<DialysisModeStatisticsListForm> dialysisModeStatisticsList() {
		JacksonPagginListReturn<DialysisModeStatisticsListForm> result = new JacksonPagginListReturn<DialysisModeStatisticsListForm>();
		DialysisModeStatisticsListForm form = new DialysisModeStatisticsListForm();
		ListResult<DialysisModeStatisticsListForm> listResult = getWebCommonDao().selectList("DialysisModeStatisticsMapper.dialysisModeStatisticsList", form);
		List<DialysisModeStatisticsListForm> list = listResult.getResultData();
		// 各医院人数
/*		ListResult<DialysisModeStatisticsForm> resultList1 = getWebCommonDao().selectList("DialysisModeStatisticsMapper.countNumber", form);
		List<DialysisModeStatisticsForm> list1 = resultList1.getResultData();
		BigDecimal num = new BigDecimal("100");
		for (int i = 0; i < list.size(); i++) {
			BigDecimal allNumber = list1.get(i).getCountPatient();

			BigDecimal capdNumber = list.get(i).getCapd().multiply(num);
			BigDecimal capd = capdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
			list.get(i).setCapd(capd);

			BigDecimal apdNumber = list.get(i).getApd().multiply(num);
			BigDecimal apd = apdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
			list.get(i).setApd(apd);

			BigDecimal ipdNumber = list.get(i).getIpd().multiply(num);
			BigDecimal ipd = ipdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
			list.get(i).setIpd(ipd);

			BigDecimal apdtpdNumber = list.get(i).getApdtpd().multiply(num);
			BigDecimal apdtpd = apdtpdNumber.divide(allNumber, 2, BigDecimal.ROUND_HALF_UP);
			list.get(i).setApdtpd(apdtpd);
		}*/
		
		// 获取医院名称
		PdDCenterKey centerKey = new PdDCenterKey();
		for (int i = 0; i < list.size(); i++) {
			centerKey.setPdCenterNo(list.get(i).getHp_id());
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			if (dCenter != null) {
				String hospitalName = dCenter.getPdCenterName();
				list.get(i).setHp_id(hospitalName);
			} else {
				list.get(i).setHp_id(list.get(i).getHp_id());
			}
		}
		result.setData(list);
		return result;
	}

	/**
	 * 弹出框列表
	 */
	@Override
	public JacksonPagginListReturn<DialysisModeStatisticsDetailForm> dialysisModeStatisticsDetail(String dialysis,String hospitalName) {
		JacksonPagginListReturn<DialysisModeStatisticsDetailForm> result = new JacksonPagginListReturn<DialysisModeStatisticsDetailForm>();
		DialysisModeStatisticsDetailForm form = new DialysisModeStatisticsDetailForm();
		form.setHospitalName(hospitalName);
		ListResult<DialysisModeStatisticsDetailForm> listResult = getWebCommonDao().selectList("DialysisModeStatisticsMapper.selectHospitalId", form);
		DialysisModeStatisticsDetailForm form1 = new DialysisModeStatisticsDetailForm();
		form1.setHp_id(listResult.getResultData().get(0).getHp_id());
		form1.setDialysis(dialysis);
		ListResult<DialysisModeStatisticsDetailForm> listResult1 = getWebCommonDao().selectList("DialysisModeStatisticsMapper.dialysisModeStatisticsDetail", form1);
		result.setData(listResult1.getResultData());
		return result;
	}

}
