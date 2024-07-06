@Status_Offer
Feature: Status_Offer

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Seller masukkan Email "login@penjual.com"
    And Seller masukkan Password "penjual"
    And Seller klik tombol Masuk
    Then Seller diarahkan ke halaman "Telusuri Kategori"
		#login sebagai penjual
  
  @So001 @Positif
  Scenario: Memastikan penjual dapat konfirmasi penjualan berhasil
    When Klik tombol "Status"
    Then Diarahkan Ke "Perbarui status penjualan produkmu"
    When Klik form check "Berhasil terjual"
    And Klik tombol "Kirim"
    Then Produk berhasil terjual
    And Diarahkan ke halaman "Info Penawar"
    And Status produk menjadi "Berhasil terjual"

  @So002 @Positif
  Scenario: Memastikan penjual dapat membatalkan transaksi yang sedang berjalan
    When Klik tombol "Status"
    Then Diarahkan Ke "Perbarui status penjualan produkmu"
    When Klik form check "Batalkan Transaksi"
    And Klik tombol "Kirim"
    Then Transaksi produk berhasil dibatalkan
    And Diarahkan ke halaman "Info Penawar"
    And Status produk menjadi "Penjualan dibatalkan"
