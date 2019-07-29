
package com.ustcsoft.pdqc.web.workstation.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper;
import com.ustcsoft.pdqc.core.autogen.dao.PdMUserMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserKey;
import com.ustcsoft.pdqc.web.common.controller.WebBaseController;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.workstation.constants.WorkStationPages;
import com.ustcsoft.pdqc.web.workstation.form.ChartForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessListReturnDataForm;
import com.ustcsoft.pdqc.web.workstation.form.CompletenessReportForm;
import com.ustcsoft.pdqc.web.workstation.form.EChartCodeForm;
import com.ustcsoft.pdqc.web.workstation.form.OrgCondForm;
import com.ustcsoft.pdqc.web.workstation.form.OrgResultForm;
import com.ustcsoft.pdqc.web.workstation.form.UnreportedPatientForm;
import com.ustcsoft.pdqc.web.workstation.service.WorkStationService;

/**
 * 首页controller.
 * 
 * @author houshuaitao
 *
 */
@Controller
@RequestMapping("/workstation")
// @ControllerID(DBScreenID.USER_WORKSTATION)
public class WorkStationController extends WebBaseController {

	@Autowired
	private PdMUserMapper pdMUserMapper; 
	
	@Autowired
	WorkStationService workStationService;
	
	@Autowired
	PdMOrganizationMapper pdMOrganizationMapper;

	/**
	 * 首页
	 * 
	 * @param model
	 *            ModelMap
	 * @return String
	 */
	@RequestMapping(value = "/workStationUser")
	public String workStationUser(ModelMap model) {
		String name = "";
		String staffflag = "";
		// MStaffKey key = new MStaffKey();
		PdMUserKey userKey = new PdMUserKey();
		userKey.setUserNo(getLoginUser().getUserNo().trim());
		// key.setId(getLoginUser().getId().trim());
		// MStaff staffs = staffMapper.selectByPrimaryKey(key);
		PdMUser user = this.pdMUserMapper.selectByPrimaryKey(userKey);
		if (user != null) {
			// name = user.getName();
			// staffflag = staffs.getFlag();
			name = user.getUserName();
			staffflag = user.getUserType();
		}
		if (!Tools.isblank(name)) {
			name = name.trim();
		}
		if (!Tools.isblank(staffflag)) {
			staffflag = staffflag.trim();
		}
		model.addAttribute("name", name);
		model.addAttribute("staffflag", staffflag);
		// 获取机构类型
		String orgNo = getLoginUser().getOrgNo();
		PdMOrganizationExample pdMOrganizationExample = new PdMOrganizationExample();
		PdMOrganizationExample.Criteria pdMOrganizationCriteria = pdMOrganizationExample.createCriteria();
		pdMOrganizationCriteria.andOrgNoEqualTo(orgNo);
		List<PdMOrganization> pdMOrganizationList = pdMOrganizationMapper.selectByExample(pdMOrganizationExample);
		String orgType = "";
		if (!Tools.listisblank(pdMOrganizationList)) {
		    orgType = pdMOrganizationList.get(0).getOrgType();
		}
		model.addAttribute("orgType", orgType);
		return WorkStationPages.WORKSTATION_USER;
	}

	/**
	 * 获取组织机构信息列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getOrgList")
	public JacksonPagginListReturn<OrgResultForm> getOrgList(OrgCondForm condForm) {
		return workStationService.getOrgList(condForm);
	}
	
	/**
     * 查询医院信息
     * 
     * @param condition
     * @return
     */
    @RequestMapping("/initHospitalChart")
    public JacksonDataReturn<ChartForm> initHospitalChart() {
        return workStationService.initHospitalChart();
    }

	/**
	 * 质控中心端上报完整性汇总数据
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getIntegrityList")
	@ResponseBody
	public CompletenessListReturnDataForm completenessSummaryData() {
		return workStationService.completenessSummaryData();
	}

	/**
	 * 透析中心端上报完整性汇总数据
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getRePortCompletenes")
	public JacksonPagginListReturn<CompletenessReportForm> getRePortCompletenes() {
		return workStationService.getRePortCompletenes();
	}
		 
	
	 /**
     * 未上报患者信息画面初始化
     * 
     * @param model
     * @param reportProject
     * @return
     */
    @RequestMapping("/unreportedPatient")
    public String unreportedPatient(ModelMap model, String reportProject) {
    	model.addAttribute("reportProject", reportProject);
        return WorkStationPages.UNREPORTED_PATIENT;
    }
	
	/**
	 * 获取未上报患者信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getRePortPatient")
	public JacksonPagginListReturn<UnreportedPatientForm> getRePortPatient(String reportProject,String inspectionType) {
		return workStationService.getRePortPatient(reportProject,inspectionType);
	}
	
	/**
	 * 查询Hb分数
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiHbScoreChart")
	public JacksonDataReturn<ChartForm> searchKpiHbScoreChart(String examType,String orderBy) {
		return this.workStationService.searchKpiScoreChart(examType,orderBy);
	}

	/**
	 * 查询Hb检查率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiHbExamChart")
	public JacksonDataReturn<ChartForm> searchKpiHbExamChart(String examType,String orderBy) {
		return this.workStationService.searchKpiExamChart(examType,orderBy);
	}

	/**
	 * 查询Hb达标率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiHbStandardChart")
	public JacksonDataReturn<ChartForm> searchKpiHbStandardChart(String examType,String orderBy) {
		return this.workStationService.searchKpiStandardChart(examType,orderBy);
	}
	 /**
     * Hb数据导出.
     * 
     * @param form 模型
     * @return 模型
     */
    @RequestMapping(value = "hbDataExport", method = RequestMethod.POST)
    public ResponseEntity<byte[]> hbDataExport(String examType) {
        JacksonReturn result = workStationService.dataExport(examType);

        String fileName = result.getRetMsg();
        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment",
                    new String(file.getName().getBytes("UTF-8"), "iso-8859-1"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> resultResponseEntity = new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        try {
            resultResponseEntity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,
                    HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
        return resultResponseEntity;
    }
	/**
	 * 查询Alb分数
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiAlbScoreChart")
	public JacksonDataReturn<ChartForm> searchKpiAlbScoreChart(String examType,String orderBy) {
		return this.workStationService.searchKpiScoreChart(examType,orderBy);
	}
	/**
	 * 查询Alb检查率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiAlbExamChart")
	public JacksonDataReturn<ChartForm> searchKpiAlbExamChart(String examType,String orderBy) {
		return this.workStationService.searchKpiExamChart(examType,orderBy);
	}
	/**
	 * 查询Alb达标率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiAlbStandardChart")
	public JacksonDataReturn<ChartForm> searchKpiAlbStandardChart(String examType,String orderBy) {
		return this.workStationService.searchKpiStandardChart(examType,orderBy);
	}
	 /**
     * alb数据导出.
     * 
     * @param form 模型
     * @return 模型
     */
    @RequestMapping(value = "albDataExport", method = RequestMethod.POST)
    public ResponseEntity<byte[]> albDataExport(String examType) {
        JacksonReturn result = workStationService.dataExport(examType);

        String fileName = result.getRetMsg();
        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment",
                    new String(file.getName().getBytes("UTF-8"), "iso-8859-1"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> resultResponseEntity = new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        try {
            resultResponseEntity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,
                    HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
        return resultResponseEntity;
    }
	/**
	 * 查询Ca分数
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiCaScoreChart")
	public JacksonDataReturn<ChartForm> searchKpiCaScoreChart(String examType,String orderBy) {
		return this.workStationService.searchKpiScoreChart(examType,orderBy);
	}

	/**
	 * 查询Ca检查率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiCaExamChart")
	public JacksonDataReturn<ChartForm> searchKpiCaExamChart(String examType,String orderBy) {
		return this.workStationService.searchKpiExamChart(examType,orderBy);
	}
	/**
	 * 查询Ca达标率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiCaStandardChart")
	public JacksonDataReturn<ChartForm> searchKpiCaStandardChart(String examType,String orderBy) {
		return this.workStationService.searchKpiStandardChart(examType,orderBy);
	}
	 /**
     * ca数据导出.
     * 
     * @param form 模型
     * @return 模型
     */
    @RequestMapping(value = "caDataExport", method = RequestMethod.POST)
    public ResponseEntity<byte[]> caDataExport(String examType) {
        JacksonReturn result = workStationService.dataExport(examType);

        String fileName = result.getRetMsg();
        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment",
                    new String(file.getName().getBytes("UTF-8"), "iso-8859-1"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> resultResponseEntity = new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        try {
            resultResponseEntity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,
                    HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
        return resultResponseEntity;
    }
	/**
	 * 查询P分数
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiPScoreChart")
	public JacksonDataReturn<ChartForm> searchKpiPScoreChart(String examType,String orderBy) {
		return this.workStationService.searchKpiScoreChart(examType,orderBy);
	}
	
	/**
	 * 查询P检查率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiPExamChart")
	public JacksonDataReturn<ChartForm> searchKpiPExamChart(String examType,String orderBy) {
		return this.workStationService.searchKpiExamChart(examType,orderBy);
	}
	/**
	 * 查询P达标率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiPStandardChart")
	public JacksonDataReturn<ChartForm> searchKpiPStandardChart(String examType,String orderBy) {
		return this.workStationService.searchKpiStandardChart(examType,orderBy);
	}
	 /**
     * p数据导出.
     * 
     * @param form 模型
     * @return 模型
     */
    @RequestMapping(value = "pDataExport", method = RequestMethod.POST)
    public ResponseEntity<byte[]> pDataExport(String examType) {
        JacksonReturn result = workStationService.dataExport(examType);

        String fileName = result.getRetMsg();
        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment",
                    new String(file.getName().getBytes("UTF-8"), "iso-8859-1"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> resultResponseEntity = new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        try {
            resultResponseEntity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,
                    HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
        return resultResponseEntity;
    }
	/**
	 * 查询Pth分数
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiPthScoreChart")
	public JacksonDataReturn<ChartForm> searchKpiPthScoreChart(String examType,String orderBy) {
		return this.workStationService.searchKpiScoreChart(examType,orderBy);
	}

	/**
	 * 查询Pth检查率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiPthExamChart")
	public JacksonDataReturn<ChartForm> searchKpiPthExamChart(String examType,String orderBy) {
		return this.workStationService.searchKpiExamChart(examType,orderBy);
	}
	/**
	 * 查询Pth达标率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiPthStandardChart")
	public JacksonDataReturn<ChartForm> searchKpiPthStandardChart(String examType,String orderBy) {
		return this.workStationService.searchKpiStandardChart(examType,orderBy);
	}
	 /**
     * pth数据导出.
     * 
     * @param form 模型
     * @return 模型
     */
    @RequestMapping(value = "pthDataExport", method = RequestMethod.POST)
    public ResponseEntity<byte[]> pthDataExport(String examType) {
        JacksonReturn result = workStationService.dataExport(examType);

        String fileName = result.getRetMsg();
        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment",
                    new String(file.getName().getBytes("UTF-8"), "iso-8859-1"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> resultResponseEntity = new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        try {
            resultResponseEntity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,
                    HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
        return resultResponseEntity;
    }
	/**
	 * 腹透充分性
	 * 
	 * @param condition
	 * @return result
	 */
	@RequestMapping("/searchKpiVentralScoreChart")
	public JacksonDataReturn<ChartForm> initVentralStandardChart(String examType,String orderBy) {
		return this.workStationService.searchKpiScoreChart(examType,orderBy);
	}

	/**
	 * 查询腹透充分性检查率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiVentralExamChart")
	public JacksonDataReturn<ChartForm> searchKpiVentralExamChart(String examType,String orderBy) {
		return this.workStationService.searchKpiExamChart(examType,orderBy);
	}
	/**
	 * 查询腹透充分性达标率
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("/searchKpiVentralStandardChart")
	public JacksonDataReturn<ChartForm> searchKpiVentralStandardChart(String examType,String orderBy) {
		return this.workStationService.searchKpiStandardChart(examType,orderBy);
	}
	 /**
     * 腹透充分性数据导出.
     * 
     * @param form 模型
     * @return 模型
     */
    @RequestMapping(value = "ventralDataExport", method = RequestMethod.POST)
    public ResponseEntity<byte[]> ventralDataExport(String examType) {
        JacksonReturn result = workStationService.dataExport(examType);

        String fileName = result.getRetMsg();
        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment",
                    new String(file.getName().getBytes("UTF-8"), "iso-8859-1"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> resultResponseEntity = new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        try {
            resultResponseEntity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,
                    HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
        return resultResponseEntity;
    }
	/**
	 * 腹膜转运能力
	 * 
	 * @param condition
	 * @return result
	 */
	@RequestMapping("/initTransportStandardChart")
	public JacksonDataReturn<ChartForm> initTransportStandardChart() {
		JacksonDataReturn<ChartForm> result = new JacksonDataReturn<ChartForm>();
		ChartForm chartForm = new ChartForm();
		List<EChartCodeForm> chartList = new ArrayList<EChartCodeForm>();
		return result;
	}
	
	/**
	 * 合并症
	 * 
	 * @param condition
	 * @return result
	 */
	@RequestMapping("/initComplicationsStandardChart")
	public JacksonDataReturn<ChartForm> initComplicationsStandardChart() {
		JacksonDataReturn<ChartForm> result = new JacksonDataReturn<ChartForm>();
		ChartForm chartForm = new ChartForm();
		List<EChartCodeForm> chartList = new ArrayList<EChartCodeForm>();
		EChartCodeForm eChartCodeForm1 = new EChartCodeForm();
		eChartCodeForm1.setName("武汉市第一医院");
		eChartCodeForm1.setValue(new BigDecimal(10.26));
		EChartCodeForm eChartCodeForm2 = new EChartCodeForm();
		eChartCodeForm2.setName("武汉市中心医院后湖院区");
		eChartCodeForm2.setValue(new BigDecimal(11.41));
		EChartCodeForm eChartCodeForm3 = new EChartCodeForm();
		eChartCodeForm3.setName("武汉市中心医院南京路院区");
		eChartCodeForm3.setValue(new BigDecimal(15.46));
		EChartCodeForm eChartCodeForm4 = new EChartCodeForm();
		eChartCodeForm4.setName("武汉天霖中西医结合肾病医院");
		eChartCodeForm4.setValue(new BigDecimal(12.44));
		EChartCodeForm eChartCodeForm5 = new EChartCodeForm();
		eChartCodeForm5.setName("武汉市新洲区中医肾病专科医院");
		eChartCodeForm5.setValue(new BigDecimal(27.48));
		chartList.add(eChartCodeForm1);
		chartList.add(eChartCodeForm2);
		chartList.add(eChartCodeForm3);
		chartList.add(eChartCodeForm4);
		chartList.add(eChartCodeForm5);
		chartForm.seteChartCodeFormList(chartList);
		result.setData(chartForm);
		return result;
	}
}
