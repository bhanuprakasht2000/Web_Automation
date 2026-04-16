package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Login {
  @Test
  public void loginwithvalidcredentials() {
	  System.out.println("loginwithvalidcredentials-Login");
  }
  @Test
  public void loginwithinvalidcredentials() {
	  System.out.println("loginwithinvalidcredentials-Login");
  }
  @Test
  public void loginwithnousernanme() {
	  System.out.println("loginwithnousernanme-Login");
  }
  @Test
  public void loginwithnopassword() {
	  System.out.println("loginwithnopassword-Login");
  }
  @Ignore
  @Test
  public void loginwithnocredentials() {
	  System.out.println("loginwithnocredentials-Login");
  }
}
