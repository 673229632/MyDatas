
package com.ustcsoft.pdqc.web.common.constants;

/***
 * 画面ID
 * 
 * @author caowenjun
 */
public interface DBScreenID {

	// 杨博理
	/**
	 * 实时监控.
	 */
	final String DAIY_MONITOR = "JT-T-020";

	/**
	 * 实时监控检索.
	 */
	final String DAIY_MONITOR_SEARCH = "JT-T-020-L";

	/**
	 * CRRT列表：RT-A-001、RT-A-001-D、RT-A-001-L
	 */
	final String CRRTLIST = "RT-A-001";

	final String CRRTLIST_L = "RT-A-001-L";

	final String CRRTLIST_D = "RT-A-001-D";

	/**
	 * CRRT申请：RT-A-002、RT-A-002-D、RT-A-002-L
	 */
	final String CRRT = "RT-A-002";

	final String CRRT_L = "RT-A-002-L";

	final String CRRT_D = "RT-A-002-D";
	

	/**
	 * CRRT医嘱：RT-A-003、RT-A-003-D、RT-A-003-L
	 */
	final String CRRTDOCTOR = "RT-A-003";

	final String CRRTDOCTOR_L = "RT-A-003-L";

	final String CRRTDOCTOR_D = "RT-A-003-D";

	/**
	 * CRRT记录：RT-A-004、RT-A-004-D、RT-A-004-L
	 */
	final String CRRTNURSE = "RT-A-004";

	final String CRRTNURSE_L = "RT-A-004-L";

	final String CRRTNURSE_D = "RT-A-004-D";

	/**
	 * CRRT处方模板列表：RT-A-005、RT-A-005-D、RT-A-005-L
	 */
	final String CRRTTEMPLATE = "RT-A-005";

	final String CRRTTEMPLATE_L = "RT-A-005-L";

	final String CRRTTEMPLATE_D = "RT-A-005-D";
	
	/**
	 * CRRT汇总列表： RT-A-006、RT-A-006-D、RT-A-006-L
	 */
	final String CRRTSUMMARY = "RT-A-006";
	
	final String CRRTSUMMARY_L = "RT-A-006_L";
	
	final String CRRTSUMMARY_D = "RT-A-006_D";
	/**
	 * 血管通路情况统计.
	 */
	final String STATISTICS_VASCULARACCESS = "JT-SJ-015";

	/**
	 * 血管通路情况统计检索.
	 */
	final String STATISTICS_VASCULARACCESS_SEARCH = "JT-SJ-015-L";

	/**
	 * 传染病情况统计Infectious Diseases.
	 */
	final String STATISTICS_INFECTIOUSDISEASES = "JT-SJ-012";

	/**
	 * 传染病情况统计检索.
	 */
	final String STATISTICS_INFECTIOUSDISEASES_SEARCH = "JT-SJ-012-L";

	/**
	 * 微信知识库管理.
	 */
	final String MANAGE_WEIXINKNOWLEDGE = "JT-S-009";

	/**
	 * 微信知识库管理新增或者修改.
	 */
	final String MANAGE_WEIXINKNOWLEDGE_ADD_OR_UPDATE = "JT-S-009-D";

	/**
	 * 微信知识库管理检索.
	 */
	final String MANAGE_WEIXINKNOWLEDGE_SEARCH = "JT-S-009-L";

	/**
	 * 透析机消毒.
	 */
	final String DAIYMACH_DISINFECTION = "JT-SB-002";

	/**
	 * 透析机消毒新增或者修改.
	 */
	final String DAIYMACH_DISINFECTION_E = "JT-SB-002-E";

	/**
	 * 透析机消毒查看.
	 */
	final String DAIYMACH_DISINFECTION_L = "JT-SB-002-L";

	/**
	 * 透析机消毒删除.
	 */
	final String DAIYMACH_DISINFECTION_D = "JT-SB-002-D";

	/**
	 * 透析机维修.
	 */
	final String DAIYMACH_MAINTENANCE = "JT-SB-003";

	/**
	 * 透析机维修新增或者修改.
	 */
	final String DAIYMACH_MAINTENANCE_E = "JT-SB-003-E";

	/**
	 * 透析机维修查看.
	 */
	final String DAIYMACH_MAINTENANCE_L = "JT-SB-003-L";

	/**
	 * 透析机维修删除.
	 */
	final String DAIYMACH_MAINTENANCE_D = "JT-SB-003-D";

    /**
     * 设备日检维护.
     */
    final String MACHINE_DAILY_INSPECTION = "JT-SB-004";

    /**
     * 设备日检维护.
     */
    final String MACHINE_DAILY_INSPECTION_L = "JT-SB-004-L";

    /**
     * 设备日检维护.
     */
    final String MACHINE_DAILY_INSPECTION_D = "JT-SB-004-D";

	
	
	/**
	 * 患者透析年限存活率.
	 */
	final String STATISTICS_DIALYSISYEARRATE = "JT-SJ-016";

	/**
	 * 腹透患者透析年限存活率.
	 */
	final String STATISTICS_PDDIALYSISYEARRATE = "JT-SJ-057";

	// 杨博理
	// 李军start
	/**
	 * 预检
	 */
	final String PREVIEW = "JT-T-012";

	/**
	 * 预检无权限
	 */
	final String PREVIEW_D = "JT-T-012-D";

	/**
	 * 预检可修改
	 */
	final String PREVIEW_E = "JT-T-012-E";

	/**
	 * 预检查看权限
	 */
	final String PREVIEW_L = "JT-T-012-L";

	// 李军end
	// 操文军
	/**
	 * 日志管理.
	 * 
	 */
	final String LOG_MANAGE = "";

	/**
	 * 基本主数据.
	 */
	final String MASTER_MANAGE = "JT-S-005";

	/**
	 * 基本主数据查看.
	 */
	final String MASTER_MANAGE_L = "JT-S-005-L";

	/**
	 * 基本主数据编辑.
	 */
	final String MASTER_MANAGE_E = "JT-S-005-E";

	/**
	 * 基本主数据删除.
	 */
	final String MASTER_MANAGE_D = "JT-S-005-D";

	/**
	 * 业务主数据.
	 */
	final String MASTER_MANAGE_ADDONE = "JT-S-010";

	/**
	 * 业务主数据查看.
	 */
	final String MASTER_MANAGE_ADDONE_L = "JT-S-010-L";

	/**
	 * 业务主数据编辑.
	 */
	final String MASTER_MANAGE_ADDONE_E = "JT-S-010-E";

	/**
	 * 业务主数据删除.
	 */
	final String MASTER_MANAGE_ADDONE_D = "JT-S-010-D";

	/**
	 * 模板主数据.
	 */
	final String MASTER_MANAGE_ADDTWO = "JT-S-011";

	/**
	 * 模板主数据查看.
	 */
	final String MASTER_MANAGE_ADDTWO_L = "JT-S-011-L";

	/**
	 * 模板主数据编辑.
	 */
	final String MASTER_MANAGE_ADDTWO_E = "JT-S-011-E";

	/**
	 * 模板主数据删除.
	 */
	final String MASTER_MANAGE_ADDTWO_D = "JT-S-011-D";

	/**
	 * 角色管理.
	 */
	final String ROLE_MANAGE = "JT-S-003";

	/**
	 * 角色检索.
	 */
	final String ROLE_MANAGE_SEARCH = "JT-S-003-L";

	/**
	 * 角色新增或者修改.
	 */
	final String ROLE_MANAGE_ADD_OR_UPDATE = "JT-S-003-E";

	/**
	 * 角色删除.
	 */
	final String ROLE_MANAGE_DELETE = "JT-S-003-D";

	/**
	 * 透析记录医生管理.
	 */
	final String DIALYSISRECODDOCTOR = "JT-T-007";

	/**
	 * 透析记录医生检索.
	 */
	final String DIALYSISRECODDOCTOR_L = "JT-T-007-L";

	/**
	 * 透析记录医生新增或者修改.
	 */
	final String DIALYSISRECODDOCTOR_E = "JT-T-007-E";

	/**
	 * 透析记录医生删除.
	 */
	final String DIALYSISRECODDOCTOR_D = "JT-T-007-D";

	/**
	 * 透析记录护士管理.
	 */
	final String DIALYSISRECODNURSE = "JT-T-008";

	/**
	 * 透析记录护士检索.
	 */
	final String DIALYSISRECODNURSE_L = "JT-T-008-L";

	/**
	 * 透析记录护士新增或者修改.
	 */
	final String DIALYSISRECODNURSE_E = "JT-T-008-E";

	/**
	 * 透析记录护士删除.
	 */
	final String DIALYSISRECODNURSE_D = "JT-T-008-D";

	/**
	 * 药品类型一览.
	 */
	final String MEDICINEMANAGER = "JT-KZ-012";

	/**
	 * 药品类型一览检索.
	 */
	final String MEDICINEMANAGER_L = "JT-KZ-012-L";

	/**
	 * 药品类型一览新增或者修改.
	 */
	final String MEDICINEMANAGER_E = "JT-KZ-012-E";

	/**
	 * 药品类型一览删除.
	 */
	final String MEDICINEMANAGER_D = "JT-KZ-012-D";

	/**
	 * 系统知识库管理.
	 */
	final String SYSTEMKNOWLEDGE = "JT-S-006";

	/**
	 * 系统知识库管理检索.
	 */
	final String SYSTEMKNOWLEDGE_L = "JT-S-006-L";

	/**
	 * 系统知识库管理新增或者修改.
	 */
	final String SYSTEMKNOWLEDGE_E = "JT-S-006-E";

	/**
	 * 系统知识库管理删除.
	 */
	final String SYSTEMKNOWLEDGE_D = "JT-S-006-D";

	// 操文军

	// 陈亚东
	/**
	 * 治疗方法一览.
	 */
	final String TREATMENT_METHOD = "JT-T-017";

	/**
	 * 治疗方法一览查看.
	 */
	final String TREATMENT_METHOD_LOOK = "JT-T-017-L";

	/**
	 * 治疗方法一览编辑和新增.
	 */
	final String TREATMENT_METHOD_EDIT = "JT-T-017-E";

	/**
	 * 治疗方法一览删除.
	 */
	final String TREATMENT_METHOD_DELETE = "JT-T-017-D";

	/**
	 * 患者统计性别.
	 */
	final String PATIENTSEX = "JT-SJ-008";

	/**
	 * 患者统计性别查看.
	 */
	final String PATIENTSEX_LOOK = "JT-SJ-008-L";

	/**
	 * 腹透患者性别统计.
	 */
	final String PATIENTPDSEX = "JT-SJ-051";

	/**
	 * 腹透患者性别查看.
	 */
	final String PATIENTPDSEX_LOOK = "JT-SJ-051-L";

	/**
	 * 统计-按职业.
	 */
	final String PATIENTPROFESSION = "JT-SJ-009";

	/**
	 * 统计-按职业权限.
	 */
	final String PATIENTPROFESSION_LOOK = "JT-SJ-009-L";

	/**
	 * 统计-按腹透患者职业.
	 */
	final String PDPATIENTPROFESSION = "JT-SJ-053";

	/**
	 * 统计-按腹透患者职业权限.
	 */
	final String PDPATIENTPROFESSION_LOOK = "JT-SJ-053-L";

	/**
	 * 转归情况统计.
	 */
	final String PATIENTOUTCOME = "JT-SJ-014";

	/**
	 * 转归情况权限.
	 */
	final String PATIENTOUTCOME_LOOK = "JT-SJ-014-L";

	/**
	 * 腹透电话随诊记录.
	 */
	final String PDPHONEFOLLOWUP = "JT-PX-004";

	/**
	 * 腹透电话随诊记录查看权限.
	 */
	final String PDPHONEFOLLOWUP_LOOK = "JT-PX-004-L";

	/**
	 * 腹透电话随诊记录操作权限.
	 */
	final String PDPHONEFOLLOWUP_D = "JT-PX-004-D";

	/**
	 * 腹透规模趋势统计.
	 */
	final String PATIENTOUTCOME_TONG = "JT-SJ-061";

	/**
	 * 腹透规模趋势统计.
	 */
	final String PATIENTOUTCOME_TONG_LOOK = "JT-SJ-061-L";

	/**
	 * 统计-按保险类型.
	 */
	final String PATIENTINSURANCETYPE = "JT-SJ-0010";

	/**
	 * 统计-按保险类型权限.
	 */
	final String PATIENTINSURANCETYPE_LOOK = "JT-SJ-0010-L";

	/**
	 * 统计-腹透患者保险类型.
	 */
	final String PDPATIENTINSURANCETYPE = "JT-SJ-054";

	/**
	 * 统计-腹透患者保险类型统计权限.
	 */
	final String PDPATIENTINSURANCETYPE_LOOK = "JT-SJ-054-L";

	/**
	 * 统计-按分组.
	 */
	final String PATIENTGROUP = "JT-SJ-011";

	/**
	 * 统计-按分组权限.
	 */
	final String PATIENTGROUP_LOOK = "JT-SJ-011-L";

	/**
	 * 统计-按教育程度.
	 */
	final String PATIENTEDUCATIONTYPE = "JT-SJ-0011";

	/**
	 * 统计-按教育程度权限.
	 */
	final String PATIENTEDUCATIONTYPE_LOOK = "JT-SJ-0011-L";

	/**
	 * 统计-按腹透患者教育程度.
	 */
	final String PDPATIENTEDUCATIONTYPE = "JT-SJ-058";

	/**
	 * 统计-按腹透患者教育程度权限.
	 */
	final String PDPATIENTEDUCATIONTYPE_LOOK = "JT-SJ-058-L";

	/**
	 * 统计-按年龄.
	 */
	final String PATIENTAGERANGES = "JT-SJ-010";

	/**
	 * 统计-按年龄权限.
	 */
	final String PATIENTAGERANGES_LOOK = "JT-SJ-010-L";

	/**
	 * 统计-按腹透患者年龄.
	 */
	final String PDPATIENTAGERANGES = "JT-SJ-052";

	/**
	 * 统计-按腹透患者年龄权限.
	 */
	final String PDPATIENTAGERANGES_LOOK = "JT-SJ-052-L";

	/**
	 * 透析液检测结果统计.
	 */
	final String DIALYSISTESTRESULT = "JT-SJ-007";

	/**
	 * 透析液检测结果统计权限.
	 */
	final String DIALYSISTESTRESULT_LOOK = "JT-SJ-007-L";

	// 陈亚东
	// 邓家佳
	/**
	 * 收费项目一览.
	 */
	final String COST_LIST_OF_PROJECT = "JT-FY-002";

	/**
	 * 收费项目一览新增或者修改.
	 */
	final String COST_LIST_OF_PROJECT_ADD_OR_UPDATE = "JT-FY-002-E";

	/**
	 * 收费项目一览删除.
	 */
	final String COST_LIST_OF_PROJECT_DEL = "JT-FY-002-D";

	/**
	 * 收费项目一览查看.
	 */
	final String COST_LIST_OF_PROJECT_LOOK = "JT-FY-002-L";

	/**
	 * 收费项目一览.
	 */
	final String COST_LIST_OF_PROJECT_DIALOG = "JT-FY-002";

	/**
	 * 收费项目一览新增或者修改.
	 */
	final String COST_LIST_OF_PROJECT_DIALOG_ADD_OR_UPDATE = "JT-FY-002-E";

	/**
	 * 收费项目一览删除.
	 */
	final String COST_LIST_OF_PROJECT_DIALOG_DEL = "JT-FY-002-D";

	/**
	 * 收费项目一览查看.
	 */
	final String COST_LIST_OF_PROJECT_DIALOG_LOOK = "JT-FY-002-L";

	/**
	 * 班次设定.
	 */
	final String SCHEDULING_INDEX = "JT-RY-002";

	/**
	 * 医护排班.
	 */
	final String SCHEDULING = "JT-RY-003";

	/**
	 * 医护排班查看权限.
	 */
	final String SCHEDULING_LOOK = "JT-RY-003-L";

	/**
	 * 医护排班编辑权限.
	 */
	final String SCHEDULING_EDIT = "JT-RY-003-D";

	/**
	 * 查看医护排班.
	 */
	final String CHECK_SCHEDULE = "JT-RY-004";

	/**
	 * 查看医护排班查看权限.
	 */
	final String CHECK_SCHEDULE_LOOK = "JT-RY-004-L";

	/**
	 * 查看医护排班编辑权限.
	 */
	final String CHECK_SCHEDULE_EDIT = "JT-RY-004-D";

	/**
	 * 医护分组.
	 */
	final String STAFFGROUP = "JT-RY-005";

	/**
	 * 医护分组查看权限.
	 */
	final String STAFFGROUP_LOOK = "JT-RY-005-L";

	/**
	 * 医护分组编辑权限.
	 */
	final String STAFFGROUP_EDIT = "JT-RY-005-D";

	/**
	 * 患者信息.
	 */
	final String PATIENT_XINXI = "JT-P-002";

	/**
	 * 患者信息删除.
	 */
	final String PATIENT_XINXID = "JT-P-002-D";

	/**
	 * 患者信息修改.
	 */
	final String PATIENT_XINXIE = "JT-P-002-E";

	/**
	 * 患者信息查看.
	 */
	final String PATIENT_XINXIL = "JT-P-002-L";

	/**
	 * 腹透患者信息.
	 */
	final String PDINFOR_XINXI = "JT-PD-002";

	/**
	 * 腹透患者信息删除.
	 */
	final String PDINFOR_XINXID = "JT-PD-002-D";

	/**
	 * 腹透患者信息修改.
	 */
	final String PDINFOR_XINXIE = "JT-PD-002-E";

	/**
	 * 腹透患者信息查看.
	 */
	final String PDINFOR_XINXIL = "JT-PD-002-L";

	/**
	 * 患者分配.
	 */
	final String PDINFOR_ASSI = "JT-PD-004";

	/**
	 * 患者分配删除.
	 */
	final String PDINFOR_ASSID = "JT-PD-004-D";

	/**
	 * 患者分配添加编辑.
	 */
	final String PDINFOR_ASSIE = "JT-PD-004-E";

	/**
	 * 患者分配查询.
	 */
	final String PDINFOR_ASSIL = "JT-PD-004-L";

	// 许杰
	// 江宗岳
	/**
	 * 检查结果.
	 */
	final String CHECK_RESULT = "JT-J-001";

	/**
	 * 检查结果增改.
	 */
	final String CHECK_RESULT_ADD_OR_UPDATE = "JT-J-001-D";

	/**
	 * 检查结果查看.
	 */
	final String CHECK_RESULT_LOOK = "JT-J-001-L";

	/**
	 * 检验检查项目管理.
	 */
	final String CHECK_PROJECT_MANAGEMENT = "JT-J-005";

	/**
	 * 检验检查项目管理编辑.
	 */
	final String CHECK_PROJECT_MANAGEMENT_ADD_OR_UPDATE = "JT-J-005-E";

	/**
	 * 检验检查项目管理查看.
	 */
	final String CHECK_PROJECT_MANAGEMENT_LOOK = "JT-J-005-L";

	/**
	 * 检验检查项目管理删除.
	 */
	final String CHECK_PROJECT_MANAGEMENT_DELETE = "JT-J-005-D";

	/**
	 * 检验检查子项目管理.
	 */
	final String CHECK_CHILD_PROJECT_MANAGEMENT = "JT-J-009";

	/**
	 * 检验检查子项目管理编辑.
	 */
	final String CHECK_CHILD_PROJECT_MANAGEMENT_ADD_OR_UPDATE = "JT-J-009-E";

	/**
	 * 检验检查子项目管理查看.
	 */
	final String CHECK_CHILD_PROJECT_MANAGEMENT_LOOK = "JT-J-009-L";

	/**
	 * 检验检查子项目管理删除.
	 */
	final String CHECK_CHILD_PROJECT_MANAGEMENT_DELETE = "JT-J-009-D";

	/**
	 * 长期医嘱模板.
	 */
	final String CHRONIC_TEMPLATE = "JT-T-002";

	/**
	 * 长期医嘱模板编辑.
	 */
	final String CHRONIC_TEMPLATE_ADD_OR_UPDATE = "JT-T-002-E";

	/**
	 * 长期医嘱模板查看.
	 */
	final String CHRONIC_TEMPLATE_LOOK = "JT-T-002-L";

	/**
	 * 长期医嘱模板删除.
	 */
	final String CHRONIC_TEMPLATE_DELETE = "JT-T-002-D";

	/**
	 * 长期医嘱.
	 */
	final String CHRONIC_AD = "JT-T-004";

	/**
	 * 长期医嘱编辑.
	 */
	final String CHRONIC_AD_ADD_OR_UPDATE = "JT-T-004-E";

	/**
	 * 长期医嘱查看.
	 */
	final String CHRONIC_AD_LOOK = "JT-T-004-L";

	/**
	 * 长期医嘱删除.
	 */
	final String CHRONIC_AD_DELETE = "JT-T-004-D";

	/**
	 * 腹透处方.
	 */
	final String PD_CHRONIC_AD = "JT-Y-006";

	/**
	 * 腹透处方查看.
	 */
	final String PD_CHRONIC_AD_L = "JT-Y-006-L";

	/**
	 * 腹透处方编辑.
	 */
	final String PD_CHRONIC_AD_D = "JT-Y-006-D";

	/**
	 * 长期医嘱.
	 */
	final String DIAS_PREPARE = "JT-T-008";

	/**
	 * 长期医嘱查看.
	 */
	final String DIAS_PREPARE_LOOK = "JT-T-008-L";

	/**
	 * 药品一览.
	 */
	final String MEDICINE_MANAGEMENT = "JT-KZ-014";

	/**
	 * 药品一览编辑.
	 */
	final String MEDICINE_MANAGEMENT_ADD_OR_UPDATE = "JT-KZ-014-E";

	/**
	 * 药品一览查看.
	 */
	final String MEDICINE_MANAGEMENT_LOOK = "JT-KZ-014-L";

	/**
	 * 药品一览删除.
	 */
	final String MEDICINE_MANAGEMENT_DELETE = "JT-KZ-014-D";

	/**
	 * 药品组合.
	 */
	final String MEDICINE_GROUP = "JT-KZ-013";

	/**
	 * 药品组合编辑.
	 */
	final String MEDICINE_GROUP_ADD_OR_UPDATE = "JT-KZ-013-E";

	/**
	 * 药品组合查看.
	 */
	final String MEDICINE_GROUP_LOOK = "JT-KZ-013-L";

	/**
	 * 药品组合删除.
	 */
	final String MEDICINE_GROUP_DELETE = "JT-KZ-013-D";

	/**
	 * 个人信息一览.
	 */
	final String LOGIN_USER_INFO = "JT-S-001";

	/**
	 * 个人信息一览编辑.
	 */
	final String LOGIN_USER_INFO_ADD_OR_UPDATE = "JT-S-001-E";

	/**
	 * 个人信息一览查看.
	 */
	final String LOGIN_USER_INFO_LOOK = "JT-S-001-L";

	/**
	 * 个人信息一览删除.
	 */
	final String LOGIN_USER_INFO_DELETE = "JT-S-001-D";

	/**
	 * 职员信息一览.
	 */
	final String STAFF_INFO = "JT-S-002";

	/**
	 * 职员信息一览编辑.
	 */
	final String STAFF_INFO_ADD_OR_UPDATE = "JT-S-002-E";

	/**
	 * 职员信息一览查看.
	 */
	final String STAFF_INFO_LOOK = "JT-S-002-L";

	/**
	 * 职员信息一览删除.
	 */
	final String STAFF_INFO_DELETE = "JT-S-002-D";
	// 江宗岳

	// 刘群
	/**
	 * 耗材基本信息
	 */
	final String BASICINFOMATION = "JT-KZ-005";

	/**
	 * 耗材基本信息编辑
	 */
	final String BASICINFOMATION_E = "JT-KZ-005-E";

	/**
	 * 耗材基本信息删除
	 */
	final String BASICINFOMATION_D = "JT-KZ-005-D";

	/**
	 * 耗材基本信息检索
	 */
	final String BASICINFOMATION_L = "JT-KZ-005-L";

	/**
	 * 床位安排
	 */
	final String DIALYSISSCHEDULE = "JT-T-011";

	/**
	 * 床位安排可编辑
	 */
	final String DIALYSISSCHEDULE_E = "JT-T-011-E";

	/**
	 * 床位安排可删除
	 */
	final String DIALYSISSCHEDULE_D = "JT-T-011-D";

	/**
	 * 床位安排可查看
	 */
	final String DIALYSISSCHEDULE_L = "JT-T-011-L";

	/**
	 * 透析医嘱历史
	 */
	final String DIALYSISHISTORY = "JT-T-018";

	/**
	 * 透析医嘱用药历史
	 */
	final String DIALYSISMECHISTORY = "JT-T-019";

	/**
	 * 用药历史查询
	 */
	final String PHARMACYHISTORY = "JT-P-008";

	/**
	 * 透析医嘱历史检索
	 */
	final String DIALYSISHISTORY_L = "JT-T-018-L";

	/**
	 * 透析医嘱用药历史检索
	 */
	final String DIALYSISMECHISTORY_L = "JT-T-019-L";

	/**
	 * 透析医嘱模板
	 */
	final String DIALYSISTEMPLATE = "JT-Y-001";

	/**
	 * 透析医嘱模板编辑
	 */
	final String DIALYSISTEMPLATE_E = "JT-Y-001-E";

	/**
	 * 透析医嘱模板删除
	 */
	final String DIALYSISTEMPLATE_D = "JT-Y-001-D";

	/**
	 * 透析医嘱模板检索
	 */
	final String DIALYSISTEMPLATE_L = "JT-Y-001-L";

	/**
	 * 透析医嘱
	 */
	final String DIALYSISORDER = "JT-Y-003";

	/**
	 * 透析医嘱编辑
	 */
	final String DIALYSISORDER_E = "JT-Y-003-E";

	/**
	 * 透析医嘱删除
	 */
	final String DIALYSISORDER_D = "JT-Y-003-D";

	/**
	 * 透析医嘱检索
	 */
	final String DIALYSISORDER_L = "JT-Y-003-L";

	/**
	 * 透析医嘱方案
	 */
	final String DIALYSISORDERPLAN = "JT-Y-004";

	/**
	 * 透析医嘱方案编辑
	 */
	final String DIALYSISORDERPLAN_E = "JT-Y-004-E";

	/**
	 * 透析医嘱方案删除
	 */
	final String DIALYSISORDERPLAN_D = "JT-Y-004-D";

	/**
	 * 透析医嘱方案检索
	 */
	final String DIALYSISORDERPLAN_L = "JT-Y-004-L";

	/**
	 * 透析医嘱方案
	 */
	final String DIALYSISORDERMEC = "JT-Y-005";

	/**
	 * 透析医嘱方案编辑
	 */
	final String DIALYSISORDERMEC_E = "JT-Y-005-E";

	/**
	 * 透析医嘱方案删除
	 */
	final String DIALYSISORDERMEC_D = "JT-Y-005-D";

	/**
	 * 透析医嘱方案检索
	 */
	final String DIALYSISORDERMEC_L = "JT-Y-005-L";

	// 刘群
	// 侯帅涛
	/**
	 * 用户工作站.
	 */
	final String USER_WORKSTATION = "JT-S-008";

	/**
	 * 用户工作站设置.
	 */
	final String USER_WORKSTATION_ADD_OR_UPDATE = "JT-S-008-D";

	/**
	 * 库存管理.
	 */
	final String STOCK_INDEX = "JT-KZ-000";

	/**
	 * 腹透患者库管理.
	 */
	final String PDPATIENT_STOCK_INDEX = "JT-KZ-032";

	/**
	 * 腹透患者库管理查看.
	 */
	final String PDPATIENT_STOCK_INDEX_L = "JT-KZ-032-L";

	/**
	 * 腹透患者库管理删除.
	 */
	final String PDPATIENT_STOCK_INDEX_D = "JT-KZ-032-D";

	/**
	 * 腹透领用查询.
	 */
	final String PD_DIALYSATE_RECEIVE_QUERY = "JT-KZ-037";

	/**
	 * 腹透领用查看.
	 */
	final String PD_DIALYSATE_RECEIVE_QUERY_L = "JT-KZ-037-L";

	/**
	 * 腹透归还查询.
	 */
	final String PD_STOCK_INFO = "JT-KZ-033";

	/**
	 * 腹透归还查看.
	 */
	final String PD_STOCK_INFO_D = "JT-KZ-033-D";

	/**
	 * 腹透归还查询.
	 */
	final String PD_STOCK_INFO_L = "JT-KZ-033-L";

	/**
	 * 出入库管理.
	 */
	final String STOCK_INOUT = "JT-KZ-002";

	/**
	 * 出入库管理删除.
	 */
	final String STOCK_INOUT_DELETE = "JT-KZ-002-D";

	/**
	 * 出入库管理增加或修改.
	 */
	final String STOCK_INOUT_ADD_OR_UPDATE = "JT-KZ-002-E";

	/**
	 * 出入库管理查看.
	 */
	final String STOCK_INOUT_LOOK = "JT-KZ-002-L";

	/**
	 * 库存一览.
	 */
	final String STOCK_AMOUNT = "JT-KZ-015";

	/**
	 * 库存一览新增或编辑.
	 */
	final String STOCK_AMOUNT_ADD_OR_UPDATE = "JT-KZ-015-E";

	/**
	 * 库存一览删除.
	 */
	final String STOCK_AMOUNT_DELETE = "JT-KZ-015-D";

	/**
	 * 库存一览查看.
	 */
	final String STOCK_AMOUNT_LOOK = "JT-KZ-015-L";

	/**
	 * 患者当前剩余药品.
	 */
	final String PATIENT_REMAINDER_MEDICINE = "JT-KZ-017";

	/**
	 * 患者当前剩余药品查看.
	 */
	final String PATIENT_REMAINDER_MEDICINE_LOOK = "JT-KZ-017-L";

	/**
	 * 盘库审核.
	 */
	final String STOCK_REVIEW = "JT-KZ-004";

	/**
	 * 盘库审核编辑或新增.
	 */
	final String STOCK_REVIEW_ADD_OR_UPDATE = "JT-KZ-004-D";

	/**
	 * 出入库查询.
	 */
	final String STOCK_SEARCH = "JT-KZ-006";

	/**
	 * 出入库查询新增或编辑.
	 */
	final String STOCK_SEARCH_ADD_OR_UPDATE = "JT-KZ-006-E";

	/**
	 * 出入库查询删除.
	 */
	final String STOCK_SEARCH_DELETE = "JT-KZ-006-D";

	/**
	 * 出入库查询查看.
	 */
	final String STOCK_SEARCH_LOOK = "JT-KZ-006-L";

	/**
	 * 仓库管理.
	 */
	final String WAREHOUSE_INFO = "JT-KZ-016";

	/**
	 * 腹透仓库管理.
	 */
	final String PDWAREHOUSE_INFO = "JT-KZ-030";

	/**
	 * 腹透仓库管理.
	 */
	final String PDWAREHOUSE_INFO_L = "JT-KZ-030-L";

	/**
	 * 腹透仓库管理.
	 */
	final String PDWAREHOUSE_INFO_D = "JT-KZ-030-D";

	/**
	 * 仓库管理删除.
	 */
	final String WAREHOUSE_DELETE = "JT-KZ-016-D";

	/**
	 * 仓库管理查看.
	 */
	final String WAREHOUSE_LOOK = "JT-KZ-016-L";

	/**
	 * 仓库管理新增或编辑.
	 */
	final String WAREHOUSE_ADD_OR_UPDATE = "JT-KZ-016-E";

	/**
	 * 患者列表.
	 */
	final String PATIENT_LIST = "JT-P-001";

	/**
	 * 患者列表删除.
	 */
	final String PATIENT_LIST_DELETE = "JT-P-001-D";

	/**
	 * 患者列表新增或编辑.
	 */
	final String PATIENT_LIST_ADD_OR_UPDATE = "JT-P-001-E";

	/**
	 * 患者列表查看.
	 */
	final String PATIENT_LIST_LOOK = "JT-P-001-L";

	/**
	 * 腹透患者列表.
	 */
	final String PATIENT_LIST_PD = "JT-PD-001";

	/**
	 * 腹透患者列表删除.
	 */
	final String PATIENT_LIST_PD_DELETE = "JT-PD-001-D";

	/**
	 * 腹透患者列表新增或编辑.
	 */
	final String PATIENT_LIST_PD_ADD_OR_UPDATE = "JT-PD-001-E";

	/**
	 * 腹透患者列表查看.
	 */
	final String PATIENT_LIST_PD_LOOK = "JT-PD-001-L";

	/**
	 * 时间例次统计.
	 */
	final String TIMECASE_STATISTICS = "JT-SJ-013";

	/**
	 * 时间例次统计.
	 */
	final String STATISTICS_TIMECASE = "JT-SJ-017";

	/**
	 * 时间例次统计新增或编辑.
	 */
	final String TIMECASE_STATISTICS_ADD_OR_UPDATE = "JT-SJ-013-E";

	/**
	 * 时间例次统计删除.
	 */
	final String TIMECASE_STATISTICS_DELETE = "JT-SJ-013-D";

	/**
	 * 时间例次统计查看.
	 */
	final String TIMECASE_STATISTICS_LOOK = "JT-SJ-013-L";

	/**
	 * 转归情况统计.
	 */
	final String PATIENT_OUTCOME_STATISTICS = "JT-SJ-014";

	/**
	 * 转归情况统计查看.
	 */
	final String PATIENT_OUTCOME_STATISTICS_LOOK = "JT-SJ-014-L";

	/**
	 * 套餐一览.
	 */
	final String COST_GROUP = "JT-FY-005";

	/**
	 * 套餐一览删除.
	 */
	final String COST_GROUP_DELETE = "JT-FY-005-D";

	/**
	 * 套餐一览编辑.
	 */
	final String COST_GROUP_ADD_OR_EDIT = "JT-FY-005-E";

	/**
	 * 套餐一览查看.
	 */
	final String COST_GROUP_LOOK = "JT-FY-005-L";

	/**
	 * 按次数收费.
	 */
	final String TIME_EXPENSE = "JT-FY-006";

	/**
	 * 按次数收费删除.
	 */
	final String TIME_EXPENSE_DELETE = "JT-FY-006-D";

	/**
	 * 按次数收费编辑.
	 */
	final String TIME_EXPENSE_ADD_OR_EDIT = "JT-FY-006-E";

	/**
	 * 按次数收费查看.
	 */
	final String TIME_EXPENSE_LOOK = "JT-FY-006-L";

	/**
	 * 按费用收费.
	 */
	final String MONEY_EXPENSE = "JT-FY-007";

	/**
	 * 按费用收费删除.
	 */
	final String MONEY_EXPENSE_DELETE = "JT-FY-007-D";

	/**
	 * 按费用收费新增或编辑.
	 */
	final String MONEY_EXPENSE_ADD_OR_EDIT = "JT-FY-007-E";

	/**
	 * 按费用收费查看.
	 */
	final String MONEY_EXPENSE_LOOK = "JT-FY-007-L";
	
	/**
	 * 单日透析费用
	 */
	final String SINGLE_COST = "JT-FY-009-L";

	/**
	 * 床位图.
	 */
	final String BED_PICTURE = "JT-T-015";
	
	/**
     * 床位图-分组.
     */
    final String BED_PICTURE_GROUP = "JT-T-015-1";

	// 侯帅涛

	// 李鹏程
	/**
	 * 检查计划模板
	 */
	final String CHECK_TEMPLATE = "JT-J-004";

	/**
	 * 检查计划模板新增或修改
	 */
	final String CHECK_TEMPLATE_ADDORUPDATE = "JT-J-004-E";

	/**
	 * 检查计划模板删除
	 */
	final String CHECK_TEMPLATE_DELETE = "JT-J-004-D";

	/**
	 * 检查计划模板检索
	 */
	final String CHECK_TEMPLATE_SEARCH = "JT-J-004-L";

	/**
	 * 检查医嘱
	 */
	final String CHECK_ORDER = "JT-J-003";

	/**
	 * 检查医嘱检索
	 */
	final String CHECK_ORDER_SEARCH = "JT-J-003-L";

	/**
	 * 检查医嘱开具检查单
	 */
	final String CHECK_ORDER_ADD = "JT-J-003-D";

	/**
	 * 制定检查计划
	 */
	final String MAKE_CHECK_PLAN = "JT-J-002";

	/**
	 * 制定检查计划新增
	 */
	final String MAKE_CHECK_PLAN_ADD = "JT-J-002-D";

	/**
	 * 制定检查计划检索
	 */
	final String MAKE_CHECK_PLAN_SEARCH = "JT-J-002-L";

	/**
	 * 随访选择项目模板
	 */
	final String FOLLOWUP_MODEL = "JT-SF-003";

	/**
	 * 随访选择项目模板新增或修改
	 */
	final String FOLLOWUP_MODEL_ADDORUPDATE = "JT-SF-003-E";

	/**
	 * 随访选择项目模板检索
	 */
	final String FOLLOWUP_MODEL_SEARCH = "JT-SF-003-L";

	/**
	 * 随访选择项目模板删除
	 */
	final String FOLLOWUP_MODEL_DELETE = "JT-SF-003-D";

	/**
	 * 制定随访计划
	 */
	final String MAKE_FOLLOW_PLAN = "JT-SF-001";

	/**
	 * 制定随访计划新增或修改
	 */
	final String MAKE_FOLLOW_PLAN_ADDORUPDATE = "JT-SF-001-E";

	/**
	 * 制定随访计划查找
	 */
	final String MAKE_FOLLOW_PLAN_SEARCH = "JT-SF-001-L";

	/**
	 * 制定随访计划删除
	 */
	final String MAKE_FOLLOW_PLAN_DELETE = "JT-SF-001-D";

	/**
	 * 患者随访
	 */
	final String PATIENT_FOLLOW_UP = "JT-SF-002";
	/**
     * 患者随访
     */
    final String PATIENT_FOLLOW_UP_L = "JT-SF-002-L";
    /**
     * 患者随访
     */
    final String PATIENT_FOLLOW_UP_D = "JT-SF-002-D";

	/**
	 * 检测维护项目定义
	 */
	final String TEST_PROJECT_DEFINE = "JT-J-006";

	/**
	 * 检测维护项目定义新增或修改
	 */
	final String TEST_PROJECT_DEFINE_ADDORUPDATE = "JT-J-006-E";

	/**
	 * 检测维护项目定义删除
	 */
	final String TEST_PROJECT_DEFINE_DELETE = "JT-J-006-D";

	/**
	 * 检测维护项目定义检索
	 */
	final String TEST_PROJECT_DEFINE_SEARCH = "JT-J-006-L";

	/**
	 * 检测维护项目计划制定
	 */
	final String MAKE_TEST_PROJECT_PLAN = "JT-J-007";

	/**
	 * 检测维护项目计划制定新增或修改
	 */
	final String MAKE_TEST_PROJECT_PLAN_ADDORUPDATE = "JT-J-007-E";

	/**
	 * 检测维护项目计划制定删除
	 */
	final String MAKE_TEST_PROJECT_PLAN_DELETE = "JT-J-007-D";

	/**
	 * 检测维护项目计划制定检索
	 */
	final String MAKE_TEST_PROJECT_PLAN_SEARCH = "JT-J-007-L";

	/**
	 * 检测维护项目计划执行
	 */
	final String TEST_PROJECT_PLAN_EXECUTE = "JT-J-008";

	/**
	 * 检测维护项目计划执行新增或修改
	 */
	final String TEST_PROJECT_PLAN_EXECUTE_ADDORUPDATE = "JT-J-008-D";

	/**
	 * 检测维护项目计划执行检索
	 */
	final String TEST_PROJECT_PLAN_EXECUTE_SEARCH = "JT-J-008-L";
	// 李鹏程

	/**
	 * 透析指示变更记录查询.
	 */
	final String DIRECTIONCHANGE = "JT-T-001";

	/**
	 * 透析指示变更记录查询.
	 */
	final String DIRECTIONCHANGE_D = "JT-T-001-D";

	/**
	 * 透析指示变更记录查询.
	 */
	final String DIRECTIONCHANGE_L = "JT-T-001-L";

	/**
	 * 饮食历史查询.
	 */
	final String DIETHISTORY_D = "JT-P-004-D";

	/**
	 * 饮食历史查询.
	 */
	final String DIETHISTORY_L = "JT-P-004-L";

	/**
	 * 饮食历史查询.
	 */
	final String DIETHISTORY = "JT-P-004";

	/**
	 * 医护分配查询.
	 */
	final String MEDALLOCATION = "JT-PD-005";

	/**
	 * 医护分配查询.
	 */
	final String MEDALLOCATION_D = "JT-PD-005-D";

	/**
	 * 医护分配查询.
	 */
	final String MEDALLOCATION_L = "JT-PD-005-L";

	/**
	 * 透析准备查询.
	 */
	final String DIALYSISPREPARE = "JT-T-009";

	/**
	 * 透析准备查询.
	 */
	final String DIALYSISPREPARE_L = "JT-T-009-L";

	/**
	 * 透析准备查询.
	 */
	final String DIALYSISPREPARE_D = "JT-T-009-D";

	/**
	 * 质控KPI指标设定
	 */
	final String KPIQUOTA = "JT-SJ-001";

	/**
	 * 质控KPI指标设定查询
	 */
	final String KPIQUOTA_SEARCH = "JT-SJ-001-L";

	/**
	 * 质控KPI指标设定编辑
	 */
	final String KPIQUOTA_EDIT = "JT-SJ-001-D";

	/**
	 * karnofsky活动指数.
	 */
	final String FTACTIVITY_INDEX = "PD-FT-017";

	/**
	 * karnofsky活动指数查询.
	 */
	final String FTACTIVITY_INDEX_SEARCH = "PD-FT-017-L";

	/**
	 * karnofsky活动指数删除.
	 */
	final String FTACTIVITY_INDEX_SAVEORDELETE = "PD-FT-017-D";

	/**
	 * 腹透随访记录.
	 */
	final String FTFLUPRECORD = "PD-FT-011";

	/**
	 * 腹透随访记录查看.
	 */
	final String FTFLUPRECORD_SEARCH = "PD-FT-011-L";

	/**
	 * 腹透随访记录保存.
	 */
	final String FTFLUPRECORD_SAVE = "PD-FT-011-D";

	/**
	 * 腹透患者运动方案查看权限.
	 */
	final String FTMOTION_SCHEME_SEARCH = "PD-FT-018-L";

	/**
	 * 腹透患者运动方案编辑权限.
	 */
	final String FTMOTION_SCHEME_EDIT = "PD-FT-018-D";

	/**
	 * 腹膜透析充分性
	 */
	final String FTDIALYSISADEQUACY = "PD-FT-005";

	/**
	 * 腹膜透析充分性查看
	 */
	final String FTDIALYSISADEQUACY_L = "PD-FT-005-L";

	/**
	 * 腹膜透析充分性编辑
	 */
	final String FTDIALYSISADEQUACY_D = "PD-FT-005-D";

	/**
	 * 腹膜透析充分性
	 */
	final String FTSUFFICIENCY = "PD-FT-019";

	/**
	 * 腹膜透析充分性查看
	 */
	final String FTSUFFICIENCY_L = "PD-FT-019-L";

	/**
	 * 腹膜透析充分性编辑
	 */
	final String FTSUFFICIENCY_D = "PD-FT-019-D";

	/**
	 * 腹透充分性设置.
	 */
	final String FTSUFFICIENCYSETTIMG = "PD-FT-021";

	/**
	 * 腹透充分性设置查看.
	 */
	final String FTSUFFICIENCYSETTIMG_L = "PD-FT-021-L";

	/**
	 * 腹透充分性设置编辑.
	 */
	final String FTSUFFICIENCYSETTIMG_D = "PD-FT-021-D";

	/**
	 * 腹膜平衡实验
	 */
	final String FT_BALANCETEST = "PD-FT-020";

	/**
	 * 腹膜平衡实验查看
	 */
	final String FT_BALANCETEST_L = "PD-FT-020-L";

	/**
	 * 腹膜平衡实验编辑
	 */
	final String FT_BALANCETEST_D = "PD-FT-020-D";

	/**
	 * 腹膜平衡试验设置页面.
	 */
	final String FT_BALANCETESTSETTING = "PD-FT-022";

	/**
	 * 腹膜平衡试验设置页面查看.
	 */
	final String FT_BALANCETESTSETTING_L = "PD-FT-022-L";

	/**
	 * 腹膜平衡试验设置页面编辑.
	 */
	final String FT_BALANCETESTSETTING_D = "PD-FT-022-D";

	/**
	 * 腹透充分性执行纪录.
	 */
	final String FT_SUFFICIENCY_RECORD_SETTIMG = "PD-FT-023";

	/**
	 * 腹透充分性执行纪录查看.
	 */
	final String FT_SUFFICIENCY_RECORD_SETTIMG_D = "PD-FT-023-L";

	/**
	 * 腹透充分性执行纪录编辑.
	 */
	final String FT_SUFFICIENCY_RECORD_SETTIMG_L = "PD-FT-023-D";

	/**
	 * 腹膜平衡实验执行纪录
	 */
	final String FT_BALANCETEST_RECORD = "PD-FT-024";

	/**
	 * 腹膜平衡实验执行纪录查看
	 */
	final String FT_BALANCETEST_RECORD_L = "PD-FT-024-L";

	/**
	 * 腹膜平衡实验执行纪录编辑
	 */
	final String FT_BALANCETEST_RECORD_D = "PD-FT-024-D";

	/**
	 * 腹膜透析病人培训
	 */
	final String FTDIALYSISTRAIN = "PD-FT-006";

	/**
	 * 腹膜透析病人培训查看
	 */
	final String FTDIALYSISTRAIN_L = "PD-FT-006-L";

	/**
	 * 腹膜透析病人培训编辑
	 */
	final String FTDIALYSISTRAIN_D = "PD-FT-006-D";

	/**
	 * 透前、检查项目设置
	 */
	final String FT_DIALYSIS_INSPECT_SET = "PD-FT-002";

	/**
	 * 透前、检查项目设置 编辑
	 */
	final String FT_DIALYSIS_INSPECT_SET_D = "PD-FT-002-D";

	/**
	 * 透前、检查项目设置 查看
	 */
	final String FT_DIALYSIS_INSPECT_SET_L = "PD-FT-002-L";

	/**
	 * 透前结果及用药
	 */
	final String FT_DIALYSIS_RESULT_MEDIC = "PD-FT-003";

	/**
	 * 透前结果及用药 编辑
	 */
	final String FT_DIALYSIS_RESULT_MEDIC_D = "PD-FT-003-D";

	/**
	 * 透前结果及用药 查看
	 */
	final String FT_DIALYSIS_RESULT_MEDIC_L = "PD-FT-003-L";

	/**
	 * 检查结果追踪
	 */
	final String FT_DIALYSIS_INSPECT_HIS = "PD-FT-004";

	/**
	 * 检查结果追踪
	 */
	final String FT_DIALYSIS_INSPECT_HIS_D = "PD-FT-004-D";

	/**
	 * 检查结果追踪
	 */
	final String FT_DIALYSIS_INSPECT_HIS_L = "PD-FT-004-L";

	/**
	 * 外出口评估
	 */
	final String FT_OUTLET_ASSESS = "PD-FT-008";

	/**
	 * 外出口评估
	 */
	final String FT_OUTLET_ASSESS_D = "PD-FT-008-D";

	/**
	 * 外出口评估
	 */
	final String FT_OUTLET_ASSESS_L = "PD-FT-008-L";

	/**
	 * 手术登记问卷
	 */
	final String FT_OPERA_REGIST_QUES = "PD-FT-013";

	/**
	 * 手术登记问卷
	 */
	final String FT_OPERA_REGIST_QUES_D = "PD-FT-013-D";

	/**
	 * 手术登记问卷
	 */
	final String FT_OPERA_REGIST_QUES_L = "PD-FT-013-L";

	/**
	 * 腹透合并症登记页面.
	 */
	final String PD_COMPLICATION_REGISTER = "PD-FT-031";

	/**
	 * 腹透合并症登记页面.
	 */
	final String PD_COMPLICATION_REGISTER_D = "PD-FT-031-D";

	/**
	 * 腹透合并症登记页面.
	 */
	final String PD_COMPLICATION_REGISTER_L = "PD-FT-031-L";

	/**
	 * 频度评估设置.
	 */
	final String FT_ASSESS_FREQUENCY = "PD-FT-007";

	/**
	 * 腹膜透析方案.
	 */
	final String FT_PERIT_DIALYSIS = "PD-FT-001";

	/**
	 * 腹膜透析方案 检索.
	 */
	final String FT_PERIT_DIALYSIS_L = "PD-FT-001-L";

	/**
	 * 腹膜透析方案 删除.
	 */
	final String FT_PERIT_DIALYSIS_D = "PD-FT-001-D";

	/**
	 * 每月门诊问卷评估.
	 */
	final String FT_CompreEval_By_Month = "PD-FT-010";

	/**
	 * 每月门诊问卷评估 编辑
	 */
	final String FT_CompreEval_By_Month_D = "PD-FT-010-D";

	/**
	 * 每月门诊问卷评估 查看
	 */
	final String FT_CompreEval_By_Month_L = "PD-FT-010-L";

	/**
	 * 每月门诊问卷.PD-FT-029
	 */
	final String FTOUTPATIENTQUESBYMONTH = "PD-FT-012";

	/**
	 * 每月门诊问卷查看权限.
	 */
	final String FTOUTPATIENTQUESBYMONTH_L = "PD-FT-012-L";

	/**
	 * 每月门诊问卷编辑权限.
	 */
	final String FTOUTPATIENTQUESBYMONTH_D = "PD-FT-012-D";

	/**
	 * 腹膜透析过程问卷.
	 */
	final String FTPROCESSQUES = "PD-FT-029";

	/**
	 * 腹膜透析过程问卷查看权限.
	 */
	final String FTPROCESSQUES_L = "PD-FT-029-L";

	/**
	 * 腹膜透析过程问卷编辑权限.
	 */
	final String FTPROCESSQUES_D = "PD-FT-029-D";

	/**
	 * 透析护理评估措施
	 */
	final String DIALYSISCAREASSESSSTEP = "JT-PG-001";

	/**
	 * 透析护理评估措施 查看
	 */
	final String DIALYSISCAREASSESSSTEP_D = "JT-PG-001-L";

	/**
	 * 透析护理评估措施 编辑
	 */
	final String DIALYSISCAREASSESSSTEP_L = "JT-PG-001-D";
	
    /**
     * 上机评估.
     */
    final String COMPUTEREVALUATION = "JT-PG-003";
    
    /**
     * 上机评估.
     */
    final String COMPUTEREVALUATION_D = "JT-PG-003-D";
    
    /**
     * 上机评估.
     */
    final String COMPUTEREVALUATION_L = "JT-PG-003-L";


	/**
	 * 用药统计
	 */
	final String MEDICALSTATISTICS = "JT-SJ-019";

	final String MEDICALSTATISTICS_L = "JT-SJ-019-L";

	/**
	 * 护士反馈情况统计
	 */
	final String TREATCONTANT = "JT-SJ-018";

	final String TREATCONTANT_L = "JT-SJ-018-L";

	/**
	 * 患者透析统计
	 */
	final String DIALYSTATISTICS = "JT-SJ-020";

	/**
	 * 患者透析统计删除
	 */
	final String DIALYSTATISTICSDELETE = "JT-SJ-020-D";

	/**
	 * 患者透析统计查看
	 */
	final String DIALYSTATISTICS_L = "JT-SJ-020-L";

	/**
	 * 耗材使用统计
	 */
	final String SUPPLIESSTATISTICS = "JT-SJ-021";

	/**
	 * 耗材使用统计删除
	 */
	final String SUPPLIESSTATISTICSDELETE = "JT-SJ-021-D";

	/**
	 * 耗材使用统计查看
	 */
	final String SUPPLIESSTATISTICS_L = "JT-SJ-021-L";

	/**
	 * 首次透析护理评估
	 */
	final String NURSING_QUALITY_EVALUATION = "JT-PG-002";

	final String NURSING_QUALITY_EVALUATION_L = "JT-PG-002-L";

	final String NURSING_QUALITY_EVALUATION_D = "JT-PG-002-D";

	/**
	 * 患者透析评估
	 */
	final String PATIENT_DIALYSIS_EVALUATION = "JT-PG-009";

	final String PATIENT_DIALYSIS_EVALUATION_L = "JT-PG-009-L";

	final String PATIENT_DIALYSIS_EVALUATION_D = "JT-PG-009-D";

	/**
	 * 穿刺统计
	 */
	final String PUNCTURE_STATISTICS = "JT-SJ-022";

	/**
	 * 穿刺统计查看
	 */
	final String PUNCTURE_STATISTICS_L = "JT-SJ-022-L";

	/**
	 * 透析记录检查配置
	 *
	 */
	final String DIALYSIS_RECORD_CHECK_CONFIG = "JT-S-012";

	/**
	 * 透析记录检查配置查看
	 *
	 */
	final String DIALYSIS_RECORD_CHECK_CONFIG_L = "JT-S-012-L";

	/**
	 * 透析记录检查配置编辑
	 *
	 */
	final String DIALYSIS_RECORD_CHECK_CONFIG_D = "JT-S-012-D";

	/**
	 * 腹透患者参与血透人数统计.
	 */
	final String NUMBER_OF_PDANDHD_IN_COMMON = "JT-SJ-059";

	/**
	 * 腹透患者参与血透人数统计.
	 */
	final String NUMBER_OF_PDANDHD_IN_COMMON_L = "JT-SJ-059-L";

	/**
	 * 患者慢性疾病及危险因素
	 *
	 */
	final String PD_CHRONICDISEASE_DANGERS = "JT-PD-012";

	/**
	 * 患者慢性疾病及危险因素查看权限
	 *
	 */
	final String PD_CHRONICDISEASE_DANGERS_L = "JT-PD-012-L";

	/**
	 * 患者慢性疾病及危险因素编辑权限
	 *
	 */
	final String PD_CHRONICDISEASE_DANGERS_D = "JT-PD-012-D";

	/**
	 * 腹透门诊检查统计
	 *
	 */
	final String PD_CHECK_COUNT = "JT-SJ-064";

	/**
	 * 腹透门诊检查统计查看权限
	 *
	 */
	final String PD_CHECK_COUNT_L = "JT-SJ-064-L";

	/**
	 * 腹透门诊检查统计编辑权限
	 *
	 */
	final String PD_CHECK_COUNT_D = "JT-SJ-064-D";

	/**
	 * 腹透门诊换管统计
	 *
	 */
	final String PD_CHANGE_TUBE_COUNT = "JT-SJ-065";

	/**
	 * 腹透门诊换管统计查看权限
	 *
	 */
	final String PD_CHANGE_TUBE_COUNT_L = "JT-SJ-065-L";

	/**
	 * 腹透门诊换管统计编辑权限
	 *
	 */
	final String PD_CHANGE_TUBE_COUNT_D = "JT-SJ-065-D";

	/**
	 * 腹透检查医嘱
	 * 
	 */
	final String PD_CHECK_ORDER = "JT-PD-008";

	/**
	 * 腹透检查医嘱编辑权限
	 * 
	 */
	final String PD_CHECK_ORDER_L = "JT-PD-008-L";

	/**
	 * 腹透检查医嘱编辑权限
	 * 
	 */
	final String PD_CHECK_ORDER_D = "JT-PD-008-D";

	/**
	 * 腹透制定检查计划
	 * 
	 */
	final String PD_MAKE_CHECK_PLAN = "JT-PD-007";

	/**
	 * 腹透检查医嘱编辑权限
	 * 
	 */
	final String PD_MAKE_CHECK_PLAN_L = "JT-PD-007-L";

	/**
	 * 腹透检查医嘱编辑权限
	 * 
	 */
	final String PD_MAKE_CHECK_PLAN_D = "JT-PD-007-D";

	/**
	 * 腹透检查计划模板
	 * 
	 */
	final String PD_CHECK_PLAN_TEMPLATE = "JT-PD-006";

	/**
	 * 腹透检查计划模板查看权限
	 * 
	 */
	final String PD_CHECK_PLAN_TEMPLATE_L = "JT-PD-006-L";

	/**
	 * 腹透检查计划模板编辑权限
	 * 
	 */
	final String PD_CHECK_PLAN_TEMPLATE_D = "JT-PD-006-D";

	/**
	 * 溶质清除
	 * 
	 */
	final String SOLUTEREMOVAL = "JT-P-010";

	/**
	 * 溶质清除查看权限
	 * 
	 */
	final String SOLUTEREMOVAL_L = "JT-P-010-L";

	/**
	 * 溶质清除编辑权限
	 * 
	 */
	final String SOLUTEREMOVAL_D = "JT-P-010-D";

	/**
	 * 透析例数统计
	 * 
	 */
	final String DIALYSISCASES = "JT-SJ-024";

	/**
	 * 透析例数统计查看权限
	 * 
	 */
	final String DIALYSISCASES_L = "JT-SJ-024-L";

	/**
	 * 透析例数统计编辑权限
	 * 
	 */
	final String DIALYSISCASES_D = "JT-SJ-024-D";

	/**
	 * 溶质清除
	 * 
	 */
	final String URR_STATISTICS = "JT-SJ-026";

	/**
	 * 溶质清除查看权限
	 * 
	 */
	final String URR_STATISTICS_L = "JT-SJ-026-L";

	/**
	 * 溶质清除编辑权限
	 * 
	 */
	final String URR_STATISTICS_D = "JT-SJ-026-D";

	/**
	 * 腹透总库
	 */
	final String PD_STOCK_MANAGEMENT = "JT-KZ-031";

	/**
	 * 腹透总库查看
	 */
	final String PD_STOCK_MANAGEMENT_L = "JT-KZ-031-L";

	/**
	 * 腹透总库编辑
	 */
	final String PD_STOCK_MANAGEMENT_D = "JT-KZ-031-D";

	/**
	 * 腹透液对账.
	 */
	final String PD_STOCK_RECONCILIATION = "JT-KZ-038";

	/**
	 * 腹透液对账查看.
	 */
	final String PD_STOCK_RECONCILIATION_L = "JT-KZ-038-L";

	/**
	 * 腹透液对账编辑.
	 */
	final String PD_STOCK_RECONCILIATION_D = "JT-KZ-038-D";

	/**
	 * 腹透液设置
	 */
	final String PD_WAREHOUSE_MEDICINEEDIT = "JT-KZ-035";

	/**
	 * 腹透液设置查看
	 */
	final String PD_WAREHOUSE_MEDICINEEDIT_L = "JT-KZ-035-L";

	/**
	 * 腹透液设置编辑
	 */
	final String PD_WAREHOUSE_MEDICINEEDIT_D = "JT-KZ-035-D";

	/**
	 * 腹透仓库审批JT-PD-011
	 */
	final String PD_STOCK_INVENTORY = "JT-KZ-034";

	/**
	 * 腹透仓库审批查看
	 */
	final String PD_STOCK_INVENTORY_L = "JT-KZ-034-L";

	/**
	 * 腹透仓库审批编辑
	 */
	final String PD_STOCK_INVENTORY_D = "JT-KZ-034-D";

	/**
	 * 检查预约登记
	 */
	final String PD_CHECKTIME_REGISTER = "JT-PD-011";

	/**
	 * 检查预约登记查看
	 */
	final String PD_CHECKTIME_REGISTER_L = "JT-PD-011-L";

	/**
	 * 检查预约登记编辑
	 */
	final String PD_CHECKTIME_REGISTER_D = "JT-PD-011-D";

	/**
	 * 血压控制例数统计
	 */
	final String BLOODPRESSURE_STATISTICS = "JT-SJ-025";

	/**
	 * 血压控制例数统计查看
	 */
	final String BLOODPRESSURE_STATISTICS_L = "JT-SJ-025-L";

	/**
	 * 血压控制例数统计编辑
	 */
	final String BLOODPRESSURE_STATISTICS_D = "JT-SJ-025-D";

	/**
	 * 新患者培训
	 */
	final String PD_PATIENT_TRAIN = "JT-PX-002";

	/**
	 * 新患者培训查看
	 */
	final String PD_PATIENT_TRAIN_L = "JT-PX-002-L";

	/**
	 * 新患者培训编辑
	 */
	final String PD_PATIENT_TRAIN_D = "JT-PX-002-D";

	/**
	 * 培训项目
	 */
	final String PD_TRAIN_ITEM = "JT-PX-001";

	/**
	 * 培训项目查看
	 */
	final String PD_TRAIN_ITEM_L = "JT-PX-001-L";

	/**
	 * 培训项目编辑
	 */
	final String PD_TRAIN_ITEM_D = "JT-PX-001-D";

	/**
	 * 患者复训
	 */
	final String PD_AFTER_TRAIN = "JT-PX-003";

	/**
	 * 患者复训查看
	 */
	final String PD_AFTER_TRAIN_L = "JT-PX-003-L";

	/**
	 * 患者复训编辑
	 */
	final String PD_AFTER_TRAIN_D = "JT-PX-003-D";

	/**
	 * 腹透检查套餐
	 */
	final String PD_CHECK_TEMP = "JT-PD-009";

	/**
	 * 腹透检查套餐查看
	 */
	final String PD_CHECK_TEMP_L = "JT-PD-009-L";

	/**
	 * 腹透检查套餐编辑
	 */
	final String PD_CHECK_TEMP_D = "JT-PD-009-D";

	/**
	 * 腹透检查预约
	 */
	final String PD_CHECK_TIME = "JT-PD-010";

	/**
	 * 腹透检查预约查看
	 */
	final String PD_CHECK_TIME_L = "JT-PD-010-L";

	/**
	 * 腹透检查预约编辑
	 */
	final String PD_CHECK_TIME_D = "JT-PD-010-D";

	/**
	 * 腹透进修带教
	 */
	final String PD_TECHING_RECORD = "JT-PX-005";

	/**
	 * 腹透进修带教查看
	 */
	final String PD_TECHING_RECORD_L = "JT-PX-005-L";

	/**
	 * 腹透进修带教编辑
	 */
	final String PD_TECHING_RECORD_D = "JT-PX-005-D";

	/**
	 * 腹透传染病情况统计Infectious Diseases.
	 */
	final String PD_STATISTICS_INFECTIOUSDISEASES = "JT-SJ-055";

	/**
	 * 腹透传染病情况统计检索.
	 */
	final String PD_STATISTICS_INFECTIOUSDISEASES_L = "JT-SJ-055-L";

	/**
	 * 腹透随访计划
	 */
	final String PD_MAKE_FOLLOW_PLAN = "JT-SF-004";

	/**
	 * 腹透随访计划查看
	 */
	final String PD_MAKE_FOLLOW_PLAN_L = "JT-SF-004-L";

	/**
	 * 腹透随访计划编辑
	 */
	final String PD_MAKE_FOLLOW_PLAN_D = "JT-SF-004-D";

	/**
	 * 腹膜炎记录
	 */
	final String PD_PERITONITIS_RECORD = "JT-PX-006";

	/**
	 * 腹膜炎记录查看
	 */
	final String PD_PERITONITIS_RECORD_L = "JT-PX-006-L";

	/**
	 * 腹膜炎记录编辑
	 */
	final String PD_PERITONITIS_RECORD_D = "JT-PX-006-D";

	/**
	 * pdperitonitisconfig 腹膜炎项目设置
	 */
	final String PD_PERITONITIS_CONFIG = "PD-FT-025";

	/**
	 * 腹膜炎项目设置查看
	 */
	final String PD_PERITONITIS_CONFIG_L = "PD-FT-025-L";

	/**
	 * 腹膜炎项目设置编辑
	 */
	final String PD_PERITONITIS_CONFIG_D = "PD-FT-025-D";

	/**
	 * 跌倒/坠床危险因素评估
	 */
	final String RISK_FACTOR = "JT-PG-007";

	/**
	 * 跌倒/坠床危险因素评估查看
	 */
	final String RISK_FACTOR_L = "JT-PG-007-L";

	/**
	 * 跌倒/坠床危险因素评估编辑
	 */
	final String RISK_FACTOR_D = "JT-PG-007-D";

	/**
	 * 检查套餐
	 */
	final String CHECK_TEMP = "JT-J-012";

	/**
	 * 检查套餐查看
	 */
	final String CHECK_TEMP_L = "JT-J-012-L";

	/**
	 * 检查套餐编辑
	 */
	final String CHECK_TEMP_D = "JT-J-012-D";

	/**
	 * 住院情况统计
	 */
	final String HOSPITALIZATION = "JT-SJ-062";

	/**
	 * 住院情况统计查看
	 */
	final String HOSPITALIZATION_L = "JT-SJ-062-L";

	/**
	 * 住院情况统计编辑
	 */
	final String HOSPITALIZATION_D = "JT-SJ-062-D";

	/**
	 * 腹透患者住院收治统计
	 */
	final String HOSPITALIZATION_STATISTICS = "JT-SJ-066";

	/**
	 * 腹透患者住院收治统计查看
	 */
	final String HOSPITALIZATION_STATISTICS_L = "JT-SJ-066-L";

	/**
	 * 腹透患者住院收治统计编辑
	 */
	final String HOSPITALIZATION_STATISTICS_D = "JT-SJ-066-D";

	/**
	 * 腹膜炎例次统计
	 */
	final String PD_PERITONITIS_STATISTICS = "JT-SJ-067";

	/**
	 * 腹膜炎例次统计查看
	 */
	final String PD_PERITONITIS_STATISTICS_L = "JT-SJ-067-L";

	/**
	 * 腹膜炎例次统计编辑
	 */
	final String PD_PERITONITIS_STATISTICS_D = "JT-SJ-067-D";

	/**
	 * 腹膜炎例次统计
	 */
	final String PD_STOCK_RECEIVE = "JT-KZ-036";

	/**
	 * 腹膜炎例次统计查看
	 */
	final String PD_STOCK_RECEIVE_L = "JT-KZ-036-L";

	/**
	 * 腹膜炎例次统计编辑
	 */
	final String PD_STOCK_RECEIVE_D = "JT-KZ-036-D";

	/**
	 * 检查结果导出
	 */
	final String CHECK_RESULT_EXPORT = "JT-J-0013";

	/**
	 * 大项目、子项目、导出项目查看.
	 */
	final String CHECK_RESULT_EXPORT_LOOK = "JT-J-0013-L";

	/**
	 * 导出项目列表的添加删除、导出EXCEL文件.
	 */
	final String CHECK_RESULT_EXPORT_DELETE = "JT-J-0013-D";

	/**
	 * 查房记录
	 */
	final String ROUND_RECORD = "JT-PG-010";

	/**
	 * 查房记录删除
	 */
	final String ROUND_RECORD_D = "JT-PG-010-D";

	/**
	 * 腹透门诊安排
	 */
	final String PD_OUTPATIENT_PLAN = "PD-FT-027";

	/**
	 * 腹透门诊安排查看
	 */
	final String PD_OUTPATIENT_PLAN_L = "PD-FT-027-L";

	/**
	 * 腹透门诊安排编辑
	 */
	final String PD_OUTPATIENT_PLAN_D = "PD-FT-027-D";

	/**
	 * 腹透门诊图
	 */
	final String PD_OUTPATIENT_INDEX = "PD-FT-028";

	/**
	 * 腹透门诊图查看
	 */
	final String PD_OUTPATIENT_INDEX_L = "PD-FT-028-L";

	/**
	 * 腹透门诊图编辑
	 */
	final String PD_OUTPATIENT_INDEX_D = "PD-FT-028-D";

	/**
	 * 腹透检验检查历史.
	 */
	final String PD_INFOR_INSPECT = "JT-P-006";

	/**
	 * 腹透检验检查历史查看.
	 */
	final String PD_INFOR_INSPECT_L = "JT-P-006-L";

	/**
	 * 腹透检验检查历史编辑.
	 */
	final String PD_INFOR_INSPECT_D = "JT-P-006-D";

	/**
	 * 腹透评估项目设置页面.
	 */
	final String PD_EVALUATE_ITEM_SET = "PD-PX-010";

	/**
	 * 腹透评估项目设置页面查看.
	 */
	final String PD_EVALUATE_ITEM_SET_L = "PD-PX-010-L";

	/**
	 * 腹透评估项目设置页面编辑.
	 */
	final String PD_EVALUATE_ITEM_SET_D = "PD-PX-010-D";

	/**
	 * 腹透评估页面.
	 */
	final String PD_EVALUATE_INDEX = "PD-PX-011";

	/**
	 * 腹透评估页面查看.
	 */
	final String PD_EVALUATE_INDEX_L = "PD-PX-011-L";

	/**
	 * 腹透评估页面编辑.
	 */
	final String PD_EVALUATE_INDEX_D = "PD-PX-011-D";

	/**
	 * 腹透评估结果页面.
	 */
	final String PDTRAINEVALUATERESULT_INDEX = "PD-PX-012";

	/**
	 * 腹透评估结果查看.
	 */
	final String PDTRAINEVALUATERESULT_INDEX_L = "PD-PX-012-L";

	/**
	 * 腹透评估结果页面编辑.
	 */
	final String PDTRAINEVALUATERESULT_INDEX_D = "PD-PX-012-D";

	/**
	 * 自助机页面.
	 */
	final String PD_SELFSERVICE_INDEX = "PD-ZZJ-000";

	/**
	 * 腹透评估页面查看.
	 */
	final String PD_SELFSERVICE_INDEX_L = "PD-ZZJ-000";

	/**
	 * 腹透评估页面编辑.
	 */
	final String PD_SELFSERVICE_INDEX_D = "PD-ZZJ-000";

	/**
	 * 腹透评估问卷结果统计页面.
	 */
	final String PD_EVALUATION_OF_QUESTIONNAIRES = "PD-PX-014";

	/**
	 * 腹透评估问卷结果统计查看.
	 */
	final String PD_EVALUATION_OF_QUESTIONNAIRES_L = "PD-PX-014-L";

	/**
	 * 腹透评估问卷结果统计编辑.
	 */
	final String PD_EVALUATION_OF_QUESTIONNAIRES_D = "PD-PX-014-D";

	/**
	 * 腹透培训评估效果页面.
	 */
	final String PD_TRAIN_EVALUATION_EFFECT = "PD-PX-013";

	/**
	 * 腹透培训评估效果查看.
	 */
	final String PD_TRAIN_EVALUATION_EFFECT_L = "PD-PX-013-L";

	/**
	 * 腹透培训评估效果编辑.
	 */
	final String PD_TRAIN_EVALUATION_EFFECT_D = "PD-PX-013-D";

	/**
	 * 腹透患者登记号页面.
	 */
	final String PD_PATIENT_WARDNO = "PD-PX-015";

	/**
	 * 腹透患者登记号查看.
	 */
	final String PD_PATIENT_WARDNO_L = "PD-PX-015-L";

	/**
	 * 腹透患者登记号编辑.
	 */
	final String PD_PATIENT_WARDNO_D = "PD-PX-015-D";

	/**
	 * 自助机页面.
	 */
	final String SELFSERVICE = "JT-S-015";

	/**
	 * 自助机查看.
	 */
	final String SELFSERVICE_L = "JT-S-015-L";

	/**
	 * 自助机编辑.
	 */
	final String SELFSERVICE_D = "JT-S-015-D";

	/**
	 * 送检单录入页面.
	 */
	final String SENDEXAM = "JT-Q-001";

	/**
	 * 送检单录入查看.
	 */
	final String SENDEXAM_L = "JT-Q-001-L";

	/**
	 * 送检单录入编辑.
	 */
	final String SENDEXAM_D = "JT-Q-001-D";

	/**
	 * 送检单列表页面.
	 */
	final String EXAM_QUERY = "JT-Q-002";

	/**
	 * 送检单列表查看
	 */
	final String EXAM_QUERY_L = "JT-Q-002-L";

	/**
	 * 交班单录入编辑.
	 */
	final String LOGBOOK_D = "JT-R-002-D";

	/**
	 * 交班单列表页面.
	 */
	final String LOGBOOK_QUERY = "JT-R-002";

	/**
	 * 交班单列表查看
	 */
	final String LOGBOOK_QUERY_L = "JT-R-002-L";

	/**
	 * 交班单汇总录入编辑.
	 */
	final String SHIFTINFOsUMMARY_D = "JT-R-001-D";

	/**
	 * 交班单汇总列表页面.
	 */
	final String SHIFTINFOsUMMARY_QUERY = "JT-R-001";

	/**
	 * 交班单汇总列表查看
	 */
	final String SHIFTINFOsUMMARY_QUERY_L = "JT-R-001-L";

	/**
	 * 交班人数统计页面 JT-R-003、JT-R-003-D、JT-R-003-L
	 */
	final String HANDOVERSUMMARY = "JT-R-003";

	final String HANDOVERSUMMARY_L = "JT-R-003-L";

	final String HANDOVERSUMMARY_D = "JT-R-003-D";

	/**
	 * 腹透用药问卷页面.
	 */
	final String PD_MEDICAL_FOLLOWUP = "PD-FT-030";

	/**
	 * 腹透用药问卷页面查看
	 */
	final String PD_MEDICAL_FOLLOWUP_L = "PD-FT-030-L";

	/**
	 * 腹透用药问卷页面编辑.
	 */
	final String PD_MEDICAL_FOLLOWUP_D = "PD-FT-030-D";

	/**
	 * 检查时间页面.
	 */
	final String CHECKTIME_SEARCH = "JT-J-011";

	/**
	 * 检查时间页面查看
	 */
	final String CHECKTIME_SEARCH_L = "JT-J-011-L";

	/**
	 * 检查时间页面编辑.
	 */
	final String CHECKTIME_SEARCH_D = "JT-J-011-D";

	/**
	 * 腹透自动化任务设置.
	 */
	final String PD_AUTOMATE_TAST_SET = "PD-FT-032";

	/**
	 * 腹透自动化任务设置
	 */
	final String PD_AUTOMATE_TAST_SET_L = "PD-FT-032-L";

	/**
	 * 腹透自动化任务设置.
	 */
	final String PD_AUTOMATE_TAST_SET_D = "PD-FT-032-D";

	/**
	 * 察尔森合并症评价.
	 */
	final String PDCHARLSONCOMORBIDITYASSESSMENT = "PD-FT-033";

	/**
	 * 察尔森合并症评价.
	 */
	final String PDCHARLSONCOMORBIDITYASSESSMENT_L = "PD-FT-033-L";

	/**
	 * 察尔森合并症评价.
	 */
	final String PDCHARLSONCOMORBIDITYASSESSMENT_D = "PD-FT-033-D";

	/**
	 * SGA营养评估列表
	 */
	final String SGANUTRITIONASSESSMENTLIST = "JT-PG-012";

	/**
	 * SGA营养评估列表
	 */
	final String SGANUTRITIONASSESSMENTLIST_D = "JT-PG-012-D";

	/**
	 * SGA营养评估列表
	 */
	final String SGANUTRITIONASSESSMENTLIST_L = "JT-PG-012-L";

	/**
	 * SGA营养评估录入
	 */
	final String SGANUTRITIONASSESSMENT = "JT-PG-013";

	/**
	 * SGA营养评估录入
	 */
	final String SGANUTRITIONASSESSMENT_D = "JT-PG-013-D";

	/**
	 * SGA营养评估录入
	 */
	final String SGANUTRITIONASSESSMENT_L = "JT-PG-013-L";
	
    /**
     * 阶段性小结列表.
     */
    final String PHASED_NODULE_LIST = "JT-PG-014";

    /**
     * 阶段性小结列表.
     */
    final String PHASED_NODULE_LIST_D = "JT-PG-014-D";

    /**
     * 阶段性小结列表.
     */
    final String PHASED_NODULE_LIST_L = "JT-PG-014-L";
    /**
     * 阶段性小结录入.
     */
    final String PHASED_NODULE = "JT-PG-015";

    /**
     * 阶段性小结录入.
     */
    final String PHASED_NODULE_D = "JT-PG-015-D";

    /**
     * 阶段性小结录入.
     */
    final String PHASED_NODULE_L = "JT-PG-015-L";

    /**
     * 入室评估.
     */
    final String ADMISSION_ASSESSMENT = "JT-PG-016";
    
    /**
     * 入室评估.
     */
    final String ADMISSION_ASSESSMENT_L = "JT-PG-016-L";
    
    /**
     * 入室评估.
     */
    final String ADMISSION_ASSESSMENT_D = "JT-PG-016-D";

	/**
	 * 肾穿列表：JT-Q-003、JT-Q-003-D、JT-Q-003-L
	 */
	final String KIDNEYWEARQUERY = "JT-Q-003";

	final String KIDNEYWEARQUERY_L = "JT-Q-003-L";

	final String KIDNEYWEARQUERY_D = "JT-Q-003-D";

	/**
	 * 肾穿录入：JT-Q-004、JT-Q-004-D、JT-Q-004-L
	 */
	final String KIDNEYWEAR = "JT-Q-004";

	final String KIDNEYWEAR_L = "JT-Q-004-L";

	final String KIDNEYWEAR_D = "JT-Q-004-D";

	/**
	 * 护理质量统计 JT-SJ-023 JT-SJ-023-D JT-SJ-023-L
	 */
	final String NURSINGQUALITY = "JT-SJ-023";

	final String NURSINGQUALITY_L = "JT-SJ-023-L";

	final String NURSINGQUALITY_D = "JT-SJ-023-D";
	
	
	/**
     * 新腹膜透析方案.
     */
    final String N_FT_PERIT_DIALYSIS = "PD-FT-034";

    /**
     * 新腹膜透析方案 检索.
     */
    final String N_FT_PERIT_DIALYSIS_L = "PD-FT-034-L";

    /**
     * 新腹膜透析方案 删除.
     */
    final String N_FT_PERIT_DIALYSIS_D = "PD-FT-034-D";
    
    /**
     * 腹透门诊设置.
     */
    final String PD_OUT_PATIENT_SET = "PD-FT-026";

    /**
     * 腹透门诊设置 检索.
     */
    final String PD_OUT_PATIENT_SET_L = "PD-FT-026-L";

    /**
     * 腹透门诊设置 删除.
     */
    final String PD_OUT_PATIENT_SET_D = "PD-FT-026-D";
	
	/**
	 * 预收费录入编辑.
	 */
	final String PRECHARGE_D = "JT-FY-008-D";

	/**
	 * 预收费列表页面.
	 */
	final String PRECHARGE_QUERY = "JT-FY-008";

	/**
	 * 预收费列表查看
	 */
	final String PRECHARGE_QUERY_L = "JT-FY-008-L";
	
	
	
	/**
     * 腹透患者掉队率（DOR）.
     */
    final String PD_DROP_RATE = "PD-FT-036";

    /**
     * 腹透患者掉队率（DOR）修改.
     */
    final String PD_DROP_RATE_D = "PD-FT-036-D";

    /**
     * 腹透患者掉队率（DOR）查看
     */
    final String PD_DROP_RATE_L = "PD-FT-036-L";
    
    /**
     * 腹透患者掉队率（DOR）.
     */
    final String PD_SURVIVAL_ON = "PD-FT-035";

    /**
     * 腹透患者掉队率（DOR）修改.
     */
    final String PD_SURVIVAL_ON_D = "PD-FT-035-D";

    /**
     * 腹透患者掉队率（DOR）查看
     */
    final String PD_SURVIVAL_ON_L = "PD-FT-035-L";
    
    /**
     *  腹透用药类型设置.
     */
    final String PD_MEDICATION_SET = "PD-FT-037";

    /**
     *  腹透用药类型设置修改.
     */
    final String PD_MEDICATION_SET_D = "PD-FT-037-D";

    /**
     *  腹透用药类型设置查看
     */
    final String PD_MEDICATION_SET_L = "PD-FT-037-L";
    
    
	
}
