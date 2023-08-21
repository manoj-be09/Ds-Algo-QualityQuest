package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driver.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;


public class HomePageStepDef {
	private WebDriver driver;
	private HomePage homePage= new HomePage(Driverfactory.getDriver());
	 
	 @Then("User homepage is displayed")
	    public void user_homepage_is_displayed() {
	    	homePage.verifyHomePage();
	    }
	 
	 
	 @When("The user clicks on the register link on the signin page")
	    public void the_user_clicks_on_the_register_link_on_the_signin_page() {
	    	homePage.clickRegisterLink();
	    }

	    @Then("The user is redirected to the Registration page from the signin page")
	    public void the_user_is_redirected_to_the_registration_page_from_the_signin_page() {
	    	homePage.verifyHomePage();
	    }

	    @Given("The user is in the Home page")
	    public void the_user_is_in_the_home_page() {
	    	homePage.verifyHomePage();
	    }

	    @When("The user clicks sigin link")
	    public void the_user_clicks_sigin_link() {
	    	homePage.clickSigninLink();
	    }
	    
	    
	    @When("The user clicks on Sign out")
	    public void the_user_clicks_on_sign_out() {
	    	homePage.clickSignoutLink();
	    }

	    @Given("The user is on the Home page")
	    public void the_user_is_on_the_home_page() {
	    	homePage.LoggedOutHomePage();
	    }

	    @When("The user clicks dropdown {string} in dropdown")
	    public void the_user_clicks_dropdown_in_dropdown(String value) {
	    	homePage.clickDropdownValues(value);
	    }

	    @Then("Error message is displayed: You are not logged in")
	    public void error_message_is_displayed_you_are_not_logged_in() {
	    	homePage.NotLoggedInErrMsg();
	    }

}
