package com.ustcsoft.pdqc.web.scoremanagement.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCheckResultTimeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCheckStandardVersionMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckResultTime;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckResultTimeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckStandardVersion;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckStandardVersionExample;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.scoremanagement.form.CheckResultTimeListForm;
import com.ustcsoft.pdqc.web.scoremanagement.service.CheckResultTimeService;

@Service
public class CheckResultTimeServiceImpl extends WebBaseServiceImpl implements CheckResultTimeService {
	@Autowired
	private PdDQcCenterMapper pdDQcCenterMapper;
	@Autowired
	private PdMCheckResultTimeMapper pdMCheckResultTimeMapper;
	@Autowired
	private PdMCheckStandardVersionMapper pdMCheckStandardVersionMapper;
    @Autowired
    WebCommonDao webCommonDao;
	/**
     * 获取评分时间列表
     * @param form
     * @return
     */
	@Override
	public JacksonPagginListReturn<CheckResultTimeListForm> getCheckResultTimeData(CheckResultTimeListForm form) {
		JacksonPagginListReturn<CheckResultTimeListForm> rst = new JacksonPagginListReturn<>();
		String orgNo = getLoginUser().getOrgNo();
		String qcCenterNo = getQcCenterNo(orgNo);
		form.setQcCenterNo(qcCenterNo);
		ListResult<CheckResultTimeListForm> checkResultTimeList = getWebCommonDao()
                .selectList("CheckResultTimeListMapper.searchCheckResultTimeList", form);
		// 获取分页
        int pagecount = 0;
        if (!Tools.listisblank(checkResultTimeList.getResultData())) {
            pagecount = checkResultTimeList.getResultData().size();
        }
        double maxpage = (double) pagecount / (double) form.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (form.getPageNumber() > maxpageSize) {
        	form.setPageNumber(maxpageSize);
        }
		rst.setData(checkResultTimeList.getResultData());
		rst.setPageNumber(form.getPageNumber());
		rst.setPageCount(pagecount);
		rst.setTotalCount(pagecount);
		return rst;
	}
	

	/**
     * 获取评分时间详细信息
     * @param form
     * @return
     */
	@Override
	public CheckResultTimeListForm getCheckResultTimeInformation(CheckResultTimeListForm form) {
		ListResult<CheckResultTimeListForm> checkResultTimeList = getWebCommonDao()
        .selectList("CheckResultTimeListMapper.searchCheckResultTimeInformation", form);
		CheckResultTimeListForm checkResultTimeListForm = new CheckResultTimeListForm();
		if(checkResultTimeList.getResultData().size()==0){
			return checkResultTimeListForm;
		}
		checkResultTimeListForm = checkResultTimeList.getResultData().get(0);
		return checkResultTimeListForm;
	}
	/**
    * 获取标准版本下拉框值
    * @param form
    * @return
    */
	@Override
	public List<Code> getStandardList() {
		String orgNo = getLoginUser().getOrgNo();
		String qcCenterNo = getQcCenterNo(orgNo);
		List<Code> standsrdList = new ArrayList<>();
		PdMCheckStandardVersionExample pdMCheckStandardVersion = new PdMCheckStandardVersionExample();
		PdMCheckStandardVersionExample.Criteria criteria = pdMCheckStandardVersion.createCriteria();
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		criteria.andQcCenterNoEqualTo(qcCenterNo);
		List<PdMCheckStandardVersion> mCodes = pdMCheckStandardVersionMapper.selectByExample(pdMCheckStandardVersion);
		for (PdMCheckStandardVersion center : mCodes) {
			Code code = new Code();
            code.setText(center.getStandardName());
            code.setValue(center.getStandardNo());
            standsrdList.add(code);
        }
		return standsrdList;
	}
	/**
    * 保存评分时间信息
    * @param form
    * @return
    */
	@Override
	public JacksonCountReturn addCheckResultTime(CheckResultTimeListForm condition) {
		JacksonCountReturn result = new JacksonCountReturn();
        int successCount = 0;
        PdMCheckResultTime pdMCheckResultTime = new PdMCheckResultTime();
        if(condition.getCheckNo()==null){
        	String checkNo = Tools.getFifteenUUID();
        	pdMCheckResultTime.setCheckNo(checkNo);
        	pdMCheckResultTime.setCheckName(condition.getCheckName());
        	pdMCheckResultTime.setStandardNo(condition.getStandardNo());
        	String orgNo = getLoginUser().getOrgNo();
        	String qcCenterNo = getQcCenterNo(orgNo);
        	pdMCheckResultTime.setQcCenterNo(qcCenterNo);
        	Date checkStartDate = DateUtil.convertStringToDate(condition.getCheckStartDate());
        	pdMCheckResultTime.setCheckStartDate(checkStartDate);
        	Date checkEndDate = DateUtil.convertStringToDate(condition.getCheckEndDate());
        	pdMCheckResultTime.setCheckEndDate(checkEndDate);
        	Date publishStartDate = DateUtil.convertStringToDate(condition.getPublishStartDate());
        	pdMCheckResultTime.setPublishStartDate(publishStartDate);
        	Date publishEndDate = DateUtil.convertStringToDate(condition.getPublishEndDate());
        	pdMCheckResultTime.setPublishEndDate(publishEndDate);
        	pdMCheckResultTime.setPublishStatus("1");
        	pdMCheckResultTime.setUseSign(condition.getUseSign());
        	pdMCheckResultTime.setKpiPart(condition.getKpiPart());
        	pdMCheckResultTime.setDelFlag(DELETE_FLAG_0);
        	final long orderIndex = 0L;
        	pdMCheckResultTime.setOrderIndex(orderIndex);
        	String userNo = getLoginUser().getUserNo();
        	pdMCheckResultTime.setCreatedBy(userNo);
        	Date now = new Date();
        	pdMCheckResultTime.setDateCreated(now);
        	pdMCheckResultTime.setModifiedBy(userNo);
        	pdMCheckResultTime.setDateModified(now);
        	final long rowVersion = 0L;
        	pdMCheckResultTime.setRowVersion(rowVersion);
        	successCount = this.pdMCheckResultTimeMapper.insert(pdMCheckResultTime);
        	if(successCount == 0){
        		result.setRetMsg("新增失败");
        	}else{
        		result.setRetMsg("新增成功");
        	}
        }else{
        	pdMCheckResultTime.setCheckNo(condition.getCheckNo());
        	pdMCheckResultTime.setCheckName(condition.getCheckName());
        	pdMCheckResultTime.setStandardNo(condition.getStandardNo());
        	String orgNo = getLoginUser().getOrgNo();
        	String qcCenterNo = getQcCenterNo(orgNo);
        	pdMCheckResultTime.setQcCenterNo(qcCenterNo);
        	Date checkStartDate = DateUtil.convertStringToDate(condition.getCheckStartDate());
        	pdMCheckResultTime.setCheckStartDate(checkStartDate);
        	Date checkEndDate = DateUtil.convertStringToDate(condition.getCheckEndDate());
        	pdMCheckResultTime.setCheckEndDate(checkEndDate);
        	Date publishStartDate = DateUtil.convertStringToDate(condition.getPublishStartDate());
        	pdMCheckResultTime.setPublishStartDate(publishStartDate);
        	Date publishEndDate = DateUtil.convertStringToDate(condition.getPublishEndDate());
        	pdMCheckResultTime.setPublishEndDate(publishEndDate);
        	pdMCheckResultTime.setPublishStatus("1");
        	pdMCheckResultTime.setUseSign(condition.getUseSign());
        	pdMCheckResultTime.setKpiPart(condition.getKpiPart());
        	pdMCheckResultTime.setDelFlag(DELETE_FLAG_0);
        	final long orderIndex = 0L;
        	pdMCheckResultTime.setOrderIndex(orderIndex);
        	String userNo = getLoginUser().getUserNo();
        	pdMCheckResultTime.setCreatedBy(userNo);
        	Date now = new Date();
        	pdMCheckResultTime.setDateCreated(now);
        	pdMCheckResultTime.setModifiedBy(userNo);
        	pdMCheckResultTime.setDateModified(now);
        	final long rowVersion = 0L;
        	pdMCheckResultTime.setRowVersion(rowVersion);
            PdMCheckResultTimeExample pdMCheckResultTimeExample = new PdMCheckResultTimeExample();
            PdMCheckResultTimeExample.Criteria criteria = pdMCheckResultTimeExample.createCriteria();
        	criteria.andCheckNoEqualTo(condition.getCheckNo());
        	successCount = pdMCheckResultTimeMapper.updateByExampleSelective(pdMCheckResultTime, pdMCheckResultTimeExample);
        	if(successCount == 0){
        		result.setRetMsg("修改失败");
        	}else{
        		result.setRetMsg("修改成功");
        	}
        }
        result.setSuccessCount(successCount);
		return result;
	}
	/**
     * 删除职员信息
     * @param condition
     * @return
     */
	@Override
	public JacksonCountReturn delCheckResultTime(CheckResultTimeListForm condition) {
		JacksonCountReturn result = new JacksonCountReturn();
		int successCount=0;
		PdMCheckResultTime pdMCheckResultTime = new PdMCheckResultTime();
		pdMCheckResultTime.setDelFlag(DELETE_FLAG_1);
        PdMCheckResultTimeExample pdMCheckResultTimeExample = new PdMCheckResultTimeExample();
        PdMCheckResultTimeExample.Criteria criteria = pdMCheckResultTimeExample.createCriteria();
    	criteria.andCheckNoEqualTo(condition.getCheckNo());
    	List<PdMCheckResultTime> pdMCheckResultTimeList = this.pdMCheckResultTimeMapper.selectByExample(pdMCheckResultTimeExample);
    	if(pdMCheckResultTimeList.size()>0){
    		successCount = pdMCheckResultTimeMapper.updateByExampleSelective(pdMCheckResultTime, pdMCheckResultTimeExample);
    	}
        if (successCount == 0) {
            result.setRetMsg("删除失败");
        } else {
            result.setRetMsg("删除成功");
        }
    	result.setSuccessCount(successCount);
		return result;
	}
	
	
	/**
     * 获取未发布时间数据
     * @param condition
     * @return
     */
	@Override
	public JacksonCountReturn selectUnpublishedData() {
		JacksonCountReturn result = new JacksonCountReturn();
		int successCount=0;
        String orgNo = getLoginUser().getOrgNo();
		String qcCenterNo = getQcCenterNo(orgNo);
        PdMCheckResultTimeExample pdMCheckResultTimeExample = new PdMCheckResultTimeExample();
        PdMCheckResultTimeExample.Criteria criteria = pdMCheckResultTimeExample.createCriteria();
    	criteria.andQcCenterNoEqualTo(qcCenterNo);
    	criteria.andDelFlagEqualTo(DELETE_FLAG_0);
    	criteria.andPublishStatusEqualTo("1");
    	List<PdMCheckResultTime> pdMCheckResultTimeList = this.pdMCheckResultTimeMapper.selectByExample(pdMCheckResultTimeExample);
    	if(pdMCheckResultTimeList.size()>0){
    		result.setRetMsg("已有未发布信息，不允许重复添加");
    		successCount = pdMCheckResultTimeList.size();
    	}
    	result.setSuccessCount(successCount);
		return result;
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
    	List<PdDQcCenter> odDQcCenter = this.pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
    	qcCenterNo = odDQcCenter.get(0).getQcCenterNo();
		return qcCenterNo;
	}
}
