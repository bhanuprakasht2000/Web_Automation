package Html.HtmlDrowpdown_07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

  public static void main(String[] args) throws InterruptedException {
    System.err.println("Hello World!==>Hyr tutorials==>Automation==>dropdown==>Single dropdown");
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
    Thread.sleep(3000);
   WebElement coursedrop = driver.findElement(By.id("course"));
   //For slecting the dropdown opotion we need the select class
   Select selectcorse=new Select(coursedrop);
   //For printing all the dropdown options available in the dropdown
  List<WebElement> list = selectcorse.getOptions();
  for (WebElement web : list) {
	  System.out.println(web.getText());
}
  System.err.println("===============");
   System.out.println(selectcorse.getFirstSelectedOption().getText());
   selectcorse.selectByIndex(1);
   Thread.sleep(3000);
   selectcorse.selectByValue("js");
   Thread.sleep(3000);
   System.err.println("===============");
   System.out.println(selectcorse.getFirstSelectedOption().getText());
   driver.quit();
    
  }

}
