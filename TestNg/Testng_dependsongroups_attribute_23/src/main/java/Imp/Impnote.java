package Imp;



public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
		System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test");
		System.out.println("========================================================================================================================");
		System.out.println("dependsOnGroup is used for the running the tests depending on the previous method groups");
		System.out.println("@Test(priority = 2,groups= {\"Sanity\"},dependsOnGroups = {\"Smoke\"})==>This indicates that once the smoke groups executed then only the Sanity needs to be executed");
		System.out.println("As per the example project-->smoke=>sanity=>regression=>login will  be runned");

	}
}
