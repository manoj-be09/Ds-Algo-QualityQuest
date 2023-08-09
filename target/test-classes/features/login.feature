
Feature: Login Page
  
 Scenario:The user is able to signin with valid registered credentials
  Given The user is in the Sign in page
  When The user enters a valid 'username' and 'password'
  And Clicks login button
  Then User homepage is displayed
 
