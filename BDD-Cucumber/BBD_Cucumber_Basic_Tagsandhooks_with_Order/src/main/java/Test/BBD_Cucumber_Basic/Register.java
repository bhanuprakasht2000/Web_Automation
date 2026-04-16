package Test.BBD_Cucumber_Basic;

import io.cucumber.java.en.*;

public class Register {
	@Given("User Should navigate the facebook Url")
	public void User_Should_navigate_the_facebook_Url() {
		System.err.println("Facebook log in feature");
		System.out.println("User got navigated to the facebook page");
	}
	@When("User Should provide the firstname {string} and surname {string}")
	public void User_Should_provide_the_firstname_and_surname(String firstname, String password) {
		System.out.println("User has entered the firname "+firstname+" and Password as "+ password);

	}
	@And("User should provide the date of bith {string}in the DOB column")
	public void User_should_provide_the_date_of_bith_in_the_DOB_column(String dob) {
		System.out.println("User has entered the date of birth as" +dob);


	}
	@And("User should select select the any one of the gender\"Male\" in the gender column")
	public void user_should_select_select_the_any_one_of_the_gender_male_in_the_gender_column() {
		System.out.println("User has Selected the gender");

	}
	

	@And("User should fill the phone no. or email id\"{int}\" along with the password \"bhanu@{int}\"")
	public void user_should_fill_the_phone_no_or_email_id_along_with_the_password_bhanu(Integer int1, Integer int2) {
		System.out.println("User entered the Mobile number "+ int1 +" and password as "+int2 );
	}

	@And("User should click on the Signup button")
	public void user_should_click_on_the_signup_button() {
		System.out.println("User should click on the Signup button");
	}
	@When("User should  not filled the phone no. or email id  and  the password")
	public void user_should_not_filled_the_phone_no_or_email_id_and_the_password() {
	    System.out.println("User not provided the Email id and password");
	}
	@Then("User will not get account created the new account and log in into the Facebook")
	public void user_will_not_get_account_created_the_new_account_and_log_in_into_the_facebook() {
	    System.out.println("User log in failed");
	}
	@Then("User should succefully created the new account and log in into the Facebook")
	public void user_should_succefully_created_the_new_account_and_log_in_into_the_facebook() {
		System.out.println("User should succefully create the new account and log in into the Facebook");

	}




}
