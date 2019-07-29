package com.ustcsoft.pdqc.web.patient.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.mybatis.paging.Paging;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientComplicationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDialsysSolutionMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDialysisAdequacyMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDrugTakenMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientFollowupMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionBiochemicalMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionBloodCoagulationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionChestXRayMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionElectrocardiogramMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionInfectionDiseasesMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRenalBUltrasoundMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRoutineBloodMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRoutineStoolMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRoutineUrineMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientOutcomeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientOutpatientEvaluationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientPetMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientTubeOperationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCodeMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientComplication;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientComplicationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialsysSolution;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialsysSolutionExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialysisAdequacy;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDrugTaken;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDrugTakenExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientFollowup;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientFollowupExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBiochemical;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBiochemicalExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBloodCoagulation;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBloodCoagulationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionChestXRay;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionChestXRayExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionElectrocardiogram;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionElectrocardiogramExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionInfectionDiseases;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionInfectionDiseasesExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRenalBUltrasound;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRenalBUltrasoundExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineBlood;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineBloodExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineStool;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineStoolExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineUrine;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineUrineExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutcome;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutpatientEvaluation;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientPet;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientPetExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientTubeOperation;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientTubeOperationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCode;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCodeExample;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.patient.form.BalanceExperimentForm;
import com.ustcsoft.pdqc.web.patient.form.BalanceExperimentListForm;
import com.ustcsoft.pdqc.web.patient.form.CatheterOperationReportForm;
import com.ustcsoft.pdqc.web.patient.form.ComplicationForm;
import com.ustcsoft.pdqc.web.patient.form.ComplicationPictureForm;
import com.ustcsoft.pdqc.web.patient.form.DialysisSolutionForm;
import com.ustcsoft.pdqc.web.patient.form.DialysisSolutionListForm;
import com.ustcsoft.pdqc.web.patient.form.FollowUpSolutionForm;
import com.ustcsoft.pdqc.web.patient.form.InspectionCheckForm;
import com.ustcsoft.pdqc.web.patient.form.InspectionCheckListForm;
import com.ustcsoft.pdqc.web.patient.form.MedicationCondForm;
import com.ustcsoft.pdqc.web.patient.form.MedicationResultForm;
import com.ustcsoft.pdqc.web.patient.form.PatientEvalRstForm;
import com.ustcsoft.pdqc.web.patient.form.PatientForm;
import com.ustcsoft.pdqc.web.patient.form.PatientOutComeCondForm;
import com.ustcsoft.pdqc.web.patient.form.PatientOutComeRstForm;
import com.ustcsoft.pdqc.web.patient.form.PatientPeritonealDialysisRstForm;
import com.ustcsoft.pdqc.web.patient.form.PatientRstForm;
import com.ustcsoft.pdqc.web.patient.service.PatientOverViewService;

@Service
public class PatientOverViewServiceImpl extends WebBaseServiceImpl implements PatientOverViewService{
	
    @Autowired
    WebCommonDao webCommonDao;
	
	@Autowired
	private PdMCodeMapper pdMCodeMapper;
	
	@Autowired
	private PdDPatientOutcomeMapper pdDPatientOutcomeMapper;
	
	@Autowired
	private PdDPatientOutpatientEvaluationMapper pdDPatientOutpatientEvaluationMapper;
	
	@Autowired
	private PdDPatientFollowupMapper pdDPatientFollowupMapper;
	
	@Autowired
	private PdDPatientTubeOperationMapper pdDPatientTubeOperationMapper;
	
	@Autowired
    private PdDPatientDialsysSolutionMapper pdDPatientDialsysSolutionMapper;
    
	@Autowired
    private PdDPatientPetMapper pdDPatientPetMapper;
    
    @Autowired
    private PdDPatientComplicationMapper pdDPatientComplicationMapper;
    
	@Autowired
	private PdDPatientDrugTakenMapper pdDPatientDrugTakenMapper;
	
	@Autowired
	private PdDPatientInspectionRoutineBloodMapper pdDPatientInspectionRoutineBloodMapper;
	
	@Autowired
	private PdDPatientInspectionBiochemicalMapper  pdDPatientInspectionBiochemicalMapper;
	
	@Autowired
	private PdDPatientInspectionBloodCoagulationMapper pdDPatientInspectionBloodCoagulationMapper;
	
	@Autowired
	private PdDPatientInspectionInfectionDiseasesMapper pdDPatientInspectionInfectionDiseasesMapper;
	
	@Autowired
	private PdDPatientInspectionRoutineUrineMapper pdDPatientInspectionRoutineUrineMapper;
	
	@Autowired
	private PdDPatientInspectionRoutineStoolMapper pdDPatientInspectionRoutineStoolMapper;
	
	@Autowired
	private PdDPatientInspectionRenalBUltrasoundMapper pdDPatientInspectionRenalBUltrasoundMapper;
	
	@Autowired
	private PdDPatientInspectionChestXRayMapper pdDPatientInspectionChestXRayMapper;
	
	@Autowired
	private PdDPatientInspectionElectrocardiogramMapper pdDPatientInspectionElectrocardiogramMapper;
	
	@Autowired
	private PdDPatientDialysisAdequacyMapper pdDPatientDialysisAdequacyMapper;
	
	@Override
	public List<PdMCode> getPatientViewCodes() {
		PdMCodeExample codeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria = codeExample.createCriteria();
		criteria.andDelFlagEqualTo("0");
		criteria.andParentCodeEqualTo("XX-TYPE");
		List<PdMCode> mCodes = this.pdMCodeMapper.selectByExample(codeExample);
		return mCodes;
	}

	@Override
	public JacksonPagginListReturn<PatientRstForm> getPatientData(PatientForm condform) {
		JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
		int pagecount = getWebCommonDao().selectList("PatientListMapper.getPatientData", condform).getResultData().size();
		double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getPatientData", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
		return returnList;
	}

	@Override
	public JacksonPagginListReturn<PatientOutComeRstForm> searchChildOutcome(PatientForm form) {
		JacksonPagginListReturn<PatientOutComeRstForm> returnList = new JacksonPagginListReturn<PatientOutComeRstForm>();
		if(Tools.isblank(form.getPatientId())){
			return returnList;
		}
		ListResult<PatientOutComeRstForm> patientOutComeRstForms=getWebCommonDao()
				.selectList("PatientListMapper.getOutComes", form);
		returnList.setData(patientOutComeRstForms.getResultData());
		return returnList;
	}

	@Override
	public List<Code> getPdMCodeByParentCode(String parentCode) {
		PdMCodeExample codeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria = codeExample.createCriteria();
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		criteria.andParentCodeEqualTo(parentCode);
		criteria.andCodeNotEqualTo("CONTROLTYPE");
		List<PdMCode> mCodes = this.pdMCodeMapper.selectByExample(codeExample);
		List<Code> codes = new ArrayList<>();
		for(PdMCode code : mCodes){
			Code code1 = new Code();
			code1.setText(code.getValue());
			code1.setValue(code.getCode());
			codes.add(code1);
		}
		return codes;
	}
	
	/**
	 * 置管手术患者列表
	 * 
	 */
	@Override
	public JacksonPagginListReturn<PatientRstForm> getCatheterOperationPatient(PatientForm condform) {
		JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
		int pagecount = getWebCommonDao().selectList("PatientListMapper.getCatheterOperationPatient", condform).getResultData().size();
		double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getCatheterOperationPatient", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
		return returnList;
	}
	
	/**
	 * 置管手术列表
	 * 
	 */
	@Override
	public JacksonPagginListReturn<PatientOutComeRstForm> catheterOperation(PatientForm form) {
		JacksonPagginListReturn<PatientOutComeRstForm> returnList = new JacksonPagginListReturn<PatientOutComeRstForm>();
		ListResult<PatientOutComeRstForm> patientOutComeRstForms=getWebCommonDao()
				.selectList("PatientListMapper.catheterOperation", form);
		returnList.setData(patientOutComeRstForms.getResultData());
		return returnList;
	}

	@Override
	public JacksonCountReturn saveOutcome(PatientOutComeCondForm condition) {
		JacksonCountReturn ret = new JacksonCountReturn();
		PdDPatientOutcome outcome = new PdDPatientOutcome();
		Date now = new Date();
        int successCount = 0;
        String outComeType = condition.getOutComeType();
        String reason = "";
        //拼接字符串
        if(outComeType.equals("PD_OUT_2")){//退出
        	//退出原因
        	String exitType = condition.getExitType();
        	if(Tools.isblank(exitType)){
        		reason="PD_OUT_2:null";
        	}else{
        		if(exitType.equals("PD_OUT_2_5")){//退出其它
            		String exitPatientOther = condition.getExitPatientOther();
            		if(Tools.isblank(exitPatientOther)){
            			reason="PD_OUT_2:PD_OUT_2_5,"+"PD_OUT_2_5:null";
            		}else{
            			reason="PD_OUT_2:PD_OUT_2_5,"+"PD_OUT_2_5:"+condition.getExitPatientOther();
            		}
            		
            	}else{
            		reason="PD_OUT_2:"+exitType;
            	}
        	}
        	
        }else if(outComeType.equals("PD_OUT_3")){//死亡
        	String deathReason = condition.getDeathReason();
        	if(Tools.isblank(deathReason)){
        		reason="PD_OUT_3:null";
        	}else{
        		if(deathReason.equals("PD_OUT_3_5")){//死亡其它
        			if(Tools.isblank(condition.getDeathOther())){
        				reason="PD_OUT_3:PD_OUT_3_5,"+"PD_OUT_3_5:null";
        			}else{
        				reason="PD_OUT_3:PD_OUT_3_5,"+"PD_OUT_3_5:"+condition.getDeathOther();
        			}
            	}else if(deathReason.equals("PD_OUT_3_1")){//心血管事件
            		String cardiovascular=condition.getCardiovascular();
            		if(Tools.isblank(cardiovascular)){
            			reason="PD_OUT_3:PD_OUT_3_1,PD_OUT_3_1:null";
            		}else{
            			if(cardiovascular.equals("PD_OUT_3_1_4")){//心血管事件(其它)
            				String cardiovascularOther=condition.getCardiovascularOther();
            				if(Tools.isblank(cardiovascularOther)){
            					reason="PD_OUT_3:PD_OUT_3_1,PD_OUT_3_1:PD_OUT_3_1_4,PD_OUT_3_1_4:null";
            				}else{
            					reason="PD_OUT_3:PD_OUT_3_1,PD_OUT_3_1:PD_OUT_3_1_4,PD_OUT_3_1_4:"+cardiovascularOther;
            				}
            			}else{
            				reason="PD_OUT_3:PD_OUT_3_1,PD_OUT_3_1:"+cardiovascular;
            			}
            			
            		}
            		
            	}else if(deathReason.equals("PD_OUT_3_2")){//脑血管事件
            		String cerebrovascular = condition.getCerebrovascular();
            		if(Tools.isblank(cerebrovascular)){
            			reason="PD_OUT_3:PD_OUT_3_2,PD_OUT_3_2:null";
            		}else{
            			if(cerebrovascular.equals("PD_OUT_3_2_3")){//脑血管事件(其它)
            				String cerebrovascularOther=condition.getCerebrovascularOther();
            				if(Tools.isblank(cerebrovascularOther)){
            					reason="PD_OUT_3:PD_OUT_3_2,PD_OUT_3_2:PD_OUT_3_2_3,PD_OUT_3_2_3:null";
            				}else{
            					reason="PD_OUT_3:PD_OUT_3_2,PD_OUT_3_2:PD_OUT_3_2_3,PD_OUT_3_2_3:"+cerebrovascularOther;
            				}
                		}else{
                			reason="PD_OUT_3:PD_OUT_3_2,PD_OUT_3_2:"+cerebrovascular;
                		}
            		}
            		
            	}else if(deathReason.equals("PD_OUT_3_3")){//感染事件
            		String infected = condition.getInfected();
            		if(Tools.isblank(infected)){
            			reason="PD_OUT_3:PD_OUT_3_3,PD_OUT_3_3:null";
            		}else{
            			if(infected.equals("PD_OUT_3_3_5")){//感染事件(其它)
            				String infectedReasonOther=condition.getInfectedReasonOther();
            				if(Tools.isblank(infectedReasonOther)){
            					reason="PD_OUT_3:PD_OUT_3_3,PD_OUT_3_3:PD_OUT_3_3_5,PD_OUT_3_3_5:null";
            				}else{
            					reason="PD_OUT_3:PD_OUT_3_3,PD_OUT_3_3:PD_OUT_3_3_5,PD_OUT_3_3_5:"+infectedReasonOther;
            				}
                		}else{
                			reason="PD_OUT_3:PD_OUT_3_3,PD_OUT_3_3:"+infected;
                		}
            		}
            		
            	}else if(deathReason.equals("PD_OUT_3_4")){//消化道出血等出血性疾病
            		reason="PD_OUT_3:PD_OUT_3_4";
            	}
        	}
        	
        }else if(outComeType.equals("PD_OUT_4")){//转出
        	//转出地点
        	String turnOverPlace=condition.getTurnOverPlace();
        	if(Tools.isblank(turnOverPlace)){
        		turnOverPlace="null";
        	}
        	//转出原因
        	String turnOverReason = condition.getTurnOverReason();
        	if(Tools.isblank(turnOverReason)){
        		turnOverReason="null";
        	}else{
        		if(turnOverReason.equals("PD_OUT_4_2_4")){//转出原因(其它)
        			if(Tools.isblank(condition.getTurnOverPatientOther())){
        				reason="PD_OUT_4:"+turnOverPlace+",PD_OUT_4:PD_OUT_4_2_4,"+"PD_OUT_4_2_4:null";
        			}else{
        				reason="PD_OUT_4:"+turnOverPlace+",PD_OUT_4:PD_OUT_4_2_4,"+"PD_OUT_4_2_4:"+condition.getTurnOverPatientOther();
        			}
        		}else{
        			reason="PD_OUT_4:"+turnOverPlace+",PD_OUT_4:"+turnOverReason;
        		}
        	}
        	
        }
        //新增
        if(Tools.isblank(condition.getId())){
        	String id = Tools.getFifteenUUID();
        	outcome.setId(id);
        	outcome.setHpId(condition.getHpId());
        	outcome.setPtId(condition.getPatientId());
        	Date outComeDate = DateUtil.convertStringToDate(condition.getOutComeDate());
        	outcome.setTdate(outComeDate);
        	outcome.setOutcomeType(condition.getOutComeType());
        	outcome.setReason(reason);
        	outcome.setDelFlag(DELETE_FLAG_0);
        	outcome.setCreatedBy(getLoginUser().getUserNo());
        	outcome.setDateCreated(now);
        	outcome.setModifiedBy(getLoginUser().getUserNo());
        	outcome.setDateModified(now);
        	successCount = this.pdDPatientOutcomeMapper.insert(outcome);
        	if (successCount == 0) {
                ret.setRetMsg("新增转归项目失败！");
            } else {
            	ret.setRetMsg("新增转归项目成功！");
            }
        }else{
        	outcome.setId(condition.getId());
        	Date outComeDate = DateUtil.convertStringToDate(condition.getOutComeDate());
        	outcome.setTdate(outComeDate);
        	outcome.setOutcomeType(condition.getOutComeType());
        	outcome.setReason(reason);
        	outcome.setModifiedBy(getLoginUser().getUserNo());
        	outcome.setDateModified(now);
        	successCount = this.pdDPatientOutcomeMapper.updateByPrimaryKeySelective(outcome);
        	if(successCount == 0){
        		ret.setRetMsg("修改转归项目失败！");
        	}else{
        		ret.setRetMsg("修改转归项目成功！");
        	}
        }
        ret.setSuccessCount(successCount);
		return ret;
	}

	

	/**
     * 获得用药处方患者列表
     * @param form
     * @return
     */
	public JacksonPagginListReturn<PatientRstForm> getMedicationPatient(PatientForm condForm) {
	    JacksonPagginListReturn<PatientRstForm> result = new JacksonPagginListReturn<PatientRstForm>();
        ListResult<PatientRstForm> roleCountList = webCommonDao.selectList("PatientListMapper.getMedicationPatient", condForm);
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
        // 获得用药处方列表
        ListResult<PatientRstForm> roleList = webCommonDao.selectPaging("PatientListMapper.getMedicationPatient",
                condForm,new Paging(condForm.getPageNumber(), condForm.getPageSize()));
        result.setData(roleList.getResultData());
        result.setPageNumber(condForm.getPageNumber());
        result.setPageCount(pagecount);
        result.setTotalCount(pagecount);
        return result;
	}
	
	/**
     * 获得用药处方列表
     * @param form
     * @return
     */
	@Override
    public JacksonPagginListReturn<MedicationResultForm> getMedicationList(MedicationCondForm condForm){
        JacksonPagginListReturn<MedicationResultForm> result = new JacksonPagginListReturn<MedicationResultForm>();
        ListResult<MedicationResultForm> roleCountList = webCommonDao.selectList("PatientListMapper.getMedicationList", condForm);
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
        // 获得用药处方列表
        ListResult<MedicationResultForm> roleList = webCommonDao.selectPaging("PatientListMapper.getMedicationList",
                condForm,new Paging(condForm.getPageNumber(), condForm.getPageSize()));
        result.setData(roleList.getResultData());
        result.setPageNumber(condForm.getPageNumber());
        result.setPageCount(pagecount);
        result.setTotalCount(pagecount);
        return result;
    }


	/**
     * 改变type选项获取type2下拉框的值
     * @return
     */
	@Override
	public JacksonReturn changeSelectPickerType(String supperType) {
	    JacksonListReturn<Code> result = new JacksonListReturn<>();
	    // 下拉框列表
        List<Code> codeList = new ArrayList<Code>();
        // 放入一个空选项
        Code emptyCode = new Code();
        emptyCode.setText("");
        emptyCode.setValue("");
        codeList.add(emptyCode);
	    if (!Tools.isblank(supperType)) {
	        // 从数据库中获取type记录
	        PdMCodeExample pdMCodeExample = new PdMCodeExample();
	        PdMCodeExample.Criteria pdMCodeCriteria = pdMCodeExample.createCriteria();
	        pdMCodeCriteria.andParentCodeEqualTo(supperType);
	        pdMCodeCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
	        List<PdMCode> pdMCodeList = pdMCodeMapper.selectByExample(pdMCodeExample);
	        if (!Tools.listisblank(pdMCodeList)) {
	            // 将查询出的list放入下拉框列表中
	            for (PdMCode pdMCode : pdMCodeList) {
	                Code code = new Code();
	                code.setText(pdMCode.getValue());
	                code.setValue(pdMCode.getCode());
	                codeList.add(code);
	            }
	        }
	    }
	    result.setData(codeList);
	    return result;
	}
	
	/**
     * 保存用药处方
     * @param medicationResultForm
     * @return
     */
	@Override
    public JacksonCountReturn saveMedication(MedicationResultForm medicationResultForm) {
	    JacksonCountReturn result = new JacksonCountReturn();
	    Date nowDate = new Date();
	    int successCount = 0;
	    // 将String类型日期转为Date
	    medicationResultForm.setTdate(DateUtil.convertStringToDate(medicationResultForm.getTdateStr()));
	    // 当id为空时新增 不为空时更新
	    if (!Tools.isblank(medicationResultForm.getId())) {
	        // 找出数据库中对应的记录
	        PdDPatientDrugTakenExample pdDPatientDrugTakenExample = new PdDPatientDrugTakenExample();
	        PdDPatientDrugTakenExample.Criteria pdDPatientDrugTakenCriteria = pdDPatientDrugTakenExample.createCriteria();
	        pdDPatientDrugTakenCriteria.andIdEqualTo(medicationResultForm.getId());
	        pdDPatientDrugTakenCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
	        List<PdDPatientDrugTaken> pdDPatientDrugTakenList = pdDPatientDrugTakenMapper.selectByExample(pdDPatientDrugTakenExample);
	        if (!Tools.listisblank(pdDPatientDrugTakenList)) {
	            PdDPatientDrugTaken pdDPatientDrugTaken = pdDPatientDrugTakenList.get(0);
	            pdDPatientDrugTaken.setDateModified(nowDate);
	            pdDPatientDrugTaken.setModifiedBy(getLoginUser().getUserNo());
	            // 将页面上设置的值赋予查询的记录
	            pdDPatientDrugTaken.setPtId(medicationResultForm.getPtId());
	            pdDPatientDrugTaken.setHpId(medicationResultForm.getHpId());
	            pdDPatientDrugTaken.setTdate(medicationResultForm.getTdate());
	            pdDPatientDrugTaken.setType(medicationResultForm.getType());
	            pdDPatientDrugTaken.setType2(medicationResultForm.getType2());
	            pdDPatientDrugTaken.setType3(medicationResultForm.getType3());
	            pdDPatientDrugTaken.setDrugName(medicationResultForm.getDrugName());
	            pdDPatientDrugTaken.setFrequency(medicationResultForm.getFrequency());
	            pdDPatientDrugTaken.setMethod(medicationResultForm.getMethod());
	            pdDPatientDrugTaken.setSingleDose(medicationResultForm.getSingleDose());
	            pdDPatientDrugTaken.setUnitName(medicationResultForm.getUnitName());
	            pdDPatientDrugTaken.setRowVersion(pdDPatientDrugTaken.getRowVersion()+1);
	            successCount = pdDPatientDrugTakenMapper.updateByExample(pdDPatientDrugTaken, pdDPatientDrugTakenExample);
	        }
	    } else {
	        PdDPatientDrugTaken pdDPatientDrugTaken = new PdDPatientDrugTaken();
	        BeanUtils.copyProperties(medicationResultForm, pdDPatientDrugTaken);
	        pdDPatientDrugTaken.setId(Tools.getFifteenUUID());
	        pdDPatientDrugTaken.setDateCreated(nowDate);
	        pdDPatientDrugTaken.setCreatedBy(getLoginUser().getUserNo());
	        pdDPatientDrugTaken.setDateModified(nowDate);
	        pdDPatientDrugTaken.setModifiedBy(getLoginUser().getUserNo());
	        pdDPatientDrugTaken.setDelFlag(DELETE_FLAG_0);
	        pdDPatientDrugTaken.setRowVersion(0);
	        successCount = pdDPatientDrugTakenMapper.insert(pdDPatientDrugTaken);
	    }
	    if (successCount > 0) {
	        result.setRetMsg(SAVESUCCESS);
	    } else {
	        result.setRetMsg(SAVEFAILED);
	    }
	    result.setSuccessCount(successCount);
	    return result;
	}
	
	/**
     *  删除用药处方
     * @param id
     * @return
     */
    public JacksonCountReturn deleteMedication(MedicationResultForm condForm) {

        JacksonCountReturn result = new JacksonCountReturn();
        Date now = new Date();
        int successCount = 0;
        if (!Tools.isblank(condForm.getId())) {
            PdDPatientDrugTakenExample exp = new PdDPatientDrugTakenExample();
            PdDPatientDrugTakenExample.Criteria criteria2 = exp.createCriteria();
            criteria2.andIdEqualTo(condForm.getId());
            PdDPatientDrugTaken record = new PdDPatientDrugTaken();
            record.setId(condForm.getId());
            record.setModifydate(now);
            record.setDelFlag(DELETE_FLAG_1);
            successCount = pdDPatientDrugTakenMapper.updateByExampleSelective(record, exp);
        }
        if (successCount > 0) {
            result.setSuccessCount(successCount);
            result.setRetMsg(DELETESUCCESS);
        } else {
            result.setSuccessCount(successCount);
            result.setRetMsg(DELETEFAILED);
        }
        return result;
    }

    
    
    /**
     * 患者随访患者列表
     */
    @Override
    public JacksonPagginListReturn<PatientRstForm> getFollowUpPatient(PatientForm condform) {
        JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
        int pagecount = getWebCommonDao().selectList("PatientListMapper.getFollowUpPatient", condform).getResultData().size();
        double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getFollowUpPatient", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
        return returnList;
    }
    /**
     * 患者随访列表
     */
    @Override
    public JacksonPagginListReturn<FollowUpSolutionForm> getFollowUpSolution(FollowUpSolutionForm form) {
        JacksonPagginListReturn<FollowUpSolutionForm> returnList = new JacksonPagginListReturn<FollowUpSolutionForm>();
        ListResult<FollowUpSolutionForm> patientFollowUpRstForms=getWebCommonDao().selectList("PatientListMapper.getFollowUpSolutionMessage", form);
        if(patientFollowUpRstForms.getResultCount()==0){
            return returnList;
        }
        for(int i=0;i<patientFollowUpRstForms.getResultData().size();i++){
            patientFollowUpRstForms.getResultData().get(i).setFollowUpDate(DateUtil.convertStringToDate(patientFollowUpRstForms.getResultData().get(i).gettDate()));
            String bloodGlucose = patientFollowUpRstForms.getResultData().get(i).getBloodGlucose();
            bloodGlucose = bloodGlucose.replace("%", "");
            patientFollowUpRstForms.getResultData().get(i).setBloodGlucose(bloodGlucose);
            String bloodPressure = patientFollowUpRstForms.getResultData().get(i).getBloodPressure();
            bloodPressure = bloodPressure.replace("%", "");
            patientFollowUpRstForms.getResultData().get(i).setBloodPressure(bloodPressure);;
        }
        returnList.setData(patientFollowUpRstForms.getResultData());
        return returnList;
    }
    /**
     * 患者随访数据
     */
    @Override
    public JacksonPagginListReturn<FollowUpSolutionForm> getFollowUpPatientMessage(FollowUpSolutionForm condForm) {
        JacksonPagginListReturn<FollowUpSolutionForm> result = new JacksonPagginListReturn<FollowUpSolutionForm>();
        ListResult<FollowUpSolutionForm> roleCountList = webCommonDao.selectList("PatientListMapper.getFollowUpSolutionMessage", condForm);
        if(roleCountList.getResultData().size()==0){
            return result;
        }
        result.setData(roleCountList.getResultData());
        return result;
    }

    /**
     * 保存患者随访数据
     */
    @Override
    public JacksonCountReturn followUpPatientSave(FollowUpSolutionForm condition) {
        JacksonCountReturn ret = new JacksonCountReturn();
        PdDPatientFollowup pdDPatientFollowup = new PdDPatientFollowup();
        Date now = new Date();
        pdDPatientFollowup.setHpId(condition.getHpId());
        pdDPatientFollowup.setPtId(condition.getPatientId());
        pdDPatientFollowup.setTdate(DateUtil.convertStringToDate(condition.gettDate()));
        if(condition.getEmergencyDetail()==null||"".equals(condition.getEmergencyDetail())){
            pdDPatientFollowup.setEmergency("0");
        }else{
            pdDPatientFollowup.setEmergency("1");
        }
        pdDPatientFollowup.setEmergencyDetail(condition.getEmergencyDetail());
        if(condition.getIllnessChangeDetail()==null||"".equals(condition.getIllnessChangeDetail())){
            pdDPatientFollowup.setIllnessChange("0");
        }else{
            pdDPatientFollowup.setIllnessChange("1");
        }
        pdDPatientFollowup.setIllnessChangeDetail(condition.getIllnessChangeDetail());
        pdDPatientFollowup.setAppelity(condition.getAppelity());
        pdDPatientFollowup.setSleepQuality(condition.getSleepQuality());
        pdDPatientFollowup.setActivityAmount(condition.getActivityAmount());
        pdDPatientFollowup.setEmotion(condition.getEmotion());
        if(condition.getPrebphigh()==""||condition.getPrebphigh()==null){
            condition.setPrebphigh("%");
        }
        if(condition.getPrebplow()==""||condition.getPrebplow()==null){
            condition.setPrebplow("%");
        }
        String bloodPressure = condition.getPrebphigh()+"/"+condition.getPrebplow();
        pdDPatientFollowup.setBloodPressure(bloodPressure);
        if(condition.getFasting()==""||condition.getFasting()==null){
            condition.setFasting("%");
        }
        if(condition.getAfterBreakfast()==""||condition.getAfterBreakfast()==null){
            condition.setAfterBreakfast("%");
        }
        if(condition.getBeforeLunch()==""||condition.getBeforeLunch()==null){
            condition.setBeforeLunch("%");
        }
        if(condition.getAfterLunch()==""||condition.getAfterLunch()==null){
            condition.setAfterLunch("%");
        }
        if(condition.getBeforeDinner()==""||condition.getBeforeDinner()==null){
            condition.setBeforeDinner("%");
        }
        if(condition.getAfterDinner()==""||condition.getAfterDinner()==null){
            condition.setAfterDinner("%");
        }
        if(condition.getBeforeSlepp()==""||condition.getBeforeSlepp()==null){
            condition.setBeforeSlepp("%");
        }
        String bloodGlucose = condition.getFasting()+","+condition.getAfterBreakfast()+","+condition.getBeforeLunch()+","+condition.getAfterLunch()+","
                                +condition.getBeforeDinner()+","+condition.getAfterDinner()+","+condition.getBeforeSlepp();
        pdDPatientFollowup.setBloodGlucose(bloodGlucose);
        pdDPatientFollowup.setWeight(condition.getWeight());
        pdDPatientFollowup.setUltrafiltration(condition.getUltrafiltration());
        pdDPatientFollowup.setUrinaryProduction(condition.getUrinaryProduction());
        pdDPatientFollowup.setUnwellChiefComplaint(condition.getUnwellChiefComplaint());
        pdDPatientFollowup.setFollowupProblem(condition.getFollowupProblem());
        pdDPatientFollowup.setPublicityEducationFocus(condition.getPublicityEducationFocus());
        pdDPatientFollowup.setDelFlag(DELETE_FLAG_0);
        String userNO = getLoginUser().getUserNo();
        pdDPatientFollowup.setCreatedBy(userNO);
        pdDPatientFollowup.setDateCreated(now);
        pdDPatientFollowup.setModifiedBy(userNO);
        pdDPatientFollowup.setDateModified(now);
        pdDPatientFollowup.setRowVersion(0);
        int successCount = 0;
        if(Tools.isblank(condition.getId())){
                String id = Tools.getFifteenUUID();
                pdDPatientFollowup.setId(id);
                successCount = this.pdDPatientFollowupMapper.insert(pdDPatientFollowup);
                if (successCount == 0) {
                    ret.setRetMsg("保存失败！");
                } else {
                    ret.setRetMsg("保存成功！");
                }
            }else{
                pdDPatientFollowup.setId(condition.getId());
                successCount = this.pdDPatientFollowupMapper.updateByPrimaryKey(pdDPatientFollowup);
                if (successCount == 0) {
                    ret.setRetMsg("保存失败！");
                } else {
                    ret.setRetMsg("保存成功！");
                }
            }
         ret.setSuccessCount(successCount);
         return ret;
    }

    /**
     * 删除患者随访数据
     */
    @Override
    public JacksonCountReturn delFollowUpPatient(FollowUpSolutionForm condition) {
        JacksonCountReturn result = new JacksonCountReturn();
        Date now = new Date();
        int successCount = 0;
        if (!Tools.isblank(condition.getId())) {
            PdDPatientFollowupExample exp = new PdDPatientFollowupExample();
            PdDPatientFollowupExample.Criteria criteria2 = exp.createCriteria();
            criteria2.andIdEqualTo(condition.getId());
            PdDPatientFollowup record = new PdDPatientFollowup();
            record.setId(condition.getId());
            record.setModifydate(now);
            record.setDelFlag(DELETE_FLAG_1);
            successCount = pdDPatientFollowupMapper.updateByExampleSelective(record, exp);
        }
        if (successCount > 0) {
            result.setSuccessCount(successCount);
            result.setRetMsg("删除成功");
        } else {
            result.setSuccessCount(successCount);
            result.setRetMsg("该条信息已被其他用户修改，请刷新页面后重试");
        }
        return result;
    }
    
    
    /**
     * 获得合并症患者列表
     */
    @Override
    public JacksonPagginListReturn<PatientRstForm> getComplicationPatient(PatientForm condform) {
        JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
        int pagecount = getWebCommonDao().selectList("PatientListMapper.getComplicationPatient", condform).getResultData().size();
        double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getComplicationPatient", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
        return returnList;
    }

    /**
     * 获得合并症列表
     */
    @Override
    public JacksonPagginListReturn<ComplicationForm> getComplication(PatientForm condform) {
        JacksonPagginListReturn<ComplicationForm> returnList = new JacksonPagginListReturn<ComplicationForm>();
        ListResult<ComplicationForm> patientOutComeRstForms=getWebCommonDao().selectList("PatientListMapper.getComplication", condform);
        returnList.setData(patientOutComeRstForms.getResultData());
        return returnList;
    }

    /**
     * 保存合并症数据
     */
    @Override
    public JacksonCountReturn complicationSave(ComplicationPictureForm condition) {
        JacksonCountReturn ret = new JacksonCountReturn();
        PdDPatientComplication outcome = new PdDPatientComplication();
        Date now = new Date();
        int successCount = 0;
        outcome.setRowVersion(1);
        outcome.setDateCreated(now);
        outcome.setDateModified(now);
        outcome.setDelFlag(DELETE_FLAG_0);
        outcome.setModifiedBy(getLoginUser().getUserNo());
        outcome.setCreatedBy(getLoginUser().getUserNo());
        outcome.setHpId(condition.getHpId());
        outcome.setTdate(DateUtil.convertStringToDate(condition.getTdate()));
        outcome.setPtId(condition.getPatientId());
        outcome.setType(condition.getType());
        outcome.setReason(condition.getReason());
        outcome.setIsHpsiptalization(condition.getIsHospitalization());
        outcome.setAntibioticTreatment(condition.getAntibioticTreatment());
        outcome.setTreatment(condition.getTreatment());
        outcome.setOutcomeType(condition.getOutcomeType());
         if(Tools.isblank(condition.getId())){
                String id = Tools.getFifteenUUID();
                outcome.setId(id);
                successCount = this.pdDPatientComplicationMapper.insert(outcome);
                if (successCount == 0) {
                    ret.setRetMsg("保存失败！");
                } else {
                    ret.setRetMsg("保存成功！");
                }
            }else{
                outcome.setId(condition.getId());
                successCount = this.pdDPatientComplicationMapper.updateByPrimaryKey(outcome);
                if (successCount == 0) {
                    ret.setRetMsg("保存失败！");
                } else {
                    ret.setRetMsg("保存成功！");
                }
            }
            ret.setSuccessCount(successCount);
            return ret;
    }

    /**
     * 根据ID查询合并症数据
     */
    @Override
    public JacksonPagginListReturn<ComplicationForm> getComplicationMessage(ComplicationForm condForm) {
        JacksonPagginListReturn<ComplicationForm> result = new JacksonPagginListReturn<ComplicationForm>();
        ListResult<ComplicationForm> roleCountList = webCommonDao.selectList("PatientListMapper.getComplicationMessage", condForm);
        List<ComplicationForm> resultList = new ArrayList<ComplicationForm>();
        resultList.addAll(roleCountList.getResultData());
        result.setData(resultList);
        return result;
    }

    /**
     * 删除合并症数据
     */
    @Override
    public JacksonCountReturn deleteComplication(ComplicationForm condition) {
         JacksonCountReturn result = new JacksonCountReturn();
            Date now = new Date();
            int successCount = 0;
            if (!Tools.isblank(condition.getId())) {
                PdDPatientComplicationExample exp = new PdDPatientComplicationExample();
                PdDPatientComplicationExample.Criteria criteria2 = exp.createCriteria();
                criteria2.andIdEqualTo(condition.getId());
                PdDPatientComplication record = new PdDPatientComplication();
                record.setId(condition.getId());
                record.setModifydate(now);
                record.setDelFlag(DELETE_FLAG_1);
                record.setModifiedBy(getLoginUser().getUserNo());
                successCount = pdDPatientComplicationMapper.updateByExampleSelective(record, exp);
            }
            if (successCount > 0) {
                result.setSuccessCount(successCount);
                result.setRetMsg("删除成功");
            } else {
                result.setSuccessCount(successCount);
                result.setRetMsg("该条信息已被其他用户修改，请刷新页面后重试");
            }
            return result;
    }

	@Override
	public JacksonCountReturn patientEvaOutSave(PatientEvalRstForm condition) {
		JacksonCountReturn ret = new JacksonCountReturn();
		Date now = new Date();
        int successCount = 0;
        PdDPatientOutpatientEvaluation evaluation = new PdDPatientOutpatientEvaluation();
        //新增
        if(Tools.isblank(condition.getId())){
        	String id = Tools.getFifteenUUID();
        	evaluation.setId(id);
        	evaluation.setHpId(condition.getHpId());
        	evaluation.setPtId(condition.getPatientId());
        	Date patientEvalDate = DateUtil.convertStringToDate(condition.getPatientEvalDate());
        	evaluation.setTdate(patientEvalDate);
        	evaluation.setWeight(condition.getWeight());
        	evaluation.setBmi(condition.getBmi());
        	String prebphigh="%";
        	if(!Tools.isblank(condition.getPrebphigh())){
        		prebphigh=condition.getPrebphigh();
        	}
        	String prebplow="%";
        	if(!Tools.isblank(condition.getPrebplow())){
        		prebplow=condition.getPrebplow();
        	}
        	String bloodPressure=prebphigh+"/"+prebplow;
        	evaluation.setBloodPressure(bloodPressure);
        	evaluation.setUltrafiltration(condition.getUltrafiltration());
        	evaluation.setUrunaryProduction(condition.getUrinaryProduction());
        	evaluation.setCardiacFunctionLevel(condition.getCardiacFunctionLevel());
        	evaluation.setEdemaGrade(condition.getEdemaGrade());
        	evaluation.setAlimentarySymptoms(condition.getAlimentarySymptoms());
        	evaluation.setOtherSymptoms(condition.getOtherSymptoms());
        	evaluation.setCatherOutAssessment(condition.getCatheterOutAssessment());
        	evaluation.setCatherOutScore(condition.getCatheterOutScore());
        	evaluation.setWeightChange(condition.getWeightChange());
        	evaluation.setDietChange(condition.getDietChange());
        	evaluation.setGastrointestinalSymptoms(condition.getGastrointestinalSymptoms());
        	evaluation.setActivityAbility(condition.getActivityAbility());
        	evaluation.setComplication(condition.getComplication());
        	evaluation.setSubcutaneousFat(condition.getSubcutaneousFat());
        	evaluation.setDelFlag(DELETE_FLAG_0);
        	evaluation.setCreatedBy(getLoginUser().getUserNo());
        	evaluation.setDateCreated(now);
        	evaluation.setModifiedBy(getLoginUser().getUserNo());
        	evaluation.setDateModified(now);
        	successCount=this.pdDPatientOutpatientEvaluationMapper.insert(evaluation);
        	if(successCount == 0){
        		ret.setRetMsg("新增门诊评估失败！");
        	}else{
        		ret.setRetMsg("新增门诊评估成功！");
        	}
        }else{
        	evaluation.setId(condition.getId());
        	Date patientEvalDate = DateUtil.convertStringToDate(condition.getPatientEvalDate());
        	evaluation.setTdate(patientEvalDate);
        	evaluation.setWeight(condition.getWeight());
        	evaluation.setBmi(condition.getBmi());
        	String prebphigh="%";
        	if(!Tools.isblank(condition.getPrebphigh())){
        		prebphigh=condition.getPrebphigh();
        	}
        	String prebplow="%";
        	if(!Tools.isblank(condition.getPrebplow())){
        		prebplow=condition.getPrebplow();
        	}
        	String bloodPressure=prebphigh+"/"+prebplow;
        	evaluation.setBloodPressure(bloodPressure);
        	evaluation.setUltrafiltration(condition.getUltrafiltration());
        	evaluation.setUrunaryProduction(condition.getUrinaryProduction());
        	evaluation.setCardiacFunctionLevel(condition.getCardiacFunctionLevel());
        	evaluation.setEdemaGrade(condition.getEdemaGrade());
        	evaluation.setAlimentarySymptoms(condition.getAlimentarySymptoms());
        	evaluation.setOtherSymptoms(condition.getOtherSymptoms());
        	evaluation.setCatherOutAssessment(condition.getCatheterOutAssessment());
        	evaluation.setCatherOutScore(condition.getCatheterOutScore());
        	evaluation.setWeightChange(condition.getWeightChange());
        	evaluation.setDietChange(condition.getDietChange());
        	evaluation.setGastrointestinalSymptoms(condition.getGastrointestinalSymptoms());
        	evaluation.setActivityAbility(condition.getActivityAbility());
        	evaluation.setComplication(condition.getComplication());
        	evaluation.setSubcutaneousFat(condition.getSubcutaneousFat());
        	evaluation.setModifiedBy(getLoginUser().getUserNo());
        	evaluation.setDateModified(now);
        	successCount=this.pdDPatientOutpatientEvaluationMapper.updateByPrimaryKeySelective(evaluation);
        	if(successCount == 0){
        		ret.setRetMsg("修改门诊评估失败！");
        	}else{
        		ret.setRetMsg("修改门诊评估成功！");
        	}
        }	
        ret.setSuccessCount(successCount);
		return ret;
	}
	
	/**
	 * 保存置管手术信息
	 * 
	 */
	@Override
	public JacksonCountReturn catheterSave(CatheterOperationReportForm condition) {
		JacksonCountReturn ret = new JacksonCountReturn();
		PdDPatientTubeOperation outcome = new PdDPatientTubeOperation();
		Date now = new Date();
        int successCount = 0;
        outcome.setRowVersion(1);
    	outcome.setDelFlag(DELETE_FLAG_0);
    	outcome.setCreatedBy(getLoginUser().getUserNo());
    	outcome.setDateCreated(now);
    	outcome.setModifiedBy(getLoginUser().getUserNo());
    	outcome.setDateModified(now);
    	outcome.setHpId(condition.getHpId());
    	outcome.setCardNo(condition.getCatheterhospital());
    	outcome.setPtId(condition.getPatientId());
    	outcome.setTdate(DateUtil.convertStringToDate(condition.getCatheterdate()));
    	outcome.setDoctor(condition.getCatheterdoctor());
    	outcome.setOperationType(condition.getOperationtype());
    	outcome.setOperationWay(condition.getCatheterway());
    	outcome.setTypeOfAnesthesia(condition.getAnesthesiamethod());
    	outcome.setWayChoiceReason(condition.getReason());
    	outcome.setDialysisSystem(condition.getDialysissystems());
    	outcome.setInitialDialysis(condition.getDialysisstage());
 		 if(Tools.isblank(condition.getId())){
	        	String id = Tools.getFifteenUUID();
	        	outcome.setId(id);
	        	successCount = this.pdDPatientTubeOperationMapper.insert(outcome);
	        	if (successCount == 0) {
	                ret.setRetMsg("保存失败！");
	            } else {
	            	ret.setRetMsg("保存成功！");
	            }
	        }else{
	        	outcome.setId(condition.getId());
	        	successCount = this.pdDPatientTubeOperationMapper.updateByPrimaryKey(outcome);
	        	if (successCount == 0) {
	                ret.setRetMsg("保存失败！");
	            } else {
	            	ret.setRetMsg("保存成功！");
	            }
	        }
	        ret.setSuccessCount(successCount);
			return ret;
	}

	/**
	 * 
	 */
	@Override
	public JacksonPagginListReturn<CatheterOperationReportForm> getcatheterOperationMessage(CatheterOperationReportForm condForm) {
		JacksonPagginListReturn<CatheterOperationReportForm> result = new JacksonPagginListReturn<CatheterOperationReportForm>();
		ListResult<CatheterOperationReportForm> roleCountList = webCommonDao.selectList("PatientListMapper.getPatientMassage", condForm);
		List<CatheterOperationReportForm> resultList = new ArrayList<CatheterOperationReportForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 删除置管手术信息
	 */
	@Override
	public JacksonCountReturn deleteCatheterOperation(CatheterOperationReportForm condition) {
        JacksonCountReturn result = new JacksonCountReturn();
        Date now = new Date();
        int successCount = 0;
        if (!Tools.isblank(condition.getId())) {
            PdDPatientTubeOperationExample exp = new PdDPatientTubeOperationExample();
            PdDPatientTubeOperationExample.Criteria criteria2 = exp.createCriteria();
            criteria2.andIdEqualTo(condition.getId());
            PdDPatientTubeOperation record = new PdDPatientTubeOperation();
            record.setId(condition.getId());
            record.setModifydate(now);
            record.setDelFlag(DELETE_FLAG_1);
            successCount = pdDPatientTubeOperationMapper.updateByExampleSelective(record, exp);
        }
        if (successCount > 0) {
            result.setSuccessCount(successCount);
            result.setRetMsg("删除成功");
        } else {
            result.setSuccessCount(successCount);
            result.setRetMsg("该条信息已被其他用户修改，请刷新页面后重试");
        }
        return result;
	}

	@Override
	public JacksonCountReturn deleteOutComeRow(PatientOutComeCondForm condition) {
		JacksonCountReturn rst = new JacksonCountReturn();
		int successCount=0;
		PdDPatientOutcome outcome = new PdDPatientOutcome();
		outcome.setId(condition.getId());
		Date now = new Date();
		outcome.setDelFlag(DELETE_FLAG_1);
		outcome.setDateModified(now);
		outcome.setModifiedBy(getLoginUser().getUserNo());
		successCount=this.pdDPatientOutcomeMapper.updateByPrimaryKeySelective(outcome);
		rst.setSuccessCount(successCount);
		if(successCount==0){
			rst.setRetMsg("删除失败!");
		}else{
			rst.setRetMsg("删除成功!");
		}
		return rst;
	}

	@Override
	public JacksonPagginListReturn<PatientRstForm> getOutPatientData(PatientForm condform) {
		JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
		int pagecount = getWebCommonDao().selectList("PatientListMapper.getOutPatientData", condform).getResultData().size();
		double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getOutPatientData", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
		return returnList;
	}

	@Override
	public JacksonPagginListReturn<PatientEvalRstForm> searchOutPatientEval(PatientForm form) {
		JacksonPagginListReturn<PatientEvalRstForm> rst = new JacksonPagginListReturn<>();
		if(Tools.isblank(form.getPatientId())){
			return rst;
		}
		ListResult<PatientEvalRstForm> patientEvalRstForms=getWebCommonDao()
				.selectList("PatientListMapper.getPatientEvals", form);
		rst.setData(patientEvalRstForms.getResultData());
		return rst;
	}
	
	/**
	 * 透析方案患者列表
	 */
	@Override
	public JacksonPagginListReturn<PatientRstForm> getDialysisPatient(PatientForm condform) {
		JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
		int pagecount = getWebCommonDao().selectList("PatientListMapper.getDialysisPatient", condform).getResultData().size();
		double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getDialysisPatient", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
		return returnList;
	}
	
	/**
	 * 透析方案列表
	 */
	@Override
	public JacksonPagginListReturn<DialysisSolutionListForm> getDialysisSolution(PatientForm condform) {
		JacksonPagginListReturn<DialysisSolutionListForm> returnList = new JacksonPagginListReturn<DialysisSolutionListForm>();
		ListResult<DialysisSolutionListForm> patientOutComeRstForms=getWebCommonDao().selectList("PatientListMapper.getDialysisSolution", condform);
		returnList.setData(patientOutComeRstForms.getResultData());
		return returnList;
	}
	
	/**
	 * 保存编辑透析方案
	 */
	@Override
	public JacksonCountReturn solutionSave(DialysisSolutionForm condition) {
		JacksonCountReturn ret = new JacksonCountReturn();
		PdDPatientDialsysSolution outcome = new PdDPatientDialsysSolution();
		Date now = new Date();
        int successCount = 0;
        outcome.setHpId(condition.getHpId());
        outcome.setRowVersion(1);
    	outcome.setDelFlag(DELETE_FLAG_0);
    	outcome.setCreatedBy(getLoginUser().getUserNo());
    	outcome.setDateCreated(now);
    	outcome.setPtId(condition.getPatientId());
    	outcome.setModifiedBy(getLoginUser().getUserNo());
    	outcome.setDateModified(now);
    	outcome.setTdate(DateUtil.convertStringToDate(condition.getTdate()));
    	outcome.setType(condition.getType());
    	outcome.setAmount1(condition.getAmount1());
    	outcome.setAmount2(condition.getAmount2());
    	outcome.setAmount3(condition.getAmount3());
    	if(Tools.isblank(condition.getId())){
	        	String id = Tools.getFifteenUUID();
	        	outcome.setId(id);
	        	successCount = this.pdDPatientDialsysSolutionMapper.insert(outcome);
	        	if (successCount == 0) {
	                ret.setRetMsg("保存失败！");
	            } else {
	            	ret.setRetMsg("保存成功！");
	            }
	        }else{
	        	outcome.setId(condition.getId());
	        	successCount = this.pdDPatientDialsysSolutionMapper.updateByPrimaryKey(outcome);
	        	if (successCount == 0) {
	                ret.setRetMsg("保存失败！");
	            } else {
	            	ret.setRetMsg("保存成功！");
	            }
	        }
    	 ret.setSuccessCount(successCount);
		 return ret;
	}
	
	/**
	 * 查询透析方案数据
	 */
	@Override
	public JacksonPagginListReturn<DialysisSolutionForm> getDialysisSolutionMessage(DialysisSolutionForm condForm) {
		JacksonPagginListReturn<DialysisSolutionForm> result = new JacksonPagginListReturn<DialysisSolutionForm>();
		ListResult<DialysisSolutionForm> roleCountList = webCommonDao.selectList("PatientListMapper.getDialysisSolutionMessage", condForm);
		List<DialysisSolutionForm> resultList = new ArrayList<DialysisSolutionForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}
	
	/**
	 * 删除透析方案
	 */
	@Override
	public JacksonCountReturn deleteDialysisSolution(DialysisSolutionForm condition) {
	     JacksonCountReturn result = new JacksonCountReturn();
	        Date now = new Date();
	        int successCount = 0;
	        if (!Tools.isblank(condition.getId())) {
	        	PdDPatientDialsysSolutionExample exp = new PdDPatientDialsysSolutionExample();
	        	PdDPatientDialsysSolutionExample.Criteria criteria2 = exp.createCriteria();
	            criteria2.andIdEqualTo(condition.getId());
	            PdDPatientDialsysSolution record = new PdDPatientDialsysSolution();
	            record.setId(condition.getId());
	            record.setModifydate(now);
	            record.setDelFlag(DELETE_FLAG_1);
	            successCount = pdDPatientDialsysSolutionMapper.updateByExampleSelective(record, exp);
	        }
	        if (successCount > 0) {
	            result.setSuccessCount(successCount);
	            result.setRetMsg("删除成功");
	        } else {
	            result.setSuccessCount(successCount);
	            result.setRetMsg("该条信息已被其他用户修改，请刷新页面后重试");
	        }
	        return result;
	}
	
	/**
	 * 获得腹膜平衡实验患者列表
	 */
	@Override
	public JacksonPagginListReturn<PatientRstForm> getExperimentPatient(PatientForm condform) {
		JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
		int pagecount = getWebCommonDao().selectList("PatientListMapper.getExperimentPatient", condform).getResultData().size();
		double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getExperimentPatient", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
		return returnList;
	}

	/**
	 * 获得腹膜平衡实验列表
	 */
	@Override
	public JacksonPagginListReturn<BalanceExperimentListForm> getBalanceExperiment(PatientForm condform) {
		JacksonPagginListReturn<BalanceExperimentListForm> returnList = new JacksonPagginListReturn<BalanceExperimentListForm>();
		ListResult<BalanceExperimentListForm> patientOutComeRstForms=getWebCommonDao().selectList("PatientListMapper.getBalanceExperiment", condform);
		returnList.setData(patientOutComeRstForms.getResultData());
		return returnList;
	}
	
	/**
	 * 腹膜平衡实验数据编辑
	 */
	@Override
	public JacksonPagginListReturn<BalanceExperimentForm> getBalanceExperimentMessage(BalanceExperimentForm condForm) {
		JacksonPagginListReturn<BalanceExperimentForm> result = new JacksonPagginListReturn<BalanceExperimentForm>();
		ListResult<BalanceExperimentForm> roleCountList = webCommonDao.selectList("PatientListMapper.getBalanceExperimentMessage", condForm);
		List<BalanceExperimentForm> resultList = new ArrayList<BalanceExperimentForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}
	
	/**
	 * 保存平衡实验数据
	 */
	@Override
	public JacksonCountReturn experimentSave(BalanceExperimentForm condition) {
		JacksonCountReturn ret = new JacksonCountReturn();
		PdDPatientPet outcome = new PdDPatientPet();
		Date now = new Date();
        int successCount = 0;
        outcome.setRowVersion(1);
        outcome.setDateCreated(now);
        outcome.setDateModified(now);
        outcome.setDelFlag(DELETE_FLAG_0);
    	outcome.setModifiedBy(getLoginUser().getUserNo());
       	outcome.setCreatedBy(getLoginUser().getUserNo());
       	outcome.setHpId(condition.getHpId());
        outcome.setTdate(DateUtil.convertStringToDate(condition.getTdate()));
        outcome.setValue(condition.getValue());
        outcome.setPtId(condition.getPatientId());
        outcome.setPertonealTransportRate(condition.getPeritonealTransportRate());
		 if(Tools.isblank(condition.getId())){
	        	String id = Tools.getFifteenUUID();
	        	outcome.setId(id);
	        	successCount = this.pdDPatientPetMapper.insert(outcome);
	        	if (successCount == 0) {
	                ret.setRetMsg("保存失败！");
	            } else {
	            	ret.setRetMsg("保存成功！");
	            }
	        }else{
	        	outcome.setId(condition.getId());
	        	successCount = this.pdDPatientPetMapper.updateByPrimaryKey(outcome);
	        	if (successCount == 0) {
	                ret.setRetMsg("保存失败！");
	            } else {
	            	ret.setRetMsg("保存成功！");
	            }
	        }
	        ret.setSuccessCount(successCount);
			return ret;
	}
	
	/**
	 * 删除平衡实验数据
	 */
	@Override
	public JacksonCountReturn deleteBalanceExperiment(BalanceExperimentListForm condition) {
	     JacksonCountReturn result = new JacksonCountReturn();
	        Date now = new Date();
	        int successCount = 0;
	        if (!Tools.isblank(condition.getId())) {
	        	PdDPatientPetExample exp = new PdDPatientPetExample();
	        	PdDPatientPetExample.Criteria criteria2 = exp.createCriteria();
	            criteria2.andIdEqualTo(condition.getId());
	            PdDPatientPet record = new PdDPatientPet();
	            record.setId(condition.getId());
	            record.setModifydate(now);
	            record.setDelFlag(DELETE_FLAG_1);
	            record.setModifiedBy(getLoginUser().getUserNo());
	            successCount = pdDPatientPetMapper.updateByExampleSelective(record, exp);
	        }
	        if (successCount > 0) {
	            result.setSuccessCount(successCount);
	            result.setRetMsg("删除成功");
	        } else {
	            result.setSuccessCount(successCount);
	            result.setRetMsg("该条信息已被其他用户修改，请刷新页面后重试");
	        }
	        return result;
	}
	
	
	/**
	 *  获得检验检查患者列表
	 */
	@Override
	public JacksonPagginListReturn<PatientRstForm> getInspectionCheckPatient(PatientForm condform) {
		JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<PatientRstForm>();
		int pagecount = getWebCommonDao().selectList("PatientListMapper.getInspectionCheckPatient", condform).getResultData().size();
		double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getInspectionCheckPatient", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
		return returnList;
	}

	/**
	 * 保存检验检查数据
	 */
	@Override
	public JacksonCountReturn inspectionCheck(InspectionCheckForm condition) {
		JacksonCountReturn ret = new JacksonCountReturn();
		int successCount = 0;
		int successCount1 = 0;
		//血常规
		PdDPatientInspectionRoutineBlood outcome = new PdDPatientInspectionRoutineBlood();
		Date now = new Date();
    	outcome.setPtId(condition.getPatientId());
        outcome.setRowVersion(1);
        outcome.setDateCreated(now);
        outcome.setDateModified(now);
        outcome.setDelFlag(DELETE_FLAG_0);
    	outcome.setModifiedBy(getLoginUser().getUserNo());
       	outcome.setCreatedBy(getLoginUser().getUserNo());
       	outcome.setHpId(condition.getHpId());
        outcome.setTdate(DateUtil.convertStringToDate(condition.getTdate1()));
        outcome.setWbc(condition.getWbc());
        outcome.setRbc(condition.getRbc());
        outcome.setHb(condition.getHb());
        outcome.setHct(condition.getHct());
        outcome.setMcv(condition.getMcv());
        outcome.setMch(condition.getMch());
        outcome.setMchc(condition.getMchc());
        outcome.setRdw(condition.getRdw());
        outcome.setRdwsd(condition.getRdwsd());
        outcome.setPlt(condition.getPlt());
        outcome.setMpv(condition.getMpv());
        outcome.setPdw(condition.getPdw());
        outcome.setPct(condition.getPct());
        outcome.setPlcr(condition.getPlcr());
        outcome.setNeutrophilAbsoluteValue(condition.getNeutrophil_absolute_value());
        outcome.setLymphocyteAbsoluteValue(condition.getLymphocyte_absolute_value());
        outcome.setMonocytePercentage(condition.getMonocyte_percentage());
        outcome.setEosinophilPercentage(condition.getEosinophil_percentage());
        outcome.setBasophilPercentage(condition.getBasophil_percentage());
        outcome.setNeutrophilPercentage(condition.getNeutrophil_percentage());
        outcome.setLymphocytePercentage(condition.getLymphocyte_percentage());
        outcome.setMonocyteAbsoluteValue(condition.getMonocyte_absolute_value());
        outcome.setEosinophilAbsoluteValue(condition.getEosinophil_absolute_value());
        outcome.setBasophilAbsoluteValue(condition.getBasophil_absolute_value());
        //生化指标
		PdDPatientInspectionBiochemical outcome1 = new PdDPatientInspectionBiochemical();
    	outcome1.setPtId(condition.getPatientId());
        outcome1.setRowVersion(1);
        outcome1.setDateCreated(now);
        outcome1.setDateModified(now);
        outcome1.setDelFlag(DELETE_FLAG_0);
    	outcome1.setModifiedBy(getLoginUser().getUserNo());
       	outcome1.setCreatedBy(getLoginUser().getUserNo());
       	outcome1.setHpId(condition.getHpId());
        outcome1.setTdate(DateUtil.convertStringToDate(condition.getTdate2()));
        outcome1.setAlt(condition.getAlt());
        outcome1.setAst(condition.getAst());
        outcome1.setTp(condition.getTp());
        outcome1.setAlb(condition.getAlb());
        outcome1.setSeroglobulin(condition.getSeroglobulin());
        outcome1.setAg(condition.getAg());
        outcome1.setTbil(condition.getTbil());
        outcome1.setDbil(condition.getDbil());
        outcome1.setIbil(condition.getIbil());
        outcome1.setTba(condition.getTba());
        outcome1.setGlu(condition.getGlu());
        outcome1.setBun(condition.getBun());
        outcome1.setCre(condition.getCre());
        outcome1.setUa(condition.getUa());
        outcome1.setCo2(condition.getCo2());
        outcome1.setAlp(condition.getAlp());
        outcome1.setGgt(condition.getGgt());
        outcome1.setK(condition.getK());
        outcome1.setNa(condition.getNa());
        outcome1.setCl(condition.getCl());
        outcome1.setCa(condition.getCa());
        outcome1.setP(condition.getP());
        outcome1.setMg(condition.getMg());
        outcome1.setCk(condition.getCk());
        outcome1.setLdh(condition.getLdh());
        outcome1.setAhbdh(condition.getAhbdh());
        outcome1.setCreatineKinaseIsoenzyme(condition.getCreatine_kinase_isoenzyme());
        outcome1.setTc(condition.getTc());
        outcome1.setTg(condition.getTg());
        outcome1.setHdlc(condition.getHdlc());		        
        outcome1.setApolipoproteinA1(condition.getApolipoprotein_a1());
        outcome1.setApolipoproteinB(condition.getApolipoprotein_b());
        outcome1.setLpa(condition.getLpa());
        outcome1.setApolipoproteinE(condition.getApolipoprotein_e());
        outcome1.setPa(condition.getPa());
        outcome1.setAda(condition.getAda());
        outcome1.setMicroglobulinB2(condition.getMicroglobulin_b2());
        outcome1.setAfu(condition.getAfu());
        outcome1.setCystatin(condition.getCystatin());
        outcome1.setNt5(condition.getNt5());		        
        outcome1.setHscrp(condition.getHscrp());
        outcome1.setBhb(condition.getBhb());
        outcome1.setMao(condition.getMao());
        outcome1.setSialicAcid(condition.getSialic_acid());
        outcome1.setOthers(condition.getOthers2());	
        outcome1.setLdlc(condition.getLdlc() );
        //出凝血功能
		PdDPatientInspectionBloodCoagulation outcome2 = new PdDPatientInspectionBloodCoagulation();
    	outcome2.setPtId(condition.getPatientId());
        outcome2.setRowVersion(1);
        outcome2.setDateCreated(now);
        outcome2.setDateModified(now);
        outcome2.setDelFlag(DELETE_FLAG_0);
    	outcome2.setModifiedBy(getLoginUser().getUserNo());
       	outcome2.setCreatedBy(getLoginUser().getUserNo());
       	outcome2.setHpId(condition.getHpId());
        outcome2.setTdate(DateUtil.convertStringToDate(condition.getTdate3()));
        outcome2.setFib(condition.getFib());
        outcome2.setAptt(condition.getAptt());
        outcome2.setPta(condition.getPta());
        outcome2.setPt(condition.getPt());
        outcome2.setTt(condition.getTt());
        outcome2.setInr(condition.getInr());
        outcome2.setFdp(condition.getFdp());
        outcome2.setDdimer(condition.getDdimer());
        outcome2.setAt3(condition.getAt3());
        outcome2.setPlasminogenInhibitorA2(condition.getPlasminogen_inhibitor_a2());
        outcome2.setPlga(condition.getPlga());
        outcome2.setOthers(condition.getOthers3());	
        //传染性疾病筛选
        PdDPatientInspectionInfectionDiseases outcome3 = new PdDPatientInspectionInfectionDiseases();
    	outcome3.setPtId(condition.getPatientId());
        outcome3.setRowVersion(1);
        outcome3.setDateCreated(now);
        outcome3.setDateModified(now);
        outcome3.setDelFlag(DELETE_FLAG_0);
    	outcome3.setModifiedBy(getLoginUser().getUserNo());
       	outcome3.setCreatedBy(getLoginUser().getUserNo());
       	outcome3.setHpId(condition.getHpId());
        outcome3.setTdate(DateUtil.convertStringToDate(condition.getTdate4()));
        outcome3.setHbsag(condition.getHbsag());
        outcome3.setHbsab(condition.getHbsab());
        outcome3.setHbeag(condition.getHbeag());
        outcome3.setHbeab(condition.getHbeab());
        outcome3.setHbcab(condition.getHbcab());
        outcome3.setHbvdnase(condition.getHbvdnase());
        outcome3.setHav(condition.getHav());
        outcome3.setHbcabigm(condition.getHbcabigm());
        outcome3.setHcvigg(condition.getHcvigg());
        outcome3.setHcvigm(condition.getHcvigm());
        outcome3.setHdv(condition.getHdv());
        outcome3.setHgv(condition.getHgv());
        outcome3.setHev(condition.getHev());
        outcome3.setHiv(condition.getHiv());
        outcome3.setTpab(condition.getTpab());     
        //尿常规
        PdDPatientInspectionRoutineUrine outcome4 = new PdDPatientInspectionRoutineUrine();
    	outcome4.setPtId(condition.getPatientId());
        outcome4.setRowVersion(1);
        outcome4.setDateCreated(now);
        outcome4.setDateModified(now);
        outcome4.setDelFlag(DELETE_FLAG_0);
    	outcome4.setModifiedBy(getLoginUser().getUserNo());
       	outcome4.setCreatedBy(getLoginUser().getUserNo());
       	outcome4.setHpId(condition.getHpId());
        outcome4.setTdate(DateUtil.convertStringToDate(condition.getTdate5()));
        outcome4.setRate(condition.getRate());
        outcome4.setProtein(condition.getProtein());
        outcome4.setErythrocytes(condition.getErythrocytes());
        outcome4.setLeukocyte(condition.getLeukocyte());       
        //大便常规
        PdDPatientInspectionRoutineStool outcome5 = new PdDPatientInspectionRoutineStool();    
    	outcome5.setPtId(condition.getPatientId());
        outcome5.setRowVersion(1);
        outcome5.setDateCreated(now);
        outcome5.setDateModified(now);
        outcome5.setDelFlag(DELETE_FLAG_0);
    	outcome5.setModifiedBy(getLoginUser().getUserNo());
       	outcome5.setCreatedBy(getLoginUser().getUserNo());
       	outcome5.setHpId(condition.getHpId());
        outcome5.setTdate(DateUtil.convertStringToDate(condition.getTdate6()));
        outcome5.setProtein(condition.getProtein6());
        outcome5.setErythrocytes(condition.getErythrocytes6());
        outcome5.setLeukocyte(condition.getLeukocyte6());
        //肾脏B超
        PdDPatientInspectionRenalBUltrasound outcome6 = new PdDPatientInspectionRenalBUltrasound();
    	outcome6.setPtId(condition.getPatientId());
        outcome6.setRowVersion(1);
        outcome6.setDateCreated(now);
        outcome6.setDateModified(now);
        outcome6.setDelFlag(DELETE_FLAG_0);
    	outcome6.setModifiedBy(getLoginUser().getUserNo());
       	outcome6.setCreatedBy(getLoginUser().getUserNo());
       	outcome6.setHpId(condition.getHpId());
        outcome6.setTdate(DateUtil.convertStringToDate(condition.getTdate7()));
    	outcome6.setRlength(condition.getRlength());
    	outcome6.setRwidth(condition.getRwidth());
    	outcome6.setLlength(condition.getLlength());
    	outcome6.setLwidth(condition.getLwidth());
    	outcome6.setOthers(condition.getOthers7());   
        //胸部X线
		PdDPatientInspectionChestXRay outcome7 = new PdDPatientInspectionChestXRay();
    	outcome7.setPtId(condition.getPatientId());
        outcome7.setRowVersion(1);
        outcome7.setDateCreated(now);
        outcome7.setDateModified(now);
        outcome7.setDelFlag(DELETE_FLAG_0);
    	outcome7.setModifiedBy(getLoginUser().getUserNo());
       	outcome7.setCreatedBy(getLoginUser().getUserNo());
       	outcome7.setHpId(condition.getHpId());
        outcome7.setTdate(DateUtil.convertStringToDate(condition.getTdate8()));
        outcome7.setDiagnosis(condition.getDiagnosis8());
        outcome7.setOthers(condition.getOthers8());
        //心电图
		PdDPatientInspectionElectrocardiogram outcome8 = new PdDPatientInspectionElectrocardiogram();
    	outcome8.setPtId(condition.getPatientId());
    	outcome8.setRowVersion(1);
        outcome8.setDateCreated(now);
        outcome8.setDateModified(now);
        outcome8.setDelFlag(DELETE_FLAG_0);
        outcome8.setModifiedBy(getLoginUser().getUserNo());
    	outcome8.setCreatedBy(getLoginUser().getUserNo());
       	outcome8.setHpId(condition.getHpId());
       	outcome8.setTdate(DateUtil.convertStringToDate(condition.getTdate9()));
        outcome8.setDiagnosis(condition.getDiagnosis8());
        outcome8.setOthers(condition.getOthers8());
        outcome8.setDiagnosis(condition.getDiagnosis9());
        outcome8.setOthers(condition.getOthers9());        
		if(Tools.isblank(condition.getId())){
			if(!Tools.isblank(condition.getTdate1())){
				String id = Tools.getFifteenUUID();
	        	outcome.setId(id);
		        successCount += this.pdDPatientInspectionRoutineBloodMapper.insert(outcome);
			}
			if(!Tools.isblank(condition.getTdate2())){
				String id = Tools.getFifteenUUID();
	        	outcome1.setId(id);
		        successCount += this.pdDPatientInspectionBiochemicalMapper.insert(outcome1);
			}
			if(!Tools.isblank(condition.getTdate3())){
				String id = Tools.getFifteenUUID();
	        	outcome2.setId(id);
		        successCount += this.pdDPatientInspectionBloodCoagulationMapper.insert(outcome2);
			}
			if(!Tools.isblank(condition.getTdate4())){
				String id = Tools.getFifteenUUID();
	        	outcome3.setId(id);
		        successCount += this.pdDPatientInspectionInfectionDiseasesMapper.insert(outcome3);
			}
			if(!Tools.isblank(condition.getTdate5())){
				String id = Tools.getFifteenUUID();
	        	outcome4.setId(id);
		        successCount += this.pdDPatientInspectionRoutineUrineMapper.insert(outcome4);
			}
			if(!Tools.isblank(condition.getTdate6())){
				String id = Tools.getFifteenUUID();
	        	outcome5.setId(id);
		        successCount += this.pdDPatientInspectionRoutineStoolMapper.insert(outcome5);
			}
			if(!Tools.isblank(condition.getTdate7())){
				String id = Tools.getFifteenUUID();
	        	outcome6.setId(id);
		    	 successCount += this.pdDPatientInspectionRenalBUltrasoundMapper.insert(outcome6);
			}
			if(!Tools.isblank(condition.getTdate8())){
				String id = Tools.getFifteenUUID();
	        	outcome7.setId(id);
		        successCount += this.pdDPatientInspectionChestXRayMapper.insert(outcome7);
			}
			if(!Tools.isblank(condition.getTdate9())){
				String id = Tools.getFifteenUUID();
				outcome8.setId(id);
		        successCount += this.pdDPatientInspectionElectrocardiogramMapper.insert(outcome8);
			}
        	if (successCount == 0) {
                ret.setRetMsg("保存失败！");
            } else {
            	ret.setRetMsg("保存成功！");
            }
		}else {
			//编辑血常规
			if(!Tools.isblank(condition.getTdate1())){
	        	outcome.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionRoutineBloodMapper.updateByPrimaryKey(outcome);
			}
			//编辑生化指标
			if(!Tools.isblank(condition.getTdate2())){
	        	outcome1.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionBiochemicalMapper.updateByPrimaryKey(outcome1);
			}
			//编辑出凝血功能
			if(!Tools.isblank(condition.getTdate3())){
	        	outcome2.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionBloodCoagulationMapper.updateByPrimaryKey(outcome2);
			}
			//编辑传染性疾病筛选
			if(!Tools.isblank(condition.getTdate4())){
	        	outcome3.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionInfectionDiseasesMapper.updateByPrimaryKey(outcome3);
			}
			//编辑尿常规
			if(!Tools.isblank(condition.getTdate5())){
	        	outcome4.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionRoutineUrineMapper.updateByPrimaryKey(outcome4);
			}
			//编辑大便常规
			if(!Tools.isblank(condition.getTdate6())){
	        	outcome5.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionRoutineStoolMapper.updateByPrimaryKey(outcome5);
			}
			//编辑肾脏B超
			if(!Tools.isblank(condition.getTdate7())){
	        	outcome6.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionRenalBUltrasoundMapper.updateByPrimaryKey(outcome6);
			}
			//编辑胸部X线
			if(!Tools.isblank(condition.getTdate8())){
	        	outcome7.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionChestXRayMapper.updateByPrimaryKey(outcome7);
			}
			//编辑心电图
			if(!Tools.isblank(condition.getTdate9())){
	        	outcome8.setId(condition.getId());
	        	successCount1 += this.pdDPatientInspectionElectrocardiogramMapper.updateByPrimaryKey(outcome8);
			}
			
        	if (successCount1 == 0) {
                ret.setRetMsg("保存失败！");
            } else {
            	ret.setRetMsg("保存成功！");
            }
        }
		return ret;
	}

	/**
	 * 检验检查列表
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckListForm> getInspectionCheckList(PatientForm condform) {
		JacksonPagginListReturn<InspectionCheckListForm> returnList = new JacksonPagginListReturn<InspectionCheckListForm>();
		ListResult<InspectionCheckListForm> inspectionCheckListForm=getWebCommonDao().selectList("PatientListMapper.getInspectionCheckList", condform);
		returnList.setData(inspectionCheckListForm.getResultData());
		//胸部X线列表显示将code值转化为对应诊断名称
		int length = returnList.getData().size();
		String  detail = null;
		for (int i = 0; i < length; i++) {
			if ("胸部X线".equals(returnList.getData().get(i).getInspectionCheck()) && returnList.getData().get(i).getDetail() != null) {
				detail = returnList.getData().get(i).getDetail();
				 String string = detail.substring(0, detail.indexOf(";"));
				 if(string.contains("1")){
					 string = string.replaceAll("1","未见异常");
				 }if(string.contains("2")){
					 string = string.replaceAll("2","胸腔积液");
				 }if(string.contains("3")){
					 string = string.replaceAll("3","肺部感染");
				 }if(string.contains("4")){
					 string = string.replaceAll("4","结核");
				 }if(string.contains("5")){
					 string = string.replaceAll("5","心包积液");
				 }if(string.contains("6")){
					 string = string.replaceAll("6","心脏扩大");
				 }if(string.contains("7")){
					 string = string.replaceAll("7","其他");
				 }
				 detail  = detail.replaceAll(detail.substring(0, detail.indexOf(";")), string);
				 returnList.getData().get(i).setDetail(returnList.getData().get(i).getDetail().replace(returnList.getData().get(i).getDetail(), detail));
			}
		}
		//心电图列表显示将code值转化为对应诊断名称
		String  detail1 = null;
		for (int i = 0; i < length; i++) {
			if ("心电图".equals(returnList.getData().get(i).getInspectionCheck()) && returnList.getData().get(i).getDetail() != null) {
				detail1 = returnList.getData().get(i).getDetail();
				 String string1 = detail1.substring(0, detail1.indexOf(";"));
				 if(string1.contains("1")){
					 string1 = string1.replaceAll("1", "正常");
				 }if(string1.contains("2")){
					 string1 = string1.replaceAll("2", "左室高电压");
				 }if(string1.contains("3")){
					 string1 = string1.replaceAll("3", "ST-T改变");
				 }if(string1.contains("4")){
					 string1 = string1.replaceAll("4", "异常Q波");
				 }if(string1.contains("5")){
					 string1 = string1.replaceAll("5", "心律失常");
				 }if(string1.contains("6")){
					 string1 = string1.replaceAll("6", "其他");
				 }
				 detail1 = detail1.replaceAll(detail1.substring(0, detail1.indexOf(";")),string1);
				 returnList.getData().get(i).setDetail(returnList.getData().get(i).getDetail().replaceAll(returnList.getData().get(i).getDetail(), detail1));
			}
		}
		 return returnList;
	}

	/**
	 * 根据ID查询检验检查数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckListForm> getInspectionCheckMessage(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckListForm> result = new JacksonPagginListReturn<InspectionCheckListForm>();
		ListResult<InspectionCheckListForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage", condForm);
		List<InspectionCheckListForm> resultList = new ArrayList<InspectionCheckListForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 根据ID查询血常规数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage1(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage1", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 根据ID查询生化指标数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage2(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage2", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 根据ID查询出凝血功能数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage3(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage3", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 根据ID查询传染性疾病筛选数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage4(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage4", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 *  根据ID查询尿常规数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage5(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage5", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 *  根据ID查询大便常规数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage6(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage6", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 根据ID查询肾脏B超数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage7(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage7", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 根据ID查询胸部X线数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage8(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage8", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 根据ID查询心电图数据
	 */
	@Override
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage9(InspectionCheckForm condForm) {
		JacksonPagginListReturn<InspectionCheckForm> result = new JacksonPagginListReturn<InspectionCheckForm>();
		ListResult<InspectionCheckForm> roleCountList = webCommonDao.selectList("PatientListMapper.getInspectionCheckMessage9", condForm);
		List<InspectionCheckForm> resultList = new ArrayList<InspectionCheckForm>();
		resultList.addAll(roleCountList.getResultData());
		result.setData(resultList);
		return result;
	}

	/**
	 * 删除检验检查数据
	 */
	@Override
	public JacksonCountReturn deleteInspectionCheck(InspectionCheckForm condition,String inspectionCheck) {
	     JacksonCountReturn result = new JacksonCountReturn();
	        Date now = new Date();
	        int successCount = 0;
	        if (!Tools.isblank(condition.getId())) {
	        	if("血常规".equals(inspectionCheck)){
	        		PdDPatientInspectionRoutineBloodExample exp = new PdDPatientInspectionRoutineBloodExample();
	        		PdDPatientInspectionRoutineBloodExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionRoutineBlood record = new PdDPatientInspectionRoutineBlood();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionRoutineBloodMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("生化指标".equals(inspectionCheck)){
	        		PdDPatientInspectionBiochemicalExample exp = new PdDPatientInspectionBiochemicalExample();
	        		PdDPatientInspectionBiochemicalExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionBiochemical record = new PdDPatientInspectionBiochemical();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionBiochemicalMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("出凝血功能".equals(inspectionCheck)){
	        		PdDPatientInspectionBloodCoagulationExample exp = new PdDPatientInspectionBloodCoagulationExample();
	        		PdDPatientInspectionBloodCoagulationExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionBloodCoagulation record = new PdDPatientInspectionBloodCoagulation();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionBloodCoagulationMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("传染性疾病筛选".equals(inspectionCheck)){
	        		PdDPatientInspectionInfectionDiseasesExample exp = new PdDPatientInspectionInfectionDiseasesExample();
	        		PdDPatientInspectionInfectionDiseasesExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionInfectionDiseases record = new PdDPatientInspectionInfectionDiseases();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionInfectionDiseasesMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("尿常规".equals(inspectionCheck)){
	        		PdDPatientInspectionRoutineUrineExample exp = new PdDPatientInspectionRoutineUrineExample();
	        		PdDPatientInspectionRoutineUrineExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionRoutineUrine record = new PdDPatientInspectionRoutineUrine();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionRoutineUrineMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("大便常规".equals(inspectionCheck)){
	        		PdDPatientInspectionRoutineStoolExample exp = new PdDPatientInspectionRoutineStoolExample();
	        		PdDPatientInspectionRoutineStoolExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionRoutineStool record = new PdDPatientInspectionRoutineStool();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionRoutineStoolMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("肾脏B超".equals(inspectionCheck)){
	        		PdDPatientInspectionRenalBUltrasoundExample exp = new PdDPatientInspectionRenalBUltrasoundExample();
	        		PdDPatientInspectionRenalBUltrasoundExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionRenalBUltrasound record = new PdDPatientInspectionRenalBUltrasound();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionRenalBUltrasoundMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("胸部X线".equals(inspectionCheck)){
	        		PdDPatientInspectionChestXRayExample exp = new PdDPatientInspectionChestXRayExample();
	        		PdDPatientInspectionChestXRayExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionChestXRay record = new PdDPatientInspectionChestXRay();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionChestXRayMapper.updateByExampleSelective(record, exp);
	        	}
	        	if("心电图".equals(inspectionCheck)){
	        		PdDPatientInspectionElectrocardiogramExample exp = new PdDPatientInspectionElectrocardiogramExample();
	        		PdDPatientInspectionElectrocardiogramExample.Criteria criteria2 = exp.createCriteria();
		            criteria2.andIdEqualTo(condition.getId());
		            PdDPatientInspectionElectrocardiogram record = new PdDPatientInspectionElectrocardiogram();
		            record.setId(condition.getId());
		            record.setModifydate(now);
		            record.setDelFlag(DELETE_FLAG_1);
		            record.setModifiedBy(getLoginUser().getUserNo());
		            successCount += pdDPatientInspectionElectrocardiogramMapper.updateByExampleSelective(record, exp);
	        	}
	        }
	        
	        if (successCount > 0) {
	            result.setSuccessCount(successCount);
	            result.setRetMsg("删除成功");
	        } else {
	            result.setSuccessCount(successCount);
	            result.setRetMsg("该条信息已被其他用户修改，请刷新页面后重试");
	        }
	        return result;
	}

	@Override
	public JacksonCountReturn deleteOutPatientChildRow(PatientOutComeCondForm condition) {
		JacksonCountReturn rst = new JacksonCountReturn();
		int successCount=0;
		PdDPatientOutpatientEvaluation evaluation = new PdDPatientOutpatientEvaluation();
		evaluation.setId(condition.getId());
		Date now = new Date();
		evaluation.setDelFlag(DELETE_FLAG_1);
		evaluation.setDateModified(now);
		evaluation.setModifiedBy(getLoginUser().getUserNo());
		successCount=this.pdDPatientOutpatientEvaluationMapper.updateByPrimaryKeySelective(evaluation);
		rst.setSuccessCount(successCount);
		if(successCount==0){
			rst.setRetMsg("删除失败!");
		}else{
			rst.setRetMsg("删除成功!");
		}
		return rst;
	}

	@Override
	public JacksonPagginListReturn<PatientRstForm> getPeritonealDialysisData(PatientForm condform) {
		JacksonPagginListReturn<PatientRstForm> returnList = new JacksonPagginListReturn<>();
		int pagecount = getWebCommonDao().selectList("PatientListMapper.getPeritonealDialysisData", condform).getResultData().size();
		double maxpage = (double) pagecount / (double) condform.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (condform.getPageNumber() > maxpageSize) {
            condform.setPageNumber(maxpageSize);
        }
        ListResult<PatientRstForm> resultForm = getWebCommonDao().selectPaging(
                "PatientListMapper.getPeritonealDialysisData", condform,
                new Paging(condform.getPageNumber(), condform.getPageSize()));
        returnList.setData(resultForm.getResultData());
        returnList.setPageNumber(condform.getPageNumber());
        returnList.setPageCount(condform.getPageSize());
        returnList.setTotalCount(pagecount);
		return returnList;
	}

	@Override
	public JacksonPagginListReturn<PatientPeritonealDialysisRstForm> searchPeritonealDialysisEval(PatientForm form) {
		JacksonPagginListReturn<PatientPeritonealDialysisRstForm> rst = new JacksonPagginListReturn<>();
		if(Tools.isblank(form.getPatientId())){
			return rst;
		}
		ListResult<PatientPeritonealDialysisRstForm> patientEvalRstForms=getWebCommonDao()
				.selectList("PatientListMapper.getPatientPeritonealDialysis", form);
		rst.setData(patientEvalRstForms.getResultData());
		return rst;
	}

	@Override
	public JacksonCountReturn patientPeritonealSave(PatientPeritonealDialysisRstForm condition) {
		JacksonCountReturn rst = new JacksonCountReturn();
		Date now = new Date();
        int successCount = 0;
        PdDPatientDialysisAdequacy adequacy = new PdDPatientDialysisAdequacy();
        //新增
        if(Tools.isblank(condition.getId())){
        	String id = Tools.getFifteenUUID();
        	adequacy.setId(id);
        	adequacy.setHpId(condition.getHpId());
        	adequacy.setPtId(condition.getPatientId());
        	Date tDate = DateUtil.convertStringToDate(condition.gettDate());
        	adequacy.setTdate(tDate);
        	adequacy.setHeight(condition.getHeight());
        	adequacy.setWeight(condition.getWeight());
        	adequacy.setUrineVolume(condition.getUrineVolume());
        	adequacy.setUrineBun(condition.getUrineBUN());
        	adequacy.setUrineCr(condition.getUrineCr());
        	adequacy.setDrainageAmount(condition.getDrainageAmount());
        	adequacy.setDrainageBun(condition.getDrainageBUN());
        	adequacy.setDrainageCr(condition.getDrainageCr());
        	adequacy.setSerumBun(condition.getSerumBUN());
        	adequacy.setSerumCr(condition.getSerumCr());
        	adequacy.setResidualRenalCcr(condition.getResidualRenalCcr());
        	adequacy.setPeritonealDialysisCcr(condition.getPeritonealDialysisCcr());
        	adequacy.setTotalCcr(condition.getTotalCcr());
        	adequacy.setResidualRenalKt(condition.getResidualRenalKt());
        	adequacy.setPeritonealDialysisKt(condition.getPeritonealDialysisKt());
        	adequacy.setTotalKt(condition.getTotalKt());
        	adequacy.setEgfr(condition.geteGFR());
        	adequacy.setNpcr(condition.getnPCR());
        	adequacy.setDelFlag(DELETE_FLAG_0);
        	adequacy.setCreatedBy(getLoginUser().getUserNo());
        	adequacy.setDateCreated(now);
        	adequacy.setModifiedBy(getLoginUser().getUserNo());
        	adequacy.setDateModified(now);
        	successCount=this.pdDPatientDialysisAdequacyMapper.insert(adequacy);
        	if(successCount == 0){
        		rst.setRetMsg("新增腹透充分性失败！");
        	}else{
        		rst.setRetMsg("新增腹透充分性成功！");
        	}
        }else{//修改
        	adequacy.setId(condition.getId());
        	Date tDate = DateUtil.convertStringToDate(condition.gettDate());
        	adequacy.setTdate(tDate);
        	adequacy.setHeight(condition.getHeight());
        	adequacy.setWeight(condition.getWeight());
        	adequacy.setUrineVolume(condition.getUrineVolume());
        	adequacy.setUrineBun(condition.getUrineBUN());
        	adequacy.setUrineCr(condition.getUrineCr());
        	adequacy.setDrainageAmount(condition.getDrainageAmount());
        	adequacy.setDrainageBun(condition.getDrainageBUN());
        	adequacy.setDrainageCr(condition.getDrainageCr());
        	adequacy.setSerumBun(condition.getSerumBUN());
        	adequacy.setSerumCr(condition.getSerumCr());
        	adequacy.setResidualRenalCcr(condition.getResidualRenalCcr());
        	adequacy.setPeritonealDialysisCcr(condition.getPeritonealDialysisCcr());
        	adequacy.setTotalCcr(condition.getTotalCcr());
        	adequacy.setResidualRenalKt(condition.getResidualRenalKt());
        	adequacy.setPeritonealDialysisKt(condition.getPeritonealDialysisKt());
        	adequacy.setTotalKt(condition.getTotalKt());
        	adequacy.setEgfr(condition.geteGFR());
        	adequacy.setNpcr(condition.getnPCR());
        	adequacy.setModifiedBy(getLoginUser().getUserNo());
        	adequacy.setDateModified(now);
        	successCount=this.pdDPatientDialysisAdequacyMapper.updateByPrimaryKeySelective(adequacy);
        	if(successCount == 0){
        		rst.setRetMsg("修改腹透充分性失败！");
        	}else{
        		rst.setRetMsg("修改腹透充分性成功！");
        	}
        }
        rst.setSuccessCount(successCount);
		return rst;
	}
}
