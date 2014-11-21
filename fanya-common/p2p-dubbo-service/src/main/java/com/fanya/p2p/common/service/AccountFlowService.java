package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.CapitalAccountFlow;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-14
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public interface AccountFlowService {

    public ServiceResult<List<CapitalAccountFlow>> listAccountFlow(Long accountId, String appKey, String sign);

}
