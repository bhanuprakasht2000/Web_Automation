package test1.impnote;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the default package came with the project in the src/test/java-->create a new testng class");
		System.out.println("=========================================================================================================================");
		System.out.println("create testng.xml by right click on project and on the TESTNG and 2nd option");
		System.out.println("Delete the Classes section and add the following code");
		System.out.println("<packages>\r\n"
				+ "   <package name=\"Demo\"></package>\r\n"
				+ "   </packages>");
		System.out.println("I have ignored the searchpackage hence the 8 should execute");
		System.out.println("Run the project from the testng.xml suite-->otherwise output not give proper output");
	}
}
