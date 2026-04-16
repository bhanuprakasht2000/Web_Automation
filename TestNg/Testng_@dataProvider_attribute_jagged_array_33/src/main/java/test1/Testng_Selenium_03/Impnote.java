package test1.Testng_Selenium_03;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
		System.out.println("Create the testng.xml file by right clicking on project->testng->testng.xml->follow the suite,test,classes,class,methods,include and exclude format");
		System.out.println("====================================================================================================");
/*		System.out.println("Dataprovider parameters concept is used for"+
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
	*/
		/*System.out.println("There are 4 4return types of Dataprovider ==>1>Object[][]"+
																		"2>Object[]"+
																		"3>Iterator<Object>"+
																		" 4>Iterator<Object[]>");
		System.out.println("3>iterator<Object>-->List"
				+     							"Set"+
												"We cannot run list or set"+
												"We have to return Iterator<Object>"+
												"return data.iterator();");
		System.out.println("Iterator<Object[]>==>list.add(new Object{\"Arun\",\"Motoori\"})");
		System.out.println("For set and list we will follow trhe iterator return type kinly see ther example classes");
		System.out.println("public Iterator<Object> dataobjarr() {\r\n"
				+ "		Set<Object> l= new HashSet<Object>();\r\n"
				+ "		l.add(\"abcd\");\r\n"
				+ "		l.add(\"1234\");\r\n"
				+ "		l.add(\"@#$^\");\r\n"
				+ "		l.add(\"{}{}{}{}\");\r\n"
				+ "		l.add(\"[][][][][]\");\r\n"
				+ "		return l.iterator();");
		System.err.println("Navigate to src/test/java and see the classes for more idea ");
	*/
		System.out.println("Jagged arrays==>An array having 3dim,5dim,2dim etc is called jagged array");
		System.out.println("public Object[][] JaggedArray() {\r\n"
				+ "		Object[][] data= {{\"Anand\",\"Raj\",\"Ravi\"},\r\n"
				+ "				{\"ABhi\"},\r\n"
				+ "				{\"Rahu\",\"Bhanu\",\"Yogi\",\"Rajesh\",\"Ramu\"}\r\n"
				+ "				};\r\n"
				+ "		return data;\r\n"
				+ "	}\r\n"
				+ "	");
		
	
	}
}
