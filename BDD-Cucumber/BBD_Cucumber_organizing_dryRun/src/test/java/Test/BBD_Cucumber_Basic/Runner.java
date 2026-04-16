package Test.BBD_Cucumber_Basic;

import org.junit.runner.*;

import io.cucumber.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
      glue = {"Test.BBD_Cucumber_Basic","Hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html",
        		"junit:target/cucumber-report.xml",
        		"json:target/cucumber-report.json"
        	},dryRun=true ,
        		tags="@Register or @Login or not @Login"
        		
        		
        //tags="@Register and @Failure"
        		//Operators applicable==>Or,Not,And in the Tags
)
public class Runner {

}
