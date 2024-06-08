package com.nbb.mybatis.nbbmybatis.service.impl;

import cn.hutool.core.util.IdUtil;
import com.nbb.mybatis.nbbmybatis.entiry.DictType;
import com.nbb.mybatis.nbbmybatis.framework.aspectjAdvisor.LogInsideTransaction;
import com.nbb.mybatis.nbbmybatis.framework.springAdvisor.LockOutsideTransaction;
import com.nbb.mybatis.nbbmybatis.mapper.DictTypeMapper;
import com.nbb.mybatis.nbbmybatis.service.DictTypeService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hupeng
 * @since 2023-11-15
 */
@Service
public class DictTypeServiceImpl implements DictTypeService {

    @Autowired
    private DictTypeMapper dictTypeMapper;

    @Override
//    @LockOutsideTransaction
//    @LogInsideTransaction
    public List<DictType> list() {
        List<DictType> list = dictTypeMapper.list();
        DictTypeService proxy = (DictTypeService)AopContext.currentProxy();
        proxy.add();
        return list;
    }

    @Override
    public void add() {
        DictType dictType = new DictType()
                .setId(IdUtil.getSnowflakeNextId())
                .setDictType("sex")
                .setDictName("性别");
        dictTypeMapper.save(dictType);
        System.out.println("aa");
    }
}
