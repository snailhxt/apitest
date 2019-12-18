package com.dwd.snail.annotationtest.defined;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static javafx.scene.input.KeyCode.R;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.annotationtest.defined
 * @ClassName: MainActivity
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/17 5:37 下午
 * @Version: 1.0
 */
public class MainActivity  {
    public static void main(String[] args) throws NoSuchMethodException {
        DefinedAnnotation test = ( DefinedAnnotation ) DefinedAnnotationUseClass.class.getAnnotation(DefinedAnnotation.class);
        Annotation[] test1 = DefinedAnnotationUseClass.class.getAnnotations();

        for (Annotation zitest : test1) {
            System.out.println("DefinedAnnotationUseClass类上的注解是：\n" + zitest);

        }

        Method testMethod = DefinedAnnotationUseClass.class.getDeclaredMethod("testMethod1", null);
        Field[] declaredFields = DefinedAnnotationUseClass.class.getDeclaredFields();

//        for (Field declaredField:declaredFields) {
//            System.out.println(declaredField);
//            DefinedAnnotation definedAnnotation=declaredField.getAnnotation(DefinedAnnotation.class);
//        }
//        System.out.println("test1=:"+test1);
//        System.out.println("test1.getClass()="+test1.getClass());
//        System.out.println("testMethod="+testMethod);


        Annotation[] testMethod1s = DefinedAnnotationUseClass.class.getMethod("testMethod1").getDeclaredAnnotations();
        for (Annotation testmethod1s : testMethod1s) {
            System.out.println("\nDefinedAnnotationUseClass类的testMethod1s上的注解是：\n" + testmethod1s);

        }

        DefinedAnnotation annotation = DefinedAnnotationUseClass.class.getAnnotation(DefinedAnnotation.class);
        int age = annotation.age();
        System.out.println(age);


        DefinedAnnotation definedtestMethod1 = DefinedAnnotationUseClass.class.getMethod("testMethod").getAnnotation(DefinedAnnotation.class);
        System.out.println(definedtestMethod1.name());
    }



}
