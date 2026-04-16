package Demo;


import org.testng.annotations.Test;

public class Login {
	@Test(priority = 1,groups= {"Windows.Smoke","All","Login"})
	public void loginwithvalidceredentials() {
		System.out.println("loginwithvalidceredentials--Login");
	}
	@Test(priority = 2,groups= {"Windows.Sanity","All","Login"})
	public void loginwithvalidusernameonly(){
		System.out.println("loginwithvalidusernameonly--Login");

	}
	@Test(priority = 3,groups= {"Ios.Sanity","All","Login"})
	public void loginwithpasswordonly(){
		System.out.println("loginwithwithpasswordonly--Login");

	}	@Test(priority = 4,groups= {"Ios.Regression","All","Login"})
	public void loginwithnousername(){
		System.out.println("loginwithnousername--Login");

	}
	@Test(priority = 5,groups= {"Ios.Smoke","All","Login"})
	public void loginwithinvalidceredentials(){
		System.out.println("loginwithinvalidceredentials--Login");

	}
}
