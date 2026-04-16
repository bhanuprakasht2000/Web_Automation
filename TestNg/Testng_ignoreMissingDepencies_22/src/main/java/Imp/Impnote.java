package Imp;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
		System.out.println("asserttrue()method is used from Asset class in the testng-->defines the true or false for declaring pass or fail of test");
		System.out.println("========================================================================================================================");
		//    System.out.println("Priority verses dependsOnMethods attribute");
		//    System.err.println("dependsOnMethods overrides priority");
		//    System.out.println("Ignore the main Test will cause an error");
		//    System.out.println("Delete the main test will cause an error");
		//    System.err.println("Instead of priority we will use the dependsOnMethods==>@Test(priority=1,dependsOnMethods = {\"loginwithvalidceredentials\"})");
	/*	
	 System.out.println("==============Alwaysrun Attribute====");
	 System.err.println("Always run is used for running the test method ehther the dependent method may execute or fail also");
		System.out.println("In this project i am intentionally failing the testmethod(loginwithvalidceredentials) at the assertion level");
		System.out.println("The searchedwishlist method is dependent on the loginwithvalidceredentials method==> if it fails then searchedwishlist will also fails");
		System.out.println("To avoid this scenario of depenmdency even if the loginwithvalidcredentials fials or passes also searchedwishlist method will executed "+
				"for that we are using the attribute==>alwaysRun=true at the method level");
		System.out.println("The removewishlist method is depended on the searchedwishlist and loginwithvalidceredentials and alwaysRun attribute not enabled"+
				"hence due to the failure of the loginwithvalidceredentials this method test will be skipped");
		System.out.println("check the testng results you will found as login==failed,search==passed,remove==skipped");
	*/
		System.out.println("==========ignoreMissingDepenceies attribute=========");
		System.out.println("alwaysRun==>used for running the other tests even the dependent test fails");
		System.out.println("ignoreMissingMethods==>used for running the other tests even the dependent test deleted or ignored");
		System.out.println("Example program==>This project i have ignored or deleted(Login) the main dependent test"+
		"Then runned search method will run and remove will not run it will be skipped since search will failed" +
				" I have used alwaysRun attribute to run the remove test hence the 2 are runned and since login deleted-->check the testng results ");
	
	}
}
