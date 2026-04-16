package Html.HtmlDrowpdown_07;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

  public static void main(String[] args) throws InterruptedException {
    System.err.println("Hello World!==>Hyr tutorials==>Automation==>dropdown==>Single dropdown");
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://omayo.blogspot.com/");
    
    Actions actions=new Actions(driver);
    WebElement wb= driver.findElement(By.id("blogsmenu"));
    WebElement arunoption= driver.findElement(By.xpath("//span[.='SeleniumOneByArun']"));
   actions.moveToElement(wb).
   moveToElement(arunoption)
   .keyDown(Keys.CONTROL)
   .click()
   .keyUp(Keys.CONTROL)
   .build().perform();

   driver.quit();
    
  }

}
