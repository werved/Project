@Telusuri_Kategori
Feature: Telusuri Kategori
  Saya ingin dapat menelusuri berbagai kategori produk.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    When User memasukkan Email yang sudah register "tes1@example.com"
    And User memasukkan Password yang sudah register "123456"
    And User klik tombol "Masuk"
    Then User melihat halaman "Telusuri Kategori" 
    
  @TK001 @Positive
  Scenario Outline: Filter produk sesuai dengan jenis kategori
    When User mengklik tombol kategori "<kategori>" 
    Then User melihat produk yang sudah di filter

     Examples:
      | kategori   |
      | Semua 		 |
      | Hobi       |
      | Kendaraan  |
      | Baju       |
      | Elektronik |
