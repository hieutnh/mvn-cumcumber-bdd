Feature: Register and login

  @Register
  Scenario: Register a account
    Given Get current page Url
    When Open register page
    And Input to firstname
    And Input to lastname
    And Input email to textbox
    And Input password to textbox
    And Input Confirm password to textbox
    And Click register button
    And Click button logout
    And Click button login at login page
    And Input email to textbox at login page
    And Input pass to textbox at login page
    And Click button login to home page
    
    

