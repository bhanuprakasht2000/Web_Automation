@All
Feature: Login scenarios
We are going to test the log in functionalities
Background:
Given Provide the application Url for logging into the account

@Login @validcred @Success 
Scenario Outline: 
User log in with the Valid credentials
When User enter the the Valid Username  in the Username box as <username>
And User enters the valid password  in the password box as <password>
And User clicks on the enter button
Then User should log into the user account
Examples:
|username     |password|
|Bhanu        |12334   |
|Anu          |134     |
|Kani         |1312    |
@Login @invalidcred @Failure
Scenario: User log in with the Invalid credentials
When User enter the the InValid Username "Abc"in the Username box
And User enters the invalid password "1234567" in the password box
And User clicks on the enter button
Then User should not able to log into the user account
@Login @Nocred @Failure
Scenario: User log in with the Invalid username and blank password credentials
When User enter the the InValid Username "Abc"in the Username box
And User  dont enters the password  in the password box
And User clicks on the enter button
Then User should not able to log into the user account