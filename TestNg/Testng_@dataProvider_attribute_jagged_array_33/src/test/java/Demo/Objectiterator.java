package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectiterator {
	@Test(priority = 1,dataProvider="jagged")
	public void Stringmethod(Object[] a) {
		System.out.print(a+" ");
	
	}
	@DataProvider(name="jagged")
	public Object[][] JaggedArray() {
		Object[][] data= {{"Anand","Raj","Ravi"},
				{"ABhi"},
				{"Rahu","Bhanu","Yogi","Rajesh","Ramu"}
				};
		return data;
	}
	
		
}
