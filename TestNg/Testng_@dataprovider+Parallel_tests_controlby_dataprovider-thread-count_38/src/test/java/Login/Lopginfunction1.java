package Login;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Lopginfunction1 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	}
	@Test(dataProvider="cred")
	public void loginwithvalidceredentials(String uname,String password){
		driver.findElement(By.id("input-email")).sendKeys( uname);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
	@DataProvider(name="cred",parallel=true)
	public Object[][] loginwithcredentialsdata(){
		Object[][] data= {{"AAA","123"},{"BBB","123"},{"CCC","123"},
	{"AAA","123"},{"BBB","123"},{"CCC","123"},
	//{"AAA","123"},{"BBB","123"},{"CCC","123"}
				};
		return data;
	
		
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
	
}
