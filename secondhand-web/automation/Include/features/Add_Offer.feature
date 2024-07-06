@Add_Offer
Feature: Add_Offer

  Background: 
    Given Buka "https://secondhand.binaracademy.org/users/sign_in"
    When Buyer masukkan Email "login@pembeli.com"
    And Buyer masukkan Password "pembeli"
    And Buyer klik tombol "Masuk"
    Then Buyer diarahkan ke halaman "Telusuri Kategori"
		#login sebagai pembeli
		
	@Ao001 @Positif
  Scenario: Memastikan pembeli dapat melakukan tawar harga produk dari Search
    When Klik kolom Search "Cari di sini ..."
    And ketik "Motor"
    And press Enter key
    Then Diarahkan ke halaman Produk List "Motor"
    When Klik card produk bernama "Motor"
    Then Diarahkan ke halaman preview produk
    When Klik tombol "Saya tertarik dan ingin nego"
    Then Diarahkan ke halaman Masukkan Harga Tawarmu
    When Input data Field Harga Tawar "900000"
    And Klik tombol "Kirim"
    Then Produk berhasil di nego
    And tombol Saya tertarik dan ingin nego berubah menjadi disabled "Menunggu respon penjual"
