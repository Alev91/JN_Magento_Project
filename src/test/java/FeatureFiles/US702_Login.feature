Feature: Login Functionality

  Background:
    Given Navigate to the Website Magento


  Scenario: Login with valid username and password
    When Create new Customer Account,enter customer Data and click on the Create an Account button
    Then Enter username and password and click on the sign in button
    And User should be successfully logged in


  Scenario: Login with invalid username and password
    When Enter invalid username and password and click on the sign in button
    Then User should receive an error message


