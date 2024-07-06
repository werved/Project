@Edit_Produk
Feature: Edit_Produk

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Seller masukkan Email "login@penjual.com"
    And Seller masukkan Password "penjual"
    And Seller klik tombol Masuk
    Then Seller diarahkan ke halaman "Telusuri Kategori"
		#login sebagai penjual
		
		
  @Ep001 @Positif
  Scenario Outline: Memastikan data produk dapat di edit langsung setelah produk di create
    When Klik tombol "Edit"
    Then Diarahkan ke halaman "Terbitkan"
    When Ubah data Field Nama Produk menjadi "<namaproduk>"
    And Ubah data Field Harga Produk menjadi "<hargaproduk>"
    And Ubah Kategori menjadi "<kategoriproduk>"
    And Ubah data Field Deskripsi "<deskripsiproduk>"
    And Ubah gambar dari penyimpanan pribadi
    And Klik tombol "Terbitkan"
    Then Produk yang sudah di ubah berhasil diterbitkan

  @Ep002 @Positif
  Scenario Outline: Memastikan data produk dapat di edit dari halaman Daftar Jual Saya - Semua Produk
    Given User berada di halaman "Telusuri Kategori"
    When Klik navigation link "Products"
    And klik tombol "Semua Produk"
    And Klik "Motor"
    Then Diarahkan ke halaman detail produk
    When klik tombol Edit
    Then Diarahkan ke halaman "Terbitkan"
    When Ubah data Field Nama Produk menjadi "<namaproduk>"
    And Ubah data Field Harga Produk menjadi "<hargaproduk>"
    And Ubah Kategori menjadi "<kategoriproduk>"
    And Ubah data Field Deskripsi "<deskripsiproduk>"
    And Ubah gambar dari penyimpanan pribadi
    And Klik tombol "Terbitkan"
    Then Produk yang sudah di ubah berhasil diterbitkan

    Examples: 
      | namaproduk   | hargaproduk | kategoriproduk | deskripsiproduk |
      | Motor Harley |     1000000 | Kendaraan      | Ini motor seken |
      | Motor        |     2000000 | Kendaraan      | Ini motor seken |
      | Motor        |     1000000 | Hobi           | Ini motor seken |
      | Motor        |     1000000 | Kendaraan      | Ini motor baru  |
      | Motor        |     1000000 | Kendaraan      | Ini motor seken |
