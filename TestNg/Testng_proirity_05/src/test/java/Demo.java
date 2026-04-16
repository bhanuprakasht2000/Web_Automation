import org.testng.annotations.Test;

public class Demo {
	@Test(priority = 3)
	public void test1()
	{
		System.err.println("This is 1st method TestNG program!");
	}
	@Test(priority = 2)
	public void test2()
	{
		System.err.println("This is 2nd method TestNG program!");
	}
	@Test(priority = 1)
	public void test3()
	{
		System.err.println("This is 3rd method TestNG program!");
	}
	@Test(priority = 0)	
	public void test4()
	{
		System.err.println("This is 4th method TestNG program!");
	}
	@Test(priority =-1)	
	public void test5()
	{
		System.err.println("This is 5th method TestNG program!");
	}
	@Test(priority = -2)
	public void test6()
	{
		System.err.println("This is 6th method TestNG program!");
	}
	
}
