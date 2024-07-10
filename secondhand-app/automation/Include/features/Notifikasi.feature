@Notifikasi
Feature: Notifikasi

Background:
Given User buka aplikasi SecondHand
When User klik tombol "Masuk"
And User masukkan "tes@example.com" pada bidang "Email"
And User masukkan "password" pada bidang "Password"
And User klik tombol "Masuk"
Then Menampilkan halaman dashboard

@N001 @Positif
Scenario: Lihat list "Notifikasi" 
When Klik icon "Notifikasi"
And Lihat pada halaman menu
Then Menampilkan list produk yang diterbitkan dan ditawar