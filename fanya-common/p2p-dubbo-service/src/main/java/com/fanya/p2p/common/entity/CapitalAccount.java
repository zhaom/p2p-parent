package com.fanya.p2p.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CapitalAccount implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.user_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.user_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.categary
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private Integer categary;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private BigDecimal amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.state
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private String state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.prod_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private Long prodId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.prod_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private String prodName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.profit
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private BigDecimal profit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.profit_begin_time
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private Date profitBeginTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.loan_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private Long loanId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.loan_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private String loanName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.total_loan_amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private BigDecimal totalLoanAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.returned_loan_amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private BigDecimal returnedLoanAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account.created_time
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	private Date createdTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.id
	 * @return  the value of capital_account.id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.id
	 * @param id  the value for capital_account.id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.user_id
	 * @return  the value of capital_account.user_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.user_id
	 * @param userId  the value for capital_account.user_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.user_name
	 * @return  the value of capital_account.user_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.user_name
	 * @param userName  the value for capital_account.user_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.categary
	 * @return  the value of capital_account.categary
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Integer getCategary() {
		return categary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.categary
	 * @param categary  the value for capital_account.categary
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setCategary(Integer categary) {
		this.categary = categary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.amount
	 * @return  the value of capital_account.amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.amount
	 * @param amount  the value for capital_account.amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.state
	 * @return  the value of capital_account.state
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.state
	 * @param state  the value for capital_account.state
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.prod_id
	 * @return  the value of capital_account.prod_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Long getProdId() {
		return prodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.prod_id
	 * @param prodId  the value for capital_account.prod_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.prod_name
	 * @return  the value of capital_account.prod_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public String getProdName() {
		return prodName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.prod_name
	 * @param prodName  the value for capital_account.prod_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.profit
	 * @return  the value of capital_account.profit
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public BigDecimal getProfit() {
		return profit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.profit
	 * @param profit  the value for capital_account.profit
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.profit_begin_time
	 * @return  the value of capital_account.profit_begin_time
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Date getProfitBeginTime() {
		return profitBeginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.profit_begin_time
	 * @param profitBeginTime  the value for capital_account.profit_begin_time
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setProfitBeginTime(Date profitBeginTime) {
		this.profitBeginTime = profitBeginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.loan_id
	 * @return  the value of capital_account.loan_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Long getLoanId() {
		return loanId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.loan_id
	 * @param loanId  the value for capital_account.loan_id
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.loan_name
	 * @return  the value of capital_account.loan_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public String getLoanName() {
		return loanName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.loan_name
	 * @param loanName  the value for capital_account.loan_name
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.total_loan_amount
	 * @return  the value of capital_account.total_loan_amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public BigDecimal getTotalLoanAmount() {
		return totalLoanAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.total_loan_amount
	 * @param totalLoanAmount  the value for capital_account.total_loan_amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setTotalLoanAmount(BigDecimal totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.returned_loan_amount
	 * @return  the value of capital_account.returned_loan_amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public BigDecimal getReturnedLoanAmount() {
		return returnedLoanAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.returned_loan_amount
	 * @param returnedLoanAmount  the value for capital_account.returned_loan_amount
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setReturnedLoanAmount(BigDecimal returnedLoanAmount) {
		this.returnedLoanAmount = returnedLoanAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account.created_time
	 * @return  the value of capital_account.created_time
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account.created_time
	 * @param createdTime  the value for capital_account.created_time
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CapitalAccount account = (CapitalAccount) o;

        if (id != null ? !id.equals(account.id) : account.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CapitalAccount{" +
                "id=" + id +
                ", userId=" + userId +
                ", username='" + userName + '\'' +
                ", categary='" + categary + '\'' +
                ", amount=" + amount +
                ", state='" + state  + '\'' +
                ", prodId=" + prodId +
                ", loanId=" +loanId +
                '}';
    }
}