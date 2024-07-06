@Lengkapi_Info_Akun
Feature: Lengkapi_Info_Akun
  Saya ingin memperbaharui profile

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    When User memasukkan Email yang sudah register "tes1@example.com" 
    And User memasukkan Password yang sudah register "123456"
    And User klik tombol "Masuk" 
    Then User melihat halaman "Telusuri Kategori" 

  @Lia01 @Positif
  Scenario: Input data profile
    When Klik icon profile
    Then Klik nama akun
    And Upload foto
    And Input Nama "tes1" 
    And Input Kota "Solo" 
    And Input Alamat "JL. Bintang" 
    And Input No Handphone "08123456789" 
    And Klik tombol "Simpan"
    Then Melihat halaman "Telusuri Kategori" 
    