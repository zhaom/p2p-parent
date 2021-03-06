package com.fanya.p2p.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProdCollectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public ProdCollectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProdIdIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Long value) {
            addCriterion("prod_id =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Long value) {
            addCriterion("prod_id <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Long value) {
            addCriterion("prod_id >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prod_id >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Long value) {
            addCriterion("prod_id <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Long value) {
            addCriterion("prod_id <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Long> values) {
            addCriterion("prod_id in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Long> values) {
            addCriterion("prod_id not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Long value1, Long value2) {
            addCriterion("prod_id between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Long value1, Long value2) {
            addCriterion("prod_id not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeIsNull() {
            addCriterion("reserve_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeIsNotNull() {
            addCriterion("reserve_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_begin_time =", value, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_begin_time <>", value, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("reserve_begin_time >", value, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_begin_time >=", value, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("reserve_begin_time <", value, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_begin_time <=", value, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("reserve_begin_time in", values, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("reserve_begin_time not in", values, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reserve_begin_time between", value1, value2, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reserve_begin_time not between", value1, value2, "reserveBeginTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeIsNull() {
            addCriterion("reserve_end_time is null");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeIsNotNull() {
            addCriterion("reserve_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_end_time =", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_end_time <>", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("reserve_end_time >", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_end_time >=", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("reserve_end_time <", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_end_time <=", value, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("reserve_end_time in", values, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("reserve_end_time not in", values, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reserve_end_time between", value1, value2, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReserveEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reserve_end_time not between", value1, value2, "reserveEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeIsNull() {
            addCriterion("release_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeIsNotNull() {
            addCriterion("release_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("release_begin_time =", value, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_begin_time <>", value, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("release_begin_time >", value, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_begin_time >=", value, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("release_begin_time <", value, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_begin_time <=", value, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("release_begin_time in", values, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_begin_time not in", values, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_begin_time between", value1, value2, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_begin_time not between", value1, value2, "releaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeIsNull() {
            addCriterion("release_end_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeIsNotNull() {
            addCriterion("release_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("release_end_time =", value, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_end_time <>", value, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("release_end_time >", value, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_end_time >=", value, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("release_end_time <", value, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_end_time <=", value, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("release_end_time in", values, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_end_time not in", values, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_end_time between", value1, value2, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andReleaseEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_end_time not between", value1, value2, "releaseEndTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNull() {
            addCriterion("online_time is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNotNull() {
            addCriterion("online_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeEqualTo(Date value) {
            addCriterion("online_time =", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotEqualTo(Date value) {
            addCriterion("online_time <>", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThan(Date value) {
            addCriterion("online_time >", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("online_time >=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThan(Date value) {
            addCriterion("online_time <", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("online_time <=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIn(List<Date> values) {
            addCriterion("online_time in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotIn(List<Date> values) {
            addCriterion("online_time not in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeBetween(Date value1, Date value2) {
            addCriterion("online_time between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("online_time not between", value1, value2, "onlineTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prod_collect
     *
     * @mbggenerated do_not_delete_during_merge Wed Nov 05 12:11:21 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
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