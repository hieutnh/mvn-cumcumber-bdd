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

  @Register_Dynamic
  Scenario Outline: Register a account dynamic
    Given Get current page Url dynamic
    When Open register page dynamic
    And Input to "FirstName" textbox with value "<FirstName>"
    And Input to "LastName" textbox with value "<LastName>"
    And Input to "Email" textbox with value ""
    And Input to "Password" textbox with value "<PassWord>"
    And Input to "ConfirmPassword" textbox with value "<PassWord>"
    And Click register button dynamic
    And Click button logout dynamic
    And Click button login at login page dynamic
    And Input to "Email" textbox at login page with value ""
    And Input to "Password" textbox at login page with value "<PassWord>"
    And Click button login to home page dynamic

    Examples: 
     | PassWord |
     |   123123 |
