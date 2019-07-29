package com.ustcsoft.pdqc.web.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationObjectSupport;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMCodeMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCode;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.rythm.widget.ztree.ZTreeCheckData;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.systemmanagement.form.ZTreeTestProjectForm;
/**
 * 共通ServiceImpl
 * @author xujie
 *
 */
@Service
public class CommonServiceImpl extends WebApplicationObjectSupport implements CommonService {

    @Autowired
    PdDCenterMapper pdDCenterMapper;
    
    @Autowired
    PdDQcCenterMapper pdDQcCenterMapper;
    
    @Autowired
    PdMOrganizationMapper pdMOrganizationMapper;
    
    @Autowired
    private PdMCodeMapper pdMCodeMapper;
    
    List<PdMOrganization> childMenu = new ArrayList<PdMOrganization>();
    
    /**
     * 获取组织机构树
     */
    public JacksonListReturn<ZTreeTestProjectForm<PdMOrganization>> getOrganizationTree(String orgNo){
     // 创建JSON返回对象
        JacksonListReturn<ZTreeTestProjectForm<PdMOrganization>> json = new JacksonListReturn<>();
        // 先查出所有记录
        PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
        PdMOrganizationExample.Criteria pdMOrganizationCriteria = pdMOrganizationExample.createCriteria();
        pdMOrganizationCriteria.andDelFlagEqualTo("0");
        List<PdMOrganization> pdMOrganizationList = new ArrayList<PdMOrganization>();
        pdMOrganizationList = pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
        // 重置childMenu
        childMenu = new ArrayList<PdMOrganization>();
        if (pdMOrganizationList.size()>0) {
            List<ZTreeTestProjectForm<PdMOrganization>> relist = new ArrayList<ZTreeTestProjectForm<PdMOrganization>>();
            // 筛选子节点
            List<PdMOrganization> childList = new ArrayList<PdMOrganization>();
            // 先将自身放入childMenu
            for (PdMOrganization mu : pdMOrganizationList) {
                if ((mu.getOrgNo()).equals(orgNo)) {
                    childList.add(mu);
                }
            }
            // 获取下级节点
            childList.addAll(treeMenuList(pdMOrganizationList,orgNo));
            // 质控中心orgNo列表
            List<String> qcOrgList = new ArrayList<String>();
            // 透析中心orgNo列表
            List<String> diaOrgList = new ArrayList<String>();
            // 质控中心 orgNo-Name Map
            Map<String,String> qcMap = new HashMap<String,String>();
            // 透析中心 orgNo-Name Map
            Map<String,String> diaMap = new HashMap<String,String>();
            for (PdMOrganization pdMOrganization : childList) {
                if (pdMOrganization.getOrgType().equals("1")) {
                    qcOrgList.add(pdMOrganization.getOrgNo());
                } else if (pdMOrganization.getOrgType().equals("2")) {
                    diaOrgList.add(pdMOrganization.getOrgNo());
                }
            }
            // 获取质控中心名称
            if(qcOrgList.size()>0){
                PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
                PdDQcCenterExample.Criteria pdDQcCenterCriteria = pdDQcCenterExample.createCriteria();
                pdDQcCenterCriteria.andOrgNoIn(qcOrgList);
                pdDQcCenterCriteria.andDelFlagEqualTo("0");
                List<PdDQcCenter> pdDQcCenterList = new ArrayList<PdDQcCenter>();
                pdDQcCenterList = pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
                for (PdDQcCenter pdDQcCenter : pdDQcCenterList) {
                    qcMap.put(pdDQcCenter.getOrgNo(), pdDQcCenter.getQcCenterName());
                }
            }
            // 获取透析中心名称
            if(diaOrgList.size()>0){
                PdDCenterExample pdDCenterExample = new PdDCenterExample();
                PdDCenterExample.Criteria pdDCenterCriteria = pdDCenterExample.createCriteria();
                pdDCenterCriteria.andOrgNoIn(diaOrgList);
                pdDCenterCriteria.andDelFlagEqualTo("0");
                List<PdDCenter> pdDCenterList = new ArrayList<PdDCenter>();
                pdDCenterList = pdDCenterMapper.selectByExample(pdDCenterExample);
                for (PdDCenter pdDCenter : pdDCenterList) {
                    diaMap.put(pdDCenter.getOrgNo(), pdDCenter.getPdCenterName());
                }
            }
            // 将数据放入树中
            for (PdMOrganization pdMOrganization : childList) {
                ZTreeTestProjectForm<PdMOrganization> rform = new ZTreeTestProjectForm<PdMOrganization>();
                rform.setId(pdMOrganization.getOrgNo());
                rform.setPid(pdMOrganization.getParentNo());
                String centerName = qcMap.get(pdMOrganization.getOrgNo());
                if (centerName == null || "".equals(centerName)) {
                    centerName = diaMap.get(pdMOrganization.getOrgNo());
                }
                rform.setName(centerName);
                rform.setOrgType(pdMOrganization.getOrgType());
                relist.add(rform);
            }
            json.setData(relist);
        }
        return json;
    }
    
    /**
     * 获取orgNo子节点的透析中心和质控中心
     */
    @Override
    public List<Code> getOrgSelectOptions(String orgNo) {
        PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
        PdMOrganizationExample.Criteria pdMOrganizationCriteria = pdMOrganizationExample.createCriteria();
        pdMOrganizationCriteria.andDelFlagEqualTo("0");
        List<PdMOrganization> pdMOrganizationList = new ArrayList<PdMOrganization>();
        pdMOrganizationList = pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
        // 重置childMenu
        childMenu = new ArrayList<PdMOrganization>();
        List<Code> organizationList = new ArrayList<Code>();
        List<PdMOrganization> childList = new ArrayList<PdMOrganization>();
        if (pdMOrganizationList.size()>0) {
            // 筛选子节点
            // 先将自身放入childMenu
            for (PdMOrganization mu : pdMOrganizationList) {
                if ((mu.getOrgNo()).equals(orgNo)) {
                    childList.add(mu);
                }
            }
            // 获取下级节点
            childList.addAll(treeMenuList(pdMOrganizationList,orgNo));
            // 质控中心orgNo列表
            List<String> qcOrgList = new ArrayList<String>();
            // 透析中心orgNo列表
            List<String> diaOrgList = new ArrayList<String>();
            // 质控中心 orgNo-Name Map
            Map<String,String> qcMap = new HashMap<String,String>();
            // 透析中心 orgNo-Name Map
            Map<String,String> diaMap = new HashMap<String,String>();
            for (PdMOrganization pdMOrganization : childList) {
                if (pdMOrganization.getOrgType().equals("1")) {
                    qcOrgList.add(pdMOrganization.getOrgNo());
                } else if (pdMOrganization.getOrgType().equals("2")) {
                    diaOrgList.add(pdMOrganization.getOrgNo());
                }
            }
            // 获取质控中心名称
            if(qcOrgList.size()>0){
                PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
                PdDQcCenterExample.Criteria pdDQcCenterCriteria = pdDQcCenterExample.createCriteria();
                pdDQcCenterCriteria.andOrgNoIn(qcOrgList);
                pdDQcCenterCriteria.andDelFlagEqualTo("0");
                List<PdDQcCenter> pdDQcCenterList = new ArrayList<PdDQcCenter>();
                pdDQcCenterList = pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
                for (PdDQcCenter pdDQcCenter : pdDQcCenterList) {
                    qcMap.put(pdDQcCenter.getOrgNo(), pdDQcCenter.getQcCenterName());
                }
            }
            // 获取透析中心名称
            if(diaOrgList.size()>0){
                PdDCenterExample pdDCenterExample = new PdDCenterExample();
                PdDCenterExample.Criteria pdDCenterCriteria = pdDCenterExample.createCriteria();
                pdDCenterCriteria.andOrgNoIn(diaOrgList);
                pdDCenterCriteria.andDelFlagEqualTo("0");
                List<PdDCenter> pdDCenterList = new ArrayList<PdDCenter>();
                pdDCenterList = pdDCenterMapper.selectByExample(pdDCenterExample);
                for (PdDCenter pdDCenter : pdDCenterList) {
                    diaMap.put(pdDCenter.getOrgNo(), pdDCenter.getPdCenterName());
                }
            }
            
            for(PdMOrganization pdMOrganization : childList) {
                Code code = new Code();
                String centerName = qcMap.get(pdMOrganization.getOrgNo());
                if (centerName == null || "".equals(centerName)) {
                    centerName = diaMap.get(pdMOrganization.getOrgNo());
                }
                code.setText(centerName);
                code.setValue(pdMOrganization.getOrgNo());
                organizationList.add(code);
            }
        }
        return organizationList;
    }
    
    /**
     * 获取orgNo子节点的透析中心和质控中心(下拉树)
     */
    public JacksonReturn getOrgSelectOptionsTree(String orgNo) {
        JacksonListReturn<ZTreeCheckData<PdMOrganization>> jacksonReturn = new JacksonListReturn<>();
        PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
        PdMOrganizationExample.Criteria pdMOrganizationCriteria = pdMOrganizationExample.createCriteria();
        pdMOrganizationCriteria.andDelFlagEqualTo("0");
        List<PdMOrganization> pdMOrganizationList = new ArrayList<PdMOrganization>();
        pdMOrganizationList = pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
        // 重置childMenu
        childMenu = new ArrayList<PdMOrganization>();
        List<PdMOrganization> childList = new ArrayList<PdMOrganization>();
        if (pdMOrganizationList.size()>0) {
            // 筛选子节点
            // 先将自身放入childMenu
            for (PdMOrganization mu : pdMOrganizationList) {
                if ((mu.getOrgNo()).equals(orgNo)) {
                    childList.add(mu);
                }
            }
            // 获取下级节点
            childList.addAll(treeMenuList(pdMOrganizationList,orgNo));
            // 质控中心orgNo列表
            List<String> qcOrgList = new ArrayList<String>();
            // 透析中心orgNo列表
            List<String> diaOrgList = new ArrayList<String>();
            // 质控中心 orgNo-Name Map
            Map<String,String> qcMap = new HashMap<String,String>();
            // 透析中心 orgNo-Name Map
            Map<String,String> diaMap = new HashMap<String,String>();
            for (PdMOrganization pdMOrganization : childList) {
                if (pdMOrganization.getOrgType().equals("1")) {
                    qcOrgList.add(pdMOrganization.getOrgNo());
                } else if (pdMOrganization.getOrgType().equals("2")) {
                    diaOrgList.add(pdMOrganization.getOrgNo());
                }
            }
            // 获取质控中心名称
            if(qcOrgList.size()>0){
                PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
                PdDQcCenterExample.Criteria pdDQcCenterCriteria = pdDQcCenterExample.createCriteria();
                pdDQcCenterCriteria.andOrgNoIn(qcOrgList);
                pdDQcCenterCriteria.andDelFlagEqualTo("0");
                List<PdDQcCenter> pdDQcCenterList = new ArrayList<PdDQcCenter>();
                pdDQcCenterList = pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
                for (PdDQcCenter pdDQcCenter : pdDQcCenterList) {
                    qcMap.put(pdDQcCenter.getOrgNo(), pdDQcCenter.getQcCenterName());
                }
            }
            // 获取透析中心名称
            if(diaOrgList.size()>0){
                PdDCenterExample pdDCenterExample = new PdDCenterExample();
                PdDCenterExample.Criteria pdDCenterCriteria = pdDCenterExample.createCriteria();
                pdDCenterCriteria.andOrgNoIn(diaOrgList);
                pdDCenterCriteria.andDelFlagEqualTo("0");
                List<PdDCenter> pdDCenterList = new ArrayList<PdDCenter>();
                pdDCenterList = pdDCenterMapper.selectByExample(pdDCenterExample);
                for (PdDCenter pdDCenter : pdDCenterList) {
                    diaMap.put(pdDCenter.getOrgNo(), pdDCenter.getPdCenterName());
                }
            }
            
            for(PdMOrganization pdMOrganization : childList) {
                ZTreeCheckData<PdMOrganization> zTreeCheckData = new ZTreeCheckData<PdMOrganization>();
                String centerName = qcMap.get(pdMOrganization.getOrgNo());
                if (centerName == null || "".equals(centerName)) {
                    centerName = diaMap.get(pdMOrganization.getOrgNo());
                }
                zTreeCheckData.setName(centerName);
                zTreeCheckData.setId(pdMOrganization.getOrgNo());
                zTreeCheckData.setPid(pdMOrganization.getParentNo());
                jacksonReturn.getData().add(zTreeCheckData);
            }
        }
        return jacksonReturn;
    }
    

    /**
     * 获取orgNo子节点的质控中心
     */
    @Override
    public List<Code> getQcCenterSelectOptions(String orgNo) {
        List<Code> resultList = new ArrayList<Code>();
        // 先查出所有记录
        PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
        PdMOrganizationExample.Criteria pdMOrganizationCriteria = pdMOrganizationExample.createCriteria();
        pdMOrganizationCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        List<PdMOrganization> pdMOrganizationList = new ArrayList<PdMOrganization>();
        pdMOrganizationList = pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
        // 重置childMenu
        childMenu = new ArrayList<PdMOrganization>();
        if (pdMOrganizationList.size()>0) {
            // 筛选子节点
            List<PdMOrganization> childList = new ArrayList<PdMOrganization>();
            // 如果自身是质控中心 先将自身放入childMenu
            for (PdMOrganization mu : pdMOrganizationList) {
                if ((mu.getOrgNo()).equals(orgNo)) {
                    if (mu.getOrgType().equals(ORGTYPE_1)){
                        childList.add(mu);
                    }
                }
            }
            // 获取下级节点
            childList.addAll(treeMenuList(pdMOrganizationList,orgNo));
            // 筛选质控中心
            for (int i=0; i<childList.size(); i++){
                if(!ORGTYPE_1.equals(childList.get(i).getOrgType())){
                    childList.remove(i);
                    i--;
                }
            }
            // 质控中心orgNo列表
            List<String> qcOrgList = new ArrayList<String>();
            // 透析中心orgNo列表
            List<String> diaOrgList = new ArrayList<String>();
            // 质控中心 orgNo-Name Map
            Map<String,String> qcMap = new HashMap<String,String>();
            // 透析中心 orgNo-Name Map
            Map<String,String> diaMap = new HashMap<String,String>();
            for (PdMOrganization pdMOrganization : childList) {
                if (pdMOrganization.getOrgType().equals(ORGTYPE_1)) {
                    qcOrgList.add(pdMOrganization.getOrgNo());
                } else if (pdMOrganization.getOrgType().equals(ORGTYPE_2)) {
                    diaOrgList.add(pdMOrganization.getOrgNo());
                }
            }
            // 获取质控中心名称
            if(qcOrgList.size()>0){
                PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
                PdDQcCenterExample.Criteria pdDQcCenterCriteria = pdDQcCenterExample.createCriteria();
                pdDQcCenterCriteria.andOrgNoIn(qcOrgList);
                pdDQcCenterCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
                List<PdDQcCenter> pdDQcCenterList = new ArrayList<PdDQcCenter>();
                pdDQcCenterList = pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
                for (PdDQcCenter pdDQcCenter : pdDQcCenterList) {
                    qcMap.put(pdDQcCenter.getOrgNo(), pdDQcCenter.getQcCenterName());
                }
            }
            // 获取透析中心名称
            if(qcOrgList.size()>0){
                PdDCenterExample pdDCenterExample = new PdDCenterExample();
                PdDCenterExample.Criteria pdDCenterCriteria = pdDCenterExample.createCriteria();
                pdDCenterCriteria.andOrgNoIn(qcOrgList);
                pdDCenterCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
                List<PdDCenter> pdDCenterList = new ArrayList<PdDCenter>();
                pdDCenterList = pdDCenterMapper.selectByExample(pdDCenterExample);
                for (PdDCenter pdDCenter : pdDCenterList) {
                    diaMap.put(pdDCenter.getOrgNo(), pdDCenter.getPdCenterName());
                }
            }
            // 将数据放入选项中
            for (PdMOrganization pdMOrganization : childList) {
                String centerName = qcMap.get(pdMOrganization.getOrgNo());
                if (centerName == null || "".equals(centerName)) {
                    centerName = diaMap.get(pdMOrganization.getOrgNo());
                }
                Code unit = new Code();
                unit.setValue(pdMOrganization.getOrgNo());
                unit.setText(centerName);
                resultList.add(unit);
            }
        }
        return resultList;
    }


    
    /**
     * 获取子节点
     * @param menuList
     * @param pid
     * @return
     */
    public List<PdMOrganization> treeMenuList(List<PdMOrganization> menuList, String pid){
        for (PdMOrganization mu : menuList) {
            //遍历出父id等于参数的id，add进子节点集合
            if ((pid).equals(mu.getParentNo())) {
                //递归遍历下一级
                childMenu.add(mu);
                treeMenuList(menuList,mu.getOrgNo());
            }
        }
        return childMenu;
    }

	@Override
	public List<Code> getOptionsByParentCode(String parentCode) {
		List<Code> optionList = new ArrayList<>();
		PdMCodeExample codeExample = new PdMCodeExample();
		PdMCodeExample.Criteria criteria = codeExample.createCriteria();
		criteria.andDelFlagEqualTo(DELETE_FLAG_0);
		criteria.andParentCodeEqualTo(parentCode);
		List<PdMCode> mCodes = this.pdMCodeMapper.selectByExample(codeExample);
		for(PdMCode code : mCodes){
			Code code01 = new Code();
			code01.setText(code.getValue());
			code01.setValue(code.getCode());
			optionList.add(code01);
		}
		return optionList;
	}
    

}
