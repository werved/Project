@Notifikasi
Feature: Notifikasi

Background:
Given User buka aplikasi SecondHand
When User klik "Masuk"
And User masukkan "tes@example.com" pada bidang "Email"
And User masukkan "password" pada bidang "Password"
And User klik "Masuk"
Then Menampilkan halaman dashboard

@N01 @positif
Scenario: Lihat list "Notifikasi" 
When Klik icon "Notifikasi"
And Lihat pada halaman menu
Then Menampilkan list produk yang diterbitkan dan ditawar