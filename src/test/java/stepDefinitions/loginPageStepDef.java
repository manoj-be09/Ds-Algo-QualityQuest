package stepDefinitions;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelReader;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import driver.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginPageStepDef{
	private WebDriver driver;
	private HomePage homePage= new HomePage(Driverfactory.getDriver());
	private LoginPage loginPage=homePage.loginPageOpening();
	
	ExcelReader excelReader = new ExcelReader();
	String username = "";
    String password = "";
    
    @Given("The user is in the Sign in page")
    public void the_user_is_in_the_sign_in_page() {
    	loginPage.verifyLoginPage();
    }

    @When("The user enters a valid {string} and valid {string}")
    public void the_user_enters_a_valid_and_valid(String string, String string2) throws IOException {
    	 username = ExcelReader.getDataFromExcel("LoginData",1,0);
    	 password = ExcelReader.getDataFromExcel("LoginData",1,1);
    	 loginPage.enterLoginUsername(username);
    	 loginPage.enterLoginPassword(password);
    }

    @When("Clicks login button")
    public void clicks_login_button() {
    	loginPage.clickLoginBtn();
    }

   

    @When("The user enters a invalid {string} and valid {string}")
    public void the_user_enters_a_invalid_and_valid(String string, String string2) throws IOException {
    username = ExcelReader.getDataFromExcel("LoginData",1,2);
   	 password = ExcelReader.getDataFromExcel("LoginData",1,1);
   	 loginPage.enterLoginUsername(username);
   	 loginPage.enterLoginPassword(password);
    }
    
    
    @When("User enters valid {string} in username field")
    public void user_enters_valid_in_username_field(String string) throws IOException {
    	 username = ExcelReader.getDataFromExcel("LoginData",1,0); 	 
    	 loginPage.enterLoginUsername(username);
    	
    }

    @When("User enters valid {string} in password field")
    public void user_enters_valid_in_password_field(String string) throws IOException {
    	password = ExcelReader.getDataFromExcel("LoginData",1,1);
    	 loginPage.enterLoginPassword(password);
    }

    @Then("Error message is displayed: Please check your user id")
    public void error_message_is_displayed_please_check_your_user_id() {
        
    }

    @When("The user enters a valid {string} and invalid {string}")
    public void the_user_enters_a_valid_and_invalid(String string, String string2) throws IOException {
    	username = ExcelReader.getDataFromExcel("LoginData",1,0);
      	 password = ExcelReader.getDataFromExcel("LoginData",1,3);
      	 loginPage.enterLoginUsername(username);
      	 loginPage.enterLoginPassword(password);
    }

    @Then("Error message is displayed: Please check your password")
    public void error_message_is_displayed_please_check_your_password() {
    	loginPage.LoginErrMsgPassword();
    }

    @Then("Username field validation Error message is displayed: Please fill out this field")
    public void username_field_validation_error_message_is_displayed_please_fill_out_this_field() {
    	loginPage.usernameFieldValidationMsg();
    }


    @Then("Password field validation Error message is displayed: Please fill out this field")
    public void password_field_validation_error_message_is_displayed_please_fill_out_this_field() {
    	loginPage.passwordFieldValidationMsg();
    }

   

    @Then("The user is redirected to the Login page from the Home page")
    public void the_user_is_redirected_to_the_login_page_from_the_home_page() {
    	loginPage.verifyLoginPage();
    }

    
    @When("The user clicks on each Get Started button on the page")
    public void the_user_clicks_on_each_get_started_button_on_the_page() {
    	
    }


}
