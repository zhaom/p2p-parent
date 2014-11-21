package com.fanya.p2p.common.service;


import com.fanya.p2p.common.entity.SysApp;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;


public interface AppService {

    public ServiceResult<SysApp> createApp(SysApp app, String appKey, String sign);

    public ServiceResult<SysApp> updateApp(SysApp app, String appKey, String sign);

    public ServiceResult<Object> deleteApp(Long appId, String appKey, String sign);

    public ServiceResult<SysApp> findOne(Long appId, String appKey, String sign);

    public ServiceResult<List<SysApp>> findAll(String appKey, String sign);

    public ServiceResult<Long> findAppIdByAppKey(String tAppKey, String appKey, String sign);
}
