@Update_Penawaran
Feature: Update Penawaran
Agar penawaran dapat diupdate

Background: 
    Given Seller sudah login
    When Seller membuka halaman "Daftar Jual Saya"
    And Seller membuka submenu "Diminati"
    Then Seller melihat daftar produk

@Upd001 @Positif
Scenario: Terima produk
    When Klik produk dengan status "Penawaran produk"
    And Berhasil menampilkan halaman "Info Penawar"
    And Klik "Terima"
    Then Status produk berubah menjadi "Penawaran produk diterima"
    When Klik "Status"
    And Klik "Berhasil Terjual"
    And Klik "Kirim"
    Then Status produk berubah menjadi "Berhasil terjual"
    
@Upd002 @Positif
Scenario: Tolak produk
    When Klik produk dengan status "Penawaran produk"
    And Berhasil menampilkan halaman "Info Penawar"
    And Klik "Tolak"
    Then Status produk berubah menjadi "Penawaran produk ditolak"
    When Klik "Status"
    And Klik "Batalkan Transaksi"
    And Klik "Kirim"
    Then Status produk berubah menjadi "Penjualan dibatalkan"