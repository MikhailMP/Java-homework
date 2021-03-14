package test.java.Helpers;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 1;
    private final int COUNTER = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(COUNTER > retryCount){
            retryCount++;
            return  true;
        }
        else{
            return false;
        }
    }
}
