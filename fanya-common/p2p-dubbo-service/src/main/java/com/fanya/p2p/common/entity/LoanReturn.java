package com.fanya.p2p.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanReturn implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long loanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.return_type
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String returnType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.first_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date firstReturnDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.next_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date nextReturnDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.last_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date lastReturnDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.term_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date termReturnDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.returned_principal
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private BigDecimal returnedPrincipal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.returned_interest
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private BigDecimal returnedInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.surplus_principal
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private BigDecimal surplusPrincipal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.surplus_interest
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private BigDecimal surplusInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_return.last_update_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.loan_id
     *
     * @return the value of loan_return.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.loan_id
     *
     * @param loanId the value for loan_return.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.return_type
     *
     * @return the value of loan_return.return_type
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.return_type
     *
     * @param returnType the value for loan_return.return_type
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.first_return_date
     *
     * @return the value of loan_return.first_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getFirstReturnDate() {
        return firstReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.first_return_date
     *
     * @param firstReturnDate the value for loan_return.first_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setFirstReturnDate(Date firstReturnDate) {
        this.firstReturnDate = firstReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.next_return_date
     *
     * @return the value of loan_return.next_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getNextReturnDate() {
        return nextReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.next_return_date
     *
     * @param nextReturnDate the value for loan_return.next_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setNextReturnDate(Date nextReturnDate) {
        this.nextReturnDate = nextReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.last_return_date
     *
     * @return the value of loan_return.last_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getLastReturnDate() {
        return lastReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.last_return_date
     *
     * @param lastReturnDate the value for loan_return.last_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setLastReturnDate(Date lastReturnDate) {
        this.lastReturnDate = lastReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.term_return_date
     *
     * @return the value of loan_return.term_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getTermReturnDate() {
        return termReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.term_return_date
     *
     * @param termReturnDate the value for loan_return.term_return_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setTermReturnDate(Date termReturnDate) {
        this.termReturnDate = termReturnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.returned_principal
     *
     * @return the value of loan_return.returned_principal
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public BigDecimal getReturnedPrincipal() {
        return returnedPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.returned_principal
     *
     * @param returnedPrincipal the value for loan_return.returned_principal
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setReturnedPrincipal(BigDecimal returnedPrincipal) {
        this.returnedPrincipal = returnedPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.returned_interest
     *
     * @return the value of loan_return.returned_interest
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public BigDecimal getReturnedInterest() {
        return returnedInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.returned_interest
     *
     * @param returnedInterest the value for loan_return.returned_interest
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setReturnedInterest(BigDecimal returnedInterest) {
        this.returnedInterest = returnedInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.surplus_principal
     *
     * @return the value of loan_return.surplus_principal
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public BigDecimal getSurplusPrincipal() {
        return surplusPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.surplus_principal
     *
     * @param surplusPrincipal the value for loan_return.surplus_principal
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setSurplusPrincipal(BigDecimal surplusPrincipal) {
        this.surplusPrincipal = surplusPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.surplus_interest
     *
     * @return the value of loan_return.surplus_interest
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public BigDecimal getSurplusInterest() {
        return surplusInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.surplus_interest
     *
     * @param surplusInterest the value for loan_return.surplus_interest
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setSurplusInterest(BigDecimal surplusInterest) {
        this.surplusInterest = surplusInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.state
     *
     * @return the value of loan_return.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.state
     *
     * @param state the value for loan_return.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.created_time
     *
     * @return the value of loan_return.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.created_time
     *
     * @param createdTime the value for loan_return.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_return.last_update_time
     *
     * @return the value of loan_return.last_update_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_return.last_update_time
     *
     * @param lastUpdateTime the value for loan_return.last_update_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanReturn loanReturn = (LoanReturn) o;

        if (loanId != null ? !loanId.equals(loanReturn.loanId) : loanReturn.loanId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return loanId != null ? loanId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LoanReturn{" +
                "loanId=" + loanId +
                ", returnType='" + returnType  + '\'' +
                ", firstReturnDate=" + firstReturnDate +
                ", nextReturnDate=" + nextReturnDate +
                ", lastReturnDate=" + lastReturnDate +
                ", termReturnDate=" + termReturnDate +
                ", returnedPrincipal=" + returnedPrincipal +
                ", returnedInterest=" + returnedInterest +
                ", surplusPrincipal=" + surplusPrincipal +
                ", surplusInterest=" + surplusInterest +
                ", state='" + state + '\'' +
                ", createdTime=" + createdTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}