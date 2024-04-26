Feature: Product Ordering functionality Check

  Scenario: Product Order

    Given Navigate to the Website Magento
    When Element Click on Dialog
      | signIn |
    When User should be Login

    Then User Succesfully Logined

    And Element Click on Dialog
      | argus |
    And Element Click on Dialog
      | large       |
      | colorselect |
      | addCart     |
      | basket      |
    And Element Click on Dialog
      | checkOut |
    And Element Click on Dialog
      | nextButton |
      | placeOrder|
    Then User should be see your order number