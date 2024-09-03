@Diminati
Feature: Diminati

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Seller masukkan Email "login@penjual.com"
    And Seller masukkan Password "penjual"
    And Seller klik tombol Masuk
    Then Seller diarahkan ke halaman "Telusuri Kategori"
		#login sebagai penjual
		
  @Dmt001 @Positif
  Scenario: Memastikan penjual dapat melihat produk yang diminati
    When Klik navigation link "Products"
    Then Diarahkan ke halaman "Daftar Jual Saya"
    When Klik "Diminati"
    Then Berhasil menampilkan card produk yang diminati
