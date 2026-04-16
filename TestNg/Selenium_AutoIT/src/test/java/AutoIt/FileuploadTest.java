package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadTest{
	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	WebElement wb=	driver.findElement(By.id("uploadfile"));
		Actions aa= new Actions(driver);
		aa.moveToElement(wb).click().build().perform();
		Runtime.getRuntime().exec("\"C:\\Users\\Bhanuprakash Reddy\\Desktop\\Kaveri tech\\TestNg\\Selenium_AutoIT\\src\\main\\resources\\Browsefile.exe\"");
		System.out.println("File uploaded ==>imp poins check src/main/java/impnote.class");
		driver.quit();
	}

}
