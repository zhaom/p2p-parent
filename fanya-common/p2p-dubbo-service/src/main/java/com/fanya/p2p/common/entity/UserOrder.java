package com.fanya.p2p.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserOrder implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.user_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.prod_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private Long prodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.amount
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.state
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.remark
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.created_time
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.id
     *
     * @return the value of user_order.id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.id
     *
     * @param id the value for user_order.id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.user_id
     *
     * @return the value of user_order.user_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.user_id
     *
     * @param userId the value for user_order.user_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.prod_id
     *
     * @return the value of user_order.prod_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public Long getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.prod_id
     *
     * @param prodId the value for user_order.prod_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.amount
     *
     * @return the value of user_order.amount
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.amount
     *
     * @param amount the value for user_order.amount
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.state
     *
     * @return the value of user_order.state
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.state
     *
     * @param state the value for user_order.state
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.remark
     *
     * @return the value of user_order.remark
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.remark
     *
     * @param remark the value for user_order.remark
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.created_time
     *
     * @return the value of user_order.created_time
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.created_time
     *
     * @param createdTime the value for user_order.created_time
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserOrder userOrder = (UserOrder) o;

        if (id != null ? !id.equals(userOrder.id) : userOrder.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", userId=" + userId +
                ", prodId=" + prodId +
                ", amount=" + amount +
                ", state='" + state + '\'' +
                ", remark='" + remark + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}