@phaseOne
Feature: Deals Function

@RegressionTest @smokeTest
Scenario: Create a Deals
Given User must have logged in
When User create a new deals

Scenario: view deals
Given User must have logged in
When User view a deals details

Scenario: Edit a deals
Given User must have logged in
When User edit a deals details

Scenario: Delete a deals
Given User must have logged in
When User delete a deals