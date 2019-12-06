package com.dwd.snail.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.group
 * @ClassName: grouptest
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 3:21 下午
 * @Version: 1.0
 */
public class grouptest {
    @Test(groups = "snail")
    public void test1(){
        System.out.println("snail-test1");
    }
    @Test(groups = "snail")
    public void test2(){
        System.out.println("snail-test2");
    }

    @Test(groups = "snick")
    public void test3(){
        System.out.println("snick-test3");
    }
    @Test(groups = "snick")
    public void test4(){
        System.out.println("snick-test4");
    }
    @BeforeGroups("snail")
    public void beforeGroupSnail(){
        System.out.println("BeforeGroups-snail");
    }
    @AfterGroups("snail")
    public void afterGroupSnail(){
        System.out.println("AfterGroups-snail");
    }

    @BeforeGroups("snick")
    public void beforeGroupSnick(){
        System.out.println("BeforeGroups-snick");
    }
    @AfterGroups("snick")
    public void afterGroupSnick(){
        System.out.println("AfterGroups-snick");
    }
}
