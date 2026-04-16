package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectiterator {
	@Test(priority = 1,dataProvider="in")
	public void Stringmethod(String  a) {
		System.out.print(a+" ");
	
	}
	@DataProvider(name="in",indices = {0,2})
	public Object[] JaggedArray() {
		Object[] data= {"Anand","Raj","Ravi","Rahu","Bhanu","Yogi","Rajesh","Ramu"};
		return data;
	}
	
		
}
