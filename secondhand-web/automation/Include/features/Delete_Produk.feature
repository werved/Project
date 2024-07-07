@Delete_Produk
Feature: Delete_Produk

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Seller masukkan Email "login@penjual.com"
    And Seller masukkan Password "penjual"
    And Seller klik tombol Masuk
    Then Seller diarahkan ke halaman "Telusuri Kategori"
		#login sebagai penjual
		
		
  @Dp001 @Positif
  Scenario: Memastikan produk dapat dihapus langsung setelah produk di create
    When Klik tombol "Delete"
    Then Produk berhasil dihapus
    And diarahkan ke halaman Daftar Jual Saya

  @Dp002 @Positif
  Scenario: Memastikan produk dapat dihapus dari halaman halaman Daftar Jual Saya - Semua Produk
    Given User berada di halaman "Telusuri Kategori"
    When Klik navigation link "Products"
    And klik tombol Semua Produk
    And Klik "Motor"
    Then Diarahkan ke halaman detail produk
    When Klik tombol "Delete"
    Then Produk berhasil dihapus
    And diarahkan ke halaman Daftar Jual Saya
