package Test.BBD_Cucumber_Basic;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/features",
      glue = {"Test.BBD_Cucumber_Basic"},
        plugin = {"pretty", "html:target/cucumber-report.html"}
        		//tags="@Register or @Login or  @search"
        		
        //tags="@Register and @Failure"
        		//Operators applicable==>Or,Not,And in the Tags
)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
