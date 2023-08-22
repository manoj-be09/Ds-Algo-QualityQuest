Feature: Queuepage Feature

Scenario: The user is logged in to DS Algo portal

Given User is in Queue Page
When  User clicks on Implementation of queue  in Python link
Then  User should be directed to Implementation of queue  in Python Page

Scenario: The user should be directed to editor page with run button to test python code

Given  User is in Implementation of queue  in Python Page
When   User clicks on Try here link
Then   User navigates to Editor page with Run button

Scenario: The user is able to run code in Editor for Implementation of queue page

Given  User is in a page having an Editor with a Run Button to Test valid code
When   User enters valid python code in Editor from sheet 'Sheetname' and 'RowNumber' 
And    User clicks Run Button
Then   User is presented with the result after Run Button is clicked in implementation of queue page

Scenario: The user is presented with error message for invalid code in Editor for Implementation of queue page

Given  User is in a page having an Editor with a Run Button to Test Invalide input 
When   User enters invalid python code in Editor  from sheet 'Sheetname' and 'RowNumber'
And    User clicks Run Button
Then   User gets an Error Message in popup screen

Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link

Given  User is in Queue Page
When   User clicks on Implementation using collections deque link
Then   User should be redirected to Implementation using collections deque page

Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections page

Given  User is in implementation using collections page
When   User clicks on Tryhere link
Then   User navigates to Editor page with Run button

Scenario: The user is able to run code in Editor for Implementation using collections page

Given  User is in a page having an Editor with a Run button to test valid python code
When   User enters valid python code in Editor  from sheet 'Sheetname' and 'RowNumber'
And    User clicks Run Button
Then   User is presented with the result after run button is clicked

Scenario: The user is presented with error message for invalid code in Editor for Implementation using collections page

Given  User is in a page having an Editor with a Run button to test invalid code
When   User enters invalid python code in Editor  from sheet 'Sheetname' and 'RowNumber'
And    User clicks Run Button
Then   User gets an Error Message

Scenario: The user is able to navigate to queue page and click on Implementation using array link

Given  User is in Queue page 
When   User clicks on Implementation using array link
Then   User should be redirected to Implementation using array page

Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page

Given  User in Implementation using array page
When   User clicks on Tryhere link
Then   User navigates to Editor page with Run button

Scenario: The user is able to run code in Editor for Implementation using array page

Given  User is in a page having an Editor with a Run button to test valid python code
When   User enters valid python code in Editor  from sheet 'Sheetname' and 'RowNumber'
And    User clicks Run Button
Then   User is presented with the result after run button is clicked

Scenario: The user is presented with error message for invalid code in Editor for Implementation using array page

Given  User is in a page having an Editor with a Run button to test invalid code
When   User enters invalid python code in Editor  from sheet 'Sheetname' and 'RowNumber'
And    User clicks Run Button
Then   User gets an error message

Scenario: The user is able to navigate to queue page and click on Queue Operations link

Given  User is in Queue page
When   User clicks on Queue Operations  link
Then   User should be redirected to Queue Operations page

Scenario: The user should be directed to editor page with run button to test python code

Given  User in Queue Operations page
When   User clicks on Tryhere link
Then   User navigates to Editor page with Run button

Scenario: The user is able to run code in Editor for Queue Operations page

Given  User is in a page having an Editor with a Run button to test valid python code
When   User enters valid python code in Editor  from sheet 'Sheetname' and 'RowNumber' 
And    User clicks Run Button
Then   User is presented with the result after run button is clicked

Scenario: The user is presented with error message for invalid code in Editor

Given  User The user is in a page having an Editor with a Run button to test invalide python code
When   User enters invalid python code in Editor  from sheet 'Sheetname' and 'RowNumber'
And    User clicks Run Button
Then   User gets an error message

Scenario: The user is able to navigate to QueueOperations page and click on Practice Questions

Given  User is in Queue page
When   User clicks on Practice Questions
Then   User is directed to Practice page


     







