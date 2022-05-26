Feature: GooglePage Function

Scenario: Java search
Given User is on Google Home Page
When user search Java Tutorial
Then Should display Java Result Page

Scenario: Selenium search
Given User is on Google Home Page
When user search Selenium Tutorial
Then Should display Selenium Result Page  