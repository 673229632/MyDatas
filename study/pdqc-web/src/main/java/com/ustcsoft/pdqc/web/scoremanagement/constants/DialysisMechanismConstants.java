package com.ustcsoft.pdqc.web.scoremanagement.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * @author zhouqichao
 */
public enum DialysisMechanismConstants implements RythmPage {
	
	DIALYSIS_MECHANISM("/views/scoremanagement/DialysisMechanism"),
	
	HISTORICAL_RECORDS("/views/scoremanagement/ViewHistoryScore");
	private final String url;
	
	DialysisMechanismConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
