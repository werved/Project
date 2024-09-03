@Create_Offer
Feature: Create Offer

  #runner yang dibutuhkan:
  #tambah Produk
  Background: 

  @Co001 @Positif
  Scenario: Memastikan pembeli dapat melakukan tawar harga produk dengan login sebagai buyer
    When Klik icon "Akun"
    Then Buka halaman "Akun Saya"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman login "Masuk"
    And Input Email terdaftar "login@pembeli.com"
    And Input Password terdaftar "pembeli"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Akun Saya"
    #login buyer
    
    When Tap Navbar Beranda
    And Tap Search field dengan mengetikkan "Binar VBackground"
    And Tap pada Produk "Binar VBackground"
    And Tap tombol Saya Tertarik dan Ingin Nego
    Then Diarahkan ke Modal "Masukkan Harga Tawaranmu"
    When input field harga tawar dengan "900000"
    And Tap tombol Kirim
    Then Produk berhasil ditawar dengan Notif "Harga tawarmu berhasil dikirim ke penjual"

  @Co002 @Positif
  Scenario: Memastikan pembeli dapat melakukan tawar harga produk tanpa perlu login
    When Tap Navbar Beranda
    And Tap Search field dengan mengetikkan "Binar VBackground"
    And Tap pada Produk "Binar VBackground"
    And Tap tombol Saya Tertarik dan Ingin Nego
    Then Diarahkan ke Modal "Masukkan Harga Tawaranmu"
    When input field harga tawar dengan "900000"
    And Tap tombol Kirim
    Then Produk berhasil ditawar dengan Notif "Harga tawarmu berhasil dikirim ke penjual"
