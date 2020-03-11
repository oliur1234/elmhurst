Feature: Validate login function in OrangeHRM

Scenario: User able to login with valid credential
Given user go to login page hrm
And user print the page title hrm
Then user meximize window
When user enters a valid user name hrm
And user enters a valid password hrm 
Then user click on the login button hrm
And user print the page title hrm
#When user click on log out button hrm
And user print the page title hrm
And user close the browser hrm