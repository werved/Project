@Update_Offer
Feature: Update_Offer

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Seller masukkan Email "login@penjual.com"
    And Seller masukkan Password "penjual"
    And Seller klik tombol Masuk
    Then Seller diarahkan ke halaman "Telusuri Kategori"
		#login sebagai penjual
		
  @Uo001 @Positif
  Scenario: Memastikan penjual dapat melihat produk yang ditawar
    When Klik tombol "Notification"
    Then Menampilkan list dropdown Notification
    When Klik "Penawaran Produk"
    Then Diarahkan ke halaman "Info Penawar"
    And Terdapat text "Daftar Produkmu yang Ditawar"
    And Terdapat tombol "Tolak"
    And Terdapat tombol "terima"

  @Uo002 @Positif
  Scenario: Memastikan penjual dapat menerima produk yang ditawar
    When Klik tombol "Notification"
    Then Menampilkan list dropdown Notification
    When Klik "Penawaran Produk"
    Then Diarahkan ke halaman "Info Penawar"
    And Terdapat text "Daftar Produkmu yang Ditawar"
    When Klik tombol "Terima"
    Then Penawaran produk berhasil diterima
    And Terdapat Tombol "Status"
    And Terdapat tombol "Hubungi di"

  @Uo003 @Positif
  Scenario: Memastikan penjual dapat menolak produk yang ditawar
    When Klik tombol "Notification"
    Then Menampilkan list dropdown Notification
    When Klik "Penawaran Produk"
    Then Diarahkan ke halaman "Info Penawar"
    And Terdapat text "Daftar Produkmu yang Ditawar"
    When Klik tombol "Tolak"
    Then Penawaran produk berhasil ditolak
