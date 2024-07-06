@Edit_Profile
Feature: Edit_Profile
  Saya ingin memperbaharui profile

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    When User memasukkan Email yang sudah register "tes1@example.com" 
    And User memasukkan Password yang sudah register "123456"
    And User klik tombol "Masuk" 
    Then User melihat halaman "Telusuri Kategori" 

  @Ep01 @Positif 
  Scenario: Edit data profile
    When Klik icon profile
    Then Klik nama akun
    And Upload foto
    And Input Nama "tesedit" 
    And Input Kota "Jogja" 
    And Input Alamat "JL. Edit" 
    And Input No Handphone "01223344556" 
    And Klik tombol "Simpan" 
    Then Melihat halaman "Telusuri Kategori" 