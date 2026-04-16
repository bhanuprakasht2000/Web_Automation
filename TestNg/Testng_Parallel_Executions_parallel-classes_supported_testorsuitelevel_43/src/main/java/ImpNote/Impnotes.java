package ImpNote;

public class Impnotes {
public static void main(String[] args) {
	System.out.println("Create the classes of Login,Register,Search with the test methods");
	System.out.println("Create a testng.xml file by right clicking on the project-->TestNg-->Second Option");
	System.out.println("Serialization and parallelization depends on the Xml file element");
	System.err.println("parallel=tests sould be mentioned at the Suite level and it not be declared at test level");
	System.err.println("If you use the parallel=tests at the test tag level then serialization will happen");
	System.out.println("Serialization(one by one)==><suite name=\"Suite\">");
	System.out.println("Parallelization(5threads at a time)==><suite name=\"Suite\" parallel=\"tests\" thread-count=\"5\">");
	System.out.println("Run the testng suite from the testng.xml for running all the classes test methods");
	System.out.println("==================================================================================");
	System.err.println("parallel=\"classes\"  thread-count=\"2\"==>can be used at the testlevel and the suite level");
	System.out.println("if you declare the parallel at the test level then the parallelization will be applicable for the classes which are present inside the test level classes");
	System.out.println("if you declare the parallel at the Suite level then the parallelization will be applicable for all the tests-->from there for all the cklassses whic are present inside all the tests");
	System.out.println("EX==>Login and Register-->Testlevel parallelization was declared at Test1 in the testng.xml==>thread-count=2 means 2 threads will opearte at a time-->2 thread ids will print"+
						"Search and Search2 were not declared at the Test2-->They will get executed in the serialization manner-->1 thread id will be used");
System.err.println("<test  name=\"Test1\" parallel=\"classes\" thread-count=\"2\">");
System.out.println("Kindly visit the testng_suitelevel.xml==>Suitelevel declaration and testng_testlevel.xml==>testlevel ");
}
}
