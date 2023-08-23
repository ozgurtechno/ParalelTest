Feature: Login Functionality
  As a user I want to bi able to login with my valid credentials
  so I can reach my info


  Scenario: Login with valid username and password chrome
    Given Navigate to Campus with "chrome"
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: Login with valid username and password firefox
    Given Navigate to Campus with "firefox"
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
