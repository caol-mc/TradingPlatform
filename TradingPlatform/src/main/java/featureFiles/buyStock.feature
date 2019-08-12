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
Feature: Title of your feature
  I want to use this template for my feature file

  @BuyStockInGlencore
  Scenario: Buy Stock Success
    Given the browser is open
    And the user is at the buy stock page
    When the user clicks on G
    And the user clicks on the radio button for Glencore Intl
    And the user clicks the buy button
    Then the transaction summary message appears
    When the user enters the amount of shares they wish to buy
    And the user clicks on the calculate button
    And the user waits for the confirm button to appear
    And the user clicks on the confirm button
    And the user clicks to return to the home page
    And the user clicks to navigate to the transaction history page
    Then the user will see their recent transaction
		And close the browser
