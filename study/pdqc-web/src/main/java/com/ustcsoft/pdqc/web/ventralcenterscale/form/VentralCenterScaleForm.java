//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.ventralcenterscale.form;

import java.math.BigDecimal;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class VentralCenterScaleForm  extends WebBaseForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hp_id;
	private BigDecimal count;
	private String hospitalName;
	/**
	 * hp_id的GET方法.
	 *
	 * @return hp_id
	 */
	public String getHp_id() {
		return hp_id;
	}
	/**
	 * hp_id的SET方法.
	 *
	 * @param hp_id hp_id
	 */
	public void setHp_id(String hp_id) {
		this.hp_id = hp_id;
	}
	/**
	 * count的GET方法.
	 *
	 * @return count
	 */
	public BigDecimal getCount() {
		return count;
	}
	/**
	 * count的SET方法.
	 *
	 * @param count count
	 */
	public void setCount(BigDecimal count) {
		this.count = count;
	}
	/**
	 * hospitalName的GET方法.
	 *
	 * @return hospitalName
	 */
	public String getHospitalName() {
		return hospitalName;
	}
	/**
	 * hospitalName的SET方法.
	 *
	 * @param hospitalName hospitalName
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
}
