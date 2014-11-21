package com.fanya.p2p.core.prod.dao;

import com.fanya.p2p.common.entity.ProdCollect;
import com.fanya.p2p.common.entity.ProdCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int countByExample(ProdCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByExample(ProdCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int deleteByPrimaryKey(Long prodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insert(ProdCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int insertSelective(ProdCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    List<ProdCollect> selectByExample(ProdCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    ProdCollect selectByPrimaryKey(Long prodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") ProdCollect record, @Param("example") ProdCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByExample(@Param("record") ProdCollect record, @Param("example") ProdCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKeySelective(ProdCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prod_collect
     *
     * @mbggenerated Wed Nov 05 12:11:21 CST 2014
     */
    int updateByPrimaryKey(ProdCollect record);
}