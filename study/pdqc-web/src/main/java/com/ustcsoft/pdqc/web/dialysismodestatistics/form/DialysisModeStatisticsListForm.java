//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.dialysismodestatistics.form;

import java.math.BigDecimal;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class DialysisModeStatisticsListForm extends WebBaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7440219977276920185L;
	
	private String hp_id;
	private BigDecimal capd;
	private BigDecimal apd;
	private BigDecimal ipd;
	private BigDecimal apdtpd;
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
	 * capd的GET方法.
	 *
	 * @return capd
	 */
	public BigDecimal getCapd() {
		return capd;
	}
	/**
	 * capd的SET方法.
	 *
	 * @param capd capd
	 */
	public void setCapd(BigDecimal capd) {
		this.capd = capd;
	}
	/**
	 * apd的GET方法.
	 *
	 * @return apd
	 */
	public BigDecimal getApd() {
		return apd;
	}
	/**
	 * apd的SET方法.
	 *
	 * @param apd apd
	 */
	public void setApd(BigDecimal apd) {
		this.apd = apd;
	}
	/**
	 * ipd的GET方法.
	 *
	 * @return ipd
	 */
	public BigDecimal getIpd() {
		return ipd;
	}
	/**
	 * ipd的SET方法.
	 *
	 * @param ipd ipd
	 */
	public void setIpd(BigDecimal ipd) {
		this.ipd = ipd;
	}
	/**
	 * apdtpd的GET方法.
	 *
	 * @return apdtpd
	 */
	public BigDecimal getApdtpd() {
		return apdtpd;
	}
	/**
	 * apdtpd的SET方法.
	 *
	 * @param apdtpd apdtpd
	 */
	public void setApdtpd(BigDecimal apdtpd) {
		this.apdtpd = apdtpd;
	}
	
}
