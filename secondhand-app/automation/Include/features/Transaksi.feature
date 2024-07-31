@Transaksi
Feature: Transaksi

Background:
Given User membuka aplikasi SecondHand
When User klik tombol "Masuk"
And User memasukkan "example@example.com" pada bidang "Email"
And User memasukkan "123456" pada bidang "Password"
And User klik tombol "Masuk"
Then Menampilkan halaman "Akun Saya" 

@T001 @Positif
Scenario: Lihat list "Transaksi" 
When Klik icon "Transaksi"
And Lihat pada halaman menu
Then Menampilkan list produk yang ditawar dan status