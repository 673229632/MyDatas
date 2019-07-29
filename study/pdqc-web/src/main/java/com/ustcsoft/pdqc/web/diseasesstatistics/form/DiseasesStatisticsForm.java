//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.diseasesstatistics.form;

import java.math.BigDecimal;

import com.ustcsoft.pdqc.web.common.form.WebBaseForm;

/**
 * 
 * @author liujian
 */
public class DiseasesStatisticsForm extends WebBaseForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hp_id;
	private BigDecimal count;
	private String infection_diseases;
	private BigDecimal count1;
	private BigDecimal count2;
	private BigDecimal count3;
	private BigDecimal count4;
	private BigDecimal count5;
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
	 * infection_diseases的GET方法.
	 *
	 * @return infection_diseases
	 */
	public String getInfection_diseases() {
		return infection_diseases;
	}
	/**
	 * infection_diseases的SET方法.
	 *
	 * @param infection_diseases infection_diseases
	 */
	public void setInfection_diseases(String infection_diseases) {
		this.infection_diseases = infection_diseases;
	}
	/**
	 * count1的GET方法.
	 *
	 * @return count1
	 */
	public BigDecimal getCount1() {
		return count1;
	}
	/**
	 * count1的SET方法.
	 *
	 * @param count1 count1
	 */
	public void setCount1(BigDecimal count1) {
		this.count1 = count1;
	}
	/**
	 * count2的GET方法.
	 *
	 * @return count2
	 */
	public BigDecimal getCount2() {
		return count2;
	}
	/**
	 * count2的SET方法.
	 *
	 * @param count2 count2
	 */
	public void setCount2(BigDecimal count2) {
		this.count2 = count2;
	}
	/**
	 * count3的GET方法.
	 *
	 * @return count3
	 */
	public BigDecimal getCount3() {
		return count3;
	}
	/**
	 * count3的SET方法.
	 *
	 * @param count3 count3
	 */
	public void setCount3(BigDecimal count3) {
		this.count3 = count3;
	}
	/**
	 * count4的GET方法.
	 *
	 * @return count4
	 */
	public BigDecimal getCount4() {
		return count4;
	}
	/**
	 * count4的SET方法.
	 *
	 * @param count4 count4
	 */
	public void setCount4(BigDecimal count4) {
		this.count4 = count4;
	}
	/**
	 * count5的GET方法.
	 *
	 * @return count5
	 */
	public BigDecimal getCount5() {
		return count5;
	}
	/**
	 * count5的SET方法.
	 *
	 * @param count5 count5
	 */
	public void setCount5(BigDecimal count5) {
		this.count5 = count5;
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
