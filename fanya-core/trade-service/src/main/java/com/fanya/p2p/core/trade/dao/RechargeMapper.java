package com.fanya.p2p.core.trade.dao;

import com.fanya.p2p.common.entity.Recharge;
import com.fanya.p2p.common.entity.RechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int countByExample(RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int deleteByExample(RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int insert(Recharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int insertSelective(Recharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    List<Recharge> selectByExample(RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    Recharge selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int updateByExampleSelective(@Param("record") Recharge record, @Param("example") RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int updateByExample(@Param("record") Recharge record, @Param("example") RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int updateByPrimaryKeySelective(Recharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    int updateByPrimaryKey(Recharge record);
}