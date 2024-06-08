package com.nbb.mybatis.nbbmybatis.framework.springAdvisor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LockOutsideTransaction {
}
