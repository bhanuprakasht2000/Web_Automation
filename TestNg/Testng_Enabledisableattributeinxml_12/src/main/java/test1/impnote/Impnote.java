package test1.impnote;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
		System.out.println("Delete the default package came with the project in the src/test/java-->create a new testng class");
		System.out.println("=========================================================================================================================");
		System.out.println("We are going enable and disable the test through the xml file  genereated by right clicking the project test tesng-->2nd option");
		System.out.println("By default the attribute is in enabled condition");
		System.err.println("<test thread-count=\"5\" name=\"Test\" enabled=\"false\">"+"==>out the tests run will be 0 since we disabled here");
		System.err.println("<test thread-count=\"5\" name=\"Test\" enabled=\"true\">"+"==>out the tests run will be 2 since we enabled here");

	}
}
