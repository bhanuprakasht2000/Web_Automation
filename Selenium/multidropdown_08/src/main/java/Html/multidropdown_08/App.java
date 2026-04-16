package Html.multidropdown_08;

import java.util.List;

import javax.sound.midi.SysexMessage;

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
        System.err.println("====Selection and deselection is supported in th multidropdown====");
        System.out.println( "Hello World!" );
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);
       WebElement multidropdown= driver.findElement(By.id("ide"));
       Select selectmulcourse= new Select(multidropdown);
       System.err.println("====All Courses exists in the dropdowns===");
       List<WebElement> allcourses=selectmulcourse.getOptions();
       for (WebElement a : allcourses) {
    	   System.out.println(a.getText());
		
	}
      selectmulcourse.selectByIndex(1);
      Thread.sleep(3000);
      selectmulcourse.selectByValue("vs");
      Thread.sleep(3000);
      selectmulcourse.selectByVisibleText("NetBeans");
      Thread.sleep(3000);
      System.err.println("====First selected course in the dropdowns===");
      System.out.println(selectmulcourse.getFirstSelectedOption().getText());
      System.err.println("====All Courses selected in the dropdowns===");
      List<WebElement> slectedlist=selectmulcourse.getAllSelectedOptions();
      for (WebElement selectedopt : slectedlist) {
          System.out.println(selectedopt.getText());

	}
      selectmulcourse.deselectByValue("vs");
      List<WebElement> selectedcorsedeletvs= selectmulcourse.getAllSelectedOptions();
      System.err.println("====All Courses selected in the dropdowns after deselecting the VS===");
      for (WebElement vsdelete : selectedcorsedeletvs) {
          System.out.println(vsdelete.getText());

	}
      Thread.sleep(3000);
       driver.quit();
    }
}
