package Assertionsandtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
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
	@Test(priority = 1)
	public void assertequals() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String actual_title=driver.getTitle();
		String expected_title="Your Store";
		//Using the asserion to check the actual vs expected title
		Assert.assertEquals(actual_title, expected_title);
		driver.quit();
	}
	@Test(priority = 2)
	public void assertNotEquals() {
		String s1="Bhanu";
		String s2="Reddy";
		Assert.assertNotEquals(s1, s2);
	}
	@Test(priority = 3)
	public void assertTrue() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).sendKeys("braj@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[.='Warning: No match for E-Mail Address and/or Password.']")).isDisplayed()); 
		driver.quit();
	}
	@Test(priority = 4)
	public void assertFalse() throws Exception {
		String s="Bhanu is not a good guy";
		Assert.assertFalse(s.contains("raju"));
		
	}
	@Test(priority = 5)
	public void assertNullmethod() throws Exception {
		String s=null;
		assertNull(s);//==>it is possible due to adding the import static org.testng.Assert.*;

		
	}
	@Test(priority = 6)
	public void assertNotNull() throws Exception {
		String s="Bhanu is not a good guy";
		Assert.assertNotNull(s);
		
	}
	@Test(priority = 7)
	public void fail() throws Exception {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	if(driver.findElement(By.linkText("MacBook")).isDisplayed());
	Assert.fail("Macbook is displayed hence its failed");
	driver.quit();
	}
}
