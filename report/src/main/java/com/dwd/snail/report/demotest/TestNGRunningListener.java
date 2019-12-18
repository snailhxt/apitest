package com.dwd.snail.report.demotest;

import org.testng.IExecutionListener;

/**
 * Created by zcp on 2018/7/11.
 * Time always， fat thin man all miss.
 */
public class TestNGRunningListener implements IExecutionListener {
    /**
     * Invoked before the TestNG run starts.
     */
    @Override
    public void onExecutionStart() {
        TestNGRunning.testNgIsRunning=true;
    }

    /**
     * Invoked once all the suites have been run.
     */
    @Override
    public void onExecutionFinish() {
        TestNGRunning.testNgIsRunning=false;
    }
}
