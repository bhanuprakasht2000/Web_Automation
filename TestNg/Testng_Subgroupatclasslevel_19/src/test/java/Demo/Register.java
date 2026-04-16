package Demo;

import org.testng.annotations.Test;
@Test(groups="All")
public class Register {
  @Test(priority=1,groups= {"Smoke","Register"})
  public void Mandatoryfields() {
	  System.out.println("Mandatoryfields--Register");
  }
  @Test(priority=2,groups= {"Smoke","Register"})
  public void Allfields() {
	  System.out.println("Allfields--Register");
  }
  @Test(priority=3,groups= {"Sanity","Register"})
  public void Registerwithputchckbox() {
	  System.out.println("Registerwithputchckbox--Register");
  }
  @Test(priority=4,groups= {"Regression","Register"})
  public void registerwithnodata() {
	  System.out.println("registerwitoutchceckbox--Register");
  }
 
}
