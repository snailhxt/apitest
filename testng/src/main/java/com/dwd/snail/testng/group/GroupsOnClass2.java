package com.dwd.snail.testng.group;

import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.group
 * @ClassName: GroupsOnClass2
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 3:33 下午
 * @Version: 1.0
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2-stu1");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2-stu2");
    }
}
