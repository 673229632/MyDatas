package com.ustcsoft.pdqc.web.patient.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDialysisAdequacyMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInfoMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientOutcomeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientOutpatientEvaluationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCodeMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterKey;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialysisAdequacy;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialysisAdequacyKey;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfo;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfoKey;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutcome;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutcomeKey;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutpatientEvaluation;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutpatientEvaluationKey;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCode;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCodeExample;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.patient.constants.PatientListPageConstants;
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
import com.ustcsoft.pdqc.web.patient.service.PatientListService;
import com.ustcsoft.pdqc.web.patient.service.PatientOverViewService;

/**
 * @author lijun
 *	患者信息总览
 */
@Controller
@RequestMapping("/patientOverView")
public class PatientOverViewController extends WebBaseController{
	
	@Autowired
	private PatientOverViewService patientOverViewService;
	
	@Autowired
	private PatientListService patientListService;
	
	@Autowired
	private PdDPatientInfoMapper pdDPatientInfoMapper;
	
	@Autowired
	private PdDCenterMapper pdDCenterMapper;
	
	@Autowired
	private PdMCodeMapper pdMCodeMapper;
	
	@Autowired
	private PdDPatientOutcomeMapper pdDPatientOutcomeMapper;
	
	@Autowired
	private PdDPatientOutpatientEvaluationMapper pdDPatientOutpatientEvaluationMapper;
	
	@Autowired
	private PdDPatientDialysisAdequacyMapper pdDPatientDialysisAdequacyMapper;
	
	@Autowired
    WebCommonDao webCommonDao;
	
	@RequestMapping(value = "")
	public String init(ModelMap model){
		List<PdMCode> mCodes = this.patientOverViewService.getPatientViewCodes();
		List<Code> hospitalOptions = this.patientListService.getSelectHospitalOptions();
		model.addAttribute("hospitalOptions", hospitalOptions);
		model.addAttribute("mCodes", mCodes);
    	return PatientListPageConstants.PATIENT_OVER_VIEW_INIT;
	}
	
	/**
	 * 获得患者列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/getPatientData")
    @ResponseBody
	public JacksonPagginListReturn<PatientRstForm> getPatientData(PatientForm form){
		return this.patientOverViewService.getPatientData(form);
	}
	
	/**
	 * 获得患者列表(门诊评估)
	 * @param form
	 * @return
	 */
	@RequestMapping("/getOutPatientData")
    @ResponseBody
	public JacksonPagginListReturn<PatientRstForm> getOutPatientData(PatientForm form){
		return this.patientOverViewService.getOutPatientData(form);
	}
	
	/**
	 * 获得患者列表(腹透充分性)
	 * @param form
	 * @return
	 */
	@RequestMapping("/getPeritonealDialysisData")
	@ResponseBody
	public JacksonPagginListReturn<PatientRstForm> getPeritonealDialysisData(PatientForm form){
		return this.patientOverViewService.getPeritonealDialysisData(form);
	}
	/**
	 * 获得转归列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/searchChildOutcome")
	public JacksonPagginListReturn<PatientOutComeRstForm> searchChildOutcome(PatientForm form){
		return this.patientOverViewService.searchChildOutcome(form);
	}
	
	/**
	 * 获得门诊评估列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/searchOutPatientEval")
	public JacksonPagginListReturn<PatientEvalRstForm> searchOutPatientEval(PatientForm form){
		return this.patientOverViewService.searchOutPatientEval(form);
	}
	
	
	/**
	 * 获得腹透充分性列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/searchPeritonealDialysisEval")
	public JacksonPagginListReturn<PatientPeritonealDialysisRstForm> searchPeritonealDialysisEval(PatientForm form){
		return this.patientOverViewService.searchPeritonealDialysisEval(form);
	}
	/**
	 * 上报
	 * @param model
	 * @param editflag
	 * @param patientId
	 * @return
	 */
	@RequestMapping("/addChildOutComeProject")
	public String addChildOutComeProject(ModelMap model,String editflag,String patientId,String id){
		PatientOutComeCondForm condForm = new PatientOutComeCondForm();
		//退出类型子项目
		List<Code> exitCodes = this.patientOverViewService.getPdMCodeByParentCode("PD_OUT_2");
		//转出地点
		List<Code> turnOverPlaces= this.patientOverViewService.getPdMCodeByParentCode("PD_OUT_4_1");
		//转出原因
		List<Code> turnOverReason= this.patientOverViewService.getPdMCodeByParentCode("PD_OUT_4_2");
		//死亡类型子项目
		List<Code> deathCodes= this.patientOverViewService.getPdMCodeByParentCode("PD_OUT_3");
		//死亡原因(心血管事件)
		List<Code> cardiovascularReason= this.patientOverViewService.getPdMCodeByParentCode("PD_OUT_3_1");
		//死亡原因(脑血管事件)
		List<Code> cerebrovascularReason= this.patientOverViewService.getPdMCodeByParentCode("PD_OUT_3_2");
		//死亡原因(感染)
		List<Code> infectedReason= this.patientOverViewService.getPdMCodeByParentCode("PD_OUT_3_3");
		model.addAttribute("exitCodes", exitCodes);
		model.addAttribute("turnOverPlaces", turnOverPlaces);
		model.addAttribute("turnOverReason", turnOverReason);
		model.addAttribute("deathCodes", deathCodes);
		model.addAttribute("cardiovascularReason", cardiovascularReason);
		model.addAttribute("cerebrovascularReason", cerebrovascularReason);
		model.addAttribute("infectedReason", infectedReason);
		//新增
		if(editflag.equals("0")){
			condForm.setPatientId(patientId);
			PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
			infoKey.setId(patientId);
			PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
			String hpId = dPatientInfo.getHpId();
			condForm.setHpId(hpId);
			PdDCenterKey centerKey = new PdDCenterKey();
			centerKey.setPdCenterNo(hpId);
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			String hospitalName = dCenter.getPdCenterName();
			model.addAttribute("patientName", dPatientInfo.getName());
			model.addAttribute("hospitalName", hospitalName);
			//在科患者
			if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
				model.addAttribute("patientType", "在科患者");
			}else{
				model.addAttribute("patientType", "退出患者");
			}
			model.addAttribute("condForm", condForm);
		}else{//编辑
			PdDPatientOutcomeKey key = new PdDPatientOutcomeKey();
			key.setId(id);
			PdDPatientOutcome outcome = this.pdDPatientOutcomeMapper.selectByPrimaryKey(key);
			condForm.setId(id);
			condForm.setPatientId(outcome.getPtId());
			condForm.setHpId(outcome.getHpId());
			PdDCenterKey centerKey = new PdDCenterKey();
			centerKey.setPdCenterNo(outcome.getHpId());
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			String hospitalName = dCenter.getPdCenterName();
			PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
			infoKey.setId(outcome.getPtId());
			PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
			model.addAttribute("patientName", dPatientInfo.getName());
			model.addAttribute("hospitalName", hospitalName);
			//在科患者
			if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
				model.addAttribute("patientType", "在科患者");
			}else{
				model.addAttribute("patientType", "退出患者");
			}
			String outComeType=outcome.getOutcomeType();
			condForm.setOutComeDate(DateUtil.convertDateToString(outcome.getTdate()));
			condForm.setOutComeType(outComeType);
			//原因解析
			String reason=outcome.getReason();
			//退出类型的值
			String exitTypeContent="";
			//其它退出类型下拉框是否显示的标志(0:不显示,1:显示)
			String exitTypeOtherFlag="0";
			//其它退出类型的内容
			String exitTypeOtherContent="";
			//死亡原因(其它)是否显示的标志(0:不显示,1:显示)
			String deathReasonOtherFlag="0";
			//死亡原因其它内容
			String deathReasonOther="";
			//心血管事件是否显示的标志(0:不显示,1:显示)
			String cardiovascularFlag="0";
			//脑血管事件是否显示的标志(0:不显示,1:显示)
			String cerebrovascularFlag="0";
			//感染是否显示的标志(0:不显示,1:显示)
			String infectedFlag="0";
			//死亡原因内容
			String deathType="";
			//死亡2级菜单值
			String deathSecondVal="";
			//心血管其它显示标志
			String cardiovascularOtherFlag="0";
			//心血管其它内容
			String cardiovascularOtherContent="";
			//脑血管事件其它显示标志
			String cerebrovascularOtherFlag="0";
			//脑血管事件其它内容
			String cerebrovascularOtherContent="";
			//感染事件其它显示标志
			String infectedOtherFlag="0";
			//感染事件其它内容
			String infectedOtherContent="";
			//转出地点值
			String turnOverPlaceContent="";
			//转出原因
			String turnOverReasonContent="";
			//转出原因其它显示标志
			String turnOverReasonOtherFlag="0";
			//转出原因其它内容
			String turnOverReasonOtherContent="";
			//退出患者
			if(outComeType.equals("PD_OUT_2")){
				String[] reasons=reason.split(",");
				for(int i=0;i<reasons.length;i++){
					if(i==0){
						String reason01=reasons[i];
						String[] reasonChild=reason01.split(":");
						if(!reasonChild[1].equals("null")){
							exitTypeContent=reasonChild[1];
						}
					}else{
						exitTypeOtherFlag="1";
						exitTypeContent="PD_OUT_2_5";
						String reason01=reasons[i];
						String[] reasonChild=reason01.split(":");
						if(!reasonChild[1].equals("null")){
							exitTypeOtherContent=reasonChild[1];
						}
					}
				}
			}else if(outComeType.equals("PD_OUT_3")){//死亡患者
				String[] reasons=reason.split(",");
				for(int i=0;i<reasons.length;i++){
					String reasonChild=reasons[i];
					if(i==1){
						String[] reasonChild01=reasonChild.split(":");
						String reasonChild02=reasonChild01[0];
						String reasonChild03=reasonChild01[1];
						deathType=reasonChild02;
						if(reasonChild02.equals("PD_OUT_3_1")){
							cardiovascularFlag="1";
						}else if(reasonChild02.equals("PD_OUT_3_2")){
							cerebrovascularFlag="1";
						}else if(reasonChild02.equals("PD_OUT_3_3")){
							infectedFlag="1";
						}
						if(!reasonChild03.equals("null")){
							deathSecondVal=reasonChild03;
						}
					}else if(i==2){
						String[] reasonChild01=reasonChild.split(":");
						String reasonChild02=reasonChild01[0];
						String reasonChild03=reasonChild01[1];
						if(reasonChild02.equals("PD_OUT_3_1_4")){
							cardiovascularOtherFlag="1";
							cardiovascularOtherContent=reasonChild03;
						}else if(reasonChild02.equals("PD_OUT_3_2_3")){
							cerebrovascularOtherFlag="1";
							cerebrovascularOtherContent=reasonChild03;
						}else if(reasonChild02.equals("PD_OUT_3_3_5")){
							infectedOtherFlag="1";
							infectedOtherContent=reasonChild03;
						}
					}
				}
			}else if(outComeType.equals("PD_OUT_4")){//转出患者
				String[] reasons=reason.split(",");
				for(int i=0;i<reasons.length;i++){
					if(i==0){
						String reasons01=reasons[i];
						String[] reasonsChild=reasons01.split(":");
						if(!reasonsChild[1].equals("null")){
							turnOverPlaceContent=reasonsChild[1];
						}
					}else if(i==1){
						String reasons01=reasons[i];
						String[] reasonsChild=reasons01.split(":");
						if(!reasonsChild[1].equals("null")){
							turnOverReasonContent=reasonsChild[1];
						}
					}else if(i==2){
						turnOverReasonContent="PD_OUT_4_2_4";
						turnOverReasonOtherFlag="1";
						String reasons01=reasons[i];
						String[] reasonsChild=reasons01.split(":");
						if(!reasonsChild[1].equals("null")){
							turnOverReasonOtherContent=reasonsChild[1];
						}
					}
				}
			}
			model.addAttribute("deathReasonOther", deathReasonOther);
			model.addAttribute("deathReasonOtherFlag", deathReasonOtherFlag);
			model.addAttribute("infectedOtherContent", infectedOtherContent);
			model.addAttribute("infectedOtherFlag", infectedOtherFlag);
			model.addAttribute("infectedFlag", infectedFlag);
			model.addAttribute("cerebrovascularOtherContent", cerebrovascularOtherContent);
			model.addAttribute("cerebrovascularOtherFlag", cerebrovascularOtherFlag);
			model.addAttribute("cerebrovascularFlag", cerebrovascularFlag);
			model.addAttribute("cardiovascularOtherContent", cardiovascularOtherContent);
			model.addAttribute("cardiovascularFlag", cardiovascularFlag);
			model.addAttribute("cardiovascularOtherFlag", cardiovascularOtherFlag);
			model.addAttribute("deathSecondVal", deathSecondVal);
			model.addAttribute("deathType", deathType);
			model.addAttribute("turnOverReasonOtherFlag", turnOverReasonOtherFlag);
			model.addAttribute("turnOverReasonContent", turnOverReasonContent);
			model.addAttribute("turnOverPlaceContent", turnOverPlaceContent);
			model.addAttribute("turnOverReasonOtherContent", turnOverReasonOtherContent);
			model.addAttribute("exitTypeOtherContent", exitTypeOtherContent);
			model.addAttribute("exitTypeContent", exitTypeContent);
			model.addAttribute("exitTypeOtherFlag", exitTypeOtherFlag);
			model.addAttribute("condForm", condForm);
			return PatientListPageConstants.PATIENT_OVER_OUT_COME_EDIT;
		}
		
		return PatientListPageConstants.PATIENT_OVER_OUT_COME_ADD;
	}
	
	
	/**
	 * 上报(门诊评估)
	 * @param model
	 * @param editflag
	 * @param patientId
	 * @param id
	 * @return
	 */
	@RequestMapping("/addOutPatientChildProject")
	public String addOutPatientChildProject(ModelMap model,String editflag,String patientId,String id){
		PatientEvalRstForm condForm = new PatientEvalRstForm();
		//新增
		if(editflag.equals("0")){
			condForm.setPatientId(patientId);
			PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
			infoKey.setId(patientId);
			PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
			String hpId = dPatientInfo.getHpId();
			condForm.setHpId(hpId);
			PdDCenterKey centerKey = new PdDCenterKey();
			centerKey.setPdCenterNo(hpId);
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			String hospitalName = dCenter.getPdCenterName();
			model.addAttribute("patientName", dPatientInfo.getName());
			model.addAttribute("hospitalName", hospitalName);
			//在科患者
			if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
				model.addAttribute("patientType", "在科患者");
			}else{
				model.addAttribute("patientType", "退出患者");
			}
			model.addAttribute("condForm", condForm);
		}else{
			condForm.setPatientId(patientId);
			PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
			infoKey.setId(patientId);
			PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
			String hpId = dPatientInfo.getHpId();
			condForm.setHpId(hpId);
			PdDCenterKey centerKey = new PdDCenterKey();
			centerKey.setPdCenterNo(hpId);
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			String hospitalName = dCenter.getPdCenterName();
			model.addAttribute("patientName", dPatientInfo.getName());
			model.addAttribute("hospitalName", hospitalName);
			//在科患者
			if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
				model.addAttribute("patientType", "在科患者");
			}else{
				model.addAttribute("patientType", "退出患者");
			}
			PdDPatientOutpatientEvaluationKey key = new PdDPatientOutpatientEvaluationKey();
			key.setId(id);
			PdDPatientOutpatientEvaluation outpatientEvaluation =
						this.pdDPatientOutpatientEvaluationMapper.selectByPrimaryKey(key);
			condForm.setId(id);
			String patientEvalDate=DateUtil.convertDateToString(outpatientEvaluation.getTdate());
			condForm.setPatientEvalDate(patientEvalDate);
			condForm.setWeight(outpatientEvaluation.getWeight());
			condForm.setBmi(outpatientEvaluation.getBmi());
			String bloodPresure = outpatientEvaluation.getBloodPressure();
			if(!Tools.isblank(bloodPresure)){
				String[] bloodPresures = bloodPresure.split("/");
				String prebphigh="";
				if(!bloodPresures[0].equals("%")){
					prebphigh=bloodPresures[0];
				}
				String prebplow="";
				if(!bloodPresures[1].equals("%")){
					prebplow=bloodPresures[1];
				}
				condForm.setPrebphigh(prebphigh);
				condForm.setPrebplow(prebplow);
			}
			condForm.setUltrafiltration(outpatientEvaluation.getUltrafiltration());
			condForm.setUrinaryProduction(outpatientEvaluation.getUrunaryProduction());
			condForm.setCardiacFunctionLevel(outpatientEvaluation.getCardiacFunctionLevel());
			condForm.setEdemaGrade(outpatientEvaluation.getEdemaGrade());
			condForm.setAlimentarySymptoms(outpatientEvaluation.getAlimentarySymptoms());
			condForm.setOtherSymptoms(outpatientEvaluation.getOtherSymptoms());
			condForm.setCatheterOutAssessment(outpatientEvaluation.getCatherOutAssessment());
			condForm.setCatheterOutScore(outpatientEvaluation.getCatherOutScore());
			condForm.setWeightChange(outpatientEvaluation.getWeightChange());
			condForm.setDietChange(outpatientEvaluation.getDietChange());
			condForm.setGastrointestinalSymptoms(outpatientEvaluation.getGastrointestinalSymptoms());
			condForm.setActivityAbility(outpatientEvaluation.getActivityAbility());
			condForm.setComplication(outpatientEvaluation.getComplication());
			condForm.setSubcutaneousFat(outpatientEvaluation.getSubcutaneousFat());
			model.addAttribute("condForm", condForm);
		}
		return PatientListPageConstants.PATIENT_EVA_OUT_COME_ADD;
	}
	
	/**
	 * 腹透充分性(上报)
	 * @param model
	 * @param editflag
	 * @param patientId
	 * @param id
	 * @return
	 */
	@RequestMapping("/peritonealDialysisReport")
	public String peritonealDialysisReport(ModelMap model,String editflag,String patientId,String id){
		PatientPeritonealDialysisRstForm dialysisRstForm = new PatientPeritonealDialysisRstForm();
		if(editflag.equals("0")){
			dialysisRstForm.setPatientId(patientId);
			PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
			infoKey.setId(patientId);
			PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
			String hpId = dPatientInfo.getHpId();
			//dialysisRstForm.setHpId(hpId);
			PdDCenterKey centerKey = new PdDCenterKey();
			centerKey.setPdCenterNo(hpId);
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			String hospitalName = dCenter.getPdCenterName();
			model.addAttribute("patientName", dPatientInfo.getName());
			model.addAttribute("hospitalName", hospitalName);
			//在科患者
			if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
				model.addAttribute("patientType", "在科患者");
			}else{
				model.addAttribute("patientType", "退出患者");
			}
			model.addAttribute("dialysisRstForm", dialysisRstForm);
		}else{
			dialysisRstForm.setPatientId(patientId);
			PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
			infoKey.setId(patientId);
			PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
			String hpId = dPatientInfo.getHpId();
			//condForm.setHpId(hpId);
			PdDCenterKey centerKey = new PdDCenterKey();
			centerKey.setPdCenterNo(hpId);
			PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
			String hospitalName = dCenter.getPdCenterName();
			model.addAttribute("patientName", dPatientInfo.getName());
			model.addAttribute("hospitalName", hospitalName);
			//在科患者
			if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
				model.addAttribute("patientType", "在科患者");
			}else{
				model.addAttribute("patientType", "退出患者");
			}
			PdDPatientDialysisAdequacyKey adequacyKey = new PdDPatientDialysisAdequacyKey();
			adequacyKey.setId(id);
			PdDPatientDialysisAdequacy adequacy = this.pdDPatientDialysisAdequacyMapper.selectByPrimaryKey(adequacyKey);
			String tDate=DateUtil.convertDateToString(adequacy.getTdate());
			dialysisRstForm.settDate(tDate);
			dialysisRstForm.setHeight(adequacy.getHeight());
			dialysisRstForm.setWeight(adequacy.getWeight());
			dialysisRstForm.setUrineVolume(adequacy.getUrineVolume());
			dialysisRstForm.setUrineBUN(adequacy.getUrineBun());
			dialysisRstForm.setUrineCr(adequacy.getUrineCr());
			dialysisRstForm.setDrainageAmount(adequacy.getDrainageAmount());
			dialysisRstForm.setDrainageBUN(adequacy.getDrainageBun());
			dialysisRstForm.setDrainageCr(adequacy.getDrainageCr());
			dialysisRstForm.setSerumBUN(adequacy.getSerumBun());
			dialysisRstForm.setSerumCr(adequacy.getSerumCr());
			dialysisRstForm.setResidualRenalCcr(adequacy.getResidualRenalCcr());
			dialysisRstForm.setPeritonealDialysisCcr(adequacy.getPeritonealDialysisCcr());
			dialysisRstForm.setTotalCcr(adequacy.getTotalCcr());
			dialysisRstForm.setResidualRenalKt(adequacy.getResidualRenalKt());
			dialysisRstForm.setPeritonealDialysisKt(adequacy.getPeritonealDialysisKt());
			dialysisRstForm.setTotalKt(adequacy.getTotalKt());
			dialysisRstForm.seteGFR(adequacy.getEgfr());
			dialysisRstForm.setnPCR(adequacy.getNpcr());
			model.addAttribute("dialysisRstForm", dialysisRstForm);
		}
		return PatientListPageConstants.PATIENT_PERITONEAL_DIALYSIS_ADD;
	}
	/**
	 * 保存编辑转归信息
	 * @param condition
	 * @return
	 */
	@RequestMapping("/saveOutcome")
	public JacksonCountReturn saveOutcome(PatientOutComeCondForm condition){
		return this.patientOverViewService.saveOutcome(condition);
	}
	
	
	/**
	 * 删除转归信息
	 * @param condition
	 * @return
	 */
	@RequestMapping("/deleteOutComeRow")
	public JacksonCountReturn deleteOutComeRow(PatientOutComeCondForm condition){
		return this.patientOverViewService.deleteOutComeRow(condition);
	}
	
	
	/**
	 * 删除门诊评估信息
	 * @return
	 */
	@RequestMapping("/deleteOutPatientChildRow")
	public JacksonCountReturn deleteOutPatientChildRow(PatientOutComeCondForm condition){
		return this.patientOverViewService.deleteOutPatientChildRow(condition);
	}
	/**
	 * 获得置管手术患者列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/getCatheterOperationPatient")
    @ResponseBody
	public JacksonPagginListReturn<PatientRstForm> getCatheterOperationPatient(PatientForm form){
		return this.patientOverViewService.getCatheterOperationPatient(form);
	}
	
	/**
	 * 获得置管手术列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/catheterOperation")
	public JacksonPagginListReturn<PatientOutComeRstForm> catheterOperation(PatientForm form){
		return this.patientOverViewService.catheterOperation(form);
	}
	
	/**
	 * 置管上报
	 * @param model
	 * @param editflag
	 * @param patientId
	 * @return
	 */
	@RequestMapping("/catheterOperationReport")
	public String catheterOperationReport(ModelMap model,String editflag,String patientId,String id){
		CatheterOperationReportForm  condForm = new CatheterOperationReportForm();
		condForm.setPatientId(patientId);
		PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
		infoKey.setId(patientId);
		PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
		String hpId = dPatientInfo.getHpId();
		condForm.setHpId(hpId);
		PdDCenterKey centerKey = new PdDCenterKey();
		centerKey.setPdCenterNo(hpId);
		PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
		String hospitalName = dCenter.getPdCenterName();
		model.addAttribute("patientName", dPatientInfo.getName());
		model.addAttribute("hospitalName", hospitalName);
		//在科患者
		if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
			model.addAttribute("patientType", "在科患者");
		}else{
			model.addAttribute("patientType", "退出患者");
		}
		//新增
		if(editflag.equals("0")){
			model.addAttribute("condForm", condForm);
		} else if(editflag.equals("1")){// 编辑
			CatheterOperationReportForm catheterOperation = new CatheterOperationReportForm();
			condForm.setId(id);
			JacksonPagginListReturn<CatheterOperationReportForm> editCatheterOperationList = patientOverViewService.getcatheterOperationMessage(condForm);
			List<CatheterOperationReportForm> editList = editCatheterOperationList.getData();
			if (!Tools.listisblank(editList)) {
				catheterOperation = editList.get(0);
			}
			model.addAttribute("condForm", catheterOperation);
		}
		return PatientListPageConstants.CATHETER_OPERATION_REPORT;
	}
	
		/**
	 * 保存编辑置管手术信息
	 * @param condition
	 * @return
	 */
	@RequestMapping("/catheterSave")
	public JacksonCountReturn catheterSave(CatheterOperationReportForm condition){
		return this.patientOverViewService.catheterSave(condition);
	}
	
    
	
	/**
     * 删除置管手术信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteCatheterOperation")
    public JacksonCountReturn deleteCatheterOperation(CatheterOperationReportForm condition) {
        return patientOverViewService.deleteCatheterOperation(condition);
    }
    
    /**
     * 获得用药处方患者列表
     * @param form
     * @return
     */
    @RequestMapping("/getMedicationPatient")
        @ResponseBody
    public JacksonPagginListReturn<PatientRstForm> getMedicationPatient(PatientForm condForm){
        return this.patientOverViewService.getMedicationPatient(condForm);
    }
    
    /**
     * 获得用药处方列表
     * @param form
     * @return
     */
    @RequestMapping("/getMedicationList")
    public JacksonPagginListReturn<MedicationResultForm> getMedicationList(MedicationCondForm condForm){
        return patientOverViewService.getMedicationList(condForm);
    }
    
    /**
     * 编辑用药处方页面
     */
    @RequestMapping("/editMedication")
    public String reportMedication(ModelMap model,String patientId,String id) {
        // 设置返回实体类
        MedicationResultForm medicationResultForm = new MedicationResultForm();
        
        if (!Tools.isblank(id)) {
            // 当编辑时(id不为空)设置设置返回实体类属性
            MedicationCondForm condForm = new MedicationCondForm();
            condForm.setMedicationId(id);
            JacksonPagginListReturn<MedicationResultForm> listResult = patientOverViewService.getMedicationList(condForm);
            if (!Tools.listisblank(listResult.getData())) {
                medicationResultForm = listResult.getData().get(0);
            }
        } else {
            // 当上报时（id为空）设置患者基础属性
            PatientForm patientCondForm = new PatientForm();
            patientCondForm.setPatientId(patientId);
            ListResult<PatientRstForm> roleCountList = webCommonDao.selectList("PatientListMapper.getPatientInfoById", patientCondForm);
            if (!Tools.listisblank(roleCountList.getResultData())) {
                PatientRstForm patientRstForm = roleCountList.getResultData().get(0);
                medicationResultForm.setPatientName(patientRstForm.getPatientName());
                medicationResultForm.setHospitalName(patientRstForm.getHospitalName());
                medicationResultForm.setPatientOutcomeName(patientRstForm.getPatientType());
                medicationResultForm.setPtId(patientRstForm.getPatientId());
                medicationResultForm.setHpId(patientRstForm.getHospitalNo());
//                medicationResultForm.setType("PDYY01");
//                medicationResultForm.setType2("PDYY0101");
//                medicationResultForm.setType3("PDYY010101");
            }
        }
        model.addAttribute("resultForm", medicationResultForm);
        // 用药类型下拉框
        List<Code> typeCodeList = new ArrayList<Code>();
        PdMCodeExample pdMCodeExample = new PdMCodeExample();
        PdMCodeExample.Criteria pdMCodeCriteria = pdMCodeExample.createCriteria();
        pdMCodeCriteria.andParentCodeEqualTo("PDYY");
        List<PdMCode> typeList = pdMCodeMapper.selectByExample(pdMCodeExample);
        for (PdMCode pdMCode : typeList) {
            Code code = new Code();
            code.setText(pdMCode.getValue());
            code.setValue(pdMCode.getCode());
            typeCodeList.add(code);
        }
        model.addAttribute("typeCodeList", typeCodeList);
        return PatientListPageConstants.MEDICATION_EDIT;
    }
    
    /**
     * 改变type选项获取type2下拉框的值
     */
    @RequestMapping("/changeSelectPickerType")
    public JacksonReturn changeSelectPickerType(String supperType) {
        return patientOverViewService.changeSelectPickerType(supperType);
    }
    
    /**
     * 保存用药处方
     */
    @RequestMapping("/saveMedication")
    public JacksonCountReturn saveMedication(MedicationResultForm medicationResultForm) {
        return patientOverViewService.saveMedication(medicationResultForm);
    }
    
    /**
     * 删除用药处方
     * @param id
     * @return
     */
    @RequestMapping("/deleteMedication")
    public JacksonCountReturn deleteMedication(MedicationResultForm condForm) {
        return patientOverViewService.deleteMedication(condForm);
    }
    
    /**
     * 获得透析方案患者列表
     * @param form
     * @return
     */
    @RequestMapping("/getDialysisPatient")
    @ResponseBody
    public JacksonPagginListReturn<PatientRstForm> getDialysisPatient(PatientForm condform){
        return this.patientOverViewService.getDialysisPatient(condform);
    }
    
    /**
     * 获得透析方案列表
     * @param form
     * @return
     */
    @RequestMapping("/getDialysisSolution")
    public JacksonPagginListReturn<DialysisSolutionListForm> getDialysisSolution(PatientForm condform){
        return this.patientOverViewService.getDialysisSolution(condform);
    }
    
    /**
     * 透析上报
     * @param model
     * @param editflag
     * @param patientId
     * @return
     */
    @RequestMapping("/dialysisPatientReport")
    public String dialysisPatientReport(ModelMap model,String editflag,String patientId,String id){
        DialysisSolutionForm  condForm = new DialysisSolutionForm();
        PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
        infoKey.setId(patientId);
        PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
        String hpId = dPatientInfo.getHpId();
        condForm.setHpId(hpId);
        PdDCenterKey centerKey = new PdDCenterKey();
        centerKey.setPdCenterNo(hpId);
        PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
        String hospitalName = dCenter.getPdCenterName();
        model.addAttribute("patientName", dPatientInfo.getName());
        model.addAttribute("hospitalName", hospitalName);
        //在科患者
        if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
            model.addAttribute("patientType", "在科患者");
        }else{
            model.addAttribute("patientType", "退出患者");
        }
        model.addAttribute("condForm", condForm);
        //新增
        if(editflag.equals("0")){
            condForm.setPatientId(patientId);
        } else if(editflag.equals("1")){// 编辑
            DialysisSolutionForm dialysisSolution = new DialysisSolutionForm();
            condForm.setId(id);
            JacksonPagginListReturn<DialysisSolutionForm> editDialysisSolutionList = patientOverViewService.getDialysisSolutionMessage(condForm);
            List<DialysisSolutionForm> editList = editDialysisSolutionList.getData();
            if (!Tools.listisblank(editList)) {
                dialysisSolution = editList.get(0);
            }
            //在科患者
            if("PD_OUT_1".equals(dialysisSolution.getPatientType())){
                model.addAttribute("patientType", "在科患者");
            }else{
                model.addAttribute("patientType", "退出患者");
            }
            model.addAttribute("condForm", dialysisSolution);
        }
        return PatientListPageConstants.DIALYSIS_PATIENT_REPORT;
    }
    
        /**
 * 保存编辑透析方案
 * @param condition
 * @return
 */
@RequestMapping("/solutionSave")
public JacksonCountReturn solutionSave(DialysisSolutionForm condition){
    return this.patientOverViewService.solutionSave(condition);
}
/**
 * 删除透析方案
 * @param id
 * @return
 */
@RequestMapping("/deleteDialysisSolution")
public JacksonCountReturn deleteDialysisSolution(DialysisSolutionForm condition) {
    return patientOverViewService.deleteDialysisSolution(condition);
}

/**
 * 获得腹膜平衡实验患者列表
 * @param form
 * @return
 */
    @RequestMapping("/getExperimentPatient")
        @ResponseBody
    public JacksonPagginListReturn<PatientRstForm> getExperimentPatient(PatientForm condform){
        return this.patientOverViewService.getExperimentPatient(condform);
    }

    /**
     * 获得腹膜平衡实验列表
     * @param form
     * @return
     */
    @RequestMapping("/getBalanceExperiment")
    public JacksonPagginListReturn<BalanceExperimentListForm> getBalanceExperiment(PatientForm condform){
        return this.patientOverViewService.getBalanceExperiment(condform);
    }

    /**
     * 腹膜平衡实验数据上报及编辑
     * @param model
     * @param editflag
     * @param patientId
     * @return
     */
    @RequestMapping("/balanceExperimentReport")
    public String balanceExperimentReport(ModelMap model,String editflag,String patientId,String id){
        BalanceExperimentForm  condForm = new BalanceExperimentForm();
        PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
        infoKey.setId(patientId);
        PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
        String hpId = dPatientInfo.getHpId();
        condForm.setHpId(hpId);
        PdDCenterKey centerKey = new PdDCenterKey();
        centerKey.setPdCenterNo(hpId);
        PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
        String hospitalName = dCenter.getPdCenterName();
        model.addAttribute("patientName", dPatientInfo.getName());
        model.addAttribute("hospitalName", hospitalName);
        //在科患者
        if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
            model.addAttribute("patientType", "在科患者");
        }else{
            model.addAttribute("patientType", "退出患者");
        }
        model.addAttribute("condForm", condForm);
        //新增
        if(editflag.equals("0")){
            condForm.setPatientId(patientId);
        } else if(editflag.equals("1")){// 编辑
            BalanceExperimentForm balanceExperiment = new BalanceExperimentForm();
            condForm.setId(id);
            JacksonPagginListReturn<BalanceExperimentForm> editBalanceExperimentList = patientOverViewService.getBalanceExperimentMessage(condForm);
            List<BalanceExperimentForm> editList = editBalanceExperimentList.getData();
            if (!Tools.listisblank(editList)) {
                balanceExperiment = editList.get(0);
            }
            model.addAttribute("condForm", balanceExperiment);
        }
        return PatientListPageConstants.Balance_Experiment_Report;
    }

    /**
    * 保存平衡实验数据
    * @param condition
    * @return
    */
    @RequestMapping("/experimentSave")
    public JacksonCountReturn experimentSave(BalanceExperimentForm condition){
    	return this.patientOverViewService.experimentSave(condition);
    }

    /**
     * 删除平衡实验数据
     * @param id
     * @return
     */
    @RequestMapping("/deleteBalanceExperiment")
    public JacksonCountReturn deleteBalanceExperiment(BalanceExperimentListForm condition) {
        return patientOverViewService.deleteBalanceExperiment(condition);
    }
    
    /**
 * 获得合并症患者列表
 * @param form
 * @return
 */
@RequestMapping("/getComplicationPatient")
    @ResponseBody
public JacksonPagginListReturn<PatientRstForm> getComplicationPatient(PatientForm condform){
    return this.patientOverViewService.getComplicationPatient(condform);
}

/**
 * 获得腹膜平衡实验列表
 * @param form
 * @return
 */
@RequestMapping("/getComplication")
public JacksonPagginListReturn<ComplicationForm> getComplication(PatientForm condform){
    return this.patientOverViewService.getComplication(condform);
}

/**
 * 合并症上报及编辑
 * @param model
 * @param editflag
 * @param patientId
 * @return
 */
@RequestMapping("/complicationReport")
public String complicationReport(ModelMap model,String editflag,String patientId,String id){
    ComplicationForm  condForm = new ComplicationForm();
    PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
    infoKey.setId(patientId);
    PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
    String hpId = dPatientInfo.getHpId();
    condForm.setHpId(hpId);
    PdDCenterKey centerKey = new PdDCenterKey();
    centerKey.setPdCenterNo(hpId);
    PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
    String hospitalName = dCenter.getPdCenterName();
    model.addAttribute("patientName", dPatientInfo.getName());
    model.addAttribute("hospitalName", hospitalName);
    //在科患者
    if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
        model.addAttribute("patientType", "在科患者");
    }else{
        model.addAttribute("patientType", "退出患者");
    }
    model.addAttribute("condForm", condForm);
    //新增
    if(editflag.equals("0")){
        condForm.setPatientId(patientId);
    } else if(editflag.equals("1")){// 编辑
        ComplicationForm complication = new ComplicationForm();
        condForm.setId(id);
        JacksonPagginListReturn<ComplicationForm> editBalanceExperimentList = patientOverViewService.getComplicationMessage(condForm);
        List<ComplicationForm> editList = editBalanceExperimentList.getData();
        if (!Tools.listisblank(editList)) {
            complication = editList.get(0);
        }
        model.addAttribute("condForm", complication);
    }
    return PatientListPageConstants.Complication;
}

	/**
	* 保存合并症数据
	* @param condition
	* @return
	*/
	@RequestMapping("/complicationSave")
	public JacksonCountReturn complicationSave(ComplicationPictureForm condition){
		return this.patientOverViewService.complicationSave(condition);
	}

	/**
	 * 删除合并症数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteComplication")
	public JacksonCountReturn deleteComplication(ComplicationForm condition) {
	    return patientOverViewService.deleteComplication(condition);
	}
    
    
    
    
	/**
	 * 获得患者随访患者列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/getFollowUpPatient")
	@ResponseBody
	public JacksonPagginListReturn<PatientRstForm> getFollowUpPatient(PatientForm condform){
	    return this.patientOverViewService.getFollowUpPatient(condform);
	}
	/**
	 * 获得患者随访列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/getFollowUpSolution")
	public JacksonPagginListReturn<FollowUpSolutionForm> getFollowUpSolution(FollowUpSolutionForm form){
	    return this.patientOverViewService.getFollowUpSolution(form);
	}
/**
 * 患者随访上报/编辑画面初始化
 * @param model
 * @param editflag
 * @param patientId
 * @return
 */
@RequestMapping("/followUpPatientEdit")
public String followUpPatientEdit(ModelMap model,String editflag,String patientId,String id){
    FollowUpSolutionForm  condForm = new FollowUpSolutionForm();
    PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
    infoKey.setId(patientId);
    PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
    String hpId = dPatientInfo.getHpId();
    condForm.setHpId(hpId);
    condForm.setPatientId(patientId);
    PdDCenterKey centerKey = new PdDCenterKey();
    centerKey.setPdCenterNo(hpId);
    PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
    String hospitalName = dCenter.getPdCenterName();
    model.addAttribute("patientName", dPatientInfo.getName());
    model.addAttribute("hospitalName", hospitalName);
    //在科患者
    if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
        model.addAttribute("patientType", "在科患者");
    }else{
        model.addAttribute("patientType", "退出患者");
    }
    model.addAttribute("condForm", condForm);
    //新增
        if(editflag.equals("0")){
            condForm.setPatientId(patientId);
        } else if(editflag.equals("1")){// 编辑
            FollowUpSolutionForm followUpSolutionForm = new FollowUpSolutionForm();
            condForm.setId(id);
            JacksonPagginListReturn<FollowUpSolutionForm> followUpSolutionFormList = patientOverViewService.getFollowUpPatientMessage(condForm);
            List<FollowUpSolutionForm> editList = followUpSolutionFormList.getData();
            if (!Tools.listisblank(editList)) {
                followUpSolutionForm = editList.get(0);
                String[] bloodPressure = followUpSolutionForm.getBloodPressure().split("/");
                if("%".equals(bloodPressure[0])){
                    followUpSolutionForm.setPrebphigh("");
                }else{
                    followUpSolutionForm.setPrebphigh(bloodPressure[0]);
                }
                if("%".equals(bloodPressure[1])){
                    followUpSolutionForm.setPrebplow("");
                }else{
                    followUpSolutionForm.setPrebplow(bloodPressure[1]);
                }
                String[] bloodGlucose =  followUpSolutionForm.getBloodGlucose().split(",");
                if("%".equals(bloodGlucose[0])){
                    followUpSolutionForm.setFasting("");
                }else{
                    followUpSolutionForm.setFasting(bloodGlucose[0]);
                }
                if("%".equals(bloodGlucose[1])){
                    followUpSolutionForm.setAfterBreakfast("");
                }else{
                    followUpSolutionForm.setAfterBreakfast(bloodGlucose[1]);
                }
                if("%".equals(bloodGlucose[2])){
                    followUpSolutionForm.setBeforeLunch("");
                }else{
                    followUpSolutionForm.setBeforeLunch(bloodGlucose[2]);
                }
                if("%".equals(bloodGlucose[3])){
                    followUpSolutionForm.setAfterLunch("");
                }else{
                    followUpSolutionForm.setAfterLunch(bloodGlucose[3]);
                }
                if("%".equals(bloodGlucose[4])){
                    followUpSolutionForm.setBeforeDinner("");
                }else{
                    followUpSolutionForm.setBeforeDinner(bloodGlucose[4]);
                }
                if("%".equals(bloodGlucose[5])){
                    followUpSolutionForm.setAfterDinner("");
                }else{
                    followUpSolutionForm.setAfterDinner(bloodGlucose[5]);
                }
                if("%".equals(bloodGlucose[6])){
                    followUpSolutionForm.setBeforeSlepp("");
                }else{
                    followUpSolutionForm.setBeforeSlepp(bloodGlucose[6]);
                }
                
            }
            model.addAttribute("condForm", followUpSolutionForm);
        }
    return PatientListPageConstants.FOLLOW_UP_EDIT;
    
}

	/**
	* 保存患者随访数据
	* @param condition
	* @return
	*/
	@RequestMapping("/followUpPatientSave")
	public JacksonCountReturn followUpPatientSave(FollowUpSolutionForm condition){
		return this.patientOverViewService.followUpPatientSave(condition);
	}

	/**
	 * 保存门诊评估数据
	 * @param condition
	 * @return
	 */
	@RequestMapping("/patientEvaOutSave")
	public JacksonCountReturn patientEvaOutSave(PatientEvalRstForm condition){
		return this.patientOverViewService.patientEvaOutSave(condition);
	}
	
	/**
	 * 腹透充分性保存
	 * @param condition
	 * @return
	 */
	@RequestMapping("/patientPeritonealSave")
	public JacksonCountReturn patientPeritonealSave(PatientPeritonealDialysisRstForm condition){
		return this.patientOverViewService.patientPeritonealSave(condition);
	}
	/**
	 * 删除患者随访数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/delFollowUpPatient")
	public JacksonCountReturn delFollowUpPatient(FollowUpSolutionForm condition) {
	    return patientOverViewService.delFollowUpPatient(condition);
	}

	/**
	* 获得检验检查患者列表
	* @param form
	* @return
	*/
	@RequestMapping("/getInspectionCheckPatient")
	@ResponseBody
	public JacksonPagginListReturn<PatientRstForm> getInspectionCheckPatient(PatientForm condform){
		return this.patientOverViewService.getInspectionCheckPatient(condform);
	}
	
	/**
	 * 检验检查上报及编辑
	 * @param model
	 * @param editflag
	 * @param patientId
	 * @return
	 */
	@RequestMapping("/inspectionCheckReport")
	public String inspectionCheckReport(ModelMap model,String editflag,String patientId,String id){
		InspectionCheckForm  condForm = new InspectionCheckForm();
		PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
		infoKey.setId(patientId);
		PdDPatientInfo dPatientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
		String hpId = dPatientInfo.getHpId();
		condForm.setHpId(hpId);
		PdDCenterKey centerKey = new PdDCenterKey();
		centerKey.setPdCenterNo(hpId);
		PdDCenter dCenter = this.pdDCenterMapper.selectByPrimaryKey(centerKey);
		String hospitalName = dCenter.getPdCenterName();
		model.addAttribute("patientName", dPatientInfo.getName());
		model.addAttribute("hospitalName", hospitalName);
		//在科患者
		if("PD_OUT_1".equals(dPatientInfo.getOutcomeType())){
			model.addAttribute("patientType", "在科患者");
		}else{
			model.addAttribute("patientType", "退出患者");
		}
		//新增
		if(editflag.equals("0")){
			condForm.setPatientId(patientId);
			model.addAttribute("vis_1", true);
			model.addAttribute("vis_2", true);
			model.addAttribute("vis_3", true);
			model.addAttribute("vis_4", true);
			model.addAttribute("vis_5", true);
			model.addAttribute("vis_6", true);
			model.addAttribute("vis_7", true);
			model.addAttribute("vis_8", true);
			model.addAttribute("vis_9", true);
			model.addAttribute("condForm", condForm);
		} else if(editflag.equals("1")){// 编辑
			InspectionCheckForm inspectionCheck = new InspectionCheckForm();
			condForm.setId(id);
			JacksonPagginListReturn<InspectionCheckListForm> inspectionCheckListList = patientOverViewService.getInspectionCheckMessage(condForm);
			List<InspectionCheckListForm> editList = inspectionCheckListList.getData();
			
			if (!Tools.listisblank(editList)) {
				model.addAttribute("vis_1", false);
				model.addAttribute("vis_2", false);
				model.addAttribute("vis_3", false);
				model.addAttribute("vis_4", false);
				model.addAttribute("vis_5", false);
				model.addAttribute("vis_6", false);
				model.addAttribute("vis_7", false);
				model.addAttribute("vis_8", false);
				model.addAttribute("vis_9", false);
				if("血常规".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage1(condForm);
					List<InspectionCheckForm> editList1 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList1)) {
						inspectionCheck = editList1.get(0);
					}
					model.addAttribute("vis_1", true);
				} else if("生化指标".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage2(condForm);
					List<InspectionCheckForm> editList2 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList2)) {
						inspectionCheck = editList2.get(0);
					}
					model.addAttribute("vis_2", true);
				} else if("出凝血功能".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage3(condForm);
					List<InspectionCheckForm> editList3 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList3)) {
						inspectionCheck = editList3.get(0);
					}
					model.addAttribute("vis_3", true);
				} else if("传染性疾病筛选".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage4(condForm);
					List<InspectionCheckForm> editList4 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList4)) {
						inspectionCheck = editList4.get(0);
					}
					model.addAttribute("vis_4", true);
				} else if("尿常规".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage5(condForm);
					List<InspectionCheckForm> editList5 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList5)) {
						inspectionCheck = editList5.get(0);
					}
					model.addAttribute("vis_5", true);
				} else if("大便常规".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage6(condForm);
					List<InspectionCheckForm> editList6 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList6)) {
						inspectionCheck = editList6.get(0);
					}
					model.addAttribute("vis_6", true);
				} else if("肾脏B超".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage7(condForm);
					List<InspectionCheckForm> editList7 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList7)) {
						inspectionCheck = editList7.get(0);
					}
					model.addAttribute("vis_7", true);
				} else if("胸部X线".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage8(condForm);
					List<InspectionCheckForm> editList8 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList8)) {
						inspectionCheck = editList8.get(0);
					}
					model.addAttribute("vis_8", true);
				} else if("心电图".equals(editList.get(0).getInspectionCheck())){
					JacksonPagginListReturn<InspectionCheckForm> inspectionCheckForm = patientOverViewService.getInspectionCheckMessage9(condForm);
					List<InspectionCheckForm> editList9 = inspectionCheckForm.getData();
					if (!Tools.listisblank(editList9)) {
						inspectionCheck = editList9.get(0);
					}
					model.addAttribute("vis_9", true);
				}
				
				model.addAttribute("condForm", inspectionCheck);
				//传检验检查项目名
				model.addAttribute("checkName", editList.get(0).getInspectionCheck());
			}
		}
		
		return PatientListPageConstants.InspectionCheckAdd;
	}

	/**
	* 保存检验检查数据
	* @param condition
	* @return
	*/
	@RequestMapping("/inspectionCheck")
	public JacksonCountReturn inspectionCheck(InspectionCheckForm condition){
		return this.patientOverViewService.inspectionCheck(condition);
	}

	/**
	 * 检验检查列表
	 * @param form
	 * @return
	 */
	@RequestMapping("/getInspectionCheckList")
	public JacksonPagginListReturn<InspectionCheckListForm> getInspectionCheckList(PatientForm condform){
		return this.patientOverViewService.getInspectionCheckList(condform);
	}

	/**
	 * 删除检验检查数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteInspectionCheck")
	public JacksonCountReturn deleteInspectionCheck(InspectionCheckForm condition,String inspectionCheck) {
	    return patientOverViewService.deleteInspectionCheck(condition,inspectionCheck);
	}
    
    

}
