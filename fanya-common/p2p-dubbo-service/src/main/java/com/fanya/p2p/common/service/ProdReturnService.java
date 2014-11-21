package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.ProdReturnFlow;
import com.fanya.p2p.common.utils.Pagination;
import com.fanya.p2p.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */
public interface ProdReturnService {

    public ServiceResult<Pagination<ProdReturnFlow>> findProdFlow(Long prodId, int pageIndex, int pageSize, String appKey, String sign);

    public ServiceResult<ProdReturnFlow> confirmProdPay(ProdReturnFlow prodReturnFlow, String appKey, String sign);

}
