package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverFactory;


public class StackPage {
	
	
	private WebDriver driver;	
		    		 
			 //Stack getstartbutton
			 
			 @FindBy(xpath = "//*[@href='stack' and @class='align-self-end btn btn-lg btn-block btn-primary']") WebElement stackgetstartbtn;
			
			// Stack Page Links
			 @FindBy(linkText = "Operations in Stack") WebElement operationsinstacklink;
			 @FindBy(linkText = "Implementation") WebElement implementationlink;
			 @FindBy(linkText = "Applications") WebElement applicationslink;
			 @FindBy(linkText = "Practice Questions") WebElement practicequestionslink;
			 
			// Stack page headings
			 @FindBy(xpath= "//p[text()='Operations in Stack']") WebElement operationsinstackpageheading;
			 @FindBy(xpath= "//p[text()='Implementation']") WebElement implementationpageheading;
			 @FindBy(xpath= "//p[text()='Applications']") WebElement applicationpageheading;
			 @FindBy(xpath = "//p[text()='Practice Questions']") WebElement practicequestionspageheading;
			 			 
			 //for try here
			 @FindBy(xpath = "//a[@href='/tryEditor']") WebElement stacktryherebtn;
			 @FindBy(xpath = "//div[contains(@class,'CodeMirror')]/div/textarea") WebElement stackeditor;
			 @FindBy(xpath = "//button[text()='Run']") WebElement stacktrun;
			 
			//verify stack page
			 
	     	 @FindBy(xpath = "//h5[text()='Stack']") WebElement stackgetstartupheadingtext;
	     	 @FindBy(xpath = "//h4[text()='Stack']") WebElement stack;
			 
			//verify practicequestions
			 String practiceque="https://dsportalapp.herokuapp.com/queue/practice";
	 
			 			  
			//2. Constructor for Login Page
			 public StackPage(WebDriver driver) {
			        this.driver = driver;
			        PageFactory.initElements(driver, this);	        
			    }
			 
			 public void clkstackgetstartbutton() {
				 stackgetstartbtn.click();
			 }
			 public void clkoperationsinstacklink() {
				 
				 operationsinstacklink.click();
			 }
			 public void clkimplementationlink() {
				 implementationlink.click();
			 }
			 public void clkapplicationlink() {
				 applicationslink.click();
			 }
			 public void clkpracticequestions() {
				 practicequestionslink.click();
			 }
			 
			 public void stacktryherebtnclk() {
				 stacktryherebtn.click();
			 }
			 public void stackrunbtnclk() {
				 stacktrun.click();
			 }
			 			 
			  public void stacktexteditor() { 
				  stackeditor.sendKeys("# This program prints Hello, world!\n");
				  stackeditor.sendKeys("\nprint('Hello, world!')");
				 }
			  
			  public void verifystackpage() {
				  
					 String displaypage=stackgetstartupheadingtext.getText();
					 String expquepage=stack.getText();
					 assert displaypage.equals(expquepage):"incorrect page displayed";
			  }
			  
			 public void verifypageoperationsinstack() {
				 
				 String oprainstack=operationsinstackpageheading.getText();
				 String explintext=operationsinstacklink.getText();
				 assert oprainstack.equals(explintext):"incorrect page displayed";
				 		 
			 }
			 
			public void verifypageofimplementation() {
					String implem=implementationpageheading.getText();
					String verimp =implementationlink.getText();
					assert implem.equals(verimp): "Incorrect Page displayed";
					
			
			}
			public void verifypageofapplications() {
				String appdisp=applicationpageheading.getText();
				String verapp=applicationslink.getText();
				assert appdisp.equals(verapp): "Incorrect Page displayed";
						
		
		     }
			public void verifypracticequestions() {		 
				 
	        	 String displayedurl=driver.getCurrentUrl();
	        	 String expectedurl=practiceque;
	        	 assert displayedurl.equals(expectedurl):"incorrect page displayed";
	        }
			
				
				
			 
}



