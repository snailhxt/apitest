package com.dwd.snail.report.demotest;

import lombok.extern.slf4j.Slf4j;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ProjectName: apitest
 * @Package: com.dwd.snail.report.demotest
 * @ClassName: SnailTestListenerAdapter
 * @Author: dwd
 * @Description:
 * @Date: 2019/12/18 6:39 下午
 * @Version: 1.0
 */
@Slf4j
public class SnailTestListenerAdapter extends TestListenerAdapter {
    private List<ITestNGMethod> m_allTestMethods = Collections.synchronizedList(Lists.newArrayList());
    private List<ITestResult> m_passedTests = Collections.synchronizedList(Lists.newArrayList());
    private List<ITestResult> m_failedTests = Collections.synchronizedList(Lists.newArrayList());
    private List<ITestResult> m_skippedTests = Collections.synchronizedList(Lists.newArrayList());
    private List<ITestResult> m_failedButWSPerTests = Collections.synchronizedList(Lists.newArrayList());
    private List<ITestContext> m_testContexts = Collections.synchronizedList(new ArrayList());
    private List<ITestResult> m_failedConfs = Collections.synchronizedList(Lists.newArrayList());
    private List<ITestResult> m_skippedConfs = Collections.synchronizedList(Lists.newArrayList());
    private List<ITestResult> m_passedConfs = Collections.synchronizedList(Lists.newArrayList());
    @Override
    public void onTestSuccess(ITestResult var1) {
        this.m_allTestMethods.add(var1.getMethod());
        this.m_passedTests.add(var1);
        log.info("成功用例："+var1.getName());
    }
    @Override
    public void onTestFailure(ITestResult var1) {
        this.m_allTestMethods.add(var1.getMethod());
        this.m_failedTests.add(var1);
        log.info("失败用例："+var1.getName());

    }

}
