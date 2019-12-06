package com.dwd.snail.testng.canshuhua;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.canshuhua
 * @ClassName: data
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 5:06 下午
 * @Version: 1.0
 */
public class Data {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] objects=new Object[][]{
                {"zhangshan",10},
                {"lisi",20},
                {"wangwu",30}
        };

return objects;
    }
    @Test(dataProvider = "testData")
    public void test1(String name,int age){
        System.out.println("test1......"+"name="+name+";age="+age);
    }
    @Test(dataProvider = "testData")
    public void test2(String name,int age){
        System.out.println("test2......"+"name="+name+";age="+age);
    }
    @DataProvider(name="testData")
    public Object[][] test1Data(Method method){
        Object[][] objects=null;
        if (method.getName().equals("test1")){
           objects=new Object[][]{
                   {"zhangshan",11},
                   {"lisi",21}
           };
        }else if(method.getName().equals("test2")){
            objects=new Object[][]{
                    {"wangwu",31},
                    {"zhaoliu",41}

            };
        }


        return objects;
    }
}
