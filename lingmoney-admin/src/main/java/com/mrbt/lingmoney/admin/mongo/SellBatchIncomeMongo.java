package com.mrbt.lingmoney.admin.mongo;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

/** 
 * @author  suyibo 
 * @date 创建时间：2017年12月19日
 */
@Document(collection = "sell_batch_income_mongo")
public class SellBatchIncomeMongo implements Serializable {

	/**
	 * 数据结构：sell_batch_income_mongo.id 数据id
	 */
	private String id;

	/**
	 * 数据结构：sell_batch_income_mongo.sell_date 兑付日期
	 */
	private Long sellDate;

	/**
	 * 数据结构：sell_batch_income_mongo.sell_money 兑付金额
	 */
	private BigDecimal sellMoney;

	/**
	 * 数据结构：sell_batch_income_mongo.u_id 客户id
	 */
	private String uId;

	/**
	 * 数据结构：sell_batch_income_mongo.username 客户姓名
	 */
	private String username;

	/**
	 * 数据结构：sell_batch_income_mongo.phone_number 客户电话
	 */
	private String phoneNumber;

	/**
	 * 数据结构：sell_batch_income_mongo.order_name 理财经理
	 */
	private String orderName;

	/**
	 * 数据结构：sell_batch_income_mongo.order_phone 理财经理电话
	 */
	private String orderPhone;

	/**
	 * 数据结构：sell_batch_income_mongo.order_org 理财经理所属部门
	 */
	private String orderOrg;

	/**
	 * 数据结构：sell_batch_income_mongo.order_company 理财经理所属分公司
	 */
	private String orderCompany;

	/**
	 * 数据结构：sell_batch_income_mongo.one_money 第一天回签金额
	 */
	private BigDecimal oneMoney;

	/**
	 * 数据结构：sell_batch_income_mongo.two_money 第二天回签金额
	 */
	private BigDecimal twoMoney;

	/**
	 * 数据结构：sell_batch_income_mongo.three_money 第三天回签金额
	 */
	private BigDecimal threeMoney;

	/**
	 * 数据结构：sell_batch_income_mongo.four_money 第四天回签金额
	 */
	private BigDecimal fourMoney;

	/**
	 * 数据结构：sell_batch_income_mongo.five_money 第五天回签金额
	 */
	private BigDecimal fiveMoney;

	/**
	 * 数据结构：sell_batch_income_mongo.income_date 回签日期（最后一笔回签的日期）
	 */
	private String incomeDate;
	
	/**
	 * 数据结构：sell_batch_income_mongo.changeMoney 金额变化
	 */
	private BigDecimal changeMoney;
	
	/**
	 * 数据结构：sell_batch_income_mongo.incomeEfficiency 回签率
	 */
	private BigDecimal incomeEfficiency;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table syn_user_data
	 *
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getSellDate() {
		return sellDate;
	}

	public void setSellDate(Long sellDate) {
		this.sellDate = sellDate;
	}

	public BigDecimal getSellMoney() {
		return sellMoney;
	}

	public void setSellMoney(BigDecimal sellMoney) {
		this.sellMoney = sellMoney;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public String getOrderOrg() {
		return orderOrg;
	}

	public void setOrderOrg(String orderOrg) {
		this.orderOrg = orderOrg;
	}

	public String getOrderCompany() {
		return orderCompany;
	}

	public void setOrderCompany(String orderCompany) {
		this.orderCompany = orderCompany;
	}

	public BigDecimal getOneMoney() {
		return oneMoney;
	}

	public void setOneMoney(BigDecimal oneMoney) {
		this.oneMoney = oneMoney;
	}

	public BigDecimal getTwoMoney() {
		return twoMoney;
	}

	public void setTwoMoney(BigDecimal twoMoney) {
		this.twoMoney = twoMoney;
	}

	public BigDecimal getThreeMoney() {
		return threeMoney;
	}

	public void setThreeMoney(BigDecimal threeMoney) {
		this.threeMoney = threeMoney;
	}

	public BigDecimal getFourMoney() {
		return fourMoney;
	}

	public void setFourMoney(BigDecimal fourMoney) {
		this.fourMoney = fourMoney;
	}

	public BigDecimal getFiveMoney() {
		return fiveMoney;
	}

	public void setFiveMoney(BigDecimal fiveMoney) {
		this.fiveMoney = fiveMoney;
	}

	public String getIncomeDate() {
		return incomeDate;
	}

	public void setIncomeDate(String incomeDate) {
		this.incomeDate = incomeDate;
	}

	public BigDecimal getChangeMoney() {
		return changeMoney;
	}

	public void setChangeMoney(BigDecimal changeMoney) {
		this.changeMoney = changeMoney;
	}

	public BigDecimal getIncomeEfficiency() {
		return incomeEfficiency;
	}

	public void setIncomeEfficiency(BigDecimal incomeEfficiency) {
		this.incomeEfficiency = incomeEfficiency;
	}

}
