@Beranda
Feature: Beranda

Background:
		Given User membuka aplikasi SecondHand
		When User klik tombol "Masuk"
		And User memasukkan "example@example.com" pada bidang "Email"
		And User memasukkan "123456" pada bidang "Password"
		And User klik tombol "Masuk"
		Then Menampilkan halaman "Akun Saya"

	@B001 @Positif
	Scenario: Menampilkan produk selanjutnya
		When Scroll halaman ke bawah
		Then Menampilkan produk selanjutnya