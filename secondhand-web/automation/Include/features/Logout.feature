@Logout
Feature: Logout
    User dapat Logout dari akun yang terdaftar

Background:
 Given User buka "https://secondhand.binaracademy.org/"
 Given User login

 @lo01 @pos
 Scenario: User dapat logout dari akun terdaftar
 When User klik icon profile
 And User klik tombol "Keluar"
 Then User kembali ke halaman utama