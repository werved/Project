Feature: Delete_Produk

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

@web @dp001 @pos
Scenario: Memastikan produk dapat dihapus langsung setelah produk di create
    When Klik tombol Delete
    Then Produk berhasil dihapus
    And diarahkan ke halaman Daftar Jual Saya

@web @dp002 @pos
Scenario: Memastikan produk dapat dihapus dari halaman halaman Daftar Jual Saya - Semua Produk
Given User berada di halaman "Bulan Ramadhan Banyak diskon!"
    When Klik navigation link "Products"
    And klik tombol Semua Produk
    And Klik "Motor"
    Then Diarahkan ke halaman detail produk
    When Klik tombol Delete
    Then Produk berhasil dihapus
    And diarahkan ke halaman Daftar Jual Saya