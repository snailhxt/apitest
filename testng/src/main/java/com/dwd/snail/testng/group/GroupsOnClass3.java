package com.dwd.snail.testng.group;

import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.group
 * @ClassName: GroupsOnClass3
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 3:33 下午
 * @Version: 1.0
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3-teacher1");

    }
    public void teacher2(){
        System.out.println("GroupsOnClass3-teacher2");

    }
}
