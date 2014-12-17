package com.myProject;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: haoji
 * Date: 12/17/14
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyTestListenerAdapter extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getMethod().getRetryAnalyzer() != null) {
            MyRetryAnalyzer retryAnalyzer = (MyRetryAnalyzer)result.getMethod().getRetryAnalyzer();

            if(retryAnalyzer.isRetryAvailable()) {
                result.setStatus(ITestResult.SKIP);
            } else {
                result.setStatus(ITestResult.FAILURE);
            }
            Reporter.setCurrentTestResult(result);
        }
    }
}
