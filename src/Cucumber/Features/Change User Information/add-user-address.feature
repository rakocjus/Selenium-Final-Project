Feature: User adds new address

  Scenario Outline: Create new address in user's account
    Given User is logged in to CodersLab shop
    When User goes to NewAddressPage
    And User clicks Create new address
    And User fills the address form with <address>, <city> <postcode>
    And User saves changes
    Then User sees success message
    And user confirms <address> data
    And User close chrome

    Examples:
      | address     | city   | postcode |
      | Testowy 16  | Warsaw | 02703    |
