package Login;

import java.time.Duration;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lopginfunction {

	
	@Test(priority = 1,groups= {"Smoke"})
	public void loginwithvalidceredentials() {
		System.out.println("loginwithvalidceredentials-Smoke");
		
	}
	@Test(priority = 1,groups= {"Smoke"})
	public void loginwithinvalidceredentials() {
		System.out.println("loginwithinvalidceredentials-Smoke");
		
	}
	@Test(priority = 2,groups= {"Sanity"})
	public void loginwithinvalidusernameandvalidpassword() {
		System.out.println("loginwithinvalidusernameandvalidpassword-Sanity");
		
	}
	@Test(priority = 2,groups= {"Sanity"})
	public void loginwithvalidusernameandinvalidpassword() {
		System.out.println("loginwithvalidusernameandinvalidpassword-Sanity");
		
	}
	
	@Test(priority = 3,groups= {"Regression"} )
	public void loginwithoutcredentials() {
		System.out.println("loginwithoutcredentials-Regression");
		
	}
	@Test(priority = 3,groups= {"Login"})
	public void loginwithmouseactions() {
		System.out.println("loginwithmouseactions-Login");
		
	}
	
	
}
