package com.bz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    /**
     * admin
     */
    protected String orderByClause;

    /**
     * admin
     */
    protected boolean distinct;

    /**
     * admin
     */
    protected List<Criteria> oredCriteria;

    /**
     * admin
     */
    protected int limitStart = -1;

    /**
     * admin
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public AdminExample() {
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
     * admin 2020-04-25
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

        public Criteria andZhanghaoIsNull() {
            addCriterion("zhanghao is null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoIsNotNull() {
            addCriterion("zhanghao is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoEqualTo(String value) {
            addCriterion("zhanghao =", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotEqualTo(String value) {
            addCriterion("zhanghao <>", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoGreaterThan(String value) {
            addCriterion("zhanghao >", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhanghao >=", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLessThan(String value) {
            addCriterion("zhanghao <", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLessThanOrEqualTo(String value) {
            addCriterion("zhanghao <=", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLike(String value) {
            addCriterion("zhanghao like", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotLike(String value) {
            addCriterion("zhanghao not like", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoIn(List<String> values) {
            addCriterion("zhanghao in", values, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotIn(List<String> values) {
            addCriterion("zhanghao not in", values, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoBetween(String value1, String value2) {
            addCriterion("zhanghao between", value1, value2, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotBetween(String value1, String value2) {
            addCriterion("zhanghao not between", value1, value2, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andMimaIsNull() {
            addCriterion("mima is null");
            return (Criteria) this;
        }

        public Criteria andMimaIsNotNull() {
            addCriterion("mima is not null");
            return (Criteria) this;
        }

        public Criteria andMimaEqualTo(String value) {
            addCriterion("mima =", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotEqualTo(String value) {
            addCriterion("mima <>", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaGreaterThan(String value) {
            addCriterion("mima >", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaGreaterThanOrEqualTo(String value) {
            addCriterion("mima >=", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaLessThan(String value) {
            addCriterion("mima <", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaLessThanOrEqualTo(String value) {
            addCriterion("mima <=", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaLike(String value) {
            addCriterion("mima like", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotLike(String value) {
            addCriterion("mima not like", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaIn(List<String> values) {
            addCriterion("mima in", values, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotIn(List<String> values) {
            addCriterion("mima not in", values, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaBetween(String value1, String value2) {
            addCriterion("mima between", value1, value2, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotBetween(String value1, String value2) {
            addCriterion("mima not between", value1, value2, "mima");
            return (Criteria) this;
        }

        public Criteria andQuanxianIsNull() {
            addCriterion("quanxian is null");
            return (Criteria) this;
        }

        public Criteria andQuanxianIsNotNull() {
            addCriterion("quanxian is not null");
            return (Criteria) this;
        }

        public Criteria andQuanxianEqualTo(Integer value) {
            addCriterion("quanxian =", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianNotEqualTo(Integer value) {
            addCriterion("quanxian <>", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianGreaterThan(Integer value) {
            addCriterion("quanxian >", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("quanxian >=", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianLessThan(Integer value) {
            addCriterion("quanxian <", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianLessThanOrEqualTo(Integer value) {
            addCriterion("quanxian <=", value, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianIn(List<Integer> values) {
            addCriterion("quanxian in", values, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianNotIn(List<Integer> values) {
            addCriterion("quanxian not in", values, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianBetween(Integer value1, Integer value2) {
            addCriterion("quanxian between", value1, value2, "quanxian");
            return (Criteria) this;
        }

        public Criteria andQuanxianNotBetween(Integer value1, Integer value2) {
            addCriterion("quanxian not between", value1, value2, "quanxian");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }
    }

    /**
     * admin
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * admin 2020-04-25
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