package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.SysResource;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;
import java.util.Set;


public interface ResourceService {

    public ServiceResult<SysResource> createResource(SysResource resource, String appKey, String sign);

    public ServiceResult<SysResource> updateResource(SysResource resource, String appKey, String sign);

    public ServiceResult<Object> deleteResource(Long resourceId, String appKey, String sign);

    public ServiceResult<SysResource> findOne(Long resourceId, String appKey, String sign);

    public ServiceResult<List<SysResource>> findAll(String appKey, String sign);

    public ServiceResult<Set<String>> findPermissions(Set<Long> resourceIds, String appKey, String sign);

    public ServiceResult<List<SysResource>> findMenus(Set<String> permissions, String appKey, String sign);
}
