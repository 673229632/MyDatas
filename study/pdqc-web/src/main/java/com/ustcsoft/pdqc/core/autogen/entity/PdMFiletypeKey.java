//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.entity;

public class PdMFiletypeKey extends BaseEntity {
    /**
     * 类型编号 (pd_m_filetype.file_type_no)
     */
    private String fileTypeNo;

    /**
     * 取得：类型编号 (pd_m_filetype.file_type_no)
     *
     * @return fileTypeNo String
     */
    public String getFileTypeNo() {
        return fileTypeNo;
    }

    /**
     * 设定：类型编号 (pd_m_filetype.file_type_no)
     *
     * @param fileTypeNo String
     */
    public void setFileTypeNo(String fileTypeNo) {
        this.fileTypeNo = fileTypeNo;
    }
}