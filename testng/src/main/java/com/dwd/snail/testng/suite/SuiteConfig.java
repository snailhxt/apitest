package com.dwd.snail.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.suite
 * @ClassName: SuiteConfig
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 2:35 下午
 * @Version: 1.0
 */
public class SuiteConfig {
@BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite运行啦");
    }
@AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

}
