@Diminati
Feature: Diminati
    Sebagai User dapat melihat, menerima, dan menolak penawaran dari buyer

Background:
    Given Membuka aplikasi "Secondhand"
    Given Buka halaman "Masuk" ke dalam aplikasi
    Given Buka halaman "Akun Saya"

@Mnt01 @Positif
Scenario: User dapat melihat produk yang diminati
    When Klik menu "Daftar Jual Saya"
    And Klik menu "Diminati"
    Then Ditampilkan list produk yang ditawar oleh buyer