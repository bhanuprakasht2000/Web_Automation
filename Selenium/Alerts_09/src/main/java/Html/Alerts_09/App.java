package Html.Alerts_09;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	Thread.sleep(3000);
	//Alert
	driver.findElement(By.id("alertBox")).click();
	Thread.sleep(3000);
	System.err.println("======Alertbox=====");
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	System.out.println(driver.findElement(By.id("output")).getText());
	
	Thread.sleep(3000);
	
	//Confirm box
	System.err.println("======Confirmbox=====");
	driver.findElement(By.id("confirmBox")).click();
	Thread.sleep(3000);
	System.err.println("Pressing Ok on the confirmation box");
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	System.out.println(driver.findElement(By.id("output")).getText());
	System.err.println("Pressing cancel on the confirmation box");
	driver.findElement(By.id("confirmBox")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	System.out.println(driver.findElement(By.id("output")).getText());
	Thread.sleep(3000);
	//Prompt box
	System.err.println("======Promptbox=====");
	//acception
	driver.findElement(By.id("promptBox")).click();
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("Bhanuprakash Reddy");
	System.err.println("Pressing Ok on the prompt box");
	driver.switchTo().alert().accept();
	System.out.println(driver.findElement(By.id("output")).getText());
//Cancellation
	driver.findElement(By.id("promptBox")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("Jayanth Reddy");
	System.err.println("Pressing Cancel on the prompt box");
	driver.switchTo().alert().dismiss();
	System.out.println(driver.findElement(By.id("output")).getText());
	
	driver.quit();
	

}
}
