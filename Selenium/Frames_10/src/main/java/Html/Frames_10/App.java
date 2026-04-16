package Html.Frames_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Text1");//Main webpage
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("name")).getAttribute("value"));
        driver.switchTo().frame("frm1");//Frame 1
      WebElement dropdown = driver.findElement(By.id("selectnav1"));
      Select seldrop=new Select(dropdown);
      seldrop.selectByVisibleText("- Dot Net");
      System.out.println(seldrop.getFirstSelectedOption().getText());
      driver.switchTo().defaultContent();//Main web page
      driver.switchTo().frame("frm2");//frame2
      Select seldrp=new Select(driver.findElement(By.id("selectnav1")));
      seldrp.selectByVisibleText("- Telugu");
      Thread.sleep(3000);
      System.out.println(seldrp.getFirstSelectedOption().getText());
      driver.findElement(By.id("firstName")).sendKeys("Bhanuprakash reddy");
      Thread.sleep(3000);
      System.out.println(driver.findElement(By.id("firstName")).getAttribute("value"));
      driver.switchTo().defaultContent();//Main web page
      driver.findElement(By.id("name")).clear();//clears the text1
      Thread.sleep(3000);
      driver.findElement(By.id("name")).sendKeys("Text2");//Main webpage>>inserts text2
      Thread.sleep(3000);
      System.out.println(driver.findElement(By.id("name")).getAttribute("value"));
      
        driver.quit();
    }
}
