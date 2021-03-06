package com.fanya.p2p.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CapitalAccountFlow implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.account_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private Long accountId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.flow_type
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private String flowType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.income
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private BigDecimal income;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.expense
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private BigDecimal expense;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.balance_amount
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private BigDecimal balanceAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.state
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private String state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.prod_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private Long prodId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.prod_name
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private String prodName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.loan_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private Long loanId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.loan_name
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private String loanName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.created_time
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private Date createdTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column capital_account_flow.remark
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	private String remark;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.id
	 * @return  the value of capital_account_flow.id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.id
	 * @param id  the value for capital_account_flow.id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.account_id
	 * @return  the value of capital_account_flow.account_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.account_id
	 * @param accountId  the value for capital_account_flow.account_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.flow_type
	 * @return  the value of capital_account_flow.flow_type
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public String getFlowType() {
		return flowType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.flow_type
	 * @param flowType  the value for capital_account_flow.flow_type
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.income
	 * @return  the value of capital_account_flow.income
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public BigDecimal getIncome() {
		return income;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.income
	 * @param income  the value for capital_account_flow.income
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.expense
	 * @return  the value of capital_account_flow.expense
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public BigDecimal getExpense() {
		return expense;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.expense
	 * @param expense  the value for capital_account_flow.expense
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setExpense(BigDecimal expense) {
		this.expense = expense;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.balance_amount
	 * @return  the value of capital_account_flow.balance_amount
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.balance_amount
	 * @param balanceAmount  the value for capital_account_flow.balance_amount
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.state
	 * @return  the value of capital_account_flow.state
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.state
	 * @param state  the value for capital_account_flow.state
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.prod_id
	 * @return  the value of capital_account_flow.prod_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public Long getProdId() {
		return prodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.prod_id
	 * @param prodId  the value for capital_account_flow.prod_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.prod_name
	 * @return  the value of capital_account_flow.prod_name
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public String getProdName() {
		return prodName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.prod_name
	 * @param prodName  the value for capital_account_flow.prod_name
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.loan_id
	 * @return  the value of capital_account_flow.loan_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public Long getLoanId() {
		return loanId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.loan_id
	 * @param loanId  the value for capital_account_flow.loan_id
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.loan_name
	 * @return  the value of capital_account_flow.loan_name
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public String getLoanName() {
		return loanName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.loan_name
	 * @param loanName  the value for capital_account_flow.loan_name
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.created_time
	 * @return  the value of capital_account_flow.created_time
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.created_time
	 * @param createdTime  the value for capital_account_flow.created_time
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column capital_account_flow.remark
	 * @return  the value of capital_account_flow.remark
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column capital_account_flow.remark
	 * @param remark  the value for capital_account_flow.remark
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CapitalAccountFlow flow = (CapitalAccountFlow) o;

        if (id != null ? !id.equals(flow.id) : flow.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CapitalAccountFlow{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", flowType='" + flowType + '\'' +
                ", state='" + state + '\'' +
                ", income=" + income +
                ", expense=" + expense +
                ", prodId=" + prodId +
                ", loanId=" +loanId +
                '}';
    }
}