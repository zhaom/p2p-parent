package com.fanya.p2p.common.entity;

import java.io.Serializable;
import java.util.Date;

public class LoanWarrant implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long loanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.warrant_type
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String warrantType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.warrant_desc
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String warrantDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.warrant_url
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String warrantUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.created_by_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long createdByUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_warrant.remark
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.id
     *
     * @return the value of loan_warrant.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.id
     *
     * @param id the value for loan_warrant.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.loan_id
     *
     * @return the value of loan_warrant.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.loan_id
     *
     * @param loanId the value for loan_warrant.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.warrant_type
     *
     * @return the value of loan_warrant.warrant_type
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getWarrantType() {
        return warrantType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.warrant_type
     *
     * @param warrantType the value for loan_warrant.warrant_type
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setWarrantType(String warrantType) {
        this.warrantType = warrantType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.warrant_desc
     *
     * @return the value of loan_warrant.warrant_desc
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getWarrantDesc() {
        return warrantDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.warrant_desc
     *
     * @param warrantDesc the value for loan_warrant.warrant_desc
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setWarrantDesc(String warrantDesc) {
        this.warrantDesc = warrantDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.warrant_url
     *
     * @return the value of loan_warrant.warrant_url
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getWarrantUrl() {
        return warrantUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.warrant_url
     *
     * @param warrantUrl the value for loan_warrant.warrant_url
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setWarrantUrl(String warrantUrl) {
        this.warrantUrl = warrantUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.state
     *
     * @return the value of loan_warrant.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.state
     *
     * @param state the value for loan_warrant.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.created_time
     *
     * @return the value of loan_warrant.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.created_time
     *
     * @param createdTime the value for loan_warrant.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.created_by_user_id
     *
     * @return the value of loan_warrant.created_by_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.created_by_user_id
     *
     * @param createdByUserId the value for loan_warrant.created_by_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_warrant.remark
     *
     * @return the value of loan_warrant.remark
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_warrant.remark
     *
     * @param remark the value for loan_warrant.remark
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanWarrant loanWarrant = (LoanWarrant) o;

        if (id != null ? !id.equals(loanWarrant.id) : loanWarrant.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LoanWarrant{" +
                "id=" + id +
                ", loanId=" + loanId +
                ", warrantType='" + warrantType + '\'' +
                ", warrantDesc='" + warrantDesc + '\'' +
                ", warrantUrl='" + warrantUrl + '\'' +
                ", state='" + state + '\'' +
                ", createdByUserId=" + createdByUserId +
                ", remark='" + remark + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}