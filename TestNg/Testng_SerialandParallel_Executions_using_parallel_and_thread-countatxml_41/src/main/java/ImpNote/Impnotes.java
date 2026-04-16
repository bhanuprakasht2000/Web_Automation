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

}
}
