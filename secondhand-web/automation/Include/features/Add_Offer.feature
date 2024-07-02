Feature: Add_Offer

Background:
Given Buka "https://secondhand.binaracademy.org/"
    When Klik tombol Masuk
    And Diarakan ke halaman "Belum punya akun"
    When Masukkan Email "login@penjual.com"
    And Masukkan Password "penjual"
    And Klik tombol Masuk
    Then Diarahkan ke halaman "Bulan Ramadhan Banyak diskon!"
    #login sebagai penjual

    When Klik tombol Jual
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "Kendaraan"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol Terbitkan
    Then Produk berhasil diterbitkan
    #penjual create produk

    #
    #logout penjual


    When Klik tombol Masuk
    And Diarakan ke halaman "Belum punya akun"
    When Masukkan Email "login@pembeli.com"
    And Masukkan Password "pembeli"
    And Klik tombol Masuk
    Then Diarahkan ke halaman "Bulan Ramadhan Banyak diskon!"
    #login sebagai pembeli

@web @ao001 @pos
Scenario: Memastikan pembeli dapat melakukan tawar harga produk dari Search 
    When Klik kolom Search "Cari di sini ..."
    And ketik "Motor"
    And press Enter key
    Then Diarahkan ke halaman Produk List "Motor"
    When Klik card produk bernama "Motor"
    Then Diarahkan ke halaman preview produk
    When Klik tombol Saya tertarik dan ingin nego
    Then Diarahkan ke halaman Masukkan Harga Tawarmu
    When Input data Field Harga Tawar "900000"
    And Klik tombol Kirim
    Then Produk berhasil di nego
    And tombol Saya tertarik dan ingin nego berubah menjadi disabled "Menunggu respon penjual"
