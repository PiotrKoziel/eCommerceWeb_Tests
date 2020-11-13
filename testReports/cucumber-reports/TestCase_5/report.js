$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Scenarios/eCommerceProject/scenarioInclTestCase_5.feature");
formatter.feature({
  "line": 1,
  "name": "performing test where user creates an account and share wishlist",
  "description": "",
  "id": "performing-test-where-user-creates-an-account-and-share-wishlist",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user creates an account and shares wishlist",
  "description": "",
  "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks my account link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user goes to create an account page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters first name \u003cfirstName\u003e, last name \u003clastName\u003e, email \u003cemail\u003e and password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks to register",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user sees the following successful registry message Welcome, \u003cfirstName\u003e \u003clastName\u003e!",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks TV menu link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user goes to product Samsung LCD page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user add product to wish list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user sends the wishlist to email address pepe@pepe.com",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters the following message Hello, do you find it interesting?",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks to share wishlist",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user sees successfully share message Your Wishlist has been shared.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
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
      "line": 21,
      "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist;;1"
    },
    {
      "cells": [
        "Salt",
        "Pepper",
        "pepper@gmail.com",
        "pepper"
      ],
      "line": 22,
      "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "user creates an account and shares wishlist",
  "description": "",
  "id": "performing-test-where-user-creates-an-account-and-share-wishlist;user-creates-an-account-and-shares-wishlist;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks my account link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user goes to create an account page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters first name Salt, last name Pepper, email pepper@gmail.com and password pepper",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks to register",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user sees the following successful registry message Welcome, Salt Pepper!",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks TV menu link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user goes to product Samsung LCD page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user add product to wish list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user sends the wishlist to email address pepe@pepe.com",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters the following message Hello, do you find it interesting?",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks to share wishlist",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user sees successfully share message Your Wishlist has been shared.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "testCase_5.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 35795537087,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClicksMyAccountLink()"
});
formatter.result({
  "duration": 16034936340,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userGoesToCreateAccountPage()"
});
formatter.result({
  "duration": 31377102077,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Salt",
      "offset": 23
    },
    {
      "val": "Pepper",
      "offset": 39
    },
    {
      "val": "pepper@gmail.com",
      "offset": 53
    },
    {
      "val": "pepper",
      "offset": 83
    }
  ],
  "location": "testCase_5.userEntersUserInformation(String,String,String,String)"
});
formatter.result({
  "duration": 272934618,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClicksToRegister()"
});
formatter.result({
  "duration": 25549556069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome,",
      "offset": 52
    },
    {
      "val": "Salt",
      "offset": 61
    },
    {
      "val": "Pepper!",
      "offset": 66
    },
    {
      "val": "",
      "offset": 73
    }
  ],
  "location": "testCase_5.userSees(String,String,String,String)"
});
formatter.result({
  "duration": 64615363,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.uerClicksTVMenuLink()"
});
formatter.result({
  "duration": 35565966047,
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
  "duration": 15367428630,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userAddsProductToWishlist()"
});
formatter.result({
  "duration": 15746641332,
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
  "duration": 10164488999,
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
  "duration": 72453834,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClicksShareWishlist()"
});
formatter.result({
  "duration": 22670539155,
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
  "duration": 90783345,
  "status": "passed"
});
formatter.match({
  "location": "testCase_5.userClosesTheBrowser()"
});
formatter.result({
  "duration": 544915644,
  "status": "passed"
});
});