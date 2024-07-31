@Terjual
Feature: Terjual
    Sebagai User dapat melihat produk yang telah terjual

Background:
    #Given User buka aplikasi "Secondhand"
    #Given User buka halaman "Masuk" ke dalam aplikasi
    Given User tap navbar icon Akun

@Trjl001 @Positif
Scenario: Memastikan User dapat melihat produk yang terjual
    When Klik menu Daftar Jual Saya
    And Klik tab "Terjual"
    Then Ditampilkan list produk terjual