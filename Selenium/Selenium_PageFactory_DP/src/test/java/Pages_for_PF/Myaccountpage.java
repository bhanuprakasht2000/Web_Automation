package Pages_for_PF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Myaccountpage {
	WebDriver driver;
	public Myaccountpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li/a[.='Edit your account information']")
	private WebElement accountBD;
	//it will duplicated since we are using the @find by
//private By accountBD=By.xpath("//li/a[.='Edit your account information']");
public WebElement myaccountcrub() {
	return accountBD;
	
}
}
