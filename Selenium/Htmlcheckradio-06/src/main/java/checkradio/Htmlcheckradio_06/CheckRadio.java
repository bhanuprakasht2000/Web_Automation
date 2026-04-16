package checkradio.Htmlcheckradio_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRadio {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	Thread.sleep(3000);
	driver.findElement(By.id("femalerb")).click();
	Thread.sleep(3000);
	WebElement checkbox1=driver.findElement(By.id("englishchbx"));
	checkbox1.click();//Checking the box
	Thread.sleep(3000);
	if(checkbox1.isSelected()) {
		checkbox1.click();//Unchecking the checkbox
	}
	driver.findElement(By.id("hindichbx")).click();
	Thread.sleep(3000);
WebElement we=driver.findElement(By.id("email"));
we.sendKeys("Bhanureddy@gmail.com");
	System.out.println(we.getAttribute("value"));
	driver.findElement(By.id("registerbtn")).click();
	System.out.println(driver.findElement(By.id("msg")).getText());
	Thread.sleep(3000);
	driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
