package com.mrbt.lingmoney.admin.mongo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * mongo_syn_user_data
 * 
 * @author Administrator
 *
 */
@Document(collection = "mongo_syn_user_data")
public class MongoSynUserData implements Serializable {
	/**
	 * 
	 * 表字段 : syn_user_data.u_id
	 */
	private String uId;

	/**
	 * 姓名 表字段 : syn_user_data.name
	 */
	private String name;

	/**
	 * 注册日期 表字段 : syn_user_data.reg_date
	 */
	private Date regDate;

	/**
	 * 是否通过实名认证/是否开户:0，未通过；1，已通过 表字段 : syn_user_data.certification
	 */
	private Integer certification;

	/**
	 * 是否绑定银行卡:0，未绑定；1，已绑定 表字段 : syn_user_data.bank
	 */
	private Integer bank;

	/**
	 * 身份证号 表字段 : syn_user_data.id_card
	 */
	private String idCard;

	/**
	 * 推荐码 表字段 : syn_user_data.referral_code
	 */
	private String referralCode;

	/**
	 * 推荐人推荐码 表字段 : syn_user_data.referral_id
	 */
	private String referralId;

	/**
	 * 绑定手机(可用于登录) 表字段 : syn_user_data.telephone
	 */
	private String telephone;

	/**
	 * 数据同步到mongodb的实际
	 */
	private Long synDataTime;

	/**
	 * 推荐人推荐码
	 */
	private String recommenderIsCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table syn_user_data
	 *
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * uid
	 * @return	返回UID
	 */
	public String getuId() {
		return uId;
	}

	/**
	 * 设置uid
	 * @param uId uId
	 */
	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Integer getCertification() {
		return certification;
	}

	public void setCertification(Integer certification) {
		this.certification = certification;
	}

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getReferralId() {
		return referralId;
	}

	public void setReferralId(String referralId) {
		this.referralId = referralId;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getSynDataTime() {
		return synDataTime;
	}

	public void setSynDataTime(Long synDataTime) {
		this.synDataTime = synDataTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRecommenderIsCode() {
		return recommenderIsCode;
	}

	public void setRecommenderIsCode(String recommenderIsCode) {
		this.recommenderIsCode = recommenderIsCode;
	}
}