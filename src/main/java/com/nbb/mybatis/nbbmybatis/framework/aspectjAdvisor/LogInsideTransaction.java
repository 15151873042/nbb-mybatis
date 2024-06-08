package com.nbb.mybatis.nbbmybatis.framework.aspectjAdvisor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface LogInsideTransaction {
}
