package com.dwd.snail.annotationtest.defined;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.annotationtest.defined
 * @ClassName: DefinedAnnotation
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/17 5:02 下午
 * @Version: 1.0
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DefinedAnnotation {
    String name();
    int age() default 18;
    String[] favour();
}
