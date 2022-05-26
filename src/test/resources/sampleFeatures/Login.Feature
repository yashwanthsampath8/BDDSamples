Feature: Login Function

#Scenario: Valid Login
#Given User is on Login Page
#When User enters login credentials
#When User enters "tomsmith" and "SuperSecretPassword!" 
#Then user Should be navigated to Home Page

#Scenario: Invalid Login
#Given User is on Login Page
#When User enters login credentials
#Then user Should be navigated to Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>" 
#Then user Should be navigated to Home Page

#Examples: 
# | username | password |
# | testuser1 | welcome1 |
# | testuser2 | welcome1 |
# | tomsmith | SuperSecretPassword! |
 
 #Scenario: Place Order
 #Given User is on Login Page
 #And User Login with cred - user, pwd
 #When User navigates to Home page
 #When user select items - item
 #And Add items to cart
 #Then order must be placed 
 
Scenario: Valid Login
Given User is on Login Page
When User enters login credentials
	| username | password |
	| tomsmith | SuperSecretPassword! |
Then user Should be navigated to Home Page
 