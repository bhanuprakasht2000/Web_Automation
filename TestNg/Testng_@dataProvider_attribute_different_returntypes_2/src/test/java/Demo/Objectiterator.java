package Demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectiterator {
	@Test(priority = 1,dataProvider="setdim")
	public void Stringmethod(String a) {
		System.out.print(a+" ");
	
	}
	@DataProvider(name="setdim")
	public Iterator<Object> dataobjarr() {
		Set<Object> l= new HashSet<Object>();
		l.add("abcd");
		l.add("1234");
		l.add("@#$^");
		l.add("{}{}{}{}");
		l.add("[][][][][]");
		return l.iterator();
	}
		
}
