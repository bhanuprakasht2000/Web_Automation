package Demo;

import org.testng.annotations.Test;

public class Search {
  @Test(priority=1,groups= {"Smoke","All","Search"})
  public void validsearchproduct() {
	  System.out.println("validsearchproduct--Search");
  }
  @Test(priority=2,groups= {"Smoke","All","Register"})
  public void Invalidsearchproduct() {
	  System.out.println("Invalidsearchproduct--Search");
  }
}
