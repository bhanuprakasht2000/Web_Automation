package Retryfailedtests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnanlyser implements IRetryAnalyzer {
	static int count;
	static int endpoint = 2;
	
	public boolean retry(ITestResult result) {
	
		if(count<endpoint) {
			count++;
			return true;
		}
		return false;
	}

}
