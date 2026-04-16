package Testserialization;

import org.testng.annotations.Test;

public class Register {
	@Test(priority=1)
	public void registerwithallfields() {
		System.out.println("Register=>registerwithallfields=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=2)
	public void registerwithcheckboxfields() {
		System.out.println("Register=>registerwithcheckboxfields=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=3)
	public void registerwithnocheckboxfields() {
		System.out.println("Register=>registerwithnocheckboxfields=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=4)
	public void registerwithmandatoryfields() {
		System.out.println("Register=>registerwithmandatoryfields=>"+Thread.currentThread().getId());
		
	}
	

}
