@Lengkapi_Info_Akun
Feature: Lengkapi_Info_Akun
  Saya ingin memperbaharui profile

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    When User memasukkan Email yang sudah register "tes1@example.com" 
    And User memasukkan Password yang sudah register "123456"
    And User klik tombol "Masuk" 
    Then User melihat halaman "Telusuri Kategori" 

  @TK001 @Positive
  Scenario Outline: Input data profile
    When User klik icon profile
    Then User klik nama akun
    And User upload foto
    And User mengisi "<nama>" 
    And User mengisi "<kota>" 
    And User mengisi "<alamat>" 
    And User mengisi "<no_handphone>" 
    And User klik tombol "Simpan"
    Then User melihat halaman "Telusuri Kategori" 
    
    Examples: 
      | nama   | kota  | alamat         | no_handphone |
      | tes1   | Solo  | JL. Bintang    | 08123456789  |
    