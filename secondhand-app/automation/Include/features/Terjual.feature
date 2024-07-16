@Terjual
Feature: Terjual
    Sebagai User dapat melihat produk yang telah terjual

Background:
    Given Membuka aplikasi "Secondhand"
    Given Buka halaman "Masuk" ke dalam aplikasi
    Given Buka halaman "Akun Saya"

@Trjl01 @Positif
Scenario: Memastikan User dapat melihat produk yang terjual
    When Klik menu "Daftar Jual Saya"
    And Klik menu "Terjual"
    Then Ditampilkan list produk terjual