package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test");
    System.out.println("===================================================================================");
    System.out.println("here I am running the 30tests which are going to run 1 by 1 then its a time consuming process hence we will use the parallel attribute to overcome this problem");
    System.out.println("Due to this the load on the website will increse hence the application will not able to perform the action we will get the problems");
    System.out.println("To over come above problem we are going to control the data provider thread count in the xml file-->Which specifies the exact numbers tests that need to be run at a time");
    System.out.println("Generate  the xml file-->right click on the project at the bottom click on testng-->select second option for generating the xml.file");
    System.out.println("At the suite level declare how many tests to be runned at a time-->"+
    "<suite name=\"Suite\" data-provider-thread-count=\"2\" >");
    System.out.println("Due to the laptop configuration less there are not working properly");  }
}
