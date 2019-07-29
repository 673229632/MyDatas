//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.dialysismodestatistics.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
public enum DialysisModeStatisticsConstants implements RythmPage{
	
	DIALYSISMODE_STATISTICS("views/dialysismodestatistics/DialysisModeStatistics");

	private final String url;

	DialysisModeStatisticsConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
