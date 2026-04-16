package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lopginfunction1 {

	WebDriver driver;
	@Test(priority = 1,dataProvider="cred1")
	public void loginwithvalidceredentials(String username,String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[.='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		Thread.sleep(2000);
		System.out.println("Project==>Testng_@dataProvider_multiple_attribute_from_sameclass_29");
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());

	}
	@DataProvider(name="cred")
	public String[][] data() {
		String[][] dataset= {{"bhanubpr420@gmail.com","1234"},{"bhanhj.com","1234234567"},{"bhawert","987654"}};
		return dataset;
	}
	@DataProvider(name="cred1")
	public String[][] data1() {
		String[][] dataset= {{"Sindhu@gmail.com","1234"},{"Bindu.com","1234234567"},{"Vindya","987654"}};
		return dataset;
	}
	//Used for quitting the browser after the execution  of the (fails or passes also)
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
