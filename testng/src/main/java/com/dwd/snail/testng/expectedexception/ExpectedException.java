package com.dwd.snail.testng.expectedexception;

import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.expectedexception
 * @ClassName: ExpectedException
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 4:32 下午
 * @Version: 1.0
 */
public class ExpectedException {
    /**
     * 什么时候会用到异常测试呢？
     * 在我们预期结果位某一个异常的时候
     * 比如我们传入了不合法的参数，程序抛出了异常，就是我们的结果预期
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFail(){
        System.out.println("runTimeExceptionFail");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucess(){


        System.out.println("runTimeExceptionSucess");
        throw new RuntimeException();
    }
}
