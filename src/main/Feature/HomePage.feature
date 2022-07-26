Feature: HomePage
@Test
  Scenario: User should be able to add Cucumber to cart
    Given : User should be able to launch browser
    Then : User should be able to Brocolli to cart
    And : Validate Brocolli and Cucumber is added to cart


  @Smoke
  Scenario: User Should be able to proceed to checkout
    Given : User should be able to launch browser
    Then : User should be able to Brocolli to cart
    Then : Validate Brocolli and Cucumber is added to cart
    And : User should be able to proceed to check out

  @Regression2
  Scenario: User should be able to sort Web table
    Given : User should be able to launch browser
    Then : User should be able to click on Top Deals
    Then : User should be able to sort Vegetable
    And : Validate Vegetable is Alphabetically sort

  @Testcase4
  Scenario Outline:Verify Almond is added to Webtable
    Given : User should be able to launch browser
    Then : User should be able to click on Top Deals
    Then : Validate "<UpdtedProductlist>" is added to Webtable

    Examples:
      |UpdtedProductlist|
      |Wheat|





