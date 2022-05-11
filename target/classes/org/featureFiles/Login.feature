Feature: Login Page Feature

Scenario: Validate login page with valid Credentials
Given user navigate to url
When user enter username as "standard_user"
And user enter password as "secret_sauce"
And user click on login button
Then user should be redirect to next page