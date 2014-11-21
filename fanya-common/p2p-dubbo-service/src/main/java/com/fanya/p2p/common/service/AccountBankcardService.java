package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.CapitalAccountBankcard;
import com.fanya.p2p.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-5
 * Time: 下午2:27
 * To change this template use File | Settings | File Templates.
 */
public interface AccountBankcardService {

    ServiceResult<CapitalAccountBankcard> getUserMasterCard(Long userId, String appKey, String sign);

    ServiceResult<CapitalAccountBankcard> changeCardApply(Long userId, String bankCode, String cardNo, String appKey, String sign);

    ServiceResult<CapitalAccountBankcard> changeCardConfirm(CapitalAccountBankcard bankcard, String appKey, String sign);

}
