package com.fanya.p2p.core.user.service;


import com.fanya.p2p.common.entity.SysOrganization;
import com.fanya.p2p.common.service.BasicServiceImpl;
import com.fanya.p2p.common.service.OrganizationService;
import com.fanya.p2p.common.utils.ServiceResult;
import com.fanya.p2p.core.user.dao.SysOrganizationMapper;

import java.util.List;

public class OrganizationServiceImpl extends BasicServiceImpl implements OrganizationService {

    private SysOrganizationMapper sysOrganizationMapper;

    public void setSysOrganizationMapper(SysOrganizationMapper sysOrganizationMapper) {
        this.sysOrganizationMapper = sysOrganizationMapper;
    }

    @Override
    public ServiceResult<SysOrganization> createOrganization(SysOrganization sysOrganization, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysOrganization> updateOrganization(SysOrganization sysOrganization, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Object> deleteOrganization(Long aLong, String appKey, String sign) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    @Override
    public ServiceResult<SysOrganization> findOne(Long aLong, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<List<SysOrganization>> findAll(String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Object> findAllWithExclude(SysOrganization sysOrganization, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysOrganization> move(SysOrganization sysOrganization, SysOrganization sysOrganization2, String appKey, String sign) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }
}
