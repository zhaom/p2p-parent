package com.fanya.p2p.core.user.dao;

import com.fanya.p2p.common.entity.SysUserSecurity;
import com.fanya.p2p.common.entity.SysUserSecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserSecurityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int countByExample(SysUserSecurityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int deleteByExample(SysUserSecurityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int insert(SysUserSecurity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int insertSelective(SysUserSecurity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	List<SysUserSecurity> selectByExample(SysUserSecurityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	SysUserSecurity selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int updateByExampleSelective(@Param("record") SysUserSecurity record,
                                 @Param("example") SysUserSecurityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int updateByExample(@Param("record") SysUserSecurity record,
                        @Param("example") SysUserSecurityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int updateByPrimaryKeySelective(SysUserSecurity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_security
	 * @mbggenerated  Wed Oct 15 16:50:27 CST 2014
	 */
	int updateByPrimaryKey(SysUserSecurity record);
}