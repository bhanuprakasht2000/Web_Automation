package Html.Webelementproperties_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://github.com/login");
   System.out.println("The Tag name is " + driver.findElement(By.id("forgot-password")).getTagName());
   System.out.println("The Tag Attribute value is " + driver.findElement(By.id("forgot-password")).getAttribute("class"));
   WebElement user=driver.findElement(By.name("login"));
   user.sendKeys("ABC");
   System.out.println("The Tag username  value is " +user.getAttribute("value") );
   System.out.println("The css value of the tag sign in  is \n"+
		   "height =" + driver.findElement(By.name("commit")).getCssValue("height")+
		   " & width ="+ driver.findElement(By.name("commit")).getCssValue("width")+
		   " & color= "+driver.findElement(By.name("commit")).getCssValue("background-color"));
   driver.quit();
    
  }
}
