@Keluar
Feature: Keluar

Background:
Given User membuka aplikasi SecondHand
When User klik "Masuk"
And User memasukkan "tes@example.com" pada bidang "Email"
And User memasukkan "password" pada bidang "Password"
And User klik "Masuk"
Then Menampilkan halaman dashboard

@K01 @Positif
Scenario: Logout dari akun yang ada
When Klik icon "Akun"
And Klik "Keluar"
Then Menampilkan halaman login