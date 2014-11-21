package com.fanya.p2p.core.loan.dao;

import com.fanya.p2p.common.entity.LoanReturnFlow;
import com.fanya.p2p.common.entity.LoanReturnFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanReturnFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int countByExample(LoanReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByExample(LoanReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insert(LoanReturnFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insertSelective(LoanReturnFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    List<LoanReturnFlow> selectByExample(LoanReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    LoanReturnFlow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") LoanReturnFlow record, @Param("example") LoanReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExample(@Param("record") LoanReturnFlow record, @Param("example") LoanReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKeySelective(LoanReturnFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_flow
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKey(LoanReturnFlow record);
}