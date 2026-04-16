package Testserialization;

import org.testng.annotations.Test;

public class Search2 {
	@Test(priority=1)
	public void Validsearch2() {
		System.out.println("Search2=>Validsearch2=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=2)
	public void InValidsearch2() {
		System.out.println("Search2=>InValidsearch2=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=3)
	public void Noinputsearch2() {
		System.out.println("Search2=>Noinputsearch2=>"+Thread.currentThread().getId());
		
	}

}
