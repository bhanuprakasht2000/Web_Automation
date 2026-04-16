package test1.Testng_Selenium_03;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
		System.out.println("Create the testng.xml file by right clicking on project->testng->testng.xml->follow the suite,test,classes,class,methods,include and exclude format");
		System.out.println("====================================================================================================");
		System.out.println("Indice attribute can be used with the Dataprovider annotation to partially apss the data to the test methods ");
		System.out.println("@Dataprovider(indices={0,3})==>Pass the 0th and 3rd elements in the dataprovider");
		System.out.println("To investigate the failed data out of large amount of data passed from object provider method");
		System.out.println("@DataProvider(name=\"in\",indices = {0,2})==>0th and 2nd index elements will be provided for the test method");
	}
}
