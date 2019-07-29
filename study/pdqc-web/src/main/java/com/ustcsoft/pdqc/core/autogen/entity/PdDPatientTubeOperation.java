//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PdDPatientTubeOperation extends PdDPatientTubeOperationKey implements AutoGenEntity {
    /**
     *  (pd_d_patient_tube_operation.hp_id)
     */
    private String hpId;

    /**
     *  (pd_d_patient_tube_operation.pt_id)
     */
    private String ptId;

    /**
     *  (pd_d_patient_tube_operation.tdate)
     */
    private Date tdate;

    /**
     *  (pd_d_patient_tube_operation.card_no)
     */
    private String cardNo;

    /**
     *  (pd_d_patient_tube_operation.doctor)
     */
    private String doctor;

    /**
     * 0：置管；1：拔管；2：拔管+重置管；3：再置管 (pd_d_patient_tube_operation.operation_type)
     */
    private String operationType;

    /**
     * 0：手术法；1：腹腔镜；2：穿刺法 (pd_d_patient_tube_operation.operation_way)
     */
    private String operationWay;

    /**
     *  (pd_d_patient_tube_operation.way_choice_reason)
     */
    private String wayChoiceReason;

    /**
     *  (pd_d_patient_tube_operation.type_of_anesthesia)
     */
    private String typeOfAnesthesia;

    /**
     *  (pd_d_patient_tube_operation.dialysis_system)
     */
    private String dialysisSystem;

    /**
     *  (pd_d_patient_tube_operation.initial_dialysis)
     */
    private String initialDialysis;

    /**
     * 删除标志 (pd_d_patient_tube_operation.del_flag)
     */
    private String delFlag;

    /**
     * 登录人 (pd_d_patient_tube_operation.created_by)
     */
    private String createdBy;

    /**
     * 登录时间 (pd_d_patient_tube_operation.date_created)
     */
    private Date dateCreated;

    /**
     * 更新人 (pd_d_patient_tube_operation.modified_by)
     */
    private String modifiedBy;

    /**
     * 更新时间 (pd_d_patient_tube_operation.date_modified)
     */
    private Date dateModified;

    /**
     * 更新回数 (pd_d_patient_tube_operation.row_version)
     */
    private Integer rowVersion;

    /**
     * 画面ID (pd_d_patient_tube_operation.screen_id)
     */
    private String screenId;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得： (pd_d_patient_tube_operation.hp_id)
     *
     * @return hpId String
     */
    public String getHpId() {
        return hpId;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.hp_id)
     *
     * @param hpId String
     */
    public void setHpId(String hpId) {
        this.hpId = hpId;
        this._selectiveMark.put("hpId", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.pt_id)
     *
     * @return ptId String
     */
    public String getPtId() {
        return ptId;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.pt_id)
     *
     * @param ptId String
     */
    public void setPtId(String ptId) {
        this.ptId = ptId;
        this._selectiveMark.put("ptId", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.tdate)
     *
     * @return tdate Date
     */
    public Date getTdate() {
        return tdate;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.tdate)
     *
     * @param tdate Date
     */
    public void setTdate(Date tdate) {
        this.tdate = tdate;
        this._selectiveMark.put("tdate", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.card_no)
     *
     * @return cardNo String
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.card_no)
     *
     * @param cardNo String
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
        this._selectiveMark.put("cardNo", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.doctor)
     *
     * @return doctor String
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.doctor)
     *
     * @param doctor String
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
        this._selectiveMark.put("doctor", true);
    }

    /**
     * 取得：0：置管；1：拔管；2：拔管+重置管；3：再置管 (pd_d_patient_tube_operation.operation_type)
     *
     * @return operationType String
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * 设定：0：置管；1：拔管；2：拔管+重置管；3：再置管 (pd_d_patient_tube_operation.operation_type)
     *
     * @param operationType String
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
        this._selectiveMark.put("operationType", true);
    }

    /**
     * 取得：0：手术法；1：腹腔镜；2：穿刺法 (pd_d_patient_tube_operation.operation_way)
     *
     * @return operationWay String
     */
    public String getOperationWay() {
        return operationWay;
    }

    /**
     * 设定：0：手术法；1：腹腔镜；2：穿刺法 (pd_d_patient_tube_operation.operation_way)
     *
     * @param operationWay String
     */
    public void setOperationWay(String operationWay) {
        this.operationWay = operationWay;
        this._selectiveMark.put("operationWay", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.way_choice_reason)
     *
     * @return wayChoiceReason String
     */
    public String getWayChoiceReason() {
        return wayChoiceReason;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.way_choice_reason)
     *
     * @param wayChoiceReason String
     */
    public void setWayChoiceReason(String wayChoiceReason) {
        this.wayChoiceReason = wayChoiceReason;
        this._selectiveMark.put("wayChoiceReason", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.type_of_anesthesia)
     *
     * @return typeOfAnesthesia String
     */
    public String getTypeOfAnesthesia() {
        return typeOfAnesthesia;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.type_of_anesthesia)
     *
     * @param typeOfAnesthesia String
     */
    public void setTypeOfAnesthesia(String typeOfAnesthesia) {
        this.typeOfAnesthesia = typeOfAnesthesia;
        this._selectiveMark.put("typeOfAnesthesia", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.dialysis_system)
     *
     * @return dialysisSystem String
     */
    public String getDialysisSystem() {
        return dialysisSystem;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.dialysis_system)
     *
     * @param dialysisSystem String
     */
    public void setDialysisSystem(String dialysisSystem) {
        this.dialysisSystem = dialysisSystem;
        this._selectiveMark.put("dialysisSystem", true);
    }

    /**
     * 取得： (pd_d_patient_tube_operation.initial_dialysis)
     *
     * @return initialDialysis String
     */
    public String getInitialDialysis() {
        return initialDialysis;
    }

    /**
     * 设定： (pd_d_patient_tube_operation.initial_dialysis)
     *
     * @param initialDialysis String
     */
    public void setInitialDialysis(String initialDialysis) {
        this.initialDialysis = initialDialysis;
        this._selectiveMark.put("initialDialysis", true);
    }

    /**
     * 取得：删除标志 (pd_d_patient_tube_operation.del_flag)
     *
     * @return delFlag String
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设定：删除标志 (pd_d_patient_tube_operation.del_flag)
     *
     * @param delFlag String
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        this._selectiveMark.put("delFlag", true);
    }

    /**
     * 取得：登录人 (pd_d_patient_tube_operation.created_by)
     *
     * @return createdBy String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设定：登录人 (pd_d_patient_tube_operation.created_by)
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        this._selectiveMark.put("createdBy", true);
    }

    /**
     * 取得：登录时间 (pd_d_patient_tube_operation.date_created)
     *
     * @return dateCreated Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设定：登录时间 (pd_d_patient_tube_operation.date_created)
     *
     * @param dateCreated Date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        this._selectiveMark.put("dateCreated", true);
    }

    /**
     * 取得：更新人 (pd_d_patient_tube_operation.modified_by)
     *
     * @return modifiedBy String
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设定：更新人 (pd_d_patient_tube_operation.modified_by)
     *
     * @param modifiedBy String
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        this._selectiveMark.put("modifiedBy", true);
    }

    /**
     * 取得：更新时间 (pd_d_patient_tube_operation.date_modified)
     *
     * @return dateModified Date
     */
    public Date getDateModified() {
        return dateModified;
    }

    /**
     * 设定：更新时间 (pd_d_patient_tube_operation.date_modified)
     *
     * @param dateModified Date
     */
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
        this._selectiveMark.put("dateModified", true);
    }

    /**
     * 取得：更新回数 (pd_d_patient_tube_operation.row_version)
     *
     * @return rowVersion Integer
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * 设定：更新回数 (pd_d_patient_tube_operation.row_version)
     *
     * @param rowVersion Integer
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
        this._selectiveMark.put("rowVersion", true);
    }

    /**
     * 取得：画面ID (pd_d_patient_tube_operation.screen_id)
     *
     * @return screenId String
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * 设定：画面ID (pd_d_patient_tube_operation.screen_id)
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