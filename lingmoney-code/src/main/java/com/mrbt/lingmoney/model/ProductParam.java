package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class ProductParam implements Serializable {
    /**
     * 
     * 表字段 : product_param.id
     */
    private Integer id;

    /**
     * 父id
     * 表字段 : product_param.pid
     */
    private Integer pid;

    /**
     * 参数名称
     * 表字段 : product_param.name
     */
    private String name;

    /**
     * 描述信息
     * 表字段 : product_param.description
     */
    private String description;

    /**
     * 0不可删除,1可删除
     * 表字段 : product_param.status
     */
    private Integer status;

    /**
     * 节假日
     * 表字段 : product_param.holiday
     */
    private String holiday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_param
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:product_param.id
     *
     * @return product_param.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:product_param.id
     *
     * @param id the value for product_param.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 父id 字段:product_param.pid
     *
     * @return product_param.pid, 父id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置 父id 字段:product_param.pid
     *
     * @param pid the value for product_param.pid, 父id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取 参数名称 字段:product_param.name
     *
     * @return product_param.name, 参数名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 参数名称 字段:product_param.name
     *
     * @param name the value for product_param.name, 参数名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 描述信息 字段:product_param.description
     *
     * @return product_param.description, 描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 描述信息 字段:product_param.description
     *
     * @param description the value for product_param.description, 描述信息
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取 0不可删除,1可删除 字段:product_param.status
     *
     * @return product_param.status, 0不可删除,1可删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 0不可删除,1可删除 字段:product_param.status
     *
     * @param status the value for product_param.status, 0不可删除,1可删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 节假日 字段:product_param.holiday
     *
     * @return product_param.holiday, 节假日
     */
    public String getHoliday() {
        return holiday;
    }

    /**
     * 设置 节假日 字段:product_param.holiday
     *
     * @param holiday the value for product_param.holiday, 节假日
     */
    public void setHoliday(String holiday) {
        this.holiday = holiday == null ? null : holiday.trim();
    }

    /**
     * ,product_param
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", holiday=").append(holiday);
        sb.append("]");
        return sb.toString();
    }
}