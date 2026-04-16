package Testserialization;

import org.testng.annotations.Test;

public class login {
	@Test(priority=1)
	public void loginwithvalidcredentials() {
		System.out.println("Login=>loginwithvalidcredentials=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=2)
	public void loginwithInvalidcredentials() {
		System.out.println("Login=>loginwithvalidcredentials=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=3)
	public void loginwithvalidusernameandInvalidpassword() {
		System.out.println("Login=>loginwithvalidcredentials=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=4)
	public void loginwithInvalidUsernameandinvalidpassword() {
		System.out.println("Login=>loginwithvalidcredentials=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=5)
	public void loginwithnocredentials() {
		System.out.println("Login=>loginwithvalidcredentials=>"+Thread.currentThread().getId());
		
	}

}
