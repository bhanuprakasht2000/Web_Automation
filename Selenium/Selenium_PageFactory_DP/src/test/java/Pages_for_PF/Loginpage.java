package Pages_for_PF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	//Constructor for initializing the driver
	public Loginpage( WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Making the Webelements objects  as private for achieving the Abstraction
	//Page factory objects hence fo in itialization we use PageFactory.initElements(driver, this);
	//THe above line will initialize the bellow elements
	@FindBy(id="input-email")
	private WebElement email_input;
	@FindBy(id="input-password")
	private WebElement password_input;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement login_button;
	//This elements will become duplicates when you initialize objects by the PF by using the @Findby
//	private By email_input=By.id("input-email");
//	private By password_input=By.id("input-password");
//	private By login_button=By.xpath("//input[@class='btn btn-primary']");
	
	
	
	//no driver.findelement is required
	
	
	public  WebElement email_input_field() {
		return email_input;
	}
	public  WebElement password_input_field() {
		return password_input;
	}
	
	
	public  WebElement login_button_click() {
		return login_button;
	}
	
}
