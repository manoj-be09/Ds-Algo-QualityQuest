
Feature: Register Page Feature File
     
Scenario: The user is presented with error message for empty Password textbox
    Given The user is in Register Page
    When The user enters valid "username" in username field
    And The user clicks Register button
    Then It should display an error below Password textbox:Please fill out this field 

Scenario: The user is presented with error message for empty Username textbox
    Given The user is in Register Page
    When The user enters valid "password" in password field
    And The user clicks Register button
    Then It should display an error below Username textbox:Please fill out this field 
    
Scenario: The user is presented with error message for empty Username textbox
    Given The user is in Register Page
    When The user clicks Register button 
    Then It should display an error below Username textbox:Please fill out this field 
    
 Scenario: The user is presented with error message for empty Password Confirmation textbox
    Given The user is in Register Page
    When The user enters valid "username" in username field
    And The user enters valid "password" in password field
    And The user clicks Register button 
    Then It should display an error below Password Confirmation textbox:Please fill out this field 
    
Scenario: The user is presented with error message for Invalid Username
    Given The user is in Register Page
    When The user enters invalid "username" in username field
    And The user enters valid "password" in password field and "passwordConfirmation" in password confirmation field
    And The user clicks Register button
    Then It should display an error:Please enter a valid username
    
    
Scenario: The user is presented with error message for Username Already Exists
    Given The user is in Register Page
    When The user enters existing "username" in username field
    And The user enters valid "password" in password field and "passwordConfirmation" in password confirmation field
    And The user clicks Register button
    Then It should display an error: Username already exists
    
Scenario: The user is presented with error message for Password mismatch
    Given The user is in Register Page
    When The user enters valid "username" in username field
    And The user enters different "password" in password field and "passwordConfirmation" password confirmation field
    And The user clicks Register button
    Then It should display an error: password_mismatch:The two password fields didn’t match
    
Scenario: The user is presented with error message for Password character length
    Given The user is in Register Page
    When The user enters valid "username" in username field
    And The user enters less than 8 characters in "password" in password field and "passwordConfirmation" in password confirmation field
    And The user clicks Register button
    Then It should display an error: Password should contain at least 8 characters   

Scenario: The user is presented with error message for numeric password
    Given The user is in Register Page
    When The user enters valid "username" in username field
    And The user enters all numbers in "password" in password field and "passwordConfirmation" in password confirmation field
    And The user clicks Register button
    Then It should display an error:Password can’t be entirely numeric.    
 
 
Scenario: The user is succesfully resgistered
    Given The user is in Register Page
    When The user enters valid "username" in username field
    And The user enters valid "password" in password field and "passwordConfirmation" in password confirmation field
    And The user clicks Register button
    Then The user should be redirected to Homepage with the message: New Account Created. You are logged in as "username" 
     
