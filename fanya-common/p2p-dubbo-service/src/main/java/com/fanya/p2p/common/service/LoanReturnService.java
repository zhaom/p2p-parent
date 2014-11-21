package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.LoanReturnFlow;
import com.fanya.p2p.common.utils.Pagination;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public interface LoanReturnService {

    public ServiceResult<Pagination<LoanReturnFlow>> findReturnFlow(Long loanId, int pageIndex, int pageSize, String appKey, String sign);

    public ServiceResult<LoanReturnFlow> confirmLoanPay(LoanReturnFlow loanReturnFlow, String appKey, String sign);
}
