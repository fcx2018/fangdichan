package com.bz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YuYueExample {
    /**
     * yuyue
     */
    protected String orderByClause;

    /**
     * yuyue
     */
    protected boolean distinct;

    /**
     * yuyue
     */
    protected List<Criteria> oredCriteria;

    /**
     * yuyue
     */
    protected int limitStart = -1;

    /**
     * yuyue
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public YuYueExample() {
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
     * yuyue 2020-04-25
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

        public Criteria andLoupanmingIsNull() {
            addCriterion("loupanming is null");
            return (Criteria) this;
        }

        public Criteria andLoupanmingIsNotNull() {
            addCriterion("loupanming is not null");
            return (Criteria) this;
        }

        public Criteria andLoupanmingEqualTo(String value) {
            addCriterion("loupanming =", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingNotEqualTo(String value) {
            addCriterion("loupanming <>", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingGreaterThan(String value) {
            addCriterion("loupanming >", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingGreaterThanOrEqualTo(String value) {
            addCriterion("loupanming >=", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingLessThan(String value) {
            addCriterion("loupanming <", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingLessThanOrEqualTo(String value) {
            addCriterion("loupanming <=", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingLike(String value) {
            addCriterion("loupanming like", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingNotLike(String value) {
            addCriterion("loupanming not like", value, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingIn(List<String> values) {
            addCriterion("loupanming in", values, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingNotIn(List<String> values) {
            addCriterion("loupanming not in", values, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingBetween(String value1, String value2) {
            addCriterion("loupanming between", value1, value2, "loupanming");
            return (Criteria) this;
        }

        public Criteria andLoupanmingNotBetween(String value1, String value2) {
            addCriterion("loupanming not between", value1, value2, "loupanming");
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

        public Criteria andDaofangdanIsNull() {
            addCriterion("daofangdan is null");
            return (Criteria) this;
        }

        public Criteria andDaofangdanIsNotNull() {
            addCriterion("daofangdan is not null");
            return (Criteria) this;
        }

        public Criteria andDaofangdanEqualTo(String value) {
            addCriterion("daofangdan =", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanNotEqualTo(String value) {
            addCriterion("daofangdan <>", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanGreaterThan(String value) {
            addCriterion("daofangdan >", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanGreaterThanOrEqualTo(String value) {
            addCriterion("daofangdan >=", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanLessThan(String value) {
            addCriterion("daofangdan <", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanLessThanOrEqualTo(String value) {
            addCriterion("daofangdan <=", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanLike(String value) {
            addCriterion("daofangdan like", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanNotLike(String value) {
            addCriterion("daofangdan not like", value, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanIn(List<String> values) {
            addCriterion("daofangdan in", values, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanNotIn(List<String> values) {
            addCriterion("daofangdan not in", values, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanBetween(String value1, String value2) {
            addCriterion("daofangdan between", value1, value2, "daofangdan");
            return (Criteria) this;
        }

        public Criteria andDaofangdanNotBetween(String value1, String value2) {
            addCriterion("daofangdan not between", value1, value2, "daofangdan");
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

        public Criteria andShijianIsNull() {
            addCriterion("shijian is null");
            return (Criteria) this;
        }

        public Criteria andShijianIsNotNull() {
            addCriterion("shijian is not null");
            return (Criteria) this;
        }

        public Criteria andShijianEqualTo(Date value) {
            addCriterion("shijian =", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotEqualTo(Date value) {
            addCriterion("shijian <>", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThan(Date value) {
            addCriterion("shijian >", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThanOrEqualTo(Date value) {
            addCriterion("shijian >=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThan(Date value) {
            addCriterion("shijian <", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThanOrEqualTo(Date value) {
            addCriterion("shijian <=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianIn(List<Date> values) {
            addCriterion("shijian in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotIn(List<Date> values) {
            addCriterion("shijian not in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianBetween(Date value1, Date value2) {
            addCriterion("shijian between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotBetween(Date value1, Date value2) {
            addCriterion("shijian not between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianIsNull() {
            addCriterion("daofangshijian is null");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianIsNotNull() {
            addCriterion("daofangshijian is not null");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianEqualTo(Date value) {
            addCriterion("daofangshijian =", value, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianNotEqualTo(Date value) {
            addCriterion("daofangshijian <>", value, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianGreaterThan(Date value) {
            addCriterion("daofangshijian >", value, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("daofangshijian >=", value, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianLessThan(Date value) {
            addCriterion("daofangshijian <", value, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianLessThanOrEqualTo(Date value) {
            addCriterion("daofangshijian <=", value, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianIn(List<Date> values) {
            addCriterion("daofangshijian in", values, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianNotIn(List<Date> values) {
            addCriterion("daofangshijian not in", values, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianBetween(Date value1, Date value2) {
            addCriterion("daofangshijian between", value1, value2, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshijianNotBetween(Date value1, Date value2) {
            addCriterion("daofangshijian not between", value1, value2, "daofangshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianIsNull() {
            addCriterion("daofangshenheshijian is null");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianIsNotNull() {
            addCriterion("daofangshenheshijian is not null");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianEqualTo(Date value) {
            addCriterion("daofangshenheshijian =", value, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianNotEqualTo(Date value) {
            addCriterion("daofangshenheshijian <>", value, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianGreaterThan(Date value) {
            addCriterion("daofangshenheshijian >", value, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("daofangshenheshijian >=", value, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianLessThan(Date value) {
            addCriterion("daofangshenheshijian <", value, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianLessThanOrEqualTo(Date value) {
            addCriterion("daofangshenheshijian <=", value, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianIn(List<Date> values) {
            addCriterion("daofangshenheshijian in", values, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianNotIn(List<Date> values) {
            addCriterion("daofangshenheshijian not in", values, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianBetween(Date value1, Date value2) {
            addCriterion("daofangshenheshijian between", value1, value2, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheshijianNotBetween(Date value1, Date value2) {
            addCriterion("daofangshenheshijian not between", value1, value2, "daofangshenheshijian");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidIsNull() {
            addCriterion("daofangshenheid is null");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidIsNotNull() {
            addCriterion("daofangshenheid is not null");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidEqualTo(Integer value) {
            addCriterion("daofangshenheid =", value, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidNotEqualTo(Integer value) {
            addCriterion("daofangshenheid <>", value, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidGreaterThan(Integer value) {
            addCriterion("daofangshenheid >", value, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("daofangshenheid >=", value, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidLessThan(Integer value) {
            addCriterion("daofangshenheid <", value, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidLessThanOrEqualTo(Integer value) {
            addCriterion("daofangshenheid <=", value, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidIn(List<Integer> values) {
            addCriterion("daofangshenheid in", values, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidNotIn(List<Integer> values) {
            addCriterion("daofangshenheid not in", values, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidBetween(Integer value1, Integer value2) {
            addCriterion("daofangshenheid between", value1, value2, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andDaofangshenheidNotBetween(Integer value1, Integer value2) {
            addCriterion("daofangshenheid not between", value1, value2, "daofangshenheid");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianIsNull() {
            addCriterion("changjiaoshijian is null");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianIsNotNull() {
            addCriterion("changjiaoshijian is not null");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianEqualTo(Date value) {
            addCriterion("changjiaoshijian =", value, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianNotEqualTo(Date value) {
            addCriterion("changjiaoshijian <>", value, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianGreaterThan(Date value) {
            addCriterion("changjiaoshijian >", value, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("changjiaoshijian >=", value, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianLessThan(Date value) {
            addCriterion("changjiaoshijian <", value, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianLessThanOrEqualTo(Date value) {
            addCriterion("changjiaoshijian <=", value, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianIn(List<Date> values) {
            addCriterion("changjiaoshijian in", values, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianNotIn(List<Date> values) {
            addCriterion("changjiaoshijian not in", values, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianBetween(Date value1, Date value2) {
            addCriterion("changjiaoshijian between", value1, value2, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChangjiaoshijianNotBetween(Date value1, Date value2) {
            addCriterion("changjiaoshijian not between", value1, value2, "changjiaoshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianIsNull() {
            addCriterion("chengjiaoshenheshijian is null");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianIsNotNull() {
            addCriterion("chengjiaoshenheshijian is not null");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianEqualTo(Date value) {
            addCriterion("chengjiaoshenheshijian =", value, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianNotEqualTo(Date value) {
            addCriterion("chengjiaoshenheshijian <>", value, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianGreaterThan(Date value) {
            addCriterion("chengjiaoshenheshijian >", value, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("chengjiaoshenheshijian >=", value, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianLessThan(Date value) {
            addCriterion("chengjiaoshenheshijian <", value, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianLessThanOrEqualTo(Date value) {
            addCriterion("chengjiaoshenheshijian <=", value, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianIn(List<Date> values) {
            addCriterion("chengjiaoshenheshijian in", values, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianNotIn(List<Date> values) {
            addCriterion("chengjiaoshenheshijian not in", values, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianBetween(Date value1, Date value2) {
            addCriterion("chengjiaoshenheshijian between", value1, value2, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheshijianNotBetween(Date value1, Date value2) {
            addCriterion("chengjiaoshenheshijian not between", value1, value2, "chengjiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidIsNull() {
            addCriterion("chengjiaoshenheid is null");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidIsNotNull() {
            addCriterion("chengjiaoshenheid is not null");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidEqualTo(Integer value) {
            addCriterion("chengjiaoshenheid =", value, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidNotEqualTo(Integer value) {
            addCriterion("chengjiaoshenheid <>", value, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidGreaterThan(Integer value) {
            addCriterion("chengjiaoshenheid >", value, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chengjiaoshenheid >=", value, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidLessThan(Integer value) {
            addCriterion("chengjiaoshenheid <", value, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidLessThanOrEqualTo(Integer value) {
            addCriterion("chengjiaoshenheid <=", value, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidIn(List<Integer> values) {
            addCriterion("chengjiaoshenheid in", values, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidNotIn(List<Integer> values) {
            addCriterion("chengjiaoshenheid not in", values, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidBetween(Integer value1, Integer value2) {
            addCriterion("chengjiaoshenheid between", value1, value2, "chengjiaoshenheid");
            return (Criteria) this;
        }

        public Criteria andChengjiaoshenheidNotBetween(Integer value1, Integer value2) {
            addCriterion("chengjiaoshenheid not between", value1, value2, "chengjiaoshenheid");
            return (Criteria) this;
        }
    }

    /**
     * yuyue
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * yuyue 2020-04-25
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