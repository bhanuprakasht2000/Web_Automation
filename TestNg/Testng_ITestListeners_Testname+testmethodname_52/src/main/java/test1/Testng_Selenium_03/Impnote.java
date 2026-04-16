package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test");
   /* System.out.println("===================================================================================");
    System.out.println("The Listeners are used for the listening the events to the that happens in the testing methods such as failed,succeded,skipped etc.,");
    System.out.println("In the the listeners are ITestListener,ISuiteListener,IReporter,IClassListener,IConfigurable,IDataProviderListener etc.,");
    System.out.println("Create a new class with the class name SampleListener which extends the Listener interface"+
    "This interface contails the default methods which means the overriding is not neccessary");
    System.out.println("For getting all the override methods==>From the SampleListenerclass-->Source-->Generate all inherited methods");
    System.out.println("Write the code in the inherited methods as per the wish");
    System.out.println("Create the testclass with the test_methods==>"+
    					"On the top of the class declare as @Listeners(SampleListener.class)");
    System.out.println("if we wrote the Listener class then we have to write like pkgname.classname.class");
    System.out.println("If you have the multiple listeners that has to be applied on the testclass then==> @Listeners({SampleListener.class})");
    System.out.println("I have writen the code to skip 1-testmethod"+
    					"fails 1-testmethod due to assertion false");
    System.out.println("Check the behaviour of the output for analysing the listeners methods");
    System.out.println("=============================================================================");
    System.out.println("For applying at the suite level kindly create a testng.xml file by right clicking on the project-->Testng-->2nd option");
    System.out.println("In the TestNg.xml file at the suite level use the tag of listeners in  which the Listener willl be written");
    System.out.println("Since we are writing the Listener at the suite level hence the listener will be applicable for all the classes in the test-->classes");
System.out.println("In this example we are creating the lister class that implements the Listener interface is created at the Listener package");
System.out.println("Hence the shyntax in the xml file are written as follows:");
System.out.println("<listeners>\r\n"
		+ "<listener class-name=\"Listener.SampleListener\"/>\r\n"
		+ "</listeners>"
		+"at the suite level in the testng.xml file");
    
    System.out.println("For failure and skips case visit the project 48");*/
   System.out.println("===============================================================================");
   System.out.println("In this project we have declared the listener at the suite level"+
   "but we are separating the classses through the tests"
   		+ "Hence the Test Onstart() and Onfinish() methods wiill going to run before and after each and every test in the xml file");
   System.out.println("Program need to be executed from the Testng.xml-->run Suite");

    System.out.println("===================================================================================");
    System.out.println("In this perticular class I am extending the TestListenerAdapaterclass instead of implementing the ITestListener");
    System.out.println("The TestListenerAdapater class implements the ITestListener interface and also other interfaces==>the project will be succes with out any errors through this class as well");
    System.out.println("Program need to be executed from the Testng.xml-->run Suite");
    System.out.println("==================================================================");
    System.err.println("In this program the we are using the test.getTestContext().getName() in the Listener methods to get the test name");
    System.out.println("Program need to be executed from the Testng.xml-->run Suite");


   }
}
