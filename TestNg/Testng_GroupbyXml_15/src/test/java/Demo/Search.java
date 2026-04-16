package Demo;

import org.testng.annotations.Test;

public class Search {
  @Test(priority=1)
  public void validsearchproduct() {
	  System.out.println("validsearchproduct--Search");
  }
  @Test(priority=2)
  public void Invalidsearchproduct() {
	  System.out.println("Invalidsearchproduct--Search");
  }
}
