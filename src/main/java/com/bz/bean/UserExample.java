package com.bz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
     * user
     */
    protected String orderByClause;

    /**
     * user
     */
    protected boolean distinct;

    /**
     * user
     */
    protected List<Criteria> oredCriteria;

    /**
     * user
     */
    protected int limitStart = -1;

    /**
     * user
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public UserExample() {
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
     * user 2020-04-25
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

        public Criteria andNichengIsNull() {
            addCriterion("nicheng is null");
            return (Criteria) this;
        }

        public Criteria andNichengIsNotNull() {
            addCriterion("nicheng is not null");
            return (Criteria) this;
        }

        public Criteria andNichengEqualTo(String value) {
            addCriterion("nicheng =", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotEqualTo(String value) {
            addCriterion("nicheng <>", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengGreaterThan(String value) {
            addCriterion("nicheng >", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengGreaterThanOrEqualTo(String value) {
            addCriterion("nicheng >=", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLessThan(String value) {
            addCriterion("nicheng <", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLessThanOrEqualTo(String value) {
            addCriterion("nicheng <=", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLike(String value) {
            addCriterion("nicheng like", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotLike(String value) {
            addCriterion("nicheng not like", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengIn(List<String> values) {
            addCriterion("nicheng in", values, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotIn(List<String> values) {
            addCriterion("nicheng not in", values, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengBetween(String value1, String value2) {
            addCriterion("nicheng between", value1, value2, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotBetween(String value1, String value2) {
            addCriterion("nicheng not between", value1, value2, "nicheng");
            return (Criteria) this;
        }

        public Criteria andOpenidsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andShoujihaoIsNull() {
            addCriterion("shoujihao is null");
            return (Criteria) this;
        }

        public Criteria andShoujihaoIsNotNull() {
            addCriterion("shoujihao is not null");
            return (Criteria) this;
        }

        public Criteria andShoujihaoEqualTo(String value) {
            addCriterion("shoujihao =", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoNotEqualTo(String value) {
            addCriterion("shoujihao <>", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoGreaterThan(String value) {
            addCriterion("shoujihao >", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoGreaterThanOrEqualTo(String value) {
            addCriterion("shoujihao >=", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoLessThan(String value) {
            addCriterion("shoujihao <", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoLessThanOrEqualTo(String value) {
            addCriterion("shoujihao <=", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoLike(String value) {
            addCriterion("shoujihao like", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoNotLike(String value) {
            addCriterion("shoujihao not like", value, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoIn(List<String> values) {
            addCriterion("shoujihao in", values, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoNotIn(List<String> values) {
            addCriterion("shoujihao not in", values, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoBetween(String value1, String value2) {
            addCriterion("shoujihao between", value1, value2, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andShoujihaoNotBetween(String value1, String value2) {
            addCriterion("shoujihao not between", value1, value2, "shoujihao");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNull() {
            addCriterion("touxiang is null");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNotNull() {
            addCriterion("touxiang is not null");
            return (Criteria) this;
        }

        public Criteria andTouxiangEqualTo(String value) {
            addCriterion("touxiang =", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotEqualTo(String value) {
            addCriterion("touxiang <>", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThan(String value) {
            addCriterion("touxiang >", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("touxiang >=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThan(String value) {
            addCriterion("touxiang <", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThanOrEqualTo(String value) {
            addCriterion("touxiang <=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLike(String value) {
            addCriterion("touxiang like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotLike(String value) {
            addCriterion("touxiang not like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangIn(List<String> values) {
            addCriterion("touxiang in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotIn(List<String> values) {
            addCriterion("touxiang not in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangBetween(String value1, String value2) {
            addCriterion("touxiang between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotBetween(String value1, String value2) {
            addCriterion("touxiang not between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNull() {
            addCriterion("xingming is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("xingming is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("xingming =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("xingming <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("xingming >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("xingming >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("xingming <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("xingming <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("xingming like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("xingming not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("xingming in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("xingming not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("xingming between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("xingming not between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingIsNull() {
            addCriterion("yixiangleixing is null");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingIsNotNull() {
            addCriterion("yixiangleixing is not null");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingEqualTo(String value) {
            addCriterion("yixiangleixing =", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingNotEqualTo(String value) {
            addCriterion("yixiangleixing <>", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingGreaterThan(String value) {
            addCriterion("yixiangleixing >", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingGreaterThanOrEqualTo(String value) {
            addCriterion("yixiangleixing >=", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingLessThan(String value) {
            addCriterion("yixiangleixing <", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingLessThanOrEqualTo(String value) {
            addCriterion("yixiangleixing <=", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingLike(String value) {
            addCriterion("yixiangleixing like", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingNotLike(String value) {
            addCriterion("yixiangleixing not like", value, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingIn(List<String> values) {
            addCriterion("yixiangleixing in", values, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingNotIn(List<String> values) {
            addCriterion("yixiangleixing not in", values, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingBetween(String value1, String value2) {
            addCriterion("yixiangleixing between", value1, value2, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangleixingNotBetween(String value1, String value2) {
            addCriterion("yixiangleixing not between", value1, value2, "yixiangleixing");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidIsNull() {
            addCriterion("yixiangquyuid is null");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidIsNotNull() {
            addCriterion("yixiangquyuid is not null");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidEqualTo(String value) {
            addCriterion("yixiangquyuid =", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidNotEqualTo(String value) {
            addCriterion("yixiangquyuid <>", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidGreaterThan(String value) {
            addCriterion("yixiangquyuid >", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidGreaterThanOrEqualTo(String value) {
            addCriterion("yixiangquyuid >=", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidLessThan(String value) {
            addCriterion("yixiangquyuid <", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidLessThanOrEqualTo(String value) {
            addCriterion("yixiangquyuid <=", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidLike(String value) {
            addCriterion("yixiangquyuid like", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidNotLike(String value) {
            addCriterion("yixiangquyuid not like", value, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidIn(List<String> values) {
            addCriterion("yixiangquyuid in", values, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidNotIn(List<String> values) {
            addCriterion("yixiangquyuid not in", values, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidBetween(String value1, String value2) {
            addCriterion("yixiangquyuid between", value1, value2, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuidNotBetween(String value1, String value2) {
            addCriterion("yixiangquyuid not between", value1, value2, "yixiangquyuid");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuIsNull() {
            addCriterion("yixiangquyu is null");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuIsNotNull() {
            addCriterion("yixiangquyu is not null");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuEqualTo(String value) {
            addCriterion("yixiangquyu =", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuNotEqualTo(String value) {
            addCriterion("yixiangquyu <>", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuGreaterThan(String value) {
            addCriterion("yixiangquyu >", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuGreaterThanOrEqualTo(String value) {
            addCriterion("yixiangquyu >=", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuLessThan(String value) {
            addCriterion("yixiangquyu <", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuLessThanOrEqualTo(String value) {
            addCriterion("yixiangquyu <=", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuLike(String value) {
            addCriterion("yixiangquyu like", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuNotLike(String value) {
            addCriterion("yixiangquyu not like", value, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuIn(List<String> values) {
            addCriterion("yixiangquyu in", values, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuNotIn(List<String> values) {
            addCriterion("yixiangquyu not in", values, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuBetween(String value1, String value2) {
            addCriterion("yixiangquyu between", value1, value2, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andYixiangquyuNotBetween(String value1, String value2) {
            addCriterion("yixiangquyu not between", value1, value2, "yixiangquyu");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidIsNull() {
            addCriterion("tuijianrenid is null");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidIsNotNull() {
            addCriterion("tuijianrenid is not null");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidEqualTo(Integer value) {
            addCriterion("tuijianrenid =", value, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidNotEqualTo(Integer value) {
            addCriterion("tuijianrenid <>", value, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidGreaterThan(Integer value) {
            addCriterion("tuijianrenid >", value, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuijianrenid >=", value, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidLessThan(Integer value) {
            addCriterion("tuijianrenid <", value, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidLessThanOrEqualTo(Integer value) {
            addCriterion("tuijianrenid <=", value, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidIn(List<Integer> values) {
            addCriterion("tuijianrenid in", values, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidNotIn(List<Integer> values) {
            addCriterion("tuijianrenid not in", values, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidBetween(Integer value1, Integer value2) {
            addCriterion("tuijianrenid between", value1, value2, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenidNotBetween(Integer value1, Integer value2) {
            addCriterion("tuijianrenid not between", value1, value2, "tuijianrenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidIsNull() {
            addCriterion("tuijianrenopenid is null");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidIsNotNull() {
            addCriterion("tuijianrenopenid is not null");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidEqualTo(Integer value) {
            addCriterion("tuijianrenopenid =", value, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidNotEqualTo(Integer value) {
            addCriterion("tuijianrenopenid <>", value, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidGreaterThan(Integer value) {
            addCriterion("tuijianrenopenid >", value, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuijianrenopenid >=", value, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidLessThan(Integer value) {
            addCriterion("tuijianrenopenid <", value, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidLessThanOrEqualTo(Integer value) {
            addCriterion("tuijianrenopenid <=", value, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidIn(List<Integer> values) {
            addCriterion("tuijianrenopenid in", values, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidNotIn(List<Integer> values) {
            addCriterion("tuijianrenopenid not in", values, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidBetween(Integer value1, Integer value2) {
            addCriterion("tuijianrenopenid between", value1, value2, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTuijianrenopenidNotBetween(Integer value1, Integer value2) {
            addCriterion("tuijianrenopenid not between", value1, value2, "tuijianrenopenid");
            return (Criteria) this;
        }

        public Criteria andTixianjineIsNull() {
            addCriterion("tixianjine is null");
            return (Criteria) this;
        }

        public Criteria andTixianjineIsNotNull() {
            addCriterion("tixianjine is not null");
            return (Criteria) this;
        }

        public Criteria andTixianjineEqualTo(Double value) {
            addCriterion("tixianjine =", value, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineNotEqualTo(Double value) {
            addCriterion("tixianjine <>", value, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineGreaterThan(Double value) {
            addCriterion("tixianjine >", value, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineGreaterThanOrEqualTo(Double value) {
            addCriterion("tixianjine >=", value, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineLessThan(Double value) {
            addCriterion("tixianjine <", value, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineLessThanOrEqualTo(Double value) {
            addCriterion("tixianjine <=", value, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineIn(List<Double> values) {
            addCriterion("tixianjine in", values, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineNotIn(List<Double> values) {
            addCriterion("tixianjine not in", values, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineBetween(Double value1, Double value2) {
            addCriterion("tixianjine between", value1, value2, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andTixianjineNotBetween(Double value1, Double value2) {
            addCriterion("tixianjine not between", value1, value2, "tixianjine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineIsNull() {
            addCriterion("dongjiejine is null");
            return (Criteria) this;
        }

        public Criteria andDongjiejineIsNotNull() {
            addCriterion("dongjiejine is not null");
            return (Criteria) this;
        }

        public Criteria andDongjiejineEqualTo(Double value) {
            addCriterion("dongjiejine =", value, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineNotEqualTo(Double value) {
            addCriterion("dongjiejine <>", value, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineGreaterThan(Double value) {
            addCriterion("dongjiejine >", value, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineGreaterThanOrEqualTo(Double value) {
            addCriterion("dongjiejine >=", value, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineLessThan(Double value) {
            addCriterion("dongjiejine <", value, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineLessThanOrEqualTo(Double value) {
            addCriterion("dongjiejine <=", value, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineIn(List<Double> values) {
            addCriterion("dongjiejine in", values, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineNotIn(List<Double> values) {
            addCriterion("dongjiejine not in", values, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineBetween(Double value1, Double value2) {
            addCriterion("dongjiejine between", value1, value2, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andDongjiejineNotBetween(Double value1, Double value2) {
            addCriterion("dongjiejine not between", value1, value2, "dongjiejine");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoIsNull() {
            addCriterion("iszhifubao is null");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoIsNotNull() {
            addCriterion("iszhifubao is not null");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoEqualTo(Integer value) {
            addCriterion("iszhifubao =", value, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoNotEqualTo(Integer value) {
            addCriterion("iszhifubao <>", value, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoGreaterThan(Integer value) {
            addCriterion("iszhifubao >", value, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("iszhifubao >=", value, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoLessThan(Integer value) {
            addCriterion("iszhifubao <", value, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoLessThanOrEqualTo(Integer value) {
            addCriterion("iszhifubao <=", value, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoIn(List<Integer> values) {
            addCriterion("iszhifubao in", values, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoNotIn(List<Integer> values) {
            addCriterion("iszhifubao not in", values, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoBetween(Integer value1, Integer value2) {
            addCriterion("iszhifubao between", value1, value2, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andIszhifubaoNotBetween(Integer value1, Integer value2) {
            addCriterion("iszhifubao not between", value1, value2, "iszhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoIsNull() {
            addCriterion("zhifubaozhaohao is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoIsNotNull() {
            addCriterion("zhifubaozhaohao is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoEqualTo(String value) {
            addCriterion("zhifubaozhaohao =", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoNotEqualTo(String value) {
            addCriterion("zhifubaozhaohao <>", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoGreaterThan(String value) {
            addCriterion("zhifubaozhaohao >", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhifubaozhaohao >=", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoLessThan(String value) {
            addCriterion("zhifubaozhaohao <", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoLessThanOrEqualTo(String value) {
            addCriterion("zhifubaozhaohao <=", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoLike(String value) {
            addCriterion("zhifubaozhaohao like", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoNotLike(String value) {
            addCriterion("zhifubaozhaohao not like", value, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoIn(List<String> values) {
            addCriterion("zhifubaozhaohao in", values, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoNotIn(List<String> values) {
            addCriterion("zhifubaozhaohao not in", values, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoBetween(String value1, String value2) {
            addCriterion("zhifubaozhaohao between", value1, value2, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andZhifubaozhaohaoNotBetween(String value1, String value2) {
            addCriterion("zhifubaozhaohao not between", value1, value2, "zhifubaozhaohao");
            return (Criteria) this;
        }

        public Criteria andIsweixinIsNull() {
            addCriterion("isweixin is null");
            return (Criteria) this;
        }

        public Criteria andIsweixinIsNotNull() {
            addCriterion("isweixin is not null");
            return (Criteria) this;
        }

        public Criteria andIsweixinEqualTo(Integer value) {
            addCriterion("isweixin =", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinNotEqualTo(Integer value) {
            addCriterion("isweixin <>", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinGreaterThan(Integer value) {
            addCriterion("isweixin >", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinGreaterThanOrEqualTo(Integer value) {
            addCriterion("isweixin >=", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinLessThan(Integer value) {
            addCriterion("isweixin <", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinLessThanOrEqualTo(Integer value) {
            addCriterion("isweixin <=", value, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinIn(List<Integer> values) {
            addCriterion("isweixin in", values, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinNotIn(List<Integer> values) {
            addCriterion("isweixin not in", values, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinBetween(Integer value1, Integer value2) {
            addCriterion("isweixin between", value1, value2, "isweixin");
            return (Criteria) this;
        }

        public Criteria andIsweixinNotBetween(Integer value1, Integer value2) {
            addCriterion("isweixin not between", value1, value2, "isweixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andIsyihangIsNull() {
            addCriterion("isyihang is null");
            return (Criteria) this;
        }

        public Criteria andIsyihangIsNotNull() {
            addCriterion("isyihang is not null");
            return (Criteria) this;
        }

        public Criteria andIsyihangEqualTo(Integer value) {
            addCriterion("isyihang =", value, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangNotEqualTo(Integer value) {
            addCriterion("isyihang <>", value, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangGreaterThan(Integer value) {
            addCriterion("isyihang >", value, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangGreaterThanOrEqualTo(Integer value) {
            addCriterion("isyihang >=", value, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangLessThan(Integer value) {
            addCriterion("isyihang <", value, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangLessThanOrEqualTo(Integer value) {
            addCriterion("isyihang <=", value, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangIn(List<Integer> values) {
            addCriterion("isyihang in", values, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangNotIn(List<Integer> values) {
            addCriterion("isyihang not in", values, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangBetween(Integer value1, Integer value2) {
            addCriterion("isyihang between", value1, value2, "isyihang");
            return (Criteria) this;
        }

        public Criteria andIsyihangNotBetween(Integer value1, Integer value2) {
            addCriterion("isyihang not between", value1, value2, "isyihang");
            return (Criteria) this;
        }

        public Criteria andYinhanidIsNull() {
            addCriterion("yinhanid is null");
            return (Criteria) this;
        }

        public Criteria andYinhanidIsNotNull() {
            addCriterion("yinhanid is not null");
            return (Criteria) this;
        }

        public Criteria andYinhanidEqualTo(Integer value) {
            addCriterion("yinhanid =", value, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidNotEqualTo(Integer value) {
            addCriterion("yinhanid <>", value, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidGreaterThan(Integer value) {
            addCriterion("yinhanid >", value, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yinhanid >=", value, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidLessThan(Integer value) {
            addCriterion("yinhanid <", value, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidLessThanOrEqualTo(Integer value) {
            addCriterion("yinhanid <=", value, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidIn(List<Integer> values) {
            addCriterion("yinhanid in", values, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidNotIn(List<Integer> values) {
            addCriterion("yinhanid not in", values, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidBetween(Integer value1, Integer value2) {
            addCriterion("yinhanid between", value1, value2, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanidNotBetween(Integer value1, Integer value2) {
            addCriterion("yinhanid not between", value1, value2, "yinhanid");
            return (Criteria) this;
        }

        public Criteria andYinhanmingIsNull() {
            addCriterion("yinhanming is null");
            return (Criteria) this;
        }

        public Criteria andYinhanmingIsNotNull() {
            addCriterion("yinhanming is not null");
            return (Criteria) this;
        }

        public Criteria andYinhanmingEqualTo(String value) {
            addCriterion("yinhanming =", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingNotEqualTo(String value) {
            addCriterion("yinhanming <>", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingGreaterThan(String value) {
            addCriterion("yinhanming >", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingGreaterThanOrEqualTo(String value) {
            addCriterion("yinhanming >=", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingLessThan(String value) {
            addCriterion("yinhanming <", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingLessThanOrEqualTo(String value) {
            addCriterion("yinhanming <=", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingLike(String value) {
            addCriterion("yinhanming like", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingNotLike(String value) {
            addCriterion("yinhanming not like", value, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingIn(List<String> values) {
            addCriterion("yinhanming in", values, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingNotIn(List<String> values) {
            addCriterion("yinhanming not in", values, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingBetween(String value1, String value2) {
            addCriterion("yinhanming between", value1, value2, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andYinhanmingNotBetween(String value1, String value2) {
            addCriterion("yinhanming not between", value1, value2, "yinhanming");
            return (Criteria) this;
        }

        public Criteria andZhihangIsNull() {
            addCriterion("zhihang is null");
            return (Criteria) this;
        }

        public Criteria andZhihangIsNotNull() {
            addCriterion("zhihang is not null");
            return (Criteria) this;
        }

        public Criteria andZhihangEqualTo(String value) {
            addCriterion("zhihang =", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangNotEqualTo(String value) {
            addCriterion("zhihang <>", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangGreaterThan(String value) {
            addCriterion("zhihang >", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangGreaterThanOrEqualTo(String value) {
            addCriterion("zhihang >=", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangLessThan(String value) {
            addCriterion("zhihang <", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangLessThanOrEqualTo(String value) {
            addCriterion("zhihang <=", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangLike(String value) {
            addCriterion("zhihang like", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangNotLike(String value) {
            addCriterion("zhihang not like", value, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangIn(List<String> values) {
            addCriterion("zhihang in", values, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangNotIn(List<String> values) {
            addCriterion("zhihang not in", values, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangBetween(String value1, String value2) {
            addCriterion("zhihang between", value1, value2, "zhihang");
            return (Criteria) this;
        }

        public Criteria andZhihangNotBetween(String value1, String value2) {
            addCriterion("zhihang not between", value1, value2, "zhihang");
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

        public Criteria andZhanghaomingIsNull() {
            addCriterion("zhanghaoming is null");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingIsNotNull() {
            addCriterion("zhanghaoming is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingEqualTo(String value) {
            addCriterion("zhanghaoming =", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingNotEqualTo(String value) {
            addCriterion("zhanghaoming <>", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingGreaterThan(String value) {
            addCriterion("zhanghaoming >", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingGreaterThanOrEqualTo(String value) {
            addCriterion("zhanghaoming >=", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingLessThan(String value) {
            addCriterion("zhanghaoming <", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingLessThanOrEqualTo(String value) {
            addCriterion("zhanghaoming <=", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingLike(String value) {
            addCriterion("zhanghaoming like", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingNotLike(String value) {
            addCriterion("zhanghaoming not like", value, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingIn(List<String> values) {
            addCriterion("zhanghaoming in", values, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingNotIn(List<String> values) {
            addCriterion("zhanghaoming not in", values, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingBetween(String value1, String value2) {
            addCriterion("zhanghaoming between", value1, value2, "zhanghaoming");
            return (Criteria) this;
        }

        public Criteria andZhanghaomingNotBetween(String value1, String value2) {
            addCriterion("zhanghaoming not between", value1, value2, "zhanghaoming");
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
     * user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * user 2020-04-25
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