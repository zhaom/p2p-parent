package com.fanya.p2p.core.prod.dao;

import com.fanya.p2p.common.entity.ProdInterest;
import com.fanya.p2p.common.entity.ProdInterestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdInterestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int countByExample(ProdInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByExample(ProdInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByPrimaryKey(Long prodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insert(ProdInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insertSelective(ProdInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    List<ProdInterest> selectByExample(ProdInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    ProdInterest selectByPrimaryKey(Long prodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") ProdInterest record, @Param("example") ProdInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExample(@Param("record") ProdInterest record, @Param("example") ProdInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKeySelective(ProdInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_interest
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKey(ProdInterest record);
}