//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.patientsbehindprobability.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
public enum PatientsBehindProbabilityConstants implements RythmPage{
	PATIENTSBEHIND_PROBABILITY("views/patientsbehindprobability/PatientsBehindProbability");
    
    private final String url;

    PatientsBehindProbabilityConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
