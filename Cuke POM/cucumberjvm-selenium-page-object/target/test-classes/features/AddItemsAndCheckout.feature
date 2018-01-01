Feature: Add items to cart and check out

  Scenario: Add 9volt rechargeable battery to cart
    Given I open ukrsonline website
    When I sign in
    And I add an 9volt rechargeable battery

  Scenario: Add Automative battery to cart and Check out
    Given I open ukrsonline website
    When I sign in
    And I add an Automative battery
    And I checkout
    