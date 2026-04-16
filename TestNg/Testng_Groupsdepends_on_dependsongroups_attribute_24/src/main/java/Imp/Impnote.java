package Imp;



public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
		System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test");
		System.out.println("========================================================================================================================");
	/*	System.out.println("dependsOnGroup is used for the running the tests depending on the previous method groups");
		System.out.println("@Test(priority = 2,groups= {\"Sanity\"},dependsOnGroups = {\"Smoke\"})==>This indicates that once the smoke groups executed then only the Sanity needs to be executed");
		System.out.println("As per the example project-->smoke=>sanity=>regression=>login will  be runned");
*/
		System.out.println("=====groups depends on groups======");
		System.out.println("Any test from the dependent groups fails,remaining all will be skipped");
		System.out.println("create testng.xml by right click on project and on the TESTNG and 2nd option,Add the  following code in the testng.xml");
		System.out.println("<groups>\r\n"
				+ "  <dependencies>\r\n"
				+ "  <group name=\"Smoke\" depends-on=\"Sanity\">\r\n"
				+ "  </group>  <group name=\"Regression\" depends-on=\"Login\"></group>\r\n"
				+ "\r\n"
				+ "  </dependencies>\r\n"
				+ "  </groups>");
		System.out.println("In the 23rd project sanity depends on the smoke but in this project smoke is dependeds sanity");
		System.out.println("Sanity-->smoke");
		System.out.println("Login-->Regression");
		System.out.println("Run the project from the testng.xml suite-->other wise output varies");

	}
}
