package com.bz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TiXianJiLuExample {
    /**
     * tixianjilu
     */
    protected String orderByClause;

    /**
     * tixianjilu
     */
    protected boolean distinct;

    /**
     * tixianjilu
     */
    protected List<Criteria> oredCriteria;

    /**
     * tixianjilu
     */
    protected int limitStart = -1;

    /**
     * tixianjilu
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public TiXianJiLuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-04-30
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
     * @mbggenerated 2020-04-30
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public void setCount(int count) {
        this.count=count;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @mbggenerated 2020-04-30
     */
    public Criteria getCriteria() {
        if (oredCriteria.size() != 0) {return oredCriteria.get(0);}
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * tixianjilu 2020-04-30
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andJineIsNull() {
            addCriterion("jine is null");
            return (Criteria) this;
        }

        public Criteria andJineIsNotNull() {
            addCriterion("jine is not null");
            return (Criteria) this;
        }

        public Criteria andJineEqualTo(Double value) {
            addCriterion("jine =", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotEqualTo(Double value) {
            addCriterion("jine <>", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineGreaterThan(Double value) {
            addCriterion("jine >", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineGreaterThanOrEqualTo(Double value) {
            addCriterion("jine >=", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineLessThan(Double value) {
            addCriterion("jine <", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineLessThanOrEqualTo(Double value) {
            addCriterion("jine <=", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineIn(List<Double> values) {
            addCriterion("jine in", values, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotIn(List<Double> values) {
            addCriterion("jine not in", values, "jine");
            return (Criteria) this;
        }

        public Criteria andJineBetween(Double value1, Double value2) {
            addCriterion("jine between", value1, value2, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotBetween(Double value1, Double value2) {
            addCriterion("jine not between", value1, value2, "jine");
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

        public Criteria andLeixingIsNull() {
            addCriterion("leixing is null");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNotNull() {
            addCriterion("leixing is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingEqualTo(Integer value) {
            addCriterion("leixing =", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotEqualTo(Integer value) {
            addCriterion("leixing <>", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThan(Integer value) {
            addCriterion("leixing >", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("leixing >=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThan(Integer value) {
            addCriterion("leixing <", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThanOrEqualTo(Integer value) {
            addCriterion("leixing <=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingIn(List<Integer> values) {
            addCriterion("leixing in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotIn(List<Integer> values) {
            addCriterion("leixing not in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingBetween(Integer value1, Integer value2) {
            addCriterion("leixing between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotBetween(Integer value1, Integer value2) {
            addCriterion("leixing not between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNull() {
            addCriterion("chuangjianshijian is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNotNull() {
            addCriterion("chuangjianshijian is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianEqualTo(Date value) {
            addCriterion("chuangjianshijian =", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotEqualTo(Date value) {
            addCriterion("chuangjianshijian <>", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThan(Date value) {
            addCriterion("chuangjianshijian >", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("chuangjianshijian >=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThan(Date value) {
            addCriterion("chuangjianshijian <", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThanOrEqualTo(Date value) {
            addCriterion("chuangjianshijian <=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIn(List<Date> values) {
            addCriterion("chuangjianshijian in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotIn(List<Date> values) {
            addCriterion("chuangjianshijian not in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianBetween(Date value1, Date value2) {
            addCriterion("chuangjianshijian between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotBetween(Date value1, Date value2) {
            addCriterion("chuangjianshijian not between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIsNull() {
            addCriterion("shenheshijian is null");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIsNotNull() {
            addCriterion("shenheshijian is not null");
            return (Criteria) this;
        }

        public Criteria andShenheshijianEqualTo(Date value) {
            addCriterion("shenheshijian =", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotEqualTo(Date value) {
            addCriterion("shenheshijian <>", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianGreaterThan(Date value) {
            addCriterion("shenheshijian >", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("shenheshijian >=", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianLessThan(Date value) {
            addCriterion("shenheshijian <", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianLessThanOrEqualTo(Date value) {
            addCriterion("shenheshijian <=", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIn(List<Date> values) {
            addCriterion("shenheshijian in", values, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotIn(List<Date> values) {
            addCriterion("shenheshijian not in", values, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianBetween(Date value1, Date value2) {
            addCriterion("shenheshijian between", value1, value2, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotBetween(Date value1, Date value2) {
            addCriterion("shenheshijian not between", value1, value2, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheidIsNull() {
            addCriterion("shenheid is null");
            return (Criteria) this;
        }

        public Criteria andShenheidIsNotNull() {
            addCriterion("shenheid is not null");
            return (Criteria) this;
        }

        public Criteria andShenheidEqualTo(Integer value) {
            addCriterion("shenheid =", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidNotEqualTo(Integer value) {
            addCriterion("shenheid <>", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidGreaterThan(Integer value) {
            addCriterion("shenheid >", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shenheid >=", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidLessThan(Integer value) {
            addCriterion("shenheid <", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidLessThanOrEqualTo(Integer value) {
            addCriterion("shenheid <=", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidIn(List<Integer> values) {
            addCriterion("shenheid in", values, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidNotIn(List<Integer> values) {
            addCriterion("shenheid not in", values, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidBetween(Integer value1, Integer value2) {
            addCriterion("shenheid between", value1, value2, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidNotBetween(Integer value1, Integer value2) {
            addCriterion("shenheid not between", value1, value2, "shenheid");
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

        public Criteria andTupianIsNull() {
            addCriterion("tupian is null");
            return (Criteria) this;
        }

        public Criteria andTupianIsNotNull() {
            addCriterion("tupian is not null");
            return (Criteria) this;
        }

        public Criteria andTupianEqualTo(String value) {
            addCriterion("tupian =", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotEqualTo(String value) {
            addCriterion("tupian <>", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianGreaterThan(String value) {
            addCriterion("tupian >", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianGreaterThanOrEqualTo(String value) {
            addCriterion("tupian >=", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianLessThan(String value) {
            addCriterion("tupian <", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianLessThanOrEqualTo(String value) {
            addCriterion("tupian <=", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianLike(String value) {
            addCriterion("tupian like", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotLike(String value) {
            addCriterion("tupian not like", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianIn(List<String> values) {
            addCriterion("tupian in", values, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotIn(List<String> values) {
            addCriterion("tupian not in", values, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianBetween(String value1, String value2) {
            addCriterion("tupian between", value1, value2, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotBetween(String value1, String value2) {
            addCriterion("tupian not between", value1, value2, "tupian");
            return (Criteria) this;
        }

        public Criteria andYinhangidIsNull() {
            addCriterion("yinhangid is null");
            return (Criteria) this;
        }

        public Criteria andYinhangidIsNotNull() {
            addCriterion("yinhangid is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangidEqualTo(Integer value) {
            addCriterion("yinhangid =", value, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidNotEqualTo(Integer value) {
            addCriterion("yinhangid <>", value, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidGreaterThan(Integer value) {
            addCriterion("yinhangid >", value, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yinhangid >=", value, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidLessThan(Integer value) {
            addCriterion("yinhangid <", value, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidLessThanOrEqualTo(Integer value) {
            addCriterion("yinhangid <=", value, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidIn(List<Integer> values) {
            addCriterion("yinhangid in", values, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidNotIn(List<Integer> values) {
            addCriterion("yinhangid not in", values, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidBetween(Integer value1, Integer value2) {
            addCriterion("yinhangid between", value1, value2, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangidNotBetween(Integer value1, Integer value2) {
            addCriterion("yinhangid not between", value1, value2, "yinhangid");
            return (Criteria) this;
        }

        public Criteria andYinhangmingIsNull() {
            addCriterion("yinhangming is null");
            return (Criteria) this;
        }

        public Criteria andYinhangmingIsNotNull() {
            addCriterion("yinhangming is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangmingEqualTo(String value) {
            addCriterion("yinhangming =", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingNotEqualTo(String value) {
            addCriterion("yinhangming <>", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingGreaterThan(String value) {
            addCriterion("yinhangming >", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingGreaterThanOrEqualTo(String value) {
            addCriterion("yinhangming >=", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingLessThan(String value) {
            addCriterion("yinhangming <", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingLessThanOrEqualTo(String value) {
            addCriterion("yinhangming <=", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingLike(String value) {
            addCriterion("yinhangming like", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingNotLike(String value) {
            addCriterion("yinhangming not like", value, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingIn(List<String> values) {
            addCriterion("yinhangming in", values, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingNotIn(List<String> values) {
            addCriterion("yinhangming not in", values, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingBetween(String value1, String value2) {
            addCriterion("yinhangming between", value1, value2, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andYinhangmingNotBetween(String value1, String value2) {
            addCriterion("yinhangming not between", value1, value2, "yinhangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingIsNull() {
            addCriterion("zhihangming is null");
            return (Criteria) this;
        }

        public Criteria andZhihangmingIsNotNull() {
            addCriterion("zhihangming is not null");
            return (Criteria) this;
        }

        public Criteria andZhihangmingEqualTo(String value) {
            addCriterion("zhihangming =", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingNotEqualTo(String value) {
            addCriterion("zhihangming <>", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingGreaterThan(String value) {
            addCriterion("zhihangming >", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingGreaterThanOrEqualTo(String value) {
            addCriterion("zhihangming >=", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingLessThan(String value) {
            addCriterion("zhihangming <", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingLessThanOrEqualTo(String value) {
            addCriterion("zhihangming <=", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingLike(String value) {
            addCriterion("zhihangming like", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingNotLike(String value) {
            addCriterion("zhihangming not like", value, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingIn(List<String> values) {
            addCriterion("zhihangming in", values, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingNotIn(List<String> values) {
            addCriterion("zhihangming not in", values, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingBetween(String value1, String value2) {
            addCriterion("zhihangming between", value1, value2, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andZhihangmingNotBetween(String value1, String value2) {
            addCriterion("zhihangming not between", value1, value2, "zhihangming");
            return (Criteria) this;
        }

        public Criteria andYinhangkaIsNull() {
            addCriterion("yinhangka is null");
            return (Criteria) this;
        }

        public Criteria andYinhangkaIsNotNull() {
            addCriterion("yinhangka is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangkaEqualTo(String value) {
            addCriterion("yinhangka =", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaNotEqualTo(String value) {
            addCriterion("yinhangka <>", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaGreaterThan(String value) {
            addCriterion("yinhangka >", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaGreaterThanOrEqualTo(String value) {
            addCriterion("yinhangka >=", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaLessThan(String value) {
            addCriterion("yinhangka <", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaLessThanOrEqualTo(String value) {
            addCriterion("yinhangka <=", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaLike(String value) {
            addCriterion("yinhangka like", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaNotLike(String value) {
            addCriterion("yinhangka not like", value, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaIn(List<String> values) {
            addCriterion("yinhangka in", values, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaNotIn(List<String> values) {
            addCriterion("yinhangka not in", values, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaBetween(String value1, String value2) {
            addCriterion("yinhangka between", value1, value2, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYinhangkaNotBetween(String value1, String value2) {
            addCriterion("yinhangka not between", value1, value2, "yinhangka");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingIsNull() {
            addCriterion("yuliuxingming is null");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingIsNotNull() {
            addCriterion("yuliuxingming is not null");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingEqualTo(String value) {
            addCriterion("yuliuxingming =", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingNotEqualTo(String value) {
            addCriterion("yuliuxingming <>", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingGreaterThan(String value) {
            addCriterion("yuliuxingming >", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("yuliuxingming >=", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingLessThan(String value) {
            addCriterion("yuliuxingming <", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingLessThanOrEqualTo(String value) {
            addCriterion("yuliuxingming <=", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingLike(String value) {
            addCriterion("yuliuxingming like", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingNotLike(String value) {
            addCriterion("yuliuxingming not like", value, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingIn(List<String> values) {
            addCriterion("yuliuxingming in", values, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingNotIn(List<String> values) {
            addCriterion("yuliuxingming not in", values, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingBetween(String value1, String value2) {
            addCriterion("yuliuxingming between", value1, value2, "yuliuxingming");
            return (Criteria) this;
        }

        public Criteria andYuliuxingmingNotBetween(String value1, String value2) {
            addCriterion("yuliuxingming not between", value1, value2, "yuliuxingming");
            return (Criteria) this;
        }
    }

    /**
     * tixianjilu
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tixianjilu 2020-04-30
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