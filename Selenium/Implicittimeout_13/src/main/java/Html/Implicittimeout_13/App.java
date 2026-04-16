package Html.Implicittimeout_13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hello World!");
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    System.err.println("driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));\r\n"
    		+ "Used for the waiting the 10sec to fund the elemement in the webpage if the element not loaded throws an exception");
    driver.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");
    driver.findElement(By.id("btn1")).click();
    driver.findElement(By.id("txt1")).sendKeys("Bhanuprakash reddy");
    driver.findElement(By.id("btn2")).click();    
    driver.findElement(By.id("txt2")).sendKeys("Jayanth reddy");
    Thread.sleep(2000);
    System.out.println(driver.findElement(By.id("txt1")).getAttribute("value"));
    System.out.println(driver.findElement(By.id("txt2")).getAttribute("value"));
    driver.quit();
  }
}
