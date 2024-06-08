package com.nbb.mybatis.nbbmybatis;

import com.nbb.mybatis.nbbmybatis.framework.aspectjAdvisor.LogInsideTransaction;
import com.nbb.mybatis.nbbmybatis.service.impl.DictTypeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;

@SpringBootTest
class NbbMybatisApplicationTests {

    @Test
    void contextLoads() {
    }


    public static void main(String[] args) throws NoSuchMethodException {
        Method method = DictTypeServiceImpl.class.getMethod("list", null);
        AnnotationAttributes mergedAnnotationAttributes = AnnotatedElementUtils.findMergedAnnotationAttributes(
                method, LogInsideTransaction.class, false, false);

        System.out.println(mergedAnnotationAttributes);
    }

}
