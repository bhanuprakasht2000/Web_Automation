package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test ");
    System.out.println("================================================================================================");
   /* System.out.println("Assertions are used to verify whether the tests are passed or failed");
    System.err.println("types of assertions==>1>assertEquals()"+
    										  "2>assertNotequals()"+
    										  "3>assertTrue()"+
    										  "4>assertFalse()"+
    										  "5>assertNull()"+
    										  "6>assertNotNull()"+
    										  "7>fail()");
    System.out.println("assertNull(s);//==>it is possible due to adding the import static org.testng.Assert.*; Otherwise Assert.assertNull(s); ");
*/  
    System.out.println("Hard Asseertions==>Will stop the executing cod on the test failure and rest of the code wont be executed"+
    										"Hard assertion s are used for the critical scenarios or main scenarios"+
    										"THe Assertions coming from the predefined class of Assertion are called Hard Assertions");
    System.out.println("Soft Assertions==>Exception will be thrown at the end of the test,and hence execution wont be thrown immediately and remaining code execution will continue in this case"+
    					"create an object for the SoftAssertion==>SoftAssert sa=new SoftAssert"+
    					"sa.asserEquals()"+
    					"At the end of the script we need to write sa.assertAll();==>Recorded assertions will be thrown");
  }
}
