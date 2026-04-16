package textboxes.Html_05;

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
WebDriver driver = new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
Thread.sleep(3000);
WebElement usertxt = driver.findElement(By.id("firstName"));
if(usertxt.isDisplayed()) {
	System.out.println("The User text is displayed");
			if(usertxt.isEnabled()) {
				System.out.println("Usertext is enabled");
			usertxt.sendKeys("Bhanuprakash Reddy");
			Thread.sleep(3000);
			String gettext=usertxt.getAttribute("value");
			System.out.println(gettext);
			driver.quit();
			}
			else
System.out.println("Usertext is not enabled");
}
else
	System.out.println("Usertext not displayed");


}
}
