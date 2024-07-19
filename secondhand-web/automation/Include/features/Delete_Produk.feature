@Delete_Produk
Feature: Delete_Produk

		
  #@Dp001 @Positif
  #Scenario: Memastikan produk dapat dihapus langsung setelah produk di create
    #When Klik tombol "Delete"
    #Then Produk berhasil dihapus
    #And diarahkan ke halaman Daftar Jual Saya

  @Dp002 @Positif
  Scenario: Memastikan produk dapat dihapus dari halaman halaman Daftar Jual Saya - Diminati
    When Klik navigation link Products
    And klik link Diminati
    And Klik product "Motor Badai"
    Then Diarahkan kehalaman detail produk
    When Klik tombol Delete
    Then Produk berhasil dihapus
