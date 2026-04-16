package Html.Browsermaximize_14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        System.out.println( "Hello World!" );
        WebDriverManager.chromedriver().setup();
        ChromeOptions choptions=new ChromeOptions();
        choptions.addArguments("start-maximized");
        WebDriver driver=new ChromeDriver(choptions);
        //method-1==>driver.manage().window().maximize();
        driver.manage().window().maximize();
        //Method2==>chromeoptions instance and adding start maximize argument to it and passing that instance to the chromebrowser while initializing.
        //method2 code==>ChromeOptions choptions=new ChromeOptions();
       // choptions.addArguments("start-maximized");
       // WebDriver driver=new ChromeDriver(choptions);
        driver.get("https://www.google.com/");
        
        //snapshot
        byte[] src= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.BYTES);
        File dest= new File("./Snaps/img.jpg");
       FileOutputStream fos=new FileOutputStream(dest);
       fos.write(src);
       fos.close();
       //snapshot code completed
       //edge page opening for fbpage
       EdgeOptions eopt=new EdgeOptions();
       eopt.addArguments("start-maximized");
       RemoteWebDriver rwd=new EdgeDriver(eopt);
       rwd.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.quit();
        rwd.quit();

    }
}
