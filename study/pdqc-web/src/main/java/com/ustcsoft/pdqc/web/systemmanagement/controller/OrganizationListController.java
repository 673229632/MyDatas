package com.ustcsoft.pdqc.web.systemmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.mybatis.crud.result.ListResult;
import com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.common.service.CommonService;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.systemmanagement.constants.OrganizationListConstants;
import com.ustcsoft.pdqc.web.systemmanagement.form.QcCenterResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.TxCenterResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.service.OrganizationListService;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;
import com.ustcsoft.rythmui.widget.bootstrapselect.SelectOptionUnit;

/**
 * 
 * @author xujie
 *
 */
@Controller
@RequestMapping("/organizationList")
public class OrganizationListController extends WebBaseController {
    
    @Autowired
    PdMOrganizationMapper pdMOrganizationMapper;
    
    @Autowired
    PdDQcCenterMapper pdDQcCenterMapper;
    
    @Autowired
    PdDCenterMapper pdDCenterMapper;
    
    @Autowired
    WebCommonDao webCommonDao;
    
    @Autowired
    OrganizationListService organizationListService;
    
    @Autowired
    CommonService commonService;
    
    List<Code> conList = new ArrayList<Code>();
    
    List<Code> notconList = new ArrayList<Code>();
    
    
    List<PdMOrganization> childMenu = new ArrayList<PdMOrganization>();  

    @RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        // 重新加载时清空选项列表
        conList = new ArrayList<Code>();
        notconList = new ArrayList<Code>();
        String orgNo = getLoginUser().getOrgNo();
        List<SelectOptionUnit> parentList = organizationListService.getSelectPickerContainsTop(orgNo);
        List<Code> txParentList = new ArrayList<Code>();
        for(SelectOptionUnit SelectOptionUnit : parentList){
            Code code = new Code();
            code.setText(SelectOptionUnit.getText());
            code.setValue(SelectOptionUnit.getValue());
            txParentList.add(code);
        }
        String topOrgNo = getLoginUser().getOrgNo();
        model.addAttribute("topOrgNo", topOrgNo);
        model.addAttribute("txParentList", txParentList);
        return OrganizationListConstants.ORGANIZATION_LIST;
    }
    
    /**
     * 获取树
     * @param model
     * @return
     */
    @RequestMapping("/getTree")
    public JacksonReturn getTree() {
        String orgNo = getLoginUser().getOrgNo();
        return commonService.getOrganizationTree(orgNo);
    }
    
    /**
     * 根据机构编号获取质控中心
     * @param qcOrgNo
     * @return
     */
    @RequestMapping("/selectQcCenterByOrgNo")
    public JacksonDataReturn<QcCenterResultForm> selectQcCenterByOrgNo(String orgNo) {
        return organizationListService.selectQcCenterByOrgNo(orgNo);
    }
    
    /**
     * 根据机构编号获取透析中心
     * @param txOrgNo
     * @return
     */
    @RequestMapping("/selectTxCenterByOrgNo")
    public JacksonDataReturn<TxCenterResultForm> selectTxCenterByOrgNo(String orgNo) {
        return organizationListService.selectTxCenterByOrgNo(orgNo);
    }
    
    /**
     * 获取ParentNo下拉框的选项（包含顶级节点的父节点选项）
     * @param model
     * @param orgNo
     * @return
     */
    @RequestMapping(value = "/getSelectPickerContainsTop")
    public JacksonReturn getSelectPickerContainsTop(ModelMap model, String orgNo) {
        JacksonListReturn<Code> ret = new JacksonListReturn<>();
        List<Code> rlist = new ArrayList<Code>();
        // 获取父节点组织信息
        ListResult<Code> parentOrgList = webCommonDao.selectList("OrganizationListMapper.getParentOrgSelect",orgNo);
        if (!Tools.listisblank(parentOrgList.getResultData())) {
            Code parentOrgCode = parentOrgList.getResultData().get(0);
            // 父节点可能为空 去除为空的Code
            if (parentOrgCode != null) {
                if (!Tools.isblank(parentOrgCode.getValue())) {
                    rlist.add(parentOrgCode);
                }
            }
        }
        // 再将子节点添加进去
        rlist.addAll(commonService.getQcCenterSelectOptions(orgNo));
        ret.getData().addAll(rlist);
        conList = rlist;
        
        return ret;
    }
    
    /**
     * 获取ParentNo下拉框的选项（不包含顶级节点的父节点选项）
     * @param model
     * @param orgNo
     * @return
     */
    @RequestMapping(value = "/getSelectPickerNotContainsTop")
    public JacksonReturn getSelectPickerNotContainsTop(ModelMap model, String orgNo) {
        JacksonListReturn<Code> ret = new JacksonListReturn<>();
        List<Code> rlist = commonService.getQcCenterSelectOptions(orgNo);
        ret.getData().addAll(rlist);
        notconList = rlist;
        
        return ret;
    }
    
    /**
     * 保存质控中心
     * @param qcCenterResultForm
     * @return
     */
    @RequestMapping("/saveQcCenter")
    public JacksonCountReturn saveQcCenter(QcCenterResultForm qcCenterResultForm) {
        return organizationListService.saveQcCenter(qcCenterResultForm);
    }
    
    /**
     * 保存透析中心
     * @param txCenterResultForm
     * @return
     */
    @RequestMapping("/saveTxCenter")
    public JacksonCountReturn saveTxCenter(TxCenterResultForm txCenterResultForm) {
        return organizationListService.saveTxCenter(txCenterResultForm);
    }
    
    /**
     * 删除质控/透析中心
     * @param orgNo
     * @return
     */
    @RequestMapping("/delCenter")
    public JacksonCountReturn delCenter(String orgNo) {
        return organizationListService.delCenter(orgNo);
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
    
}
