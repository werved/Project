@Daftar
Feature: Daftar
  Saya ingin daftar di SecondHand web.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_up"

  @Dfr01 @Positif
  Scenario: Daftar dengan credential yang valid
    When Masukan Name "tes1" 
    And Input Email "tes1@example.com" 
    And Input Password "123456"
    And Klik tombol "Daftar" 
    Then Melihat halaman "Telusuri Kategori" 
