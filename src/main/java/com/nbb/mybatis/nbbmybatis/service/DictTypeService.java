package com.nbb.mybatis.nbbmybatis.service;


import com.nbb.mybatis.nbbmybatis.entiry.DictType;
import com.nbb.mybatis.nbbmybatis.framework.aspectjAdvisor.LogInsideTransaction;
import com.nbb.mybatis.nbbmybatis.framework.springAdvisor.LockOutsideTransaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hupeng
 * @since 2023-11-15
 */

public interface DictTypeService {


    @Transactional
    List<DictType> list();

//    @Transactional
    @Transactional(propagation= Propagation.REQUIRES_NEW)
    void add();
}
