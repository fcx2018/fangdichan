package com.bz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LouPanExample {
    /**
     * loupan
     */
    protected String orderByClause;

    /**
     * loupan
     */
    protected boolean distinct;

    /**
     * loupan
     */
    protected List<Criteria> oredCriteria;

    /**
     * loupan
     */
    protected int limitStart = -1;

    /**
     * loupan
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public LouPanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-05-11
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
     * @mbggenerated 2020-05-11
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public void setCount(int count) {
        this.count=count;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @mbggenerated 2020-05-11
     */
    public Criteria getCriteria() {
        if (oredCriteria.size() != 0) {return oredCriteria.get(0);}
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * loupan 2020-05-11
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

        public Criteria andZhanghaoidIsNull() {
            addCriterion("zhanghaoid is null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidIsNotNull() {
            addCriterion("zhanghaoid is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidEqualTo(Integer value) {
            addCriterion("zhanghaoid =", value, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidNotEqualTo(Integer value) {
            addCriterion("zhanghaoid <>", value, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidGreaterThan(Integer value) {
            addCriterion("zhanghaoid >", value, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhanghaoid >=", value, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidLessThan(Integer value) {
            addCriterion("zhanghaoid <", value, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidLessThanOrEqualTo(Integer value) {
            addCriterion("zhanghaoid <=", value, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidIn(List<Integer> values) {
            addCriterion("zhanghaoid in", values, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidNotIn(List<Integer> values) {
            addCriterion("zhanghaoid not in", values, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidBetween(Integer value1, Integer value2) {
            addCriterion("zhanghaoid between", value1, value2, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andZhanghaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("zhanghaoid not between", value1, value2, "zhanghaoid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBiemingIsNull() {
            addCriterion("bieming is null");
            return (Criteria) this;
        }

        public Criteria andBiemingIsNotNull() {
            addCriterion("bieming is not null");
            return (Criteria) this;
        }

        public Criteria andBiemingEqualTo(String value) {
            addCriterion("bieming =", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingNotEqualTo(String value) {
            addCriterion("bieming <>", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingGreaterThan(String value) {
            addCriterion("bieming >", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingGreaterThanOrEqualTo(String value) {
            addCriterion("bieming >=", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingLessThan(String value) {
            addCriterion("bieming <", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingLessThanOrEqualTo(String value) {
            addCriterion("bieming <=", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingLike(String value) {
            addCriterion("bieming like", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingNotLike(String value) {
            addCriterion("bieming not like", value, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingIn(List<String> values) {
            addCriterion("bieming in", values, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingNotIn(List<String> values) {
            addCriterion("bieming not in", values, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingBetween(String value1, String value2) {
            addCriterion("bieming between", value1, value2, "bieming");
            return (Criteria) this;
        }

        public Criteria andBiemingNotBetween(String value1, String value2) {
            addCriterion("bieming not between", value1, value2, "bieming");
            return (Criteria) this;
        }

        public Criteria andZhutuIsNull() {
            addCriterion("zhutu is null");
            return (Criteria) this;
        }

        public Criteria andZhutuIsNotNull() {
            addCriterion("zhutu is not null");
            return (Criteria) this;
        }

        public Criteria andZhutuEqualTo(String value) {
            addCriterion("zhutu =", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuNotEqualTo(String value) {
            addCriterion("zhutu <>", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuGreaterThan(String value) {
            addCriterion("zhutu >", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuGreaterThanOrEqualTo(String value) {
            addCriterion("zhutu >=", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuLessThan(String value) {
            addCriterion("zhutu <", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuLessThanOrEqualTo(String value) {
            addCriterion("zhutu <=", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuLike(String value) {
            addCriterion("zhutu like", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuNotLike(String value) {
            addCriterion("zhutu not like", value, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuIn(List<String> values) {
            addCriterion("zhutu in", values, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuNotIn(List<String> values) {
            addCriterion("zhutu not in", values, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuBetween(String value1, String value2) {
            addCriterion("zhutu between", value1, value2, "zhutu");
            return (Criteria) this;
        }

        public Criteria andZhutuNotBetween(String value1, String value2) {
            addCriterion("zhutu not between", value1, value2, "zhutu");
            return (Criteria) this;
        }

        public Criteria andFenleiidIsNull() {
            addCriterion("fenleiid is null");
            return (Criteria) this;
        }

        public Criteria andFenleiidIsNotNull() {
            addCriterion("fenleiid is not null");
            return (Criteria) this;
        }

        public Criteria andFenleiidEqualTo(Integer value) {
            addCriterion("fenleiid =", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidNotEqualTo(Integer value) {
            addCriterion("fenleiid <>", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidGreaterThan(Integer value) {
            addCriterion("fenleiid >", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenleiid >=", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidLessThan(Integer value) {
            addCriterion("fenleiid <", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidLessThanOrEqualTo(Integer value) {
            addCriterion("fenleiid <=", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidIn(List<Integer> values) {
            addCriterion("fenleiid in", values, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidNotIn(List<Integer> values) {
            addCriterion("fenleiid not in", values, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidBetween(Integer value1, Integer value2) {
            addCriterion("fenleiid between", value1, value2, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidNotBetween(Integer value1, Integer value2) {
            addCriterion("fenleiid not between", value1, value2, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andShoujiaIsNull() {
            addCriterion("shoujia is null");
            return (Criteria) this;
        }

        public Criteria andShoujiaIsNotNull() {
            addCriterion("shoujia is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiaEqualTo(Double value) {
            addCriterion("shoujia =", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotEqualTo(Double value) {
            addCriterion("shoujia <>", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThan(Double value) {
            addCriterion("shoujia >", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThanOrEqualTo(Double value) {
            addCriterion("shoujia >=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThan(Double value) {
            addCriterion("shoujia <", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThanOrEqualTo(Double value) {
            addCriterion("shoujia <=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaIn(List<Double> values) {
            addCriterion("shoujia in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotIn(List<Double> values) {
            addCriterion("shoujia not in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaBetween(Double value1, Double value2) {
            addCriterion("shoujia between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotBetween(Double value1, Double value2) {
            addCriterion("shoujia not between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andJunjiaIsNull() {
            addCriterion("junjia is null");
            return (Criteria) this;
        }

        public Criteria andJunjiaIsNotNull() {
            addCriterion("junjia is not null");
            return (Criteria) this;
        }

        public Criteria andJunjiaEqualTo(Double value) {
            addCriterion("junjia =", value, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaNotEqualTo(Double value) {
            addCriterion("junjia <>", value, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaGreaterThan(Double value) {
            addCriterion("junjia >", value, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaGreaterThanOrEqualTo(Double value) {
            addCriterion("junjia >=", value, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaLessThan(Double value) {
            addCriterion("junjia <", value, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaLessThanOrEqualTo(Double value) {
            addCriterion("junjia <=", value, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaIn(List<Double> values) {
            addCriterion("junjia in", values, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaNotIn(List<Double> values) {
            addCriterion("junjia not in", values, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaBetween(Double value1, Double value2) {
            addCriterion("junjia between", value1, value2, "junjia");
            return (Criteria) this;
        }

        public Criteria andJunjiaNotBetween(Double value1, Double value2) {
            addCriterion("junjia not between", value1, value2, "junjia");
            return (Criteria) this;
        }

        public Criteria andKaipanIsNull() {
            addCriterion("kaipan is null");
            return (Criteria) this;
        }

        public Criteria andKaipanIsNotNull() {
            addCriterion("kaipan is not null");
            return (Criteria) this;
        }

        public Criteria andKaipanEqualTo(Date value) {
            addCriterion("kaipan =", value, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanNotEqualTo(Date value) {
            addCriterion("kaipan <>", value, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanGreaterThan(Date value) {
            addCriterion("kaipan >", value, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanGreaterThanOrEqualTo(Date value) {
            addCriterion("kaipan >=", value, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanLessThan(Date value) {
            addCriterion("kaipan <", value, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanLessThanOrEqualTo(Date value) {
            addCriterion("kaipan <=", value, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanIn(List<Date> values) {
            addCriterion("kaipan in", values, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanNotIn(List<Date> values) {
            addCriterion("kaipan not in", values, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanBetween(Date value1, Date value2) {
            addCriterion("kaipan between", value1, value2, "kaipan");
            return (Criteria) this;
        }

        public Criteria andKaipanNotBetween(Date value1, Date value2) {
            addCriterion("kaipan not between", value1, value2, "kaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanIsNull() {
            addCriterion("iskaipan is null");
            return (Criteria) this;
        }

        public Criteria andIskaipanIsNotNull() {
            addCriterion("iskaipan is not null");
            return (Criteria) this;
        }

        public Criteria andIskaipanEqualTo(Integer value) {
            addCriterion("iskaipan =", value, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanNotEqualTo(Integer value) {
            addCriterion("iskaipan <>", value, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanGreaterThan(Integer value) {
            addCriterion("iskaipan >", value, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanGreaterThanOrEqualTo(Integer value) {
            addCriterion("iskaipan >=", value, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanLessThan(Integer value) {
            addCriterion("iskaipan <", value, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanLessThanOrEqualTo(Integer value) {
            addCriterion("iskaipan <=", value, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanIn(List<Integer> values) {
            addCriterion("iskaipan in", values, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanNotIn(List<Integer> values) {
            addCriterion("iskaipan not in", values, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanBetween(Integer value1, Integer value2) {
            addCriterion("iskaipan between", value1, value2, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andIskaipanNotBetween(Integer value1, Integer value2) {
            addCriterion("iskaipan not between", value1, value2, "iskaipan");
            return (Criteria) this;
        }

        public Criteria andHuxingIsNull() {
            addCriterion("huxing is null");
            return (Criteria) this;
        }

        public Criteria andHuxingIsNotNull() {
            addCriterion("huxing is not null");
            return (Criteria) this;
        }

        public Criteria andHuxingEqualTo(String value) {
            addCriterion("huxing =", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingNotEqualTo(String value) {
            addCriterion("huxing <>", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingGreaterThan(String value) {
            addCriterion("huxing >", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingGreaterThanOrEqualTo(String value) {
            addCriterion("huxing >=", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingLessThan(String value) {
            addCriterion("huxing <", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingLessThanOrEqualTo(String value) {
            addCriterion("huxing <=", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingLike(String value) {
            addCriterion("huxing like", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingNotLike(String value) {
            addCriterion("huxing not like", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingIn(List<String> values) {
            addCriterion("huxing in", values, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingNotIn(List<String> values) {
            addCriterion("huxing not in", values, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingBetween(String value1, String value2) {
            addCriterion("huxing between", value1, value2, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingNotBetween(String value1, String value2) {
            addCriterion("huxing not between", value1, value2, "huxing");
            return (Criteria) this;
        }

        public Criteria andJianmianIsNull() {
            addCriterion("jianmian is null");
            return (Criteria) this;
        }

        public Criteria andJianmianIsNotNull() {
            addCriterion("jianmian is not null");
            return (Criteria) this;
        }

        public Criteria andJianmianEqualTo(String value) {
            addCriterion("jianmian =", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianNotEqualTo(String value) {
            addCriterion("jianmian <>", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianGreaterThan(String value) {
            addCriterion("jianmian >", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianGreaterThanOrEqualTo(String value) {
            addCriterion("jianmian >=", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianLessThan(String value) {
            addCriterion("jianmian <", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianLessThanOrEqualTo(String value) {
            addCriterion("jianmian <=", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianLike(String value) {
            addCriterion("jianmian like", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianNotLike(String value) {
            addCriterion("jianmian not like", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianIn(List<String> values) {
            addCriterion("jianmian in", values, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianNotIn(List<String> values) {
            addCriterion("jianmian not in", values, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianBetween(String value1, String value2) {
            addCriterion("jianmian between", value1, value2, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianNotBetween(String value1, String value2) {
            addCriterion("jianmian not between", value1, value2, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianMianSubString_IndexEquals(String value){
            if(value.split("-").length>=2){
                addCriterion("substring_index(loupan.jianmian, \'-\', 1) <= "+value.split("-")[1]);
                addCriterion("substring_index(loupan.jianmian, \'-\', -1) >="+ value.split("-")[0]);
            }else {
                addCriterion("substring_index(loupan.jianmian, \'-\', 1) <="+value);
                addCriterion("substring_index(loupan.jianmian, \'-\', -1) >="+value);
            }
            return (Criteria) this;
        }

        public Criteria andQuyuidIsNull() {
            addCriterion("quyuid is null");
            return (Criteria) this;
        }

        public Criteria andQuyuidIsNotNull() {
            addCriterion("quyuid is not null");
            return (Criteria) this;
        }

        public Criteria andQuyuidEqualTo(Integer value) {
            addCriterion("quyuid =", value, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidNotEqualTo(Integer value) {
            addCriterion("quyuid <>", value, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidGreaterThan(Integer value) {
            addCriterion("quyuid >", value, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("quyuid >=", value, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidLessThan(Integer value) {
            addCriterion("quyuid <", value, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidLessThanOrEqualTo(Integer value) {
            addCriterion("quyuid <=", value, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidIn(List<Integer> values) {
            addCriterion("quyuid in", values, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidNotIn(List<Integer> values) {
            addCriterion("quyuid not in", values, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidBetween(Integer value1, Integer value2) {
            addCriterion("quyuid between", value1, value2, "quyuid");
            return (Criteria) this;
        }

        public Criteria andQuyuidNotBetween(Integer value1, Integer value2) {
            addCriterion("quyuid not between", value1, value2, "quyuid");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNull() {
            addCriterion("dizhi is null");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNotNull() {
            addCriterion("dizhi is not null");
            return (Criteria) this;
        }

        public Criteria andDizhiEqualTo(String value) {
            addCriterion("dizhi =", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotEqualTo(String value) {
            addCriterion("dizhi <>", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThan(String value) {
            addCriterion("dizhi >", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThanOrEqualTo(String value) {
            addCriterion("dizhi >=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThan(String value) {
            addCriterion("dizhi <", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThanOrEqualTo(String value) {
            addCriterion("dizhi <=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLike(String value) {
            addCriterion("dizhi like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotLike(String value) {
            addCriterion("dizhi not like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiIn(List<String> values) {
            addCriterion("dizhi in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotIn(List<String> values) {
            addCriterion("dizhi not in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiBetween(String value1, String value2) {
            addCriterion("dizhi between", value1, value2, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotBetween(String value1, String value2) {
            addCriterion("dizhi not between", value1, value2, "dizhi");
            return (Criteria) this;
        }

        public Criteria andYongjinIsNull() {
            addCriterion("yongjin is null");
            return (Criteria) this;
        }

        public Criteria andYongjinIsNotNull() {
            addCriterion("yongjin is not null");
            return (Criteria) this;
        }

        public Criteria andYongjinEqualTo(Double value) {
            addCriterion("yongjin =", value, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinNotEqualTo(Double value) {
            addCriterion("yongjin <>", value, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinGreaterThan(Double value) {
            addCriterion("yongjin >", value, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinGreaterThanOrEqualTo(Double value) {
            addCriterion("yongjin >=", value, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinLessThan(Double value) {
            addCriterion("yongjin <", value, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinLessThanOrEqualTo(Double value) {
            addCriterion("yongjin <=", value, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinIn(List<Double> values) {
            addCriterion("yongjin in", values, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinNotIn(List<Double> values) {
            addCriterion("yongjin not in", values, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinBetween(Double value1, Double value2) {
            addCriterion("yongjin between", value1, value2, "yongjin");
            return (Criteria) this;
        }

        public Criteria andYongjinNotBetween(Double value1, Double value2) {
            addCriterion("yongjin not between", value1, value2, "yongjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangIsNull() {
            addCriterion("fenxiang is null");
            return (Criteria) this;
        }

        public Criteria andFenxiangIsNotNull() {
            addCriterion("fenxiang is not null");
            return (Criteria) this;
        }

        public Criteria andFenxiangEqualTo(Double value) {
            addCriterion("fenxiang =", value, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangNotEqualTo(Double value) {
            addCriterion("fenxiang <>", value, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangGreaterThan(Double value) {
            addCriterion("fenxiang >", value, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangGreaterThanOrEqualTo(Double value) {
            addCriterion("fenxiang >=", value, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangLessThan(Double value) {
            addCriterion("fenxiang <", value, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangLessThanOrEqualTo(Double value) {
            addCriterion("fenxiang <=", value, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangIn(List<Double> values) {
            addCriterion("fenxiang in", values, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangNotIn(List<Double> values) {
            addCriterion("fenxiang not in", values, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangBetween(Double value1, Double value2) {
            addCriterion("fenxiang between", value1, value2, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andFenxiangNotBetween(Double value1, Double value2) {
            addCriterion("fenxiang not between", value1, value2, "fenxiang");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNull() {
            addCriterion("dianhua is null");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNotNull() {
            addCriterion("dianhua is not null");
            return (Criteria) this;
        }

        public Criteria andDianhuaEqualTo(String value) {
            addCriterion("dianhua =", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotEqualTo(String value) {
            addCriterion("dianhua <>", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThan(String value) {
            addCriterion("dianhua >", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("dianhua >=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThan(String value) {
            addCriterion("dianhua <", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThanOrEqualTo(String value) {
            addCriterion("dianhua <=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLike(String value) {
            addCriterion("dianhua like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotLike(String value) {
            addCriterion("dianhua not like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaIn(List<String> values) {
            addCriterion("dianhua in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotIn(List<String> values) {
            addCriterion("dianhua not in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaBetween(String value1, String value2) {
            addCriterion("dianhua between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotBetween(String value1, String value2) {
            addCriterion("dianhua not between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andBiaoqianIsNull() {
            addCriterion("biaoqian is null");
            return (Criteria) this;
        }

        public Criteria andBiaoqianIsNotNull() {
            addCriterion("biaoqian is not null");
            return (Criteria) this;
        }

        public Criteria andBiaoqianEqualTo(String value) {
            addCriterion("biaoqian =", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianNotEqualTo(String value) {
            addCriterion("biaoqian <>", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianGreaterThan(String value) {
            addCriterion("biaoqian >", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianGreaterThanOrEqualTo(String value) {
            addCriterion("biaoqian >=", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianLessThan(String value) {
            addCriterion("biaoqian <", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianLessThanOrEqualTo(String value) {
            addCriterion("biaoqian <=", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianLike(String value) {
            addCriterion("biaoqian like", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianNotLike(String value) {
            addCriterion("biaoqian not like", value, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianIn(List<String> values) {
            addCriterion("biaoqian in", values, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianNotIn(List<String> values) {
            addCriterion("biaoqian not in", values, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianBetween(String value1, String value2) {
            addCriterion("biaoqian between", value1, value2, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andBiaoqianNotBetween(String value1, String value2) {
            addCriterion("biaoqian not between", value1, value2, "biaoqian");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNull() {
            addCriterion("zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(Integer value) {
            addCriterion("zhuangtai =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(Integer value) {
            addCriterion("zhuangtai <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(Integer value) {
            addCriterion("zhuangtai >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuangtai >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(Integer value) {
            addCriterion("zhuangtai <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("zhuangtai <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<Integer> values) {
            addCriterion("zhuangtai in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<Integer> values) {
            addCriterion("zhuangtai not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtai between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtai not between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }
    }

    /**
     * loupan
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * loupan 2020-05-11
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