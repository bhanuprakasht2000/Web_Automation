package Pages_for_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Myaccountpage {
	WebDriver driver;
	public Myaccountpage(WebDriver driver) {
		this.driver=driver;
	}
	
private By accountBD=By.xpath("//li/a[.='Edit your account information']");
public WebElement myaccountcrub() {
	return driver.findElement(accountBD);
	
}
}
