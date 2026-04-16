package Html.Webpagetimeout_12;

import java.sql.Time;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webapgetimeout{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // Correct syntax
		System.out.println("driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));");
		System.err.println("if the page not opened in the 1 seconds specified then we will get an exception of org.openqa.selenium.TimeoutException");
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//Expired syntax
		driver.manage().window().maximize();
		Instant starttime=Instant.now();
		driver.get("https://www.hyrtutorials.com/");
		Instant endtime=Instant.now();
		System.out.println("Start time = "+ starttime);
		System.out.println("End time = "+ endtime);
		Duration duration=Duration.between(starttime, endtime);
		System.out.println("Duration = "+duration);
		driver.quit();
		
		
	}
}
