package com.ustcsoft.pdqc.web.systemmanagement.form;

import java.math.BigDecimal;

import com.ustcsoft.pdqc.core.autogen.entity.BaseEntity;

public class TxCenterResultForm extends BaseEntity {

    //透析中心编号
    private String txOrgNo;
    //透析中心名称
    private String pdCenterName;
    //机构类型
    private String txCenterType;
    //上级编号
    private String txParentNo;
    //透析中心负责人
    private String pdCenterManager;
    //透析中心电话
    private String pdCenterTel;
    //透析中心邮编
    private String pcCenterPostcode;
    //透析中心传真
    private String pdCenterFax;
    //透析中心email
    private String pdCenterEmail;
    //透析中心面积
    private String pdCenterArea;
    //调整评分机构
    private String adjustOrg;
    //评分权重
    private BigDecimal scoreWeight;
    //透析中心地址
    private String pdCenterAddress;
    /**
     * @return the txOrgNo
     */
    public String getTxOrgNo() {
        return txOrgNo;
    }
    /**
     * @param txOrgNo the txOrgNo to set
     */
    public void setTxOrgNo(String txOrgNo) {
        this.txOrgNo = txOrgNo;
    }
    /**
     * @return the pdCenterName
     */
    public String getPdCenterName() {
        return pdCenterName;
    }
    /**
     * @param pdCenterName the pdCenterName to set
     */
    public void setPdCenterName(String pdCenterName) {
        this.pdCenterName = pdCenterName;
    }
    /**
     * @return the txCenterType
     */
    public String getTxCenterType() {
        return txCenterType;
    }
    /**
     * @param txCenterType the txCenterType to set
     */
    public void setTxCenterType(String txCenterType) {
        this.txCenterType = txCenterType;
    }
    /**
     * @return the txParentNo
     */
    public String getTxParentNo() {
        return txParentNo;
    }
    /**
     * @param txParentNo the txParentNo to set
     */
    public void setTxParentNo(String txParentNo) {
        this.txParentNo = txParentNo;
    }
    /**
     * @return the pdCenterManager
     */
    public String getPdCenterManager() {
        return pdCenterManager;
    }
    /**
     * @param pdCenterManager the pdCenterManager to set
     */
    public void setPdCenterManager(String pdCenterManager) {
        this.pdCenterManager = pdCenterManager;
    }
    /**
     * @return the pdCenterTel
     */
    public String getPdCenterTel() {
        return pdCenterTel;
    }
    /**
     * @param pdCenterTel the pdCenterTel to set
     */
    public void setPdCenterTel(String pdCenterTel) {
        this.pdCenterTel = pdCenterTel;
    }
    /**
     * @return the pcCenterPostcode
     */
    public String getPcCenterPostcode() {
        return pcCenterPostcode;
    }
    /**
     * @param pcCenterPostcode the pcCenterPostcode to set
     */
    public void setPcCenterPostcode(String pcCenterPostcode) {
        this.pcCenterPostcode = pcCenterPostcode;
    }
    /**
     * @return the pdCenterFax
     */
    public String getPdCenterFax() {
        return pdCenterFax;
    }
    /**
     * @param pdCenterFax the pdCenterFax to set
     */
    public void setPdCenterFax(String pdCenterFax) {
        this.pdCenterFax = pdCenterFax;
    }
    /**
     * @return the pdCenterEmail
     */
    public String getPdCenterEmail() {
        return pdCenterEmail;
    }
    /**
     * @param pdCenterEmail the pdCenterEmail to set
     */
    public void setPdCenterEmail(String pdCenterEmail) {
        this.pdCenterEmail = pdCenterEmail;
    }
    /**
     * @return the pdCenterArea
     */
    public String getPdCenterArea() {
        return pdCenterArea;
    }
    /**
     * @param pdCenterArea the pdCenterArea to set
     */
    public void setPdCenterArea(String pdCenterArea) {
        this.pdCenterArea = pdCenterArea;
    }
    /**
     * @return the adjustOrg
     */
    public String getAdjustOrg() {
        return adjustOrg;
    }
    /**
     * @param adjustOrg the adjustOrg to set
     */
    public void setAdjustOrg(String adjustOrg) {
        this.adjustOrg = adjustOrg;
    }
    
    /**
     * @return the scoreWeight
     */
    public BigDecimal getScoreWeight() {
        return scoreWeight;
    }
    /**
     * @param scoreWeight the scoreWeight to set
     */
    public void setScoreWeight(BigDecimal scoreWeight) {
        this.scoreWeight = scoreWeight;
    }
    /**
     * @return the pdCenterAddress
     */
    public String getPdCenterAddress() {
        return pdCenterAddress;
    }
    /**
     * @param pdCenterAddress the pdCenterAddress to set
     */
    public void setPdCenterAddress(String pdCenterAddress) {
        this.pdCenterAddress = pdCenterAddress;
    }
}
