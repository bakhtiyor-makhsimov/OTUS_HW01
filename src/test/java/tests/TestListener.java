package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test Started");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Success!");
    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("Test Completed");
    }
}
