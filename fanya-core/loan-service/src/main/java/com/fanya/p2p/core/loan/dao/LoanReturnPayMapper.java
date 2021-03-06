package com.fanya.p2p.core.loan.dao;

import com.fanya.p2p.common.entity.LoanReturnPay;
import com.fanya.p2p.common.entity.LoanReturnPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanReturnPayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int countByExample(LoanReturnPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByExample(LoanReturnPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insert(LoanReturnPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insertSelective(LoanReturnPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    List<LoanReturnPay> selectByExample(LoanReturnPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    LoanReturnPay selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") LoanReturnPay record, @Param("example") LoanReturnPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExample(@Param("record") LoanReturnPay record, @Param("example") LoanReturnPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKeySelective(LoanReturnPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_return_pay
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKey(LoanReturnPay record);
}