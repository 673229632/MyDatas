/**
 * 
 */

package com.ustcsoft.pdqc.web.common.entity;

/**
 * @author caowenjun
 *
 */
public class RetMsg {

    // 成功条数
    private int retCode;

    // 返回信息
    private String retMsg;

    /**
     * @return the retCode
     */
    public int getRetCode() {
        return retCode;
    }

    /**
     * @param retCode the retCode to set
     */
    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    /**
     * @return the retMsg
     */
    public String getRetMsg() {
        return retMsg;
    }

    /**
     * @param retMsg the retMsg to set
     */
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

}
