$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Scenarios/eCommerceProject/scenarioInclTestCase_6.feature");
formatter.feature({
  "line": 2,
  "name": "Log in, buy the product from the wishlist, verify order number",
  "description": "",
  "id": "log-in,-buy-the-product-from-the-wishlist,-verify-order-number",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "user purchases the product and verify the order number",
  "description": "",
  "id": "log-in,-buy-the-product-from-the-wishlist,-verify-order-number;user-purchases-the-product-and-verify-the-order-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user logs in to application with previously created credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user goes to wish list page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user goes to shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects country \u003cCountry\u003e, state \u003cState\u003e and zip code \u003cZip\u003e to estimate the shipping cost",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks shipping price",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verifies the shipping rate of \u003crate\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user updates the total price",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user verifies the shipping rate price of \u003crate\u003e from total price",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters shipping information \u003cState\u003e, \u003cAddress\u003e, \u003cCity\u003e, \u003cZip\u003e, \u003cCountry\u003e, \u003cTelephone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user continues with ship to this address option",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user continues with flat shipping rate",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user continues with money order option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user places the order",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user sees successfully generated order number",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "log-in,-buy-the-product-from-the-wishlist,-verify-order-number;user-purchases-the-product-and-verify-the-order-number;",
  "rows": [
    {
      "cells": [
        "State",
        "Address",
        "City",
        "Zip",
        "Country",
        "Telephone",
        "rate"
      ],
      "line": 23,
      "id": "log-in,-buy-the-product-from-the-wishlist,-verify-order-number;user-purchases-the-product-and-verify-the-order-number;;1"
    },
    {
      "cells": [
        "Alaska",
        "street",
        "Fairbanks",
        "542896",
        "United States",
        "12345678",
        "$5.00"
      ],
      "line": 24,
      "id": "log-in,-buy-the-product-from-the-wishlist,-verify-order-number;user-purchases-the-product-and-verify-the-order-number;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "user purchases the product and verify the order number",
  "description": "",
  "id": "log-in,-buy-the-product-from-the-wishlist,-verify-order-number;user-purchases-the-product-and-verify-the-order-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user logs in to application with previously created credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user goes to wish list page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user goes to shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects country United States, state Alaska and zip code 542896 to estimate the shipping cost",
  "matchedColumns": [
    0,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks shipping price",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verifies the shipping rate of $5.00",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user updates the total price",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user verifies the shipping rate price of $5.00 from total price",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters shipping information Alaska, street, Fairbanks, 542896, United States, 12345678",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user continues with ship to this address option",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user continues with flat shipping rate",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user continues with money order option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user places the order",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user sees successfully generated order number",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseProcedure.userLogsIn()"
});
formatter.result({
  "duration": 7290680217,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userGoesToWishListPage()"
});
formatter.result({
  "duration": 684748294,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userGoesToShoppingCart()"
});
formatter.result({
  "duration": 5421416870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United States",
      "offset": 21
    },
    {
      "val": "Alaska",
      "offset": 42
    },
    {
      "val": "542896",
      "offset": 62
    }
  ],
  "location": "PurchaseProcedure.userEstimatesShippingCost(String,String,String)"
});
formatter.result({
  "duration": 2588614004,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userClicksShippingPrice()"
});
formatter.result({
  "duration": 50382182,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$5.00",
      "offset": 35
    }
  ],
  "location": "PurchaseProcedure.userVerifiesShippingRate(String)"
});
formatter.result({
  "duration": 70744249,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userUpdatesTotalPrice()"
});
formatter.result({
  "duration": 1164509814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$5.00",
      "offset": 41
    }
  ],
  "location": "PurchaseProcedure.userVerifiesShippingRateFromTotalPrice(String)"
});
formatter.result({
  "duration": 75954994,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userProceedsToCheckout()"
});
formatter.result({
  "duration": 4798126737,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alaska",
      "offset": 33
    },
    {
      "val": "street",
      "offset": 41
    },
    {
      "val": "Fairbanks",
      "offset": 49
    },
    {
      "val": "542896",
      "offset": 60
    },
    {
      "val": "United States",
      "offset": 68
    },
    {
      "val": "12345678",
      "offset": 83
    }
  ],
  "location": "PurchaseProcedure.userEntersShippingInformation(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1919649443,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userSelectsShipToThisAddressOption()"
});
formatter.result({
  "duration": 2112006702,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userContinuesWithFlatRate()"
});
formatter.result({
  "duration": 2066142288,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userContinuesWithMoneyOrderOption()"
});
formatter.result({
  "duration": 2133543317,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userPlacesTheOrder()"
});
formatter.result({
  "duration": 2063716016,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userSeesSuccessfullyGeneratedOrderNumber()"
});
formatter.result({
  "duration": 55378945,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseProcedure.userClosesTheBrowser()"
});
formatter.result({
  "duration": 75190371,
  "status": "passed"
});
});