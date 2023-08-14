Feature: Login Page Feature

Scenario: The user is able to signin with valid registered credentials
  Given The user is in the Sign in page
  When Clicks sigin link
  When The user enters a valid 'username' 
  And The user enters a valid 'password'
  And Clicks login button
  Then User homepage is displayed 
 
Scenario: Verifying Register link in Signin page
  Given The user is in the Sign in page
  When The user clicks on the register link on the signin page
  Then The user is redirected to the Registration page from the signin page
  
  Scenario: Verifying Signin link in Signin page
  Given The user is in the Sign in page
  When The user clicks on the sigin link on the signin page
  Then The user is redirected to the Login page from the signin page

Scenario: User on login page and login with invalid inputs
  Given The user is in the signin page
  When The user enters a invalid 'username' 
  And The user enters a valid'password'
  And Clicks login button 
  Then Error message is displayed System should alert user Please check your user id

  
Scenario: Verifying signout link
  Given The user is on the Home page with valid log in
  When The user clicks on Sign out
  And Clicks sigin link
  Then The user is redirected to the login page from the homepage