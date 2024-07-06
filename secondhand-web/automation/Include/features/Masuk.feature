@Masuk
Feature: Masuk
  Saya ingin masuk di SecondHand web.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in"
    
  @MSK001 @Positive
  Scenario: User ingin login dengan credential yang benar
   When User memasukkan Email yang sudah register "tes1@example.com"
    And User memasukkan Password yang sudah register "123456"
    And User klik tombol "Masuk"
    Then User melihat "Telusuri Kategori" halaman


  @MSK002 @Negative
  Scenario Outline: User ingin login dengan credential yang tidak benar
    When User memasukkan Email yang tidak benar "<email>"
    And User memasukkan Password yang tidak benar "<password>"
    And User klik tombol "Masuk"
    Then Disana menampilkan pesan "<error>" 

    Examples: 
      | email      					| password     | error                      |
      | tes1.@example.com   | 123456       | Invalid Email or password. |
      | tes1@example.com    | 123456789    | Invalid Email or password. |
