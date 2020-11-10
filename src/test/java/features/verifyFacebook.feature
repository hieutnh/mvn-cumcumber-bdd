@parameter
Feature: Parameter Feature

  @displayed
  Scenario: Verify login page
    Given Open facebook application
    And Close application

  @have_param
  Scenario: Login page with param
    Given Open facebook application
    When Input to username with "123@gmail.com"
    And Input to password with "123123"
    And Click to button submit
    And Close application

  @multiple_param
  Scenario: Login page multiple param
    Given Open facebook application
    When Input to username with "123@gmail.com" and password with "123123"
    And Click to button login
    And Close application
