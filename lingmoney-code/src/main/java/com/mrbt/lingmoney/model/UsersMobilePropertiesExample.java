package com.mrbt.lingmoney.model;

import java.util.ArrayList;
import java.util.List;

public class UsersMobilePropertiesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_mobile_properties
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_mobile_properties
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_mobile_properties
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_mobile_properties
     *
     * @mbggenerated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_mobile_properties
     *
     * @mbggenerated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,users_mobile_properties
     */
    public UsersMobilePropertiesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,users_mobile_properties
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,users_mobile_properties
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,users_mobile_properties
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,users_mobile_properties
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,users_mobile_properties
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,users_mobile_properties
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,users_mobile_properties
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,users_mobile_properties
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,users_mobile_properties
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,users_mobile_properties
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,users_mobile_properties
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,users_mobile_properties
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,users_mobile_properties
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,users_mobile_properties
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：users_mobile_properties
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("u_id like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("u_id not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andGesturePwdIsNull() {
            addCriterion("gesture_pwd is null");
            return (Criteria) this;
        }

        public Criteria andGesturePwdIsNotNull() {
            addCriterion("gesture_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andGesturePwdEqualTo(String value) {
            addCriterion("gesture_pwd =", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotEqualTo(String value) {
            addCriterion("gesture_pwd <>", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdGreaterThan(String value) {
            addCriterion("gesture_pwd >", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdGreaterThanOrEqualTo(String value) {
            addCriterion("gesture_pwd >=", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdLessThan(String value) {
            addCriterion("gesture_pwd <", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdLessThanOrEqualTo(String value) {
            addCriterion("gesture_pwd <=", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdLike(String value) {
            addCriterion("gesture_pwd like", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotLike(String value) {
            addCriterion("gesture_pwd not like", value, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdIn(List<String> values) {
            addCriterion("gesture_pwd in", values, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotIn(List<String> values) {
            addCriterion("gesture_pwd not in", values, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdBetween(String value1, String value2) {
            addCriterion("gesture_pwd between", value1, value2, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andGesturePwdNotBetween(String value1, String value2) {
            addCriterion("gesture_pwd not between", value1, value2, "gesturePwd");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureIsNull() {
            addCriterion("is_use_gesture is null");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureIsNotNull() {
            addCriterion("is_use_gesture is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureEqualTo(Integer value) {
            addCriterion("is_use_gesture =", value, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureNotEqualTo(Integer value) {
            addCriterion("is_use_gesture <>", value, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureGreaterThan(Integer value) {
            addCriterion("is_use_gesture >", value, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use_gesture >=", value, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureLessThan(Integer value) {
            addCriterion("is_use_gesture <", value, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureLessThanOrEqualTo(Integer value) {
            addCriterion("is_use_gesture <=", value, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureIn(List<Integer> values) {
            addCriterion("is_use_gesture in", values, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureNotIn(List<Integer> values) {
            addCriterion("is_use_gesture not in", values, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureBetween(Integer value1, Integer value2) {
            addCriterion("is_use_gesture between", value1, value2, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUseGestureNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use_gesture not between", value1, value2, "isUseGesture");
            return (Criteria) this;
        }

        public Criteria andIsUsePushIsNull() {
            addCriterion("is_use_push is null");
            return (Criteria) this;
        }

        public Criteria andIsUsePushIsNotNull() {
            addCriterion("is_use_push is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsePushEqualTo(Integer value) {
            addCriterion("is_use_push =", value, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushNotEqualTo(Integer value) {
            addCriterion("is_use_push <>", value, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushGreaterThan(Integer value) {
            addCriterion("is_use_push >", value, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use_push >=", value, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushLessThan(Integer value) {
            addCriterion("is_use_push <", value, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushLessThanOrEqualTo(Integer value) {
            addCriterion("is_use_push <=", value, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushIn(List<Integer> values) {
            addCriterion("is_use_push in", values, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushNotIn(List<Integer> values) {
            addCriterion("is_use_push not in", values, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushBetween(Integer value1, Integer value2) {
            addCriterion("is_use_push between", value1, value2, "isUsePush");
            return (Criteria) this;
        }

        public Criteria andIsUsePushNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use_push not between", value1, value2, "isUsePush");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：users_mobile_properties
     *
     * @mbggenerated
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：users_mobile_properties
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}