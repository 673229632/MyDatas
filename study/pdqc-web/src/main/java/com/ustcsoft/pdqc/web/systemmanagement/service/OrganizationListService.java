package com.ustcsoft.pdqc.web.systemmanagement.service;

import java.util.List;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.web.systemmanagement.form.QcCenterResultForm;
import com.ustcsoft.pdqc.web.systemmanagement.form.TxCenterResultForm;
import com.ustcsoft.rythmui.widget.bootstrapselect.SelectOptionUnit;

/**
 * 
 * @author xujie
 *
 */

public interface OrganizationListService {

    JacksonDataReturn<QcCenterResultForm> selectQcCenterByOrgNo(String qcOrgNo);
    
    JacksonDataReturn<TxCenterResultForm> selectTxCenterByOrgNo(String txOrgNo);
    
    List<SelectOptionUnit> getSelectPickerContainsTop(String orgNo);
    
    List<SelectOptionUnit> getSelectPickerNotContainsTop(String orgNo);
    
    JacksonCountReturn saveQcCenter(QcCenterResultForm qcCenterResultForm);
    
    JacksonCountReturn saveTxCenter(TxCenterResultForm txCenterResultForm);
    
    JacksonCountReturn delCenter(String orgNo);
    
}
