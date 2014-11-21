package com.fanya.p2p.common.entity;

import java.io.Serializable;
import java.util.Date;

public class ProdAuditFlow implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.prod_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Long prodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.current_user_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Long currentUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.next_user_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Long nextUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.next_role_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Long nextRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.note
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.audit_result
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private String auditResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prod_audit_flow.created_time
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.id
     *
     * @return the value of prod_audit_flow.id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.id
     *
     * @param id the value for prod_audit_flow.id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.prod_id
     *
     * @return the value of prod_audit_flow.prod_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Long getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.prod_id
     *
     * @param prodId the value for prod_audit_flow.prod_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.current_user_id
     *
     * @return the value of prod_audit_flow.current_user_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Long getCurrentUserId() {
        return currentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.current_user_id
     *
     * @param currentUserId the value for prod_audit_flow.current_user_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setCurrentUserId(Long currentUserId) {
        this.currentUserId = currentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.next_user_id
     *
     * @return the value of prod_audit_flow.next_user_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Long getNextUserId() {
        return nextUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.next_user_id
     *
     * @param nextUserId the value for prod_audit_flow.next_user_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setNextUserId(Long nextUserId) {
        this.nextUserId = nextUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.next_role_id
     *
     * @return the value of prod_audit_flow.next_role_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Long getNextRoleId() {
        return nextRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.next_role_id
     *
     * @param nextRoleId the value for prod_audit_flow.next_role_id
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setNextRoleId(Long nextRoleId) {
        this.nextRoleId = nextRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.note
     *
     * @return the value of prod_audit_flow.note
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.note
     *
     * @param note the value for prod_audit_flow.note
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.audit_result
     *
     * @return the value of prod_audit_flow.audit_result
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public String getAuditResult() {
        return auditResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.audit_result
     *
     * @param auditResult the value for prod_audit_flow.audit_result
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prod_audit_flow.created_time
     *
     * @return the value of prod_audit_flow.created_time
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prod_audit_flow.created_time
     *
     * @param createdTime the value for prod_audit_flow.created_time
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

        ProdAuditFlow prodAuditFlow = (ProdAuditFlow) o;

        if (id != null ? !id.equals(prodAuditFlow.id) : prodAuditFlow.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProdAuditFlow{" +
                "id=" + id +
                ", prodId=" + prodId  +
                ", currentUserId=" + currentUserId +
                ", nextUserId=" + nextUserId +
                ", nextRoleId=" + nextRoleId +
                ", note='" + note + '\'' +
                ", auditResult='" + auditResult + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}