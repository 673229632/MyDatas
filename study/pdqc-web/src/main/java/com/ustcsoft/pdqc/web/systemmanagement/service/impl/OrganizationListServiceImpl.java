package com.ustcsoft.pdqc.web.systemmanagement.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.systemmanagement.form.QcCenterResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.TxCenterResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.service.OrganizationListService;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationKey;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.rythmui.widget.bootstrapselect.SelectOptionUnit;

/**
 * 
 * @author xujie
 *
 */
@Service
public class OrganizationListServiceImpl extends WebBaseServiceImpl implements OrganizationListService {
    
    @Autowired
    PdMOrganizationMapper pdMOrganizationMapper;
    
    @Autowired
    PdDQcCenterMapper pdDQcCenterMapper;
    
    @Autowired
    PdDCenterMapper pdDCenterMapper;
    
    List<PdMOrganization> childMenu = new ArrayList<PdMOrganization>();  

    @Override
    public JacksonDataReturn<QcCenterResultForm> selectQcCenterByOrgNo(String qcOrgNo) {
        JacksonDataReturn<QcCenterResultForm> result = new JacksonDataReturn<QcCenterResultForm>();
        QcCenterResultForm qcCenterResultForm = new QcCenterResultForm();
        qcCenterResultForm.setQcOrgNo(qcOrgNo);
        // 查询PdMOrganization表获取机构信息
        PdMOrganizationKey pdMOrganizationKey = new PdMOrganizationKey();
        pdMOrganizationKey.setOrgNo(qcOrgNo);
        PdMOrganization pdMOrganization = pdMOrganizationMapper.selectByPrimaryKey(pdMOrganizationKey);
        // 获取组织类别和上级组织编号
        if (pdMOrganization != null) {
            qcCenterResultForm.setQcParentNo(pdMOrganization.getParentNo());
            qcCenterResultForm.setQcCenterType(pdMOrganization.getOrgType());
        }
        // 查询PdDQcCenterExample表获取机构信息
        PdDQcCenter pdDQcCenter = new PdDQcCenter();
        PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
        PdDQcCenterExample.Criteria pdDQcCenterCriteria = pdDQcCenterExample.createCriteria();
        pdDQcCenterCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        pdDQcCenterCriteria.andOrgNoEqualTo(qcOrgNo);
        List<PdDQcCenter> pdDQcCenterList = new ArrayList<PdDQcCenter>();
        pdDQcCenterList = pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
        if(pdDQcCenterList.size() > 0) {
            pdDQcCenter = pdDQcCenterList.get(0);
            // 获取质控中心信息
            qcCenterResultForm.setQcCenterName(pdDQcCenter.getQcCenterName());
            qcCenterResultForm.setQcCenterManager(pdDQcCenter.getQcCenterManager());
            qcCenterResultForm.setQcCenterTel(pdDQcCenter.getQcCenterTel());
            qcCenterResultForm.setQcCenterPostcode(pdDQcCenter.getQcCenterPostcode());
            qcCenterResultForm.setQcCenterFax(pdDQcCenter.getQcCenterFax());
            qcCenterResultForm.setQcCenterEmail(pdDQcCenter.getQcCenterEmail());
            qcCenterResultForm.setQcCenterAddress(pdDQcCenter.getQcCenterAddress());
        }
        result.setData(qcCenterResultForm);
        return result;
    }

    @Override
    public JacksonDataReturn<TxCenterResultForm> selectTxCenterByOrgNo(String txOrgNo) {
        JacksonDataReturn<TxCenterResultForm> result = new JacksonDataReturn<TxCenterResultForm>();
        TxCenterResultForm txCenterResultForm = new TxCenterResultForm();
        txCenterResultForm.setTxOrgNo(txOrgNo);
        // 查询PdMOrganization表获取机构信息
        PdMOrganizationKey pdMOrganizationKey = new PdMOrganizationKey();
        pdMOrganizationKey.setOrgNo(txOrgNo);
        PdMOrganization pdMOrganization = pdMOrganizationMapper.selectByPrimaryKey(pdMOrganizationKey);
        // 获取组织类别和上级组织编号
        if (pdMOrganization != null) {
            txCenterResultForm.setTxParentNo(pdMOrganization.getParentNo());
            txCenterResultForm.setTxCenterType(pdMOrganization.getOrgType());
        }
        // 查询PdDCenterExample表获取机构信息
        PdDCenter pdDCenter = new PdDCenter();
        PdDCenterExample pdDCenterExample = new PdDCenterExample();
        PdDCenterExample.Criteria pdDCenterCriteria = pdDCenterExample.createCriteria();
        pdDCenterCriteria.andDelFlagEqualTo(DELETE_FLAG_0);
        pdDCenterCriteria.andOrgNoEqualTo(txOrgNo);
        List<PdDCenter> pdDCenterList = new ArrayList<PdDCenter>();
        pdDCenterList = pdDCenterMapper.selectByExample(pdDCenterExample);
        if(pdDCenterList.size() > 0) {
            pdDCenter = pdDCenterList.get(0);
            // 获取透析中心信息
            txCenterResultForm.setPdCenterName(pdDCenter.getPdCenterName());
            txCenterResultForm.setPdCenterManager(pdDCenter.getPdCenterManager());
            txCenterResultForm.setPdCenterTel(pdDCenter.getPdCenterTel());
            txCenterResultForm.setPcCenterPostcode(pdDCenter.getPdCenterPostcode());
            txCenterResultForm.setPdCenterFax(pdDCenter.getPdCenterFax());
            txCenterResultForm.setPdCenterEmail(pdDCenter.getPdCenterEmail());
            txCenterResultForm.setPdCenterAddress(pdDCenter.getPdCenterAddress());
            txCenterResultForm.setPdCenterArea(pdDCenter.getPdCenterArea());
            txCenterResultForm.setAdjustOrg(pdDCenter.getAdjustOrg());
            txCenterResultForm.setScoreWeight(pdDCenter.getScoreWeight());
        }
        result.setData(txCenterResultForm);
        return result;
    }
    
    /**
     * 获取ParentNo下拉框的选项（包含顶级节点的父节点选项）
     */
    @Override
    public List<SelectOptionUnit> getSelectPickerContainsTop(String orgNo) {
        List<SelectOptionUnit> resultList = new ArrayList<SelectOptionUnit>();
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
            String parNo = "";
            for (PdMOrganization mu : pdMOrganizationList) {
                if ((mu.getOrgNo()).equals(orgNo)) {
                    parNo = mu.getParentNo();
                    if (mu.getOrgType().equals(ORGTYPE_1)){
                        childList.add(mu);
                    }
                }
            }
            // 将自身的父节点放入childMenu
            for (PdMOrganization mu : pdMOrganizationList) {
                if ((mu.getOrgNo()).equals(parNo)) {
                    if (mu.getOrgType().equals(ORGTYPE_1)){
                        childList.add(mu);
                    }
                }
            }
            // 筛选质控中心
            for (int i=0; i<pdMOrganizationList.size(); i++){
                if(!ORGTYPE_1.equals(pdMOrganizationList.get(i).getOrgType())){
                    pdMOrganizationList.remove(i);
                    i--;
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
                if (pdMOrganization.getOrgType().equals(ORGTYPE_1)) {
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
                SelectOptionUnit unit = new SelectOptionUnit();
                unit.setValue(pdMOrganization.getOrgNo());
                unit.setText(centerName);
                resultList.add(unit);
            }
        }
        return resultList;
    }
    
    /**
     * 获取ParentNo下拉框的选项（不包含顶级节点的父节点选项）
     */
    @Override
    public List<SelectOptionUnit> getSelectPickerNotContainsTop(String orgNo) {
        List<SelectOptionUnit> resultList = new ArrayList<SelectOptionUnit>();
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
            // 筛选质控中心
            for (int i=0; i<pdMOrganizationList.size(); i++){
                if(!ORGTYPE_1.equals(pdMOrganizationList.get(i).getOrgType())){
                    pdMOrganizationList.remove(i);
                    i--;
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
                if (pdMOrganization.getOrgType().equals(ORGTYPE_1)) {
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
                SelectOptionUnit unit = new SelectOptionUnit();
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
            if ((pid.equals(mu.getParentNo()))) {
                //递归遍历下一级
                childMenu.add(mu);
                treeMenuList(menuList,mu.getOrgNo());
            }
        }
        return childMenu;
    }

    /**
     * 保存质控中心
     * @param qcCenterResultForm
     * @return
     */
    @Override
    public JacksonCountReturn saveQcCenter(QcCenterResultForm qcCenterResultForm) {
        JacksonCountReturn result = new JacksonCountReturn();
        PdDQcCenter pdDQcCenter = new PdDQcCenter();
        PdMOrganization pdMOrganization = new PdMOrganization();
        int successCount = 0;
        Date nowDate = new Date();
        pdDQcCenter.setQcCenterName(qcCenterResultForm.getQcCenterName());
        pdDQcCenter.setQcCenterManager(qcCenterResultForm.getQcCenterManager());
        pdDQcCenter.setQcCenterTel(qcCenterResultForm.getQcCenterTel());
        pdDQcCenter.setQcCenterPostcode(qcCenterResultForm.getQcCenterPostcode());
        pdDQcCenter.setQcCenterFax(qcCenterResultForm.getQcCenterFax());
        pdDQcCenter.setQcCenterEmail(qcCenterResultForm.getQcCenterEmail());
        pdDQcCenter.setQcCenterAddress(qcCenterResultForm.getQcCenterAddress());
        pdDQcCenter.setModifiedBy(getLoginUser().getUserNo());
        pdDQcCenter.setDateModified(nowDate);
        pdDQcCenter.setDelFlag(DELETE_FLAG_0);
        
        pdMOrganization.setParentNo(qcCenterResultForm.getQcParentNo());
        pdMOrganization.setOrgType(ORGTYPE_1);
        pdMOrganization.setDateModified(nowDate);
        pdMOrganization.setModifiedBy(getLoginUser().getUserNo());
        pdMOrganization.setDelFlag(DELETE_FLAG_0);
        
        // qcOrgNo不为空时更新 否则新增
        if (qcCenterResultForm.getQcOrgNo() != null && !"".equals(qcCenterResultForm.getQcOrgNo())) {
            pdDQcCenter.setOrgNo(qcCenterResultForm.getQcOrgNo());
            pdMOrganization.setOrgNo(qcCenterResultForm.getQcOrgNo());
            //获取数据库数据
            PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
            PdDQcCenterExample.Criteria pdDQcCenterCriteria = pdDQcCenterExample.createCriteria();
            pdDQcCenterCriteria.andOrgNoEqualTo(qcCenterResultForm.getQcOrgNo());
            List<PdDQcCenter> orgCenterList = new ArrayList<PdDQcCenter>();
            orgCenterList = pdDQcCenterMapper.selectByExample(pdDQcCenterExample);
            
            PdMOrganizationKey pdMOrganizationKey = new PdMOrganizationKey();
            pdMOrganizationKey.setOrgNo(qcCenterResultForm.getQcOrgNo());
            PdMOrganization org = pdMOrganizationMapper.selectByPrimaryKey(pdMOrganizationKey);
            
            if (orgCenterList.size() > 0 && org != null) {
                PdDQcCenter orgCenter = orgCenterList.get(0);
                pdDQcCenter.setDateCreated(orgCenter.getDateCreated());
                pdDQcCenter.setCreatedBy(orgCenter.getCreatedBy());
                pdDQcCenter.setQcCenterNo(orgCenter.getQcCenterNo());
                successCount = pdDQcCenterMapper.updateByPrimaryKey(pdDQcCenter);
                
                pdMOrganization.setDateCreated(org.getDateCreated());
                pdMOrganization.setCreatedBy(org.getCreatedBy());
                successCount += pdMOrganizationMapper.updateByPrimaryKey(pdMOrganization);
            }
        } else {
            pdMOrganization.setOrgNo(Tools.getFifteenUUID());
            pdMOrganization.setDateCreated(nowDate);
            pdMOrganization.setCreatedBy(getLoginUser().getUserNo());
            successCount = pdMOrganizationMapper.insert(pdMOrganization);
            
            pdDQcCenter.setQcCenterNo(Tools.getFifteenUUID());
            pdDQcCenter.setOrgNo(pdMOrganization.getOrgNo());
            pdDQcCenter.setDateCreated(nowDate);
            pdDQcCenter.setCreatedBy(getLoginUser().getUserNo());
            successCount += pdDQcCenterMapper.insert(pdDQcCenter);
            
        }
        if (successCount < 2) {
            result.setRetMsg("保存失败");
        } else {
            result.setRetMsg("保存成功");
        }
        result.setSuccessCount(successCount);
        return result;
    }

    @Override
    public JacksonCountReturn saveTxCenter(TxCenterResultForm txCenterResultForm) {
        JacksonCountReturn result = new JacksonCountReturn();
        PdDCenter pdDCenter = new PdDCenter();
        PdMOrganization pdMOrganization = new PdMOrganization();
        int successCount = 0;
        Date nowDate = new Date();
        pdDCenter.setPdCenterName(txCenterResultForm.getPdCenterName());
        pdDCenter.setPdCenterManager(txCenterResultForm.getPdCenterManager());
        pdDCenter.setPdCenterTel(txCenterResultForm.getPdCenterTel());
        pdDCenter.setPdCenterPostcode(txCenterResultForm.getPcCenterPostcode());
        pdDCenter.setPdCenterFax(txCenterResultForm.getPdCenterFax());
        pdDCenter.setPdCenterEmail(txCenterResultForm.getPdCenterEmail());
        pdDCenter.setPdCenterAddress(txCenterResultForm.getPdCenterAddress());
        pdDCenter.setPdCenterArea(txCenterResultForm.getPdCenterArea());
        pdDCenter.setScoreWeight(txCenterResultForm.getScoreWeight());
        pdDCenter.setAdjustOrg(txCenterResultForm.getAdjustOrg());
        pdDCenter.setModifiedBy(getLoginUser().getUserNo());
        pdDCenter.setDateModified(nowDate);
        pdDCenter.setDelFlag(DELETE_FLAG_0);
        
        pdMOrganization.setParentNo(txCenterResultForm.getTxParentNo());
        pdMOrganization.setOrgType("2");
        pdMOrganization.setDateModified(nowDate);
        pdMOrganization.setModifiedBy(getLoginUser().getUserNo());
        pdMOrganization.setDelFlag(DELETE_FLAG_0);
        
        // qcOrgNo不为空时更新 否则新增
        if (txCenterResultForm.getTxOrgNo() != null && !"".equals(txCenterResultForm.getTxOrgNo())) {
            pdDCenter.setOrgNo(txCenterResultForm.getTxOrgNo());
            pdMOrganization.setOrgNo(txCenterResultForm.getTxOrgNo());
            //获取数据库数据
            PdDCenterExample pdDCenterExample = new PdDCenterExample();
            PdDCenterExample.Criteria pdDCenterCriteria = pdDCenterExample.createCriteria();
            pdDCenterCriteria.andOrgNoEqualTo(txCenterResultForm.getTxOrgNo());
            List<PdDCenter> orgCenterList = new ArrayList<PdDCenter>();
            orgCenterList = pdDCenterMapper.selectByExample(pdDCenterExample);
            
            PdMOrganizationKey pdMOrganizationKey = new PdMOrganizationKey();
            pdMOrganizationKey.setOrgNo(txCenterResultForm.getTxOrgNo());
            PdMOrganization org = pdMOrganizationMapper.selectByPrimaryKey(pdMOrganizationKey);
            
            if (orgCenterList.size() > 0 && org != null) {
                PdDCenter orgCenter = orgCenterList.get(0);
                pdDCenter.setDateCreated(orgCenter.getDateCreated());
                pdDCenter.setCreatedBy(orgCenter.getCreatedBy());
                pdDCenter.setPdCenterNo(orgCenter.getPdCenterNo());
                successCount = pdDCenterMapper.updateByPrimaryKey(pdDCenter);
                
                pdMOrganization.setDateCreated(org.getDateCreated());
                pdMOrganization.setCreatedBy(org.getCreatedBy());
                successCount += pdMOrganizationMapper.updateByPrimaryKey(pdMOrganization);
            }
        } else {
            pdMOrganization.setOrgNo(Tools.getFifteenUUID());
            pdMOrganization.setDateCreated(nowDate);
            pdMOrganization.setCreatedBy(getLoginUser().getUserNo());
            successCount = pdMOrganizationMapper.insert(pdMOrganization);
            
            pdDCenter.setPdCenterNo(Tools.getFifteenUUID());
            pdDCenter.setOrgNo(pdMOrganization.getOrgNo());
            pdDCenter.setDateCreated(nowDate);;
            pdDCenter.setCreatedBy(getLoginUser().getUserNo());
            
            successCount += pdDCenterMapper.insert(pdDCenter);
        }
        if (successCount < 2) {
            result.setRetMsg("保存失败");
        } else {
            result.setRetMsg("保存成功");
        }
        result.setSuccessCount(successCount);
        return result;
    }

    @Override
    public JacksonCountReturn delCenter(String orgNo) {
        JacksonCountReturn result = new JacksonCountReturn();
        // 先查出所有记录
        int successCount = 0;
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
            // 先将自身放入childMenu
            for (PdMOrganization mu : pdMOrganizationList) {
                if ((mu.getOrgNo()).equals(orgNo)) {
                    childList.add(mu);
                }
            }
            // 获取下级节点
            childList.addAll(treeMenuList(pdMOrganizationList,orgNo));
            // 组织机构orgNo列表
            List<String> orgList = new ArrayList<String>();
            // 质控中心orgNo列表
            List<String> qcOrgList = new ArrayList<String>();
            // 透析中心orgNo列表
            List<String> txOrgList = new ArrayList<String>();
            // 将orgNo放入列表中
            for (PdMOrganization pdMOrganization : childList){
                orgList.add(pdMOrganization.getOrgNo());
                if (ORGTYPE_1.equals(pdMOrganization.getOrgType())) {
                    qcOrgList.add(pdMOrganization.getOrgNo());
                } else if ("2".equals(pdMOrganization.getOrgType())) {
                    txOrgList.add(pdMOrganization.getOrgNo());
                }
            }
            // 删除质控中心
            if (qcOrgList.size()>0){
                PdDQcCenterExample pdDQcCenterExample = new PdDQcCenterExample();
                PdDQcCenterExample.Criteria pdDQcCenterCriteria = pdDQcCenterExample.createCriteria();
                pdDQcCenterCriteria.andOrgNoIn(qcOrgList);
                PdDQcCenter pdDQcCenter = new PdDQcCenter();
                pdDQcCenter.setDelFlag(DELETE_FLAG_1);
                successCount += pdDQcCenterMapper.updateByExampleSelective(pdDQcCenter, pdDQcCenterExample);
            }
            // 删除透析中心
            if (txOrgList.size()>0) {
                PdDCenterExample pdDCenterExample = new PdDCenterExample();
                PdDCenterExample.Criteria pdDCenterCriteria = pdDCenterExample.createCriteria();
                pdDCenterCriteria.andOrgNoIn(txOrgList);
                PdDCenter pdDCenter = new PdDCenter();
                pdDCenter.setDelFlag(DELETE_FLAG_1);
                successCount += pdDCenterMapper.updateByExampleSelective(pdDCenter, pdDCenterExample);
            }
            // 删除组织机构
            if (orgList.size()>0) {
                PdMOrganizationExample delExample = new PdMOrganizationExample();
                PdMOrganizationExample.Criteria delCriteria = delExample.createCriteria();
                delCriteria.andOrgNoIn(orgList);
                PdMOrganization pdMOrganization = new PdMOrganization();
                pdMOrganization.setDelFlag(DELETE_FLAG_1);
                successCount += pdMOrganizationMapper.updateByExampleSelective(pdMOrganization, delExample);
            }
            int reCount = orgList.size() + qcOrgList.size() + txOrgList.size();
            if (successCount < reCount) {
                result.setRetMsg("删除失败");
                successCount = 0;
            } else {
                result.setRetMsg("删除成功");
            }
        } else {
            result.setRetMsg("删除失败");
        }
        result.setSuccessCount(successCount);
        
        return result;
    }

}
