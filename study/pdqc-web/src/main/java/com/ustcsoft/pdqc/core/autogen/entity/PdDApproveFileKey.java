//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdDApproveFileKey extends BaseEntity {
    /**
     * 文件编号 (PD_D_APPROVE_FILE.file_no)
     */
    private String fileNo;

    /**
     * 取得：文件编号 (PD_D_APPROVE_FILE.file_no)
     *
     * @return fileNo String
     */
    public String getFileNo() {
        return fileNo;
    }

    /**
     * 设定：文件编号 (PD_D_APPROVE_FILE.file_no)
     *
     * @param fileNo String
     */
    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }
}