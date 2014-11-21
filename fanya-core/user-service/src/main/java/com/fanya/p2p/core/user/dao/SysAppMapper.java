package com.fanya.p2p.core.user.dao;

import com.fanya.p2p.common.entity.SysApp;
import com.fanya.p2p.common.entity.SysAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAppMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int countByExample(SysAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int deleteByExample(SysAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int insert(SysApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int insertSelective(SysApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    List<SysApp> selectByExample(SysAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    SysApp selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByExampleSelective(@Param("record") SysApp record, @Param("example") SysAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByExample(@Param("record") SysApp record, @Param("example") SysAppExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByPrimaryKeySelective(SysApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_app
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByPrimaryKey(SysApp record);
}