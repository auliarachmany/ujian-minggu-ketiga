Feature: Add Cart Item

  Scenario: User add cart dress product item
    When User click product dress item
    And User choose product dress color
    And User choose product dress size
    And User click button add cart on dress product
    And User click icon cart for dress view
    Then Showing dress product after add cart
