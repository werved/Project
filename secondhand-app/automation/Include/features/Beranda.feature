@Beranda
Feature: Beranda

Background:
Given User membuka aplikasi SecondHand
When User klik tombol "Masuk"
And User memasukkan "tes@example.com" pada bidang "Email"
And User memasukkan "password" pada bidang "Password"
And User klik tombol "Masuk"
Then Menampilkan halaman dashboard

@B001 @Positif
Scenario: Menampilkan produk selanjutnya
When Scroll halaman ke bawah
Then Menampilkan produk selanjutnya