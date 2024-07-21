@Update_Offer
Feature: Update_Offer

		

  @Uo001 @Positif
  Scenario: Memastikan penjual dapat menerima produk yang ditawar
    #When Klik icon Notification
    #And Klik status "Penawaran produk"
    #Then Diarahkan ke halaman "Info Penawar"
    #sudah dijalankan pada runner KlikPenawaranProduk @Nksi02
    When Klik tombol Terima
    Then Penawaran produk berhasil diterima

  @Uo002 @Positif
  Scenario: Memastikan penjual dapat menolak produk yang ditawar
    #When Klik icon Notification
    #And Klik status "Penawaran produk"
    #Then Diarahkan ke halaman "Info Penawar"
    #sudah dijalankan pada runner KlikPenawaranProduk @Nksi02
    When Klik tombol Tolak
    Then Penawaran produk berhasil ditolak
