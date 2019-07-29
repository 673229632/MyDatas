
package com.ustcsoft.pdqc.web.patient.form;

import java.util.Date;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * @author lijun 患者查询结果form
 */
public class PatientRstForm extends WebBaseForm {

    /**
     * 
     */
    private static final long serialVersionUID = 680349237477174582L;

    // 医院名称
    private String hospitalName;
    
    // 医院No
    private String hospitalNo;

    private String patientId;

    // 患者姓名
    private String patientName;

    // 身份证编号
    private String cardNo;

    // 首次血液透析日
    private String firstDialsysDate;

    // 肾原发病
    private String primaryDisease;

    // 传染病
    private String infectionDisease;

    // 患者类型
    private String patientType;

    // 患者转归日期
    private Date outComeDate;
    
    // 上报日期
    private Date reportDate;

    private String rowVersion;

    /**
     * @return the hospitalNo
     */
    public String getHospitalNo() {
        return hospitalNo;
    }

    /**
     * @param hospitalNo the hospitalNo to set
     */
    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    /**
     * @return the reportDate
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * @param reportDate the reportDate to set
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * firstDialsysDate的GET方法.
     *
     * @return firstDialsysDate
     */
    public String getFirstDialsysDate() {
        return firstDialsysDate;
    }

    /**
     * firstDialsysDate的SET方法.
     *
     * @param firstDialsysDate firstDialsysDate
     */
    public void setFirstDialsysDate(String firstDialsysDate) {
        this.firstDialsysDate = firstDialsysDate;
    }

    public String getPrimaryDisease() {
        return primaryDisease;
    }

    public void setPrimaryDisease(String primaryDisease) {
        this.primaryDisease = primaryDisease;
    }

    public String getInfectionDisease() {
        return infectionDisease;
    }

    public void setInfectionDisease(String infectionDisease) {
        this.infectionDisease = infectionDisease;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * patientId的GET方法.
     *
     * @return patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * patientId的SET方法.
     *
     * @param patientId patientId
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Date getOutComeDate() {
        return outComeDate;
    }

    public void setOutComeDate(Date outComeDate) {
        this.outComeDate = outComeDate;
    }

    /**
     * rowVersion的GET方法.
     *
     * @return rowVersion
     */
    public String getRowVersion() {
        return rowVersion;
    }

    /**
     * rowVersion的SET方法.
     *
     * @param rowVersion rowVersion
     */
    public void setRowVersion(String rowVersion) {
        this.rowVersion = rowVersion;
    }

}
