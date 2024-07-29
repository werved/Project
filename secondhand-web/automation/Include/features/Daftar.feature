@Daftar
Feature: Daftar
  Saya ingin daftar di SecondHand web.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_up"

  @Dfr01 @Positif
  Scenario: Daftar dengan credential yang valid
    When Masukan Name Daftar "tes29" 
    And Input Email Daftar "tes2907.3@example.com" 
    And Input Password Daftar "123456"
    And Klik tombol Daftar "Daftar" 
    Then Melihat halaman setelah daftar "Telusuri Kategori" 
