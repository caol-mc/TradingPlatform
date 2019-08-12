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

  @AResetPasswordSuccess
  Scenario: Reset Password Success
    Given that the browser is open on google
    And the user is on the homepage
    When the user clicks on the forgotten password link
    Then the user is directed to the forgotten password screen
    When the user enters their username into the field
    And the user selects their security question
    And the user enters their security answer
    And the user clicks the reset password button
    Then the user is directed to the password reset screen with their new password
		When the user clicks on the home link
		Then the user is directed to the home page
		And the user enters their username into the login
    And the user selects their password into the field
    And the user clicks the submit button to login
    Then the user is directed to the logged in page
    And close browser
