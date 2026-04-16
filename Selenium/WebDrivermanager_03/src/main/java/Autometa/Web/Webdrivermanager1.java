package Autometa.Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
System.err.println("Chrome browser start");
WebDriverManager.chromedriver().setup();
WebDriver wb=new ChromeDriver();
wb.get("https://www.Amazon.com");
System.err.println("Chrome browser end");


System.err.println("add the selenium server++Log dependency and webdriver manager in  the pom.xml>>Utube Hyr tutorials 6");

System.err.println("Firefox browser start");
WebDriverManager.firefoxdriver().setup();
WebDriver wb1=new FirefoxDriver();
wb1.get("https://www.Flipkart.com/");
System.err.println("Firefox browser end") ;
Thread.sleep(3000);
wb1.close();
Thread.sleep(3000);
wb.close();

		
	}

}
