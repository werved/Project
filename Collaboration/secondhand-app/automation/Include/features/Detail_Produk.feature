@Detail_Produk
Feature: Detail_Produk

Background:
    Given User membuka aplikasi SecondHand
 		When Klik icon "Akun"
    Then Buka halaman "Akun Saya"
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman login "Masuk"
    And Input Email terdaftar "sama@example.com" 
    And Input Password terdaftar "asdfgh" 
    And Klik tombol "Masuk"
    Then Diarahkan ke halaman "Akun Saya"

@Dp001 @Positif
	Scenario: Memastikan pembeli dapat melakukan tawar harga produk
	When Klik icon "Beranda" 
	And Cari produk yang ingin di tawar ""
	And Klik produk yang tampil
	And Klik penawaran "Saya Tertarik dan Ingin Nego" 
	And Menampilkan modal input harga "Masukkan Harga Tawarmu" 
	And Input harga tawar yang diinginkan
	Then Klik "Kirim" harga tawar