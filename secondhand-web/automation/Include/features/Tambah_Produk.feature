@Tambah_Produk
Feature: Tambah_Produk

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Seller masukkan Email "login@penjual.com"
    And Seller masukkan Password "penjual"
    And Seller klik tombol Masuk
    Then Seller diarahkan ke halaman "Telusuri Kategori"
		#login sebagai penjual
  
  
  @Tp001 @Terbitkan @Positif
  Scenario: Memastikan produk dapat ditambahkan dari halaman Homapage
    When Klik tombol "Jual"
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "Kendaraan"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol "Terbitkan"
    Then Produk berhasil diterbitkan
    And Diarahkan kehalaman detail produk
    And Terdapat tombol "Edit"
    And Terdapat tombol "Hapus"

  @Djs @Tp002 @Terbitkan @Positif
  Scenario: Memastikan produk dapat ditambahkan dari halaman Daftar Jual Saya - Semua Produk
    When Klik navigation link "Products"
    And klik tombol "Semua Produk"
    And klik tombol "Tambah Produk"
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "Kendaraan"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol "Terbitkan"
    Then Produk berhasil diterbitkan
    And Diarahkan kehalaman detail produk
    And Terdapat tombol "Edit"
    And Terdapat tombol "Hapus"

  @Djs @Tp003 @preview @Positif
  Scenario: Memastikan produk dapat di preview sebelum di terbitkan
    When Klik navigation link "Products"
    And klik tombol "Semua Produk"
    And klik tombol "Tambah Produk"
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "Kendaraan"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol "Preview"
    Then Berhasil memunculkan preview produk
    And Diarahkan kehalaman detail produk
    And Terdapat tombol "Terbitkan"
    And Terdapat tombol "Edit"
    And Terdapat tombol "Hapus"

  @Djs @Tp004 @Negatif
  Scenario Outline: Memastikan tidak dapat upload produk tanpa isi field
    When Klik navigation link "Products"
    And klik tombol "Semua Produk"
    And klik tombol "Tambah Produk"
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "<namaproduk>"
    And Input data Field Harga Produk "<hargaproduk>"
    And Pilih Kategori "<kategoriproduk>"
    And Input data Field Deskripsi "<deskripsiproduk>"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol "Terbitkan"
    Then Menampilkan alert "<alert>"

    Examples: 
      | namaproduk | hargaproduk | kategoriproduk | deskripsiproduk | alert                      |
      |            |     1000000 | Kendaraan      | Ini motor seken | Name can't be blank        |
      | Motor      |             | Kendaraan      | Ini motor seken | Price can't be blank       |
      | Motor      |     1000000 | Pilih Kategori | Ini motor seken | Category must exist        |
      | Motor      |     1000000 | Kendaraan      |                 | Description can't be blank |
