package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("Create the testng.xml file by right clicking on project->testng->testng.xml->follow the suite,test,classes,class,methods,include and exclude format");
    System.out.println("====================================================================================================");
    System.out.println("For running  methods run the testng suite from the testng.xml");
    System.out.println("The groups will be declared as @Test(priority = 2,groups= {\"Sanity\",\"All\",\"Login\"}) in the Login,Search,Register classes");
    System.out.println("Smoke will be called form the Search class only due to defining at the xml as testlevel group and habving the class only search init");
    System.out.println("For Running the groups we need add the code   <groups>\r\n"
    		+ "<run>\r\n"
    		+ "<include name=\"Sanity\"/>\r\n"
    		+ "</run>\r\n"
    		+ "</groups>"
    		+"in the testng.xml file");
    System.out.println("The  groups declartion is possible at the suite level or test level==>for ref check testng.xml ");


   }
}

