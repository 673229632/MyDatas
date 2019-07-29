package com.ustcsoft.pdqc.web.employeemanagement.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.pdqc.core.autogen.dao.MTitleMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PSysCodeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDApproveFileMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCodeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMFiletypeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMTitleEmployeeMapper;
import com.ustcsoft.pdqc.core.autogen.entity.MTitle;
import com.ustcsoft.pdqc.core.autogen.entity.MTitleExample;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCode;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDApproveFile;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCode;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMFiletype;
import com.ustcsoft.pdqc.core.autogen.entity.PdMFiletypeKey;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMTitleEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMTitleEmployeeExample;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.FileService;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeFileForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeFileRstForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeInformationForm;
import com.ustcsoft.pdqc.web.employeemanagement.form.EmployeeListForm;
import com.ustcsoft.pdqc.web.employeemanagement.service.EmployeeListService;

/**
 * 
 * @author zhouqichao
 *
 */

@Service
public class EmployeeListServiceImpl  extends WebBaseServiceImpl implements EmployeeListService {

	@Autowired
	private PdMCodeMapper pdMCodeMapper;
	@Autowired
	private PSysCodeMapper pSysCodeMapper;
	@Autowired
	private MTitleMapper mTitleMapper;
    @Autowired
    WebCommonDao webCommonDao;
    @Autowired
    PdMEmployeeMapper pdMEmployeeMapper;
    @Autowired
    PdMTitleEmployeeMapper pdMTitleEmployeeMapper;
    @Autowired
    PdMOrganizationMapper pdMOrganizationMapper;
    @Autowired
    private FileService fileService;
    @Autowired
    private PdMFiletypeMapper pdMFiletypeMapper;
    @Autowired
    private PdDApproveFileMapper pdDApproveFileMapper;
    /**
     * 获取职员类型下拉值
     * 
     * @return
     */
    @Override
	public List<Code> getSelectEmployeeTypeOptions() {
    	List<Code> optionList = new ArrayList<>();
		PdMCodeExample codeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria = codeExample.createCriteria();
		criteria.andDelFlagEqualTo("0");
		criteria.andParentCodeEqualTo("EMPLOYEE-TYPE");
		List<PdMCode> mCodes = this.pdMCodeMapper.selectByExample(codeExample);
		//判断登录职员的组织机构类别
		String orgNo = getLoginUser().getOrgNo();
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria1 = pdMOrganizationExample.createCriteria();
		criteria1.andOrgNoEqualTo(orgNo);
    	List<PdMOrganization> pdMOrganization = this.pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
		for (PdMCode center : mCodes) {
			if("2".equals(pdMOrganization.get(0).getOrgType())){
				if("EMP_TYPE_1".equals(center.getCode())||"EMP_TYPE_2".equals(center.getCode())||"EMP_TYPE_3".equals(center.getCode())){
					continue;
				}
				
			}
			Code code = new Code();
            code.setText(center.getValue());
            code.setValue(center.getCode());
            optionList.add(code);
		}
		return optionList;
	}
	
	/**
     * 获取职员列表
     * @param form
     * @return
     */
	@Override
	public JacksonPagginListReturn<EmployeeListForm> getEmployeeData(EmployeeListForm form) {
		JacksonPagginListReturn<EmployeeListForm> rst = new JacksonPagginListReturn<>();
		if (form.getEmployeeName()!=null) {
			form.setEmployeeName("%"+form.getEmployeeName()+"%");
		}
		String orgNo = getLoginUser().getOrgNo();
		form.setOrgNo(orgNo);
		ListResult<EmployeeListForm> mployeeList = getWebCommonDao()
                .selectList("EmployeeListMapper.searchEmployeeList", form);
		// 获取分页
        int pagecount = 0;
        if (!Tools.listisblank(mployeeList.getResultData())) {
            pagecount = mployeeList.getResultData().size();
        }
        double maxpage = (double) pagecount / (double) form.getPageSize();
        int maxpageSize = (int) Math.ceil(maxpage);
        if (form.getPageNumber() > maxpageSize) {
        	form.setPageNumber(maxpageSize);
        }
		rst.setData(mployeeList.getResultData());
		rst.setPageNumber(form.getPageNumber());
		rst.setPageCount(pagecount);
		rst.setTotalCount(pagecount);
		return rst;
	}
	/**
     * 获取职员基础信息
     * @param form
     * @return
     */
	@Override
	public EmployeeInformationForm getEmployeeInformation(EmployeeInformationForm form) {
		EmployeeInformationForm employeeInformationForm = new EmployeeInformationForm();
		if(form.getEmployeeNo()==null||form.getEmployeeNo()==""){
			return employeeInformationForm;
		}
		ListResult<EmployeeInformationForm> list = getWebCommonDao().selectList("EmployeeListMapper.searchEmployee", form);
		employeeInformationForm=list.getResultData().get(0);
		return employeeInformationForm;
	}
	/**
     * 获取职员职称下拉框
     * @param form
     * @return
     */
	@Override
	public List<Code> getSelectEmployeeTitleOptions() {
		List<Code> optionList = new ArrayList<>();
		MTitleExample mTitle = new MTitleExample();
		MTitleExample.Criteria criteria = mTitle.createCriteria();
		criteria.andDelFlagEqualTo("0");
		List<MTitle> mCodes = this.mTitleMapper.selectByExample(mTitle);
		for (MTitle center : mCodes) {
			Code code = new Code();
            code.setText(center.getTitleName());
            code.setValue(center.getTitleNo());
            optionList.add(code);
        }
		return optionList;
		
	}
	/**
     * 获取职员职务下拉框
     * @param form
     * @return
     */
	@Override
	public List<Code> getSelectEmployeePortOptions() {
		List<Code> optionList = new ArrayList<>();
		PSysCodeExample pSysCode = new PSysCodeExample();
		PSysCodeExample.Criteria criteria = pSysCode.createCriteria();
		criteria.andCodeTypeIdEqualTo(2018);
		List<PSysCode> mCodes = this.pSysCodeMapper.selectByExample(pSysCode);
		for (PSysCode center : mCodes) {
            Code code = new Code();
            code.setText(center.getCodeName());
            code.setValue(center.getCodeValue());
            optionList.add(code);
        }
		return optionList;
	}
	/**
     * 获取职员学历下拉框
     * @param form
     * @return
     */
	@Override
	public List<Code> getSelectEmployeeEducationOptions() {
		List<Code> optionList = new ArrayList<>();
		PSysCodeExample pSysCode = new PSysCodeExample();
		PSysCodeExample.Criteria criteria = pSysCode.createCriteria();
		criteria.andCodeTypeIdEqualTo(101014);
		List<PSysCode> mCodes = this.pSysCodeMapper.selectByExample(pSysCode);
		for (PSysCode center : mCodes) {
            Code code = new Code();
            code.setText(center.getCodeName());
            code.setValue(center.getCodeValue());
            optionList.add(code);
        }
		return optionList;
	}
	/**
     * 添加或修改职员信息
     * @param condition
     * @return
     */
	@Override
	public JacksonCountReturn addOrEdit(EmployeeInformationForm condition) {
		JacksonCountReturn result = new JacksonCountReturn();
		Date now = new Date();
        int successCount = 0;
        int successCount1 = 0;
        PdMEmployee pdMEmployee = new PdMEmployee();
        PdMTitleEmployee pdMTitleEmployee = new PdMTitleEmployee();
        //判断职员编号是否为空  若是  则新增  若不是   则修改
        if (Tools.isblank(condition.getEmployeeNo())) {
        	//插入职员信息
        	String employeeNo = Tools.getFifteenUUID();
        	pdMEmployee.setEmployeeNo(employeeNo);
        	String orgNo = getLoginUser().getOrgNo();
        	pdMEmployee.setOrgNo(orgNo);
        	pdMEmployee.setEmployeeName(condition.getEmployeeName());
        	pdMEmployee.setEmployeeSex(condition.getEmployeeSex());
        	pdMEmployee.setEmployeeType(condition.getEmployeeType());
        	pdMEmployee.setIdCardNo(condition.getIdCardNo());
        	Date birthday = DateUtil.convertStringToDate(condition.getBirthday());
        	pdMEmployee.setBirthday(birthday);
        	pdMEmployee.setEmployeeTel(condition.getEmployeeTel());
        	pdMEmployee.setMediYear(condition.getMediYear());
        	pdMEmployee.setEmployeeAddress(condition.getEmployeeAddress());
        	Date workstart = DateUtil.convertStringToDate(condition.getWorkStart());
        	pdMEmployee.setWorkStart(workstart);
        	pdMEmployee.setEducation(condition.getEducation());
        	pdMEmployee.setEmployeeEmail(condition.getEmployeeEmail());
        	pdMEmployee.setEmployeePost(condition.getEmployeePost());
        	pdMEmployee.setIsCheck(condition.getIsCheck());
        	pdMEmployee.setIsParttime(condition.getIsParttime());
        	pdMEmployee.setDelFlag(DELETE_FLAG_0);
        	String userNo=getLoginUser().getUserNo();
        	pdMEmployee.setCreatedBy(userNo);
        	pdMEmployee.setDateCreated(now);
        	pdMEmployee.setModifiedBy(userNo);
        	pdMEmployee.setDateModified(now);
        	successCount = this.pdMEmployeeMapper.insert(pdMEmployee);
        	//插入职员职称信息
        	pdMTitleEmployee.setEmployeeNo(employeeNo);
        	pdMTitleEmployee.setTitleNo(condition.getTitleNo());
        	pdMTitleEmployee.setDelFlag(DELETE_FLAG_0);
        	pdMTitleEmployee.setCreatedBy(userNo);
        	pdMTitleEmployee.setDateCreated(now);
        	pdMTitleEmployee.setModifiedBy(userNo);
        	pdMTitleEmployee.setDateModified(now);
        	successCount1 = this.pdMTitleEmployeeMapper.insert(pdMTitleEmployee);
            if (successCount == 0||successCount1 == 0) {
                result.setRetMsg("新增信息失败！");
            } else{
            	result.setRetMsg("新增信息成功！");
            }
        }else{
        	//更改职员信息
        	pdMEmployee.setEmployeeNo(condition.getEmployeeNo());
        	pdMEmployee.setOrgNo(condition.getOrgNo());
        	pdMEmployee.setEmployeeName(condition.getEmployeeName());
        	pdMEmployee.setEmployeeSex(condition.getEmployeeSex());
        	pdMEmployee.setEmployeeType(condition.getEmployeeType());
        	pdMEmployee.setIdCardNo(condition.getIdCardNo());
        	Date birthday = DateUtil.convertStringToDate(condition.getBirthday());
        	pdMEmployee.setBirthday(birthday);
        	pdMEmployee.setEmployeeTel(condition.getEmployeeTel());
        	pdMEmployee.setMediYear(condition.getMediYear());
        	pdMEmployee.setEmployeeAddress(condition.getEmployeeAddress());
        	Date workstart = DateUtil.convertStringToDate(condition.getWorkStart());
        	pdMEmployee.setWorkStart(workstart);
        	pdMEmployee.setEducation(condition.getEducation());
        	pdMEmployee.setEmployeeEmail(condition.getEmployeeEmail());
        	pdMEmployee.setEmployeePost(condition.getEmployeePost());
        	pdMEmployee.setIsCheck(condition.getIsCheck());
        	pdMEmployee.setIsParttime(condition.getIsParttime());
        	pdMEmployee.setDelFlag(DELETE_FLAG_0);
        	String userNo=getLoginUser().getUserNo();
        	pdMEmployee.setCreatedBy(userNo);
        	pdMEmployee.setDateCreated(now);
        	pdMEmployee.setModifiedBy(userNo);
        	pdMEmployee.setDateModified(now);
        	PdMEmployeeExample employeeExample = new PdMEmployeeExample();
        	PdMEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        	criteria.andEmployeeNoEqualTo(condition.getEmployeeNo());
        	successCount = pdMEmployeeMapper.updateByExampleSelective(pdMEmployee, employeeExample);
        	//判断职员是否有职称   若有  则修改   若没有   则新增
        	PdMTitleEmployeeExample titleEmployeeExample = new PdMTitleEmployeeExample();
        	PdMTitleEmployeeExample.Criteria criteria1 = titleEmployeeExample.createCriteria();
        	criteria1.andEmployeeNoEqualTo(condition.getEmployeeNo());
        	List<PdMTitleEmployee> oldmTitleEmployee = this.pdMTitleEmployeeMapper.selectByExample(titleEmployeeExample);
        	//若没有职称，则新增职称
        	if(oldmTitleEmployee.size()==0){
        		pdMTitleEmployee.setEmployeeNo(condition.getEmployeeNo());
        		pdMTitleEmployee.setTitleNo(condition.getTitleNo());
        		pdMTitleEmployee.setDelFlag(DELETE_FLAG_0);
        		pdMTitleEmployee.setCreatedBy(userNo);
        		pdMTitleEmployee.setDateCreated(now);
        		pdMTitleEmployee.setModifiedBy(userNo);
        		pdMTitleEmployee.setDateModified(now);
            	successCount1 = this.pdMTitleEmployeeMapper.insert(pdMTitleEmployee);
        	}else{
        		pdMTitleEmployee.setEmployeeNo(condition.getEmployeeNo());
        		pdMTitleEmployee.setTitleNo(condition.getTitleNo());
        		pdMTitleEmployee.setDelFlag(DELETE_FLAG_0);
        		pdMTitleEmployee.setCreatedBy(userNo);
        		pdMTitleEmployee.setDateCreated(now);
        		pdMTitleEmployee.setModifiedBy(userNo);
        		pdMTitleEmployee.setDateModified(now);
            	criteria1.andEmployeeNoEqualTo(condition.getEmployeeNo());
            	successCount1 = pdMTitleEmployeeMapper.updateByExampleSelective(pdMTitleEmployee, titleEmployeeExample);
        	}
        	
        	if (successCount == 0||successCount1 == 0) {
                result.setRetMsg("修改失败！");
            } else{
            	result.setRetMsg("修改成功！");
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
	public JacksonCountReturn deleteEmployee(EmployeeInformationForm condition) {
		JacksonCountReturn result = new JacksonCountReturn();
		int successCount=0;
		int successCount1=0;
		PdMEmployee pdMEmployee = new PdMEmployee();
        PdMTitleEmployee pdMTitleEmployee = new PdMTitleEmployee();
        pdMEmployee.setDelFlag(DELETE_FLAG_1);
        pdMTitleEmployee.setDelFlag(DELETE_FLAG_1);
        PdMTitleEmployeeExample titleEmployeeExample = new PdMTitleEmployeeExample();
        PdMTitleEmployeeExample.Criteria criteria1 = titleEmployeeExample.createCriteria();
    	criteria1.andEmployeeNoEqualTo(condition.getEmployeeNo());
    	List<PdMTitleEmployee> oldmTitleEmployee = this.pdMTitleEmployeeMapper.selectByExample(titleEmployeeExample);
    	if(oldmTitleEmployee.size()>0){
    		successCount1 = pdMTitleEmployeeMapper.updateByExampleSelective(pdMTitleEmployee, titleEmployeeExample);
    	}
        PdMEmployeeExample employeeExample = new PdMEmployeeExample();
    	PdMEmployeeExample.Criteria criteria = employeeExample.createCriteria();
    	criteria.andEmployeeNoEqualTo(condition.getEmployeeNo());
    	successCount = pdMEmployeeMapper.updateByExampleSelective(pdMEmployee, employeeExample);
    	
        if (successCount == 0||successCount1 == 0) {
            result.setRetMsg("删除失败");
        } else {
            result.setRetMsg("删除成功");
        }
    	result.setSuccessCount(successCount);
		return result;
	}
	/**
     * 获取组织机构类别
     * @param condition
     * @return
     */
	@Override
	public String getOrgType(String orgNo) {
		//判断登录职员的组织机构类别
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria criteria1 = pdMOrganizationExample.createCriteria();
		criteria1.andOrgNoEqualTo(orgNo);
    	List<PdMOrganization> pdMOrganization = this.pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
    	String orgType = pdMOrganization.get(0).getOrgType();
		return orgType;
	}

	@Override
	public JacksonCountReturn addOrEditFile(EmployeeFileForm condition) {
		JacksonCountReturn rst = new JacksonCountReturn();
		int successCount=0;
		PdDApproveFile approveFile = new PdDApproveFile();
		if(condition.getFile1().getSize() > 5242880){
			rst.setSuccessCount(successCount);
			rst.setRetMsg("文件大小不应超过5M，请重新上传！");
			return rst;
		}
		//文件类型
		String fileType="";
		String fileName1="";
		String filePath1="";
		//判断文件是否上传
		if(condition.getFile1().getSize() > 0){
			// 重新生成文件名以及加上文件类型
            /*String fileName1 = Tools.getFifteenUUID() + condition.getFile1().getOriginalFilename()
                    .substring(condition.getFile1().getOriginalFilename().lastIndexOf("."));*/
			fileName1 = condition.getFile1().getOriginalFilename();
			int ldot = condition.getFile1().getOriginalFilename().lastIndexOf(".");
			String leixing = condition.getFile1().getOriginalFilename().substring(ldot+1).toLowerCase();
			if(leixing.equals("gif")||leixing.equals("jpg")||
					leixing.equals("jepg")||leixing.equals("png")){
				fileType="1";
			}else if(leixing.equals("doc")||leixing.equals("docx")||leixing.equals("txt")||
					leixing.equals("xlsx")||leixing.equals("xls")){
				fileType="2";
			}
            // 拼接路径
            filePath1 = this.getServletContext().getRealPath("/") + getFileUploadRoot() + fileName1;
            // 文件保存
            try {
                fileService.saveFile(condition.getFile1(), filePath1);
            } catch (Exception e) {
                e.printStackTrace();
                
            }
		}else{
			rst.setSuccessCount(successCount);
			rst.setRetMsg("文件不能无内容!");
			return rst;
		}
		Date now = new Date();
		if(Tools.isblank(condition.getFileNo())){
			String code = Tools.getFifteenUUID();
			approveFile.setFileNo(code);
			approveFile.setFileName(fileName1);
			approveFile.setEmployeeNo(condition.getEmployeeNo());
			approveFile.setFilePath(filePath1);
			approveFile.setFormatType(fileType);
			approveFile.setFileTypeNo(condition.getFileTypeNo());
			approveFile.setDelFlag(DELETE_FLAG_0);
			approveFile.setCreatedBy(getLoginUser().getUserNo());
			approveFile.setDateCreated(now);
			approveFile.setModifiedBy(getLoginUser().getUserNo());
			approveFile.setDateModified(now);
			successCount = this.pdDApproveFileMapper.insert(approveFile);
			if(successCount == 0){
				rst.setRetMsg("新增职员文件失败!");
			}else{
				rst.setRetMsg("新增职员文件成功!");
			}
		}else{
			approveFile.setFileNo(condition.getFileNo());
			approveFile.setFileName(fileName1);
			approveFile.setFilePath(filePath1);
			approveFile.setFormatType(fileType);
			approveFile.setEmployeeNo(condition.getEmployeeNo());
			approveFile.setFileTypeNo(condition.getFileTypeNo());
			approveFile.setModifiedBy(getLoginUser().getUserNo());
			approveFile.setDateModified(now);
			successCount = this.pdDApproveFileMapper.updateByPrimaryKeySelective(approveFile);
			if(successCount == 0){
				rst.setRetMsg("修改职员文件失败!");
			}else{
				rst.setRetMsg("修改职员文件成功!");
			}
		}
		rst.setSuccessCount(successCount);
		return rst;
	}

	@Override
	public List<Code> getCodesByFileTypes(String employeeType) {
		List<Code> fileTypes = new ArrayList<>();
		PdMCodeExample codeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria = codeExample.createCriteria();
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		criteria.andParentCodeEqualTo(employeeType);
		List<PdMCode> codes = this.pdMCodeMapper.selectByExample(codeExample);
		for(PdMCode mCode : codes){
			Code code = new Code();
			String value = mCode.getValue();
			PdMFiletypeKey filetypeKey = new PdMFiletypeKey();
			filetypeKey.setFileTypeNo(value);
			PdMFiletype filetype = this.pdMFiletypeMapper.selectByPrimaryKey(filetypeKey);
			code.setText(filetype.getFileTypeName());
			code.setValue(value);
			fileTypes.add(code);
		}
		return fileTypes;
	}

	@Override
	public JacksonPagginListReturn<EmployeeFileRstForm> getFiles(EmployeeListForm form) {
		JacksonPagginListReturn<EmployeeFileRstForm> rst = new JacksonPagginListReturn<>();
		if(Tools.isblank(form.getEmployeeNo())){
			return rst;
		}
		ListResult<EmployeeFileRstForm> patientEvalRstForms=getWebCommonDao()
				.selectList("EmployeeListMapper.getFiles", form);
		rst.setData(patientEvalRstForms.getResultData());
		return rst;
	}
	


}
