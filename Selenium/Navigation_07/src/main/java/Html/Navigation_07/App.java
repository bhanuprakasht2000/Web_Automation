package Html.Navigation_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.google.com/");
  WebElement we= driver.findElement(By.name("q"));
  we.sendKeys("https://www.instagram.com/accounts/login/?hl=en");
  Thread.sleep(3000);
  we.submit();
  Thread.sleep(3000);
  driver.navigate().back();
  Thread.sleep(3000);
  driver.navigate().forward();
  Thread.sleep(3000);
  driver.navigate().refresh();
  Thread.sleep(3000);
  driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html");
  Thread.sleep(3000);

  driver.quit();
    	
    }
}
