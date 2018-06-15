package com.mrbt.lingmoney.model.webView;
import java.io.Serializable;
/**
 *@author syb
 *@date 2017年5月8日 上午9:49:51
 *@version 1.0
 *@description 
 **/
import java.math.BigDecimal;
import java.util.Date;

import com.mrbt.lingmoney.model.ProductRecommend;

public class ProductView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1842007244890237002L;
	private Integer pModel;
	private Integer pType;
	private String cityCode;
	
	/**
	 * 加息率 表字段 : product.add_yield
	 */
	private BigDecimal addYield;

	/**
	 * 是否可债权转让 0：不可转让 1：可转让
	 */
	private Integer isDebt;

	public BigDecimal getAddYield() {
		return addYield;
	}

	public void setAddYield(BigDecimal addYield) {
		this.addYield = addYield;
	}

	public Integer getIsDebt() {
		return isDebt;
	}

	public void setIsDebt(Integer isDebt) {
		this.isDebt = isDebt;
	}

	/**
	 * 产品增值0：无 1：有
	 */
	private Integer insuranceTrust;
	
	
	/**
	 * @return the insuranceTrust
	 */
	public Integer getInsuranceTrust() {
		return insuranceTrust;
	}

	/**
	 * @param insuranceTrust the insuranceTrust to set
	 */
	public void setInsuranceTrust(Integer insuranceTrust) {
		this.insuranceTrust = insuranceTrust;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Integer getpType() {
		return pType;
	}

	public void setpType(Integer pType) {
		this.pType = pType;
	}

	private BigDecimal costValue;

	public BigDecimal getCostValue() {
		return costValue;
	}

	public void setCostValue(BigDecimal costValue) {
		this.costValue = costValue;
	}

	public Integer getpModel() {
		return pModel;
	}

	public void setpModel(Integer pModel) {
		this.pModel = pModel;
	}

	ProductRecommend productRecommend;

	public ProductRecommend getProductRecommend() {
		return productRecommend;
	}

	public void setProductRecommend(ProductRecommend productRecommend) {
		this.productRecommend = productRecommend;
	}

	private String pictrueUrl;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.pictrue_url
	 *
	 * @return the value of product.pictrue_url
	 *
	 * @mbggenerated Wed Sep 23 09:28:27 CST 2015
	 */
	public String getPictrueUrl() {
		return pictrueUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.pictrue_url
	 *
	 * @param pictrueUrl
	 *            the value for product.pictrue_url
	 *
	 * @mbggenerated Wed Sep 23 09:28:27 CST 2015
	 */
	public void setPictrueUrl(String pictrueUrl) {
		this.pictrueUrl = pictrueUrl;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.id
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.code
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private String code;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.name
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.re_way
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private String reWay;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.rule
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer rule;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.st_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Date stDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.ed_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Date edDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.prior_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal priorMoney;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.reach_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal reachMoney;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.approval
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer approval;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.status
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer status;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.pc_id
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer pcId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.pc_name
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private String pcName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.tags
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private String tags;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.l_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer lTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.h_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer hTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.f_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer fTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.unit_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer unitTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.value_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Date valueDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.establish_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Date establishDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.wait_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal waitRate;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.min_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer minMoney;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.increa_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer increaMoney;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.l_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal lYield;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.h_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal hYield;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.f_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal fYield;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.fees
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer fees;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.fees_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal feesRate;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.exception_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private BigDecimal exceptionRate;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.fix_invest
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer fixInvest;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.allocation
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer allocation;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.activity
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer activity;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.platform_user_no
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private Integer platformUserNo;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column product.description
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.id
	 *
	 * @return the value of product.id
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.id
	 *
	 * @param id
	 *            the value for product.id
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.code
	 *
	 * @return the value of product.code
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.code
	 *
	 * @param code
	 *            the value for product.code
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.name
	 *
	 * @return the value of product.name
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.name
	 *
	 * @param name
	 *            the value for product.name
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.re_way
	 *
	 * @return the value of product.re_way
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public String getReWay() {
		return reWay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.re_way
	 *
	 * @param reWay
	 *            the value for product.re_way
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setReWay(String reWay) {
		this.reWay = reWay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.rule
	 *
	 * @return the value of product.rule
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getRule() {
		return rule;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.rule
	 *
	 * @param rule
	 *            the value for product.rule
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setRule(Integer rule) {
		this.rule = rule;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.st_dt
	 *
	 * @return the value of product.st_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Date getStDt() {
		return stDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.st_dt
	 *
	 * @param stDt
	 *            the value for product.st_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setStDt(Date stDt) {
		this.stDt = stDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.ed_dt
	 *
	 * @return the value of product.ed_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Date getEdDt() {
		return edDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.ed_dt
	 *
	 * @param edDt
	 *            the value for product.ed_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setEdDt(Date edDt) {
		this.edDt = edDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.prior_money
	 *
	 * @return the value of product.prior_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal getPriorMoney() {
		return priorMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.prior_money
	 *
	 * @param priorMoney
	 *            the value for product.prior_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setPriorMoney(BigDecimal priorMoney) {
		this.priorMoney = priorMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.reach_money
	 *
	 * @return the value of product.reach_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal getReachMoney() {
		return reachMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.reach_money
	 *
	 * @param reachMoney
	 *            the value for product.reach_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setReachMoney(BigDecimal reachMoney) {
		this.reachMoney = reachMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.approval
	 *
	 * @return the value of product.approval
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getApproval() {
		return approval;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.approval
	 *
	 * @param approval
	 *            the value for product.approval
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setApproval(Integer approval) {
		this.approval = approval;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.status
	 *
	 * @return the value of product.status
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.status
	 *
	 * @param status
	 *            the value for product.status
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.pc_id
	 *
	 * @return the value of product.pc_id
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getPcId() {
		return pcId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.pc_id
	 *
	 * @param pcId
	 *            the value for product.pc_id
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.pc_name
	 *
	 * @return the value of product.pc_name
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public String getPcName() {
		return pcName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.pc_name
	 *
	 * @param pcName
	 *            the value for product.pc_name
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.tags
	 *
	 * @return the value of product.tags
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.tags
	 *
	 * @param tags
	 *            the value for product.tags
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.l_time
	 *
	 * @return the value of product.l_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getlTime() {
		return lTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.l_time
	 *
	 * @param lTime
	 *            the value for product.l_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setlTime(Integer lTime) {
		this.lTime = lTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.h_time
	 *
	 * @return the value of product.h_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer gethTime() {
		return hTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.h_time
	 *
	 * @param hTime
	 *            the value for product.h_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void sethTime(Integer hTime) {
		this.hTime = hTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.f_time
	 *
	 * @return the value of product.f_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getfTime() {
		return fTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.f_time
	 *
	 * @param fTime
	 *            the value for product.f_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setfTime(Integer fTime) {
		this.fTime = fTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.unit_time
	 *
	 * @return the value of product.unit_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getUnitTime() {
		return unitTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.unit_time
	 *
	 * @param unitTime
	 *            the value for product.unit_time
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setUnitTime(Integer unitTime) {
		this.unitTime = unitTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.value_dt
	 *
	 * @return the value of product.value_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Date getValueDt() {
		return valueDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.value_dt
	 *
	 * @param valueDt
	 *            the value for product.value_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setValueDt(Date valueDt) {
		this.valueDt = valueDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.establish_dt
	 *
	 * @return the value of product.establish_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Date getEstablishDt() {
		return establishDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.establish_dt
	 *
	 * @param establishDt
	 *            the value for product.establish_dt
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setEstablishDt(Date establishDt) {
		this.establishDt = establishDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.wait_rate
	 *
	 * @return the value of product.wait_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal getWaitRate() {
		return waitRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.wait_rate
	 *
	 * @param waitRate
	 *            the value for product.wait_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setWaitRate(BigDecimal waitRate) {
		this.waitRate = waitRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.min_money
	 *
	 * @return the value of product.min_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getMinMoney() {
		return minMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.min_money
	 *
	 * @param minMoney
	 *            the value for product.min_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setMinMoney(Integer minMoney) {
		this.minMoney = minMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.increa_money
	 *
	 * @return the value of product.increa_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getIncreaMoney() {
		return increaMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.increa_money
	 *
	 * @param increaMoney
	 *            the value for product.increa_money
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setIncreaMoney(Integer increaMoney) {
		this.increaMoney = increaMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.l_yield
	 *
	 * @return the value of product.l_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal getlYield() {
		return lYield;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.l_yield
	 *
	 * @param lYield
	 *            the value for product.l_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setlYield(BigDecimal lYield) {
		this.lYield = lYield;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.h_yield
	 *
	 * @return the value of product.h_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal gethYield() {
		return hYield;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.h_yield
	 *
	 * @param hYield
	 *            the value for product.h_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void sethYield(BigDecimal hYield) {
		this.hYield = hYield;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.f_yield
	 *
	 * @return the value of product.f_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal getfYield() {
		return fYield;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.f_yield
	 *
	 * @param fYield
	 *            the value for product.f_yield
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setfYield(BigDecimal fYield) {
		this.fYield = fYield;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.fees
	 *
	 * @return the value of product.fees
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getFees() {
		return fees;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.fees
	 *
	 * @param fees
	 *            the value for product.fees
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setFees(Integer fees) {
		this.fees = fees;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.fees_rate
	 *
	 * @return the value of product.fees_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal getFeesRate() {
		return feesRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.fees_rate
	 *
	 * @param feesRate
	 *            the value for product.fees_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setFeesRate(BigDecimal feesRate) {
		this.feesRate = feesRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.exception_rate
	 *
	 * @return the value of product.exception_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public BigDecimal getExceptionRate() {
		return exceptionRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.exception_rate
	 *
	 * @param exceptionRate
	 *            the value for product.exception_rate
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setExceptionRate(BigDecimal exceptionRate) {
		this.exceptionRate = exceptionRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.fix_invest
	 *
	 * @return the value of product.fix_invest
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getFixInvest() {
		return fixInvest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.fix_invest
	 *
	 * @param fixInvest
	 *            the value for product.fix_invest
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setFixInvest(Integer fixInvest) {
		this.fixInvest = fixInvest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.allocation
	 *
	 * @return the value of product.allocation
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getAllocation() {
		return allocation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.allocation
	 *
	 * @param allocation
	 *            the value for product.allocation
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setAllocation(Integer allocation) {
		this.allocation = allocation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.activity
	 *
	 * @return the value of product.activity
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getActivity() {
		return activity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.activity
	 *
	 * @param activity
	 *            the value for product.activity
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setActivity(Integer activity) {
		this.activity = activity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.platform_user_no
	 *
	 * @return the value of product.platform_user_no
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public Integer getPlatformUserNo() {
		return platformUserNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.platform_user_no
	 *
	 * @param platformUserNo
	 *            the value for product.platform_user_no
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setPlatformUserNo(Integer platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column product.description
	 *
	 * @return the value of product.description
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column product.description
	 *
	 * @param description
	 *            the value for product.description
	 *
	 * @mbggenerated Mon Jul 27 15:37:41 CST 2015
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	private String introduction;

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	private BigDecimal buyLimit;

	public BigDecimal getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(BigDecimal buyLimit) {
		this.buyLimit = buyLimit;
	}
	
	
	
}