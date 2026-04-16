package test1.Selenium_POM_SP;

public class Impnote {
public static void main(String[] args) {
	System.out.println("POM==>Page object model");
	System.out.println("Each and everypage in the application,we need to create a separate java class file in elements  the project framework");
	System.out.println("Web Ui elements on a page ,will be created as objects in the corresponding java class files");
	System.out.println("Creation of driver  at the global scope level and passing it the constuctor of each and ebvery page is required");
	System.out.println("In the Testing package the tests will be created for testing the each and every page");
	System.out.println("Here we will achive the abstraction==>hiding the implemantation and showing upto the required extension");
	System.out.println("Abstraction was achieved by making the data members as private and methods as public");
	System.out.println("In the Test class also we are usimng the global scoped webdriver creation since the browser need to be quitted by using @Aftermethod==>which dont cares about testcase pass or fail and quits the browser");

	System.out.println("The driver.findelement is used in the POM each and every page  but not in the Page Fatory");
}
}
