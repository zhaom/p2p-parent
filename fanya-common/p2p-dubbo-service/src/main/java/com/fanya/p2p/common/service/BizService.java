package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.SysBiz;
import com.fanya.p2p.common.utils.Pagination;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-9
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
public interface BizService {

    public ServiceResult<SysBiz> createBiz(SysBiz sysBiz, String appKey, String sign);

    public ServiceResult<SysBiz> updateBiz(SysBiz sysBiz, SysBiz appKey, String sign);

    public ServiceResult<SysBiz> findOne(Long id, String appKey, String sign);

    public ServiceResult<Pagination<SysBiz>> find(SysBiz sysBiz, String appKey, String sign);

}
