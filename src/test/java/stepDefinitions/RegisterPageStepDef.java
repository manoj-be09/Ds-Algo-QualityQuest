package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driver.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ExcelReader;

public class RegisterPageStepDef {
	
	private WebDriver driver;
	private HomePage homePage= new HomePage(Driverfactory.getDriver());
	private RegisterPage registerPage=homePage.RegisterPageOpening();
	
	
	ExcelReader excelReader = new ExcelReader();
	String userName = "";
    String passWord = "";
    String passwordConfirmation="";
	
    @Given("The user is in Register Page")
    public void the_user_is_in_register_page() {
    	registerPage.verifyRegisterPage();
    }

    @When("The user enters valid {string} in username field")
    public void the_user_enters_valid_in_username_field(String userName) throws IOException {
    	userName = ExcelReader.getDataFromExcel("RegisterData",1,0);
    	registerPage.enterUsername(userName);
    }

    @When("The user clicks Register button")
    public void the_user_clicks_register_button() {
    	registerPage.clickRegisterBtn();
    }

    @Then("It should display an error below Password textbox:Please fill out this field")
    public void it_should_display_an_error_below_password_textbox_please_fill_out_this_field() {
    	registerPage.passwordFieldvalidationErrors();
    }

    @When("The user enters valid {string} in password field")
    public void the_user_enters_valid_in_password_field(String passWord) throws IOException {
    	passWord = ExcelReader.getDataFromExcel("RegisterData",1,1);
    	registerPage.enterPassword(passWord);
    	
    }

    @Then("It should display an error below Username textbox:Please fill out this field")
    public void it_should_display_an_error_below_username_textbox_please_fill_out_this_field() {
    	registerPage.usernameFieldvalidationErrors();
    }

    @Then("It should display an error below Password Confirmation textbox:Please fill out this field")
    public void it_should_display_an_error_below_password_confirmation_textbox_please_fill_out_this_field() {
    	registerPage.passwordCnfrmFieldvalidationErrors();
    }

    @When("The user enters invalid {string} in username field")
    public void the_user_enters_invalid_in_username_field(String userName) throws IOException {
    	userName = ExcelReader.getDataFromExcel("RegisterData",1,3);
    	registerPage.enterUsername(userName);
    }

    @When("The user enters valid {string} in password field and {string} in password confirmation field")
    public void the_user_enters_valid_in_password_field_and_in_password_confirmation_field(String string, String string2) throws IOException {
    	passWord = ExcelReader.getDataFromExcel("RegisterData",1,1);
    	registerPage.enterPassword(passWord);
    	passwordConfirmation= ExcelReader.getDataFromExcel("RegisterData",1,1);
    	registerPage.enterPasswordConfirmation(passwordConfirmation);
    }

    @Then("It should display an error:Please enter a valid username")
    public void it_should_display_an_error_please_enter_a_valid_username() {
    	registerPage.invalidUsernameerror();
    }

    @When("The user enters existing {string} in username field")
    public void the_user_enters_existing_in_username_field(String userName) throws IOException {
    	userName = ExcelReader.getDataFromExcel("RegisterData",1,6);
    	registerPage.enterUsername(userName);
    }

    @Then("It should display an error: Username already exists")
    public void it_should_display_an_error_username_already_exists() {
    	registerPage.usernameExistsError();
    }

    @When("The user enters different {string} in password field and {string} password confirmation field")
    public void the_user_enters_different_in_password_field_and_password_confirmation_field(String string, String string2) throws IOException {
    	passWord = ExcelReader.getDataFromExcel("RegisterData",1,1);
    	registerPage.enterPassword(passWord);
    	passwordConfirmation= ExcelReader.getDataFromExcel("RegisterData",1,2);
    	registerPage.enterPasswordConfirmation(passwordConfirmation);
    }

    @Then("It should display an error: password_mismatch:The two password fields didn�t match")
    public void it_should_display_an_error_password_mismatch_the_two_password_fields_didn_t_match() {
    	registerPage.passwordMismatchError();
    }

    @When("The user enters less than {int} characters in {string} in password field and {string} in password confirmation field")
    public void the_user_enters_less_than_characters_in_in_password_field_and_in_password_confirmation_field(Integer int1, String string, String string2) throws IOException {
    	passWord = ExcelReader.getDataFromExcel("RegisterData",2,3);
    	registerPage.enterPassword(passWord);
    	passwordConfirmation= ExcelReader.getDataFromExcel("RegisterData",2,3);
    	registerPage.enterPasswordConfirmation(passwordConfirmation);
    }

    @Then("It should display an error: Password should contain at least {int} characters")
    public void it_should_display_an_error_password_should_contain_at_least_characters(Integer int1) {
    	registerPage.passwordCharactersError();
    }

    @When("The user enters all numbers in {string} in password field and {string} in password confirmation field")
    public void the_user_enters_all_numbers_in_in_password_field_and_in_password_confirmation_field(String string, String string2) throws IOException {
    	passWord = ExcelReader.getDataFromExcel("RegisterData",3,3);
    	registerPage.enterPassword(passWord);
    	passwordConfirmation= ExcelReader.getDataFromExcel("RegisterData",3,3);
    	registerPage.enterPasswordConfirmation(passwordConfirmation);
    }

    @Then("It should display an error:Password can�t be entirely numeric.")
    public void it_should_display_an_error_password_can_t_be_entirely_numeric() {
    	registerPage.passwordNumericError();
    }

    @Then("The user should be redirected to Homepage with the message: New Account Created. You are logged in as {string}")
    public void the_user_should_be_redirected_to_homepage_with_the_message_new_account_created_you_are_logged_in_as(String string) {
    	
    	
    }

}
