@Diminati
Feature: Diminati
    Sebagai User dapat melihat, menerima, dan menolak penawaran dari buyer

Background:
    #Given User membuka aplikasi "Secondhand"
    #Given User buka halaman "Masuk" ke dalam aplikasi
    Given User tap navbar icon Akun

@Mnt001 @Positif
Scenario: User dapat melihat produk yang diminati
    When Klik menu Daftar Jual Saya
    And Klik tab "Diminati"
    Then Ditampilkan list produk yang ditawar oleh buyer