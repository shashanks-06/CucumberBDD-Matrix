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
  Given user is on the Accounts Page
  Then user gets accounts section
  |ADD MY FIRST ADDRESS|
  |ORDER HISTORY AND DETAILS|
  |MY CREDIT SLIPS|
  |MY ADDRESSES|
  |MY PERSONAL INFORMATION|
  And accounts section count should be 5