package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test ");
    System.out.println("================================================================================================");
    System.out.println("Assertions are used to verify whether the tests are passed or failed");
    System.err.println("types of assertions==>1>assertEquals()"+
    										  "2>assertNotequals()"+
    										  "3>assertTrue()"+
    										  "4>assertFalse()"+
    										  "5>assertNull()"+
    										  "6>assertNotNull()"+
    										  "7>fail()");
    System.out.println("assertNull(s);//==>it is possible due to adding the import static org.testng.Assert.*; Otherwise Assert.assertNull(s); ");
  }
}
