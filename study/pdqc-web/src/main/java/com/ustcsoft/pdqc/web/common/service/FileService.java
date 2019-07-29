package com.ustcsoft.pdqc.web.common.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	/**
	 * 保存文件
	 * @param file
	 * @param filePath
	 * @throws Exception
	 */
	public void saveFile(MultipartFile file, String filePath) throws Exception;
}
