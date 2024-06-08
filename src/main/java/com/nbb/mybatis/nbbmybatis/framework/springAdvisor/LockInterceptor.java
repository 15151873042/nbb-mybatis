package com.nbb.mybatis.nbbmybatis.framework.springAdvisor;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

@Slf4j
public class LockInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("事务外部获取锁");
        Object proceed = invocation.proceed();
        log.info("事务外部释放锁");
        return proceed;

    }
}
