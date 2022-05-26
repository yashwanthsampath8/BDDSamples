Feature: Tasks Function

@RegressionTest @smokeTest
Scenario: Create a Tasks
Given User must have logged in
When User create a new Tasks

Scenario: view Tasks
Given User must have logged in
When User view a Tasks details

Scenario: Edit a Tasks
Given User must have logged in
When User edit a Tasks details

Scenario: Delete a Tasks
Given User must have logged in
When User delete a Tasks