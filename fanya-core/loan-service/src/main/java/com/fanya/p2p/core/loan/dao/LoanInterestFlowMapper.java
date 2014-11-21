package com.fanya.p2p.core.loan.dao;

import com.fanya.p2p.common.entity.LoanInterestFlow;
import com.fanya.p2p.common.entity.LoanInterestFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanInterestFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int countByExample(LoanInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByExample(LoanInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insert(LoanInterestFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insertSelective(LoanInterestFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    List<LoanInterestFlow> selectByExample(LoanInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    LoanInterestFlow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") LoanInterestFlow record, @Param("example") LoanInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExample(@Param("record") LoanInterestFlow record, @Param("example") LoanInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKeySelective(LoanInterestFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKey(LoanInterestFlow record);
}