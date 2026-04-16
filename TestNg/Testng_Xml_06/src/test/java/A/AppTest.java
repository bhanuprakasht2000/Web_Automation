package A;

import org.testng.annotations.Test;

public class AppTest {
	@Test(priority = 3)
	public void apptest1()
	{
		System.out.println("This is 1st app method TestNG program!");
	}
	@Test(priority = 2)
	public void apptest2()
	{
		System.out.println("This is 2nd app  method TestNG program!");
	}
	@Test(priority = 1)
	public void apptest3()
	{
		System.out.println("This is 3rd app  method TestNG program!");
	}
	@Test(priority = 0)	
	public void apptest4()
	{
		System.out.println("This is 4th app method TestNG program!");
	}
	@Test(priority =-1)	
	public void apptest5()
	{
		System.out.println("This is 5th app  method TestNG program!");
	}
	@Test(priority = -2)
	public void apptest6()
	{
		System.out.println("This is 6th app method TestNG program!");
	}
}
