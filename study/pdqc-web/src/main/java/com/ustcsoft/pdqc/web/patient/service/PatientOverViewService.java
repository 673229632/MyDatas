package com.ustcsoft.pdqc.web.patient.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCode;
import com.ustcsoft.pdqc.web.common.entity.Code;
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

/**
 * @author lijun
 *	患者总览
 */
public interface PatientOverViewService {
	
	
	/**
	 * 获得患者总览所有tab页的配置
	 * @return
	 */
	public List<PdMCode> getPatientViewCodes();
	
	
	/**
	 * 获得患者列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getPatientData(PatientForm form);
	
	
	/**
	 * 获得患者列表(门诊评估)
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getOutPatientData(PatientForm form);
	
	/**
	 * 获得患者列表(腹透充分性)
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getPeritonealDialysisData(PatientForm form);
	
	/**
	 * 获得转归列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientOutComeRstForm> searchChildOutcome(PatientForm form);
	
	
	/**
	 * 获得门诊评估列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientEvalRstForm> searchOutPatientEval(PatientForm form);
	
	
	/**
	 * 获得腹透充分性列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientPeritonealDialysisRstForm> searchPeritonealDialysisEval(PatientForm form);
	/**
	 * 根据父code获得子项目列表
	 * @param parentCode
	 * @return
	 */
	public List<Code> getPdMCodeByParentCode(String parentCode);
	
	
	/**
	 * 获得置管手术患者列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getCatheterOperationPatient(PatientForm form);
	
	/**
	 * 获得置管手术列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientOutComeRstForm> catheterOperation(PatientForm form);
	
	/**
	 * 保存转归信息
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn saveOutcome(PatientOutComeCondForm condition);
	
	
	/**
	 * 删除转归信息
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn deleteOutComeRow(PatientOutComeCondForm condition);
	
	
	/**
	 * 删除门诊评估
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn deleteOutPatientChildRow(PatientOutComeCondForm condition);


	/**
	 * 保存置管手术信息
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn catheterSave(CatheterOperationReportForm condition);


	/**
	 * 修改置管手术信息
	 * @param id
	 * @return
	 */
	public JacksonPagginListReturn<CatheterOperationReportForm> getcatheterOperationMessage(CatheterOperationReportForm condForm);


	/**
	 *  删除置管手术信息
	 * @param id
	 * @return
	 */
	public JacksonCountReturn deleteCatheterOperation(CatheterOperationReportForm condition);
	
	
	/**
	 * 透析方案患者列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getDialysisPatient(PatientForm condform);


	/**
	 * 透析方案列表
	 * @param condform
	 * @return
	 */
	public JacksonPagginListReturn<DialysisSolutionListForm> getDialysisSolution(PatientForm condform);


	/**
	 * 保存编辑透析方案
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn solutionSave(DialysisSolutionForm condition);


	/**
	 * 查询透析方案数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<DialysisSolutionForm> getDialysisSolutionMessage(DialysisSolutionForm condForm);


	/**
	 * 删除透析方案
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn deleteDialysisSolution(DialysisSolutionForm condition);


	/**
	 * 获得腹膜平衡实验患者列表
	 * @param condform
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getExperimentPatient(PatientForm condform);


	/**
	 * 获得腹膜平衡实验列表
	 * @param condform
	 * @return
	 */
	public JacksonPagginListReturn<BalanceExperimentListForm> getBalanceExperiment(PatientForm condform);


	/**
	 * 腹膜平衡实验数据编辑
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<BalanceExperimentForm> getBalanceExperimentMessage(BalanceExperimentForm condForm);


	/**
	 * 保存平衡实验数据
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn experimentSave(BalanceExperimentForm condition);
	
	/**
	 * 删除平衡实验数据
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn deleteBalanceExperiment(BalanceExperimentListForm condition);
	
	
	/**
	 * 获得合并症患者列表
	 * @param condform
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getComplicationPatient(PatientForm condform);


	/**
	 * 获得腹膜平衡实验列表
	 * @param condform
	 * @return
	 */
	public JacksonPagginListReturn<ComplicationForm> getComplication(PatientForm condform);


	/**
	 * 保存合并症数据
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn complicationSave(ComplicationPictureForm condition);


	/**
	 * 根据ID查询合并症数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<ComplicationForm> getComplicationMessage(ComplicationForm condForm);


	/**
	 * 删除合并症数据
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn deleteComplication(ComplicationForm condition);


	/**
	 *  获得检验检查患者列表
	 * @param condform
	 * @return
	 */
	public JacksonPagginListReturn<PatientRstForm> getInspectionCheckPatient(PatientForm condform);


	/**
	 * 保存检验检查数据
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn inspectionCheck(InspectionCheckForm condition);


	/**
	 * 检验检查列表
	 * @param condform
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckListForm> getInspectionCheckList(PatientForm condform);


	/**
	 * 根据ID查询检验检查数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckListForm> getInspectionCheckMessage(InspectionCheckForm condForm);


	/**
	 * 根据ID查询血常规数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage1(InspectionCheckForm condForm);


	/**
	 * 根据ID查询生化指标数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage2(InspectionCheckForm condForm);


	/**
	 * 根据ID查询出凝血功能数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage3(InspectionCheckForm condForm);


	/**
	 * 根据ID查询传染性疾病筛选数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage4(InspectionCheckForm condForm);


	/**
	 * 根据ID查询尿常规数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage5(InspectionCheckForm condForm);


	/**
	 * 根据ID查询大便常规数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage6(InspectionCheckForm condForm);


	/**
	 * 根据ID查询肾脏B超数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage7(InspectionCheckForm condForm);


	/**
	 * 根据ID查询胸部X线数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage8(InspectionCheckForm condForm);


	/**
	 * 根据ID查询心电图数据
	 * @param condForm
	 * @return
	 */
	public JacksonPagginListReturn<InspectionCheckForm> getInspectionCheckMessage9(InspectionCheckForm condForm);


	/**
	 * 删除检验检查数据
	 * @param condition
	 * @return
	 */
	public JacksonCountReturn deleteInspectionCheck(InspectionCheckForm condition,String inspectionCheck);

		/**
     * 获得用药处方患者列表
     * @param form
     * @return
     */
	public JacksonPagginListReturn<PatientRstForm> getMedicationPatient(PatientForm condForm);
	
	
	/**
	 * 获得用药处方列表
	 * @param form
	 * @return
	 */
	public JacksonPagginListReturn<MedicationResultForm> getMedicationList(MedicationCondForm condForm);
	
	/**
	 * 改变type选项获取type2下拉框的值
	 * @return
	 */
	public JacksonReturn changeSelectPickerType(String supperType);
	
	/**
	 * 保存用药处方
	 * @param medicationResultForm
	 * @return
	 */
	public JacksonCountReturn saveMedication(MedicationResultForm medicationResultForm);
	
	/**
     *  删除用药处方
     * @param id
     * @return
     */
    public JacksonCountReturn deleteMedication(MedicationResultForm MedicationResultForm);
	
	/**
     * 患者随访患者列表
     * @param condition
     * @return
     */
    public JacksonPagginListReturn<PatientRstForm> getFollowUpPatient(PatientForm condform);

    /**
     * 患者随访列表
     * @param condition
     * @return
     */
    public JacksonPagginListReturn<FollowUpSolutionForm> getFollowUpSolution(FollowUpSolutionForm form);

    /**
     * 获取患者随访数据
     * @param condForm
     * @return
     */
    public JacksonPagginListReturn<FollowUpSolutionForm> getFollowUpPatientMessage(FollowUpSolutionForm condForm);

    /**
     * 保存患者随访数据
     * @param condForm
     * @return
     */
    public JacksonCountReturn followUpPatientSave(FollowUpSolutionForm condition);
    
    
    /**
     * 保存门诊评估数据
     * @param condition
     * @return
     */
    public JacksonCountReturn patientEvaOutSave(PatientEvalRstForm condition);
    
    /**
     * 保存腹透充分性的数据
     * @param condition
     * @return
     */
    public JacksonCountReturn patientPeritonealSave(PatientPeritonealDialysisRstForm condition);

    /**
     * 删除患者随访数据
     * @param condForm
     * @return
     */
    public JacksonCountReturn delFollowUpPatient(FollowUpSolutionForm condition);
	
	
	
}
