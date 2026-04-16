package Test.BBD_Cucumber_Basic;

public class Impnote {
public static void main(String[] args) {
	System.out.println("Format very imp for runnning all the feature at a time==>/BBD_Cucumber2/src/test/java/Test/BBD_Cucumber/TestRunner.java");
	System.out.println("Format very imp for runnning all the feature at a time==>/BBD_Cucumber2/src/test/resources/features/Login.feature");
	System.err.println("Below line defined the path where need to be used the @Runwith(cucumber.class) and @cucumberoptions");	
	System.out.println("@CucumberOptions(\r\n"
			+ "        features = \"src/test/resources/features\",\r\n"
			+ "        glue = \"Test.BBD_Cucumber\",\r\n"
			+ "        plugin = {\"pretty\", \"html:target/cucumber-report.html\"}\r\n"
			+ ")");
	System.out.println("Background is used for separating the commonly used Given or When or Then or And");
	System.out.println("Search the cucumber.io github page for the cucumber expressions");
	System.out.println("In cucumber we cable to use any one from  the regex or the  cucumber expressions in a step but not the both");

}
}
