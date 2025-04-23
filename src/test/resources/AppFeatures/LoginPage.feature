Feature: Login Page Feature

  Scenario: Login Page title
    Given User is on the Login Page
    When User gets the title of page
    Then Page title should be "Login - My Shop"

  Scenario: Forgot Password Link
    Given User is on the Login Page
    Then Forgot Your Password Link should be Displayed

  Scenario: Login with correct Credentials
    Given User is on the Login Page
    When User enters the username "doxehin793@linxues.com"
    And User enters the password "Pass@123"
    And User clicks on Login Button
    Then User gets the title of page
    And Page title should be "My account - My Shop"
