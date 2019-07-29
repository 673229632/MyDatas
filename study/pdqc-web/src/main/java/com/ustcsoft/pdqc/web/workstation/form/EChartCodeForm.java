package com.ustcsoft.pdqc.web.workstation.form;

import java.math.BigDecimal;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class EChartCodeForm extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3102546323439393472L;

	private String name;
    
    private BigDecimal value;
    
    private String percentage;
    
    private String orgIndex;
    
    private String standardRate;
    
    private String examinationRate;

    private String pdCenterNo;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getOrgIndex() {
		return orgIndex;
	}

	public void setOrgIndex(String orgIndex) {
		this.orgIndex = orgIndex;
	}

	public String getStandardRate() {
		return standardRate;
	}

	public void setStandardRate(String standardRate) {
		this.standardRate = standardRate;
	}

	public String getExaminationRate() {
		return examinationRate;
	}

	public void setExaminationRate(String examinationRate) {
		this.examinationRate = examinationRate;
	}

	public String getPdCenterNo() {
		return pdCenterNo;
	}

	public void setPdCenterNo(String pdCenterNo) {
		this.pdCenterNo = pdCenterNo;
	}
    
}
