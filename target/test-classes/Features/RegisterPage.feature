@Regression
Feature: This features verify the Register page for all negative and positive scripts
Scenario: Filled all box and verify details and submit the result 
And The Register page URL is launched
Given Filled All Box Details
When Verify Details
Then Click On Submit button
When Test case fail take screen shot