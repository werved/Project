@Info_Penawaran
Feature: Info_Penawaran
    Penjual dapat melihat barang yang ditawar oleh pembeli

Background:
    Given Membuka aplikasi "Secondhand"
    Given Buka halaman "Masuk" ke dalam aplikasi
    Given Buka halaman "Akun Saya"
    Given Buka halaman "Daftar Jual Saya"
    Given Buka halaman "Diminati"

@Ipwn01 @Positif
Scenario: User dapat melihat produk yang sudah ditawar oleh pembeli
    When Klik menu Diminati
    And Klik list Nama Produk
    Then Diarahkan ke halaman Info Penawar