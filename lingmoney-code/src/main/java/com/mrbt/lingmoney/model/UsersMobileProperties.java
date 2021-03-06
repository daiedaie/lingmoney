package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class UsersMobileProperties implements Serializable {
    /**
     * 用户id 关联user表
     * 表字段 : users_mobile_properties.u_id
     */
    private String uId;

    /**
     * 
     * 表字段 : users_mobile_properties.gesture_pwd
     */
    private String gesturePwd;

    /**
     * 
     * 表字段 : users_mobile_properties.is_use_gesture
     */
    private Integer isUseGesture;

    /**
     * 
     * 表字段 : users_mobile_properties.is_use_push
     */
    private Integer isUsePush;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_mobile_properties
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 用户id 关联user表 字段:users_mobile_properties.u_id
     *
     * @return users_mobile_properties.u_id, 用户id 关联user表
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置 用户id 关联user表 字段:users_mobile_properties.u_id
     *
     * @param uId the value for users_mobile_properties.u_id, 用户id 关联user表
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取  字段:users_mobile_properties.gesture_pwd
     *
     * @return users_mobile_properties.gesture_pwd, 
     */
    public String getGesturePwd() {
        return gesturePwd;
    }

    /**
     * 设置  字段:users_mobile_properties.gesture_pwd
     *
     * @param gesturePwd the value for users_mobile_properties.gesture_pwd, 
     */
    public void setGesturePwd(String gesturePwd) {
        this.gesturePwd = gesturePwd == null ? null : gesturePwd.trim();
    }

    /**
     * 获取  字段:users_mobile_properties.is_use_gesture
     *
     * @return users_mobile_properties.is_use_gesture, 
     */
    public Integer getIsUseGesture() {
        return isUseGesture;
    }

    /**
     * 设置  字段:users_mobile_properties.is_use_gesture
     *
     * @param isUseGesture the value for users_mobile_properties.is_use_gesture, 
     */
    public void setIsUseGesture(Integer isUseGesture) {
        this.isUseGesture = isUseGesture;
    }

    /**
     * 获取  字段:users_mobile_properties.is_use_push
     *
     * @return users_mobile_properties.is_use_push, 
     */
    public Integer getIsUsePush() {
        return isUsePush;
    }

    /**
     * 设置  字段:users_mobile_properties.is_use_push
     *
     * @param isUsePush the value for users_mobile_properties.is_use_push, 
     */
    public void setIsUsePush(Integer isUsePush) {
        this.isUsePush = isUsePush;
    }

    /**
     * ,users_mobile_properties
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", gesturePwd=").append(gesturePwd);
        sb.append(", isUseGesture=").append(isUseGesture);
        sb.append(", isUsePush=").append(isUsePush);
        sb.append("]");
        return sb.toString();
    }
}