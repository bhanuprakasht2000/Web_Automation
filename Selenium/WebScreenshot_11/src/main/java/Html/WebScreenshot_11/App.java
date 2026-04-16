package Html.WebScreenshot_11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
    
    public static void main( String[] args ) throws Exception
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbdaily.com/");
        Thread.sleep(3000);
        //Screenshot File 
       File sourcefile =((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);//Original ss
        File destfile=new File("./Sceenshots/img1.jpg");
        FileUtils.copyFile(sourcefile, destfile);
        System.err.println( "Hello World!===>Using remore driver or chrome driver not webdriver(Takescreenshot  interface not avaialble)"+"\n"+"If webdriver(Takescreenshot  interface not avaialble hence cast required) used casting required" );
        System.out.println("Screen shot captured successfully by file");
       //////// //Bytes
//        byte[] arr =driver.getScreenshotAs(OutputType.BYTES);//Original ss//originsl file
//        File bytefile=new File("./Sceenshots/img1.jpg");//writing to this file//destfile
//        FileOutputStream fos=new FileOutputStream(bytefile);
//        fos.write(arr);
//      System.err.println( "Hello World!===>Using remore driver or chrome driver not webdriver(Takescreenshot  interface not avaialble)"+"\n"+"If webdriver(Takescreenshot  interface not avaialble hence cast required) used casting required" );
//        System.out.println("Screen shot captured successfully bY bytearray");
//        fos.close();
       ////// //Base64
//       String base64=driver.getScreenshotAs(OutputType.BASE64);//Original ss//originsl file
//       byte[] byytearr=Base64.getDecoder().decode(base64);
//        File bytefile=new File("./Sceenshots/img1.jpg");//writing to this file//destfile
//        FileOutputStream fos=new FileOutputStream(bytefile);
//        fos.write(byytearr);
//		  System.err.println( "Hello World!===>Using remore driver or chrome driver not webdriver(Takescreenshot  interface not avaialble)"+"\n"+"If webdriver(Takescreenshot  interface not avaialble hence cast required) used casting required" );
//        System.out.println("Screen shot captured successfully by Base64");
//        fos.close();
          
        driver.quit();
        
    }
}
