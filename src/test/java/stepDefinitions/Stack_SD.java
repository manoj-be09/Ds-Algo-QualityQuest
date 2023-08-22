package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.StackPage;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import driver.DriverFactory;
import io.cucumber.java.en.Given;

public class Stack_SD {
	
	private WebDriver driver;
	//private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
	private StackPage stackpage= new StackPage(DriverFactory.getDriver());
	
	@Given("^User is in the Stack page after logged in$")
	public void user_is_in_the_Stack_page_after_logged_in() throws Throwable {
		stackpage.clkstackgetstartbutton();
	    throw new PendingException();
	}

	@When("^User clicks on the Operations in Stack link$")
	public void user_clicks_on_the_Operations_in_Stack_link() throws Throwable {
		stackpage.clkoperationsinstacklink();
	    throw new PendingException();
	}

	@Then("^User should then be directed to Operations in Stack Page$")
	public void user_should_then_be_directed_to_Operations_in_Stack_Page() throws Throwable {
		stackpage.verifypageoperationsinstack();
	    throw new PendingException();
	}

	@Given("^User is on the Operations in Stack page$")
	public void user_is_on_the_Operations_in_Stack_page() throws Throwable {
		stackpage.verifypageoperationsinstack();
	    throw new PendingException();
	}

	@When("^User clicks Try Here button in stack page$")
	public void user_clicks_Try_Here_button_in_stack_page() throws Throwable {
		stackpage.stacktryherebtnclk();
	    throw new PendingException();
	}

	@Then("^User should be redirected to a page having an tryEditor with a Run button to test$")
	public void user_should_be_redirected_to_a_page_having_an_tryEditor_with_a_Run_button_to_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User is in the Stack page after having an tryEditor with a Run button to test$")
	public void user_is_in_the_Stack_page_after_having_an_tryEditor_with_a_Run_button_to_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User gets input from 'sheetName','rowName'and 'columnName'$")
	public void user_gets_input_from_sheetName_rowName_and_columnName() throws Throwable {
	       //String code= ExcelReader.getDataFromExcel("Pages",1,0);
		   //StackPage.codeEditor(code);
	    throw new PendingException();
	}

	@When("^User clicks on Run button$")
	public void user_clicks_on_Run_button() throws Throwable {
		stackpage.stackrunbtnclk();
	    throw new PendingException();
	}

	@Then("^User should be presented with Run output$")
	public void user_should_be_presented_with_Run_output() throws Throwable {
		stackpage.stackrunbtnclk();
	    throw new PendingException();
	}

	@Given("^User is in stack page having an tryEditor with a Run button to test$")
	public void user_is_in_stack_page_having_an_tryEditor_with_a_Run_button_to_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User gets invalid input from 'sheetName','rowName'and 'columnName'$")
	public void user_gets_invalid_input_from_sheetName_rowName_and_columnName() throws Throwable {
		   //String code= ExcelReader.getDataFromExcel("Pages",1,0);
		   //StackPage.codeEditor(code);
		   throw new PendingException();
	}

	@When("^User clicks on Run button after Entering invalid python code in stack tryEditor$")
	public void user_clicks_on_Run_button_after_Entering_invalid_python_code_in_stack_tryEditor() throws Throwable {
		stackpage.stackrunbtnclk();
	    throw new PendingException();
	}

	@Then("^User should get the error message$")
	public void user_should_get_the_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User is on the Stack page$")
	public void user_is_on_the_Stack_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on the Implementation button$")
	public void user_clicks_on_the_Implementation_button() throws Throwable {
		stackpage.clkimplementationlink();
	    throw new PendingException();
	}

	@Then("^User should then be directed to Implementation Page$")
	public void user_should_then_be_directed_to_Implementation_Page() throws Throwable {
		stackpage.verifypageofimplementation();
	    throw new PendingException();
	}

	@Given("^User is on the Implementation page$")
	public void user_is_on_the_Implementation_page() throws Throwable {
		stackpage.verifypageofimplementation();
	    throw new PendingException();
	}

	@When("^User clicks Try Here button in stack Implementation page$")
	public void user_clicks_Try_Here_button_in_stack_Implementation_page() throws Throwable {
		stackpage.stacktryherebtnclk();
	    throw new PendingException();
	}

	@When("^User clicks on Run button after Entering valid python code in stack tryEditor$")
	public void user_clicks_on_Run_button_after_Entering_valid_python_code_in_stack_tryEditor() throws Throwable {
		stackpage.stackrunbtnclk();
	    throw new PendingException();
	}

	@Given("^User is on the stackpage$")
	public void user_is_on_the_stackpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on the Applications button$")
	public void user_clicks_on_the_Applications_button() throws Throwable {
		stackpage.clkapplicationlink();
	    throw new PendingException();
	}

	@Then("^User should be directed to Applications Page$")
	public void user_should_be_directed_to_Applications_Page() throws Throwable {
		stackpage.verifypageofapplications();
	    throw new PendingException();
	}

	@Given("^User is on the Applications page$")
	public void user_is_on_the_Applications_page() throws Throwable {
		stackpage.verifypageofapplications();
	    throw new PendingException();
	}

	@When("^User clicks Try Here button in stack Applications page$")
	public void user_clicks_Try_Here_button_in_stack_Applications_page() throws Throwable {
		stackpage.stacktryherebtnclk();
	    throw new PendingException();
	}

	@Given("^User is able to run code in tryEditor$")
	public void user_is_able_to_run_code_in_tryEditor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on the Practice Questions button$")
	public void user_clicks_on_the_Practice_Questions_button() throws Throwable {
		stackpage.clkpracticequestions();
	    throw new PendingException();
	}

	@Then("^User should be redirected to Practice Questions page$")
	public void user_should_be_redirected_to_Practice_Questions_page() throws Throwable {
		stackpage.verifypracticequestions();
	    throw new PendingException();
	}
}
