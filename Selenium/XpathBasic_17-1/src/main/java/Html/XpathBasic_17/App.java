package Html.XpathBasic_17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	public static void main(String[] args) throws Exception {
		System.err.println("Hello World!");
		System.err.println("Use chrome extension of LetxPath as 3rd party tool for the identification");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//absolutepath(driver);
		// relativepath(driver);
		// operators(driver);
		//  conditions(driver);
		// Functions(driver);
		//Axes(driver);
		Shortcuts(driver);
		Thread.sleep(5000);
		driver.quit();

	}
	//Identifying the element through the absolute path
	public  static void absolutepath(WebDriver driver) {
		driver.get("https://www.w3schools.com/");
		highlightElement(driver,driver.findElement(By.xpath("/html/body/div[2]/div/nav/a[3]")));
	}
	//Identifying the element through the relative path
	public  static void relativepath(WebDriver driver) {
		driver.get("https://www.w3schools.com/");
		highlightElement(driver,driver.findElement(By.xpath("//h1[@class='learntocodeh1']")));
		highlightElement(driver,driver.findElement(By.xpath("//h3[@class=\"learntocodeh3\"]")));
	}
	//Operators =,<,<=,>,>=
	public  static void operators(WebDriver driver) {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		highlightElement(driver,driver.findElement(By.xpath("//input[@maxlength=10]")));
		driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("BhanuReddy");
		highlightElement(driver,driver.findElement(By.xpath("//input[@maxlength!=10]")));
		driver.findElement(By.xpath("//input[@maxlength>10]")).sendKeys("Thummalapeta");
		System.out.println(driver.findElement(By.xpath("//input[@maxlength=10]")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@maxlength>10]")).getAttribute("value"));
		highlightElement(driver,driver.findElement(By.xpath("//table/tbody/tr[3]/td[text()>=2000]")));
	}
	//Conditions
	public  static void conditions(WebDriver driver) {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//input[@maxlength >=10 and @type='text']")).sendKeys("Jayanth");
		highlightElement(driver,driver.findElement(By.xpath("//input[@maxlength >10 and @type='text']")));
		// highlightElement(driver,driver.findElement(By.xpath("//input[@maxlength >10 or  @maxlength=10 ]")));  
	}
	//Functions==>text(),contains(),Starts with(),normalize-space(),last(),position()
	public  static void Functions(WebDriver driver) {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		highlightElement(driver, driver.findElement(By.xpath("//h1[text()='Register']")));
		highlightElement(driver, driver.findElement(By.xpath("//a[contains(text(),'Sign in into')]")));
		highlightElement(driver, driver.findElement(By.xpath("//label[starts-with(text(),'Last')]")));
		highlightElement(driver, driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));
		highlightElement(driver, driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[last()]")));
		highlightElement(driver, driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[position()=3 and position()<4]")));
	}
	//Axes==>following-sibling,preceding-sibling,parent,child,descendant,descendant-or-self,ancestor,ancestor-or-self
	public  static void Axes(WebDriver driver) {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//following-sibling,preceding-sibling
		highlightElement(driver, driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[@maxlength=15]")));
		highlightElement(driver, driver.findElement(By.xpath("//label[text()='Last Name']/preceding-sibling::label")));
		//parent,child
		highlightElement(driver, driver.findElement(By.xpath("//td[text()='Maria Anders']/parent::tr")));
		highlightElement(driver, driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr/child::td[text()='Helen Bennett']")));
		//descendant,descendant-or-self
		highlightElement(driver, driver.findElement(By.xpath("//tr/descendant::td[text()='Giovanni Rovelli']")));
		highlightElement(driver, driver.findElement(By.xpath("//div[@class='post-body entry-content']/descendant-or-self::a")));
		//ancestor,ancestor-or-self
		highlightElement(driver, driver.findElement(By.xpath("//button[text()='Reset']/ancestor::div[10]")));
		highlightElement(driver, driver.findElement(By.xpath("//button[text()='Reset']/ancestor-or-self::div")));
	}
	
//Shortcuts
	public  static void Shortcuts(WebDriver driver) {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//Text()=>.
		highlightElement(driver, driver.findElement(By.xpath("//td[.='Mexico']")));		
		highlightElement(driver, driver.findElement(By.xpath("//td[contains(.,'Yoshi ')]")));
		highlightElement(driver, driver.findElement(By.xpath("//td[starts-with(.,'U')]")));
		highlightElement(driver, driver.findElement(By.xpath("//label[normalize-space(.)='First Name']")));		
		//child=>/
		highlightElement(driver, driver.findElement(By.xpath("//div/h1[.='Register']")));
		//Parent=>/..
		highlightElement(driver, driver.findElement(By.xpath("//td[.='5000']/../..")));
		//Descendant=>//
		highlightElement(driver, driver.findElement(By.xpath("//table/tbody/tr//td")));
	}
	
	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='6px solid Red'", element);
	}
}
