@Terjual
Feature: Terjual

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Seller masukkan Email "login@penjual.com"
    And Seller masukkan Password "penjual"
    And Seller klik tombol Masuk
    Then Seller diarahkan ke halaman "Telusuri Kategori"
		#login sebagai penjual
		
  @Tjl001 @Positif
  Scenario: Memastikan penjual dapat melihat produk yang berhasil terjual
    When Seller klik navigation link "Products"
    Then Diarahkan ke halaman daftar jual saya seller "Daftar Jual Saya" 
    When Klik terjual "Terjual"
    Then Berhasil menampilkan card produk yang berhasil terjual
