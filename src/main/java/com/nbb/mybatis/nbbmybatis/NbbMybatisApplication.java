package com.nbb.mybatis.nbbmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(order = 0)
@EnableAspectJAutoProxy(exposeProxy = true)
public class NbbMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbbMybatisApplication.class, args);
    }

}
