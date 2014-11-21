package com.fanya.p2p.core.user.service;

import com.fanya.p2p.common.entity.SysUserSecurity;
import com.fanya.p2p.common.entity.SysUserSecurityExample;
import com.fanya.p2p.common.service.BasicServiceImpl;
import com.fanya.p2p.common.service.UserSecurityService;
import com.fanya.p2p.common.utils.ServiceResult;
import com.fanya.p2p.core.user.dao.SysUserSecurityMapper;
import java.util.List;

public class UserSecurityServiceImpl extends BasicServiceImpl implements UserSecurityService {

    private SysUserSecurityMapper sysUserSecurityMapper;

    public void setSysUserSecurityMapper(SysUserSecurityMapper sysUserSecurityMapper) {
        this.sysUserSecurityMapper = sysUserSecurityMapper;
    }

    @Override
    public ServiceResult<SysUserSecurity> createUserSecurity(SysUserSecurity sysUserSecurity, String appKey, String sign) {
        ServiceResult<SysUserSecurity> serviceResult = new ServiceResult<SysUserSecurity>();
        if(!checkSign(sysUserSecurity, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserSecurityMapper.insertSelective(sysUserSecurity);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserSecurity);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserSecurity> findOne(Long aLong, String appKey, String sign) {
        ServiceResult<SysUserSecurity> serviceResult = new ServiceResult<SysUserSecurity>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserSecurity sus = sysUserSecurityMapper.selectByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sus);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserSecurity> updateUserSecurity(SysUserSecurity sysUserSecurity, String appKey, String sign) {
        ServiceResult<SysUserSecurity> serviceResult = new ServiceResult<SysUserSecurity>();
        if(!checkSign(sysUserSecurity, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        sysUserSecurityMapper.updateByPrimaryKeySelective(sysUserSecurity);
        SysUserSecurity sus = sysUserSecurityMapper.selectByPrimaryKey(sysUserSecurity.getId());
        serviceResult.setSuccess(true);
        serviceResult.setValue(sus);
        return serviceResult;
    }

    @Override
    public ServiceResult<SysUserSecurity> deleteOne(Long aLong, String appKey, String sign) {
        ServiceResult<SysUserSecurity> serviceResult = new ServiceResult<SysUserSecurity>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserSecurity sysUserSecurity = sysUserSecurityMapper.selectByPrimaryKey(aLong);
        sysUserSecurityMapper.deleteByPrimaryKey(aLong);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserSecurity);
        return serviceResult;
    }

    @Override
    public ServiceResult<List<SysUserSecurity>> findByUserId(Long aLong, String appKey, String sign) {
        ServiceResult<List<SysUserSecurity>> serviceResult = new ServiceResult<List<SysUserSecurity>>();
        if(!checkSign(aLong, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }
        SysUserSecurityExample sysUserSecurityExample = new SysUserSecurityExample();
        SysUserSecurityExample.Criteria criteria = sysUserSecurityExample.createCriteria();
        criteria.andUserIdEqualTo(aLong);
        List<SysUserSecurity> sysUserSecurityList = sysUserSecurityMapper.selectByExample(sysUserSecurityExample);
        serviceResult.setSuccess(true);
        serviceResult.setValue(sysUserSecurityList);
        return serviceResult;
    }
}
