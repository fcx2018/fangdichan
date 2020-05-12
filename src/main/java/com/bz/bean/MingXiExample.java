package com.bz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MingXiExample {
    /**
     * mingxi
     */
    protected String orderByClause;

    /**
     * mingxi
     */
    protected boolean distinct;

    /**
     * mingxi
     */
    protected List<Criteria> oredCriteria;

    /**
     * mingxi
     */
    protected int limitStart = -1;

    /**
     * mingxi
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-04-25
     */
    public MingXiExample() {
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
     * mingxi 2020-04-25
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

        public Criteria andIsfxjztIsNull() {
            addCriterion("isfxjzt is null");
            return (Criteria) this;
        }

        public Criteria andIsfxjztIsNotNull() {
            addCriterion("isfxjzt is not null");
            return (Criteria) this;
        }

        public Criteria andIsfxjztEqualTo(Integer value) {
            addCriterion("isfxjzt =", value, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztNotEqualTo(Integer value) {
            addCriterion("isfxjzt <>", value, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztGreaterThan(Integer value) {
            addCriterion("isfxjzt >", value, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztGreaterThanOrEqualTo(Integer value) {
            addCriterion("isfxjzt >=", value, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztLessThan(Integer value) {
            addCriterion("isfxjzt <", value, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztLessThanOrEqualTo(Integer value) {
            addCriterion("isfxjzt <=", value, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztIn(List<Integer> values) {
            addCriterion("isfxjzt in", values, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztNotIn(List<Integer> values) {
            addCriterion("isfxjzt not in", values, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztBetween(Integer value1, Integer value2) {
            addCriterion("isfxjzt between", value1, value2, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andIsfxjztNotBetween(Integer value1, Integer value2) {
            addCriterion("isfxjzt not between", value1, value2, "isfxjzt");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinIsNull() {
            addCriterion("fenxiangjin is null");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinIsNotNull() {
            addCriterion("fenxiangjin is not null");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinEqualTo(Double value) {
            addCriterion("fenxiangjin =", value, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinNotEqualTo(Double value) {
            addCriterion("fenxiangjin <>", value, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinGreaterThan(Double value) {
            addCriterion("fenxiangjin >", value, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinGreaterThanOrEqualTo(Double value) {
            addCriterion("fenxiangjin >=", value, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinLessThan(Double value) {
            addCriterion("fenxiangjin <", value, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinLessThanOrEqualTo(Double value) {
            addCriterion("fenxiangjin <=", value, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinIn(List<Double> values) {
            addCriterion("fenxiangjin in", values, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinNotIn(List<Double> values) {
            addCriterion("fenxiangjin not in", values, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinBetween(Double value1, Double value2) {
            addCriterion("fenxiangjin between", value1, value2, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andFenxiangjinNotBetween(Double value1, Double value2) {
            addCriterion("fenxiangjin not between", value1, value2, "fenxiangjin");
            return (Criteria) this;
        }

        public Criteria andIsyjztIsNull() {
            addCriterion("isyjzt is null");
            return (Criteria) this;
        }

        public Criteria andIsyjztIsNotNull() {
            addCriterion("isyjzt is not null");
            return (Criteria) this;
        }

        public Criteria andIsyjztEqualTo(Integer value) {
            addCriterion("isyjzt =", value, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztNotEqualTo(Integer value) {
            addCriterion("isyjzt <>", value, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztGreaterThan(Integer value) {
            addCriterion("isyjzt >", value, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztGreaterThanOrEqualTo(Integer value) {
            addCriterion("isyjzt >=", value, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztLessThan(Integer value) {
            addCriterion("isyjzt <", value, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztLessThanOrEqualTo(Integer value) {
            addCriterion("isyjzt <=", value, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztIn(List<Integer> values) {
            addCriterion("isyjzt in", values, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztNotIn(List<Integer> values) {
            addCriterion("isyjzt not in", values, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztBetween(Integer value1, Integer value2) {
            addCriterion("isyjzt between", value1, value2, "isyjzt");
            return (Criteria) this;
        }

        public Criteria andIsyjztNotBetween(Integer value1, Integer value2) {
            addCriterion("isyjzt not between", value1, value2, "isyjzt");
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

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFanyongidIsNull() {
            addCriterion("fanyongid is null");
            return (Criteria) this;
        }

        public Criteria andFanyongidIsNotNull() {
            addCriterion("fanyongid is not null");
            return (Criteria) this;
        }

        public Criteria andFanyongidEqualTo(Integer value) {
            addCriterion("fanyongid =", value, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidNotEqualTo(Integer value) {
            addCriterion("fanyongid <>", value, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidGreaterThan(Integer value) {
            addCriterion("fanyongid >", value, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fanyongid >=", value, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidLessThan(Integer value) {
            addCriterion("fanyongid <", value, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidLessThanOrEqualTo(Integer value) {
            addCriterion("fanyongid <=", value, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidIn(List<Integer> values) {
            addCriterion("fanyongid in", values, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidNotIn(List<Integer> values) {
            addCriterion("fanyongid not in", values, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidBetween(Integer value1, Integer value2) {
            addCriterion("fanyongid between", value1, value2, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongidNotBetween(Integer value1, Integer value2) {
            addCriterion("fanyongid not between", value1, value2, "fanyongid");
            return (Criteria) this;
        }

        public Criteria andFanyongnameIsNull() {
            addCriterion("fanyongname is null");
            return (Criteria) this;
        }

        public Criteria andFanyongnameIsNotNull() {
            addCriterion("fanyongname is not null");
            return (Criteria) this;
        }

        public Criteria andFanyongnameEqualTo(String value) {
            addCriterion("fanyongname =", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameNotEqualTo(String value) {
            addCriterion("fanyongname <>", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameGreaterThan(String value) {
            addCriterion("fanyongname >", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameGreaterThanOrEqualTo(String value) {
            addCriterion("fanyongname >=", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameLessThan(String value) {
            addCriterion("fanyongname <", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameLessThanOrEqualTo(String value) {
            addCriterion("fanyongname <=", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameLike(String value) {
            addCriterion("fanyongname like", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameNotLike(String value) {
            addCriterion("fanyongname not like", value, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameIn(List<String> values) {
            addCriterion("fanyongname in", values, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameNotIn(List<String> values) {
            addCriterion("fanyongname not in", values, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameBetween(String value1, String value2) {
            addCriterion("fanyongname between", value1, value2, "fanyongname");
            return (Criteria) this;
        }

        public Criteria andFanyongnameNotBetween(String value1, String value2) {
            addCriterion("fanyongname not between", value1, value2, "fanyongname");
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
    }

    /**
     * mingxi
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * mingxi 2020-04-25
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