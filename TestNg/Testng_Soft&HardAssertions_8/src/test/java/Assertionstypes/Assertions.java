package Assertionstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.*;


public class Assertions {
	/*types of assertions==>				1>assertEquals()"+
    										  "2>assertNotequals()"+
    										  "3>assertTrue()"+
    										  "4>assertFalse()"+
    										  "5>assertNull()"+
    										  "6>assertNotNull()"+
    										  "7>fail()"    */
	SoftAssert softassert=new SoftAssert();
	
	@Test(priority = 1)
	public void Hardandsoft() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(3000);
		String actualtitle=driver.getTitle();
		String expectedtitle="Your Store";
		//1st Assertion
		softassert.assertEquals(actualtitle, expectedtitle);
		
		//2nd Assertion
		String actualurl=driver.getCurrentUrl();
		String exptedurl="https://tutorialsninja.com/demo/";
		softassert.assertEquals(actualurl, exptedurl);
		
		
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("Hp",Keys.ENTER);
		//3rd Assertion
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		driver.quit();
		 softassert.assertAll();
	}

}
