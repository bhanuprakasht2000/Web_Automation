package test1.Testng_Selenium_03;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
		System.out.println("Create the testng.xml file by right clicking on project->testng->testng.xml->follow the suite,test,classes,class,methods,include and exclude format");
		System.out.println("====================================================================================================");
		System.out.println("Dataprovider parameters concept is used for"+
				"checking the Same testcase(testmethod)with the different datasets"+
				"This will ensure that test passes or fails"); 
		System.out.println("Ex-->School apln login=>Checking eith the different students data whether logging in or not to the application");
		System.out.println("@DataProvider\r\n"
				+ "		public String[][] data() {\r\n"
				+ "			String[][] dataset= {{\"bhanubpr420@gmail.com\",\"1234\"},{\"bhanhj.com\",\"1234234567\"},{\"bhawert\",\"987654\"}};\r\n"
				+ "			return dataset;\r\n"
				+ "		}===>We used the "
				+ "1>@dataProvider on top of the TestMethod"
				+ "2>parameters inside the testmethod()--->public void loginwithvalidceredentials(String username,String password)  ");
		System.out.println("==================================");
		System.out.println("We are passing the data from othe class instezc of the same class");
		System.out.println("In addition tom the 26th project we are using the @Dataprovider(name=\"cred\");	}");
		System.out.println("On top of the tedtmethod we wre using the name(cred) as @Test(priority = 1,dataProvider=\"cred\",dataProviderClass = Datap.class)");
				
}}

