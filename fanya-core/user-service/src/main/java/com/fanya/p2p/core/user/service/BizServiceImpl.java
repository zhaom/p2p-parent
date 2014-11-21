package com.fanya.p2p.core.user.service;

import com.fanya.p2p.common.entity.SysBiz;
import com.fanya.p2p.common.service.BasicServiceImpl;
import com.fanya.p2p.common.service.BizService;
import com.fanya.p2p.common.utils.Pagination;
import com.fanya.p2p.common.utils.ServiceResult;
import com.fanya.p2p.core.user.dao.SysBizMapper;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-9
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
public class BizServiceImpl extends BasicServiceImpl implements BizService {

    private SysBizMapper sysBizMapper;

    public void setSysBizMapper(SysBizMapper sysBizMapper) {
        this.sysBizMapper = sysBizMapper;
    }

    @Override
    public ServiceResult<SysBiz> createBiz(SysBiz sysBiz, String s, String s2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysBiz> updateBiz(SysBiz sysBiz, SysBiz sysBiz2, String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<SysBiz> findOne(Long aLong, String s, String s2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult<Pagination<SysBiz>> find(SysBiz sysBiz, String s, String s2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
