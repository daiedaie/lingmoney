package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {
    /**
     * 
     * 表字段 : notice.id
     */
    private Integer id;

    /**
     * 状态
     * 表字段 : notice.status
     */
    private Integer status;

    /**
     * 创建时间
     * 表字段 : notice.ct_dt
     */
    private Date ctDt;

    /**
     * 发布时间
     * 表字段 : notice.p_dt
     */
    private Date pDt;

    /**
     * 产品公告
     * 表字段 : notice.content
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notice
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:notice.id
     *
     * @return notice.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:notice.id
     *
     * @param id the value for notice.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 状态 字段:notice.status
     *
     * @return notice.status, 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态 字段:notice.status
     *
     * @param status the value for notice.status, 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 创建时间 字段:notice.ct_dt
     *
     * @return notice.ct_dt, 创建时间
     */
    public Date getCtDt() {
        return ctDt;
    }

    /**
     * 设置 创建时间 字段:notice.ct_dt
     *
     * @param ctDt the value for notice.ct_dt, 创建时间
     */
    public void setCtDt(Date ctDt) {
        this.ctDt = ctDt;
    }

    /**
     * 获取 发布时间 字段:notice.p_dt
     *
     * @return notice.p_dt, 发布时间
     */
    public Date getpDt() {
        return pDt;
    }

    /**
     * 设置 发布时间 字段:notice.p_dt
     *
     * @param pDt the value for notice.p_dt, 发布时间
     */
    public void setpDt(Date pDt) {
        this.pDt = pDt;
    }

    /**
     * 获取 产品公告 字段:notice.content
     *
     * @return notice.content, 产品公告
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 产品公告 字段:notice.content
     *
     * @param content the value for notice.content, 产品公告
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ,notice
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", ctDt=").append(ctDt);
        sb.append(", pDt=").append(pDt);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}