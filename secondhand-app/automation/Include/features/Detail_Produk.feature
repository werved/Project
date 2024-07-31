@Detail_Produk
Feature: Detail_Produk

Background:
Given User membuka aplikasi SecondHand
When User klik tombol "Masuk"
And User memasukkan "example@example.com" pada bidang "Email"
And User memasukkan "123456" pada bidang "Password"
And User klik tombol "Masuk" 
Then Menampilkan halaman "Akun Saya" 

@Dp001 @Positif
Scenario: Memastikan pembeli dapat melakukan tawar harga produk
When Klik icon "Beranda" 
And Cari produk yang ingin di tawar
And Klik produk yang tampil
And Klik "Saya Tertarik dan Ingin Nego" 
And Menampilkan modal "Masukkan Harga Tawarmu" 
And Input harga tawar yang diinginkan
Then Klik "Kirim" 