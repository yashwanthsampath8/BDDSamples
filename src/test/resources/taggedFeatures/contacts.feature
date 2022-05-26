Feature: Contact Function
User can create a Contact,edit/view /delete a contact

@RegressionTest @smokeTest
Scenario: Create a contact
Given User must have logged in
When User create a new contact

Scenario: view contact
Given User must have logged in
When User view a contact details

@RegressionTest
Scenario: Edit a contact
Given User must have logged in
When User edit a contact details

@smokeTest
Scenario: Delete a contact
Given User must have logged in
When User delete a contact