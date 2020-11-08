$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Scenarios/eCommerceProject/scenarioInclTestCase_5.feature");
formatter.feature({
  "line": 1,
  "name": "performing test where user creates an account and share wishlist",
  "description": "",
  "id": "performing-test-where-user-creates-an-account-and-share-wishlist",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "user creates an account and shares wishlist",
  "description": "",
  "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks my account link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user goes to create an account page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters first name \u003cfirstName\u003e, last name \u003clastName\u003e, email \u003cemail\u003e and password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks to register",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user sees the following successful registry message Welcome, \u003cfirstName\u003e \u003clastName\u003e!",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks TV menu link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user goes to product Samsung LCD page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user add product to wish list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user sends the wishlist to email address pepe@pepe.com",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters the following message Hello, do you find it interesting?",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user clicks to share wishlist",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user sees successfully share message Your Wishlist has been shared.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password"
      ],
      "line": 22,
      "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist;;1"
    },
    {
      "cells": [
        "Joseph",
        "Peck",
        "peck@gmail.com",
        "peckisback"
      ],
      "line": 23,
      "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "user creates an account and shares wishlist",
  "description": "",
  "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks my account link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user goes to create an account page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters first name Joseph, last name Peck, email peck@gmail.com and password peckisback",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks to register",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user sees the following successful registry message Welcome, Joseph Peck!",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks TV menu link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user goes to product Samsung LCD page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user add product to wish list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user sends the wishlist to email address pepe@pepe.com",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters the following message Hello, do you find it interesting?",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user clicks to share wishlist",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user sees successfully share message Your Wishlist has been shared.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "testCase_5.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 14187823206,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClicksMyAccountLink()"
});
formatter.result({
  "duration": 6035093114,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userGoesToCreateAccountPage()"
});
formatter.result({
  "duration": 12024639862,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Joseph",
      "offset": 23
    },
    {
      "val": "Peck",
      "offset": 41
    },
    {
      "val": "peck@gmail.com",
      "offset": 53
    },
    {
      "val": "peckisback",
      "offset": 81
    }
  ],
  "location": "testCase_5.userEntersUserInformation(String,String,String,String)"
});
formatter.result({
  "duration": 246046978,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClicksToRegister()"
});
formatter.result({
  "duration": 16058321102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome,",
      "offset": 52
    },
    {
      "val": "Joseph",
      "offset": 61
    },
    {
      "val": "Peck!",
      "offset": 68
    },
    {
      "val": "",
      "offset": 73
    }
  ],
  "location": "testCase_5.userSees(String,String,String,String)"
});
formatter.result({
  "duration": 49559436,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.uerClicksTVMenuLink()"
});
formatter.result({
  "duration": 8495243336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung LCD",
      "offset": 21
    }
  ],
  "location": "testCase_5.userAddsProductToWishList(String)"
});
formatter.result({
  "duration": 8550319373,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userAddsProductToWishlist()"
});
formatter.result({
  "duration": 11098972088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pepe@pepe.com",
      "offset": 41
    }
  ],
  "location": "testCase_5.userSharesWishList(String)"
});
formatter.result({
  "duration": 7482737094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, do you find it interesting?",
      "offset": 34
    }
  ],
  "location": "testCase_5.userEntersMessage(String)"
});
formatter.result({
  "duration": 73642824,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClicksShareWishlist()"
});
formatter.result({
  "duration": 10311011828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Wishlist has been shared.",
      "offset": 37
    }
  ],
  "location": "testCase_5.userSeesSuccessfullyShareMessage(String)"
});
formatter.result({
  "duration": 95245978,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClosesTheBrowser()"
});
formatter.result({
  "duration": 811456268,
  "status": "passed"
});
});