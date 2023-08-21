package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	
	 String homePageUrl = "https://dsportalapp.herokuapp.com/home";
	 String loginUrl= "https://dsportalapp.herokuapp.com/login";
	 
	 @FindBy(xpath = "//div[@id='navbarCollapse']/div/div") WebElement dropdown;
	 @FindBy(xpath = "//div[@class='dropdown-menu']") List<WebElement> dropdownValues;
	 @FindBy(xpath = "//a[text()='Get Started']") List<WebElement> getStartedHomePage;
	 
	 @FindBy(xpath = "//a[text()=' Register ']") WebElement registerLink; 
	 String registerPageUrl= "https://dsportalapp.herokuapp.com/register";
	 @FindBy(xpath = "//a[text()='Sign in']") WebElement signInLink;
	 @FindBy(xpath = "//a[text()='Sign out']") WebElement signOutLink;
	 
	 @FindBy(xpath = "//div[contains(normalize-space(.), 'logged in')]") WebElement notLoggedInErrMsg;
	 
	 
	
	 
	
	 
	 //2. Constructor for Home Page
	 public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);	   
	 }
	        
	        
	      //3.Page Actions
	        
	        public void LoggedOutHomePage() {
				driver.get(homePageUrl);	
			 }
	        
	        
	        public void clickRegisterLink() {
				 registerLink.click();	 
			 }
	        
			 public void clickSigninLink() {
				 signInLink.click();
			 }
			 			  
			 
			 public void clickSignoutLink() {
				 signOutLink.click();	 
			 }
			  
			 			 
			// Verifying pages	
			 
			 public void verifyHomePage() {
				 String currentUrl= driver.getCurrentUrl();
				 String expectedUrl= homePageUrl;	 			
				 assert currentUrl.equals(expectedUrl): "Incorrect page displayed";
			 } 
			 
			 public void verifyLoginPage() {
				 String currentUrl= driver.getCurrentUrl();
				 String expectedUrl= loginUrl;	 			
				 assert currentUrl.equals(expectedUrl): "Incorrect page displayed";
			 } 
			 
			 public void verifyRegisterPage() {
				 String currentUrl= driver.getCurrentUrl();
				 String expectedUrl= registerPageUrl;	 			
				 assert currentUrl.equals(expectedUrl): "Incorrect page displayed";
			 }
			 
			 public void verifySignoutPage() {
				 String currentUrl= driver.getCurrentUrl();
				 String expectedUrl= homePageUrl;	 			
				 assert currentUrl.equals(expectedUrl): "Incorrect page displayed";
			 }
			 
			 
			//Verify Error Messages
			 public void clickDropdownValues(String value) {	
				 dropdown.click();
				 
				 for (WebElement dropdownValue : dropdownValues) {
			            if (dropdownValue.getText().equals(value)) {	
			                dropdownValue.click();
			            }
			            dropdown.click();   
				 }
			 }
			 
			 public void getStartedBtnErrMsg() {	
				 for (int i=0; i<getStartedHomePage.size(); i++) {
						getStartedHomePage.get(i).click();
					 } 
			 }
			 
			 public void NotLoggedInErrMsg() {	
				 String displayedErrMsg= notLoggedInErrMsg.getText();
				 String expectedErrMsg= "You are not logged in";	 			
				 assert displayedErrMsg.equals(expectedErrMsg): "Incorrect page displayed";			  
				 }
			 
			 
			 
			//Linking the pages		 
			 public LoginPage loginPageOpening() {
				 driver.get(homePageUrl);
				 signInLink.click();
				return new LoginPage(driver);
			 }
			 
			 
			 public pages.RegisterPage RegisterPageOpening() {
				 driver.get(homePageUrl);
				 registerLink.click();
				return new RegisterPage(driver);
			
	    }


