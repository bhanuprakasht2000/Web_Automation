package Demo;

import java.util.*;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class List_iterator {
	@Test(priority = 1,dataProvider="listdim")
	public void Stringmethod(Object a,Object b) {
		System.out.print(a+" ");
	
	}
	@DataProvider(name="listdim")
	public Iterator<Object[]> dataobjarr() {
		List<Object[]> l= new ArrayList<>();
		l.add(new Object[]{"ABCD","1234"});
		l.add(new Object[]{"XYZ","4321"});		
		l.add(new Object[]{"WERTT","56789"});
	
		return l.iterator();
	}
}
