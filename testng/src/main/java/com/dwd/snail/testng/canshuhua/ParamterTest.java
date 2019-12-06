package com.dwd.snail.testng.canshuhua;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.canshuhua
 * @ClassName: ParamterTest
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 4:59 下午
 * @Version: 1.0
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
}
