@Keluar
Feature: Keluar
  Saya ingin keluar dari web secondhand

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    When User memasukkan Email yang sudah register "tes1@example.com" 
    And User memasukkan Password yang sudah register "123456"
    And User klik tombol "Masuk" 
    Then User melihat halaman "Telusuri Kategori" 

  @Lg01 @Positif
  Scenario: User ingin keluar dari web
    When Klik icon profile
    And Klik tombol "Keluar" 
    Then Melihat halaman "Telusuri Kategori" 