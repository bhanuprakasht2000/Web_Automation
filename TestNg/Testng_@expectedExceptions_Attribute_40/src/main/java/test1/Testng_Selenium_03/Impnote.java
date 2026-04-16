package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test");
    System.out.println("===================================================================================");
    System.out.println("expectedExceptions attribute is used for the negative testing==>"+
    "Used to verify for any particular exception to be thrown"+
    		" expectedExceptions will not used by the testers in the real time  "+
    "Developers may used for some invalid inputs");
    System.out.println("@Test(dataProvider=\"cred\",expectedExceptions = {NoSuchElementException.class} )==>I have given the wrong test input to the selenium to identify there is no such element(nput-email1 is used instead of nput-email)"+
    "I am getting the exception as NoSuchElementsFound exception==>hesnce test passed");
   }
}
