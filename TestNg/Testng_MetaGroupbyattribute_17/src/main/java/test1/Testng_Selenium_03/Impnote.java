package test1.Testng_Selenium_03;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("Create the testng.xml file by right clicking on project->testng->testng.xml->follow the suite,test,classes,class,methods,include and exclude format");
    System.out.println("====================================================================================================");
   /* System.out.println("For running  methods run the testng suite from the testng.xml");
    System.out.println("The groups will be declared as @Test(priority = 2,groups= {\"Sanity\",\"All\",\"Login\"}) in the Login,Search,Register classes");
    System.out.println("For Running the groups we need add the code   <groups>\r\n"
    		+ "<run>\r\n"
    		+ "<include name=\"Sanity\"/>\r\n"
    		+ "</run>\r\n"
    		+ "</groups>"
    		+"in the testng.xml file");
    System.out.println("The  groups declaration is possible at the suite level or test level==>for ref check testng.xml ");*/
    System.err.println("Meta groups are not supported at the suite level and they have to be usede at the test level");
    System.out.println("The meta groups are declared as==>"+
    					"<groups>\r\n"
    					+ "  <define name=\"dailybuild\">\r\n"
    					+ "  <include name=\"Smoke\"/>\r\n"
    					+ "  </define>\r\n"
    					+ "  <define name=\"weeklybuild\">\r\n"
    					+ "  <include name=\"Sanity\"/>\r\n"
    					+ "  </define>\r\n"
    					+ "<run>\r\n"
    					+ "<include name=\"dailybuild\"/>\r\n"
    					+ "</run>\r\n"
    					+ "</groups>"
    					+"\r For ref check testng.xml");
    System.out.println("I have choosen the 'dailybuild form the test1 and montlbuild form the test2'");


   }
}

