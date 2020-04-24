Feature: User buys new product

  Scenario: User buys new product, chooses shipping and payment method
    Given User is logged in to CodersLab myshop
    When User goes to ClothesPage
    And User clicks on Hummingbird Printed Sweater
    And User chooses size M and 5 items and clicks 'Add to cart'
    And User clicks Proceed to Checkout and again Proceed to Checkout
    And User verifies/confirms the Address
    And User chooses PrestaShop shipping method
    And User chooses Pay by Check payment method
    And User checks required agreements and clicks Order with an obligation to pay
    Then User sees order confirmed message and creates PrtScr
    And User closes browser