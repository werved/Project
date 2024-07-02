Feature: Update_Offer

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

    When Klik kolom Search "Cari di sini ..."
    And ketik "Motor"
    Then Diarahkan ke halaman Produk List "Motor"
    When Klik card produk bernama "Motor"
    Then Diarahkan ke halaman preview produk
    When Klik tombol Saya tertarik dan ingin nego
    Then Diarahkan ke halaman Masukkan Harga Tawarmu
    When Input data Field Harga Tawar "900000"
    And Klik tombol Kirim
    Then Produk berhasil di nego
    And tombol Saya tertarik dan ingin nego berubah menjadi disabled "Menunggu respon penjual"
    #pembeli create offer

    #
    #logout pembeli

    When Klik tombol Masuk
    And Diarakan ke halaman "Belum punya akun"
    When Masukkan Email "login@penjual.com"
    And Masukkan Password "penjual"
    And Klik tombol Masuk
    Then Diarahkan ke halaman "Bulan Ramadhan Banyak diskon!"
    #login sebagai penjual


@web @uo001 @pos
Scenario: Memastikan penjual dapat melihat produk yang ditawar
    When Klik tombol Notification
    Then Menapilkan list dropdown Notification
    When Klik "Penawaran Produk"
    Then Diarahkan ke halaman "Info Penawar"
    And Terdapat text "Daftar Produkmu yang Ditawar"
    And Terdapat tombol Tolak
    And Terdapat tombol terima


@web @uo002 @pos
Scenario: Memastikan penjual dapat menerima produk yang ditawar
    When Klik tombol Notification
    Then Menapilkan list dropdown Notification
    When Klik "Penawaran Produk"
    Then Diarahkan ke halaman "Info Penawar"
    And Terdapat text "Daftar Produkmu yang Ditawar"
    When Klik tombol Terima
    Then Penawaran produk berhasil diterima
    And Terdapat Tombol Status
    And Terdapat tombol Hubungi di


@web @uo003 @pos
Scenario: Memastikan penjual dapat menolak produk yang ditawar
    When Klik tombol Notification
    Then Menapilkan list dropdown Notification
    When Klik "Penawaran Produk"
    Then Diarahkan ke halaman "Info Penawar"
    And Terdapat text "Daftar Produkmu yang Ditawar"
    When Klik tombol Tolak
    Then Penawaran produk berhasil ditolak