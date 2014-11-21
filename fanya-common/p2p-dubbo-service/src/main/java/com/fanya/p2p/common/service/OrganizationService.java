package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.SysOrganization;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;


public interface OrganizationService {

    public ServiceResult<SysOrganization> createOrganization(SysOrganization organization, String appKey, String sign);

    public ServiceResult<SysOrganization> updateOrganization(SysOrganization organization, String appKey, String sign);

    public ServiceResult<Object> deleteOrganization(Long organizationId, String appKey, String sign);

    public ServiceResult<SysOrganization> findOne(Long organizationId, String appKey, String sign);

    public ServiceResult<List<SysOrganization>> findAll(String appKey, String sign);

    public ServiceResult<Object> findAllWithExclude(SysOrganization excludeOraganization, String appKey, String sign);

    public ServiceResult<SysOrganization> move(SysOrganization source, SysOrganization target, String appKey, String sign);
}
