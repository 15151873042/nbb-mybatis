package com.nbb.mybatis.nbbmybatis.framework.aspectjAdvisor;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Configuration
@Order(1)
@Slf4j
public class LogAspect {

    @Pointcut("@annotation(com.nbb.mybatis.nbbmybatis.framework.aspectjAdvisor.LogInsideTransaction)")
    public void pointcut1() {

    }

    @Around("pointcut1()")
    public Object printLogInsideTransaction(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("事务内部打印日志");
        Object proceed = joinPoint.proceed();
        return proceed;
    }
}
