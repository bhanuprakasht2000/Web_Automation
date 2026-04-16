package Demo;


import org.testng.annotations.Test;

public class Login {
	@Test(priority = 1,groups= {"Smoke","All","Login"})
	public void loginwithvalidceredentials() {
		System.out.println("loginwithvalidceredentials--Login");
	}
	@Test(priority = 2,groups= {"Sanity","All","Login"})
	public void loginwithvalidusernameonly(){
		System.out.println("loginwithvalidusernameonly--Login");

	}
	@Test(priority = 3,groups= {"Sanity","All","Login"})
	public void loginwithpasswordonly(){
		System.out.println("loginwithwithpasswordonly--Login");

	}	@Test(priority = 4,groups= {"Regression","All","Login"})
	public void loginwithnousername(){
		System.out.println("loginwithnousername--Login");

	}
	@Test(priority = 5,groups= {"Smoke","All","Login"})
	public void loginwithinvalidceredentials(){
		System.out.println("loginwithinvalidceredentials--Login");

	}
}
