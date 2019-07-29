//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.diseasesstatistics.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
public enum DiseasesStatisticsConstants implements RythmPage{
	DISEASESSTATISTICS("views/diseasesstatistics/DiseasesStatistics");
    
    private final String url;

    DiseasesStatisticsConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
