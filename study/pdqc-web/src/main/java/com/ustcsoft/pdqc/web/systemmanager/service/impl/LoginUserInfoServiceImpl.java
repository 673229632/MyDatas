package com.ustcsoft.pdqc.web.systemmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonReturn;
import com.ustcsoft.pdqc.core.autogen.dao.PdMUserMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserKey;
import com.ustcsoft.pdqc.web.common.service.impl.WebBaseServiceImpl;
import com.ustcsoft.pdqc.web.common.util.Tools;
import com.ustcsoft.pdqc.web.systemmanager.form.LoginUserInfoCondForm;
import com.ustcsoft.pdqc.web.systemmanager.service.LoginUserInfoService;

@Service
public class LoginUserInfoServiceImpl extends WebBaseServiceImpl implements LoginUserInfoService{
	
	@Autowired
	private PdMUserMapper pdMUserMapper;
	
	@Override
	public JacksonReturn changgeSkinCss(LoginUserInfoCondForm condition) {
		JacksonReturn returnJson = new JacksonReturn();
        if (!Tools.isblank(condition.getSkincss())) {
            this.getLoginUser().setSkincss(condition.getSkincss());
        } else {
            return returnJson;
        }
        PdMUserKey key = new PdMUserKey();
        key.setUserNo(this.getLoginUser().getUserNo());
        PdMUser mUser = this.pdMUserMapper.selectByPrimaryKey(key);
        mUser.setSkincss(condition.getSkincss());
        this.pdMUserMapper.updateByPrimaryKey(mUser);
		return returnJson;
	}

}
