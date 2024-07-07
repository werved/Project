@Masuk
Feature: Masuk
  Saya ingin masuk di SecondHand web.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in"

  @Msk01 @Positif
  Scenario: User ingin login dengan credential yang benar
    When Memasukkan Email yang sudah register "tes1@example.com"
    And Memasukkan Password yang sudah register "123456"
    And Klik tombol "Masuk"
    Then Melihat halaman "Telusuri Kategori" 


  @Msk02 @Negatif
  Scenario Outline: User ingin login dengan credential yang tidak benar
    When Memasukkan Email yang tidak benar "<email>" 
    And Memasukkan Password yang tidak benar "<password>" 
    And Klik tombol "Masuk" 
    Then Disana menampilkan pesan "<error>" 

    Examples: 
      | email      					| password     | error                      |
      | tes1.@example.com   | 123456       | Invalid Email or password. |
      | tes1@example.com    | 123456789    | Invalid Email or password. |
