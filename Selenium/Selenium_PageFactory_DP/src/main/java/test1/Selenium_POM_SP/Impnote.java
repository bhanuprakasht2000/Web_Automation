package test1.Selenium_POM_SP;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Page factory is a built selenium webdriver class  ");
		System.out.println("Supports POM design pattern,by initializing objects");
		System.err.println("	@FindBy(id=\"input-email\")\r\n"
				+ "	private WebElement email_input;\r\n"
				+ "	@FindBy(id=\"input-password\")\r\n"
				+ "	private WebElement password_input;\r\n"
				+ "	@FindBy(xpath=\"//input[@class='btn btn-primary']\")");
		System.out.println("//This elements will become duplicates when you initialize objects by the PF by using the @Findby\r\n"
				+ "private By email_input=By.id(\"input-email\");\r\n"
				+ "rivate By password_input=By.id(\"input-password\");\r\n"
				+ "private By login_button=By.xpath(\"//input[@class='btn btn-primary']\");\r\n"
				+ "	");
		System.out.println("driver.findelement will not be supported insted we will use the direct varaibles since the PF will initialize the objects");
		System.out.println("System.out.println(\"Creation of driver  at the global scope level and passing it the constuctor of each and ebvery page is required\");\r\n"
				);
		System.out.println("In the Test class also we are usimng the global scoped webdriver creation since the browser need to be quitted by using @Aftermethod==>which dont cares about testcase pass or fail and quits the browser");
		System.err.println("PageFactory.initElements(driver, this);==>This line need to be added in the constuctors of the pages");	}

}
