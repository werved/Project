@Hubungi_WA

Feature: Hubungi_WA
    Pembeli dapat menghubungi pembeli yang melakukan penawaran produk yang dijual

Background:
    Given Membuka aplikasi "Secondhand"
    Given Buka halaman "Masuk" ke dalam aplikasi
    Given Buka halaman "Akun Saya"
    Given Buka halaman "Daftar Jual Saya"
    Given Buka halaman "Diminati"
    Given Produk sudah Berhasil Terjual

@Hbwa01 @Positif
Scenario: User dapat melihat produk yang sudah berhasil dijual ke pembeli
    When Klik menu Diminati
    And Klik list Nama Produk di halaman Produk yang Ditawar
    And Klik tombol Terima
    Then Tampil halaman Produk Cocok
    And Klik tombol Hubungi via Whatsapp
    Then Tampil aplikasi Whatsapp dengan chat ke nomor pembeli