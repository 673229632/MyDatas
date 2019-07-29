package com.ustcsoft.pdqc.web.centermanagement.service;

import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;

/**
 * 
 * @author zhouqichao
 *
 */

@Service
public interface CenterManagementService {
	

	
	//获取透析中心信息
	PdDCenter getPdDCenter();
	//编辑透析中心信息
	JacksonCountReturn addOrEdit(PdDCenter condition);


}
