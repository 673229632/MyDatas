package com.ustcsoft.pdqc.web.scoremanagement.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMExamineScheduledialMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMExamineSchedulejhsjMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMExamineSchedulezjMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineScheduledial;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineScheduledialExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulejhsj;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulejhsjExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulezj;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulezjExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.scoremanagement.form.InspectionArrangementForm;
import com.ustcsoft.pdqc.web.scoremanagement.service.InspectionArrangementService;

@Service
public class InspectionArrangmentServiceImpl extends WebBaseServiceImpl implements InspectionArrangementService{
	
	@Autowired
	private PdDQcCenterMapper pdDQcCenterMapper;
	@Autowired
	private PdMExamineSchedulejhsjMapper pdMExamineSchedulejhsjMapper;
	@Autowired
	private PdMOrganizationMapper pdMOrganizationMapper;
	@Autowired
	private PdDCenterMapper pdDCenterMapper;
	@Autowired
	private PdMExamineScheduledialMapper pdMExamineScheduledialMapper;
	@Autowired
	private PdMEmployeeMapper pdMEmployeeMapper;
	@Autowired
	private PdMExamineSchedulezjMapper pdMExamineSchedulezjMapper;
	/**
     * 获取评分时间列表
     * @param form
     * @return
     */
	@Override
	public List<InspectionArrangementForm> getInspectionTree(InspectionArrangementForm form){
		List<InspectionArrangementForm> treeList = new ArrayList<>();
		String orgNo = getLoginUser().getOrgNo();
		String qcCenterNo = getQcCenterNo(orgNo);
		form.setQcCenterNo(qcCenterNo);
		ListResult<InspectionArrangementForm> checkResultTimeList = getWebCommonDao()
                .selectList("CheckTimeArrangeTreeListMapper.searchCheckResultTimeList", form);
		treeList.addAll(checkResultTimeList.getResultData());
		ListResult<InspectionArrangementForm> schedulejhsjList = getWebCommonDao()
                .selectList("CheckTimeArrangeTreeListMapper.searchSchedulejhsjList", form);
		if(!Tools.listisblank(schedulejhsjList.getResultData())){
			treeList.addAll(schedulejhsjList.getResultData());
			for(InspectionArrangementForm inspectionArrangementForm : schedulejhsjList.getResultData()){
				InspectionArrangementForm hospitalList = new InspectionArrangementForm();
				InspectionArrangementForm expertList = new InspectionArrangementForm();
				hospitalList.setTreeNo("3");
				hospitalList.setId(inspectionArrangementForm.getId()+"_yy");
				hospitalList.setName("透析中心列表");
				hospitalList.setPid(inspectionArrangementForm.getId());
				expertList.setTreeNo("4");
				expertList.setId(inspectionArrangementForm.getId()+"_zj");
				expertList.setName("专家列表");
				expertList.setPid(inspectionArrangementForm.getId());
				treeList.add(hospitalList);
				treeList.add(expertList);
			}
		}
		ListResult<InspectionArrangementForm> scheduledialList = getWebCommonDao()
                .selectList("CheckTimeArrangeTreeListMapper.searchScheduledialList", form);
		if(!Tools.listisblank(scheduledialList.getResultData())){
			for(InspectionArrangementForm inspectionArrangementForm : scheduledialList.getResultData()){
				inspectionArrangementForm.setPid(inspectionArrangementForm.getPid()+"_yy");
				treeList.add(inspectionArrangementForm);
			}
		}
		ListResult<InspectionArrangementForm> schedulezjList = getWebCommonDao()
                .selectList("CheckTimeArrangeTreeListMapper.searchSchedulezjList", form);
		if(!Tools.listisblank(schedulezjList.getResultData())){
			for(InspectionArrangementForm inspectionArrangementForm : schedulezjList.getResultData()){
				inspectionArrangementForm.setPid(inspectionArrangementForm.getPid()+"_zj");
				treeList.add(inspectionArrangementForm);
			}
		}
		return treeList;
	}

	
	/**
     * 保存时间
     * @param form
     * @return
     */
	@Override
	public JacksonCountReturn addTime(InspectionArrangementForm form) {
		JacksonCountReturn result = new JacksonCountReturn();
		Date now = new Date();
		String userNo = getLoginUser().getUserNo();
		Date newexecuteTime = DateUtil.convertStringToDate(form.getExecuteTime());
		int successCount = 0;
		PdMExamineSchedulejhsj pdMExamineSchedulejhsj = new PdMExamineSchedulejhsj();
		if("1".equals(form.getTreeNo())){
			String executeTimeNo = Tools.getFifteenUUID();
			pdMExamineSchedulejhsj.setExecuteTimeNo(executeTimeNo);
			pdMExamineSchedulejhsj.setCheckNo(form.getId());
			pdMExamineSchedulejhsj.setExecuteTime(newexecuteTime);
			pdMExamineSchedulejhsj.setDelFlag(DELETE_FLAG_0);
			pdMExamineSchedulejhsj.setOrderIndex(0L);
			pdMExamineSchedulejhsj.setCreatedBy(userNo);
			pdMExamineSchedulejhsj.setDateCreated(now);
			pdMExamineSchedulejhsj.setModifiedBy(userNo);
			pdMExamineSchedulejhsj.setDateModified(now);
			pdMExamineSchedulejhsj.setRowVersion(0L);
			successCount = this.pdMExamineSchedulejhsjMapper.insert(pdMExamineSchedulejhsj);
			if (successCount == 0) {
				result.setRetMsg("新增失败！");
			} else{
				result.setRetMsg("新增成功！");
			}
		}else{
			pdMExamineSchedulejhsj.setExecuteTimeNo(form.getId());
			pdMExamineSchedulejhsj.setCheckNo(form.getPid());
			pdMExamineSchedulejhsj.setExecuteTime(newexecuteTime);
			pdMExamineSchedulejhsj.setDelFlag(DELETE_FLAG_0);
			pdMExamineSchedulejhsj.setOrderIndex(0L);
			pdMExamineSchedulejhsj.setCreatedBy(userNo);
			pdMExamineSchedulejhsj.setDateCreated(now);
			pdMExamineSchedulejhsj.setModifiedBy(userNo);
			pdMExamineSchedulejhsj.setDateModified(now);
			pdMExamineSchedulejhsj.setRowVersion(0L);
			PdMExamineSchedulejhsjExample pdMExamineSchedulejhsjExample = new PdMExamineSchedulejhsjExample();
			PdMExamineSchedulejhsjExample.Criteria criteria = pdMExamineSchedulejhsjExample.createCriteria();
        	criteria.andExecuteTimeNoEqualTo(form.getId());
        	successCount = pdMExamineSchedulejhsjMapper.updateByExampleSelective(pdMExamineSchedulejhsj, pdMExamineSchedulejhsjExample);
			if (successCount == 0) {
				result.setRetMsg("修改失败！");
			} else{
				result.setRetMsg("修改成功！");
			}
		}
        result.setSuccessCount(successCount);
		return result;
	}

	/**
     * 获取时间
     * @param form
     * @return
     */
	@Override
	public PdMExamineSchedulejhsj getTime(String id) {
		PdMExamineSchedulejhsj pdMExamineSchedulejhsj = new PdMExamineSchedulejhsj();
		PdMExamineSchedulejhsjExample pdMExamineSchedulejhsjExample = new PdMExamineSchedulejhsjExample();
		PdMExamineSchedulejhsjExample.Criteria criteria = pdMExamineSchedulejhsjExample.createCriteria();
		criteria.andExecuteTimeNoEqualTo(id);
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		List<PdMExamineSchedulejhsj> mCodes = this.pdMExamineSchedulejhsjMapper.selectByExample(pdMExamineSchedulejhsjExample);
		pdMExamineSchedulejhsj = mCodes.get(0);
		return pdMExamineSchedulejhsj;
	}

	/**
     * 删除时间
     * @param form
     * @return
     */
	@Override
	public JacksonCountReturn deleteTime(String id) {
		JacksonCountReturn result = new JacksonCountReturn();
		int successCount=0;
		PdMExamineSchedulejhsj pdMExamineSchedulejhsj = new PdMExamineSchedulejhsj();
		PdMExamineSchedulejhsjExample pdMExamineSchedulejhsjExample = new PdMExamineSchedulejhsjExample();
		PdMExamineSchedulejhsjExample.Criteria criteria = pdMExamineSchedulejhsjExample.createCriteria();
		criteria.andExecuteTimeNoEqualTo(id);
		pdMExamineSchedulejhsj.setDelFlag(DELETE_FLAG_1);
		successCount = pdMExamineSchedulejhsjMapper.updateByExampleSelective(pdMExamineSchedulejhsj, pdMExamineSchedulejhsjExample);
        if (successCount == 0) {
            result.setRetMsg("删除失败");
        } else {
            result.setRetMsg("删除成功");
        }
    	result.setSuccessCount(successCount);
		return result;
	}

	/**
     * 获取医院数据
     * @param 
     * @return
     */
	@Override
	public List<PdDCenter> getHospitalDetailsPage(InspectionArrangementForm form) {
		String orgNo = getLoginUser().getOrgNo();
		List<String> parentNo = new ArrayList<>();
		List<PdDCenter> pdDCenterResultList = new ArrayList<>();
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria = pdMOrganizationExample.createCriteria();
		criteria.andParentNoEqualTo(orgNo);
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		criteria.andOrgTypeEqualTo("2");
		List<PdMOrganization> pdMOrganizationList = this.pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
		if(pdMOrganizationList.size()>0){
			for(PdMOrganization pdMOrganization : pdMOrganizationList){
				parentNo.add(pdMOrganization.getOrgNo());
			}
			PdDCenterExample pdDCenterExample = new PdDCenterExample();
			PdDCenterExample.Criteria criteria1 = pdDCenterExample.createCriteria();
			criteria1.andOrgNoIn(parentNo);
			pdDCenterResultList = this.pdDCenterMapper.selectByExample(pdDCenterExample);
		}
		PdMExamineScheduledialExample pdMExamineScheduledialExample = new PdMExamineScheduledialExample();
		PdMExamineScheduledialExample.Criteria criteria2 = pdMExamineScheduledialExample.createCriteria();
		criteria2.andDelFlagEqualTo(DELETE_FLAG_0);
		criteria2.andExecuteTimeNoEqualTo(form.getPid());
		List<PdMExamineScheduledial> pdMExamineScheduledialList = this.pdMExamineScheduledialMapper.selectByExample(pdMExamineScheduledialExample);
		if(pdDCenterResultList.size()>0){
			for(PdDCenter pdDCenter : pdDCenterResultList){
				String centerNo = pdDCenter.getPdCenterNo();
				if(pdMExamineScheduledialList.size()>0){
					for(PdMExamineScheduledial pdMExamineScheduledial : pdMExamineScheduledialList){
						String pdCenter = pdMExamineScheduledial.getPdCenterNo();
						if(pdCenter.equals(centerNo)){
							pdDCenterResultList.remove(pdDCenter);
							break;
						}
					}
				}
				if(pdDCenterResultList.size()==0){
					break;
				}
			}
		}
		return pdDCenterResultList;
	}

	/**
     * 保存医院数据
     * @param 
     * @return
     */
	@Override
	public JacksonCountReturn addHospital(String ids, String pid) {
		JacksonCountReturn result = new JacksonCountReturn();
		String userNo = getLoginUser().getUserNo();
		Date now = new Date();
		int successCount = 0;
		String[] pdCenterNo = ids.split(",");
		List<String> pdCenterNoList = new ArrayList<>();
		for(int i=0;i<pdCenterNo.length;i++){
			pdCenterNoList.add(pdCenterNo[i]);
		}
		PdMExamineScheduledialExample pdMExamineScheduledialExample = new PdMExamineScheduledialExample();
		PdMExamineScheduledialExample.Criteria criteria = pdMExamineScheduledialExample.createCriteria();
		criteria.andExecuteTimeNoEqualTo(pid);
		criteria.andPdCenterNoIn(pdCenterNoList);
		List<PdMExamineScheduledial> pdMExamineScheduledialList =pdMExamineScheduledialMapper.selectByExample(pdMExamineScheduledialExample);
		if(pdMExamineScheduledialList.size()>0){
			result.setRetMsg("数据重复，请重新选择");
			result.setSuccessCount(-1);
			return result;
		}
		for(int i=0;i<pdCenterNo.length;i++){
			int successCountNo = 0;
			PdMExamineScheduledial pdMExamineScheduledial = new PdMExamineScheduledial(); 
			String scheduledialId = Tools.getFifteenUUID();
			pdMExamineScheduledial.setScheduledialId(scheduledialId);
			pdMExamineScheduledial.setPdCenterNo(pdCenterNo[i]);
			pdMExamineScheduledial.setExecuteTimeNo(pid);
			pdMExamineScheduledial.setDelFlag(DELETE_FLAG_0);
			pdMExamineScheduledial.setOrderIndex(0L);
			pdMExamineScheduledial.setCreatedBy(userNo);
			pdMExamineScheduledial.setDateCreated(now);
			pdMExamineScheduledial.setModifiedBy(userNo);
			pdMExamineScheduledial.setDateModified(now);
			pdMExamineScheduledial.setRowVersion(0L);
			successCountNo = this.pdMExamineScheduledialMapper.insert(pdMExamineScheduledial);
			successCount = successCount + successCountNo;
		}
		if(successCount==0){
			result.setRetMsg("新增失败");
		}else{
			result.setRetMsg("新增成功");
		}
		result.setSuccessCount(successCount);
		return result;
	}

	/**
     * 删除医院数据
     * @param 
     * @return
     */
	@Override
	public JacksonCountReturn deleteHospital(String id) {
		JacksonCountReturn result = new JacksonCountReturn();
		int successCount=0;
		PdMExamineScheduledial pdMExamineScheduledial = new PdMExamineScheduledial();
		PdMExamineScheduledialExample pdMExamineScheduledialExample = new PdMExamineScheduledialExample();
		PdMExamineScheduledialExample.Criteria criteria = pdMExamineScheduledialExample.createCriteria();
		criteria.andScheduledialIdEqualTo(id);
		pdMExamineScheduledial.setDelFlag(DELETE_FLAG_1);
		successCount = pdMExamineScheduledialMapper.updateByExampleSelective(pdMExamineScheduledial, pdMExamineScheduledialExample);
        if (successCount == 0) {
            result.setRetMsg("删除失败");
        } else {
            result.setRetMsg("删除成功");
        }
    	result.setSuccessCount(successCount);
		return result;
	}

	/**
     * 获取专家列表	
     * @param 
     * @return
     */
	@Override
	public JacksonReturn getEmployee(String arrangeType) {
		JacksonListReturn<Code> result = new JacksonListReturn<>();
		String orgNo = getLoginUser().getOrgNo();
		List<Code> optionList = new ArrayList<>();
		List<PdMEmployee> unArrangeList = new ArrayList<>();
		List<PdMEmployee> arrangeList = new ArrayList<>();
		PdMEmployeeExample pdMEmployeeExample = new PdMEmployeeExample();
		PdMEmployeeExample.Criteria criteria = pdMEmployeeExample.createCriteria();
		criteria.andDelFlagEqualTo("0");
		criteria.andOrgNoEqualTo(orgNo);
		criteria.andIsCheckEqualTo("0");
		criteria.andEmployeeTypeEqualTo("EMP_TYPE_2");
		List<PdMEmployee> pdMEmployeeList = this.pdMEmployeeMapper.selectByExample(pdMEmployeeExample);
		PdMExamineSchedulezjExample pdMExamineSchedulezjExample = new PdMExamineSchedulezjExample();
		PdMExamineSchedulezjExample.Criteria criteria1 = pdMExamineSchedulezjExample.createCriteria();
		criteria1.andDelFlagEqualTo("0");
		List<PdMExamineSchedulezj> pdMExamineSchedulezjList = this.pdMExamineSchedulezjMapper.selectByExample(pdMExamineSchedulezjExample);
		if(pdMEmployeeList.size()>0){
			for(int i = 0;i<pdMEmployeeList.size();i++){
				PdMEmployee pdMEmployee = pdMEmployeeList.get(i);
				String employeeNo = pdMEmployee.getEmployeeNo();
				boolean state = false;
				if(pdMExamineSchedulezjList.size()>0){
					for(PdMExamineSchedulezj pdMExamineSchedulezj : pdMExamineSchedulezjList){
						String specialistNo = pdMExamineSchedulezj.getSpecialistNo();
						if(specialistNo.equals(employeeNo)){
							state =true;
							break;
						}
					}
				}
				if(state){
					unArrangeList.add(pdMEmployee);
				}else{
					arrangeList.add(pdMEmployee);
				}
			}
		}
		if("1".equals(arrangeType)){
			if(unArrangeList.size()>0){
				for (PdMEmployee pdMEmployee : unArrangeList) {
					Code code = new Code();
					code.setText(pdMEmployee.getEmployeeName());
					code.setValue(pdMEmployee.getEmployeeNo());
					optionList.add(code);
				}
			}
		}else if("0".equals(arrangeType)){
			if(arrangeList.size()>0){
				for (PdMEmployee pdMEmployee : arrangeList) {
					Code code = new Code();
					code.setText(pdMEmployee.getEmployeeName());
					code.setValue(pdMEmployee.getEmployeeNo());
					optionList.add(code);
				}
			}
		}else if("".equals(arrangeType)){
			if(pdMEmployeeList.size()>0){
				for (PdMEmployee pdMEmployee : pdMEmployeeList) {
					Code code = new Code();
					code.setText(pdMEmployee.getEmployeeName());
					code.setValue(pdMEmployee.getEmployeeNo());
					optionList.add(code);
				}
			}
		}
		result.setData(optionList);
		return result;
	}

	/**
     * 保存专家
     * @param 
     * @return
     */
	@Override
	public JacksonCountReturn addExpert(String id, String pid) {
		JacksonCountReturn result = new JacksonCountReturn();
		String userNo = getLoginUser().getUserNo();
		Date now = new Date();
		int successCount = 0;
		PdMExamineSchedulezjExample pdMExamineSchedulezjExample = new PdMExamineSchedulezjExample();
		PdMExamineSchedulezjExample.Criteria criteria = pdMExamineSchedulezjExample.createCriteria();
		criteria.andSpecialistNoEqualTo(id);
		criteria.andExecuteTimeNoEqualTo(pid);
		List<PdMExamineSchedulezj> pdMExamineSchedulezjList = this.pdMExamineSchedulezjMapper.selectByExample(pdMExamineSchedulezjExample);
		if(pdMExamineSchedulezjList.size()>0){
			if("1".equals(pdMExamineSchedulezjList.get(0).getDelFlag())){
				PdMExamineSchedulezj pdMExamineSchedulezj1 = new PdMExamineSchedulezj();
				PdMExamineSchedulezjExample pdMExamineSchedulezjExample1 = new PdMExamineSchedulezjExample();
				PdMExamineSchedulezjExample.Criteria criteria1 = pdMExamineSchedulezjExample1.createCriteria();
				criteria1.andSpecialistNoEqualTo(id);
				criteria1.andExecuteTimeNoEqualTo(pid);
				pdMExamineSchedulezj1.setDelFlag(DELETE_FLAG_0);
				successCount = pdMExamineSchedulezjMapper.updateByExampleSelective(pdMExamineSchedulezj1, pdMExamineSchedulezjExample1);
				if(successCount==0){
					result.setRetMsg("新增失败");
				}else{
					result.setRetMsg("新增成功");
				}
				result.setSuccessCount(successCount);
				return result;
			}else{
				result.setRetMsg("所选专家已安排，请选择未安排专家");
			}
			result.setSuccessCount(successCount);
			return result;
			}
		PdMExamineSchedulezj pdMExamineSchedulezj = new PdMExamineSchedulezj();
		String schedulezjId = Tools.getFifteenUUID();
		pdMExamineSchedulezj.setSchedulezjId(schedulezjId);
		pdMExamineSchedulezj.setSpecialistNo(id);
		pdMExamineSchedulezj.setExecuteTimeNo(pid);
		pdMExamineSchedulezj.setDelFlag(DELETE_FLAG_0);
		pdMExamineSchedulezj.setOrderIndex(0L);
		pdMExamineSchedulezj.setCreatedBy(userNo);
		pdMExamineSchedulezj.setDateCreated(now);
		pdMExamineSchedulezj.setModifiedBy(userNo);
		pdMExamineSchedulezj.setDateModified(now);
		pdMExamineSchedulezj.setRowVersion(0L);
		successCount = this.pdMExamineSchedulezjMapper.insert(pdMExamineSchedulezj);
		if(successCount==0){
			result.setRetMsg("新增失败");
		}else{
			result.setRetMsg("新增成功");
		}
		result.setSuccessCount(successCount);
		return result;
	}

	/**
     * 删除专家	
     * @param 
     * @return
     */
	@Override
	public JacksonCountReturn deleteExpert(String id) {
		JacksonCountReturn result = new JacksonCountReturn();
		int successCount=0;
		PdMExamineSchedulezj pdMExamineSchedulezj = new PdMExamineSchedulezj();
		PdMExamineSchedulezjExample pdMExamineSchedulezjExample = new PdMExamineSchedulezjExample();
		PdMExamineSchedulezjExample.Criteria criteria = pdMExamineSchedulezjExample.createCriteria();
		criteria.andSchedulezjIdEqualTo(id);
		pdMExamineSchedulezj.setDelFlag(DELETE_FLAG_1);
		successCount = pdMExamineSchedulezjMapper.updateByExampleSelective(pdMExamineSchedulezj, pdMExamineSchedulezjExample);
        if (successCount == 0) {
            result.setRetMsg("删除失败");
        } else {
            result.setRetMsg("删除成功");
        }
    	result.setSuccessCount(successCount);
		return result;
	}

	/**
     * 初始化获取专家
     * @param 
     * @return
     */
	@Override
	public List<Code> getEmployeeList() {
		String orgNo = getLoginUser().getOrgNo();
		List<Code> optionList = new ArrayList<>();
		List<PdMEmployee> unArrangeList = new ArrayList<>();
		List<PdMEmployee> arrangeList = new ArrayList<>();
		PdMEmployeeExample pdMEmployeeExample = new PdMEmployeeExample();
		PdMEmployeeExample.Criteria criteria = pdMEmployeeExample.createCriteria();
		criteria.andDelFlagEqualTo("0");
		criteria.andOrgNoEqualTo(orgNo);
		criteria.andIsCheckEqualTo("0");
		criteria.andEmployeeTypeEqualTo("EMP_TYPE_2");
		List<PdMEmployee> pdMEmployeeList = this.pdMEmployeeMapper.selectByExample(pdMEmployeeExample);
		
		PdMExamineSchedulezjExample pdMExamineSchedulezjExample = new PdMExamineSchedulezjExample();
		PdMExamineSchedulezjExample.Criteria criteria1 = pdMExamineSchedulezjExample.createCriteria();
		criteria1.andDelFlagEqualTo("0");
		List<PdMExamineSchedulezj> pdMExamineSchedulezjList = this.pdMExamineSchedulezjMapper.selectByExample(pdMExamineSchedulezjExample);
		if(pdMEmployeeList.size()>0){
			for(int i =0;i<pdMEmployeeList.size();i++){
				PdMEmployee pdMEmployee = pdMEmployeeList.get(i);
				String employeeNo = pdMEmployee.getEmployeeNo();
				boolean state = false;
				if(pdMExamineSchedulezjList.size()>0){
					for(PdMExamineSchedulezj pdMExamineSchedulezj : pdMExamineSchedulezjList){
						String specialistNo = pdMExamineSchedulezj.getSpecialistNo();
						if(specialistNo.equals(employeeNo)){
							state =true;
							break;
						}
					}
				}
				if(state){
					unArrangeList.add(pdMEmployee);
				}else{
					arrangeList.add(pdMEmployee);
				}
			}
		}
		if(arrangeList.size()>0){
			for (PdMEmployee pdMEmployee : arrangeList) {
				Code code = new Code();
				code.setText(pdMEmployee.getEmployeeName());
				code.setValue(pdMEmployee.getEmployeeNo());
				optionList.add(code);
			}
		}
		return optionList;
	}
	
	/**
     * 获取质控中心编号
     * @param form
     * @return
     */
	private String getQcCenterNo(String orgNo){
		String qcCenterNo = null;
		PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
		PdDQcCenterExample.Criteria criteria1 = pdDQcCenterExample.createCriteria();
		criteria1.andOrgNoEqualTo(orgNo);
		criteria1.andDelFlagEqualTo(DELETE_FLAG_0);
    	List<PdDQcCenter> odDQcCenter = this.pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
    	qcCenterNo = odDQcCenter.get(0).getQcCenterNo();
		return qcCenterNo;
	}
}
