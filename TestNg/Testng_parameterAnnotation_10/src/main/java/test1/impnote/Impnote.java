package test1.impnote;

public class Impnote {
  public static void main(String[] args) {
    System.out.println("Remove junit dependency-->Add webdriver,selenium java,logback,testng and add plug in testng for the eclipse");
    System.out.println("Delete the defaultb package came with the project in the src/test/java-->create a new testng class");
    System.out.println("=========================================================================================================================");
    System.out.println("Parameters==>If we want to pass anything to the TestNg methods from testng.xml we have to use parameters");
    System.out.println("we can able to provide the scope for the parameters as the Suite level,Test level,classlevel,methodlevel");
    System.out.println("I have provided the scope for the Parameter from the suite level in the testng.xml");
    System.err.println("At the suite level, you can create parameter tags==>Scope==>All the tests under the suite can access the these parameters"+
    					"At the test level,you can create this parameter tags==>Scope==>All the tests under the suite can access the these parameters"+
    					"<parameter name=\"url\" value=\"https://tutorialsninja.com/demo/\"></parameter>\r\n"
    					);
    System.err.println("@Test Methods==>Above @Test,provide an annotation say @parameters(\"url"+
    					"Create parameter string url in the test method==>Can give the name to parameter if required"+
    																	"==>No need to be same if you want you can name it as same as well"+
    									"And use the parameter in the test method"+
    																	"Multiple parameters==>@parameters({\"username\",\"password\"})");
    System.err.println("You need to run the suite from the testng.xml otherwise it will throw an error since it wont get any parameters");}
}
