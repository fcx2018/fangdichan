package com.bz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZiJinMingXiExample {
    /**
     * zijinmingxi
     */
    protected String orderByClause;

    /**
     * zijinmingxi
     */
    protected boolean distinct;

    /**
     * zijinmingxi
     */
    protected List<Criteria> oredCriteria;

    /**
     * zijinmingxi
     */
    protected int limitStart = -1;

    /**
     * zijinmingxi
     */
    protected int count = -1;

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public ZiJinMingXiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-05-12
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
     * @mbggenerated 2020-05-12
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public void setCount(int count) {
        this.count=count;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @mbggenerated 2020-05-12
     */
    public Criteria getCriteria() {
        if (oredCriteria.size() != 0) {return oredCriteria.get(0);}
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * zijinmingxi 2020-05-12
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

        public Criteria andUsernichengIsNull() {
            addCriterion("usernicheng is null");
            return (Criteria) this;
        }

        public Criteria andUsernichengIsNotNull() {
            addCriterion("usernicheng is not null");
            return (Criteria) this;
        }

        public Criteria andUsernichengEqualTo(String value) {
            addCriterion("usernicheng =", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengNotEqualTo(String value) {
            addCriterion("usernicheng <>", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengGreaterThan(String value) {
            addCriterion("usernicheng >", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengGreaterThanOrEqualTo(String value) {
            addCriterion("usernicheng >=", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengLessThan(String value) {
            addCriterion("usernicheng <", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengLessThanOrEqualTo(String value) {
            addCriterion("usernicheng <=", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengLike(String value) {
            addCriterion("usernicheng like", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengNotLike(String value) {
            addCriterion("usernicheng not like", value, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengIn(List<String> values) {
            addCriterion("usernicheng in", values, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengNotIn(List<String> values) {
            addCriterion("usernicheng not in", values, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengBetween(String value1, String value2) {
            addCriterion("usernicheng between", value1, value2, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andUsernichengNotBetween(String value1, String value2) {
            addCriterion("usernicheng not between", value1, value2, "usernicheng");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNull() {
            addCriterion("keyid is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("keyid is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(Integer value) {
            addCriterion("keyid =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(Integer value) {
            addCriterion("keyid <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(Integer value) {
            addCriterion("keyid >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("keyid >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(Integer value) {
            addCriterion("keyid <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(Integer value) {
            addCriterion("keyid <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<Integer> values) {
            addCriterion("keyid in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<Integer> values) {
            addCriterion("keyid not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(Integer value1, Integer value2) {
            addCriterion("keyid between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(Integer value1, Integer value2) {
            addCriterion("keyid not between", value1, value2, "keyid");
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

        public Criteria andAdminidIsNull() {
            addCriterion("adminid is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminid is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminid =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminid <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminid >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminid >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminid <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminid <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminid in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminid not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminid between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminid not between", value1, value2, "adminid");
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
     * zijinmingxi
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * zijinmingxi 2020-05-12
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