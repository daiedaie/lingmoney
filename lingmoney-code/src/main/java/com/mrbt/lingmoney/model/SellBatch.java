package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SellBatch implements Serializable {
    /**
     * 
     * 表字段 : sell_batch.id
     */
    private Integer id;

    /**
     * 批次号
     * 表字段 : sell_batch.batch
     */
    private String batch;

    /**
     * 状态，0导出，1导入，2还款中，3已完成
     * 表字段 : sell_batch.status
     */
    private Integer status;

    /**
     * 
     * 表字段 : sell_batch.sell_money
     */
    private BigDecimal sellMoney;

    /**
     * 
     * 表字段 : sell_batch.plat_money
     */
    private BigDecimal platMoney;

    /**
     * 
     * 表字段 : sell_batch.exp_path
     */
    private String expPath;

    /**
     * 导入excel的地址
     * 表字段 : sell_batch.imp_path
     */
    private String impPath;

    /**
     * 融资人平台id
     * 表字段 : sell_batch.financ_user
     */
    private String financUser;

    /**
     * 
     * 表字段 : sell_batch.real_sell_money
     */
    private BigDecimal realSellMoney;

    /**
     * 
     * 表字段 : sell_batch.real_plat_money
     */
    private BigDecimal realPlatMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sell_batch
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:sell_batch.id
     *
     * @return sell_batch.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:sell_batch.id
     *
     * @param id the value for sell_batch.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 批次号 字段:sell_batch.batch
     *
     * @return sell_batch.batch, 批次号
     */
    public String getBatch() {
        return batch;
    }

    /**
     * 设置 批次号 字段:sell_batch.batch
     *
     * @param batch the value for sell_batch.batch, 批次号
     */
    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    /**
     * 获取 状态，0导出，1导入，2还款中，3已完成 字段:sell_batch.status
     *
     * @return sell_batch.status, 状态，0导出，1导入，2还款中，3已完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态，0导出，1导入，2还款中，3已完成 字段:sell_batch.status
     *
     * @param status the value for sell_batch.status, 状态，0导出，1导入，2还款中，3已完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:sell_batch.sell_money
     *
     * @return sell_batch.sell_money, 
     */
    public BigDecimal getSellMoney() {
        return sellMoney;
    }

    /**
     * 设置  字段:sell_batch.sell_money
     *
     * @param sellMoney the value for sell_batch.sell_money, 
     */
    public void setSellMoney(BigDecimal sellMoney) {
        this.sellMoney = sellMoney;
    }

    /**
     * 获取  字段:sell_batch.plat_money
     *
     * @return sell_batch.plat_money, 
     */
    public BigDecimal getPlatMoney() {
        return platMoney;
    }

    /**
     * 设置  字段:sell_batch.plat_money
     *
     * @param platMoney the value for sell_batch.plat_money, 
     */
    public void setPlatMoney(BigDecimal platMoney) {
        this.platMoney = platMoney;
    }

    /**
     * 获取  字段:sell_batch.exp_path
     *
     * @return sell_batch.exp_path, 
     */
    public String getExpPath() {
        return expPath;
    }

    /**
     * 设置  字段:sell_batch.exp_path
     *
     * @param expPath the value for sell_batch.exp_path, 
     */
    public void setExpPath(String expPath) {
        this.expPath = expPath == null ? null : expPath.trim();
    }

    /**
     * 获取 导入excel的地址 字段:sell_batch.imp_path
     *
     * @return sell_batch.imp_path, 导入excel的地址
     */
    public String getImpPath() {
        return impPath;
    }

    /**
     * 设置 导入excel的地址 字段:sell_batch.imp_path
     *
     * @param impPath the value for sell_batch.imp_path, 导入excel的地址
     */
    public void setImpPath(String impPath) {
        this.impPath = impPath == null ? null : impPath.trim();
    }

    /**
     * 获取 融资人平台id 字段:sell_batch.financ_user
     *
     * @return sell_batch.financ_user, 融资人平台id
     */
    public String getFinancUser() {
        return financUser;
    }

    /**
     * 设置 融资人平台id 字段:sell_batch.financ_user
     *
     * @param financUser the value for sell_batch.financ_user, 融资人平台id
     */
    public void setFinancUser(String financUser) {
        this.financUser = financUser == null ? null : financUser.trim();
    }

    /**
     * 获取  字段:sell_batch.real_sell_money
     *
     * @return sell_batch.real_sell_money, 
     */
    public BigDecimal getRealSellMoney() {
        return realSellMoney;
    }

    /**
     * 设置  字段:sell_batch.real_sell_money
     *
     * @param realSellMoney the value for sell_batch.real_sell_money, 
     */
    public void setRealSellMoney(BigDecimal realSellMoney) {
        this.realSellMoney = realSellMoney;
    }

    /**
     * 获取  字段:sell_batch.real_plat_money
     *
     * @return sell_batch.real_plat_money, 
     */
    public BigDecimal getRealPlatMoney() {
        return realPlatMoney;
    }

    /**
     * 设置  字段:sell_batch.real_plat_money
     *
     * @param realPlatMoney the value for sell_batch.real_plat_money, 
     */
    public void setRealPlatMoney(BigDecimal realPlatMoney) {
        this.realPlatMoney = realPlatMoney;
    }

    /**
     * ,sell_batch
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", batch=").append(batch);
        sb.append(", status=").append(status);
        sb.append(", sellMoney=").append(sellMoney);
        sb.append(", platMoney=").append(platMoney);
        sb.append(", expPath=").append(expPath);
        sb.append(", impPath=").append(impPath);
        sb.append(", financUser=").append(financUser);
        sb.append(", realSellMoney=").append(realSellMoney);
        sb.append(", realPlatMoney=").append(realPlatMoney);
        sb.append("]");
        return sb.toString();
    }
}