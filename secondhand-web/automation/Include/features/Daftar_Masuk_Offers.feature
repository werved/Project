@Daftar_Masuk_Offres
Feature: Daftar MAsuk Offers
  Saya ingin daftar masuk offers di SecondHand web.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_up"

  #untuk seller
  @Dmo01 @Dftsel 
  Scenario: Daftar dengan credential yang valid
    When Masukan Name Daftar "tes29" 
    And Input Email Daftar "tes2907.3@example.com" 
    And Input Password Daftar "123456"
    And Klik tombol Daftar "Daftar" 
    Then Melihat halaman setelah daftar "Telusuri Kategori" 
    
  #untuk pembeli
  @Dmo02 @Dftpem
  Scenario: Daftar dengan credential yang valid
    When Masukan Name Daftar "tes29" 
    And Input Email Daftar "tes2907.3@example.com" 
    And Input Password Daftar "123456"
    And Klik tombol Daftar "Daftar" 
    Then Melihat halaman setelah daftar "Telusuri Kategori" 
    
  #untuk seller
  @Dmo03 @Msksel
  Scenario: User ingin login dengan credential yang benar
    When Memasukkan Email yang sudah register "tes1@example.com"
    And Memasukkan Password yang sudah register "123456"
    And Klik tombol login "Masuk"
    Then Melihat halaman produk setelah login "Telusuri Kategori" 
    
  #untuk pembeli
  @Dmo04 @Mskpem
  Scenario: User ingin login dengan credential yang benar
    When Memasukkan Email yang sudah register "tes1@example.com"
    And Memasukkan Password yang sudah register "123456"
    And Klik tombol login "Masuk"
    Then Melihat halaman produk setelah login "Telusuri Kategori"
    
  @Dmo05 @Liaakn
  Scenario: Input data profile
    When Klik icon profile
    Then Klik nama akun
    And Upload foto
    And Input Nama "tes1" 
    And Input Kota "Solo" 
    And Input Alamat "JL. Bintang" 
    And Input No Handphone "08123456789" 
    And Klik tombol "Simpan"
    Then Melihat halaman produk setelah login "Telusuri Kategori"