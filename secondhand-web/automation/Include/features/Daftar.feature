@LDaftar
Feature: Daftar
  Saya ingin daftar di SecondHand web.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_up"
    
  @DFR001 @Positive
  Scenario: User daftar dengan credential yang valid
    When User input Name "tes1"
    And User input Email "tes1@example.com"
    And User input Password "123456"
    And User click on "Daftar" button
    Then User see "Telusuri Kategori" page
