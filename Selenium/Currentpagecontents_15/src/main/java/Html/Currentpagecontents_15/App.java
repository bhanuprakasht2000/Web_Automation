package Html.Currentpagecontents_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://google.com/");
   //title
    System.err.println("========title=====");
   String title= driver.getTitle();
   System.out.println(title);
// //Url
   System.err.println("========Url=====");
  String url= driver.getCurrentUrl();
  System.out.println(url);
//  //Source
 // System.err.println("========SRC=====");
 // String src=driver.getPageSource();
 // System.out.println(src);
  driver.quit();
   
   
    
    
  }
}
