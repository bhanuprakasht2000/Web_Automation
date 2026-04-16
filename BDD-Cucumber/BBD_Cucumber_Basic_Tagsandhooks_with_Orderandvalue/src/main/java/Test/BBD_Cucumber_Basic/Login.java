package Test.BBD_Cucumber_Basic;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Login  {

	@Before("@Login")
	public void setup() {
		System.err.println("Scenario  started");
	}
	@After("@Login")
	public void teardown() {
		System.err.println("Scenario  Ended");
	}
	@BeforeStep(order=0,value="@Register")
	public void start_of_step() {
		
		System.err.print("1>Step Started=>\n");
	}
	@BeforeStep(order=1,value="@Register")
	public void start_of_2step() {
		
		System.err.print("2>Step Started=>\n");
	}
	@AfterStep(order=1,value="@Register")
	public void end_of_step() {
		System.err.println("1>==Step ended==");
	}
	@AfterStep(order=0,value="@Register")
	public void end_of_2step() {
		System.err.println("2>==Step ended==");
	}
	
	@Given("Provide the application Url for logging into the account")
	public void provide_the_application_url_for_logging_into_the_account() {
	

		System.out.println("Background gherkin word is used for the taking the commanly used Given or When or Then");
		System.err.println("The Log in scenario");
		System.out.println("The User have the Url into the application");

	}

	@When("User enter the the Valid Username  in the Username box as Bhanu")
	public void user_enter_the_the_valid_username_in_the_username_box_as_bhanu() {
		System.out.println("Valid username given");
	}

	@When("User enters the valid password  in the password box as {int}")
	public void user_enters_the_valid_password_in_the_password_box_as(Integer int1) {
		System.out.println("Valid password given " +int1);

	}

	@When("User enter the the Valid Username  in the Username box as Anu")
	public void user_enter_the_the_valid_username_in_the_username_box_as_anu() {
		System.out.println("Valid username given");
	}

	@When("User enter the the Valid Username  in the Username box as Kani")
	public void user_enter_the_the_valid_username_in_the_username_box_as_kani() {
		System.out.println("Valid username given");

	}


	@And("User clicks on the enter button")
	public void user_clicks_on_the_enter_button() {
		System.out.println("The User clicks on the enter button the application");
	}

	@Then("User should log into the user account")
	public void user_should_log_into_the_user_account() {
		System.out.println("The User logged into the application");
		

	}
	
	//2nd scenario


	@When("User enter the the InValid Username \"Abc\"in the Username box")
	public void user_enter_the_the_in_valid_username_abc_in_the_username_box() {
		System.out.println("The User entered the invalid username into the application");

	}

	@And("User enters the invalid password {string} in the password box")
	public void user_enters_the_invalid_password_in_the_password_box(String Invalidpassword) {
		System.out.println("The User entered the invalid password into the application");


	}

	@And("User  dont enters the password  in the password box")
	public void user_dont_enters_the_password_in_the_password_box() {
		System.out.println("User not entered the password in the password column box");
	}

	@Then("User should not able to log into the user account")
	public void user_should_not_able_to_log_into_the_user_account() {
		System.out.println("The User not logged into the application");
	}




}
