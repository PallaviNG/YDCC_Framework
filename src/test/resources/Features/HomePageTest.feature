#Author: your.email@your.domain.com
Feature: This features verify the home page for all negative and positive scripts
Scenario: Check the HomePage Title
Given The chrome browser is launched
And  The Url of app is also launched
Then verify title of the pages 
Scenario: Click button for new Registration
Given Click on the Register Btn
Then verify title of the register page 
And verify current URL
Scenario: Click here at Instruction Page
Given Click on CheckBox
And Click Here to Proceed Btn
Then verify title of the registration Form