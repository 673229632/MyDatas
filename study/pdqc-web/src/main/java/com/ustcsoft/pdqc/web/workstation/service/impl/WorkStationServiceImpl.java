package com.ustcsoft.pdqc.web.workstation.service.impl;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.mybatis.paging.Paging;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCheckResultTimeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCodeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMKpisegMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckResultTime;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckResultTimeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCode;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMKpiseg;
import com.ustcsoft.pdqc.core.autogen.entity.PdMKpisegExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.workstation.form.ChartForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessDataResultForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessListReturnDataForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessReportForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessRstCondForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessSelectParameterForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessTitleResultForm;
import com.ustcsoft.pdqc.web.workstation.form.EChartCodeForm;
import com.ustcsoft.pdqc.web.workstation.form.OrgCondForm;
import com.ustcsoft.pdqc.web.workstation.form.OrgResultForm;
import com.ustcsoft.pdqc.web.workstation.form.UnreportedPatientForm;
import com.ustcsoft.pdqc.web.workstation.service.WorkStationService;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
@Service
public class WorkStationServiceImpl extends WebBaseServiceImpl implements WorkStationService {
    
    @Autowired
    CommonService commonService;
    
    @Autowired
    WebCommonDao webCommonDao;
    
    @Autowired
    PdDQcCenterMapper pdDQcCenterMapper;

    @Autowired
    PdMCheckResultTimeMapper pdMCheckResultTimeMapper;
    
    @Autowired
    PdDCenterMapper pdDCenterMapper;
    
    @Autowired
    PdMOrganizationMapper pdMOrganizationMapper;
    
    @Autowired
    PdMCodeMapper pdMCodeMapper;
    
    @Autowired
    PdMKpisegMapper pdMKpisegMapper;
    
    @Override
    public JacksonPagginListReturn<OrgResultForm> getOrgList(OrgCondForm condForm) {
        JacksonPagginListReturn<OrgResultForm> result = new JacksonPagginListReturn<OrgResultForm>();
        String orgNo = getLoginUser().getOrgNo();
        // 存放下级机构编号的list
        List<String> orgStrList = new ArrayList<String>();
        // 获取下级机构
        List<Code> childOrgList = commonService.getOrgSelectOptions(orgNo);
        for (Code code : childOrgList) {
            orgStrList.add(code.getValue());
        }
        // 医生code
        condForm.setDoctorCode(EMP_TYPE_DOCTOR);
        // 护士code
        condForm.setNurseCode(EMP_TYPE_NURSE);
        // 工程师code
        condForm.setEngineerCode(EMP_TYPE_ENGINEER);
        // 转归类型
        condForm.setOutcomeCode(OUTCOME_TYPE_IN_SECTION);
        // 机构列表
        condForm.setOrgList(orgStrList);
        // >90天
        condForm.setThreeMonthAgoDate(DateUtil.beforeThreeMonthDate());
        ListResult<OrgResultForm> roleCountList = webCommonDao.selectList("WorkStationMapper.getIndexOrgList", condForm);
        // 获取分页
        int pagecount = 0;
        if (!Tools.listisblank(roleCountList.getResultData())) {
            pagecount = roleCountList.getResultData().size();
        }
        double maxpage = (double) pagecount / (double) condForm.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condForm.getPageNumber() > maxpageSize) {
            condForm.setPageNumber(maxpageSize);
        }
        // 获得机构列表
        ListResult<OrgResultForm> roleList = webCommonDao.selectPaging("WorkStationMapper.getIndexOrgList",
                condForm,new Paging(condForm.getPageNumber(), condForm.getPageSize()));
        List<OrgResultForm> resultList = new ArrayList<OrgResultForm>();
        resultList.addAll(roleList.getResultData());
        result.setData(resultList);
        result.setPageNumber(condForm.getPageNumber());
        result.setPageCount(pagecount);
        result.setTotalCount(pagecount);
        return result;
    }
    
    /**
     * 获取医院图表
     */
    public JacksonDataReturn<ChartForm> initHospitalChart() {
        JacksonDataReturn<ChartForm> result = new JacksonDataReturn<ChartForm>();
        ChartForm resultForm = new ChartForm();
        List<EChartCodeForm> chartList = new ArrayList<EChartCodeForm>();
        String orgNo = getLoginUser().getOrgNo();
        List<String> orgNoList = new ArrayList<String>();
        orgNoList.add(orgNo);
        OrgCondForm condForm = new OrgCondForm();
        // 医生code
        condForm.setDoctorCode(EMP_TYPE_DOCTOR);
        // 护士code
        condForm.setNurseCode(EMP_TYPE_NURSE);
        // 工程师code
        condForm.setEngineerCode(EMP_TYPE_ENGINEER);
        // 转归类型
        condForm.setOutcomeCode(OUTCOME_TYPE_IN_SECTION);
        // 机构列表
        condForm.setOrgList(orgNoList);
        // >90天
        condForm.setThreeMonthAgoDate(DateUtil.beforeThreeMonthDate());
        // 获取医院信息
        ListResult<OrgResultForm> roleCountList = webCommonDao.selectList("WorkStationMapper.getIndexOrgList", condForm);
        List<OrgResultForm> orgList = roleCountList.getResultData();
        if (!Tools.listisblank(orgList)) {
            OrgResultForm orgResultForm = new OrgResultForm();
            orgResultForm = orgList.get(0);
            EChartCodeForm eChartCodeForm1 = new EChartCodeForm();
            eChartCodeForm1.setName("所有患者");
            eChartCodeForm1.setValue(new BigDecimal(orgResultForm.getAllPatient()));
            EChartCodeForm eChartCodeForm2 = new EChartCodeForm();
            eChartCodeForm2.setName("患者保有量");
            eChartCodeForm2.setValue(new BigDecimal(orgResultForm.getPatientRetention()));
            EChartCodeForm eChartCodeForm3 = new EChartCodeForm();
            eChartCodeForm3.setName("护士人数");
            eChartCodeForm3.setValue(new BigDecimal(orgResultForm.getNurseNum()));
            EChartCodeForm eChartCodeForm4 = new EChartCodeForm();
            eChartCodeForm4.setName("医生人数");
            eChartCodeForm4.setValue(new BigDecimal(orgResultForm.getDoctorNum()));
            EChartCodeForm eChartCodeForm5 = new EChartCodeForm();
            eChartCodeForm5.setName("工程师人数");
            eChartCodeForm5.setValue(new BigDecimal(orgResultForm.getEngineerNum()));
            chartList.add(eChartCodeForm1);
            chartList.add(eChartCodeForm2);
            chartList.add(eChartCodeForm3);
            chartList.add(eChartCodeForm4);
            chartList.add(eChartCodeForm5);
        }
        resultForm.seteChartCodeFormList(chartList);
        result.setData(resultForm);
        return result;
    }
    /**
     * 上报完整性汇总数据
     */
	@Override
	public CompletenessListReturnDataForm completenessSummaryData() {
		CompletenessListReturnDataForm returnData = new CompletenessListReturnDataForm();
        //表头标题
        List<CompletenessTitleResultForm> titleList = getCompletenessTitleResult();
        returnData.setTitleList(titleList);
        
        //列表数据
        CompletenessDataResultForm resultForm = getComfortDataResult();
        returnData.setDataList(resultForm);
		return returnData;
	}

    /**
     * 质控中心上报完整性表头标题
     * @param 
     * @return
     */
    private List<CompletenessTitleResultForm> getCompletenessTitleResult() {
    	List<CompletenessTitleResultForm> resultList = new ArrayList<CompletenessTitleResultForm>();
    	CompletenessTitleResultForm patientForm = new CompletenessTitleResultForm();
    	patientForm.setFieldName("pdCenterName");
    	patientForm.setTitleName("医院名称");
    	CompletenessTitleResultForm completenessForm = new CompletenessTitleResultForm();
    	completenessForm.setFieldName("patientNum");
    	completenessForm.setTitleName("患者保有量");
    	resultList.add(patientForm);
    	resultList.add(completenessForm);
    	String parentCode = "SJWZX";
    	List<Code> completenessList = this.commonService.getOptionsByParentCode(parentCode);
    	for(int i=0;i<completenessList.size();i++){
    		CompletenessTitleResultForm completenessListForm = new CompletenessTitleResultForm();
    		completenessListForm.setFieldName(completenessList.get(i).getValue().toLowerCase());
    		completenessListForm.setTitleName(completenessList.get(i).getText());
    		resultList.add(completenessListForm);
    	}
    	return resultList;
    }
    
    /**
     * 质控中心上报完整性列表数据
     * @param
     * @return
     */
    private CompletenessDataResultForm getComfortDataResult() {
    	CompletenessDataResultForm resultForm = new CompletenessDataResultForm();
    	Date checkStartTime = new Date();
    	Date checkEndTime = new Date();
    	Date patientRetentionTime = new Date();
    	JSONArray resultJson = new JSONArray();
    	String qcCenterNo = null;
    	//获取登陆者的orgNo
    	String orgNo = getLoginUser().getOrgNo();
    	PdDQcCenterExample pddQcCenter = new PdDQcCenterExample();
    	PdDQcCenterExample.Criteria criteria = pddQcCenter.createCriteria();
		criteria.andOrgNoEqualTo(orgNo);
		List<PdDQcCenter> qcCenterList = this.pdDQcCenterMapper.selectByExample(pddQcCenter);
		//获取质控中心编号
		if(qcCenterList.size()>0){
			qcCenterNo = qcCenterList.get(0).getQcCenterNo();
		}
		PdMCheckResultTimeExample pdMCheckResultTimeExample = new PdMCheckResultTimeExample();
		PdMCheckResultTimeExample.Criteria criteria1 = pdMCheckResultTimeExample.createCriteria();
		criteria1.andQcCenterNoEqualTo(qcCenterNo);
		List<PdMCheckResultTime> checkResultTimesList = this.pdMCheckResultTimeMapper.selectByExample(pdMCheckResultTimeExample);
		//获取检查开始时间、检查结束时间和计算患者保有量时间
		if(checkResultTimesList.size()>0){
			checkStartTime = checkResultTimesList.get(0).getCheckStartDate();
			checkEndTime = checkResultTimesList.get(0).getCheckEndDate();
			patientRetentionTime = DateUtil.addDay(checkStartTime, -90);
		}
		CompletenessSelectParameterForm completenessSelectParameter = new CompletenessSelectParameterForm();
		completenessSelectParameter.setCheckStartTime(checkStartTime);
		completenessSelectParameter.setCheckEndTime(checkEndTime);
		completenessSelectParameter.setPatientRetentionTime(patientRetentionTime);
		completenessSelectParameter.setOrgNo(orgNo);
		//获取上报完整性数据
		ListResult<CompletenessRstCondForm> completenessRstCondFormList =  webCommonDao.selectList("WorkStationMapper.getCompletenessOfReporting", completenessSelectParameter);
		if(completenessRstCondFormList.getResultData().size()>0){
			for(CompletenessRstCondForm completenessRstCondForm : completenessRstCondFormList.getResultData()){
				completenessRstCondForm.setSJWZX_1(completenessRstCondForm.getOutComeNum()+"("+completenessRstCondForm.getOutComePercentage()+"%)");
				completenessRstCondForm.setSJWZX_2(completenessRstCondForm.getTubeNum()+"("+completenessRstCondForm.getTubePercentage()+"%)");
				completenessRstCondForm.setSJWZX_3(completenessRstCondForm.getDialsysNum()+"("+completenessRstCondForm.getDialsysPercentage()+"%)");
				completenessRstCondForm.setSJWZX_4(completenessRstCondForm.getDrugNum()+"("+completenessRstCondForm.getDrugPercentage()+"%)");
				completenessRstCondForm.setSJWZX_5(completenessRstCondForm.getFollowupNum()+"("+completenessRstCondForm.getFollowupPercentage()+"%)");
				completenessRstCondForm.setSJWZX_6(completenessRstCondForm.getOutpatientNum()+"("+completenessRstCondForm.getOutpatientPercentage()+"%)");
				completenessRstCondForm.setSJWZX_7(completenessRstCondForm.getAdequacyNum()+"("+completenessRstCondForm.getAdequacyPercentage()+"%)");
				completenessRstCondForm.setSJWZX_8(completenessRstCondForm.getPetNum()+"("+completenessRstCondForm.getPetPercentage()+"%)");
				completenessRstCondForm.setSJWZX_9(completenessRstCondForm.getComplicationNum()+"("+completenessRstCondForm.getComplicationPercentage()+"%)");
				completenessRstCondForm.setSJWZX_10(completenessRstCondForm.getInspectionNum()+"("+completenessRstCondForm.getInspectionPercentage()+"%)");
				//如果患者保有量为空，则患者保有量设置为0、所有比例设置为0%
				if(completenessRstCondForm.getPatientNum()==null){
					completenessRstCondForm.setPatientNum("0");
					completenessRstCondForm.setSJWZX_1("0(0%)");
					completenessRstCondForm.setSJWZX_2("0(0%)");
					completenessRstCondForm.setSJWZX_3("0(0%)");
					completenessRstCondForm.setSJWZX_4("0(0%)");
					completenessRstCondForm.setSJWZX_5("0(0%)");
					completenessRstCondForm.setSJWZX_6("0(0%)");
					completenessRstCondForm.setSJWZX_7("0(0%)");
					completenessRstCondForm.setSJWZX_8("0(0%)");
					completenessRstCondForm.setSJWZX_9("0(0%)");
					completenessRstCondForm.setSJWZX_10("0(0%)");
				}else{
					//如果转归信息数量为null,则画面显示0%
					if(completenessRstCondForm.getOutComeNum()==null){
						completenessRstCondForm.setSJWZX_1("0(0%)");
					}
					//如果置管手术数量为null,则画面显示0%
					if(completenessRstCondForm.getTubeNum()==null){
						completenessRstCondForm.setSJWZX_2("0(0%)");
					}
					//如果透析方案数量为null,则画面显示0%
					if(completenessRstCondForm.getDialsysNum()==null){
						completenessRstCondForm.setSJWZX_3("0(0%)");
					}
					//如果用药处方数量为null,则画面显示0%
					if(completenessRstCondForm.getDrugNum()==null){
						completenessRstCondForm.setSJWZX_4("0(0%)");
					}
					//如果患者随访数量为null,则画面显示0%
					if(completenessRstCondForm.getFollowupNum()==null){
						completenessRstCondForm.setSJWZX_5("0(0%)");
					}
					//如果门诊评估数量为null,则画面显示0%
					if(completenessRstCondForm.getOutpatientNum()==null){
						completenessRstCondForm.setSJWZX_6("0(0%)");
					}
					//如果腹透充分性数量为null,则画面显示0%
					if(completenessRstCondForm.getAdequacyNum()==null){
						completenessRstCondForm.setSJWZX_7("0(0%)");
					}
					//如果腹膜平衡实验数量为null,则画面显示0%
					if(completenessRstCondForm.getPetNum()==null){
						completenessRstCondForm.setSJWZX_8("0(0%)");
					}
					//如果合并症数量为null,则画面显示0%
					if(completenessRstCondForm.getComplicationNum()==null){
						completenessRstCondForm.setSJWZX_9("0(0%)");
					}
					//如果检验检查数量为null,则画面显示0%
					if(completenessRstCondForm.getInspectionNum()==null){
						completenessRstCondForm.setSJWZX_10("0(0%)");
					}
				}
				resultJson.add(completenessRstCondForm);
			}
		}
		resultForm.setData(resultJson);
		return resultForm;
    	
    }

    /**
     * 透析中心上报完整性列表数据
     * @param
     * @return
     */
	@Override
	public JacksonPagginListReturn<CompletenessReportForm> getRePortCompletenes() {
		JacksonPagginListReturn<CompletenessReportForm> rst = new JacksonPagginListReturn<>();
		List<CompletenessReportForm> completenessReportFormList = new ArrayList<>();
		CompletenessSelectParameterForm completenessSelectParameter =getCompletenessSelectParameterForm();
		String parentCode = "SJWZX";
		PdMCodeExample pdMCodeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria4 = pdMCodeExample.createCriteria();
		criteria4.andParentCodeEqualTo(parentCode);
		List<PdMCode> codeList = this.pdMCodeMapper.selectByExample(pdMCodeExample);
		Map<String, String> map = new HashMap<>();
		for(PdMCode pdMCode : codeList){
			map.put(pdMCode.getCode(), pdMCode.getDelFlag());
		}
		//转归信息
		completenessSelectParameter.setTableName("outcome");
		ListResult<CompletenessReportForm> outComeList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		outComeList.getResultData().get(0).setReportProject("outcome");
		outComeList.getResultData().get(0).setReportProjectName("转归信息");
		outComeList.getResultData().get(0).setIntegrity(outComeList.getResultData().get(0).getIntegrity()+"%");
		if(outComeList.getResultData().get(0).getActualReportPeople()==null||"0".equals(outComeList.getResultData().get(0).getActualReportPeople())){
			outComeList.getResultData().get(0).setActualReportPeople("0");
			outComeList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_OUTCOME))){
			completenessReportFormList.addAll(outComeList.getResultData());
		}
		//检验检查
		ListResult<CompletenessReportForm> inspectionList = webCommonDao.selectList("WorkStationMapper.getInspectionList", completenessSelectParameter);
		//获取最近上报时间
		List<Date> dateCreateList = new ArrayList<>();
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated1());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated2());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated3());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated4());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated5());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated6());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated7());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated8());
		dateCreateList.add(inspectionList.getResultData().get(0).getDateCreated9());
		Date recentReportDate =inspectionList.getResultData().get(0).getDateCreated1();
		for(int i=1;i<dateCreateList.size();i++){
			if(dateCreateList.get(i).before(dateCreateList.get(i-1))){
				recentReportDate = dateCreateList.get(i-1);
			}else{
				recentReportDate = dateCreateList.get(i);
			}
			
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String recentReportTime = formatter.format(recentReportDate);
		inspectionList.getResultData().get(0).setRecentReportTime(recentReportTime);
		inspectionList.getResultData().get(0).setReportProject("inspection");
		inspectionList.getResultData().get(0).setReportProjectName("检验检查");
		inspectionList.getResultData().get(0).setIntegrity(inspectionList.getResultData().get(0).getIntegrity()+"%");
		if(inspectionList.getResultData().get(0).getActualReportPeople()==null||"0".equals(inspectionList.getResultData().get(0).getActualReportPeople())){
			inspectionList.getResultData().get(0).setActualReportPeople("0");
			inspectionList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_INSPECTION))){
			completenessReportFormList.addAll(inspectionList.getResultData());
		}
		
		//置管手术
		completenessSelectParameter.setTableName("tube");
		ListResult<CompletenessReportForm> tubeList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		tubeList.getResultData().get(0).setReportProject("tube");
		tubeList.getResultData().get(0).setReportProjectName("置管手术");
		tubeList.getResultData().get(0).setIntegrity(tubeList.getResultData().get(0).getIntegrity()+"%");
		if(tubeList.getResultData().get(0).getActualReportPeople()==null||"0".equals(tubeList.getResultData().get(0).getActualReportPeople())){
			tubeList.getResultData().get(0).setActualReportPeople("0");
			tubeList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_TUBE))){
			completenessReportFormList.addAll(tubeList.getResultData());
		}
		//透析方案
		completenessSelectParameter.setTableName("dialsys");
		ListResult<CompletenessReportForm> dialsysList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		dialsysList.getResultData().get(0).setReportProject("dialsys");
		dialsysList.getResultData().get(0).setReportProjectName("透析方案");
		dialsysList.getResultData().get(0).setIntegrity(dialsysList.getResultData().get(0).getIntegrity()+"%");
		if(dialsysList.getResultData().get(0).getActualReportPeople()==null||"0".equals(dialsysList.getResultData().get(0).getActualReportPeople())){
			dialsysList.getResultData().get(0).setActualReportPeople("0");
			dialsysList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_DIALSYS))){
			completenessReportFormList.addAll(dialsysList.getResultData());
		}
		//用药处方
		completenessSelectParameter.setTableName("drug");
		ListResult<CompletenessReportForm> drugList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		drugList.getResultData().get(0).setReportProject("drug");
		drugList.getResultData().get(0).setReportProjectName("用药处方");
		drugList.getResultData().get(0).setIntegrity(drugList.getResultData().get(0).getIntegrity()+"%");
		if(drugList.getResultData().get(0).getActualReportPeople()==null||"0".equals(drugList.getResultData().get(0).getActualReportPeople())){
			drugList.getResultData().get(0).setActualReportPeople("0");
			drugList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_DRUG))){
			completenessReportFormList.addAll(drugList.getResultData());
		}
		//患者随访
		completenessSelectParameter.setTableName("followup");
		ListResult<CompletenessReportForm> followupList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		followupList.getResultData().get(0).setReportProject("followup");
		followupList.getResultData().get(0).setReportProjectName("患者随访");
		followupList.getResultData().get(0).setIntegrity(followupList.getResultData().get(0).getIntegrity()+"%");
		if(followupList.getResultData().get(0).getActualReportPeople()==null||"0".equals(followupList.getResultData().get(0).getActualReportPeople())){
			followupList.getResultData().get(0).setActualReportPeople("0");
			followupList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_FOLLOWUP))){
			completenessReportFormList.addAll(followupList.getResultData());
		}
		//门诊评估
		completenessSelectParameter.setTableName("outpatient");
		ListResult<CompletenessReportForm> outpatientList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		outpatientList.getResultData().get(0).setReportProject("outpatient");
		outpatientList.getResultData().get(0).setReportProjectName("门诊评估");
		outpatientList.getResultData().get(0).setIntegrity(outpatientList.getResultData().get(0).getIntegrity()+"%");
		if(outpatientList.getResultData().get(0).getActualReportPeople()==null||"0".equals(outpatientList.getResultData().get(0).getActualReportPeople())){
			outpatientList.getResultData().get(0).setActualReportPeople("0");
			outpatientList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_OUTPATIENT))){
			completenessReportFormList.addAll(outpatientList.getResultData());
		}
		//腹透充分性
		completenessSelectParameter.setTableName("adequacy");
		ListResult<CompletenessReportForm> adequacyList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		adequacyList.getResultData().get(0).setReportProject("adequacy");
		adequacyList.getResultData().get(0).setReportProjectName("腹透充分性");
		adequacyList.getResultData().get(0).setIntegrity(adequacyList.getResultData().get(0).getIntegrity()+"%");
		if(adequacyList.getResultData().get(0).getActualReportPeople()==null||"0".equals(adequacyList.getResultData().get(0).getActualReportPeople())){
			adequacyList.getResultData().get(0).setActualReportPeople("0");
			adequacyList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_ADEQUACY))){
			completenessReportFormList.addAll(adequacyList.getResultData());
		}
		//腹透充分性
		completenessSelectParameter.setTableName("pet");
		ListResult<CompletenessReportForm> petList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		petList.getResultData().get(0).setReportProject("pet");
		petList.getResultData().get(0).setReportProjectName("腹膜平衡试验");
		petList.getResultData().get(0).setIntegrity(petList.getResultData().get(0).getIntegrity()+"%");
		if(petList.getResultData().get(0).getActualReportPeople()==null||"0".equals(petList.getResultData().get(0).getActualReportPeople())){
			petList.getResultData().get(0).setActualReportPeople("0");
			petList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_PET))){
			completenessReportFormList.addAll(petList.getResultData());
		}
		//腹透充分性
		completenessSelectParameter.setTableName("complication");
		ListResult<CompletenessReportForm> complicationList = webCommonDao.selectList("WorkStationMapper.getExportList", completenessSelectParameter);
		complicationList.getResultData().get(0).setReportProject("complication");
		complicationList.getResultData().get(0).setReportProjectName("合并症");
		complicationList.getResultData().get(0).setIntegrity(complicationList.getResultData().get(0).getIntegrity()+"%");
		if(complicationList.getResultData().get(0).getActualReportPeople()==null||"0".equals(complicationList.getResultData().get(0).getActualReportPeople())){
			complicationList.getResultData().get(0).setActualReportPeople("0");
			complicationList.getResultData().get(0).setIntegrity("0%");
		}
		if("0".equals(map.get(DATA_INTEGRITY_COMPLICATION))){
			completenessReportFormList.addAll(complicationList.getResultData());
		}
		rst.setData(completenessReportFormList);
		return rst;
	}
    

    /**
     * 获取未上报患者信息
     * @param  reportProject
     * @return UnreportedPatientForm
     */
	@Override
	public JacksonPagginListReturn<UnreportedPatientForm> getRePortPatient(String reportProject,String inspectionType) {
		JacksonPagginListReturn<UnreportedPatientForm> rst = new JacksonPagginListReturn<>();
		CompletenessSelectParameterForm completenessSelectParameterForm =getCompletenessSelectParameterForm();
		if("inspection".equals(reportProject)){
			completenessSelectParameterForm.setInspectionType(inspectionType);
		}
		completenessSelectParameterForm.setTableName(reportProject);
		ListResult<UnreportedPatientForm> complicationList = webCommonDao.selectList("WorkStationMapper.getUnexportedPatientList", completenessSelectParameterForm);
		rst.setData(complicationList.getResultData());
		return rst;
	}
	
	
	/**
     * 获取检查开始时间、检查结束时间和计算患者保有量时间
     * @param
     * @return CompletenessSelectParameterForm
     */
	private CompletenessSelectParameterForm getCompletenessSelectParameterForm(){
		String orgNo= getLoginUser().getOrgNo();
    	Date checkStartTime = new Date();
    	Date checkEndTime = new Date();
    	Date patientRetentionTime = new Date();
		String pdCenterNo = null;
		String parentNo = null;
		String qcCenterNo = null;
    	PdDCenterExample pddCenter = new PdDCenterExample();
    	PdDCenterExample.Criteria criteria = pddCenter.createCriteria();
		criteria.andOrgNoEqualTo(orgNo);
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdDCenter> qcCenterList = this.pdDCenterMapper.selectByExample(pddCenter);
		//获取透析中心编号
		if(qcCenterList.size()>0){
			pdCenterNo = qcCenterList.get(0).getPdCenterNo();
		}
		PdMOrganizationExample pdMOrganization = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria1 = pdMOrganization.createCriteria();
		criteria1.andOrgNoEqualTo(orgNo);
		criteria1.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMOrganization> pdMOrganizationList = this.pdMOrganizationMapper.selectByExample(pdMOrganization);
		//获取透析中心所属质控中心的orgNo
		if(pdMOrganizationList.size()>0){
			parentNo =pdMOrganizationList.get(0).getParentNo();
		}
		PdDQcCenterExample pddQcCenter = new PdDQcCenterExample();
    	PdDQcCenterExample.Criteria criteria2 = pddQcCenter.createCriteria();
		criteria2.andOrgNoEqualTo(parentNo);
		criteria2.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdDQcCenter> pdDQcCenterList = this.pdDQcCenterMapper.selectByExample(pddQcCenter);
		//获取透析中心所属质控中心编号
		if(pdDQcCenterList.size()>0){
			qcCenterNo = pdDQcCenterList.get(0).getQcCenterNo();
		}
		PdMCheckResultTimeExample pdMCheckResultTimeExample = new PdMCheckResultTimeExample();
		PdMCheckResultTimeExample.Criteria criteria3 = pdMCheckResultTimeExample.createCriteria();
		criteria3.andQcCenterNoEqualTo(qcCenterNo);
		criteria3.andPublishStatusEqualTo("1");
		criteria3.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMCheckResultTime> checkResultTimesList = this.pdMCheckResultTimeMapper.selectByExample(pdMCheckResultTimeExample);
		//获取检查开始时间、检查结束时间和计算患者保有量时间
		if(checkResultTimesList.size()>0){
			checkStartTime = checkResultTimesList.get(0).getCheckStartDate();
			checkEndTime = checkResultTimesList.get(0).getCheckEndDate();
			patientRetentionTime = DateUtil.addDay(checkStartTime, -90);
		}else{
			PdMCheckResultTimeExample pdMCheckResultTimeExample1 = new PdMCheckResultTimeExample();
			PdMCheckResultTimeExample.Criteria criteria4 = pdMCheckResultTimeExample1.createCriteria();
			criteria4.andQcCenterNoEqualTo(qcCenterNo);
			criteria4.andPublishStatusEqualTo("0");
			criteria4.andDelFlagEqualTo(DELETE_FLAG_0);
			List<PdMCheckResultTime> checkResultTimesList1 = this.pdMCheckResultTimeMapper.selectByExample(pdMCheckResultTimeExample1);
			if(checkResultTimesList1.size()>0){
				checkStartTime = checkResultTimesList1.get(0).getCheckStartDate();
				checkEndTime = checkResultTimesList1.get(0).getCheckEndDate();
				patientRetentionTime = DateUtil.addDay(checkStartTime, -90);
				for(int i=1;i<checkResultTimesList1.size();i++){
					if(checkResultTimesList1.get(i).getCheckStartDate().after(checkResultTimesList1.get(i-1).getCheckStartDate())){
						checkStartTime = checkResultTimesList1.get(i).getCheckStartDate();
						checkEndTime = checkResultTimesList1.get(i).getCheckEndDate();
						patientRetentionTime = DateUtil.addDay(checkStartTime, -90);
					}
				}
			}
		}
		CompletenessSelectParameterForm completenessSelectParameter = new CompletenessSelectParameterForm();
		completenessSelectParameter.setCheckStartTime(checkStartTime);
		completenessSelectParameter.setCheckEndTime(checkEndTime);
		completenessSelectParameter.setPatientRetentionTime(patientRetentionTime);
		completenessSelectParameter.setPdCenterNo(pdCenterNo);
		return completenessSelectParameter;
	}
	/**
     * 获取kpi检查率
     * @param
     * @return JacksonDataReturn
     */
	@Override
	public JacksonDataReturn<ChartForm> searchKpiExamChart(String examType,String orderBy) {
		JacksonDataReturn<ChartForm> rst = new JacksonDataReturn<>();
		String orgNo = getLoginUser().getOrgNo();
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria = pdMOrganizationExample.createCriteria();
		criteria.andOrgNoEqualTo(orgNo);
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMOrganization> pdMOrganizationList = this.pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
		if(pdMOrganizationList.size()>0){
			//如果是质控中心，获取质控中心orgNo，如果是透析中心，获取透析中心所属质控中心orgNo
			if("2".equals(pdMOrganizationList.get(0).getOrgType())){
				orgNo = pdMOrganizationList.get(0).getParentNo();
			}
		}
		CompletenessSelectParameterForm completenessSelectParameterForm = getCheckResultTimeForm(orgNo,examType);
		completenessSelectParameterForm.setOrgNo(orgNo);
		completenessSelectParameterForm.setOrderBy(orderBy);
		ListResult<EChartCodeForm> complicationList = webCommonDao.selectList("WorkStationMapper.getExaminationRate", completenessSelectParameterForm);
		ChartForm chartForm = new ChartForm();
		List<EChartCodeForm> chartList = new ArrayList<EChartCodeForm>();
		for (EChartCodeForm eChartCodeForm : complicationList.getResultData()) {
			if(eChartCodeForm.getPercentage()==null||"".equals(eChartCodeForm.getPercentage())){
				eChartCodeForm.setValue(new BigDecimal(0));
			}else{
				eChartCodeForm.setValue(new BigDecimal( eChartCodeForm.getPercentage()));
			}
			chartList.add(eChartCodeForm);
		}
		chartForm.seteChartCodeFormList(chartList);
		rst.setData(chartForm);
		return rst;
	}
	
	/**
     * 获取kpi达标率
     * @param
     * @return JacksonDataReturn
     */
	@Override
	public JacksonDataReturn<ChartForm> searchKpiStandardChart(String examType,String orderBy) {
		JacksonDataReturn<ChartForm> rst = new JacksonDataReturn<>();
		String subCode = null;
		String minValue = null;
		String maxValue = null;
		String minOperator = null;
		String maxOperator = null;
		String orgNo = getLoginUser().getOrgNo();
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria = pdMOrganizationExample.createCriteria();
		criteria.andOrgNoEqualTo(orgNo);
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMOrganization> pdMOrganizationList = this.pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
		if(pdMOrganizationList.size()>0){
			//如果是质控中心，获取质控中心orgNo，如果是透析中心，获取透析中心所属质控中心orgNo
			if("2".equals(pdMOrganizationList.get(0).getOrgType())){
				orgNo = pdMOrganizationList.get(0).getParentNo();
			}
		}
		CompletenessSelectParameterForm completenessSelectParameterForm = getCheckResultTimeForm(orgNo,examType);
		completenessSelectParameterForm.setOrgNo(orgNo);
		//判断需要查询的kpi分类
		if("hb".equals(examType)){
			subCode = "KPI_HB";
		}else if("alb".equals(examType)){
			subCode = "KPI_ALB";
		}else if("ca".equals(examType)){
			subCode = "KPI_CA";
		}else if("p".equals(examType)){
			subCode = "KPI_P";
		}else if("pth".equals(examType)){
			subCode = "KPI_PTH";
		}else if("totalKt".equals(examType)){
			subCode = "KPI_Kt/V";
		}
		//获取kpi的达标标准
		PdMKpisegExample pdMKpisegExample = new PdMKpisegExample();
		PdMKpisegExample.Criteria criteria1 = pdMKpisegExample.createCriteria();
		criteria1.andSubCodeEqualTo(subCode);
		criteria1.andSegmentCodeEqualTo("2");
		criteria1.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMKpiseg> pdMKpisegList = this.pdMKpisegMapper.selectByExample(pdMKpisegExample);
		if(pdMKpisegList.size()>0){
			if(pdMKpisegList.get(0).getMinValue() != null&&!"".equals(pdMKpisegList.get(0).getMinValue())){
				String minValues = pdMKpisegList.get(0).getMinValue();
				String operator = minValues.substring(0, 1);
				if("≥".equals(operator)){
					minOperator = "0";
				}else if(">".equals(operator)){
					minOperator = "1";
				}
				minValue = minValues.substring(1,minValues.length());
			}
			if(pdMKpisegList.get(0).getMaxValue() != null&&!"".equals(pdMKpisegList.get(0).getMaxValue())){
				String maxValues = pdMKpisegList.get(0).getMaxValue();
				String operator = maxValues.substring(0, 1);
				if("≥".equals(operator)){
					maxOperator = "0";
				}else if(">".equals(operator)){
					maxOperator = "1";
				}
				maxValue = maxValues.substring(1,maxValues.length());
			}
		}
		completenessSelectParameterForm.setMinValue(minValue);
		completenessSelectParameterForm.setMinOperator(minOperator);
		completenessSelectParameterForm.setMaxValue(maxValue);
		completenessSelectParameterForm.setMaxOperator(maxOperator);
		completenessSelectParameterForm.setOrderBy(orderBy);
		//查询kpi的达标率
		ListResult<EChartCodeForm> complicationList = webCommonDao.selectList("WorkStationMapper.getStandardRate", completenessSelectParameterForm);
		ChartForm chartForm = new ChartForm();
		List<EChartCodeForm> chartList = new ArrayList<EChartCodeForm>();
		for (EChartCodeForm eChartCodeForm : complicationList.getResultData()) {
			if(eChartCodeForm.getPercentage()==null||"".equals(eChartCodeForm.getPercentage())){
				eChartCodeForm.setValue(new BigDecimal(0));
			}else{
				eChartCodeForm.setValue(new BigDecimal( eChartCodeForm.getPercentage()));
			}
			chartList.add(eChartCodeForm);
		}
		chartForm.seteChartCodeFormList(chartList);
		rst.setData(chartForm);
		return rst;
	}
	/**
     * 获取kpi分数
     * @param
     * @return JacksonDataReturn
     */
	@Override
	public JacksonDataReturn<ChartForm> searchKpiScoreChart(String examType,String orderBy) {
		JacksonDataReturn<ChartForm> rst = new JacksonDataReturn<>();
		String subCode = null;
		String minValue = null;
		String maxValue = null;
		String minOperator = null;
		String maxOperator = null;
		String description = null;
		String orgNo = getLoginUser().getOrgNo();
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria = pdMOrganizationExample.createCriteria();
		criteria.andOrgNoEqualTo(orgNo);
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMOrganization> pdMOrganizationList = this.pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
		if(pdMOrganizationList.size()>0){
			//如果是质控中心，获取质控中心orgNo，如果是透析中心，获取透析中心所属质控中心orgNo
			if("2".equals(pdMOrganizationList.get(0).getOrgType())){
				orgNo = pdMOrganizationList.get(0).getParentNo();
			}
		}
		CompletenessSelectParameterForm completenessSelectParameterForm = getCheckResultTimeForm(orgNo,examType);
		completenessSelectParameterForm.setOrgNo(orgNo);
		//判断需要查询的kpi分类
		if("hb".equals(examType)){
			subCode = "KPI_HB";
		}else if("alb".equals(examType)){
			subCode = "KPI_ALB";
		}else if("ca".equals(examType)){
			subCode = "KPI_CA";
		}else if("p".equals(examType)){
			subCode = "KPI_P";
		}else if("pth".equals(examType)){
			subCode = "KPI_PTH";
		}else if("totalKt".equals(examType)){
			subCode = "KPI_Kt/V";
		}
		//获取kpi的达标标准
		PdMKpisegExample pdMKpisegExample = new PdMKpisegExample();
		PdMKpisegExample.Criteria criteria1 = pdMKpisegExample.createCriteria();
		criteria1.andSubCodeEqualTo(subCode);
		criteria1.andSegmentCodeEqualTo("2");
		criteria1.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMKpiseg> pdMKpisegList = this.pdMKpisegMapper.selectByExample(pdMKpisegExample);
		if(pdMKpisegList.size()>0){
			if(pdMKpisegList.get(0).getMinValue() != null&&!"".equals(pdMKpisegList.get(0).getMinValue())){
				String minValues = pdMKpisegList.get(0).getMinValue();
				String operator = minValues.substring(0, 1);
				if("≥".equals(operator)){
					minOperator = "0";
				}else if(">".equals(operator)){
					minOperator = "1";
				}
				minValue = minValues.substring(1,minValues.length());
			}
			if(pdMKpisegList.get(0).getMaxValue() != null&&!"".equals(pdMKpisegList.get(0).getMaxValue())){
				String maxValues = pdMKpisegList.get(0).getMaxValue();
				String operator = maxValues.substring(0, 1);
				if("≥".equals(operator)){
					maxOperator = "0";
				}else if(">".equals(operator)){
					maxOperator = "1";
				}
				maxValue = maxValues.substring(1,maxValues.length());
			}
		}
		//获取kpi的达标的权重
		PdMCodeExample pdMCodeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria2 = pdMCodeExample.createCriteria();
		criteria2.andParentCodeEqualTo("KPI_ITEM");
		criteria2.andCodeEqualTo(subCode);
		criteria2.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMCode> pdMCodeList = this.pdMCodeMapper.selectByExample(pdMCodeExample);
		if(pdMCodeList.size()>0){
			description = pdMCodeList.get(0).getDescription();
		}
		completenessSelectParameterForm.setMinValue(minValue);
		completenessSelectParameterForm.setMinOperator(minOperator);
		completenessSelectParameterForm.setMaxValue(maxValue);
		completenessSelectParameterForm.setMaxOperator(maxOperator);
		completenessSelectParameterForm.setDescription(description);
		completenessSelectParameterForm.setOrderBy(orderBy);
		//查询kpi的分数
				ListResult<EChartCodeForm> complicationList = webCommonDao.selectList("WorkStationMapper.getFraction", completenessSelectParameterForm);
				ChartForm chartForm = new ChartForm();
				List<EChartCodeForm> chartList = new ArrayList<EChartCodeForm>();
				for (EChartCodeForm eChartCodeForm : complicationList.getResultData()) {
					if(eChartCodeForm.getPercentage()==null||"".equals(eChartCodeForm.getPercentage())){
						eChartCodeForm.setValue(new BigDecimal(0));
					}else{
						eChartCodeForm.setValue(new BigDecimal( eChartCodeForm.getPercentage()));
					}
					chartList.add(eChartCodeForm);
				}
				chartForm.seteChartCodeFormList(chartList);
				rst.setData(chartForm);
		return rst;
	}
	
	/**
     * 获取登陆者的检查时间数据
     * @param  orgNo  examType
     * @return CompletenessSelectParameterForm
     */
	private CompletenessSelectParameterForm getCheckResultTimeForm(String orgNo,String examType){
		Date checkStartTime = new Date();
    	Date checkEndTime = new Date();
    	Date patientRetentionTime = new Date();
    	String qcCenterNo = null;
    	PdDQcCenterExample pddQcCenter = new PdDQcCenterExample();
    	PdDQcCenterExample.Criteria criteria2 = pddQcCenter.createCriteria();
		criteria2.andOrgNoEqualTo(orgNo);
		criteria2.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdDQcCenter> pdDQcCenterList = this.pdDQcCenterMapper.selectByExample(pddQcCenter);
		//获取透析中心所属质控中心编号
		if(pdDQcCenterList.size()>0){
			qcCenterNo = pdDQcCenterList.get(0).getQcCenterNo();
		}
		PdMCheckResultTimeExample pdMCheckResultTimeExample = new PdMCheckResultTimeExample();
		PdMCheckResultTimeExample.Criteria criteria3 = pdMCheckResultTimeExample.createCriteria();
		criteria3.andQcCenterNoEqualTo(qcCenterNo);
		criteria3.andPublishStatusEqualTo("1");
		criteria3.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMCheckResultTime> checkResultTimesList = this.pdMCheckResultTimeMapper.selectByExample(pdMCheckResultTimeExample);
		//获取检查开始时间、检查结束时间和计算患者保有量时间
		if(checkResultTimesList.size()>0){
			checkStartTime = checkResultTimesList.get(0).getCheckStartDate();
			checkEndTime = checkResultTimesList.get(0).getCheckEndDate();
			patientRetentionTime = DateUtil.addDay(checkStartTime, -90);
		}else{
			PdMCheckResultTimeExample pdMCheckResultTimeExample1 = new PdMCheckResultTimeExample();
			PdMCheckResultTimeExample.Criteria criteria4 = pdMCheckResultTimeExample1.createCriteria();
			criteria4.andQcCenterNoEqualTo(qcCenterNo);
			criteria4.andPublishStatusEqualTo("0");
			criteria4.andDelFlagEqualTo(DELETE_FLAG_0);
			List<PdMCheckResultTime> checkResultTimesList1 = this.pdMCheckResultTimeMapper.selectByExample(pdMCheckResultTimeExample1);
			if(checkResultTimesList1.size()>0){
				checkStartTime = checkResultTimesList1.get(0).getCheckStartDate();
				checkEndTime = checkResultTimesList1.get(0).getCheckEndDate();
				patientRetentionTime = DateUtil.addDay(checkStartTime, -90);
				for(int i=1;i<checkResultTimesList1.size();i++){
					if(checkResultTimesList1.get(i).getCheckStartDate().after(checkResultTimesList1.get(i-1).getCheckStartDate())){
						checkStartTime = checkResultTimesList1.get(i).getCheckStartDate();
						checkEndTime = checkResultTimesList1.get(i).getCheckEndDate();
						patientRetentionTime = DateUtil.addDay(checkStartTime, -90);
					}
				}
			}
		}
		CompletenessSelectParameterForm completenessSelectParameter = new CompletenessSelectParameterForm();
		completenessSelectParameter.setCheckStartTime(checkStartTime);
		completenessSelectParameter.setCheckEndTime(checkEndTime);
		completenessSelectParameter.setPatientRetentionTime(patientRetentionTime);
		completenessSelectParameter.setExamType(examType);
		return completenessSelectParameter;
		
	}
	/**
     * 导出数据
     * @param
     * @return JacksonDataReturn
     */
	@Override
	public JacksonReturn dataExport(String examType) {
		JacksonDataReturn<ChartForm> rst = new JacksonDataReturn<>();
		String subCode = null;
		String minValue = null;
		String maxValue = null;
		String minOperator = null;
		String maxOperator = null;
		String description = null;
		String orgNo = getLoginUser().getOrgNo();
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria = pdMOrganizationExample.createCriteria();
		criteria.andOrgNoEqualTo(orgNo);
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMOrganization> pdMOrganizationList = this.pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
		if(pdMOrganizationList.size()>0){
			//如果是质控中心，获取质控中心orgNo，如果是透析中心，获取透析中心所属质控中心orgNo
			if("2".equals(pdMOrganizationList.get(0).getOrgType())){
				orgNo = pdMOrganizationList.get(0).getParentNo();
			}
		}
		CompletenessSelectParameterForm completenessSelectParameterForm = getCheckResultTimeForm(orgNo,examType);
		completenessSelectParameterForm.setOrgNo(orgNo);
		//判断需要查询的kpi分类
		if("hb".equals(examType)){
			subCode = "KPI_HB";
		}else if("alb".equals(examType)){
			subCode = "KPI_ALB";
		}else if("ca".equals(examType)){
			subCode = "KPI_CA";
		}else if("p".equals(examType)){
			subCode = "KPI_P";
		}else if("pth".equals(examType)){
			subCode = "KPI_PTH";
		}else if("totalKt".equals(examType)){
			subCode = "KPI_Kt/V";
		}
		//获取kpi的达标标准
		PdMKpisegExample pdMKpisegExample = new PdMKpisegExample();
		PdMKpisegExample.Criteria criteria1 = pdMKpisegExample.createCriteria();
		criteria1.andSubCodeEqualTo(subCode);
		criteria1.andSegmentCodeEqualTo("2");
		criteria1.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMKpiseg> pdMKpisegList = this.pdMKpisegMapper.selectByExample(pdMKpisegExample);
		if(pdMKpisegList.size()>0){
			if(pdMKpisegList.get(0).getMinValue() != null&&!"".equals(pdMKpisegList.get(0).getMinValue())){
				String minValues = pdMKpisegList.get(0).getMinValue();
				String operator = minValues.substring(0, 1);
				if("≥".equals(operator)){
					minOperator = "0";
				}else if(">".equals(operator)){
					minOperator = "1";
				}
				minValue = minValues.substring(1,minValues.length());
			}
			if(pdMKpisegList.get(0).getMaxValue() != null&&!"".equals(pdMKpisegList.get(0).getMaxValue())){
				String maxValues = pdMKpisegList.get(0).getMaxValue();
				String operator = maxValues.substring(0, 1);
				if("≥".equals(operator)){
					maxOperator = "0";
				}else if(">".equals(operator)){
					maxOperator = "1";
				}
				maxValue = maxValues.substring(1,maxValues.length());
			}
		}
		//获取kpi的达标的权重
		PdMCodeExample pdMCodeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria2 = pdMCodeExample.createCriteria();
		criteria2.andParentCodeEqualTo("KPI_ITEM");
		criteria2.andCodeEqualTo(subCode);
		criteria2.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMCode> pdMCodeList = this.pdMCodeMapper.selectByExample(pdMCodeExample);
		if(pdMCodeList.size()>0){
			description = pdMCodeList.get(0).getDescription();
		}
		completenessSelectParameterForm.setMinValue(minValue);
		completenessSelectParameterForm.setMinOperator(minOperator);
		completenessSelectParameterForm.setMaxValue(maxValue);
		completenessSelectParameterForm.setMaxOperator(maxOperator);
		completenessSelectParameterForm.setDescription(description);
		completenessSelectParameterForm.setOrderBy("0");
		//查询kpi的分数
		ListResult<EChartCodeForm> complicationList = webCommonDao.selectList("WorkStationMapper.getFraction", completenessSelectParameterForm);
		// 标题行
		if("totalKt".equals(examType)){
			examType = "腹透充分性";
		}
        String[] title = { "透析中心编号", "透析中心名称", examType + "得分", examType + "检查率（%）", examType + "达标率（%）" };
        // 保存结果
        List<String> list = new ArrayList<>();
        // 时间格式
        String format = "yyyy/MM/dd";
        // 文件名
        String fileName = null;
        if(complicationList.getResultData().size()>0){
        	for(EChartCodeForm eChartCodeForm : complicationList.getResultData()){
        		//透析中心编号
        		list.add(eChartCodeForm.getOrgIndex());
        		//透析中心名称
        		list.add(eChartCodeForm.getName());
        		//得分
        		if (!Tools.isblank(eChartCodeForm.getPercentage())) {
        			list.add(eChartCodeForm.getPercentage());
        		}else{
        			list.add("");
        		}
        		//检查率
        		if (!Tools.isblank(eChartCodeForm.getExaminationRate())) {
        			list.add(eChartCodeForm.getExaminationRate());
        		}else{
        			list.add("");
        		}
        		//达标率
        		if (!Tools.isblank(eChartCodeForm.getStandardRate())) {
        			list.add(eChartCodeForm.getStandardRate());
        		}else{
        			list.add("");
        		}
        	}
        }
     // 操作执行
        try {

            // // 用时间命名导出数据名称
            // String dateFormat = new java.text.SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            // fileName = "d:\\患者血管通路信息" + dateFormat + ".xls";

            String dateFormat = new java.text.SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            String filePath = "D:\\fileUpload";
            File file1 = new File(filePath);
            // 判断上传文件的保存目录是否存在
            if (!file1.exists() && !file1.isDirectory()) {
                System.out.println(filePath + "目录不存在，需要创建");
                // 创建目录
                file1.mkdirs();
            }
            fileName = filePath + "\\" + examType + "信息" + dateFormat + ".xls";

            // 创建Excel文档 工作簿
            WritableWorkbook book = Workbook.createWorkbook(new File(fileName));

            // 生成名为“第一页”的工作表，参数0表示这是第一页 创建工作表
            WritableSheet sheet = book.createSheet(examType + "信息", 0);

            // 设置单元格的文字格式
            WritableFont wf = new WritableFont(WritableFont.ARIAL, 12, WritableFont.NO_BOLD, false,
                    UnderlineStyle.NO_UNDERLINE, Colour.BLUE);
            // 创建标题单元格格式
            WritableCellFormat twcf = new WritableCellFormat(wf);

            // 背景颜色设置为"某种"色
            twcf.setBackground(Colour.YELLOW);

            // 设置居中
            twcf.setAlignment(Alignment.CENTRE);

            // 自动设置自动换行
            // twcf.setWrap(true);

            // 创建普通单元格格式
            WritableCellFormat wcf = new WritableCellFormat();

            // 设置居中
            wcf.setAlignment(Alignment.CENTRE);

            // 自动设置自动换行
            // wcf.setWrap(true);

            // 写入标题
            for (int i = 0; i < title.length; i++) {
                // Label 的参数分别是单元格 列，单元格行，单元格内容，单元格格式
                sheet.addCell(new Label(i, 0, title[i], twcf));
            }

            // list 迭代器
            Iterator<String> iter = list.iterator();

            // 循环写入内容
            for (int i = 0; i <= complicationList.getResultData().size(); i++) {

                for (int j = 0; j < title.length ; j++) {
                    if (iter.hasNext()) {
                        // 向单元格中写内容
                        sheet.addCell(new Label(j, i + 1, (String) iter.next(), wcf));
                    }
                }
            }
            // 写入数据
            book.write();
            // 关闭文件
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO Auto-generated method stub
        // 返回结果
        JacksonReturn rstCount = new JacksonReturn();

        rstCount.setRetMsg(fileName);

        return rstCount;
	}
}
