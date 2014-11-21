package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.SysUserIdentification;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-22
 * Time: 上午11:37
 * To change this template use File | Settings | File Templates.
 */
public interface UserIdentificationService {

    public ServiceResult<SysUserIdentification> createUserIdentification(SysUserIdentification sysUserIdentification, String appKey, String sign);

    public ServiceResult<SysUserIdentification> findOne(Long id, String appKey, String sign);

    public ServiceResult<SysUserIdentification> updateUserIdentification(SysUserIdentification sysUserIdentification, String appKey, String sign);

    public ServiceResult<SysUserIdentification> deleteOne(Long id, String appKey, String sign);

    public ServiceResult<List<SysUserIdentification>> findByUserId(Long userId, String appKey, String sign);
}
