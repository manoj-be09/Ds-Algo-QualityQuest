package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	private WebDriver driver;
	
	//1.Locators- Register page
	 String registerUrl= "https://dsportalapp.herokuapp.com/register";
	 @FindBy(id = "id_username") WebElement username;
	 @FindBy(id = "id_password1") WebElement password;
	 @FindBy(id = "id_password2") WebElement passwordConfirm;
	 @FindBy(xpath = "//input[@value='Register']") WebElement registerButton;
	 @FindBy(xpath = "//body/div[3]") WebElement msgPlaceholder;
	 @FindBy(xpath = "//body/div[2]") WebElement successfulRegMsg;
	 
	 
	//2. Constructor for Login Page
	 public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);	        
	    }
	 
	 
	//3.Page Actions
	 public void enterUsername(String userName) {
		 username.sendKeys(userName);
	 }
	 
	 public void enterPassword(String passWord) {
		 password.sendKeys(passWord);
	 }
	 
	 public void enterPasswordConfirmation(String passwordConfirmation) {
		 passwordConfirm.sendKeys(passwordConfirmation);
	 }
	 
	 public void clickRegisterBtn() {
		 registerButton.click();
	 }
	 
	 public void verifyRegisterPage() {
		 String currentUrl= driver.getCurrentUrl();
		 String expectedUrl= registerUrl;	 			
		 assert currentUrl.equals(expectedUrl): "Incorrect page displayed";
	 }
	 
	 
	// Method to validate the errors displayed below the fields in Register Page		 
			 public void usernameFieldvalidationErrors() {
					String expectedError="Please fill out this field.";
					String displayederror= username.getAttribute("validationMessage");
					assert displayederror.equals(expectedError) : "Error message is not as expected.";
					
				}
			 
			 
			 public void passwordFieldvalidationErrors() {
					String expectedError="Please fill out this field.";
					String displayederror= password.getAttribute("validationMessage");
					assert displayederror.equals(expectedError) : "Error message is not as expected.";
					
				}
			 
			 public void passwordCnfrmFieldvalidationErrors() {
					String expectedError="Please fill out this field.";
					String displayederror= passwordConfirm.getAttribute("validationMessage");
					assert displayederror.equals(expectedError) : "Error message is not as expected.";
					
				}
			 
	//Method of invalid username		 
			 public void invalidUsernameerror() {
				 	String expectedError="Please enter a valid username";
					String displayederror= msgPlaceholder.getText();
					assert displayederror.equals(expectedError) : "Error message is not as expected.";
					 
			 }
			 
			 
	//Method for username already exists		 
			 public void usernameExistsError() {
				 			String expectedError="Username already exists.";
							String displayederror= msgPlaceholder.getText();
							assert displayederror.equals(expectedError) : "Error message is not as expected.";
			 }
			 
			 
	// Method for password mismatch	
			 public void passwordMismatchError() {
				 			String expectedError="password_mismatch:The two password fields didn’t match.";
							String displayederror=  msgPlaceholder.getText();
							assert displayederror.equals(expectedError) : "Error message is not as expected.";
			 } 
			 
			 
	//Method for atleast 8 letters error in password field
			 public void passwordCharactersError() {
				 			String expectedError="Password should contain at least 8 characters";
							String displayederror=  msgPlaceholder.getText();
							assert displayederror.equals(expectedError) : "Error message is not as expected.";
			 } 
			 
			 
	//Method for entirely numeric password error	 
			 public void passwordNumericError() {
				 			String expectedError="Password can’t be entirely numeric.";
							String displayederror=  msgPlaceholder.getText();
							 assert displayederror.equals(expectedError) : "Error message is not as expected.";
			 }
			  
			 
	//Method for verifying successful registration message	 
			 public void sucessfulRegistrationMsg() {
				 			String expectedMsg="New Account Created. You are logged in as ";
							String displayedMsg=  successfulRegMsg.getText();
							assert displayedMsg.equals(expectedMsg) : "Error message is not as expected.";
			 }
			  	 
}
