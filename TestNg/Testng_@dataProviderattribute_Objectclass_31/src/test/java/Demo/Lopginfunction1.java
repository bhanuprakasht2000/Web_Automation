package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lopginfunction1 {
	
	WebDriver driver;
		@Test(priority = 1,dataProvider="cred")
		public void general(Object usermail,Object no,Object section) throws Exception {
			System.out.println();
			
		}
		@DataProvider(name="cred")
		public Object[][] dataset() {
			Object[][] dataset= {{"xxxx@gmail.com",1,'C'},{"yyyyy@gmail.com",2,'D'},{"zzzz@gmail.com",3,'E'}};
			return dataset;
	}

		
		
}
