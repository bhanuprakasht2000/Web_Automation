package Demo;

import org.testng.annotations.DataProvider;

public class Datap {
	@DataProvider(name="cred")
	public String[][] data() {
		String[][] dataset= {{"bhanubpr420@gmail.com","1234"},{"bhanhj.com","1234234567"},{"bhawert","987654"}};
		return dataset;
	}
}
