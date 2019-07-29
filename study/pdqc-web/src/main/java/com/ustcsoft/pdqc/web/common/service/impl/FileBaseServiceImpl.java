//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.service.impl;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

import com.ustcsoft.pdqc.web.common.service.FileService;


/**
 * @author kxiong
 *
 */
public class FileBaseServiceImpl implements FileService {

    @Override
    public void saveFile(MultipartFile file, String filePath) throws Exception {
        if (file == null) {
            return;
        }
        File localFile = new File(filePath);
        if (!localFile.exists() && !localFile.isDirectory()) {
            // 创建目录
            localFile.mkdirs();
        }
        file.transferTo(localFile);
    }
}
