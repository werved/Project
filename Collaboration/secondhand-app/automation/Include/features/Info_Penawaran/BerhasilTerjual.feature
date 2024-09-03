@Berhasil_Terjual

Feature: Berhasil_Terjual
    User dapat melihat produk yang sudah berhasil Berhasil_Terjual

Background:
    Given Membuka aplikasi "Secondhand"
    Given Buka halaman "Masuk" ke dalam aplikasi
    Given Buka halaman "Akun Saya"
    Given Buka halaman "Daftar Jual Saya"
    Given Buka halaman "Diminati"
    Given Produk sudah Berhasil Terjual

@Btjl01 @Positif
Scenario: User dapat melihat produk yang sudah berhasil dijual ke pembeli
    When Klik menu Diminati
    And Klik list Nama Produk di halaman Produk yang Ditawar
    Then Tampil list Produk yang Berhasil Ditawar