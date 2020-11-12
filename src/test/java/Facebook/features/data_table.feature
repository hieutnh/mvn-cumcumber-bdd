@datable
Feature: DataTable Feature

  @data_table
  Scenario Outline: Login user with many email
    When Input to username and password one time
      | username   | pasword   |
      | <username> | <pasword> |
    And Click to button login

    Examples: 
      | username               | pasword |
      | automationvn@gmail.com |  123123 |

  @datatable_driven_testing
  Scenario Outline: Login user with three account
    When Input to username and password three account
      | username                 | pasword |
      | automationvn01@gmail.com |  123123 |
      | automationvn02@gmail.com |  123123 |
      | automationvn03@gmail.com |  123123 |
    And Click to button login

    Examples: 
      | username                 | pasword |
      | automationvn02@gmail.com |  123123 |
