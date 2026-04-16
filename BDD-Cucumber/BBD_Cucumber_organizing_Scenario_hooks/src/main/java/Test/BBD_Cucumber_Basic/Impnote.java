package Test.BBD_Cucumber_Basic;

public class Impnote {
	public static void main(String[] args) {
	System.out.println("Create hooks in the Hooks.class in the Hooks package");
	System.out.println("Create Scenario based hooks as ==>public void beforestep(Scenario scenario) {\r\n"
			+ "	System.out.println(\"***Before step*** \"+scenario.getName());\r\n"
			+ "}\r\n"
			+ "@After\r\n"
			+ "public void Afterstep(Scenario scenario) {\r\n"
			+ "	System.out.println(\"***After step*** \"+scenario.getName());\r\n"
			+ "}");
	}
}
