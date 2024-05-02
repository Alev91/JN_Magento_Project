Feature: TabMenu Control functionality

  Background:
    Given Navigate to the Website Magento
    When Enter username and password and click on the sign in button

  Scenario: Tab menu control
    When User move to the element in locaterclass
      | womenBtn |

    Then User move to the Element in the locatorClass and click on the element
      | topsBtn |

    And Product Items should be displayed
      | productItems |

    Then Navigate back to the homepage

    Then User move to the element in locaterclass
      | menBtn   |
      | topsBTN2 |

    Then User move to the Element in the locatorClass and click on the element
      | bottomsBtn |

    And Product Items should be displayed
      | productItems |

    Then Navigate back to the homepage







