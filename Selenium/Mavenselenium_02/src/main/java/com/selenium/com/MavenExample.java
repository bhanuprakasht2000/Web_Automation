package com.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MavenExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.err.println("Chrome Browser Started");
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
WebDriver wb= new ChromeDriver();
wb.get("https://www.google.com/");
System.err.println("Chrome Browser Started");

System.out.println("Add depency in th pom.xml and Utube-Hyr tutorial 4&5");
System.err.println("Firefox Browser Started");

System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
WebDriver wb1= new FirefoxDriver();
wb1.get("https://www.google.com/");
System.err.println("Firefox Browser Started");
Thread.sleep(3000);
wb1.quit();	
Thread.sleep(3000);
wb.quit();

	}

}
