@checkout
Feature: Checkout

  Background: 
    ## Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://www.saucedemo.com/"
    And User enters Email as "standard_user" and Password as "secret_sauce"
    And Click on Login
    And close browser

  ### After Feature add Background: Keyword and dont use Scenario keyword
  Scenario: User will Checkout some items
    Given Add Item in Cart
    Then Click on Cart Butto
    Then Click on Chekout Button
    Then Enter personal imformation
    Then Click on Continue Button
    Then Click on Finish Button
