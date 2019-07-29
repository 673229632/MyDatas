//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientInfo extends PdDPatientInfoKey implements AutoGenEntity {
    /**
     *  (PD_D_PATIENT_INFO.hp_id)
     */
    private String hpId;

    /**
     *  (PD_D_PATIENT_INFO.name)
     */
    private String name;

    /**
     *  (PD_D_PATIENT_INFO.card_no)
     */
    private String cardNo;

    /**
     *  (PD_D_PATIENT_INFO.pd_no)
     */
    private String pdNo;

    /**
     *  (PD_D_PATIENT_INFO.first_dialsys_date)
     */
    private Date firstDialsysDate;

    /**
     *  (PD_D_PATIENT_INFO.birth_day)
     */
    private Date birthDay;

    /**
     *  (PD_D_PATIENT_INFO.height)
     */
    private String height;

    /**
     *  (PD_D_PATIENT_INFO.phone_no)
     */
    private String phoneNo;

    /**
     *  (PD_D_PATIENT_INFO.address)
     */
    private String address;

    /**
     *  (PD_D_PATIENT_INFO.primary_disease)
     */
    private String primaryDisease;

    /**
     *  (PD_D_PATIENT_INFO.primary_disease_date)
     */
    private Date primaryDiseaseDate;

    /**
     *  (PD_D_PATIENT_INFO.pathologic)
     */
    private String pathologic;

    /**
     *  (PD_D_PATIENT_INFO.allergy)
     */
    private String allergy;

    /**
     *  (PD_D_PATIENT_INFO.infection_diseases)
     */
    private String infectionDiseases;

    /**
     *  (PD_D_PATIENT_INFO.medical_history1)
     */
    private String medicalHistory1;

    /**
     *  (PD_D_PATIENT_INFO.medical_history2)
     */
    private String medicalHistory2;

    /**
     *  (PD_D_PATIENT_INFO.medical_history3)
     */
    private String medicalHistory3;

    /**
     *  (PD_D_PATIENT_INFO.medical_history4)
     */
    private String medicalHistory4;

    /**
     *  (PD_D_PATIENT_INFO.outcome_type)
     */
    private String outcomeType;

    /**
     * 删除标志 (PD_D_PATIENT_INFO.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (PD_D_PATIENT_INFO.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (PD_D_PATIENT_INFO.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (PD_D_PATIENT_INFO.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (PD_D_PATIENT_INFO.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (PD_D_PATIENT_INFO.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (PD_D_PATIENT_INFO.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (PD_D_PATIENT_INFO.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.name)
     *
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.name)
     *
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
        this._selectiveMark.put("name", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.card_no)
     *
     * @return cardNo String
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.card_no)
     *
     * @param cardNo String
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
        this._selectiveMark.put("cardNo", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.pd_no)
     *
     * @return pdNo String
     */
    public String getPdNo() {
        return pdNo;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.pd_no)
     *
     * @param pdNo String
     */
    public void setPdNo(String pdNo) {
        this.pdNo = pdNo;
        this._selectiveMark.put("pdNo", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.first_dialsys_date)
     *
     * @return firstDialsysDate Date
     */
    public Date getFirstDialsysDate() {
        return firstDialsysDate;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.first_dialsys_date)
     *
     * @param firstDialsysDate Date
     */
    public void setFirstDialsysDate(Date firstDialsysDate) {
        this.firstDialsysDate = firstDialsysDate;
        this._selectiveMark.put("firstDialsysDate", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.birth_day)
     *
     * @return birthDay Date
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.birth_day)
     *
     * @param birthDay Date
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
        this._selectiveMark.put("birthDay", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.height)
     *
     * @return height String
     */
    public String getHeight() {
        return height;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.height)
     *
     * @param height String
     */
    public void setHeight(String height) {
        this.height = height;
        this._selectiveMark.put("height", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.phone_no)
     *
     * @return phoneNo String
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.phone_no)
     *
     * @param phoneNo String
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        this._selectiveMark.put("phoneNo", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.address)
     *
     * @return address String
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.address)
     *
     * @param address String
     */
    public void setAddress(String address) {
        this.address = address;
        this._selectiveMark.put("address", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.primary_disease)
     *
     * @return primaryDisease String
     */
    public String getPrimaryDisease() {
        return primaryDisease;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.primary_disease)
     *
     * @param primaryDisease String
     */
    public void setPrimaryDisease(String primaryDisease) {
        this.primaryDisease = primaryDisease;
        this._selectiveMark.put("primaryDisease", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.primary_disease_date)
     *
     * @return primaryDiseaseDate Date
     */
    public Date getPrimaryDiseaseDate() {
        return primaryDiseaseDate;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.primary_disease_date)
     *
     * @param primaryDiseaseDate Date
     */
    public void setPrimaryDiseaseDate(Date primaryDiseaseDate) {
        this.primaryDiseaseDate = primaryDiseaseDate;
        this._selectiveMark.put("primaryDiseaseDate", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.pathologic)
     *
     * @return pathologic String
     */
    public String getPathologic() {
        return pathologic;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.pathologic)
     *
     * @param pathologic String
     */
    public void setPathologic(String pathologic) {
        this.pathologic = pathologic;
        this._selectiveMark.put("pathologic", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.allergy)
     *
     * @return allergy String
     */
    public String getAllergy() {
        return allergy;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.allergy)
     *
     * @param allergy String
     */
    public void setAllergy(String allergy) {
        this.allergy = allergy;
        this._selectiveMark.put("allergy", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.infection_diseases)
     *
     * @return infectionDiseases String
     */
    public String getInfectionDiseases() {
        return infectionDiseases;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.infection_diseases)
     *
     * @param infectionDiseases String
     */
    public void setInfectionDiseases(String infectionDiseases) {
        this.infectionDiseases = infectionDiseases;
        this._selectiveMark.put("infectionDiseases", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.medical_history1)
     *
     * @return medicalHistory1 String
     */
    public String getMedicalHistory1() {
        return medicalHistory1;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.medical_history1)
     *
     * @param medicalHistory1 String
     */
    public void setMedicalHistory1(String medicalHistory1) {
        this.medicalHistory1 = medicalHistory1;
        this._selectiveMark.put("medicalHistory1", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.medical_history2)
     *
     * @return medicalHistory2 String
     */
    public String getMedicalHistory2() {
        return medicalHistory2;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.medical_history2)
     *
     * @param medicalHistory2 String
     */
    public void setMedicalHistory2(String medicalHistory2) {
        this.medicalHistory2 = medicalHistory2;
        this._selectiveMark.put("medicalHistory2", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.medical_history3)
     *
     * @return medicalHistory3 String
     */
    public String getMedicalHistory3() {
        return medicalHistory3;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.medical_history3)
     *
     * @param medicalHistory3 String
     */
    public void setMedicalHistory3(String medicalHistory3) {
        this.medicalHistory3 = medicalHistory3;
        this._selectiveMark.put("medicalHistory3", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.medical_history4)
     *
     * @return medicalHistory4 String
     */
    public String getMedicalHistory4() {
        return medicalHistory4;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.medical_history4)
     *
     * @param medicalHistory4 String
     */
    public void setMedicalHistory4(String medicalHistory4) {
        this.medicalHistory4 = medicalHistory4;
        this._selectiveMark.put("medicalHistory4", true);
    }

    /**
     * 取得： (PD_D_PATIENT_INFO.outcome_type)
     *
     * @return outcomeType String
     */
    public String getOutcomeType() {
        return outcomeType;
    }

    /**
     * 设定： (PD_D_PATIENT_INFO.outcome_type)
     *
     * @param outcomeType String
     */
    public void setOutcomeType(String outcomeType) {
        this.outcomeType = outcomeType;
        this._selectiveMark.put("outcomeType", true);
    }

    /**
     * 取得：删除标志 (PD_D_PATIENT_INFO.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (PD_D_PATIENT_INFO.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (PD_D_PATIENT_INFO.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (PD_D_PATIENT_INFO.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (PD_D_PATIENT_INFO.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (PD_D_PATIENT_INFO.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (PD_D_PATIENT_INFO.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (PD_D_PATIENT_INFO.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (PD_D_PATIENT_INFO.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (PD_D_PATIENT_INFO.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (PD_D_PATIENT_INFO.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (PD_D_PATIENT_INFO.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (PD_D_PATIENT_INFO.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (PD_D_PATIENT_INFO.screen_id)
     *
     * @param screenId String
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
        this._selectiveMark.put("screenId", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}