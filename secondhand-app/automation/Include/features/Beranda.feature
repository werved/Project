@Beranda
Feature: Beranda

Background:
Given User membuka aplikasi SecondHand
When User klik "Masuk"
And User memasukkan "tes@example.com" pada bidang "Email"
And User memasukkan "password" pada bidang "Password"
And User klik "Masuk"
Then Menampilkan halaman dashboard

@T01 @Positif
Scenario: Logout dari akun yang ada
When Scroll halaman ke bawah
Then Menampilkan produk selanjutnya