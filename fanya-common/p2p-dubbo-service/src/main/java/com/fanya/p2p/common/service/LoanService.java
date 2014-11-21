package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.Loan;
import com.fanya.p2p.common.entity.LoanExample;
import com.fanya.p2p.common.utils.Pagination;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 上午10:30
 * To change this template use File | Settings | File Templates.
 */
public interface LoanService {

    public ServiceResult<Loan> createLoan(Loan loan, String appKey, String sign);

    public ServiceResult<Pagination<Loan>> findLoan(LoanExample loanExample, int pageIndex, int pageSize, String appKey, String sign);

    public ServiceResult<Loan> updateLoan(Loan loan, String appKey, String sign);

    public ServiceResult<Loan> deleteLoan(Loan loan, String appKey, String sign);

    public ServiceResult<Loan> findOne(Long loanId, String appKey, String sign);
}
