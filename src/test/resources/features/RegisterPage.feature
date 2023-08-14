
Feature: Register Page Feature File
     
  Scenario Outline: User Enters Invalid Username
    Given User is on register page
    When User enters invalid <username>
    And User enters valid <password>
    And User enters valid <passwordConfirmation>
    And User clicks on "Register" button
    Then Error message "Please enter a valid username" is displayed

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
