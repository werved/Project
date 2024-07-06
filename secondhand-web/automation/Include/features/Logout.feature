@Logout
Feature: Logout
  As a user, I want to logout from Swag Labs web.

  #Background: 
    #Given User open "https://www.saucedemo.com/"
    #When User input registered username "standard_user"
    #And User input registered password "secret_sauce"
    #And User click on LOGIN button
    #Then User see "Products" page

  @LGO001
  Scenario: LGO001 - User want to logout
    When User click burger menu
    And User click on Logout
    Then User redirected to Sauce Demo homepage
