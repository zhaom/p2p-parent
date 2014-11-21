package com.fanya.p2p.core.account.service;

import com.fanya.p2p.common.entity.CapitalAccountFlow;
import com.fanya.p2p.common.entity.CapitalAccountFlowExample;
import com.fanya.p2p.common.service.AccountFlowService;
import com.fanya.p2p.common.service.BasicServiceImpl;
import com.fanya.p2p.common.utils.ServiceResult;
import com.fanya.p2p.core.account.dao.CapitalAccountFlowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-14
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 */
public class AccountFlowServiceImpl extends BasicServiceImpl implements AccountFlowService {

    private static final Logger logger = LoggerFactory.getLogger(AccountFlowServiceImpl.class);

    private CapitalAccountFlowMapper capitalAccountFlowMapper;

    public void setCapitalAccountFlowMapper(CapitalAccountFlowMapper capitalAccountFlowMapper) {
        this.capitalAccountFlowMapper = capitalAccountFlowMapper;
    }

    @Override
    public ServiceResult<List<CapitalAccountFlow>> listAccountFlow(Long accountId, String appKey, String sign) {
        logger.debug("list account flow by account id:[{}]", accountId);
        ServiceResult<List<CapitalAccountFlow>> serviceResult = new ServiceResult<List<CapitalAccountFlow>>();
        if(!checkSign(accountId, appKey, sign)){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(555);
            serviceResult.setErrorMessage("sign invalid");
            return serviceResult;
        }

        CapitalAccountFlowExample cafe = new CapitalAccountFlowExample();
        CapitalAccountFlowExample.Criteria criteria = cafe.createCriteria();
        criteria.andAccountIdEqualTo(accountId);
        List<CapitalAccountFlow> capitalAccountFlowList = capitalAccountFlowMapper.selectByExample(cafe);
        serviceResult.setSuccess(true);
        serviceResult.setValue(capitalAccountFlowList);
        return serviceResult;
    }
}
