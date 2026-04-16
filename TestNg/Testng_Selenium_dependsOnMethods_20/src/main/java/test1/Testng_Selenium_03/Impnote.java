package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test");
    System.out.println("========================================================================================================================");
    System.out.println("Priority verses dependsonmethods attribute");
    System.err.println("Dependsonmethods overrrides priority");
    System.out.println("Ignore the main Test will cuase an error");
    System.out.println("Delete the main test will cause an error");
    System.err.println("Instead of priority we will use the dependsOnMethods==>@Test(priority=1,dependsOnMethods = {\"loginwithvalidceredentials\"})");
    
   }
}
