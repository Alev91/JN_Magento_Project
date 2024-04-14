Feature: Register Functionality

  Scenario: Register with Customer Data

    Given Navigate to the Website Magento
    When Create new Customer Account,enter customer Data and click on the Create an Account button
    Then User should be successfully registered
