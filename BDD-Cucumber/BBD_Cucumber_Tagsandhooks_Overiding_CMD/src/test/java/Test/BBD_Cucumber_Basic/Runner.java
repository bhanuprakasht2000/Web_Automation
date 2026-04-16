package Test.BBD_Cucumber_Basic;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
      glue = "Test.BBD_Cucumber_Basic",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        		tags="@Register"
        		
        //tags="@Register and @Failure"
        		//Operators applicable==>Or,Not,And in the Tags
)
public class Runner {

}
