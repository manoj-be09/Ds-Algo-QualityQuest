package StepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.QueuePage;
import pages.StackPage;

public class QueueSD {

	private WebDriver driver;
	//private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
	private QueuePage queuepage= new QueuePage(DriverFactory.getDriver());
	@Given("^User is in Queue Page$")
	public void user_is_in_Queue_Page() throws Throwable {
	    queuepage.clkqueuegetstartbutton();
	    throw new PendingException();
	}

	@When("^User clicks on Implementation of queue  in Python link$")
	public void user_clicks_on_Implementation_of_queue_in_Python_link() throws Throwable {
		queuepage.clkimplementqueueinpython();
	    throw new PendingException();
	}

	@Then("^User should be directed to Implementation of queue  in Python Page$")
	public void user_should_be_directed_to_Implementation_of_queue_in_Python_Page() throws Throwable {
		queuepage.verifypageofimplementofqueueinpython();
	    throw new PendingException();
	}

	@Given("^User is in Implementation of queue  in Python Page$")
	public void user_is_in_Implementation_of_queue_in_Python_Page() throws Throwable {
		queuepage.verifypageofimplementofqueueinpython();
	    throw new PendingException();
	}

	@When("^User clicks on Try here link$")
	public void user_clicks_on_Try_here_link() throws Throwable {
		queuepage.clkqueuetryhere();
	    throw new PendingException();
	}

	@Then("^User navigates to Editor page with Run button$")
	public void user_navigates_to_Editor_page_with_Run_button() throws Throwable {
		queuepage.clkqueuetryhere();
	    throw new PendingException();
	}

	@Given("^User is in a page having an Editor with a Run Button to Test valid code$")
	public void user_is_in_a_page_having_an_Editor_with_a_Run_Button_to_Test_valid_code() throws Throwable {
		 throw new PendingException();
	}

	@When("^User enters valid python code in Editor from sheet 'Sheetname' and 'RowNumber'$")
	public void user_enters_valid_python_code_in_Editor_from_sheet_Sheetname_and_RowNumber1() throws Throwable {
		//String code= ExcelReader.getDataFromExcel("Pages",1,0);
		//StackPage.codeEditor(code);
	    throw new PendingException();
	}

	@When("^User clicks Run Button$")
	public void user_clicks_Run_Button() throws Throwable {
	    queuepage.clkqueuerun();
	    throw new PendingException();
	}

	@Then("^User is presented with the result after Run Button is clicked in implementation of queue page$")
	public void user_is_presented_with_the_result_after_Run_Button_is_clicked_in_implementation_of_queue_page() throws Throwable {
		queuepage.clkqueuerun();
	    throw new PendingException();
	}

	@Given("^User is in a page having an Editor with a Run Button to Test Invalide input$")
	public void user_is_in_a_page_having_an_Editor_with_a_Run_Button_to_Test_Invalide_input() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enters invalid python code in Editor  from sheet 'Sheetname' and 'RowNumber'$")
	public void user_enters_invalid_python_code_in_Editor_from_sheet_Sheetname_and_RowNumber() throws Throwable {
		//String code= ExcelReader.getDataFromExcel("Pages",1,0);
	   //StackPage.codeEditor(code);
	    throw new PendingException();
	}

	@Then("^User gets an Error Message in popup screen$")
	public void user_gets_an_Error_Message_in_popup_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on Implementation using collections deque link$")
	public void user_clicks_on_Implementation_using_collections_deque_link() throws Throwable {
		queuepage.clkimplementusingcollqueue();
	    throw new PendingException();
	}

	@Then("^User should be redirected to Implementation using collections deque page$")
	public void user_should_be_redirected_to_Implementation_using_collections_deque_page() throws Throwable {
		queuepage.verifypageimplemcollect();
	    throw new PendingException();
	}

	@Given("^User is in implementation using collections page$")
	public void user_is_in_implementation_using_collections_page() throws Throwable {
		queuepage.verifypageimplemcollect();
	    throw new PendingException();
	}

	@When("^User clicks on Tryhere link$")
	public void user_clicks_on_Tryhere_link() throws Throwable {
		queuepage.clkqueuetryhere();
	    throw new PendingException();
	}

	@Given("^User is in a page having an Editor with a Run button to test valid python code$")
	public void user_is_in_a_page_having_an_Editor_with_a_Run_button_to_test_valid_python_code() throws Throwable {
		queuepage.clkqueuerun();
	    throw new PendingException();
	}

	@When("^User enters valid python code in Editor  from sheet 'Sheetname' and 'RowNumber'$")
	public void user_enters_valid_python_code_in_Editor_from_sheet_Sheetname_and_RowNumber() throws Throwable {
		//String code= ExcelReader.getDataFromExcel("Pages",1,0);
		   //StackPage.codeEditor(code);
	    throw new PendingException();
	}

	@Then("^User is presented with the result after run button is clicked$")
	public void user_is_presented_with_the_result_after_run_button_is_clicked() throws Throwable {
		queuepage.clkqueuerun();
	    throw new PendingException();
	}

	@Given("^User is in a page having an Editor with a Run button to test invalid code$")
	public void user_is_in_a_page_having_an_Editor_with_a_Run_button_to_test_invalid_code() throws Throwable {
		queuepage.clkqueuerun();
	    throw new PendingException();
	}

	@Then("^User gets an Error Message$")
	public void user_gets_an_Error_Message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User is in Queue page$")
	public void user_is_in_Queue_page() throws Throwable {
		queuepage.clkimplemqueueusearray();
	    throw new PendingException();
	}

	@When("^User clicks on Implementation using array link$")
	public void user_clicks_on_Implementation_using_array_link() throws Throwable {
		queuepage.clkimplemqueueusearray();
	    throw new PendingException();
	}

	@Then("^User should be redirected to Implementation using array page$")
	public void user_should_be_redirected_to_Implementation_using_array_page() throws Throwable {
		queuepage.verifypageimplemusingarray();
	    throw new PendingException();
	}

	@Given("^User in Implementation using array page$")
	public void user_in_Implementation_using_array_page() throws Throwable {
		queuepage.verifypageimplemusingarray();
	    throw new PendingException();
	}

	@Then("^User gets an error message$")
	public void user_gets_an_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on Queue Operations  link$")
	public void user_clicks_on_Queue_Operations_link() throws Throwable {
		queuepage.clkqueueoperations();
	    throw new PendingException();
	}

	@Then("^User should be redirected to Queue Operations page$")
	public void user_should_be_redirected_to_Queue_Operations_page() throws Throwable {
		queuepage.verifypagequeueoper();
	    throw new PendingException();
	}

	@Given("^User in Queue Operations page$")
	public void user_in_Queue_Operations_page() throws Throwable {
		queuepage.verifypagequeueoper();
	    throw new PendingException();
	}

	@Given("^User The user is in a page having an Editor with a Run button to test invalide python code$")
	public void user_The_user_is_in_a_page_having_an_Editor_with_a_Run_button_to_test_invalide_python_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User is in Queue page$")
	public void user_is_in_to_Queue_page() throws Throwable {
		queuepage.clkpracticequestions();
		throw new PendingException();
	}

	@When("^User clicks on Practice Questions$")
	public void user_clicks_on_Practice_Questions() throws Throwable {
		queuepage.clkpracticequestions();
	    throw new PendingException();
	}

	@Then("^User is directed to Practice page$")
	public void user_is_directed_to_Practice_page() throws Throwable {
		queuepage.veriyfPracticeQuesPage();
	    throw new PendingException();
	}

	
	}
