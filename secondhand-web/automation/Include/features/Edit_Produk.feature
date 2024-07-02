Feature: Edit_Produk

Background:
Given Buka "https://secondhand.binaracademy.org/"
    When Klik tombol Masuk
    And Diarakan ke halaman "Belum punya akun"
    When Masukkan Email "login@penjual.com"
    And Masukkan Password "penjual"
    And Klik tombol Masuk
    Then Diarahkan ke halaman "Bulan Ramadhan Banyak diskon!"
    #login sebagai penjual

    When Klik navigation link "Products"
    And klik tombol Semua Produk
    And klik tombol Tambah Produk
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "Kendaraan"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol Terbitkan
    Then Produk berhasil diterbitkan
    #penjual create produk


@web @ep001 @pos
Scenario Outline: Memastikan data produk dapat di edit langsung setelah produk di create
    When Klik tombol Edit
    Then Diarahkan ke halaman "Terbitkan"
    When Ubah data Field Nama Produk menjadi "<namaproduk>"
    And Ubah data Field Harga Produk menjadi "<hargaproduk>"
    And Ubah Kategori menjadi "<kategoriproduk>"
    And Ubah data Field Deskripsi "<deskripsiproduk>"
    And Ubah gambar dari penyimpanan pribadi
    And Klik tombol Terbitkan
    Then Produk yang sudah di ubah berhasil diterbitkan


@web @ep002 @pos
Scenario Outline: Memastikan data produk dapat di edit dari halaman Daftar Jual Saya - Semua Produk
Given User berada di halaman "Bulan Ramadhan Banyak diskon!"
    When Klik navigation link "Products"
    And klik tombol Semua Produk
    And Klik "Motor"
    Then Diarahkan ke halaman detail produk
    When klik tombol Edit
    Then Diarahkan ke halaman "Terbitkan"
    When Ubah data Field Nama Produk menjadi "<namaproduk>"
    And Ubah data Field Harga Produk menjadi "<hargaproduk>"
    And Ubah Kategori menjadi "<kategoriproduk>"
    And Ubah data Field Deskripsi "<deskripsiproduk>"
    And Ubah gambar dari penyimpanan pribadi
    And Klik tombol Terbitkan
    Then Produk yang sudah di ubah berhasil diterbitkan


    Examples:
        | namaproduk   | hargaproduk | kategoriproduk | deskripsiproduk |
        | Motor Harley | 1000000     | Kendaraan      | Ini motor seken |
        | Motor        | 2000000     | Kendaraan      | Ini motor seken |
        | Motor        | 1000000     | Hobi           | Ini motor seken |
        | Motor        | 1000000     | Kendaraan      | Ini motor baru  |
        | Motor        | 1000000     | Kendaraan      | Ini motor seken |
