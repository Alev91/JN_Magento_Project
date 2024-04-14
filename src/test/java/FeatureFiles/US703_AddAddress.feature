Feature: Add new Address Functionality

  Background:
    Given Navigate to the Website Magento
    When Enter username and password and click on the sign in button

  Scenario Outline: Add new Address Functionality
    And Click on the Element in LocatorClass
      | customerMenuDropdown |

    And Click on the Element in LocatorClass
      | myAccount |

    And Click on the Element in LocatorClass
      | manageAddresses |

    And Click on the Element in LocatorClass
      | buttonAddNewAddress |

    And User sending the Keys in LocatorClass
      | phoneNumber | <phone> |

    And User sending the Keys in LocatorClass
      | inputAddressStreet1 | <street> |

    And User sending the Keys in LocatorClass
      | inputAddressCity | <city> |

    And User select the Keys in LocatorClass
      | selectCountry | <country> |

    And User select the Keys in LocatorClass
      | selectRegion | <region> |

    And User sending the Keys in LocatorClass
      | inputZipCode | <zipcode> |

    And Click on the Element in LocatorClass
      | shippingAddress |

    And Click on the Element in LocatorClass
      | buttonSaveAddress |

    Then Success message should be displayed


    Examples:
      | phone      |   street   | city   | country | region              | zipcode|
      | 0176123123 | Mullerstr.5| Koeln  | Germany | Nordrhein-Westfalen | 51145  |
      | 0176345345 | Peterstr.6 | Berlin | Germany | Berlin              | 10435  |
      | 0176678678 | Meyerstr.7 | Hamburg| Germany | Hamburg             | 20097  |