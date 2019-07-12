$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/Amazon/Features/Add.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To add the cart in amazon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "i want to click the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Product.i_want_to_click_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i want to search apple watches and click it",
  "keyword": "And "
});
formatter.match({
  "location": "Product.i_want_to_search_apple_watches_and_click_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i want search some watches",
  "keyword": "When "
});
formatter.match({
  "location": "Product.i_want_search_some_watches()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to add the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Product.to_add_the_cart()"
});
formatter.result({
  "status": "passed"
});
});