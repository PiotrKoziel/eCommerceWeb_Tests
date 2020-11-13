
Feature: Log in, buy the product from the wishlist, verify order number

  Scenario Outline: user purchases the product and verify the order number
    Given   user logs in to application with previously created credentials
    When    user goes to wish list page
    And     user goes to shopping cart page
    And     user selects country <Country>, state <State> and zip code <Zip> to estimate the shipping cost
    And     user clicks shipping price
    And     user verifies the shipping rate of <rate>
    And     user updates the total price
    And     user verifies the shipping rate price of <rate> from total price
    And     user proceeds to checkout
    And     user enters shipping information <State>, <Address>, <City>, <Zip>, <Country>, <Telephone>
    And     user continues with ship to this address option
    And     user continues with flat shipping rate
    And     user continues with money order option
    And     user places the order
    Then    user sees successfully generated order number
    And     user closes the browser

    Examples:
      | State     |  Address    | City        |  Zip      |   Country     | Telephone | rate |
      | Alaska    |  street     | Fairbanks   |  542896   |United States  | 12345678  | $5.00|