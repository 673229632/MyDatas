//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.common.constants;

/**
 * 配置文件属性.
 * 
 * @author kxiong
 *
 */
public interface CoreConfigConstants {
    /**
     * 上传文件的位置.
     */
    String CONFIG_FILE_UPLOAD_ROOT = "file.storage.root";
    /**
     * 业务上传文件根目录.
     */
    String CONFIG_BUSINESS_FILES = "business.files";
    /**
     * 透析规律长期
     * */
    public static final String DIALYSIS_LAW_LONG="1";
    /**
     * 透析规律单周
     * */
    public static final String DIALYSIS_LAW_WEEK="0";
    /**
     * 透析规律临时
     * */
    public static final String DIALYSIS_LAW_TEMPORARY="2";
    /**
     * 默认第一周对应的选择值
     * */
    public static final Integer WEEK_FREQUENCY_ONE=0;
    /**
     * 默认第二周对应的选择值
     * */
    public static final Integer WEEK_FREQUENCY_TWO=1;
    /**
     * 默认第三周对应的选择值
     * */
    public static final Integer WEEK_FREQUENCY_THREE=2;
    /**
     * 默认第四周对应的选择值
     * */
    public static final Integer WEEK_FREQUENCY_FOUR=3;
}
