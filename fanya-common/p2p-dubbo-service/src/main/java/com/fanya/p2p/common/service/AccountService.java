package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.CapitalAccount;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-14
 * Time: 上午11:49
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    public ServiceResult<List<CapitalAccount>> initUserAccount(Long userId,String userName, String appKey, String sign);

    public ServiceResult<CapitalAccount> createAccountByInvest(CapitalAccount capitalAccount, String appKey, String sign);

    public ServiceResult<CapitalAccount> createAccountByLoan(CapitalAccount capitalAccount, String appKey, String sign);

    public ServiceResult<CapitalAccount> findOne(Long id, String appKey, String sign);

    public ServiceResult<List<CapitalAccount>> listUserAccount(Long userId, String appKey, String sign);

    public ServiceResult<CapitalAccount> updateAccount(CapitalAccount capitalAccount, String appKey, String sign);

}
