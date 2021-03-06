package com.fanya.p2p.core.prod.dao;

import com.fanya.p2p.common.entity.ProdReturnFlow;
import com.fanya.p2p.common.entity.ProdReturnFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdReturnFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int countByExample(ProdReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByExample(ProdReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insert(ProdReturnFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insertSelective(ProdReturnFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    List<ProdReturnFlow> selectByExample(ProdReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    ProdReturnFlow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") ProdReturnFlow record, @Param("example") ProdReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExample(@Param("record") ProdReturnFlow record, @Param("example") ProdReturnFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKeySelective(ProdReturnFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_return_flow
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKey(ProdReturnFlow record);
}