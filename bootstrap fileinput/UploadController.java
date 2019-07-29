//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.newweb.upload.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonDataReturn;
import com.ustcsoft.marsfw.web.servlet.method.retruns.io.FileReturn;
import com.ustcsoft.marsfw.web.servlet.method.retruns.io.FileReturnFactory;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDocumentRecordMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDocumentRecord;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDocumentRecordExample;
import com.ustcsoft.pdqc.newweb.upload.FileUtil;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;

/**
 * 文件上传.
 * 
 * @author zhangrui.i
 * @since 2018年12月14日 上午11:03:52
 */
@Controller
@RequestMapping("/uploadfile")
public class UploadController {

    // Tomcat server.xml 添加
    // <Context docBase="D:\\FileResources\\upload" path="/pdqc-web/upload" reloadable="true"/>

    @Autowired
    PdDPatientDocumentRecordMapper patientDocumentRecordMapper;

    @Autowired
    FileUtil fileUtil;

    @RequestMapping("")
    public String index() {
        return "views/newweb/uploadfile/UploadFile";
    }

    /**
     * 上传文件
     * 
     * @param request
     * @param response
     * @param file 上传的文件，支持多文件
     * @throws Exception
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(HttpServletRequest request, HttpServletResponse response,
            @RequestParam("file") MultipartFile[] file, String pid, String groupid) throws Exception {
        if (file != null && file.length > 0) {
            // 组合image名称，“;隔开”
            List<String> fileName = new ArrayList<String>();

            try {
                for (int i = 0; i < file.length; i++) {
                    if (!file[i].isEmpty()) {

                        // 上传文件，随机名称，";"分号隔开
                        fileName.add(fileUtil.uploadImage(pid, groupid, request,
                                "\\upload\\" + DateUtil.formatDate(new Date(), "yyyy-MM-dd"), file[i], true));
                    }
                }

                // 上传成功
                if (fileName != null && fileName.size() > 0) {
                    System.out.println("上传成功！");
                    FileUtil.printJson(response, fileName);;
                } else {
                    FileUtil.printJson(response, "上传失败！文件格式错误！");
                }
            } catch (Exception e) {
                e.printStackTrace();
                FileUtil.printJson(response, "上传出现异常！异常出现在：class.UploadController.insert()");
            }
        } else {
            FileUtil.printJson(response, "没有检测到文件！");
        }
    }

    /**
     * 删除文件.
     */
    @RequestMapping(value = "/deletefile", method = RequestMethod.POST)
    public void deletefile(String key, HttpServletResponse response) {
        PdDPatientDocumentRecordExample example = new PdDPatientDocumentRecordExample();
        PdDPatientDocumentRecordExample.Criteria criteria = example.createCriteria();
        criteria.andDelFlagEqualTo("0");
        criteria.andIdEqualTo(key);
        List<PdDPatientDocumentRecord> list = patientDocumentRecordMapper.selectByExample(example);
        if (!Tools.listisblank(list)) {
            PdDPatientDocumentRecord pRecord = list.get(0);
            PdDPatientDocumentRecord record = new PdDPatientDocumentRecord();
            record.setDelFlag("1");
            record.setSize(pRecord.getSize());
            patientDocumentRecordMapper.updateByExampleSelective(record, example);
            FileUtil.printJson(response, FileUtil.deleteFile(pRecord.getPath() + "\\" + pRecord.getZlnbm()));
        } else {
            FileUtil.printJson(response, "文件不存在!");
        }
    }

    /**
     * 下载文件.
     * 
     * @param key
     */
    @RequestMapping(value = "/downloadfile")
    public FileReturn downloadfile(String key, HttpServletResponse response) {

        PdDPatientDocumentRecordExample example = new PdDPatientDocumentRecordExample();
        PdDPatientDocumentRecordExample.Criteria criteria = example.createCriteria();
        criteria.andDelFlagEqualTo("0");
        criteria.andIdEqualTo(key);
        List<PdDPatientDocumentRecord> list = patientDocumentRecordMapper.selectByExample(example);
        if (!Tools.listisblank(list)) {
            PdDPatientDocumentRecord pRecord = list.get(0);

            try {

                File newfile = new File(pRecord.getPath() + "//" + pRecord.getZlnbm());

                // 通过工厂创建一个返回对象
                FileReturn fileReturn = FileReturnFactory.createReturn(newfile, pRecord.getZlm());
                if (newfile == null || !newfile.isFile() || !newfile.exists() || !newfile.canRead()) {
                    System.out.println("没有找到该文件！" + "==文件路径:" + newfile.getPath());
                    return null;
                } else {
                    System.out.println("文件路径:" + newfile.getPath());
                }
                return fileReturn;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 数据回显.
     * 
     * @return
     */
    @RequestMapping("selectFileData")
    public JacksonDataReturn<JSONObject> selectFileData(HttpServletRequest request, String pid, String groupid) {
        JacksonDataReturn<JSONObject> result = new JacksonDataReturn<>();

        List<PdDPatientDocumentRecord> list = null;
        if (!Tools.isblank(pid) && !Tools.isblank(groupid)) {
            PdDPatientDocumentRecordExample example = new PdDPatientDocumentRecordExample();
            PdDPatientDocumentRecordExample.Criteria criteria = example.createCriteria();
            criteria.andDelFlagEqualTo("0");
            criteria.andPidEqualTo(pid);
            criteria.andZlzidEqualTo(groupid);
            list = patientDocumentRecordMapper.selectByExample(example);
        } else {
            list = new ArrayList<>();
        }

        JSONObject jsonObject = new JSONObject();

        JSONArray initialPreview = new JSONArray();
        JSONArray initialPreviewConfig = new JSONArray();

        for (PdDPatientDocumentRecord pdDPatientDocumentRecord : list) {
            initialPreview.add(pdDPatientDocumentRecord.getZlwz());

            JSONObject initialPrev = new JSONObject();
            initialPrev.put("type", pdDPatientDocumentRecord.getType());
            initialPrev.put("caption", pdDPatientDocumentRecord.getZlm());
            initialPrev.put("size", pdDPatientDocumentRecord.getSize());
            initialPrev.put("url", request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                    + request.getContextPath() + "/uploadfile/deletefile");
            initialPrev.put("key", pdDPatientDocumentRecord.getId());
            initialPreviewConfig.add(initialPrev);
        }
        jsonObject.put("initialPreview", initialPreview);
        jsonObject.put("initialPreviewConfig", initialPreviewConfig);
        result.setData(jsonObject);
        return result;
    }
}
