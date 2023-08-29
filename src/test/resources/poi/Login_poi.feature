Feature: Login Functionality
  As a user I want to bi able to login with my valid credentials
  so I can reach my info

  Scenario Outline: Login with valid username and password chrome
    Given Navigate to Campus with "chrome"
    When Enter <sheetname> and <row>
    And Click on Login Button
    Then User should login successfully
    Examples:
      | sheetname | row |
      | "Login"   | 0 |
      | "Login"   | 1 |


