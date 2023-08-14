package stepDefinitions;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;

import driver.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginPageStepDef {
	private WebDriver driver;
	private LoginPage loginPage= new LoginPage(Driverfactory.getDriver());
    
	
	@Given("The user is in the Sign in page")
	public void the_user_is_in_the_sign_in_page() {
		loginPage.openLoginpage();
	}

	@When("The user enters a valid {string}")
	public void the_user_enters_a_valid(String string) {
		loginPage.enterLoginUsername();

	}

	@When("Clicks login button")
	public void clicks_login_button() {
		loginPage.clickLoginBtn();
	}

	@Then("User homepage is displayed")
	public void user_homepage_is_displayed() {
		loginPage.verifyHomePage();
	}

	@When("The user clicks on the register link on the signin page")
	public void the_user_clicks_on_the_register_link_on_the_signin_page() {
		loginPage.clickRegisterLink();
	}

	@Then("The user is redirected to the Registration page from the signin page")
	public void the_user_is_redirected_to_the_registration_page_from_the_signin_page() {
		loginPage.verifyRegisterPage();
	}

	@Given("The user is in the signin page")
	public void the_user_is_in_the_signin_page() {
		loginPage.openLoginpage();
	}

	@When("The user enters a valid'password'")
	public void the_user_enters_a_valid_password() {
		loginPage.enterLoginPassword();
	}


	@Then("Error message is displayed System should alert user Please check your user id")
	public void error_message_is_displayed_system_should_alert_user_please_check_your_user_id() {
	    
	}

	@Given("The user is on the Home page with valid log in")
	public void the_user_is_on_the_home_page_with_valid_log_in() {
		loginPage.openLoginpage();
		loginPage.clickSigninLink();
		loginPage.enterLoginUsername();
		loginPage.enterLoginPassword();
		loginPage.clickLoginBtn();
	}

	@When("The user clicks on Sign out")
	public void the_user_clicks_on_sign_out() {
		loginPage.clickSignoutLink();
	}

	@Then("The user is redirected to the login page from the homepage")
	public void the_user_is_redirected_to_the_login_page_from_the_homepage() {
		loginPage.verifySignoutPage();
	}
	@When("The user enters a invalid {string}")
	public void the_user_enters_a_invalid(String string) {
		
	}
	
	@When("The user clicks on the sigin link on the signin page")
	public void the_user_clicks_on_the_sigin_link_on_the_signin_page() {
		loginPage.openLoginpage();
		loginPage.clickSigninLink();
	}

	@Then("The user is redirected to the Login page from the signin page")
	public void the_user_is_redirected_to_the_login_page_from_the_signin_page() {
		loginPage.verifyLoginPage();
	}

	@When("Clicks sigin link")
	public void clicks_sigin_link() {
		loginPage.clickSigninLink();
	}

}
