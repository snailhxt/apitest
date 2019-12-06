package com.dwd.snail.testng.demo1;

import org.testng.annotations.Test;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.testng.demo1
 * @ClassName: Ignore
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/6 3:06 下午
 * @Version: 1.0
 */
public class Ignore {
    @Test(enabled = false)
    public void ignore(){
        System.out.println(
             "暂时不执行"
        );
    }
    //默认(enabled = true)
    @Test(enabled = true)
    public void ignoreTrue(){
        System.out.println(
                "ignoreTrue会被执行"
        );
    }
}
