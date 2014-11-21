package com.fanya.p2p.common.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProdReturnExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public ProdReturnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
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
     * This method corresponds to the database table prod_return
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
     * This method corresponds to the database table prod_return
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return
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
     * This class corresponds to the database table prod_return
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

        public Criteria andReturnTypeIsNull() {
            addCriterion("return_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("return_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(String value) {
            addCriterion("return_type =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(String value) {
            addCriterion("return_type <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(String value) {
            addCriterion("return_type >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("return_type >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(String value) {
            addCriterion("return_type <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("return_type <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLike(String value) {
            addCriterion("return_type like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotLike(String value) {
            addCriterion("return_type not like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<String> values) {
            addCriterion("return_type in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<String> values) {
            addCriterion("return_type not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(String value1, String value2) {
            addCriterion("return_type between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(String value1, String value2) {
            addCriterion("return_type not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateIsNull() {
            addCriterion("first_return_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateIsNotNull() {
            addCriterion("first_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("first_return_date =", value, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("first_return_date <>", value, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("first_return_date >", value, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_return_date >=", value, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("first_return_date <", value, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_return_date <=", value, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("first_return_date in", values, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("first_return_date not in", values, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_return_date between", value1, value2, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andFirstReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_return_date not between", value1, value2, "firstReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateIsNull() {
            addCriterion("next_return_date is null");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateIsNotNull() {
            addCriterion("next_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("next_return_date =", value, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("next_return_date <>", value, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("next_return_date >", value, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("next_return_date >=", value, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("next_return_date <", value, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("next_return_date <=", value, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("next_return_date in", values, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("next_return_date not in", values, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("next_return_date between", value1, value2, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andNextReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("next_return_date not between", value1, value2, "nextReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateIsNull() {
            addCriterion("last_return_date is null");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateIsNotNull() {
            addCriterion("last_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_return_date =", value, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_return_date <>", value, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_return_date >", value, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_return_date >=", value, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("last_return_date <", value, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_return_date <=", value, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_return_date in", values, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_return_date not in", values, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_return_date between", value1, value2, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andLastReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_return_date not between", value1, value2, "lastReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateIsNull() {
            addCriterion("term_return_date is null");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateIsNotNull() {
            addCriterion("term_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("term_return_date =", value, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("term_return_date <>", value, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("term_return_date >", value, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("term_return_date >=", value, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("term_return_date <", value, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("term_return_date <=", value, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("term_return_date in", values, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("term_return_date not in", values, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("term_return_date between", value1, value2, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andTermReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("term_return_date not between", value1, value2, "termReturnDate");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalIsNull() {
            addCriterion("returned_principal is null");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalIsNotNull() {
            addCriterion("returned_principal is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalEqualTo(BigDecimal value) {
            addCriterion("returned_principal =", value, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("returned_principal <>", value, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalGreaterThan(BigDecimal value) {
            addCriterion("returned_principal >", value, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("returned_principal >=", value, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalLessThan(BigDecimal value) {
            addCriterion("returned_principal <", value, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("returned_principal <=", value, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalIn(List<BigDecimal> values) {
            addCriterion("returned_principal in", values, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("returned_principal not in", values, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("returned_principal between", value1, value2, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("returned_principal not between", value1, value2, "returnedPrincipal");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestIsNull() {
            addCriterion("returned_interest is null");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestIsNotNull() {
            addCriterion("returned_interest is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestEqualTo(BigDecimal value) {
            addCriterion("returned_interest =", value, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestNotEqualTo(BigDecimal value) {
            addCriterion("returned_interest <>", value, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestGreaterThan(BigDecimal value) {
            addCriterion("returned_interest >", value, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("returned_interest >=", value, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestLessThan(BigDecimal value) {
            addCriterion("returned_interest <", value, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("returned_interest <=", value, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestIn(List<BigDecimal> values) {
            addCriterion("returned_interest in", values, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestNotIn(List<BigDecimal> values) {
            addCriterion("returned_interest not in", values, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("returned_interest between", value1, value2, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andReturnedInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("returned_interest not between", value1, value2, "returnedInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalIsNull() {
            addCriterion("surplus_principal is null");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalIsNotNull() {
            addCriterion("surplus_principal is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalEqualTo(BigDecimal value) {
            addCriterion("surplus_principal =", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("surplus_principal <>", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalGreaterThan(BigDecimal value) {
            addCriterion("surplus_principal >", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus_principal >=", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalLessThan(BigDecimal value) {
            addCriterion("surplus_principal <", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus_principal <=", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalIn(List<BigDecimal> values) {
            addCriterion("surplus_principal in", values, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("surplus_principal not in", values, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus_principal between", value1, value2, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus_principal not between", value1, value2, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestIsNull() {
            addCriterion("surplus_interest is null");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestIsNotNull() {
            addCriterion("surplus_interest is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestEqualTo(BigDecimal value) {
            addCriterion("surplus_interest =", value, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestNotEqualTo(BigDecimal value) {
            addCriterion("surplus_interest <>", value, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestGreaterThan(BigDecimal value) {
            addCriterion("surplus_interest >", value, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus_interest >=", value, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestLessThan(BigDecimal value) {
            addCriterion("surplus_interest <", value, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus_interest <=", value, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestIn(List<BigDecimal> values) {
            addCriterion("surplus_interest in", values, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestNotIn(List<BigDecimal> values) {
            addCriterion("surplus_interest not in", values, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus_interest between", value1, value2, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus_interest not between", value1, value2, "surplusInterest");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table prod_return
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
     * This class corresponds to the database table prod_return
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