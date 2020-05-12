package com.bz.bean;

import java.util.ArrayList;
import java.util.List;

public class LP_TuPianExample {
    /**
     * lp_tupian
     */
    protected String orderByClause;

    /**
     * lp_tupian
     */
    protected boolean distinct;

    /**
     * lp_tupian
     */
    protected List<Criteria> oredCriteria;

    /**
     * lp_tupian
     */
    protected int limitStart = -1;

    /**
     * lp_tupian
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public LP_TuPianExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public void setCount(int count) {
        this.count=count;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public Criteria getCriteria() {
        if (oredCriteria.size() != 0) {return oredCriteria.get(0);}
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * lp_tupian 2020-04-25
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

        public Criteria andLujingIsNull() {
            addCriterion("lujing is null");
            return (Criteria) this;
        }

        public Criteria andLujingIsNotNull() {
            addCriterion("lujing is not null");
            return (Criteria) this;
        }

        public Criteria andLujingEqualTo(String value) {
            addCriterion("lujing =", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingNotEqualTo(String value) {
            addCriterion("lujing <>", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingGreaterThan(String value) {
            addCriterion("lujing >", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingGreaterThanOrEqualTo(String value) {
            addCriterion("lujing >=", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingLessThan(String value) {
            addCriterion("lujing <", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingLessThanOrEqualTo(String value) {
            addCriterion("lujing <=", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingLike(String value) {
            addCriterion("lujing like", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingNotLike(String value) {
            addCriterion("lujing not like", value, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingIn(List<String> values) {
            addCriterion("lujing in", values, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingNotIn(List<String> values) {
            addCriterion("lujing not in", values, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingBetween(String value1, String value2) {
            addCriterion("lujing between", value1, value2, "lujing");
            return (Criteria) this;
        }

        public Criteria andLujingNotBetween(String value1, String value2) {
            addCriterion("lujing not between", value1, value2, "lujing");
            return (Criteria) this;
        }

        public Criteria andLoupanidIsNull() {
            addCriterion("loupanid is null");
            return (Criteria) this;
        }

        public Criteria andLoupanidIsNotNull() {
            addCriterion("loupanid is not null");
            return (Criteria) this;
        }

        public Criteria andLoupanidEqualTo(Integer value) {
            addCriterion("loupanid =", value, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidNotEqualTo(Integer value) {
            addCriterion("loupanid <>", value, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidGreaterThan(Integer value) {
            addCriterion("loupanid >", value, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("loupanid >=", value, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidLessThan(Integer value) {
            addCriterion("loupanid <", value, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidLessThanOrEqualTo(Integer value) {
            addCriterion("loupanid <=", value, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidIn(List<Integer> values) {
            addCriterion("loupanid in", values, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidNotIn(List<Integer> values) {
            addCriterion("loupanid not in", values, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidBetween(Integer value1, Integer value2) {
            addCriterion("loupanid between", value1, value2, "loupanid");
            return (Criteria) this;
        }

        public Criteria andLoupanidNotBetween(Integer value1, Integer value2) {
            addCriterion("loupanid not between", value1, value2, "loupanid");
            return (Criteria) this;
        }
    }

    /**
     * lp_tupian
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * lp_tupian 2020-04-25
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