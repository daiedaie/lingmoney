package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class UsersMessage implements Serializable {
    /**
     * 主键
     * 表字段 : users_message.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : users_message.u_id
     */
    private String uId;

    /**
     * 消息主题
     * 表字段 : users_message.topic
     */
    private String topic;

    /**
     * 发送人
     * 表字段 : users_message.sender
     */
    private String sender;

    /**
     * 发送时间
     * 表字段 : users_message.time
     */
    private Date time;

    /**
     * 阅读状态:0,未读;1,已读
     * 表字段 : users_message.status
     */
    private Integer status;

    /**
     * 
     * 表字段 : users_message.admin_message_id
     */
    private Integer adminMessageId;

    /**
     * 消息内容
     * 表字段 : users_message.content
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_message
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:users_message.id
     *
     * @return users_message.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:users_message.id
     *
     * @param id the value for users_message.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:users_message.u_id
     *
     * @return users_message.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:users_message.u_id
     *
     * @param uId the value for users_message.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 消息主题 字段:users_message.topic
     *
     * @return users_message.topic, 消息主题
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 设置 消息主题 字段:users_message.topic
     *
     * @param topic the value for users_message.topic, 消息主题
     */
    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    /**
     * 获取 发送人 字段:users_message.sender
     *
     * @return users_message.sender, 发送人
     */
    public String getSender() {
        return sender;
    }

    /**
     * 设置 发送人 字段:users_message.sender
     *
     * @param sender the value for users_message.sender, 发送人
     */
    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    /**
     * 获取 发送时间 字段:users_message.time
     *
     * @return users_message.time, 发送时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置 发送时间 字段:users_message.time
     *
     * @param time the value for users_message.time, 发送时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取 阅读状态:0,未读;1,已读 字段:users_message.status
     *
     * @return users_message.status, 阅读状态:0,未读;1,已读
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 阅读状态:0,未读;1,已读 字段:users_message.status
     *
     * @param status the value for users_message.status, 阅读状态:0,未读;1,已读
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:users_message.admin_message_id
     *
     * @return users_message.admin_message_id, 
     */
    public Integer getAdminMessageId() {
        return adminMessageId;
    }

    /**
     * 设置  字段:users_message.admin_message_id
     *
     * @param adminMessageId the value for users_message.admin_message_id, 
     */
    public void setAdminMessageId(Integer adminMessageId) {
        this.adminMessageId = adminMessageId;
    }

    /**
     * 获取 消息内容 字段:users_message.content
     *
     * @return users_message.content, 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 消息内容 字段:users_message.content
     *
     * @param content the value for users_message.content, 消息内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ,users_message
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", topic=").append(topic);
        sb.append(", sender=").append(sender);
        sb.append(", time=").append(time);
        sb.append(", status=").append(status);
        sb.append(", adminMessageId=").append(adminMessageId);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}