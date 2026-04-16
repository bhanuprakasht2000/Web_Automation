package LoginwithAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lopginfunction {
	WebDriver driver;//declaring it globally for accessing in each and every method

@BeforeClass
	public void beforeC() {
	System.out.println("Before Class");

	}
@AfterClass
	public void afterC() {
		System.out.println("After Class");

	}
@BeforeTest
	public void beforeT() {
		System.out.println("Before Test");

	}
	public void afterT() {
		System.out.println("After Test");

	}
	@BeforeSuite
	public void beforeS() {
		System.out.println("Before Suite");

	}
	@AfterSuite
	public void afterS() {
		System.out.println("After Suite");

	}
	@BeforeMethod
	public void setup() {
		System.out.println(" Before Method ");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[.='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	@AfterMethod
	public void teardown() {
		System.out.println(" After Method ");
		driver.quit();
	}

	@Test(priority = 1)
	public void loginwithvalidceredentials() {

		driver.findElement(By.id("input-email")).sendKeys("bhanubpr420@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}
	@Test(priority = 2)
	public void loginwithinvalidceredentials()  {

		driver.findElement(By.id("input-email")).sendKeys("braj@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234234");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[.='Warning: No match for E-Mail Address and/or Password.']")).isDisplayed());
	}
	@Test(priority = 3)
	public void loginwithinvalidemailceredentials()  {
		driver.findElement(By.id("input-email")).sendKeys("braj@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234234");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[.='Warning: No match for E-Mail Address and/or Password.']")).isDisplayed());}
	@Test(priority = 4)
	public void loginwithinvalidpasswordceredentials()  {

		driver.findElement(By.id("input-email")).sendKeys("bhanubpr420@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12343456");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[.='Warning: No match for E-Mail Address and/or Password.']")).isDisplayed());
	}
	@Test(priority = 5)
	public void loginwithnoceredentials()  {

		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[.='Warning: No match for E-Mail Address and/or Password.']")).isDisplayed());
	}
}
