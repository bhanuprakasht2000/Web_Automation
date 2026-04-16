package test1.Testng_basic_01;

public class Impnote {
public static void main(String[] args) {
	System.out.println("mvn project-->Archtype quickstart-->remove junit dependency-->Add testng and logback dependency");
	System.out.println("Download and add the testng plug in in eclipse market place");
	System.out.println("Add the testing class under the src/test/java-->Write code over there");
	System.out.println("@Test(priority = 1)\r\n"
			+ "	public void test3()\r\n"
			+ "	{\r\n"
			+ "		System.err.println(\"This is 3rd method TestNG program!\");\r\n"
			+ "	}"
			+"\r based on the priority-->Execution will be done for the test by ther priorities =>Lowest priority number will be executed first and it goes for the next");
}
}
