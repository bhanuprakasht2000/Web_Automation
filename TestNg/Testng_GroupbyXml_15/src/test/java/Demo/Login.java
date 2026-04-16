package Demo;


import org.testng.annotations.Test;

public class Login {
	@Test(priority = 1)
	public void loginwithvalidceredentials() {
		System.out.println("loginwithvalidceredentials--Login");
	}
	@Test(priority = 2)
	public void loginwithvalidusernameonly(){
		System.out.println("loginwithvalidusernameonly--Login");

	}
	@Test(priority = 3)
	public void loginwithpasswordonly(){
		System.out.println("loginwithwithpasswordonly--Login");

	}	@Test(priority = 4)
	public void loginwithnousername(){
		System.out.println("loginwithnousername--Login");

	}
	@Test(priority = 5)
	public void loginwithinvalidceredentials(){
		System.out.println("loginwithinvalidceredentials--Login");

	}
}
