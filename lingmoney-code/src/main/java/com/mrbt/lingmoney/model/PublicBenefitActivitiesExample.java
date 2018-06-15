package com.mrbt.lingmoney.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PublicBenefitActivitiesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_benefit_activities
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_benefit_activities
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_benefit_activities
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_benefit_activities
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_benefit_activities
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,public_benefit_activities
     */
    public PublicBenefitActivitiesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,public_benefit_activities
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,public_benefit_activities
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,public_benefit_activities
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,public_benefit_activities
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,public_benefit_activities
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,public_benefit_activities
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,public_benefit_activities
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,public_benefit_activities
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,public_benefit_activities
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,public_benefit_activities
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,public_benefit_activities
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,public_benefit_activities
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,public_benefit_activities
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,public_benefit_activities
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：public_benefit_activities
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

        public Criteria andPbaDescIsNull() {
            addCriterion("pba_desc is null");
            return (Criteria) this;
        }

        public Criteria andPbaDescIsNotNull() {
            addCriterion("pba_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPbaDescEqualTo(String value) {
            addCriterion("pba_desc =", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescNotEqualTo(String value) {
            addCriterion("pba_desc <>", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescGreaterThan(String value) {
            addCriterion("pba_desc >", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescGreaterThanOrEqualTo(String value) {
            addCriterion("pba_desc >=", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescLessThan(String value) {
            addCriterion("pba_desc <", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescLessThanOrEqualTo(String value) {
            addCriterion("pba_desc <=", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescLike(String value) {
            addCriterion("pba_desc like", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescNotLike(String value) {
            addCriterion("pba_desc not like", value, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescIn(List<String> values) {
            addCriterion("pba_desc in", values, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescNotIn(List<String> values) {
            addCriterion("pba_desc not in", values, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescBetween(String value1, String value2) {
            addCriterion("pba_desc between", value1, value2, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaDescNotBetween(String value1, String value2) {
            addCriterion("pba_desc not between", value1, value2, "pbaDesc");
            return (Criteria) this;
        }

        public Criteria andPbaPictureIsNull() {
            addCriterion("pba_picture is null");
            return (Criteria) this;
        }

        public Criteria andPbaPictureIsNotNull() {
            addCriterion("pba_picture is not null");
            return (Criteria) this;
        }

        public Criteria andPbaPictureEqualTo(String value) {
            addCriterion("pba_picture =", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureNotEqualTo(String value) {
            addCriterion("pba_picture <>", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureGreaterThan(String value) {
            addCriterion("pba_picture >", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureGreaterThanOrEqualTo(String value) {
            addCriterion("pba_picture >=", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureLessThan(String value) {
            addCriterion("pba_picture <", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureLessThanOrEqualTo(String value) {
            addCriterion("pba_picture <=", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureLike(String value) {
            addCriterion("pba_picture like", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureNotLike(String value) {
            addCriterion("pba_picture not like", value, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureIn(List<String> values) {
            addCriterion("pba_picture in", values, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureNotIn(List<String> values) {
            addCriterion("pba_picture not in", values, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureBetween(String value1, String value2) {
            addCriterion("pba_picture between", value1, value2, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andPbaPictureNotBetween(String value1, String value2) {
            addCriterion("pba_picture not between", value1, value2, "pbaPicture");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseIsNull() {
            addCriterion("max_praise is null");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseIsNotNull() {
            addCriterion("max_praise is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseEqualTo(Integer value) {
            addCriterion("max_praise =", value, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseNotEqualTo(Integer value) {
            addCriterion("max_praise <>", value, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseGreaterThan(Integer value) {
            addCriterion("max_praise >", value, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_praise >=", value, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseLessThan(Integer value) {
            addCriterion("max_praise <", value, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("max_praise <=", value, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseIn(List<Integer> values) {
            addCriterion("max_praise in", values, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseNotIn(List<Integer> values) {
            addCriterion("max_praise not in", values, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseBetween(Integer value1, Integer value2) {
            addCriterion("max_praise between", value1, value2, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andMaxPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("max_praise not between", value1, value2, "maxPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseIsNull() {
            addCriterion("sum_praise is null");
            return (Criteria) this;
        }

        public Criteria andSumPraiseIsNotNull() {
            addCriterion("sum_praise is not null");
            return (Criteria) this;
        }

        public Criteria andSumPraiseEqualTo(Integer value) {
            addCriterion("sum_praise =", value, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseNotEqualTo(Integer value) {
            addCriterion("sum_praise <>", value, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseGreaterThan(Integer value) {
            addCriterion("sum_praise >", value, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_praise >=", value, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseLessThan(Integer value) {
            addCriterion("sum_praise <", value, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("sum_praise <=", value, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseIn(List<Integer> values) {
            addCriterion("sum_praise in", values, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseNotIn(List<Integer> values) {
            addCriterion("sum_praise not in", values, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseBetween(Integer value1, Integer value2) {
            addCriterion("sum_praise between", value1, value2, "sumPraise");
            return (Criteria) this;
        }

        public Criteria andSumPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_praise not between", value1, value2, "sumPraise");
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

        public Criteria andStateTimeIsNull() {
            addCriterion("state_time is null");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNotNull() {
            addCriterion("state_time is not null");
            return (Criteria) this;
        }

        public Criteria andStateTimeEqualTo(Date value) {
            addCriterion("state_time =", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotEqualTo(Date value) {
            addCriterion("state_time <>", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThan(Date value) {
            addCriterion("state_time >", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("state_time >=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThan(Date value) {
            addCriterion("state_time <", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThanOrEqualTo(Date value) {
            addCriterion("state_time <=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeIn(List<Date> values) {
            addCriterion("state_time in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotIn(List<Date> values) {
            addCriterion("state_time not in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeBetween(Date value1, Date value2) {
            addCriterion("state_time between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotBetween(Date value1, Date value2) {
            addCriterion("state_time not between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPbaNameIsNull() {
            addCriterion("pba_name is null");
            return (Criteria) this;
        }

        public Criteria andPbaNameIsNotNull() {
            addCriterion("pba_name is not null");
            return (Criteria) this;
        }

        public Criteria andPbaNameEqualTo(String value) {
            addCriterion("pba_name =", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameNotEqualTo(String value) {
            addCriterion("pba_name <>", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameGreaterThan(String value) {
            addCriterion("pba_name >", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameGreaterThanOrEqualTo(String value) {
            addCriterion("pba_name >=", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameLessThan(String value) {
            addCriterion("pba_name <", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameLessThanOrEqualTo(String value) {
            addCriterion("pba_name <=", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameLike(String value) {
            addCriterion("pba_name like", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameNotLike(String value) {
            addCriterion("pba_name not like", value, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameIn(List<String> values) {
            addCriterion("pba_name in", values, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameNotIn(List<String> values) {
            addCriterion("pba_name not in", values, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameBetween(String value1, String value2) {
            addCriterion("pba_name between", value1, value2, "pbaName");
            return (Criteria) this;
        }

        public Criteria andPbaNameNotBetween(String value1, String value2) {
            addCriterion("pba_name not between", value1, value2, "pbaName");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：public_benefit_activities
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
     * 数据库表：public_benefit_activities
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