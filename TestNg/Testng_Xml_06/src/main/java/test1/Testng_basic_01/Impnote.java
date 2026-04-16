package test1.Testng_basic_01;

public class Impnote {
public static void main(String[] args) {
	System.out.println("mvn project-->Archtype quickstart-->remove junit dependency-->Add testng and logback dependency");
	System.out.println("Download and add the testng plug in in eclipse market place");
	System.out.println("Add the testing class under the src/test/java-->Write code over there");
	System.err.println("@Test(priority = 1)\r\n"
			+ "	public void test3()\r\n"
			+ "	{\r\n"
			+ "		System.err.println(\"This is 3rd method TestNG program!\");\r\n"
			+ "	}"
			+"\r based on the priority-->Execution will be done for the test by ther priorities =>Lowest priority number will be executed first and it goes for the next");

	System.out.println("Right click on the projexct and go down and lick on the testng-->create testng.xml file"
	+"\ryou can name it as per your requirement==>You can have the multiple xml files "+"\r Run the test suite from the xml files as per the requirement"
	);
	System.err.println("Add the code in testng.xml-->"
			+ "<suite name=\"Suite\">\r\n"
			+ "    <test name=\"Test\">\r\n"
			+ "        <classes>\r\n"
			+ "            	<class name=\"A.Demo\">\r\n"
			+ "            		<methods>\r\n"
			+ "            			<include name=\"demotest1\"></include>\r\n"
			+ "           			 </methods>\r\n"
			+ "           		 </class>\r\n"
			+ "             <class name=\"A.AppTest\">\r\n"
			+ "            <methods>\r\n"
			+ "            	<exclude name=\"apptest1\"></exclude>\r\n"
			+ "            </methods>\r\n"
			+ "            </class>\r\n"
			+ "        </classes>\r\n"
			+ "    </test>\r\n"
			+ "</suite>");
	

}
}
