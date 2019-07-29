package com.ustcsoft.pdqc.web.scoremanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.scoremanagement.constants.DialysisMechanismConstants;
import com.ustcsoft.pdqc.web.scoremanagement.form.DialysisForm;
import com.ustcsoft.pdqc.web.scoremanagement.form.HistoricalRecords;
import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author zhouqichao
 *
 */

@Controller
@RequestMapping("/dialysisMechanism")
public class DialysisMechanismController extends WebBaseController {

	@RequestMapping(value = "")
    public RythmPage init(ModelMap model) {
        return DialysisMechanismConstants.DIALYSIS_MECHANISM;
    }
	
	
	/**
     * 获取透析机构数据
     * @return
     */
    @RequestMapping(value = "/getDialysisData")
    public JacksonPagginListReturn<DialysisForm> getDialysisData() {
        JacksonPagginListReturn<DialysisForm> result = new JacksonPagginListReturn<DialysisForm>();
        result.setTotalCount(2);
        result.setPageCount(2);
        result.setData(getDialysisListData());
        return result;
    }
    
	/**
     * 跳转透析机构历史记录画面
     * @return
     */
    @RequestMapping(value = "/ScoringDetails")
    public RythmPage ScoringDetails(ModelMap model,String id) {
    	model.addAttribute("diaylsisid", id);
        return DialysisMechanismConstants.HISTORICAL_RECORDS;
    }
    
	/**
     * 获取透析机构历史记录数据
     * @return
     */
    @RequestMapping(value = "/getScoringDetails")
    public JacksonPagginListReturn<HistoricalRecords> getScoringDetails(String diaylsisid) {
    	JacksonPagginListReturn<HistoricalRecords> result = new JacksonPagginListReturn<HistoricalRecords>();
    	List<HistoricalRecords> resultList = getScoringDetailsData();
    	for (int i=0;i<resultList.size();i++) {
			if (!diaylsisid.equals(resultList.get(i).getDiaylsisId())) {
				resultList.remove(resultList.get(i));
				i--;
			}
		}
    	result.setTotalCount(resultList.size());
        result.setPageCount(resultList.size());
    	result.setData(resultList);
    	return result;
    }
    
    private List<DialysisForm> getDialysisListData(){
    	
    	List<DialysisForm> resultList = new ArrayList<DialysisForm>();
    	DialysisForm text1 = new DialysisForm();
    	text1.setId("0001");
    	text1.setHospitalName("武汉市第一医院");
    	text1.setDialysateCenterName("武汉市第一医院");
    	text1.setHaedOfDialysisCenter("熊飞");
    	text1.setCurrentScore("96.56");
    	text1.setReleaseTime("2018-01-07");
        resultList.add(text1);
        
        DialysisForm text2 = new DialysisForm();
        text2.setId("0002");
        text2.setHospitalName("武汉市中心医院后湖院区");
        text2.setDialysateCenterName("武汉市中心医院后湖院区");
        text2.setHaedOfDialysisCenter("陈文莉");
        text2.setCurrentScore("96.55");
        text2.setReleaseTime("2018-01-08");
        resultList.add(text2);
        return resultList;
    }
    
    
    
private List<HistoricalRecords> getScoringDetailsData(){
    	
    	List<HistoricalRecords> resultList = new ArrayList<HistoricalRecords>();
    	HistoricalRecords text1 = new HistoricalRecords();
    	text1.setId("01");
    	text1.setDiaylsisId("0001");
    	text1.setScoreName("2017年9月份评分");
    	text1.setScore("95.59");
        resultList.add(text1);
        HistoricalRecords text2 = new HistoricalRecords();
        text2.setId("02");
        text2.setDiaylsisId("0001");
        text2.setScoreName("2017年10月份评分");
        text2.setScore("96.45");
        resultList.add(text2);
        HistoricalRecords text3 = new HistoricalRecords();
        text3.setId("03");
        text3.setDiaylsisId("0002");
        text3.setScoreName("2017年9月份评分");
        text3.setScore("96.45");
        resultList.add(text3);
        HistoricalRecords text4 = new HistoricalRecords();
        text4.setId("04");
        text4.setDiaylsisId("0002");
        text4.setScoreName("2017年10月份评分");
        text4.setScore("96.32");
        resultList.add(text4);
        HistoricalRecords text5 = new HistoricalRecords();
        text5.setId("05");
        text5.setDiaylsisId("0002");
        text5.setScoreName("2017年11月份评分");
        text5.setScore("95.55");
        resultList.add(text5);
        return resultList;
    }
}
