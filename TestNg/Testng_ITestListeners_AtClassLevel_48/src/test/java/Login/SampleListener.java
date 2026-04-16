package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SampleListener implements ITestListener {
	@Override
	public void onTestStart(ITestResult test) {
		String s=test.getName();
		System.out.println("The test started ==>" +s);
	}

	@Override
	public void onTestSuccess(ITestResult test) {
		String s=test.getName();
		System.out.println("The test succeded ==>" +s);

		
	}

	@Override
	public void onTestFailure(ITestResult test) {
		String s=test.getName();
		System.err.println("The test failed==================>" +s);
	}


	@Override
	public void onTestSkipped(ITestResult test) {
		String s=test.getName();
		System.err.println("The test skipped ========>" +s);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
		String s=test.getName();
		System.out.println("The test onTestFailedButWithinSuccessPercentage ==>" +s);
	}
	

	@Override
	public void onTestFailedWithTimeout(ITestResult test) {
		String s=test.getName();
		System.err.println("Failed due to  the timeout=======================>"+s);
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Tests execution started");
		
	}

	@Override
	public void onFinish(ITestContext test) {
		System.out.println("Tests execution completed");

		
	}

		
	
	}
	
	

