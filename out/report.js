$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/cucumber/features/Buy New Product/buy-new-product.feature");
formatter.feature({
  "line": 1,
  "name": "User buys new product",
  "description": "",
  "id": "user-buys-new-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User buys new product, chooses shipping and payment method",
  "description": "",
  "id": "user-buys-new-product;user-buys-new-product,-chooses-shipping-and-payment-method",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab myshop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to ClothesPage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Hummingbird Printed Sweater",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User chooses size M and 5 items and clicks \u0027Add to cart\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks Proceed to Checkout and again Proceed to Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verifies/confirms the Address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User chooses PrestaShop shipping method",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User chooses Pay by Check payment method",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User checks required agreements and clicks Order with an obligation to pay",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User sees order confirmed message and creates PrtScr",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User closes browser",
  "keyword": "And "
});
formatter.match({
  "location": "BuyNewProduct.userIsLoggedInToCodersLabMyshop()"
});
formatter.result({
  "duration": 7651944900,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userGoesToClothesPage()"
});
formatter.result({
  "duration": 568326800,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userClicksOnHummingbirdPrintedSweater()"
});
formatter.result({
  "duration": 637930400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "BuyNewProduct.userChoosesSizeMAndItemsAndClicksAddToCart(int)"
});
formatter.result({
  "duration": 4468891300,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userClicksProceedToCheckoutAndAgainProceedToCheckout()"
});
formatter.result({
  "duration": 2968259100,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userVerifiesConfirmsTheAddress()"
});
formatter.result({
  "duration": 939268600,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userChoosesPrestaShopShippingMethod()"
});
formatter.result({
  "duration": 946086900,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userChoosesPayByCheckPaymentMethod()"
});
formatter.result({
  "duration": 76787400,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userChecksRequiredAgreementsAndClicksOrderWithAnObligationToPay()"
});
formatter.result({
  "duration": 995255400,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userSeesOrderConfirmedMessageAndCreatesPrtScr()"
});
formatter.result({
  "duration": 420170000,
  "status": "passed"
});
formatter.match({
  "location": "BuyNewProduct.userClosesBrowser()"
});
formatter.result({
  "duration": 803481600,
  "status": "passed"
});
});