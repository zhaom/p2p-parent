package com.fanya.p2p.core.user.dao;

import com.fanya.p2p.common.entity.SysOrganization;
import com.fanya.p2p.common.entity.SysOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int countByExample(SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int deleteByExample(SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int insert(SysOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int insertSelective(SysOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    List<SysOrganization> selectByExample(SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    SysOrganization selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByExampleSelective(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByExample(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByPrimaryKeySelective(SysOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    int updateByPrimaryKey(SysOrganization record);
}