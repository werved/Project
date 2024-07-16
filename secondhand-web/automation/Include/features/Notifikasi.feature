@Notifikasi
Feature: Notifikasi
    User dapat melihat notifikasi yang masuk

Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    When User memasukkan Email yang sudah register "tes1@example.com" 
    And User memasukkan Password yang sudah register "123456"
    And User klik tombol "Masuk" 
    Then User melihat halaman "Telusuri Kategori" 

@Nksi01 @Positif
Scenario: Check Notifikasi masuk
    When Klik icon notifikasi
    Then User melihat list notifikasi