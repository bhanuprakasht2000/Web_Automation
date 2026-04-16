package Login;

import org.testng.annotations.Test;

public class Lopginfunction {

	
	@Test(priority = 1,groups= {"Smoke"})
	public void loginwithvalidceredentials() {
		System.out.println("loginwithvalidceredentials-Smoke");
		
	}
	@Test(priority = 1,groups= {"Smoke"})
	public void loginwithinvalidceredentials() {
		System.out.println("loginwithinvalidceredentials-Smoke");
		
	}
	@Test(priority = 2,groups= {"Sanity"})
	public void loginwithinvalidusernameandvalidpassword() {
		System.out.println("loginwithinvalidusernameandvalidpassword-Sanity");
		
	}
	@Test(priority = 2,groups= {"Sanity"},dependsOnGroups = {"Smoke"})
	public void loginwithvalidusernameandinvalidpassword() {
		System.out.println("loginwithvalidusernameandinvalidpassword-Sanity");
		
	}
	
	@Test(priority = 3,groups= {"Regression"}, dependsOnGroups = "Sanity")
	public void loginwithoutcredentials() {
		System.out.println("loginwithoutcredentials-Regression");
		
	}
	@Test(priority = 3,groups= {"Login"},dependsOnGroups = "Regression")
	public void loginwithmouseactions() {
		System.out.println("loginwithmouseactions-Login");
		
	}
	
	
}
