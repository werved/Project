@Telusuri_Kategori
Feature: Telusuri Kategori
  Saya ingin dapat menelusuri berbagai kategori produk.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    When User memasukkan Email yang sudah register "tes1@example.com" 
    And User memasukkan Password yang sudah register "123456" 
    And User klik tombol "Masuk" 
    Then User melihat halaman "Telusuri Kategori" 
    
  @Tk01 @Positif
  Scenario Outline: Filter produk sesuai dengan jenis kategori
    When Klik tombol kategori "<kategori>" 
    Then Lihat produk yang sudah di filter

     Examples:
      | kategori   |
      | Semua 		 |
      | Hobi       |
      | Kendaraan  |
      | Baju       |
      | Elektronik |
