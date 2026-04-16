@All
Feature: Search functionality
Background:
Given Navigate to Application url for performing the search function
@Search @Success
Scenario: Checking the search functionality with the available product
When User provided data as "Redmi" in the search box 
And User clicks on the enter button
Then The application will provide the searched data details
@Search @Failure
Scenario: Checking the search functionality with the non-available product
When User provided data of non available product in the search box 
And User clicks on the enter button
Then The application will provide the searched data details as not found

