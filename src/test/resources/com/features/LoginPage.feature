Feature: Login Page Feature

  Scenario: Login Page title
    Given User is on the Login Page
    When User gets the title of Login page
    Then Login page title should be "Login - My Store"

  Scenario: Forgot Password Link
    Given User is on the Login Page
    Then Forgot Your Password Link should be Displayed

  Scenario: Login with correct Credentials
    Given User is on the Login Page
    When User enters the username "dec2020secondbatch@gmail.com"
    And User enters the password "Selenium@12345"
    And USer clicks on Login Button
    Then User gets the title of Home Page
    And Home Page Title should be "My Account - My Store"
