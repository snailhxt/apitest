package com.dwd.snail.annotationtest.defined;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.annotationtest.defined
 * @ClassName: DefinedAnnotationUseClass
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/17 5:26 下午
 * @Version: 1.0
 */
@DefinedAnnotation(name="SNAIL",age=20,favour = {"pingpang","basketball"})
public class DefinedAnnotationUseClass {

    @DefinedAnnotation(name = "testField", favour = {"reading", "sports"})
    private int testField;

    @DefinedAnnotation(name = "testMethod", age = 10, favour = {"dancing", "music"})
    public void testMethod() {

    }

    @DefinedAnnotation(name = "testMethod1", age = 12, favour = {"music"})
    public void testMethod1() {

    }
}
