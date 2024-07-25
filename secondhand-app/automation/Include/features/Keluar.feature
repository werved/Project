@Keluar
Feature: Keluar

#Background:
#Given User membuka aplikasi SecondHand
#When User klik tombol "Masuk"
#And User memasukkan "tes@example.com" pada bidang "Email"
#And User memasukkan "password" pada bidang "Password"
#And User klik tombol "Masuk"
#Then Menampilkan halaman dashboard

@K001 @Positif
Scenario: Logout dari akun yang ada
When Klik icon untuk keluar "Akun"
And Klik tombol keluar "Keluar"
Then Menampilkan halaman beranda "Telusuri Kategori" 