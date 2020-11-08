Feature: performing test cases to verify sort-by option, price comparison, product availability, product comparison

  Background:
    Given user is on the home page
    When  user clicks mobile menu
    Then  user goes to product list page


  Scenario: items listed on product page can be sorted by name

    Then  user goes to product list page
    And   user selects sort-by dropdown as option Name
    And   user closes the browser


  Scenario: the cost of the product from product list and detail page are equal

    And   user notes product price from the list
    When  user clicks product image
    Then  user notes product price from detail page
    And   price from product list and detail page is compared
    And   user closes the browser

  Scenario: cannot add more products to cart than product available in store

    When  user adds to cart a product from the list
    Then  user enters quantity of 1000 and updates the cart
    And   user sees the following message Some of the products cannot be ordered in requested quantity.
    When  user empties the cart
    Then  user can see the following message Shopping Cart is Empty
    And   user closes the browser

  Scenario: compares two products

    When  user adds two products to compare
    Then  user goes to pop-up window compare products
    And   user verifies the content of pop-up window
    And   user closes the browser

