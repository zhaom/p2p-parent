package com.fanya.p2p.common.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CapitalAccountFlowExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public CapitalAccountFlowExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andAccountIdIsNull() {
			addCriterion("account_id is null");
			return (Criteria) this;
		}

		public Criteria andAccountIdIsNotNull() {
			addCriterion("account_id is not null");
			return (Criteria) this;
		}

		public Criteria andAccountIdEqualTo(Long value) {
			addCriterion("account_id =", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdNotEqualTo(Long value) {
			addCriterion("account_id <>", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdGreaterThan(Long value) {
			addCriterion("account_id >", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
			addCriterion("account_id >=", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdLessThan(Long value) {
			addCriterion("account_id <", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdLessThanOrEqualTo(Long value) {
			addCriterion("account_id <=", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdIn(List<Long> values) {
			addCriterion("account_id in", values, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdNotIn(List<Long> values) {
			addCriterion("account_id not in", values, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdBetween(Long value1, Long value2) {
			addCriterion("account_id between", value1, value2, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdNotBetween(Long value1, Long value2) {
			addCriterion("account_id not between", value1, value2, "accountId");
			return (Criteria) this;
		}

		public Criteria andFlowTypeIsNull() {
			addCriterion("flow_type is null");
			return (Criteria) this;
		}

		public Criteria andFlowTypeIsNotNull() {
			addCriterion("flow_type is not null");
			return (Criteria) this;
		}

		public Criteria andFlowTypeEqualTo(String value) {
			addCriterion("flow_type =", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeNotEqualTo(String value) {
			addCriterion("flow_type <>", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeGreaterThan(String value) {
			addCriterion("flow_type >", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeGreaterThanOrEqualTo(String value) {
			addCriterion("flow_type >=", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeLessThan(String value) {
			addCriterion("flow_type <", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeLessThanOrEqualTo(String value) {
			addCriterion("flow_type <=", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeLike(String value) {
			addCriterion("flow_type like", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeNotLike(String value) {
			addCriterion("flow_type not like", value, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeIn(List<String> values) {
			addCriterion("flow_type in", values, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeNotIn(List<String> values) {
			addCriterion("flow_type not in", values, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeBetween(String value1, String value2) {
			addCriterion("flow_type between", value1, value2, "flowType");
			return (Criteria) this;
		}

		public Criteria andFlowTypeNotBetween(String value1, String value2) {
			addCriterion("flow_type not between", value1, value2, "flowType");
			return (Criteria) this;
		}

		public Criteria andIncomeIsNull() {
			addCriterion("income is null");
			return (Criteria) this;
		}

		public Criteria andIncomeIsNotNull() {
			addCriterion("income is not null");
			return (Criteria) this;
		}

		public Criteria andIncomeEqualTo(BigDecimal value) {
			addCriterion("income =", value, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeNotEqualTo(BigDecimal value) {
			addCriterion("income <>", value, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeGreaterThan(BigDecimal value) {
			addCriterion("income >", value, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("income >=", value, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeLessThan(BigDecimal value) {
			addCriterion("income <", value, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("income <=", value, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeIn(List<BigDecimal> values) {
			addCriterion("income in", values, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeNotIn(List<BigDecimal> values) {
			addCriterion("income not in", values, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("income between", value1, value2, "income");
			return (Criteria) this;
		}

		public Criteria andIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("income not between", value1, value2, "income");
			return (Criteria) this;
		}

		public Criteria andExpenseIsNull() {
			addCriterion("expense is null");
			return (Criteria) this;
		}

		public Criteria andExpenseIsNotNull() {
			addCriterion("expense is not null");
			return (Criteria) this;
		}

		public Criteria andExpenseEqualTo(BigDecimal value) {
			addCriterion("expense =", value, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseNotEqualTo(BigDecimal value) {
			addCriterion("expense <>", value, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseGreaterThan(BigDecimal value) {
			addCriterion("expense >", value, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("expense >=", value, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseLessThan(BigDecimal value) {
			addCriterion("expense <", value, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseLessThanOrEqualTo(BigDecimal value) {
			addCriterion("expense <=", value, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseIn(List<BigDecimal> values) {
			addCriterion("expense in", values, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseNotIn(List<BigDecimal> values) {
			addCriterion("expense not in", values, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("expense between", value1, value2, "expense");
			return (Criteria) this;
		}

		public Criteria andExpenseNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("expense not between", value1, value2, "expense");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountIsNull() {
			addCriterion("balance_amount is null");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountIsNotNull() {
			addCriterion("balance_amount is not null");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountEqualTo(BigDecimal value) {
			addCriterion("balance_amount =", value, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountNotEqualTo(BigDecimal value) {
			addCriterion("balance_amount <>", value, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountGreaterThan(BigDecimal value) {
			addCriterion("balance_amount >", value, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("balance_amount >=", value, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountLessThan(BigDecimal value) {
			addCriterion("balance_amount <", value, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("balance_amount <=", value, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountIn(List<BigDecimal> values) {
			addCriterion("balance_amount in", values, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountNotIn(List<BigDecimal> values) {
			addCriterion("balance_amount not in", values, "balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("balance_amount between", value1, value2,
					"balanceAmount");
			return (Criteria) this;
		}

		public Criteria andBalanceAmountNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("balance_amount not between", value1, value2,
					"balanceAmount");
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

		public Criteria andProdNameIsNull() {
			addCriterion("prod_name is null");
			return (Criteria) this;
		}

		public Criteria andProdNameIsNotNull() {
			addCriterion("prod_name is not null");
			return (Criteria) this;
		}

		public Criteria andProdNameEqualTo(String value) {
			addCriterion("prod_name =", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotEqualTo(String value) {
			addCriterion("prod_name <>", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameGreaterThan(String value) {
			addCriterion("prod_name >", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameGreaterThanOrEqualTo(String value) {
			addCriterion("prod_name >=", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameLessThan(String value) {
			addCriterion("prod_name <", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameLessThanOrEqualTo(String value) {
			addCriterion("prod_name <=", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameLike(String value) {
			addCriterion("prod_name like", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotLike(String value) {
			addCriterion("prod_name not like", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameIn(List<String> values) {
			addCriterion("prod_name in", values, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotIn(List<String> values) {
			addCriterion("prod_name not in", values, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameBetween(String value1, String value2) {
			addCriterion("prod_name between", value1, value2, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotBetween(String value1, String value2) {
			addCriterion("prod_name not between", value1, value2, "prodName");
			return (Criteria) this;
		}

		public Criteria andLoanIdIsNull() {
			addCriterion("loan_id is null");
			return (Criteria) this;
		}

		public Criteria andLoanIdIsNotNull() {
			addCriterion("loan_id is not null");
			return (Criteria) this;
		}

		public Criteria andLoanIdEqualTo(Long value) {
			addCriterion("loan_id =", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotEqualTo(Long value) {
			addCriterion("loan_id <>", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdGreaterThan(Long value) {
			addCriterion("loan_id >", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdGreaterThanOrEqualTo(Long value) {
			addCriterion("loan_id >=", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdLessThan(Long value) {
			addCriterion("loan_id <", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdLessThanOrEqualTo(Long value) {
			addCriterion("loan_id <=", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdIn(List<Long> values) {
			addCriterion("loan_id in", values, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotIn(List<Long> values) {
			addCriterion("loan_id not in", values, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdBetween(Long value1, Long value2) {
			addCriterion("loan_id between", value1, value2, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotBetween(Long value1, Long value2) {
			addCriterion("loan_id not between", value1, value2, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanNameIsNull() {
			addCriterion("loan_name is null");
			return (Criteria) this;
		}

		public Criteria andLoanNameIsNotNull() {
			addCriterion("loan_name is not null");
			return (Criteria) this;
		}

		public Criteria andLoanNameEqualTo(String value) {
			addCriterion("loan_name =", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotEqualTo(String value) {
			addCriterion("loan_name <>", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameGreaterThan(String value) {
			addCriterion("loan_name >", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameGreaterThanOrEqualTo(String value) {
			addCriterion("loan_name >=", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameLessThan(String value) {
			addCriterion("loan_name <", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameLessThanOrEqualTo(String value) {
			addCriterion("loan_name <=", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameLike(String value) {
			addCriterion("loan_name like", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotLike(String value) {
			addCriterion("loan_name not like", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameIn(List<String> values) {
			addCriterion("loan_name in", values, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotIn(List<String> values) {
			addCriterion("loan_name not in", values, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameBetween(String value1, String value2) {
			addCriterion("loan_name between", value1, value2, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotBetween(String value1, String value2) {
			addCriterion("loan_name not between", value1, value2, "loanName");
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
			addCriterion("created_time not between", value1, value2,
					"createdTime");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table capital_account_flow
	 * @mbggenerated  Wed Oct 15 10:00:09 CST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table capital_account_flow
     *
     * @mbggenerated do_not_delete_during_merge Tue Oct 14 10:48:47 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}