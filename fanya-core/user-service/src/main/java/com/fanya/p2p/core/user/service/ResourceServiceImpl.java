package com.fanya.p2p.core.user.service;


import com.fanya.p2p.common.entity.SysResource;
import com.fanya.p2p.common.service.BasicServiceImpl;
import com.fanya.p2p.common.service.ResourceService;
import com.fanya.p2p.common.utils.ServiceResult;
import com.fanya.p2p.core.user.dao.SysResourceMapper;

import java.util.List;
import java.util.Set;

public class ResourceServiceImpl extends BasicServiceImpl implements ResourceService {

    private SysResourceMapper sysResourceMapper;

    public void setSysResourceMapper(SysResourceMapper sysResourceMapper) {
        this.sysResourceMapper = sysResourceMapper;
    }

    @Override
    public ServiceResult<SysResource> createResource(SysResource sysResource, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysResource> updateResource(SysResource sysResource, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Object> deleteResource(Long aLong, String appKey, String sign) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    @Override
    public ServiceResult<SysResource> findOne(Long aLong, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<List<SysResource>> findAll(String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Set<String>> findPermissions(Set<Long> longs, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<List<SysResource>> findMenus(Set<String> strings, String appKey, String sign) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
