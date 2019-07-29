package com.ustcsoft.pdqc.web.common.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.web.common.constants.Constants;
import com.ustcsoft.pdqc.web.common.entity.Code;
import com.ustcsoft.pdqc.web.systemmanagement.form.ZTreeTestProjectForm;

/**
 * 共通方法
 * @author xujie
 *
 */
public interface CommonService extends Constants {
    
    /**
     * 获取组织机构树
     */
    JacksonListReturn<ZTreeTestProjectForm<PdMOrganization>> getOrganizationTree(String orgno);

    /**
     * 获取orgNo子节点的透析中心和质控中心
     */
    List<Code> getOrgSelectOptions(String orgNo);
    
    /**
     * 获取orgNo子节点的透析中心和质控中心(下拉树)
     */
    JacksonReturn getOrgSelectOptionsTree(String orgNo);
    
    /**
     * 获取orgNo子节点的质控中心
     */
    List<Code> getQcCenterSelectOptions(String orgNo);
    
    /**
     * 通过父code从表中获得子列表方法
     * @param parentCode
     * @return
     */
    public List<Code> getOptionsByParentCode(String parentCode);
    
}
