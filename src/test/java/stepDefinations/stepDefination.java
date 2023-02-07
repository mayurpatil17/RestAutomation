package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("User is on NetBanking landing page")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Login page displayed");	
	   }

	@When("User login into application with username and password")
	public void user_login_into_application_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login successfully");	
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Home page");
	}

	

}