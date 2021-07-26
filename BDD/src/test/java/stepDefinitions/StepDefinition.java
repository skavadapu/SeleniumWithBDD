package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class StepDefinition {
	
	@Given("^User is on Netbanking login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
       //code to navigate to bank url
		System.out.println("Navigated to bank url");
    }

	  @When("^User login into login application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_login_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
		    //code to input valid credentials and click submit
	    	System.out.println("Logged in successfully with credentials"+strArg1+" ; "+strArg2);
	    }
    

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated homepage");
    
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println("All cards displayed are " + strArg1);
       
    }

}
