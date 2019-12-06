package com.dwd.snail.testng.depand;

import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.depand
 * @ClassName: DependTest
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 4:55 下午
 * @Version: 1.0
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
