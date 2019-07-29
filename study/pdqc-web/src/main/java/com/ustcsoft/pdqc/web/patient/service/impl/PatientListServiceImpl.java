
package com.ustcsoft.pdqc.web.patient.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInfoMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfo;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfoExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfoKey;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.patient.form.PatientForm;
import com.ustcsoft.pdqc.web.patient.form.PatientRstForm;
import com.ustcsoft.pdqc.web.patient.service.PatientListService;

@Service
public class PatientListServiceImpl extends WebBaseServiceImpl implements PatientListService {

    @Autowired
    private PdDCenterMapper pdDCenterMapper;

    @Autowired
    private PdDPatientInfoMapper pdDPatientInfoMapper;

    @Override
    public List<Code> getSelectHospitalOptions() {
        List<Code> optionList = new ArrayList<>();
        PdDCenterExample centerExample = new PdDCenterExample();
        PdDCenterExample.Criteria criteria = centerExample.createCriteria();
        criteria.andDelFlagEqualTo(DELETE_FLAG_0);
        List<PdDCenter> centers = this.pdDCenterMapper.selectByExample(centerExample);
        for (PdDCenter center : centers) {
            Code code = new Code();
            code.setText(center.getPdCenterName());
            code.setValue(center.getPdCenterNo());
            optionList.add(code);
        }
        return optionList;
    }

    @Override
    public JacksonCountReturn addOrEdit(PatientForm condition) {
        JacksonCountReturn result = new JacksonCountReturn();
        Date now = new Date();
        int successCount = 0;
        PdDPatientInfo patientInfo = new PdDPatientInfo();
        // 新增
        if (Tools.isblank(condition.getPatientId())) {
            String patientId = Tools.getFifteenUUID();
            patientInfo.setId(patientId);
            patientInfo.setHpId(condition.getHospitalNo());
            patientInfo.setName(condition.getPatientName());
            patientInfo.setCardNo(condition.getIdCard());
            patientInfo.setPdNo(condition.getPdNo());
            Date firstDialsysDate = DateUtil.convertStringToDate(condition.getFirstDialsysDate());
            patientInfo.setFirstDialsysDate(firstDialsysDate);
            Date birthDay = DateUtil.convertStringToDate(condition.getBirthDay());
            patientInfo.setBirthDay(birthDay);
            patientInfo.setHeight(condition.getHeight());
            patientInfo.setPhoneNo(condition.getPhoneNo());
            patientInfo.setAddress(condition.getAddress());
            patientInfo.setAllergy(condition.getAllergy());
            patientInfo.setInfectionDiseases(condition.getInfectionDiseases());
            patientInfo.setPrimaryDisease(condition.getPrimaryDisease());
            Date primaryDiseaseDate = DateUtil.convertStringToDate(condition.getPrimaryDiseaseDate());
            patientInfo.setPrimaryDiseaseDate(primaryDiseaseDate);
            patientInfo.setPathologic(condition.getPathologic());
            patientInfo.setMedicalHistory1(condition.getMedicalHistory1());
            patientInfo.setMedicalHistory2(condition.getMedicalHistory2());
            patientInfo.setMedicalHistory3(condition.getMedicalHistory3());
            patientInfo.setMedicalHistory4(condition.getMedicalHistory4());
            patientInfo.setOutcomeType(condition.getOutComeType());
            patientInfo.setCreatedBy(getLoginUser().getUserNo());
            patientInfo.setDateCreated(now);
            patientInfo.setModifiedBy(getLoginUser().getUserNo());
            patientInfo.setDateModified(now);
            patientInfo.setRowVersion(1);
            patientInfo.setDelFlag(DELETE_FLAG_0);
            successCount = this.pdDPatientInfoMapper.insert(patientInfo);
            if (successCount == 0) {
                result.setRetMsg("新增结果失败！");
            } else {
                result.setRetMsg("新增结果成功！");
            }
        } else {
            patientInfo.setId(condition.getPatientId());
            patientInfo.setHpId(condition.getHospitalNo());
            patientInfo.setName(condition.getPatientName());
            patientInfo.setCardNo(condition.getIdCard());
            patientInfo.setPdNo(condition.getPdNo());
            Date firstDialsysDate = DateUtil.convertStringToDate(condition.getFirstDialsysDate());
            patientInfo.setFirstDialsysDate(firstDialsysDate);
            Date birthDay = DateUtil.convertStringToDate(condition.getBirthDay());
            patientInfo.setBirthDay(birthDay);
            patientInfo.setHeight(condition.getHeight());
            patientInfo.setPhoneNo(condition.getPhoneNo());
            patientInfo.setAddress(condition.getAddress());
            patientInfo.setAllergy(condition.getAllergy());
            patientInfo.setInfectionDiseases(condition.getInfectionDiseases());
            patientInfo.setPrimaryDisease(condition.getPrimaryDisease());
            Date primaryDiseaseDate = DateUtil.convertStringToDate(condition.getPrimaryDiseaseDate());
            patientInfo.setPrimaryDiseaseDate(primaryDiseaseDate);
            patientInfo.setPathologic(condition.getPathologic());
            patientInfo.setMedicalHistory1(condition.getMedicalHistory1());
            patientInfo.setMedicalHistory2(condition.getMedicalHistory2());
            patientInfo.setMedicalHistory3(condition.getMedicalHistory3());
            patientInfo.setMedicalHistory4(condition.getMedicalHistory4());
            patientInfo.setOutcomeType(condition.getOutComeType());
            patientInfo.setModifyid(getLoginUser().getUserNo());
            patientInfo.setModifydate(now);
            patientInfo.setRowVersion(Integer.valueOf(condition.getRowVersion()) + 1);
            PdDPatientInfoExample infoExample = new PdDPatientInfoExample();
            PdDPatientInfoExample.Criteria criteria = infoExample.createCriteria();
            criteria.andIdEqualTo(condition.getPatientId());
            criteria.andRowVersionEqualTo(Integer.valueOf(condition.getRowVersion()));
            successCount = pdDPatientInfoMapper.updateByExampleSelective(patientInfo, infoExample);
            if (successCount == 0) {
                result.setRetMsg("修改结果失败！");
            } else {
                result.setRetMsg("修改结果成功！");
            }
        }

        result.setSuccessCount(successCount);
        return result;
    }

    @Override
    public JacksonPagginListReturn<PatientRstForm> getPatientDataLists(PatientForm form) {
        JacksonPagginListReturn<PatientRstForm> rst = new JacksonPagginListReturn<>();
        List<String> outComeTypes = new ArrayList<>();
        if(form.getOutComeType().equals("PT-TYPE-001")){
        	outComeTypes.add("PD_OUT_1");
        }else{
        	outComeTypes.add("PD_OUT_2");
        	outComeTypes.add("PD_OUT_3");
        	outComeTypes.add("PD_OUT_4");
        }
        form.setOutComeTypes(outComeTypes);
        ListResult<PatientRstForm> dPatientInfos = getWebCommonDao().selectList("PatientListMapper.searchPatients",
                form);
        rst.setData(dPatientInfos.getResultData());
        return rst;
    }

    @Override
    public PdDPatientInfo getPatientData(PatientForm form) {

        if (Tools.isblank(form.getPatientId()) || Tools.isblank(form.getHospitalNo())) {
            return null;
        }
        PdDPatientInfoExample example = new PdDPatientInfoExample();
        PdDPatientInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(form.getPatientId());
        criteria.andDelFlagEqualTo(DELETE_FLAG_0);
        criteria.andHpIdEqualTo(form.getHospitalNo());
        List<PdDPatientInfo> result = pdDPatientInfoMapper.selectByExample(example);
        if (!Tools.listisblank(result)) {
            return result.get(0);
        }
        return null;
    }

    @Override
    public JacksonCountReturn deletePatient(PatientForm condition) {
        JacksonCountReturn result = new JacksonCountReturn();
        PdDPatientInfo record = new PdDPatientInfo();
        record.setDelFlag(DELETE_FLAG_1);
        record.setRowVersion(Integer.valueOf(condition.getRowVersion()) + 1);
        PdDPatientInfoExample example = new PdDPatientInfoExample();
        PdDPatientInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(condition.getPatientId());
        criteria.andRowVersionEqualTo(Integer.valueOf(condition.getRowVersion()));
        int successCount = pdDPatientInfoMapper.updateByExampleSelective(record, example);
        if (successCount > 0) {
            result.setRetMsg("删除成功");
        } else if (successCount == 0) {
            result.setRetMsg("删除失败");
        }
        result.setSuccessCount(successCount);
        return result;
    }

    @Override
    public PatientForm getPatientFormById(String patientId) {
        PatientForm patientForm = new PatientForm();
        PdDPatientInfoKey infoKey = new PdDPatientInfoKey();
        infoKey.setId(patientId);
        PdDPatientInfo patientInfo = this.pdDPatientInfoMapper.selectByPrimaryKey(infoKey);
        patientForm.setPatientId(patientId);
        patientForm.setHospitalNo(patientInfo.getHpId());
        patientForm.setPatientName(patientInfo.getName());
        patientForm.setIdCard(patientInfo.getCardNo());
        patientForm.setPdNo(patientInfo.getPdNo());
        patientForm.setFirstDialsysDate(DateUtil.convertDateToString(patientInfo.getFirstDialsysDate()));
        patientForm.setBirthDay(DateUtil.convertDateToString(patientInfo.getBirthDay()));
        patientForm.setHeight(patientInfo.getHeight());
        patientForm.setPhoneNo(patientInfo.getPhoneNo());
        patientForm.setAddress(patientInfo.getAddress());
        patientForm.setAllergy(patientInfo.getAllergy());
        patientForm.setInfectionDiseases(patientInfo.getInfectionDiseases());
        patientForm.setPrimaryDisease(patientInfo.getPrimaryDisease());
        patientForm.setPrimaryDiseaseDate(DateUtil.convertDateToString(patientInfo.getPrimaryDiseaseDate()));
        patientForm.setPathologic(patientInfo.getPathologic());

        return patientForm;
    }

}
