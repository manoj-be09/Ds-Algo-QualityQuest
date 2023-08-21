Feature: Login Page Feature

Scenario: The user is able to signin with valid registered credentials
  Given The user is in the Sign in page
  When The user enters a valid "<username>" and valid "<password>"
  And Clicks login button
  Then User homepage is displayed 
  
Scenario: User on login page and enters invalid username
  Given The user is in the Sign in page
  When The user enters a invalid "<username>" and valid "<password>"
  And Clicks login button 
  Then Error message is displayed: Please check your user id
  
  
Scenario: User on login page and login with invalid password
  Given  The user is in the Sign in page
  When The user enters a valid "<username>" and invalid "<password>"
  And Clicks login button 
  Then Error message is displayed: Please check your password
  
  Scenario: Verifying signout link
  Given The user is in the Sign in page
  When The user enters a valid "<username>" and valid "<password>"
  And Clicks login button
  And The user clicks on Sign out
  And  The user clicks sigin link
  Then The user is redirected to the Login page from the Home page
 
  
Scenario: User on login page and logins without username and password
  Given The user is in the Sign in page
  When Clicks login button 
  Then Username field validation Error message is displayed: Please fill out this field
  
Scenario: User on login page and logins without password
  Given The user is in the Sign in page
  When User enters valid "<username>" in username field
  And Clicks login button 
  Then Password field validation Error message is displayed: Please fill out this field
  
Scenario: User on login page and logins without username
  Given The user is in the Sign in page
  When User enters valid "<password>" in password field
  And Clicks login button 
  Then Password field validation Error message is displayed: Please fill out this field
 
  
