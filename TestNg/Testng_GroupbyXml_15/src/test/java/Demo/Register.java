package Demo;

import org.testng.annotations.Test;

public class Register {
  @Test(priority=1)
  public void Mandatoryfields() {
	  System.out.println("Mandatoryfields--Register");
  }
  @Test(priority=2)
  public void Allfields() {
	  System.out.println("Allfields--Register");
  }
  @Test(priority=3)
  public void Registerwithputchckbox() {
	  System.out.println("Registerwithputchckbox--Register");
  }
  @Test(priority=4)
  public void registerwithnodata() {
	  System.out.println("registerwitoutchceckbox--Register");
  }
 
}
