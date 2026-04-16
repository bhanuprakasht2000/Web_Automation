package Test.BBD_Cucumber_Basic;

public class Impnote {
	public static void main(String[] args) {
		System.out.println("Format very imp for runnning all the features of Java at a time declaration==>/BBD_Cucumber_Basic_Tagsandhooks/src/test/java/Test/BBD_Cucumber_Basic/Runner.java");
		System.out.println("Format very imp for runnning all the feature at a time==>/BBD_Cucumber_Basic_Tagsandhooks/src/test/features/Login.feature");
		System.err.println("Below line defined the path where need to be used the @Runwith(cucumber.class) and @cucumberoptions");
		System.out.println("Tags are userdefined that are written in the feature file"+"\nOperators applicable==>Or,Not,And in the Tags in The Runner class");
		System.out.println("@RunWith(Cucumber.class)\r\n"
				+ "@CucumberOptions(\r\n"
				+ "        features = \"src/test/features\",\r\n"
				+ "      glue = \"Test.BBD_Cucumber_Basic\",\r\n"
				+ "        plugin = {\"pretty\", \"html:target/cucumber-report.html\"},\r\n"
				+ "        		tags=\"@Register or @Login or not @Login\")");
		System.out.println("Background is used for separating the commonly used Given or When or Then or And");
		System.out.println("Search the cucumber.io github page for the cucumber expressions");
		System.out.println("In cucumber we cable to use any one from  the regex or the  cucumber expressions in a step but not the both");
		System.out.println("Hooks are used for declaring stmt before and after the step definition");
		System.err.println("In this project hooks declared in the Login.java(@After,@Before,@AfterStep and @BeforeStep)"+"\n Once the hooks declared then it is applicable for all the Features(Login,Register and Search)");
	}
}
