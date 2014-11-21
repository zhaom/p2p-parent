package com.fanya.p2p.common.service;


import com.fanya.p2p.common.entity.SysRole;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;
import java.util.Set;

public interface RoleService {

    public ServiceResult<SysRole> createRole(SysRole role, String appKey, String sign);

    public ServiceResult<SysRole> updateRole(SysRole role, String appKey, String sign);

    public ServiceResult<Object> deleteRole(Long roleId, String appKey, String sign);

    public ServiceResult<SysRole> findOne(Long roleId, String appKey, String sign);

    public ServiceResult<List<SysRole>> findAll(String appKey, String sign);

    public ServiceResult<Set<String>> findRoles(Long[] roleIds, String appKey, String sign);

    public ServiceResult<Set<String>> findPermissions(Long[] roleIds, String appKey, String sign);
}
