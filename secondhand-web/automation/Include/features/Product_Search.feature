@Product_Search
Feature: Product_Search

@Ps001 @Positif
Scenario: Memastikan user dapat mencari produk
    When Buka "https://secondhand.binaracademy.org/"
    And Klik kolom Search "Cari di sini ..."
    And Ketik "Motor"
    And Tekan Enter key 
    Then Produk berhasil ditemukan
    And Diarahkan ke halaman Produk List "Motor"