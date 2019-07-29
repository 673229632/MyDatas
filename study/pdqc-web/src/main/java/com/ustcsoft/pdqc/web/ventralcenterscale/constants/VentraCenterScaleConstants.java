//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.ventralcenterscale.constants;

import com.ustcsoft.rythm.spring.web.servlet.response.RythmPage;

/**
 * 
 * @author liujian
 */
public enum VentraCenterScaleConstants implements RythmPage {
	
    VENTRACENTER_SCALE("views/ventralcenterscale/VentralCenterScale");
    
    private final String url;

    VentraCenterScaleConstants(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
