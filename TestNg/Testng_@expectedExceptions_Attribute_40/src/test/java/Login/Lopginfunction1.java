package Login;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Lopginfunction1 {
	WebDriver driver;
	@Test(dataProvider="cred",expectedExceptions = {NoSuchElementException.class} )
	public void loginwithvalidceredentials(String uname,String password){
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[.='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email1")).sendKeys(uname);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
	@DataProvider(name="cred",parallel = true)
	public Object[][] loginwithcredentialsdata(){
		Object[][] data= {{"bhanubpr420@gmail.com","1234"}};
		return data;
	
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
