package Testserialization;

import org.testng.annotations.Test;

public class Search {
	@Test(priority=1)
	public void Validsearch() {
		System.out.println("Search=>Validsearch=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=2)
	public void InValidsearch() {
		System.out.println("Search=>InValidsearch=>"+Thread.currentThread().getId());
		
	}
	@Test(priority=3)
	public void Noinputsearch() {
		System.out.println("Search=>Noinputsearch=>"+Thread.currentThread().getId());
		
	}

}
