package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingledimObjArray {
			@Test(priority = 1,dataProvider="1dim")
			public void Stringmethod(String a) {
				System.out.print(a+" ");
			
			}
			@DataProvider(name="1dim")
			public String[] dataobjarr() {
				String[] dataset= {"A","B","C"};
				return dataset;
			}
			
			
	}


