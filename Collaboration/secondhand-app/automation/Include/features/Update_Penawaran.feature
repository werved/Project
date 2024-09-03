@Update_Penawaran
Feature: Update Penawaran
Agar penawaran dapat diupdate

Background: 
    #Given Seller sudah login
    #When Seller membuka halaman "Daftar Jual Saya"
    #And Seller membuka submenu "Diminati"
    #Then Seller melihat daftar produk

@Upd001 @Positif
Scenario: Terima produk
    When Klik produk dengan status "Penawaran produk"
    And Berhasil menampilkan halaman "Info Penawar"
    And Klik tombol Terima
    Then Muncul Bottom Sheets "Yeay kamu berhasil mendapat harga yang sesuai"
    When Tutup Bottom Sheets
    And Klik tombol Status
    And Klik tombol Berhasil Terjual
    And Klik tombol Kirim
    Then Status produk berubah menjadi "Berhasil terjual"
    
@Upd002 @Positif
Scenario: Tolak produk
    When Klik produk dengan status "Penawaran produk"
    And Berhasil menampilkan halaman "Info Penawar"
    And Klik tombol Tolak
    Then Status produk berubah menjadi "Penawaran ditolak"
    #When Klik tombol Status
    #And Klik tombol Batalkan Transaksi
    #And Klik tombol Kirim
    #Then Status produk berubah menjadi "Penjualan dibatalkan"