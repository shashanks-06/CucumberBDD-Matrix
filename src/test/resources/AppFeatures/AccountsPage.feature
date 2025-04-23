Feature: Account Page Feature

Background:
  Given user has already logged in to the application
  |username|password|
  |doxehin793@linxues.com|Pass@123|

Scenario: Accounts page title
  Given user is on the Accounts Page
  When User gets the title of page
  Then Page title should be "My account - My Shop"

Scenario: Accounts section count
  Given user is on Accounts page
  Then user gets accounts section
  |Add my first address|
  |Order history and details|
  |My credit slips|
  |My addresses|
  |My personal information|
  And accounts section count should be 5