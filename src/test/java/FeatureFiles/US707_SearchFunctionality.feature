Feature: Search Functionality
  Background:
    Given Navigate to the Website Magento
    When Enter username and password and click on the sign in button


  Scenario: User checks search functionality
    When User enters product valid id number in the search box
    And User should be able to verify product id number

  Scenario: User checks invalid search functionality
    When User enters invalid product id number in the search box
    And A warning messagge must occur on the screen
