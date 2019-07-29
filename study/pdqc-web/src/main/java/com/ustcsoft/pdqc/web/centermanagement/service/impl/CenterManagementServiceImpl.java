package com.ustcsoft.pdqc.web.centermanagement.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.web.centermanagement.service.CenterManagementService;
import com.ustcsoft.pdqc.web.common.security.LoginUser;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeInformationForm;

/**
 * 
 * @author zhouqichao
 *
 */

@Service
public class CenterManagementServiceImpl extends WebBaseServiceImpl implements CenterManagementService{

	@Autowired
	private PdDCenterMapper pdDCenterMapper;
    /**
     * 透析中心管理页面初始化.
     * 
     * @param model ModelMap
     * @return String
     */
	@Override
	public PdDCenter getPdDCenter() {
		String orgNo = getLoginUser().getOrgNo();
		PdDCenter pdDCenter = new PdDCenter();
		PdDCenterExample pdDCenterExample = new PdDCenterExample();
		PdDCenterExample.Criteria criteria = pdDCenterExample.createCriteria();
		criteria.andDelFlagEqualTo("0");
		criteria.andOrgNoEqualTo(orgNo);
		List<PdDCenter> mCodes = this.pdDCenterMapper.selectByExample(pdDCenterExample);
		if(mCodes.size()!=0){
			pdDCenter = mCodes.get(0);
		}
		return pdDCenter;
	}
    /**
     * 编辑透析中心信息.
     * 
     * @param condition
     * @return
     */
	@Override
	public JacksonCountReturn addOrEdit(PdDCenter condition) {
		JacksonCountReturn result = new JacksonCountReturn();
		Date now = new Date();
		int successCount = 0;
		PdDCenter pdDCenter = new PdDCenter();
		pdDCenter.setOrgNo(condition.getOrgNo());
		pdDCenter.setPdCenterNo(condition.getPdCenterNo());
		pdDCenter.setPdCenterManager(condition.getPdCenterManager());
		pdDCenter.setPdCenterName(condition.getPdCenterName());
		pdDCenter.setPdCenterTel(condition.getPdCenterTel());
		pdDCenter.setPdCenterPostcode(condition.getPdCenterPostcode());
		pdDCenter.setPdCenterFax(condition.getPdCenterFax());
		pdDCenter.setPdCenterEmail(condition.getPdCenterEmail());
		pdDCenter.setPdCenterArea(condition.getPdCenterArea());
		pdDCenter.setPdCenterMeno(condition.getPdCenterMeno());
		pdDCenter.setDelFlag(DELETE_FLAG_0);
		String userNo = getLoginUser().getUserNo();
		pdDCenter.setModifiedBy(userNo);
		pdDCenter.setDateModified(now);
		PdDCenterExample pdDCenterExample = new PdDCenterExample();
		PdDCenterExample.Criteria criteria = pdDCenterExample.createCriteria();
		criteria.andPdCenterNoEqualTo(condition.getPdCenterNo());
		successCount = pdDCenterMapper.updateByExampleSelective(pdDCenter, pdDCenterExample);
		if (successCount == 0) {
            result.setRetMsg("保存失败！");
        } else{
        	result.setRetMsg("保存成功！");
        }
		result.setSuccessCount(successCount);
		return result;
	}

}
