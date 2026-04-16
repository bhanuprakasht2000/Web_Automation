package Pages_for_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	
	//Constructor for initializing the driver
	public Loginpage( WebDriver driver){
		this.driver=driver;
	}
	//Making the Webelements objects  as private for achieving the Abstraction
	private By email_input=By.id("input-email");
	private By password_input=By.id("input-password");
	private By login_button=By.xpath("//input[@class='btn btn-primary']");
	
	public  WebElement email_input_field() {
		return driver.findElement(email_input);
	}
	public  WebElement password_input_field() {
		return driver.findElement(password_input);
	}
	public  WebElement login_button_click() {
		return driver.findElement(login_button);
	}
	
}
