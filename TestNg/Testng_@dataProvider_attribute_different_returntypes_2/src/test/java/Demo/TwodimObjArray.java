package Demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwodimObjArray {
		@Test(priority = 1,dataProvider="data")
		public void Stringmethod(String username,String password) {
		
		}
		@DataProvider
		public String[][] data() {
			String[][] dataset= {{"bhanubpr420@gmail.com","1234"},{"bhanhj.com","1234234567"}};
			return dataset;
		}
		
		
}
