//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.constants;

/**
 * 常量定义接口.
 * 
 * @author kxiong
 *
 */
public interface Constants extends MessageConstants {

    
    // 初始密码(888888).
    String INITPASSWORD = "888888";

    /**
     * 判断是否为编辑或添加(0:添加,1:编辑).
     */
    String EDIT_FLAG_1 = "1";
    /**
     * 透析医嘱(临时)
     * */
    String TEMPORARY_FLAG="20";
    
    /**
     * 透析医嘱(周)
     * */
    String WEEK_FLAG="10";
    /**
     * 下拉树级别是第三级的
     */
    String THIRD_LEVEL = "3";

    /**
     * 下拉树级别是第二级的
     */
    String SECOND_LEVEL = "2";

    /**
     * 下拉树级别是第一级的
     */
    String ONE_LEVEL = "1";
    /**
     * 血透代码
     * */
    String DIALYSIS_HD="HD";

    /**
     * 用于表示预约上机的状态 -取消预约
     */
    String BOOKING_STATUS_THERE = "3";

    /**
     * 用于表示预约上机的状态-已经安排床位
     */
    String BOOKING_STATUS_ONE = "1";

    /**
     * 下拉树的css样式(
     * 】最低级别树)
     */
    String TREE_CSS = "fa fa-file-text-o";

    /**
     * 下拉树的css样式(最高级别)
     */
    String TREE_CSS_01 = "fa fa-university";

    /**
     * 下拉树的css样式(第二级别)
     */
    String TREE_CSS_02 = "fa fa-building-o";

    /**
     * 下拉树的css样式(第三级别)
     */
    String TREE_CSS_03 = "fa fa-newspaper-o";

    /**
     * 下拉树的级别递增数量级
     */
    int TREE_LEVEL = 1;

    /**
     * 下拉树css样式
     */
    String TREE_CSS_LEVEL = "fa fa-folder-open";

    /**
     * 判断是否为编辑或添加(0:添加,1:编辑).
     */
    String EDIT_FLAG_0 = "0";

    /**
     * deleteFlag画面显示(0:启用,1:停用).
     */
    String DELETE_FLAG_1 = "1";

    /**
     * deleteFlag画面显示(0:添加,1:编辑).
     */
    String DELETE_FLAG_0 = "0";
    
    /**
     * deleteFlag画面显示(0:启用,1:停用).
     */
    String FLAG_1 = "1";

    /**
     * deleteFlag画面显示(0:添加,1:编辑).
     */
    String FLAG_0 = "0";

    /**
     * isFollowUp是否固定随访(0:否,1:是).
     */
    String ISFOLLOWUP_1 = "1";

    /**
     * isFollowUp是否固定随访(0:否,1:是).
     */
    String ISFOLLOWUP_0 = "0";
    
    /**
     * 性别男画面显示(0).
     */
    String MALE = "男";

    /**
     * 性别女g画面显示(1).
     */
    String FEMALE = "女";

    /**
     * 空字符串.
     */
    String EMPTY_STRING = "";

    /**
     * 逗号.
     */
    String COMMA = ",";

    /**
     * 检索下拉列值为空时的默认显示.
     */
    String SELECT_EMPTY = "全部";

    /**
     * 血型为空时的显示.
     */
    String BLOOD_EMPTY = "不明";

    /**
     * rh+.
     */
    String RH_0 = "RH+";

    /**
     * rh-.
     */
    String RH_1 = "RH-";

    /**
     * 传染病区分+.
     */
    String INFECTION_FLAG_0 = "+";

    /**
     * 传染病区分-.
     */
    String INFECTION_FLAG_1 = "-";
    
    /**
     * 医嘱类型（临时）.
     */
    String ORDER_TYPE_0 = "0";
    
    /**
     * 医嘱类型（周医嘱）.
     */
    String ORDER_TYPE_1 = "10";
    
    /**
     * 医嘱类型（长期）.
     */
    String ORDER_TYPE_2 = "20";
    /**
     * 主药剂.
     */
    String MAINFLAG_1 = "1";

    /**
     * 辅助药剂.
     */
    String MAINFLAG_0 = "0";
    
    /**
     * type画面显示(0:实验,1:辅助).
     */
    String TYPE_FLAG_1 = "1";

    /**
     * type画面显示(0:实验,1:辅助).
     */
    String TYPE_FLAG_0 = "0";
    
    /**
     * 套餐关联药品
     */
    String RELATION_TYPE_0 = "0";
    
    /**
     * 套餐关联耗材
     */
    String RELATION_TYPE_1 = "1";
    
    /**
     * 套餐关联治疗方法
     */
    String RELATION_TYPE_2 = "2";
    
    /**
     * 药品组合画面显示(0:辅助药剂,1:主药剂).
     */
    String MAIN_FLAG_1 = "1";

    /**
     * 药品组合画面显示(0:辅助药剂,1:主药剂)..
     */
    String MAIN_FLAG_0 = "0";
    /**
     * 检测维护项目定义固定标记(0:可变，1：不可变)
     */
    String MARK_FLAG_0 = "0";
    /**
     * 检测维护项目定义固定标记(0:可变，1：不可变)
     */
    String MARK_FLAG_1 = "1";
    
    /**
     * 检查项目子项目以及关联表定义固定标记(0:可变，1：不可变)
     */
    String IS_LOCK_1 = "1";
    
    /**
     * 检查项目子项目以及关联表定义固定标记(0:可变，1：不可变)
     */
    String IS_LOCK_0 = "0";
    /**
     * 检查腹膜透析方案的默认标记(0:非默认,1:默认)
     */
    String PRCIP_FLAG_0="0";
    
    /**
     * 检查腹膜透析方案的默认标记(0:非默认,1:默认)
     */
    String PRCIP_FLAG_1="1";
    
    /**
     * 方案默认标记(0：非默认；1：默认)
     */
    String IS_DEFAULT_0 = "0";
    
    /**
     * 方案默认标记(0：非默认；1：默认)
     */
    String IS_DEFAULT_1 = "1";

    /**
     * 操作类型(0：未审核；1：审核通过；2：审核未通过)
     */
    String REVIEWTYPE_0 = "0";

    /**
     * 操作类型(0：未审核；1：审核通过；2：审核未通过)
     */
    String REVIEWTYPE_1 = "1";

    /**
     * 操作类型(0：未审核；1：审核通过；2：审核未通过)
     */
    String REVIEWTYPE_2 = "2";

    /**
     * 完成度(100%：有记录；0%：无记录；).
     */
    String COMPLETION_1 = "100%";

    /**
     * 完成度(100%：有记录；0%：无记录；).
     */
    String COMPLETION_0 = "0%";
    

    /**
     * 检查类型code(JC01：实验检查；JC02：辅助检查；).
     */
    String INSPECT_1 = "JC01";

    /**
     * 检查类型code(JC01：实验检查；JC02：辅助检查；).
     */
    String INSPECT_2 = "JC02";
    
    /**
     * 保存成功
     */
    String SAVESUCCESS = "保存成功";
    
    /**
     * 保存失败
     */
    String SAVEFAILED = "保存失败";
    
    /**
     * 删除成功
     */
    String DELETESUCCESS = "删除成功";
    
    /**
     * 删除失败
     */
    String DELETEFAILED = "删除失败";
    
    /**
     * 机构类型（1：质控中心；2透析中心）
     */
    String ORGTYPE_1 = "1";
    
    /**
     * 机构类型（1：质控中心；2透析中心）
     */
    String ORGTYPE_2 = "2";
    
    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师）
     */
    String USERTYPE_0 = "0";
    
    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师）
     */
    String USERTYPE_1 = "1";
    
    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师）
     */
    String USERTYPE_2 = "2";
    
    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师）
     */
    String USERTYPE_3 = "3";
    
    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师）
     */
    String USERTYPE_4 = "4";
    
    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师）
     */
    String USERTYPE_5 = "5";
    
    /**
     * 用户类型（0超级管理员 1质控中心主任 2质控中心科员 3医疗机构管理员 4医疗机构医生 5医疗机构护士 6医疗机构工程师）
     */
    String USERTYPE_6 = "6";
    
    /**
     * 用药处方类型
     */
    String MEDICATION_TYPE = "PDYY";
    

    /**
     * 职员类别（主任）
     */
    String EMP_TYPE_DIRECTOR = "EMP_TYPE_1";
    
    /**
     * 职员类别（专家）
     */
    String EMP_TYPE_EXPERT = "EMP_TYPE_2";
    
    /**
     * 职员类别（普通科员）
     */
    String EMP_TYPE_CLERK = "EMP_TYPE_3";
    
    /**
     * 职员类别（医师）
     */
    String EMP_TYPE_DOCTOR = "EMP_TYPE_4";
    
    /**
     * 职员类别（护士）
     */
    String EMP_TYPE_NURSE = "EMP_TYPE_5";
    
    /**
     * 职员类别（工程师）
     */
    String EMP_TYPE_ENGINEER = "EMP_TYPE_6";
    
    /**
     * 转归类型（在科）
     */
    String OUTCOME_TYPE_IN_SECTION = "PD_OUT_1";
    
    /**
     * 转归类型（退出）
     */
    String OUTCOME_TYPE_QUIT = "PD_OUT_2";
    
    /**
     * 转归类型（死亡）
     */
    String OUTCOME_TYPE_DEAD = "PD_OUT_3";
    
    /**
     * 转归类型（转出）
     */
    String OUTCOME_TYPE_TURN_OUT = "PD_OUT_4";
    
    /**
     * 数据完整性（转归信息）
     */
    String DATA_INTEGRITY_OUTCOME = "SJWZX_1";
    
    /**
     * 数据完整性（置管手术）
     */
    String DATA_INTEGRITY_TUBE = "SJWZX_2";
    
    /**
     * 数据完整性（透析方案）
     */
    String DATA_INTEGRITY_DIALSYS = "SJWZX_3";
    
    /**
     * 数据完整性（用药处方）
     */
    String DATA_INTEGRITY_DRUG = "SJWZX_4";
    
    /**
     * 数据完整性（患者随访）
     */
    String DATA_INTEGRITY_FOLLOWUP = "SJWZX_5";
    
    /**
     * 数据完整性（门诊评估）
     */
    String DATA_INTEGRITY_OUTPATIENT = "SJWZX_6";
    
    /**
     * 数据完整性（腹透充分性）
     */
    String DATA_INTEGRITY_ADEQUACY = "SJWZX_7";
    
    /**
     * 数据完整性（腹膜平衡实验）
     */
    String DATA_INTEGRITY_PET = "SJWZX_8";
    
    /**
     * 数据完整性（合并症）
     */
    String DATA_INTEGRITY_COMPLICATION = "SJWZX_9";

    /**
     * 数据完整性（检验检查）
     */
    String DATA_INTEGRITY_INSPECTION = "SJWZX_10";
}
