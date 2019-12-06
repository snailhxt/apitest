package com.dwd.snail.testng.demo1;

import org.testng.annotations.*;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.demo1
 * @ClassName: basicAnnotation
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 2:20 下午
 * @Version: 1.0
 */
public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod在测试方法前运行");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod在测试方法后运行");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass在类运行之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite在套件运行前");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite在套件后运行");
    }

}
