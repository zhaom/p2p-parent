package com.fanya.p2p.core.prod.dao;

import com.fanya.p2p.common.entity.ProdInterestFlow;
import com.fanya.p2p.common.entity.ProdInterestFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdInterestFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int countByExample(ProdInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByExample(ProdInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insert(ProdInterestFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insertSelective(ProdInterestFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    List<ProdInterestFlow> selectByExample(ProdInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    ProdInterestFlow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") ProdInterestFlow record, @Param("example") ProdInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExample(@Param("record") ProdInterestFlow record, @Param("example") ProdInterestFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKeySelective(ProdInterestFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKey(ProdInterestFlow record);
}