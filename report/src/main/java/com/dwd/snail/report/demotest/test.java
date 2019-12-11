package com.dwd.snail.report.demotest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @ProjectName: reporttest
 * @Package: com.dwd.snail.reporttest.demotest
 * @ClassName: test
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/10 1:52 下午
 * @Version: 1.0
 */
public class test {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test3(){
        Reporter.log("test3 report log");
        throw new RuntimeException("RuntimeException log");
    }
    @Test(expectedExceptions=RuntimeException.class)
    public void test4(){
        Reporter.log("test4 report log");
        throw new RuntimeException("RuntimeException log");
    }
}
