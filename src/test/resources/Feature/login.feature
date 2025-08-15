Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://www.saucedemo.com/"
    And User enters Email as "standard_user" and Password as "secret_sauce"
    And Click on Login
    And close browser



 