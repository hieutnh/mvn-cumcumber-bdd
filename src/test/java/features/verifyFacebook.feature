@parameter
Feature: Parameter Feature

  @have_param
  Scenario: Login page with param
    When Input to username with "123@gmail.com"
    And Input to password with "123123"
    And Click to button submit

  @multiple_param
  Scenario: Login page multiple param
    When Input to username with "123@gmail.com" and password with "123123"
    And Click to button login
