#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: check Balance
  I want to use this template for my feature file

  @AddNewAccountAndAddCurrency
  Scenario Outline: Add account and populate it Success
    Given the browser is opened
    And the user is at the check balance page
    When the user clicks on add new account 
    And the user selects a new account to add "<currency>"
    And the user clicks the on the add account button
    Then the current balance screen appears
    When the user clicks on add balance to the new account
    And the user waits for the confirm button to appea
    And the user enters an ammount they wish to add
    Then the user will see their new account with funds
    And the user selects the confirm button
		Then close the browser down
		
		
	Examples: 
      | currency  |
      | usd | 
      | aud | 
      | cad | 
      | sek | 
      | jpy | 
      | eur | 
	