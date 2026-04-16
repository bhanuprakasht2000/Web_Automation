package A;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority = 3)
	public void demotest1()
	{
		System.err.println("This is 1st demo method TestNG program!");
	}
	@Test(priority = 2)
	public void demotest2()
	{
		System.err.println("This is 2nd demo  method TestNG program!");
	}
	@Test(priority = 1)
	public void demotest3()
	{
		System.err.println("This is 3rd demo  method TestNG program!");
	}
	@Test(priority = 0)	
	public void demotest4()
	{
		System.err.println("This is 4th demo method TestNG program!");
	}
	@Test(priority =-1)	
	public void demotest5()
	{
		System.err.println("This is 5th demo  method TestNG program!");
	}
	@Test(priority = -2)
	public void demotest6()
	{
		System.err.println("This is 6th demo method TestNG program!");
	}
	
}
