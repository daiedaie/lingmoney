package com.mrbt.lingmoney.model;

import java.util.ArrayList;
import java.util.List;

public class SellAutoReturnExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sell_auto_return
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sell_auto_return
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sell_auto_return
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sell_auto_return
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sell_auto_return
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,sell_auto_return
     */
    public SellAutoReturnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,sell_auto_return
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,sell_auto_return
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,sell_auto_return
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,sell_auto_return
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,sell_auto_return
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,sell_auto_return
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,sell_auto_return
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,sell_auto_return
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,sell_auto_return
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,sell_auto_return
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,sell_auto_return
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,sell_auto_return
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,sell_auto_return
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,sell_auto_return
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：sell_auto_return
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFinancingIdIsNull() {
            addCriterion("financing_id is null");
            return (Criteria) this;
        }

        public Criteria andFinancingIdIsNotNull() {
            addCriterion("financing_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingIdEqualTo(Integer value) {
            addCriterion("financing_id =", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdNotEqualTo(Integer value) {
            addCriterion("financing_id <>", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdGreaterThan(Integer value) {
            addCriterion("financing_id >", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("financing_id >=", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdLessThan(Integer value) {
            addCriterion("financing_id <", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdLessThanOrEqualTo(Integer value) {
            addCriterion("financing_id <=", value, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdIn(List<Integer> values) {
            addCriterion("financing_id in", values, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdNotIn(List<Integer> values) {
            addCriterion("financing_id not in", values, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdBetween(Integer value1, Integer value2) {
            addCriterion("financing_id between", value1, value2, "financingId");
            return (Criteria) this;
        }

        public Criteria andFinancingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("financing_id not between", value1, value2, "financingId");
            return (Criteria) this;
        }

        public Criteria andPCodeIsNull() {
            addCriterion("p_code is null");
            return (Criteria) this;
        }

        public Criteria andPCodeIsNotNull() {
            addCriterion("p_code is not null");
            return (Criteria) this;
        }

        public Criteria andPCodeEqualTo(String value) {
            addCriterion("p_code =", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotEqualTo(String value) {
            addCriterion("p_code <>", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeGreaterThan(String value) {
            addCriterion("p_code >", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeGreaterThanOrEqualTo(String value) {
            addCriterion("p_code >=", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeLessThan(String value) {
            addCriterion("p_code <", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeLessThanOrEqualTo(String value) {
            addCriterion("p_code <=", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeLike(String value) {
            addCriterion("p_code like", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotLike(String value) {
            addCriterion("p_code not like", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeIn(List<String> values) {
            addCriterion("p_code in", values, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotIn(List<String> values) {
            addCriterion("p_code not in", values, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeBetween(String value1, String value2) {
            addCriterion("p_code between", value1, value2, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotBetween(String value1, String value2) {
            addCriterion("p_code not between", value1, value2, "pCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：sell_auto_return
     *
     * @mbg.generated
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：sell_auto_return
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