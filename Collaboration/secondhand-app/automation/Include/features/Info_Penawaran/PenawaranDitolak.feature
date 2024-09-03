@Penawaran_Ditolak
Feature: Penawaran_Ditolak
    Memastikan penjual bisa menolak penawaran dari pembeli


Background:
    Given Membuka aplikasi "Secondhand"
    Given Buka halaman "Masuk" ke dalam aplikasi
    Given Buka halaman "Akun Saya"
    Given Buka halaman "Daftar Jual Saya"
    Given Buka halaman "Diminati"
    

@Pnwrd01 @Positif
Scenario: Pembeli dapat melihat produk yang sudah ditolak
    When Klik menu Diminati
    And Klik list Nama Produk di halaman Produk yang Ditawar
    Then Tampil list Produk yang Berhasil Ditawar
    And Tampil pesan "Ditolak Rp.200.000"