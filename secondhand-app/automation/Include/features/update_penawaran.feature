@update_penawaran
Feature: Update penawaran
Agar penawaran dapat diupdate

Background: 
    Given Seller sudah login
    When Seller membuka halaman "Daftar Jual Saya"
    And Seller membuka submenu "Diminati"
    Then Seller melihat daftar produk

@upd001 @positive
Scenario: Terima produk
    When Seller klik produk dengan status "Penawaran produk"
    And berhasil menampilkan halaman "Info Penawar"
    And Seller klik "Terima"
    Then status produk berubah menjadi "Penawaran produk diterima"
    When Seller klik "Status"
    And Seller klik "Berhasil Terjual"
    And Seller klik "Kirim"
    Then status produk berubah menjadi "Berhasil terjual"
    
@upd002 @positive
Scenario: Tolak produk
    When Seller klik produk dengan status "Penawaran produk"
    And berhasil menampilkan halaman "Info Penawar"
    And Seller klik "Tolak"
    Then status produk berubah menjadi "Penawaran produk ditolak"
    When Seller klik "Status"
    And Seller klik "Batalkan Transaksi"
    And Seller klik "Kirim"
    Then status produk berubah menjadi "Penjualan dibatalkan"