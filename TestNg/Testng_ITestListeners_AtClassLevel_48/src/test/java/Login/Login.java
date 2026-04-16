package Login;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(SampleListener.class)
public class Login {
  @Test(priority=1)
  public void Loginwithvalidcredentials() {
	  System.out.println("Loginwithvalidcredentials:Login");
  }
  @Test(priority=2)
  public void Loginwithinvalidcredentials() {
	  System.out.println("Loginwithinvalidcredentials:Login");
	  Assert.assertTrue(false);
  }
  @Test(priority=3,dependsOnMethods = "Loginwithinvalidcredentials")
  public void Loginwithnocredentials() {
	  System.out.println("Loginwithnocredentials:Login");
  }
  @Test(priority=4,timeOut=10)
  public void Loginwithvalidunameandnopassword() {
	  System.out.println("Loginwithvalidunameandnopassword==>Login");
  }
  @Test(priority=5)
  public void Loginwithnousernameandvalidpassword() {
	  System.out.println("Loginwithnousernameandvalidpassword:Login");
  }
}
