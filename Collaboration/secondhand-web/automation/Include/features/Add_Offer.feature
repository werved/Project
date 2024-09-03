@Add_Offer
Feature: Add_Offer

  Background: 
    Given User membuka "https://secondhand.binaracademy.org/users/sign_in"
    When Memasukkan Email yang sudah register "login@pembeli.com"
    And Memasukkan Password yang sudah register "pembeli"
    And Klik tombol login "Masuk"
    Then Melihat halaman produk setelah login "Telusuri Kategori"
		#login sebagai pembeli
		
	@Ao001 @Positif
  Scenario: Memastikan pembeli dapat melakukan tawar harga produk dari Search
    When User Ketik "Motor Badai" pada kolom Search
    Then Diarahkan ke halaman Produk List "Motor"
    When Klik card produk bernama "Motor Badai"
    Then Diarahkan ke halaman preview produk
    When Klik tombol Saya tertarik dan ingin nego
    Then Diarahkan ke modal "Masukkan Harga Tawarmu"
    When Input data Field Harga Tawar "900000"
    And Klik tombol Kirim
    Then Produk berhasil di nego
    And Tombol Saya tertarik dan ingin nego berubah menjadi disabled "Menunggu respon penjual"
