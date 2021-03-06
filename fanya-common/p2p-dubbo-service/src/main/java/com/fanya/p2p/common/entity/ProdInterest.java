package com.fanya.p2p.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProdInterest implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_interest.prod_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Long prodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_interest.interest_lifecycle_type
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private String interestLifecycleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_interest.first_interest_date
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Date firstInterestDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_interest.term_interest_date
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Date termInterestDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_interest.interest_rate
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private BigDecimal interestRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_interest.state
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_interest.created_time
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_interest.prod_id
     *
     * @return the value of prod_interest.prod_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Long getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_interest.prod_id
     *
     * @param prodId the value for prod_interest.prod_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_interest.interest_lifecycle_type
     *
     * @return the value of prod_interest.interest_lifecycle_type
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public String getInterestLifecycleType() {
        return interestLifecycleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_interest.interest_lifecycle_type
     *
     * @param interestLifecycleType the value for prod_interest.interest_lifecycle_type
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setInterestLifecycleType(String interestLifecycleType) {
        this.interestLifecycleType = interestLifecycleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_interest.first_interest_date
     *
     * @return the value of prod_interest.first_interest_date
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Date getFirstInterestDate() {
        return firstInterestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_interest.first_interest_date
     *
     * @param firstInterestDate the value for prod_interest.first_interest_date
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setFirstInterestDate(Date firstInterestDate) {
        this.firstInterestDate = firstInterestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_interest.term_interest_date
     *
     * @return the value of prod_interest.term_interest_date
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Date getTermInterestDate() {
        return termInterestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_interest.term_interest_date
     *
     * @param termInterestDate the value for prod_interest.term_interest_date
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setTermInterestDate(Date termInterestDate) {
        this.termInterestDate = termInterestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_interest.interest_rate
     *
     * @return the value of prod_interest.interest_rate
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_interest.interest_rate
     *
     * @param interestRate the value for prod_interest.interest_rate
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_interest.state
     *
     * @return the value of prod_interest.state
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_interest.state
     *
     * @param state the value for prod_interest.state
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_interest.created_time
     *
     * @return the value of prod_interest.created_time
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_interest.created_time
     *
     * @param createdTime the value for prod_interest.created_time
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdInterest prodInterest = (ProdInterest) o;

        if (prodId != null ? !prodId.equals(prodInterest.prodId) : prodInterest.prodId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return prodId != null ? prodId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProdInterest{" +
                "prodId=" + prodId +
                ", interestLifecycleType='" + interestLifecycleType + '\'' +
                ", firstInterestDate=" + firstInterestDate +
                ", termInterestDate=" + termInterestDate +
                ", interestRate=" + interestRate +
                ", state='" + state + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}