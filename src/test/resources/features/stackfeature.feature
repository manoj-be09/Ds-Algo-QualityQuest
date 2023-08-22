Feature: stackpage Feature

Scenario: The user is able to navigate to Operations in Stack page

Given  User is in the Stack page after logged in
When   User clicks on the Operations in Stack link
Then   User should then be directed to Operations in Stack Page

Scenario: The user is able to navigate to a page having an tryEditor

Given  User is on the Operations in Stack page 
When   User clicks Try Here button in stack page
Then   User should be redirected to a page having an tryEditor with a Run button to test


Scenario:The user is able to run code in tryEditor

Given   User is in the Stack page after having an tryEditor with a Run button to test
When    User gets input from 'sheetName','rowName'and 'columnName'
And     User clicks on Run button 
Then    User should be presented with Run output

Scenario:The user is able to get the error message for invalid syntax

Given   User is in stack page having an tryEditor with a Run button to test
When    User gets invalid input from 'sheetName','rowName'and 'columnName'
And     User clicks on Run button after Entering invalid python code in stack tryEditor
Then    User should get the error message


Scenario:The user is able to navigate to Implementation Page

Given   User is on the Stack page
When    User clicks on the Implementation button
Then    User should then be directed to Implementation Page


Scenario:The user is able to navigate to Implementation page having an tryeditor

Given   User is on the Implementation page 
When    User clicks Try Here button in stack Implementation page
Then    User should be redirected to a page having an tryEditor with a Run button to test

Scenario:The user is able to run code in tryEditor

Given   User is in the Stack page after having an tryEditor with a Run button to test
When    User gets input from 'sheetName','rowName'and 'columnName'
And     User clicks on Run button after Entering valid python code in stack tryEditor
Then    User should be presented with Run output

Scenario:The user is able to get the error message for invalid syntax

Given   User is in stack page having an tryEditor with a Run button to test
When    User gets invalid input from 'sheetName','rowName'and 'columnName'
And     User clicks on Run button after Entering invalid python code in stack tryEditor
Then    User should get the error message

Scenario:The user is able to navigate to Applications in stack Page

Given   User is on the stackpage
When    User clicks on the Applications button
Then    User should be directed to Applications Page

Scenario:The user is able to navigate to Applications page having an tryEditor

Given   User is on the Applications page 
When    User clicks Try Here button in stack Applications page
Then    User should be redirected to a page having an tryEditor with a Run button to test

Scenario:The user is able to run code in tryEditor

Given   User is able to run code in tryEditor
When    User gets input from 'sheetName','rowName'and 'columnName'
And     User clicks on Run button after Entering valid python code in stack tryEditor
Then    User should be presented with Run output

Scenario:The user is able to get the error message for invalid syntax

Given   User is in stack page having an tryEditor with a Run button to test
When    User gets invalid input from 'sheetName','rowName'and 'columnName'
And     User clicks on Run button after Entering invalid python code in stack tryEditor
Then    User should get the error message


Scenario:The user is able to navigate to Practice Questions in stack Page

Given   User is on the Stack page 
When    User clicks on the Practice Questions button
Then    User should be redirected to Practice Questions page