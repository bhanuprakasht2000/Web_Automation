package TestofPOM;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages_for_PF.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpagetest {
	WebDriver driver;
	@Test
	public void Loginwithcredentials() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//Login page
		Loginpage lp= new Loginpage(driver);
		lp.email_input_field().sendKeys("bhanubpr420@gmail.com");
		lp.password_input_field().sendKeys("1234");
		lp.login_button_click().click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[.='My Account']")).isDisplayed());

		//Account page==>//li/a[.='Account']
		Myaccountpage acctpage=new Myaccountpage(driver);
		acctpage.myaccountcrub().click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[.='My Account Information']")).isDisplayed());
		//driver.quit();

	}
	@AfterMethod
	public void close() {
		driver.quit();
	}


}
