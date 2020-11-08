Feature:  performing test where user creates an account and share wishlist

  Scenario Outline: user creates an account and shares wishlist

    Given   user is on the home page
    And     user clicks my account link
    When    user goes to create an account page
    Then    user enters first name <firstName>, last name <lastName>, email <email> and password <password>
    And     user clicks to register
    And     user sees the following successful registry message Welcome, <firstName> <lastName>!
    When    user clicks TV menu link
    And     user goes to product Samsung LCD page
    And     user add product to wish list
    And     user sends the wishlist to email address pepe@pepe.com
    And     user enters the following message Hello, do you find it interesting?
    And     user clicks to share wishlist
    Then    user sees successfully share message Your Wishlist has been shared.
    And     user closes the browser

    Examples:
      | firstName | lastName | email          | password   |
      | Joseph    | Peck     | peck@gmail.com | peckisback |
