package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class AccountFlow extends AccountFlowKey implements Serializable {
    /**
     * 交易id
     * 表字段 : account_flow.t_id
     */
    private Integer tId;

    /**
     * 操作金额
     * 表字段 : account_flow.money
     */
    private BigDecimal money;

    /**
     * 手续费
     * 表字段 : account_flow.fee
     */
    private BigDecimal fee;

    /**
     * 序列号
     * 表字段 : account_flow.number
     */
    private String number;

    /**
     * 0，处理中；1，已完成；2，处理失败,3notify回调成功
     * 表字段 : account_flow.status
     */
    private Integer status;

    /**
     * 描述
     * 表字段 : account_flow.note
     */
    private String note;

    /**
     * 0：充值，1：提现，2：理财，3：赎回, 4:奖励， 5:还款，6：放款
     * 表字段 : account_flow.type
     */
    private Integer type;

    /**
     * 可用余额
     * 表字段 : account_flow.balance
     */
    private BigDecimal balance;

    /**
     * 冻结金额
     * 表字段 : account_flow.frozen_money
     */
    private BigDecimal frozenMoney;

    /**
     * 操作平台。0：PC端；1：移动端。
     * 表字段 : account_flow.platform
     */
    private Integer platform;

    /**
     * 操作流水号。防止多端同时操作
     * 表字段 : account_flow.vision
     */
    private Integer vision;

    /**
     * 
     * 表字段 : account_flow.card_pan
     */
    private String cardPan;

	private Integer pType;

	public Integer getpType() {
		return pType;
	}

	public void setpType(Integer pType) {
		this.pType = pType;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table account_flow
	 *
	 * @mbg.generated
	 */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 交易id 字段:account_flow.t_id
     *
     * @return account_flow.t_id, 交易id
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * 设置 交易id 字段:account_flow.t_id
     *
     * @param tId the value for account_flow.t_id, 交易id
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * 获取 操作金额 字段:account_flow.money
     *
     * @return account_flow.money, 操作金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置 操作金额 字段:account_flow.money
     *
     * @param money the value for account_flow.money, 操作金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取 手续费 字段:account_flow.fee
     *
     * @return account_flow.fee, 手续费
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置 手续费 字段:account_flow.fee
     *
     * @param fee the value for account_flow.fee, 手续费
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取 序列号 字段:account_flow.number
     *
     * @return account_flow.number, 序列号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置 序列号 字段:account_flow.number
     *
     * @param number the value for account_flow.number, 序列号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 获取 0，处理中；1，已完成；2，处理失败,3notify回调成功 字段:account_flow.status
     *
     * @return account_flow.status, 0，处理中；1，已完成；2，处理失败,3notify回调成功
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 0，处理中；1，已完成；2，处理失败；3，撤标成功 字段:account_flow.status
     *
     * @param status the value for account_flow.status, 0，处理中；1，已完成；2，处理失败,3notify回调成功
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 描述 字段:account_flow.note
     *
     * @return account_flow.note, 描述
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置 描述 字段:account_flow.note
     *
     * @param note the value for account_flow.note, 描述
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 获取 0：充值，1：取现，2：理财，3：赎回 字段:account_flow.type
     *
     * @return account_flow.type, 0：充值，1：取现，2：理财，3：赎回
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置 0：充值，1：取现，2：理财，3：赎回 字段:account_flow.type
     *
     * @param type the value for account_flow.type, 0：充值，1：取现，2：理财，3：赎回
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取 可用余额 字段:account_flow.balance
     *
     * @return account_flow.balance, 可用余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置 可用余额 字段:account_flow.balance
     *
     * @param balance the value for account_flow.balance, 可用余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取 冻结金额 字段:account_flow.frozen_money
     *
     * @return account_flow.frozen_money, 冻结金额
     */
    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    /**
     * 设置 冻结金额 字段:account_flow.frozen_money
     *
     * @param frozenMoney the value for account_flow.frozen_money, 冻结金额
     */
    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    /**
     * 获取 操作平台。0：PC端；1：移动端。 字段:account_flow.platform
     *
     * @return account_flow.platform, 操作平台。0：PC端；1：移动端。
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * 设置 操作平台。0：PC端；1：移动端。 字段:account_flow.platform
     *
     * @param platform the value for account_flow.platform, 操作平台。0：PC端；1：移动端。
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * 获取 操作流水号。防止多端同时操作 字段:account_flow.vision
     *
     * @return account_flow.vision, 操作流水号。防止多端同时操作
     */
    public Integer getVision() {
        return vision;
    }

    /**
     * 设置 操作流水号。防止多端同时操作 字段:account_flow.vision
     *
     * @param vision the value for account_flow.vision, 操作流水号。防止多端同时操作
     */
    public void setVision(Integer vision) {
        this.vision = vision;
    }

    /**
     * 获取  字段:account_flow.card_pan
     *
     * @return account_flow.card_pan, 
     */
    public String getCardPan() {
        return cardPan;
    }

    /**
     * 设置  字段:account_flow.card_pan
     *
     * @param cardPan the value for account_flow.card_pan, 
     */
    public void setCardPan(String cardPan) {
        this.cardPan = cardPan == null ? null : cardPan.trim();
    }

    /**
     * ,account_flow
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", money=").append(money);
        sb.append(", fee=").append(fee);
        sb.append(", number=").append(number);
        sb.append(", status=").append(status);
        sb.append(", note=").append(note);
        sb.append(", type=").append(type);
        sb.append(", balance=").append(balance);
        sb.append(", frozenMoney=").append(frozenMoney);
        sb.append(", platform=").append(platform);
        sb.append(", vision=").append(vision);
        sb.append(", cardPan=").append(cardPan);
        sb.append("]");
        return sb.toString();
    }
}