package com.ustcsoft.pdqc.web.workstation.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.web.workstation.form.ChartForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessListReturnDataForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessReportForm;
import com.ustcsoft.pdqc.web.workstation.form.EChartCodeForm;
import com.ustcsoft.pdqc.web.workstation.form.OrgCondForm;
import com.ustcsoft.pdqc.web.workstation.form.OrgResultForm;
import com.ustcsoft.pdqc.web.workstation.form.UnreportedPatientForm;

public interface WorkStationService {
    
    JacksonPagginListReturn<OrgResultForm> getOrgList(OrgCondForm condForm);
    
    JacksonDataReturn<ChartForm> initHospitalChart();
    //质控中心上报完整性汇总数据
	CompletenessListReturnDataForm completenessSummaryData();
	//透析中心上报完整性
	JacksonPagginListReturn<CompletenessReportForm> getRePortCompletenes();
	//获取未上报患者信息
	JacksonPagginListReturn<UnreportedPatientForm> getRePortPatient(String reportProject, String inspectionType);
	//查询kpi检查率
	JacksonDataReturn<ChartForm> searchKpiExamChart(String examType, String orderBy);
	//查询kpi达标率
	JacksonDataReturn<ChartForm> searchKpiStandardChart(String examType,String orderBy);
	//查询kpi分数
	JacksonDataReturn<ChartForm> searchKpiScoreChart(String examType,String orderBy);
	//数据导出
	JacksonReturn dataExport(String examType);
    

}
