Feature: Loggin
i want to login successfully
Scenario: Login
Given user in homepage
When user enter"Admin","admin123"
And click on login button
Then user is logged in now