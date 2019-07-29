package com.ustcsoft.pdqc.web.workstation.form;

import java.math.BigDecimal;
import java.util.List;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class ChartForm extends BaseEntity {
    
    private String name;
    
    private BigDecimal value;
    
    private List<String> nameList;
    
    private List<BigDecimal> valueList;
    
    private List<EChartCodeForm> eChartCodeFormList;

    

    

    /**
     * @return the eChartCodeFormList
     */
    public List<EChartCodeForm> geteChartCodeFormList() {
        return eChartCodeFormList;
    }

    /**
     * @param eChartCodeFormList the eChartCodeFormList to set
     */
    public void seteChartCodeFormList(List<EChartCodeForm> eChartCodeFormList) {
        this.eChartCodeFormList = eChartCodeFormList;
    }

    /**
     * @return the nameList
     */
    public List<String> getNameList() {
        return nameList;
    }

    /**
     * @param nameList the nameList to set
     */
    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
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

    /**
     * @return the valueList
     */
    public List<BigDecimal> getValueList() {
        return valueList;
    }

    /**
     * @param valueList the valueList to set
     */
    public void setValueList(List<BigDecimal> valueList) {
        this.valueList = valueList;
    }

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

    
    
}
