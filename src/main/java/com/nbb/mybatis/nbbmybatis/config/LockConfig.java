package com.nbb.mybatis.nbbmybatis.config;

import com.nbb.mybatis.nbbmybatis.framework.springAdvisor.LockInterceptor;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LockConfig {


    @Bean
    Advisor lockAdvisor() {
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setAdvice(lockAdvice());
        advisor.setExpression("@annotation(com.nbb.mybatis.nbbmybatis.framework.springAdvisor.LockOutsideTransaction)");
        advisor.setOrder(-1);
        return advisor;
    }

    @Bean
    Advice lockAdvice() {
        return new LockInterceptor();
    }
}
