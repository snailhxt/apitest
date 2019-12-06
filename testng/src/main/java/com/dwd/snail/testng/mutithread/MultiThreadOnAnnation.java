package com.dwd.snail.testng.mutithread;

import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.mutithread
 * @ClassName: MultiThreadOnAnnation
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 5:27 下午
 * @Version: 1.0
 */
public class MultiThreadOnAnnation {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test4(){
        System.out.println(1);
        System.out.println("Thread Id : %s%n"+Thread.currentThread().getId());
    }
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
