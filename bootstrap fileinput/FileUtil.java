//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.newweb.upload;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ustcsoft.marsfw.spring.util.ConfigUtil;
import com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDocumentRecordMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDocumentRecord;
import com.ustcsoft.pdqc.web.common.util.DateUtil;
import com.ustcsoft.pdqc.web.common.util.Tools;

/**
 * 
 * @author zhangrui.i
 * @since 2018年12月14日 上午11:05:22
 */
@Service
public class FileUtil {

    @Autowired
    PdDPatientDocumentRecordMapper patientDocumentRecordMapper;

    /**
     * 上传图片 原名称
     * 
     * @param request 请求
     * @param path_deposit 存放位置(路径)
     * @param file 文件
     * @param isRandomName 是否随机名称
     * @return 完整文件路径
     */
    public String uploadImage(String pid, String groupid, HttpServletRequest request, String path_deposit,
            MultipartFile file, boolean isRandomName) {
        // 上传
        try {
            // String[] typeImg = { "jpg", "gif", "png", "doc", "docx", "pdf", "ppt", "pptx", "txt" };

            if (file != null) {
                String origName = file.getOriginalFilename();// 文件原名称
                System.out.println("上传的文件原名称:" + origName);
                // 判断文件类型
                String type = origName.indexOf(".") != -1
                        ? origName.substring(origName.lastIndexOf(".") + 1, origName.length()) : null;
                if (type != null) {
                    boolean booIsType = true;
                    /*
                     * for (int i = 0; i < typeImg.length; i++) { if (typeImg[i].equals(type.toLowerCase())) { booIsType
                     * = true; } }
                     */
                    // 类型正确
                    if (booIsType) {
                        // 存放图片文件的路径
                        // String path = request.getSession().getServletContext().getRealPath(path_deposit);
                        // String path = "D:\\FileResources\\" + path_deposit;
                        @SuppressWarnings("deprecation")
                        String path = ConfigUtil.getProperty("UPLOAD_ROOTPATH", System.getProperty("java.io.tmpdir"))
                                + path_deposit;
                        System.out.println("存放图片文件的路径:" + path);

                        // 组合名称
                        String fileSrc = "";
                        String newname = "";
                        // 是否随机名称
                        if (isRandomName) {
                            newname = DateUtil.formatDate(new Date(), "yyyy-MM-dd-") + UUID.randomUUID().toString()
                                    + origName.substring(origName.lastIndexOf("."));
                        }
                        // 判断是否存在目录
                        File targetFile = new File(path, newname);
                        if (!targetFile.exists()) {
                            targetFile.mkdirs();// 创建目录
                        }
                        // 上传
                        file.transferTo(targetFile);
                        // 完整路径
                        fileSrc = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                                + request.getContextPath() + path_deposit + "//" + newname;
                        PdDPatientDocumentRecord record = new PdDPatientDocumentRecord();
                        record.setId(Tools.getFifteenUUID());
                        record.setPid(pid);
                        record.setZlzid(groupid);
                        // 资料名 zlm
                        record.setZlm(origName);
                        // 资料内部名 zlnbm
                        record.setZlnbm(newname);
                        // 资料位置 zlwz
                        record.setZlwz(fileSrc);
                        type = type.toLowerCase();
                        // 类型
                        record.setType(
                                (type.equals("jpg") || type.equals("png") || type.equals("gif")) ? "image" : "object");
                        // 文件大小
                        record.setSize((long) file.getSize());
                        // 真实路径
                        record.setPath(path);

                        record.setDelFlag("0");
                        record.setDateCreated(new Date());
                        record.setCreatedBy("ceshi");
                        record.setModifiedBy("ceshi");
                        record.setDateModified(new Date());
                        patientDocumentRecordMapper.insert(record);
                        System.out.println("图片上传成功:" + fileSrc);
                        return fileSrc;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void printJson(HttpServletResponse response, Object obj) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setContentType("text/json;charset=UTF-8");
        String temp = "";

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        if (obj != null) {
            temp = gson.toJson(obj);
        }
        try {
            response.getWriter().print(temp);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除单个文件
     *
     * @param fileName 要删除的文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public static String deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                return "删除单个文件" + fileName + "成功！";
            } else {
                return "删除单个文件" + fileName + "失败！";
            }
        } else {
            return "删除单个文件失败：" + fileName + "不存在！";
        }
    }
}
