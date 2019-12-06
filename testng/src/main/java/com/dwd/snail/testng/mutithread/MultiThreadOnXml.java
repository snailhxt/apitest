package com.dwd.snail.testng.mutithread;

import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.mutithread
 * @ClassName: MultiThreadOnXml
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 5:32 下午
 * @Version: 1.0
 */
public class MultiThreadOnXml {
    @Test
    public  void test1(){
        System.out.println("Thread Id : %s%n"+Thread.currentThread().getId());
    }
    @Test
    public  void test2(){
        System.out.println("Thread Id : %s%n"+Thread.currentThread().getId());
    }
    @Test
    public  void test3(){
        System.out.println("Thread Id : %s%n"+Thread.currentThread().getId());
    }
}
